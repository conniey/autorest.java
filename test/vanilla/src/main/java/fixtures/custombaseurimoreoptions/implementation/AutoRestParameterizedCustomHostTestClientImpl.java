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

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.custombaseurimoreoptions.AutoRestParameterizedCustomHostTestClient;
import fixtures.custombaseurimoreoptions.Paths;

/**
 * Initializes a new instance of the AutoRestParameterizedCustomHostTestClient type.
 */
public class AutoRestParameterizedCustomHostTestClientImpl extends ServiceClient implements AutoRestParameterizedCustomHostTestClient {
    /**
     * The subscription id with value 'test12'.
     */
    private String subscriptionId;

    /**
     * Gets The subscription id with value 'test12'.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id with value 'test12'.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public AutoRestParameterizedCustomHostTestClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * A string value that is used as a global part of the parameterized host. Default value 'host'.
     */
    private String dnsSuffix;

    /**
     * Gets A string value that is used as a global part of the parameterized host. Default value 'host'.
     *
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Sets A string value that is used as a global part of the parameterized host. Default value 'host'.
     *
     * @param dnsSuffix the dnsSuffix value.
     * @return the service client itself.
     */
    public AutoRestParameterizedCustomHostTestClientImpl withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * The Paths object to access its operations.
     */
    private Paths paths;

    /**
     * Gets the Paths object to access its operations.
     *
     * @return the Paths object.
     */
    public Paths paths() {
        return this.paths;
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     */
    public AutoRestParameterizedCustomHostTestClientImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestParameterizedCustomHostTestClientImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.dnsSuffix = "host";
        this.paths = new PathsImpl(this);
    }
}
