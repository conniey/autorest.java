package fixtures.bodystring;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.implementation.RestProxy;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Enums.
 */
public final class Enums {
    /**
     * The proxy service used to perform REST calls.
     */
    private EnumsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATService client;

    /**
     * Initializes an instance of Enums.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public Enums(AutoRestSwaggerBATService client) {
        this.service = RestProxy.create(EnumsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AutoRestSwaggerBATServiceEnums to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestSwaggerBATServiceEnums")
    private interface EnumsService {
        @Get("/string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Colors>> getNotExpandable(@HostParam("$host") String Host);

        @Put("/string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putNotExpandable(@HostParam("$host") String Host, @BodyParam("application/json") Colors StringBody);

        @Get("/string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Colors>> getReferenced(@HostParam("$host") String Host);

        @Put("/string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putReferenced(@HostParam("$host") String Host, @BodyParam("application/json") Colors EnumStringBody);

        @Get("/string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<RefColorConstant>> getReferencedConstant(@HostParam("$host") String Host);

        @Put("/string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putReferencedConstant(@HostParam("$host") String Host, @BodyParam("application/json") RefColorConstant EnumStringBody);
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Colors>> getNotExpandableWithResponseAsync() {
        return service.getNotExpandable(this.client.getHost());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getNotExpandableAsync() {
        return getNotExpandableWithResponseAsync()
            .flatMap((SimpleResponse<Colors> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Colors getNotExpandable() {
        return getNotExpandableAsync().block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putNotExpandableWithResponseAsync(Colors StringBody) {
        return service.putNotExpandable(this.client.getHost(), StringBody);
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putNotExpandableAsync(Colors StringBody) {
        return putNotExpandableWithResponseAsync(StringBody)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putNotExpandable(Colors StringBody) {
        putNotExpandableAsync(StringBody).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Colors>> getReferencedWithResponseAsync() {
        return service.getReferenced(this.client.getHost());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getReferencedAsync() {
        return getReferencedWithResponseAsync()
            .flatMap((SimpleResponse<Colors> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Colors getReferenced() {
        return getReferencedAsync().block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedWithResponseAsync(Colors EnumStringBody) {
        return service.putReferenced(this.client.getHost(), EnumStringBody);
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedAsync(Colors EnumStringBody) {
        return putReferencedWithResponseAsync(EnumStringBody)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putReferenced(Colors EnumStringBody) {
        putReferencedAsync(EnumStringBody).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RefColorConstant>> getReferencedConstantWithResponseAsync() {
        return service.getReferencedConstant(this.client.getHost());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RefColorConstant> getReferencedConstantAsync() {
        return getReferencedConstantWithResponseAsync()
            .flatMap((SimpleResponse<RefColorConstant> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public RefColorConstant getReferencedConstant() {
        return getReferencedConstantAsync().block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedConstantWithResponseAsync(RefColorConstant EnumStringBody) {
        return service.putReferencedConstant(this.client.getHost(), EnumStringBody);
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedConstantAsync(RefColorConstant EnumStringBody) {
        return putReferencedConstantWithResponseAsync(EnumStringBody)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putReferencedConstant(RefColorConstant EnumStringBody) {
        putReferencedConstantAsync(EnumStringBody).block();
    }
}