/**
 * My API
 * This is a description of my API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { HttpHeadersHostAddress } from './httpHeadersHostAddress';


export interface HttpHeadersHost { 
    address?: HttpHeadersHostAddress;
    port?: number;
    unresolved?: boolean;
    hostName?: string;
    hostString?: string;
}

