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
package com.amazonaws.services.cognitosync.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListDatasetsRequest Marshaller
 */
public class ListDatasetsRequestMarshaller implements Marshaller<Request<ListDatasetsRequest>, ListDatasetsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListDatasetsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListDatasetsRequest> marshall(ListDatasetsRequest listDatasetsRequest) {

        if (listDatasetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDatasetsRequest> request = new DefaultRequest<ListDatasetsRequest>(listDatasetsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityPoolId",
                listDatasetsRequest.getIdentityPoolId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityId", listDatasetsRequest.getIdentityId());
        request.setResourcePath(uriResourcePath);

        if (listDatasetsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listDatasetsRequest.getNextToken()));
        }

        if (listDatasetsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listDatasetsRequest.getMaxResults()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
