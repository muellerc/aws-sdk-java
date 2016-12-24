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
package com.amazonaws.services.logs.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * UntagLogGroupRequest Marshaller
 */
public class UntagLogGroupRequestMarshaller implements Marshaller<Request<UntagLogGroupRequest>, UntagLogGroupRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UntagLogGroupRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UntagLogGroupRequest> marshall(UntagLogGroupRequest untagLogGroupRequest) {

        if (untagLogGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UntagLogGroupRequest> request = new DefaultRequest<UntagLogGroupRequest>(untagLogGroupRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.UntagLogGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (untagLogGroupRequest.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(untagLogGroupRequest.getLogGroupName());
            }

            com.amazonaws.internal.SdkInternalList<String> tagsList = (com.amazonaws.internal.SdkInternalList<String>) untagLogGroupRequest.getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (String tagsListValue : tagsList) {
                    if (tagsListValue != null) {
                        jsonGenerator.writeValue(tagsListValue);
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
