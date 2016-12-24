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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListPipelinesRequest Marshaller
 */
public class ListPipelinesRequestMarshaller implements Marshaller<Request<ListPipelinesRequest>, ListPipelinesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListPipelinesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListPipelinesRequest> marshall(ListPipelinesRequest listPipelinesRequest) {

        if (listPipelinesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPipelinesRequest> request = new DefaultRequest<ListPipelinesRequest>(listPipelinesRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2012-09-25/pipelines";

        request.setResourcePath(uriResourcePath);

        if (listPipelinesRequest.getAscending() != null) {
            request.addParameter("Ascending", StringUtils.fromString(listPipelinesRequest.getAscending()));
        }

        if (listPipelinesRequest.getPageToken() != null) {
            request.addParameter("PageToken", StringUtils.fromString(listPipelinesRequest.getPageToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
