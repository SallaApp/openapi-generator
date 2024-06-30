/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.StringEnumRef;


/**
 * API tests for HeaderApi
 */
@Disabled
public class HeaderApiTest {

    private final HeaderApi api = new HeaderApi();

    
    /**
     * Test header parameter(s)
     *
     * Test header parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testHeaderIntegerBooleanStringEnumsTest() throws ApiException {
        Integer integerHeader = null;
        Boolean booleanHeader = null;
        String stringHeader = null;
        String enumNonrefStringHeader = null;
        StringEnumRef enumRefStringHeader = null;
        String response = 
        api.testHeaderIntegerBooleanStringEnums(integerHeader, booleanHeader, stringHeader, enumNonrefStringHeader, enumRefStringHeader);
        
        // TODO: test validations
    }
    
}
