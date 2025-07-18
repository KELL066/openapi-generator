/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.15.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OuterEnumIntegerDefaultValue.h
 *
 * 
 */

#ifndef OuterEnumIntegerDefaultValue_H_
#define OuterEnumIntegerDefaultValue_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OuterEnumIntegerDefaultValue 
{
public:
    OuterEnumIntegerDefaultValue() = default;
    explicit OuterEnumIntegerDefaultValue(boost::property_tree::ptree const& pt);
    virtual ~OuterEnumIntegerDefaultValue() = default;

    OuterEnumIntegerDefaultValue(const OuterEnumIntegerDefaultValue& other) = default; // copy constructor
    OuterEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue&& other) noexcept = default; // move constructor

    OuterEnumIntegerDefaultValue& operator=(const OuterEnumIntegerDefaultValue& other) = default; // copy assignment
    OuterEnumIntegerDefaultValue& operator=(OuterEnumIntegerDefaultValue&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// OuterEnumIntegerDefaultValue members
    int32_t getEnumValue() const;
    void setEnumValue(const int32_t& val);

protected:
    int32_t m_OuterEnumIntegerDefaultValueEnumValue;
};

std::vector<OuterEnumIntegerDefaultValue> createOuterEnumIntegerDefaultValueVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OuterEnumIntegerDefaultValue>(const OuterEnumIntegerDefaultValue& val) {
    return val.toPropertyTree();
}

template<>
inline OuterEnumIntegerDefaultValue fromPt<OuterEnumIntegerDefaultValue>(const boost::property_tree::ptree& pt) {
    OuterEnumIntegerDefaultValue ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OuterEnumIntegerDefaultValue_H_ */
