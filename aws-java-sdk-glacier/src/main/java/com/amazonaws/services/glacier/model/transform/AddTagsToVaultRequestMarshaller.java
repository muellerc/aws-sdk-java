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
package com.amazonaws.services.glacier.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * AddTagsToVaultRequest Marshaller
 */
public class AddTagsToVaultRequestMarshaller implements Marshaller<Request<AddTagsToVaultRequest>, AddTagsToVaultRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AddTagsToVaultRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AddTagsToVaultRequest> marshall(AddTagsToVaultRequest addTagsToVaultRequest) {

        if (addTagsToVaultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddTagsToVaultRequest> request = new DefaultRequest<AddTagsToVaultRequest>(addTagsToVaultRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/tags?operation=add";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                addTagsToVaultRequest.getAccountId() == null ? "-" : addTagsToVaultRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName", addTagsToVaultRequest.getVaultName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.Map<String, String> tagsMap = addTagsToVaultRequest.getTags();
            if (tagsMap != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap.entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
