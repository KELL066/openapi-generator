/*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.15.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.LoggingLevel;
import org.openapitools.model.*;
import org.apache.camel.model.dataformat.JsonLibrary;

@Component
public class StoreApiRoutesImpl extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        
        /**
        DELETE /store/order/{orderId} : Delete purchase order by ID
        **/
        from("direct:deleteOrder")
            .id("deleteOrder")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}");
        /**
        GET /store/inventory : Returns pet inventories by status
        **/
        from("direct:getInventory")
            .id("getInventory")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}");
        /**
        GET /store/order/{orderId} : Find purchase order by ID
        **/
        from("direct:getOrderById")
            .id("getOrderById")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"petId\" : 6, \"quantity\" : 1, \"id\" : 0, \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : false, \"status\" : \"placed\" }"))
            .unmarshal().json(JsonLibrary.Jackson, Order.class);
        /**
        POST /store/order : Place an order for a pet
        **/
        from("direct:placeOrder")
            .id("placeOrder")
            .choice()
                .when(simple("${body} != null"))
                    .log(LoggingLevel.INFO, "BODY TYPE: ${body.getClass().getName()}")
            .end()
            .log(LoggingLevel.INFO, "HEADERS: ${headers}")
            .setBody(constant("{ \"petId\" : 6, \"quantity\" : 1, \"id\" : 0, \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : false, \"status\" : \"placed\" }"))
            .unmarshal().json(JsonLibrary.Jackson, Order.class);
    }
}
