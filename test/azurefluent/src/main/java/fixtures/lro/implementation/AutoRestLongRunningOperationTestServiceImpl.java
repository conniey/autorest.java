/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.RestClient;
import com.microsoft.rest.v2.RestResponse;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestLongRunningOperationTestServiceImpl class.
 */
public class AutoRestLongRunningOperationTestServiceImpl extends AzureServiceClient {


    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The LROsInner object to access its operations.
     */
    private LROsInner lROs;

    /**
     * Gets the LROsInner object to access its operations.
     * @return the LROsInner object.
     */
    public LROsInner lROs() {
        return this.lROs;
    }

    /**
     * The LRORetrysInner object to access its operations.
     */
    private LRORetrysInner lRORetrys;

    /**
     * Gets the LRORetrysInner object to access its operations.
     * @return the LRORetrysInner object.
     */
    public LRORetrysInner lRORetrys() {
        return this.lRORetrys;
    }

    /**
     * The LROSADsInner object to access its operations.
     */
    private LROSADsInner lROSADs;

    /**
     * Gets the LROSADsInner object to access its operations.
     * @return the LROSADsInner object.
     */
    public LROSADsInner lROSADs() {
        return this.lROSADs;
    }

    /**
     * The LROsCustomHeadersInner object to access its operations.
     */
    private LROsCustomHeadersInner lROsCustomHeaders;

    /**
     * Gets the LROsCustomHeadersInner object to access its operations.
     * @return the LROsCustomHeadersInner object.
     */
    public LROsCustomHeadersInner lROsCustomHeaders() {
        return this.lROsCustomHeaders;
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestLongRunningOperationTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestLongRunningOperationTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestLongRunningOperationTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.lROs = new LROsInner(this);
        this.lRORetrys = new LRORetrysInner(this);
        this.lROSADs = new LROSADsInner(this);
        this.lROsCustomHeaders = new LROsCustomHeadersInner(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestLongRunningOperationTestService", "1.0.0");
    }
}
