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
package com.amazonaws.services.pinpoint.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetSegmentsRequest Marshaller
 */
public class GetSegmentsRequestMarshaller implements Marshaller<Request<GetSegmentsRequest>, GetSegmentsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetSegmentsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetSegmentsRequest> marshall(GetSegmentsRequest getSegmentsRequest) {

        if (getSegmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSegmentsRequest> request = new DefaultRequest<GetSegmentsRequest>(getSegmentsRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/segments";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "application-id", getSegmentsRequest.getApplicationId());
        request.setResourcePath(uriResourcePath);

        if (getSegmentsRequest.getPageSize() != null) {
            request.addParameter("page-size", StringUtils.fromString(getSegmentsRequest.getPageSize()));
        }

        if (getSegmentsRequest.getToken() != null) {
            request.addParameter("token", StringUtils.fromString(getSegmentsRequest.getToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
