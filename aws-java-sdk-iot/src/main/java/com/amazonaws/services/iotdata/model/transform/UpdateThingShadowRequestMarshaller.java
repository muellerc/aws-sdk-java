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
package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdateThingShadowRequest Marshaller
 */
public class UpdateThingShadowRequestMarshaller implements Marshaller<Request<UpdateThingShadowRequest>, UpdateThingShadowRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateThingShadowRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateThingShadowRequest> marshall(UpdateThingShadowRequest updateThingShadowRequest) {

        if (updateThingShadowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateThingShadowRequest> request = new DefaultRequest<UpdateThingShadowRequest>(updateThingShadowRequest, "AWSIotData");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/things/{thingName}/shadow";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "thingName", updateThingShadowRequest.getThingName());
        request.setResourcePath(uriResourcePath);

        request.setContent(BinaryUtils.toStream(updateThingShadowRequest.getPayload()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
