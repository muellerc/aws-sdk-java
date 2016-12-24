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
package com.amazonaws.services.batch.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeJobDefinitionsRequest Marshaller
 */
public class DescribeJobDefinitionsRequestMarshaller implements Marshaller<Request<DescribeJobDefinitionsRequest>, DescribeJobDefinitionsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeJobDefinitionsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeJobDefinitionsRequest> marshall(DescribeJobDefinitionsRequest describeJobDefinitionsRequest) {

        if (describeJobDefinitionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeJobDefinitionsRequest> request = new DefaultRequest<DescribeJobDefinitionsRequest>(describeJobDefinitionsRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/describejobdefinitions";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<String> jobDefinitionsList = describeJobDefinitionsRequest.getJobDefinitions();
            if (jobDefinitionsList != null) {
                jsonGenerator.writeFieldName("jobDefinitions");
                jsonGenerator.writeStartArray();
                for (String jobDefinitionsListValue : jobDefinitionsList) {
                    if (jobDefinitionsListValue != null) {
                        jsonGenerator.writeValue(jobDefinitionsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeJobDefinitionsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(describeJobDefinitionsRequest.getMaxResults());
            }
            if (describeJobDefinitionsRequest.getJobDefinitionName() != null) {
                jsonGenerator.writeFieldName("jobDefinitionName").writeValue(describeJobDefinitionsRequest.getJobDefinitionName());
            }
            if (describeJobDefinitionsRequest.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(describeJobDefinitionsRequest.getStatus());
            }
            if (describeJobDefinitionsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeJobDefinitionsRequest.getNextToken());
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
