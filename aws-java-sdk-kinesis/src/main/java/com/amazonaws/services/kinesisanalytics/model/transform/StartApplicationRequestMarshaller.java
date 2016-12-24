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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * StartApplicationRequest Marshaller
 */
public class StartApplicationRequestMarshaller implements Marshaller<Request<StartApplicationRequest>, StartApplicationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public StartApplicationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<StartApplicationRequest> marshall(StartApplicationRequest startApplicationRequest) {

        if (startApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartApplicationRequest> request = new DefaultRequest<StartApplicationRequest>(startApplicationRequest, "AmazonKinesisAnalytics");
        request.addHeader("X-Amz-Target", "KinesisAnalytics_20150814.StartApplication");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (startApplicationRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("ApplicationName").writeValue(startApplicationRequest.getApplicationName());
            }

            java.util.List<InputConfiguration> inputConfigurationsList = startApplicationRequest.getInputConfigurations();
            if (inputConfigurationsList != null) {
                jsonGenerator.writeFieldName("InputConfigurations");
                jsonGenerator.writeStartArray();
                for (InputConfiguration inputConfigurationsListValue : inputConfigurationsList) {
                    if (inputConfigurationsListValue != null) {

                        InputConfigurationJsonMarshaller.getInstance().marshall(inputConfigurationsListValue, jsonGenerator);
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
