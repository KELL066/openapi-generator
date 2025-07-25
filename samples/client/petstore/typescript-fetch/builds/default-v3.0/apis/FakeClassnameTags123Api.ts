/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  Client,
} from '../models/index';
import {
    ClientFromJSON,
    ClientToJSON,
} from '../models/index';

export interface TestClassnameRequest {
    client: Client;
}

/**
 * 
 */
export class FakeClassnameTags123Api extends runtime.BaseAPI {

    /**
     * To test class name in snake case
     * To test class name in snake case
     */
    async testClassnameRaw(requestParameters: TestClassnameRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Client>> {
        if (requestParameters['client'] == null) {
            throw new runtime.RequiredError(
                'client',
                'Required parameter "client" was null or undefined when calling testClassname().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            queryParameters["api_key_query"] = await this.configuration.apiKey("api_key_query"); // api_key_query authentication
        }


        let urlPath = `/fake_classname_test`;

        const response = await this.request({
            path: urlPath,
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: ClientToJSON(requestParameters['client']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ClientFromJSON(jsonValue));
    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     */
    async testClassname(requestParameters: TestClassnameRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Client> {
        const response = await this.testClassnameRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
