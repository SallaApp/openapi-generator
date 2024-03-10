<?php
/**
 * DefaultApiInterface
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * @generated Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 7.3.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Api;

use InvalidArgumentException;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\Promise\PromiseInterface;
use OpenAPI\Client\ApiException;
use OpenAPI\Client\Configuration;

/**
 * DefaultApi Class Doc Comment
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
interface DefaultApiInterface
{
    /** @var string[] $contentTypes **/
    public const contentTypes = [
        'fooGet' => [
            'application/json',
        ],
    ];

    /**
     * Set the host index
     *
     * @param int $hostIndex Host index (required)
     */
    public function setHostIndex(int $hostIndex): void;

    /**
     * Get the host index
     *
     * @return int Host index
     */
    public function getHostIndex(): int;

    /**
     * @return Configuration
     */
    public function getConfig(): Configuration;

    /**
     * Operation fooGet
     *
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['fooGet'] to see the possible values for this operation
     *
     * @throws ApiException on non-2xx response or if the response body is not in the expected format
     * @throws InvalidArgumentException
     * @return \OpenAPI\Client\Model\FooGetDefaultResponse
     */
    public function fooGet(
        string $contentType = self::contentTypes['fooGet'][0]
    ): \OpenAPI\Client\Model\FooGetDefaultResponse;

    /**
     * Operation fooGetWithHttpInfo
     *
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['fooGet'] to see the possible values for this operation
     *
     * @throws ApiException on non-2xx response or if the response body is not in the expected format
     * @throws InvalidArgumentException
     * @return array of \OpenAPI\Client\Model\FooGetDefaultResponse, HTTP status code, HTTP response headers (array of strings)
     */
    public function fooGetWithHttpInfo(
        string $contentType = self::contentTypes['fooGet'][0]
    ): array;

    /**
     * Operation fooGetAsync
     *
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['fooGet'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return PromiseInterface
     */
    public function fooGetAsync(
        string $contentType = self::contentTypes['fooGet'][0]
    ): PromiseInterface;

    /**
     * Operation fooGetAsyncWithHttpInfo
     *
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['fooGet'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return PromiseInterface
     */
    public function fooGetAsyncWithHttpInfo(
        string $contentType = self::contentTypes['fooGet'][0]
    ): PromiseInterface;

    /**
     * Create request for operation 'fooGet'
     *
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['fooGet'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function fooGetRequest(
        string $contentType = self::contentTypes['fooGet'][0]
    ): Request;
}
