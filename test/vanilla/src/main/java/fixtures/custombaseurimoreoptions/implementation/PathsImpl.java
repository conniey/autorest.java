/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.custombaseurimoreoptions.Paths;
import fixtures.custombaseurimoreoptions.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public class PathsImpl implements Paths {
    /**
     * The RestProxy service to perform REST calls.
     */
    private PathsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestParameterizedCustomHostTestClientImpl client;

    /**
     * Initializes an instance of Paths.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PathsImpl(AutoRestParameterizedCustomHostTestClientImpl client) {
        this.service = RestProxy.create(PathsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be used by
     * RestProxy to perform REST calls.
     */
    @Host("https://{vault}{secret}{dnsSuffix}")
    interface PathsService {
        @Headers({ "x-ms-logging-context: fixtures.custombaseurimoreoptions.Paths getEmpty" })
        @GET("customuri/{subscriptionId}/{keyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getEmpty(@HostParam("vault") String vault, @HostParam("secret") String secret, @HostParam("dnsSuffix") String dnsSuffix, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("keyVersion") String keyVersion);

    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getEmpty(String vault, String secret, String keyName) {
        getEmptyAsync(vault, secret, keyName).blockingAwait();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String vault, String secret, String keyName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(vault, secret, keyName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(String vault, String secret, String keyName) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String keyVersion = null;
        return service.getEmpty(vault, secret, this.client.dnsSuffix(), keyName, this.client.subscriptionId(), keyVersion);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getEmptyAsync(String vault, String secret, String keyName) {
        return getEmptyWithRestResponseAsync(vault, secret, keyName)
            .toCompletable();
        }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getEmpty(String vault, String secret, String keyName, String keyVersion) {
        getEmptyAsync(vault, secret, keyName, keyVersion).blockingAwait();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String vault, String secret, String keyName, String keyVersion, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(vault, secret, keyName, keyVersion), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(String vault, String secret, String keyName, String keyVersion) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.getEmpty(vault, secret, this.client.dnsSuffix(), keyName, this.client.subscriptionId(), keyVersion);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getEmptyAsync(String vault, String secret, String keyName, String keyVersion) {
        return getEmptyWithRestResponseAsync(vault, secret, keyName, keyVersion)
            .toCompletable();
        }


}
