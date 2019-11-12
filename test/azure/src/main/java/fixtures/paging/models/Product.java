// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.paging.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Product model.
 */
@Fluent
public final class Product {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ProductProperties properties;

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public ProductProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the Product object itself.
     */
    public Product properties(ProductProperties properties) {
        this.properties = properties;
        return this;
    }
}