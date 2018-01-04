/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for responseFloat operation.
 */
public class HeaderResponseFloatHeaders {
    /**
     * response with header value "value": 0.07 or -3.0.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the HeaderResponseFloatHeaders object itself.
     */
    public HeaderResponseFloatHeaders withValue(Double value) {
        this.value = value;
        return this;
    }
}
