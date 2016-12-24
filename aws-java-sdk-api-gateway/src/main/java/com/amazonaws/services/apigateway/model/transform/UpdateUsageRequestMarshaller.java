/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * UpdateUsageRequest Marshaller
 */
public class UpdateUsageRequestMarshaller implements Marshaller<Request<UpdateUsageRequest>, UpdateUsageRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateUsageRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateUsageRequest> marshall(UpdateUsageRequest updateUsageRequest) {

        if (updateUsageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateUsageRequest> request = new DefaultRequest<UpdateUsageRequest>(updateUsageRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/usageplans/{usageplanId}/keys/{keyId}/usage";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "usageplanId", updateUsageRequest.getUsagePlanId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "keyId", updateUsageRequest.getKeyId());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<PatchOperation> patchOperationsList = updateUsageRequest.getPatchOperations();
            if (patchOperationsList != null) {
                jsonGenerator.writeFieldName("patchOperations");
                jsonGenerator.writeStartArray();
                for (PatchOperation patchOperationsListValue : patchOperationsList) {
                    if (patchOperationsListValue != null) {

                        PatchOperationJsonMarshaller.getInstance().marshall(patchOperationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
