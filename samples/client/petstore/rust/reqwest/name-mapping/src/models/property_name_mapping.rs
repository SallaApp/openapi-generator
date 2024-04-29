/*
 * rust test
 *
 * rust name mapping test
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct PropertyNameMapping {
    #[serde(rename = "http_debug_operation", skip_serializing_if = "Option::is_none")]
    pub http_debug_operation: Option<String>,
    #[serde(rename = "_type", skip_serializing_if = "Option::is_none")]
    pub underscore_type: Option<String>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    #[serde(rename = "type_", skip_serializing_if = "Option::is_none")]
    pub type_with_underscore: Option<String>,
    #[serde(rename = "-type", skip_serializing_if = "Option::is_none")]
    pub dash_type: Option<String>,
}

impl PropertyNameMapping {
    pub fn new() -> PropertyNameMapping {
        PropertyNameMapping {
            http_debug_operation: None,
            underscore_type: None,
            r#type: None,
            type_with_underscore: None,
            dash_type: None,
        }
    }
}

