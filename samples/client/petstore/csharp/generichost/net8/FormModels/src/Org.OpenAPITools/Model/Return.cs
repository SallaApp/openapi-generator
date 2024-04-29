// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Model for testing reserved words
    /// </summary>
    public partial class Return : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Return" /> class.
        /// </summary>
        /// <param name="lock">lock</param>
        /// <param name="abstract">abstract</param>
        /// <param name="varReturn">varReturn</param>
        /// <param name="unsafe">unsafe</param>
        [JsonConstructor]
        public Return(string @lock, string @abstract = default, Option<int?> varReturn = default, Option<string> @unsafe = default)
        {
            Lock = @lock;
            Abstract = @abstract;
            VarReturnOption = varReturn;
            UnsafeOption = @unsafe;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets Lock
        /// </summary>
        [JsonPropertyName("lock")]
        public string Lock { get; set; }

        /// <summary>
        /// Gets or Sets Abstract
        /// </summary>
        [JsonPropertyName("abstract")]
        public string Abstract { get; set; }

        /// <summary>
        /// Used to track the state of VarReturn
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<int?> VarReturnOption { get; private set; }

        /// <summary>
        /// Gets or Sets VarReturn
        /// </summary>
        [JsonPropertyName("return")]
        public int? VarReturn { get { return this.VarReturnOption; } set { this.VarReturnOption = new(value); } }

        /// <summary>
        /// Used to track the state of Unsafe
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<string> UnsafeOption { get; private set; }

        /// <summary>
        /// Gets or Sets Unsafe
        /// </summary>
        [JsonPropertyName("unsafe")]
        public string Unsafe { get { return this.UnsafeOption; } set { this.UnsafeOption = new(value); } }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Return {\n");
            sb.Append("  Lock: ").Append(Lock).Append("\n");
            sb.Append("  Abstract: ").Append(Abstract).Append("\n");
            sb.Append("  VarReturn: ").Append(VarReturn).Append("\n");
            sb.Append("  Unsafe: ").Append(Unsafe).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Return" />
    /// </summary>
    public class ReturnJsonConverter : JsonConverter<Return>
    {
        /// <summary>
        /// Deserializes json to <see cref="Return" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Return Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<string> varLock = default;
            Option<string> varAbstract = default;
            Option<int?> varReturn = default;
            Option<string> varUnsafe = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "lock":
                            varLock = new Option<string>(utf8JsonReader.GetString());
                            break;
                        case "abstract":
                            varAbstract = new Option<string>(utf8JsonReader.GetString());
                            break;
                        case "return":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                varReturn = new Option<int?>(utf8JsonReader.GetInt32());
                            break;
                        case "unsafe":
                            varUnsafe = new Option<string>(utf8JsonReader.GetString());
                            break;
                        default:
                            break;
                    }
                }
            }

            if (!varLock.IsSet)
                throw new ArgumentException("Property is required for class Return.", nameof(varLock));

            if (!varAbstract.IsSet)
                throw new ArgumentException("Property is required for class Return.", nameof(varAbstract));

            if (varLock.IsSet && varLock.Value == null)
                throw new ArgumentNullException(nameof(varLock), "Property is not nullable for class Return.");

            if (varReturn.IsSet && varReturn.Value == null)
                throw new ArgumentNullException(nameof(varReturn), "Property is not nullable for class Return.");

            if (varUnsafe.IsSet && varUnsafe.Value == null)
                throw new ArgumentNullException(nameof(varUnsafe), "Property is not nullable for class Return.");

            return new Return(varLock.Value, varAbstract.Value, varReturn, varUnsafe);
        }

        /// <summary>
        /// Serializes a <see cref="Return" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="varReturn"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Return varReturn, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(ref writer, varReturn, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="Return" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="varReturn"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(ref Utf8JsonWriter writer, Return varReturn, JsonSerializerOptions jsonSerializerOptions)
        {
            if (varReturn.Lock == null)
                throw new ArgumentNullException(nameof(varReturn.Lock), "Property is required for class Return.");

            if (varReturn.UnsafeOption.IsSet && varReturn.Unsafe == null)
                throw new ArgumentNullException(nameof(varReturn.Unsafe), "Property is required for class Return.");

            writer.WriteString("lock", varReturn.Lock);

            if (varReturn.Abstract != null)
                writer.WriteString("abstract", varReturn.Abstract);
            else
                writer.WriteNull("abstract");

            if (varReturn.VarReturnOption.IsSet)
                writer.WriteNumber("return", varReturn.VarReturnOption.Value.Value);

            if (varReturn.UnsafeOption.IsSet)
                writer.WriteString("unsafe", varReturn.Unsafe);
        }
    }
}
