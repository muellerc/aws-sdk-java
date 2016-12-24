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
package com.amazonaws.services.health.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeEventDetailsRequest Marshaller
 */
public class DescribeEventDetailsRequestMarshaller implements Marshaller<Request<DescribeEventDetailsRequest>, DescribeEventDetailsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeEventDetailsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeEventDetailsRequest> marshall(DescribeEventDetailsRequest describeEventDetailsRequest) {

        if (describeEventDetailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEventDetailsRequest> request = new DefaultRequest<DescribeEventDetailsRequest>(describeEventDetailsRequest, "AWSHealth");
        request.addHeader("X-Amz-Target", "AWSHealth_20160804.DescribeEventDetails");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<String> eventArnsList = describeEventDetailsRequest.getEventArns();
            if (eventArnsList != null) {
                jsonGenerator.writeFieldName("eventArns");
                jsonGenerator.writeStartArray();
                for (String eventArnsListValue : eventArnsList) {
                    if (eventArnsListValue != null) {
                        jsonGenerator.writeValue(eventArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeEventDetailsRequest.getLocale() != null) {
                jsonGenerator.writeFieldName("locale").writeValue(describeEventDetailsRequest.getLocale());
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
