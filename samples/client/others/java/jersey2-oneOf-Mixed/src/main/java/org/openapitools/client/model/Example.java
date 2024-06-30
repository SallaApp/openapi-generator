/*
 * Example - oneOf data type
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
@JsonDeserialize(using = Example.ExampleDeserializer.class)
@JsonSerialize(using = Example.ExampleSerializer.class)
public class Example extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Example.class.getName());

    public static class ExampleSerializer extends StdSerializer<Example> {
        public ExampleSerializer(Class<Example> t) {
            super(t);
        }

        public ExampleSerializer() {
            this(null);
        }

        @Override
        public void serialize(Example value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ExampleDeserializer extends StdDeserializer<Example> {
        public ExampleDeserializer() {
            this(Example.class);
        }

        public ExampleDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Example deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize UUID
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UUID.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UUID'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UUID'", e);
            }

            // deserialize List<Integer>
            try {
                if (token == JsonToken.START_ARRAY) {
                    final TypeReference<List<Integer>> ref = new TypeReference<List<Integer>>(){};
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ref);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'List<Integer>'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'List<Integer>'", e);
            }

            if (match == 1) {
                Example ret = new Example();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Example: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Example getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Example cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public Example() {
        super("oneOf", Boolean.FALSE);
    }

    public Example(UUID o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Example(List o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Integer>", new GenericType<List<Integer>>() {
        });
        schemas.put("UUID", new GenericType<UUID>() {
        });
        JSON.registerDescendants(Example.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return Example.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<Integer>, UUID
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(UUID.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(List.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<Integer>, UUID");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Integer>, UUID
     *
     * @return The actual instance (List<Integer>, UUID)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UUID`. If the actual instance is not `UUID`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UUID`
     * @throws ClassCastException if the instance is not `UUID`
     */
    public UUID getUUID() throws ClassCastException {
        return (UUID)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Integer>`. If the actual instance is not `List<Integer>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Integer>`
     * @throws ClassCastException if the instance is not `List<Integer>`
     */
        public List<Integer> getListInteger() throws ClassCastException {
        return (List<Integer>)super.getActualInstance();
        }

}

