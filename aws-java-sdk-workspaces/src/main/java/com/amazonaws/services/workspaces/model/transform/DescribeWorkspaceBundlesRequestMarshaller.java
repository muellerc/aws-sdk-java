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
package com.amazonaws.services.workspaces.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeWorkspaceBundlesRequest Marshaller
 */
public class DescribeWorkspaceBundlesRequestMarshaller implements Marshaller<Request<DescribeWorkspaceBundlesRequest>, DescribeWorkspaceBundlesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeWorkspaceBundlesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeWorkspaceBundlesRequest> marshall(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) {

        if (describeWorkspaceBundlesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeWorkspaceBundlesRequest> request = new DefaultRequest<DescribeWorkspaceBundlesRequest>(describeWorkspaceBundlesRequest,
                "AmazonWorkspaces");
        request.addHeader("X-Amz-Target", "WorkspacesService.DescribeWorkspaceBundles");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> bundleIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeWorkspaceBundlesRequest
                    .getBundleIds();
            if (!bundleIdsList.isEmpty() || !bundleIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("BundleIds");
                jsonGenerator.writeStartArray();
                for (String bundleIdsListValue : bundleIdsList) {
                    if (bundleIdsListValue != null) {
                        jsonGenerator.writeValue(bundleIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeWorkspaceBundlesRequest.getOwner() != null) {
                jsonGenerator.writeFieldName("Owner").writeValue(describeWorkspaceBundlesRequest.getOwner());
            }
            if (describeWorkspaceBundlesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeWorkspaceBundlesRequest.getNextToken());
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
