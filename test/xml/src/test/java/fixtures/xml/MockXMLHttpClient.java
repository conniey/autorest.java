package fixtures.xml;

import com.microsoft.rest.v2.RestException;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.http.HttpHeaders;
import com.microsoft.rest.v2.http.HttpMethod;
import com.microsoft.rest.v2.http.HttpRequest;
import com.microsoft.rest.v2.http.HttpResponse;
import com.microsoft.rest.v2.util.FlowableUtil;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MockXMLHttpClient extends HttpClient {
    private HttpResponse response(String resource) throws IOException, URISyntaxException {
        URL url = getClass().getClassLoader().getResource(resource);
        byte[] bytes = Files.readAllBytes(Paths.get(url.toURI()));
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/xml");
        HttpResponse res = new MockHttpResponse(200, headers, bytes);
        return res;
    }

    private Single<? extends HttpResponse> validate(String requestBody, String resource) throws IOException, URISyntaxException {
        URL url = getClass().getClassLoader().getResource(resource);
        byte[] bytes = Files.readAllBytes(Paths.get(url.toURI()));
        String expected = new String(bytes, StandardCharsets.UTF_8);
        if (requestBody.replaceAll("\\s+", "").equals(expected.replaceAll("\\s+", ""))) {
            return Single.just(new MockHttpResponse(201));
        } else {
            return Single.error(new RestException("Expected: " + expected + "\nReceived: " + requestBody, new MockHttpResponse(400)));
        }
    }

    @Override
    public Single<HttpResponse> sendRequestAsync(HttpRequest request) {
        try {
            if (request.httpMethod() == HttpMethod.GET) {
                String path = request.url().getPath();
                if (path.contains("xml/simple")) {
                    return Single.just(response("GetXMLWithAttributes.xml"));
                } else if (path.contains("xml/wrapped-lists")) {
                    return Single.just(response("GetXMLWrappedLists.xml"));
                } else if (path.contains("xml/empty-list")) {
                    return Single.just(response("GetXMLEmptyList.xml"));
                } else if (path.contains("xml/empty-wrapped-lists")) {
                    return Single.just(response("GetXMLEmptyWrappedLists.xml"));
                } else if (path.contains("xml/root-list")) {
                    return Single.just(response("GetXMLRootList.xml"));
                } else if (path.contains("xml/empty-root-list")) {
                    return Single.just(response("GetXMLEmptyRootList.xml"));
                } else if (path.contains("xml/empty-child-element")) {
                    return Single.just(response("GetXMLEmptyChildElement.xml"));
                } else if (path.contains("xml/headers")) {
                    return Single.<HttpResponse>just(new MockHttpResponse(200, new HttpHeaders().set("Custom-Header", "Custom value")));
                }
            }
            else if (request.httpMethod() == HttpMethod.PUT) {
                String path = request.url().getPath();
                if (path.contains("xml/simple")) {
                    return FlowableUtil.collectBytesInArray(request.body()).flatMap(new Function<byte[], SingleSource<? extends HttpResponse>>() {
                        @Override
                        public SingleSource<? extends HttpResponse> apply(byte[] bytes) throws Exception {
                            return validate(new String(bytes, StandardCharsets.UTF_8), "GetXMLWithAttributes.xml");
                        }
                    });
                } else if (path.contains("xml/wrapped-lists")) {
                    return FlowableUtil.collectBytesInArray(request.body()).flatMap(new Function<byte[], SingleSource<? extends HttpResponse>>() {
                        @Override
                        public SingleSource<? extends HttpResponse> apply(byte[] bytes) throws Exception {
                            return validate(new String(bytes, StandardCharsets.UTF_8), "GetXMLWrappedLists.xml");
                        }
                    });
                } else if (path.contains("xml/root-list")) {
                    return FlowableUtil.collectBytesInArray(request.body()).flatMap(new Function<byte[], SingleSource<? extends HttpResponse>>() {
                        @Override
                        public SingleSource<? extends HttpResponse> apply(byte[] bytes) throws Exception {
                            return validate(new String(bytes, StandardCharsets.UTF_8), "GetXMLRootList.xml");
                        }
                    });
                } else if (path.contains("xml/empty-root-list")) {
                    return FlowableUtil.collectBytesInArray(request.body()).flatMap(new Function<byte[], SingleSource<? extends HttpResponse>>() {
                        @Override
                        public SingleSource<? extends HttpResponse> apply(byte[] bytes) throws Exception {
                            return validate(new String(bytes, StandardCharsets.UTF_8), "GetXMLEmptyRootList.xml");
                        }
                    });
                } else if (path.contains("xml/empty-child-element")) {
                    return FlowableUtil.collectBytesInArray(request.body()).flatMap(new Function<byte[], SingleSource<? extends HttpResponse>>() {
                        @Override
                        public SingleSource<? extends HttpResponse> apply(byte[] bytes) throws Exception {
                            return validate(new String(bytes, StandardCharsets.UTF_8), "GetXMLEmptyChildElement.xml");
                        }
                    });
                }
            }
        } catch (IOException | URISyntaxException e) {
            return Single.error(e);
        }

        return Single.error(new RestException("Not found", new MockHttpResponse(404)));
    }
}