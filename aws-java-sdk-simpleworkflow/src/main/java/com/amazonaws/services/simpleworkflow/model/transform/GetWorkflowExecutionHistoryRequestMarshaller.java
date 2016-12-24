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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * GetWorkflowExecutionHistoryRequest Marshaller
 */
public class GetWorkflowExecutionHistoryRequestMarshaller implements
        Marshaller<Request<GetWorkflowExecutionHistoryRequest>, GetWorkflowExecutionHistoryRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetWorkflowExecutionHistoryRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetWorkflowExecutionHistoryRequest> marshall(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest) {

        if (getWorkflowExecutionHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetWorkflowExecutionHistoryRequest> request = new DefaultRequest<GetWorkflowExecutionHistoryRequest>(getWorkflowExecutionHistoryRequest,
                "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.GetWorkflowExecutionHistory");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getWorkflowExecutionHistoryRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(getWorkflowExecutionHistoryRequest.getDomain());
            }
            if (getWorkflowExecutionHistoryRequest.getExecution() != null) {
                jsonGenerator.writeFieldName("execution");
                WorkflowExecutionJsonMarshaller.getInstance().marshall(getWorkflowExecutionHistoryRequest.getExecution(), jsonGenerator);
            }
            if (getWorkflowExecutionHistoryRequest.getNextPageToken() != null) {
                jsonGenerator.writeFieldName("nextPageToken").writeValue(getWorkflowExecutionHistoryRequest.getNextPageToken());
            }
            if (getWorkflowExecutionHistoryRequest.getMaximumPageSize() != null) {
                jsonGenerator.writeFieldName("maximumPageSize").writeValue(getWorkflowExecutionHistoryRequest.getMaximumPageSize());
            }
            if (getWorkflowExecutionHistoryRequest.getReverseOrder() != null) {
                jsonGenerator.writeFieldName("reverseOrder").writeValue(getWorkflowExecutionHistoryRequest.getReverseOrder());
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
