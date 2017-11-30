/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.Base64Url;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodystring.Strings;
import fixtures.bodystring.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public class StringsImpl implements Strings {
    /**
     * The RestProxy service to perform REST calls.
     */
    private StringsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of Strings.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public StringsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(StringsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Strings to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface StringsService {
        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getNull" })
        @GET("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings putNull" })
        @PUT("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putNull(@BodyParam("application/json; charset=utf-8") String stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getEmpty" })
        @GET("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getEmpty();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings putEmpty" })
        @PUT("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putEmpty(@BodyParam("application/json; charset=utf-8") String stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getMbcs" })
        @GET("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getMbcs();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings putMbcs" })
        @PUT("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMbcs(@BodyParam("application/json; charset=utf-8") String stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getWhitespace" })
        @GET("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getWhitespace();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings putWhitespace" })
        @PUT("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putWhitespace(@BodyParam("application/json; charset=utf-8") String stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getNotProvided" })
        @GET("string/notProvided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getNotProvided();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getBase64Encoded" })
        @GET("string/base64Encoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getBase64Encoded();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getBase64UrlEncoded" })
        @GET("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getBase64UrlEncoded();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings putBase64UrlEncoded" })
        @PUT("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putBase64UrlEncoded(@BodyParam("application/json; charset=utf-8") Base64Url stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Strings getNullBase64UrlEncoded" })
        @GET("string/nullBase64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getNullBase64UrlEncoded();

    }

    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getNullAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<RestResponse<Void, String>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<String> getNullAsync() {
        return getNullWithRestResponseAsync()
            .map(new Function<RestResponse<Void, String>, String>() { public String apply(RestResponse<Void, String> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putNull() {
        putNullAsync().blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putNullWithRestResponseAsync() {
        final String stringBody = null;
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putNullAsync() {
        return putNullWithRestResponseAsync()
            .toCompletable();
        }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putNull(String stringBody) {
        putNullAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putNullAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putNullWithRestResponseAsync(String stringBody) {
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putNullAsync(String stringBody) {
        return putNullWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getEmptyAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<RestResponse<Void, String>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<String> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .map(new Function<RestResponse<Void, String>, String>() { public String apply(RestResponse<Void, String> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putEmpty(String stringBody) {
        putEmptyAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putEmptyAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putEmpty(stringBody);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putEmptyAsync(String stringBody) {
        return putEmptyWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getMbcs() {
        return getMbcsAsync().blockingGet();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getMbcsAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getMbcsAsync(), serviceCallback);
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<RestResponse<Void, String>> getMbcsWithRestResponseAsync() {
        return service.getMbcs();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<String> getMbcsAsync() {
        return getMbcsWithRestResponseAsync()
            .map(new Function<RestResponse<Void, String>, String>() { public String apply(RestResponse<Void, String> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMbcs(String stringBody) {
        putMbcsAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMbcsAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMbcsAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMbcsWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putMbcs(stringBody);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putMbcsAsync(String stringBody) {
        return putMbcsWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getWhitespace() {
        return getWhitespaceAsync().blockingGet();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getWhitespaceAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getWhitespaceAsync(), serviceCallback);
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<RestResponse<Void, String>> getWhitespaceWithRestResponseAsync() {
        return service.getWhitespace();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<String> getWhitespaceAsync() {
        return getWhitespaceWithRestResponseAsync()
            .map(new Function<RestResponse<Void, String>, String>() { public String apply(RestResponse<Void, String> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putWhitespace(String stringBody) {
        putWhitespaceAsync(stringBody).blockingAwait();
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putWhitespaceAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putWhitespaceAsync(stringBody), serviceCallback);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putWhitespaceWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putWhitespace(stringBody);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putWhitespaceAsync(String stringBody) {
        return putWhitespaceWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getNotProvided() {
        return getNotProvidedAsync().blockingGet();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getNotProvidedAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<RestResponse<Void, String>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, String> object
     */
    public Single<String> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .map(new Function<RestResponse<Void, String>, String>() { public String apply(RestResponse<Void, String> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    public byte[] getBase64Encoded() {
        return getBase64EncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<byte[]> getBase64EncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64EncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<RestResponse<Void, byte[]>> getBase64EncodedWithRestResponseAsync() {
        return service.getBase64Encoded();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<byte[]> getBase64EncodedAsync() {
        return getBase64EncodedWithRestResponseAsync()
            .map(new Function<RestResponse<Void, byte[]>, byte[]>() { public byte[] apply(RestResponse<Void, byte[]> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    public byte[] getBase64UrlEncoded() {
        return getBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<byte[]> getBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<RestResponse<Void, byte[]>> getBase64UrlEncodedWithRestResponseAsync() {
        return service.getBase64UrlEncoded();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<byte[]> getBase64UrlEncodedAsync() {
        return getBase64UrlEncodedWithRestResponseAsync()
            .map(new Function<RestResponse<Void, byte[]>, byte[]>() { public byte[] apply(RestResponse<Void, byte[]> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putBase64UrlEncoded(byte[] stringBody) {
        putBase64UrlEncodedAsync(stringBody).blockingAwait();
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putBase64UrlEncodedAsync(byte[] stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putBase64UrlEncodedAsync(stringBody), serviceCallback);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putBase64UrlEncodedWithRestResponseAsync(byte[] stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        return service.putBase64UrlEncoded(stringBodyConverted);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putBase64UrlEncodedAsync(byte[] stringBody) {
        return putBase64UrlEncodedWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    public byte[] getNullBase64UrlEncoded() {
        return getNullBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNullBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<RestResponse<Void, byte[]>> getNullBase64UrlEncodedWithRestResponseAsync() {
        return service.getNullBase64UrlEncoded();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, byte[]> object
     */
    public Single<byte[]> getNullBase64UrlEncodedAsync() {
        return getNullBase64UrlEncodedWithRestResponseAsync()
            .map(new Function<RestResponse<Void, byte[]>, byte[]>() { public byte[] apply(RestResponse<Void, byte[]> restResponse) { return restResponse.body(); } });
        }


}
