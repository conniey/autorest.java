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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Goblinshark model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "fishtype")
@JsonTypeName("goblin")
public class Goblinshark extends Shark {
    /**
     * The jawsize property.
     */
    @JsonProperty(value = "jawsize")
    private Integer jawsize;

    /**
     * Get the jawsize value.
     *
     * @return the jawsize value.
     */
    public Integer jawsize() {
        return this.jawsize;
    }

    /**
     * Set the jawsize value.
     *
     * @param jawsize the jawsize value to set.
     * @return the Goblinshark object itself.
     */
    public Goblinshark withJawsize(Integer jawsize) {
        this.jawsize = jawsize;
        return this;
    }
}
