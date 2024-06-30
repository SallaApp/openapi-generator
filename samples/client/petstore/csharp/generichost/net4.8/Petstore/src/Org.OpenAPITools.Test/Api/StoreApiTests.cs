/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Xunit;
using Microsoft.Extensions.DependencyInjection;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;


/* *********************************************************************************
*              Follow these manual steps to construct tests.
*              This file will not be overwritten.
*  *********************************************************************************
* 1. Navigate to ApiTests.Base.cs and ensure any tokens are being created correctly.
*    Take care not to commit credentials to any repository.
*
* 2. Mocking is coordinated by ApiTestsBase#AddApiHttpClients.
*    To mock the client, use the generic AddApiHttpClients.
*    To mock the server, change the client's BaseAddress.
*
* 3. Locate the test you want below
*      - remove the skip property from the Fact attribute
*      - set the value of any variables if necessary
*
* 4. Run the tests and ensure they work.
*
*/


namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing StoreApi
    /// </summary>
    public sealed class StoreApiTests : ApiTestsBase
    {
        private readonly IStoreApi _instance;

        public StoreApiTests(): base(Array.Empty<string>())
        {
            _instance = _host.Services.GetRequiredService<IStoreApi>();
        }

        /// <summary>
        /// Test DeleteOrder
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task DeleteOrderAsyncTest()
        {
            string orderId = default;
            await _instance.DeleteOrderAsync(orderId);
        }

        /// <summary>
        /// Test GetInventory
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task GetInventoryAsyncTest()
        {
            var response = await _instance.GetInventoryAsync();
            var model = response.Ok();
            Assert.IsType<Dictionary<string, int>>(model);
        }

        /// <summary>
        /// Test GetOrderById
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task GetOrderByIdAsyncTest()
        {
            long orderId = default;
            var response = await _instance.GetOrderByIdAsync(orderId);
            var model = response.Ok();
            Assert.IsType<Order>(model);
        }

        /// <summary>
        /// Test PlaceOrder
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task PlaceOrderAsyncTest()
        {
            Order order = default;
            var response = await _instance.PlaceOrderAsync(order);
            var model = response.Ok();
            Assert.IsType<Order>(model);
        }
    }
}
