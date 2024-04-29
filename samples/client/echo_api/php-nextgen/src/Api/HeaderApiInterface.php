<?php
/**
 * HeaderApiInterface
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Echo Server API
 *
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.6.0-SNAPSHOT
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
 * HeaderApi Class Doc Comment
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
interface HeaderApiInterface
{
    /** @var string[] $contentTypes **/
    public const contentTypes = [
        'testHeaderIntegerBooleanStringEnums' => [
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
     * Operation testHeaderIntegerBooleanStringEnums
     *
     * Test header parameter(s)
     *
     * @param  int|null $integer_header integer_header (optional)
     * @param  bool|null $boolean_header boolean_header (optional)
     * @param  string|null $string_header string_header (optional)
     * @param  string|null $enum_nonref_string_header enum_nonref_string_header (optional)
     * @param  StringEnumRef|null $enum_ref_string_header enum_ref_string_header (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['testHeaderIntegerBooleanStringEnums'] to see the possible values for this operation
     *
     * @throws ApiException on non-2xx response or if the response body is not in the expected format
     * @throws InvalidArgumentException
     * @return string
     */
    public function testHeaderIntegerBooleanStringEnums(
        ?int $integer_header = null,
        ?bool $boolean_header = null,
        ?string $string_header = null,
        ?string $enum_nonref_string_header = null,
        ?StringEnumRef $enum_ref_string_header = null,
        string $contentType = self::contentTypes['testHeaderIntegerBooleanStringEnums'][0]
    ): string;

    /**
     * Operation testHeaderIntegerBooleanStringEnumsWithHttpInfo
     *
     * Test header parameter(s)
     *
     * @param  int|null $integer_header (optional)
     * @param  bool|null $boolean_header (optional)
     * @param  string|null $string_header (optional)
     * @param  string|null $enum_nonref_string_header (optional)
     * @param  StringEnumRef|null $enum_ref_string_header (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['testHeaderIntegerBooleanStringEnums'] to see the possible values for this operation
     *
     * @throws ApiException on non-2xx response or if the response body is not in the expected format
     * @throws InvalidArgumentException
     * @return array of string, HTTP status code, HTTP response headers (array of strings)
     */
    public function testHeaderIntegerBooleanStringEnumsWithHttpInfo(
        ?int $integer_header = null,
        ?bool $boolean_header = null,
        ?string $string_header = null,
        ?string $enum_nonref_string_header = null,
        ?StringEnumRef $enum_ref_string_header = null,
        string $contentType = self::contentTypes['testHeaderIntegerBooleanStringEnums'][0]
    ): array;

    /**
     * Operation testHeaderIntegerBooleanStringEnumsAsync
     *
     * Test header parameter(s)
     *
     * @param  int|null $integer_header (optional)
     * @param  bool|null $boolean_header (optional)
     * @param  string|null $string_header (optional)
     * @param  string|null $enum_nonref_string_header (optional)
     * @param  StringEnumRef|null $enum_ref_string_header (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['testHeaderIntegerBooleanStringEnums'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return PromiseInterface
     */
    public function testHeaderIntegerBooleanStringEnumsAsync(
        ?int $integer_header = null,
        ?bool $boolean_header = null,
        ?string $string_header = null,
        ?string $enum_nonref_string_header = null,
        ?StringEnumRef $enum_ref_string_header = null,
        string $contentType = self::contentTypes['testHeaderIntegerBooleanStringEnums'][0]
    ): PromiseInterface;

    /**
     * Operation testHeaderIntegerBooleanStringEnumsAsyncWithHttpInfo
     *
     * Test header parameter(s)
     *
     * @param  int|null $integer_header (optional)
     * @param  bool|null $boolean_header (optional)
     * @param  string|null $string_header (optional)
     * @param  string|null $enum_nonref_string_header (optional)
     * @param  StringEnumRef|null $enum_ref_string_header (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['testHeaderIntegerBooleanStringEnums'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return PromiseInterface
     */
    public function testHeaderIntegerBooleanStringEnumsAsyncWithHttpInfo(
        $integer_header = null,
        $boolean_header = null,
        $string_header = null,
        $enum_nonref_string_header = null,
        $enum_ref_string_header = null,
        string $contentType = self::contentTypes['testHeaderIntegerBooleanStringEnums'][0]
    ): PromiseInterface;

    /**
     * Create request for operation 'testHeaderIntegerBooleanStringEnums'
     *
     * @param  int|null $integer_header (optional)
     * @param  bool|null $boolean_header (optional)
     * @param  string|null $string_header (optional)
     * @param  string|null $enum_nonref_string_header (optional)
     * @param  StringEnumRef|null $enum_ref_string_header (optional)
     * @param  string $contentType The value for the Content-Type header. Check self::contentTypes['testHeaderIntegerBooleanStringEnums'] to see the possible values for this operation
     *
     * @throws InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    public function testHeaderIntegerBooleanStringEnumsRequest(
        $integer_header = null,
        $boolean_header = null,
        $string_header = null,
        $enum_nonref_string_header = null,
        $enum_ref_string_header = null,
        string $contentType = self::contentTypes['testHeaderIntegerBooleanStringEnums'][0]
    ): Request;
}
