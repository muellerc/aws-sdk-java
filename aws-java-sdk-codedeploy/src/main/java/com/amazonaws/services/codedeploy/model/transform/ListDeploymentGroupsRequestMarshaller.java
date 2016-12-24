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
package com.amazonaws.services.codedeploy.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * ListDeploymentGroupsRequest Marshaller
 */
public class ListDeploymentGroupsRequestMarshaller implements Marshaller<Request<ListDeploymentGroupsRequest>, ListDeploymentGroupsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListDeploymentGroupsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListDeploymentGroupsRequest> marshall(ListDeploymentGroupsRequest listDeploymentGroupsRequest) {

        if (listDeploymentGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDeploymentGroupsRequest> request = new DefaultRequest<ListDeploymentGroupsRequest>(listDeploymentGroupsRequest, "AmazonCodeDeploy");
        request.addHeader("X-Amz-Target", "CodeDeploy_20141006.ListDeploymentGroups");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listDeploymentGroupsRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("applicationName").writeValue(listDeploymentGroupsRequest.getApplicationName());
            }
            if (listDeploymentGroupsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(listDeploymentGroupsRequest.getNextToken());
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
