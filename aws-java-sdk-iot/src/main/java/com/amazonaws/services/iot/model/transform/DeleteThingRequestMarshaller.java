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
package com.amazonaws.services.iot.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * DeleteThingRequest Marshaller
 */
public class DeleteThingRequestMarshaller implements Marshaller<Request<DeleteThingRequest>, DeleteThingRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteThingRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteThingRequest> marshall(DeleteThingRequest deleteThingRequest) {

        if (deleteThingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteThingRequest> request = new DefaultRequest<DeleteThingRequest>(deleteThingRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/things/{thingName}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "thingName", deleteThingRequest.getThingName());
        request.setResourcePath(uriResourcePath);

        if (deleteThingRequest.getExpectedVersion() != null) {
            request.addParameter("expectedVersion", StringUtils.fromLong(deleteThingRequest.getExpectedVersion()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
