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
package com.amazonaws.services.directconnect.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * AllocatePublicVirtualInterfaceRequest Marshaller
 */
public class AllocatePublicVirtualInterfaceRequestMarshaller implements
        Marshaller<Request<AllocatePublicVirtualInterfaceRequest>, AllocatePublicVirtualInterfaceRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AllocatePublicVirtualInterfaceRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AllocatePublicVirtualInterfaceRequest> marshall(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) {

        if (allocatePublicVirtualInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocatePublicVirtualInterfaceRequest> request = new DefaultRequest<AllocatePublicVirtualInterfaceRequest>(
                allocatePublicVirtualInterfaceRequest, "AmazonDirectConnect");
        request.addHeader("X-Amz-Target", "OvertureService.AllocatePublicVirtualInterface");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (allocatePublicVirtualInterfaceRequest.getConnectionId() != null) {
                jsonGenerator.writeFieldName("connectionId").writeValue(allocatePublicVirtualInterfaceRequest.getConnectionId());
            }
            if (allocatePublicVirtualInterfaceRequest.getOwnerAccount() != null) {
                jsonGenerator.writeFieldName("ownerAccount").writeValue(allocatePublicVirtualInterfaceRequest.getOwnerAccount());
            }
            if (allocatePublicVirtualInterfaceRequest.getNewPublicVirtualInterfaceAllocation() != null) {
                jsonGenerator.writeFieldName("newPublicVirtualInterfaceAllocation");
                NewPublicVirtualInterfaceAllocationJsonMarshaller.getInstance().marshall(
                        allocatePublicVirtualInterfaceRequest.getNewPublicVirtualInterfaceAllocation(), jsonGenerator);
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
