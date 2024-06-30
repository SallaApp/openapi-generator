/* tslint:disable */
/* eslint-disable */
/**
 * Enum test
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * 
 * @export
 */
export const NumberEnum = {
    NUMBER_1: 1,
    NUMBER_2: 2,
    NUMBER_3: 3
} as const;
export type NumberEnum = typeof NumberEnum[keyof typeof NumberEnum];


export function instanceOfNumberEnum(value: any): boolean {
    for (const key in NumberEnum) {
        if (Object.prototype.hasOwnProperty.call(NumberEnum, key)) {
            if ((NumberEnum as Record<string, NumberEnum>)[key] === value) {
                return true;
            }
        }
    }
    return false;
}

export function NumberEnumFromJSON(json: any): NumberEnum {
    return NumberEnumFromJSONTyped(json, false);
}

export function NumberEnumFromJSONTyped(json: any, ignoreDiscriminator: boolean): NumberEnum {
    return json as NumberEnum;
}

export function NumberEnumToJSON(value?: NumberEnum | null): any {
    return value as any;
}

