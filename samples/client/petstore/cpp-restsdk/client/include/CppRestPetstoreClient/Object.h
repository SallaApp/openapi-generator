/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.7.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Object.h
 *
 * This is the implementation of a JSON object.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Object_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Object_H_


#include "CppRestPetstoreClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <cpprest/json.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class  Object : public ModelBase
{
public:
    Object();
    virtual ~Object();

    /////////////////////////////////////////////
    /// ModelBase overrides
    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Object manipulation
    web::json::value getValue(const utility::string_t& key) const;
    void setValue(const utility::string_t& key, const web::json::value& value);

private:
    web::json::value m_object;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Object_H_ */
