/**
 * OpenAPI Stuff API created to reproduce issue
 * Example created
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.server.models

import com.fasterxml.jackson.annotation.JsonProperty
/**
 * 
 *
 * @param name 
 * @param id 
 * @param tag 
 */


data class Stuff (


    @JsonProperty("name")
    val name: kotlin.String,


    @JsonProperty("id")
    val id: kotlin.Long? = null,


    @JsonProperty("tag")
    val tag: kotlin.String? = null

)

