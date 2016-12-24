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
package com.amazonaws.services.datapipeline.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * CreatePipelineRequest Marshaller
 */
public class CreatePipelineRequestMarshaller implements Marshaller<Request<CreatePipelineRequest>, CreatePipelineRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreatePipelineRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreatePipelineRequest> marshall(CreatePipelineRequest createPipelineRequest) {

        if (createPipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePipelineRequest> request = new DefaultRequest<CreatePipelineRequest>(createPipelineRequest, "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.CreatePipeline");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createPipelineRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(createPipelineRequest.getName());
            }
            if (createPipelineRequest.getUniqueId() != null) {
                jsonGenerator.writeFieldName("uniqueId").writeValue(createPipelineRequest.getUniqueId());
            }
            if (createPipelineRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(createPipelineRequest.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createPipelineRequest.getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
