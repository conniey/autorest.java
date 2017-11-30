/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.modelflattening.models.ErrorException;
import fixtures.modelflattening.models.FlattenedProduct;
import fixtures.modelflattening.models.FlattenParameterGroup;
import fixtures.modelflattening.models.ProductWrapper;
import fixtures.modelflattening.models.Resource;
import fixtures.modelflattening.models.ResourceCollection;
import fixtures.modelflattening.models.SimpleProduct;
import fixtures.modelflattening.models.WrappedProduct;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putArray();

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putArrayAsync();

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync();
    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putArray(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putArrayAsync(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putArrayWithRestResponseAsync(List<Resource> resourceArray);


    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    List<FlattenedProduct> getArray();

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<FlattenedProduct>> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FlattenedProduct&gt; object
     */
    Single<List<FlattenedProduct>> getArrayAsync();

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FlattenedProduct&gt; object
     */
    Single<RestResponse<Void, List<FlattenedProduct>>> getArrayWithRestResponseAsync();


    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putWrappedArray();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putWrappedArrayAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putWrappedArrayAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putWrappedArrayWithRestResponseAsync();
    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putWrappedArray(List<WrappedProduct> resourceArray);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putWrappedArrayAsync(List<WrappedProduct> resourceArray, final ServiceCallback<Void> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putWrappedArrayAsync(List<WrappedProduct> resourceArray);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putWrappedArrayWithRestResponseAsync(List<WrappedProduct> resourceArray);


    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProductWrapper&gt; object if successful.
     */
    List<ProductWrapper> getWrappedArray();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ProductWrapper>> getWrappedArrayAsync(final ServiceCallback<List<ProductWrapper>> serviceCallback);

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProductWrapper&gt; object
     */
    Single<List<ProductWrapper>> getWrappedArrayAsync();

    /**
     * No need to have a route in Express server for this operation. Used to verify the type flattened is not removed if it's referenced in an array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProductWrapper&gt; object
     */
    Single<RestResponse<Void, List<ProductWrapper>>> getWrappedArrayWithRestResponseAsync();


    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putDictionary();

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putDictionaryAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync();
    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putDictionary(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putDictionaryWithRestResponseAsync(Map<String, FlattenedProduct> resourceDictionary);


    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    Map<String, FlattenedProduct> getDictionary();

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Map<String, FlattenedProduct>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, FlattenedProduct&gt; object
     */
    Single<Map<String, FlattenedProduct>> getDictionaryAsync();

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, FlattenedProduct&gt; object
     */
    Single<RestResponse<Void, Map<String, FlattenedProduct>>> getDictionaryWithRestResponseAsync();


    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putResourceCollection();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putResourceCollectionAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync();
    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putResourceCollection(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Completable putResourceCollectionAsync(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> putResourceCollectionWithRestResponseAsync(ResourceCollection resourceComplexObject);


    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceCollection object if successful.
     */
    ResourceCollection getResourceCollection();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceCollection> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceCollection object
     */
    Single<ResourceCollection> getResourceCollectionAsync();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceCollection object
     */
    Single<RestResponse<Void, ResourceCollection>> getResourceCollectionWithRestResponseAsync();


    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimpleProduct> putSimpleProductAsync(final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<SimpleProduct> putSimpleProductAsync();

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithRestResponseAsync();
    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProduct(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithRestResponseAsync(SimpleProduct simpleBodyProduct);


    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<RestResponse<Void, SimpleProduct>> postFlattenedSimpleProductWithRestResponseAsync(String productId, String maxProductDisplayName);
    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct postFlattenedSimpleProduct(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<RestResponse<Void, SimpleProduct>> postFlattenedSimpleProductWithRestResponseAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue);


    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SimpleProduct object if successful.
     */
    SimpleProduct putSimpleProductWithGrouping(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SimpleProduct object
     */
    Single<RestResponse<Void, SimpleProduct>> putSimpleProductWithGroupingWithRestResponseAsync(FlattenParameterGroup flattenParameterGroup);


}
