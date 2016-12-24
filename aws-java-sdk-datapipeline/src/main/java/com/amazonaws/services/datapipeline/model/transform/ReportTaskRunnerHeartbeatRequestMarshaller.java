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
 * ReportTaskRunnerHeartbeatRequest Marshaller
 */
public class ReportTaskRunnerHeartbeatRequestMarshaller implements Marshaller<Request<ReportTaskRunnerHeartbeatRequest>, ReportTaskRunnerHeartbeatRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ReportTaskRunnerHeartbeatRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ReportTaskRunnerHeartbeatRequest> marshall(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) {

        if (reportTaskRunnerHeartbeatRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReportTaskRunnerHeartbeatRequest> request = new DefaultRequest<ReportTaskRunnerHeartbeatRequest>(reportTaskRunnerHeartbeatRequest,
                "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.ReportTaskRunnerHeartbeat");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (reportTaskRunnerHeartbeatRequest.getTaskrunnerId() != null) {
                jsonGenerator.writeFieldName("taskrunnerId").writeValue(reportTaskRunnerHeartbeatRequest.getTaskrunnerId());
            }
            if (reportTaskRunnerHeartbeatRequest.getWorkerGroup() != null) {
                jsonGenerator.writeFieldName("workerGroup").writeValue(reportTaskRunnerHeartbeatRequest.getWorkerGroup());
            }
            if (reportTaskRunnerHeartbeatRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("hostname").writeValue(reportTaskRunnerHeartbeatRequest.getHostname());
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
