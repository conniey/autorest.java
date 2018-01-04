/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;

/**
 * Initializes a new instance of the MicrosoftAzureTestUrlImpl type.
 */
public class MicrosoftAzureTestUrlImpl extends AzureServiceClient {
    /**
     * Subscription Id.
     */
    private String subscriptionId;

    /**
     * Gets Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public MicrosoftAzureTestUrlImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * API Version with value '2014-04-01-preview'.
     */
    private String apiVersion;

    /**
     * Gets API Version with value '2014-04-01-preview'.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Gets or sets the preferred language for the response.
     */
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
     * @return the service client itself.
     */
    public MicrosoftAzureTestUrlImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
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
     * @return the service client itself.
     */
    public MicrosoftAzureTestUrlImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
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
     * @return the service client itself.
     */
    public MicrosoftAzureTestUrlImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The GroupsInner object to access its operations.
     */
    private GroupsInner groups;

    /**
     * Gets the GroupsInner object to access its operations.
     *
     * @return the GroupsInner object.
     */
    public GroupsInner groups() {
        return this.groups;
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param credentials the management credentials for Azure.
     */
    public MicrosoftAzureTestUrlImpl(ServiceClientCredentials credentials) {
        this(AzureProxy.createDefaultPipeline(MicrosoftAzureTestUrlImpl.class, credentials));
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param credentials the management credentials for Azure.
     * @param azureEnvironment The environment that requests will target.
     */
    public MicrosoftAzureTestUrlImpl(ServiceClientCredentials credentials, AzureEnvironment azureEnvironment) {
        this(AzureProxy.createDefaultPipeline(MicrosoftAzureTestUrlImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public MicrosoftAzureTestUrlImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of MicrosoftAzureTestUrl client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public MicrosoftAzureTestUrlImpl(HttpPipeline httpPipeline, AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        this.apiVersion = "2014-04-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.groups = new GroupsInner(this);
    }
}
