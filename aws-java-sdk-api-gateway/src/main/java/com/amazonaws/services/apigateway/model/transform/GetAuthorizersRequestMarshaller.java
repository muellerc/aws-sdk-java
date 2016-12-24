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
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetAuthorizersRequest Marshaller
 */
public class GetAuthorizersRequestMarshaller implements Marshaller<Request<GetAuthorizersRequest>, GetAuthorizersRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetAuthorizersRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetAuthorizersRequest> marshall(GetAuthorizersRequest getAuthorizersRequest) {

        if (getAuthorizersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetAuthorizersRequest> request = new DefaultRequest<GetAuthorizersRequest>(getAuthorizersRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/authorizers";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id", getAuthorizersRequest.getRestApiId());
        request.setResourcePath(uriResourcePath);

        if (getAuthorizersRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getAuthorizersRequest.getPosition()));
        }

        if (getAuthorizersRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getAuthorizersRequest.getLimit()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
