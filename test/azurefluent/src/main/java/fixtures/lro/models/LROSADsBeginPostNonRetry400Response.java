// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.lro.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import fixtures.lro.implementation.LROSADsPostNonRetry400HeadersInner;

/**
 * Contains all response data for the beginPostNonRetry400 operation.
 */
public final class LROSADsBeginPostNonRetry400Response extends ResponseBase<LROSADsPostNonRetry400HeadersInner, Void> {
    /**
     * Creates an instance of LROSADsBeginPostNonRetry400Response.
     *
     * @param request the request which resulted in this LROSADsBeginPostNonRetry400Response.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LROSADsBeginPostNonRetry400Response(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, LROSADsPostNonRetry400HeadersInner headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}