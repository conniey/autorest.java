/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BooleanWrapper model.
 */
public class BooleanWrapper {
    /**
     * The fieldTrue property.
     */
    @JsonProperty(value = "field_true")
    private Boolean fieldTrue;

    /**
     * The fieldFalse property.
     */
    @JsonProperty(value = "field_false")
    private Boolean fieldFalse;

    /**
     * Get the fieldTrue value.
     *
     * @return the fieldTrue value.
     */
    public Boolean fieldTrue() {
        return this.fieldTrue;
    }

    /**
     * Set the fieldTrue value.
     *
     * @param fieldTrue the fieldTrue value to set.
     * @return the BooleanWrapper object itself.
     */
    public BooleanWrapper withFieldTrue(Boolean fieldTrue) {
        this.fieldTrue = fieldTrue;
        return this;
    }

    /**
     * Get the fieldFalse value.
     *
     * @return the fieldFalse value.
     */
    public Boolean fieldFalse() {
        return this.fieldFalse;
    }

    /**
     * Set the fieldFalse value.
     *
     * @param fieldFalse the fieldFalse value to set.
     * @return the BooleanWrapper object itself.
     */
    public BooleanWrapper withFieldFalse(Boolean fieldFalse) {
        this.fieldFalse = fieldFalse;
        return this;
    }
}
