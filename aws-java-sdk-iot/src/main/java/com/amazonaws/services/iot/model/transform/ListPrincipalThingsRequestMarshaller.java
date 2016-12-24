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
 * ListPrincipalThingsRequest Marshaller
 */
public class ListPrincipalThingsRequestMarshaller implements Marshaller<Request<ListPrincipalThingsRequest>, ListPrincipalThingsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListPrincipalThingsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListPrincipalThingsRequest> marshall(ListPrincipalThingsRequest listPrincipalThingsRequest) {

        if (listPrincipalThingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPrincipalThingsRequest> request = new DefaultRequest<ListPrincipalThingsRequest>(listPrincipalThingsRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        if (listPrincipalThingsRequest.getPrincipal() != null) {
            request.addHeader("x-amzn-principal", StringUtils.fromString(listPrincipalThingsRequest.getPrincipal()));
        }

        String uriResourcePath = "/principals/things";

        request.setResourcePath(uriResourcePath);

        if (listPrincipalThingsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listPrincipalThingsRequest.getNextToken()));
        }

        if (listPrincipalThingsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listPrincipalThingsRequest.getMaxResults()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
