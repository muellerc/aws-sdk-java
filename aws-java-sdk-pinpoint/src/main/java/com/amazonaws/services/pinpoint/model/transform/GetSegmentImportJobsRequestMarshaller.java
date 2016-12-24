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
 * GetSegmentImportJobsRequest Marshaller
 */
public class GetSegmentImportJobsRequestMarshaller implements Marshaller<Request<GetSegmentImportJobsRequest>, GetSegmentImportJobsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetSegmentImportJobsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetSegmentImportJobsRequest> marshall(GetSegmentImportJobsRequest getSegmentImportJobsRequest) {

        if (getSegmentImportJobsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSegmentImportJobsRequest> request = new DefaultRequest<GetSegmentImportJobsRequest>(getSegmentImportJobsRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/segments/{segment-id}/jobs/import";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "application-id",
                getSegmentImportJobsRequest.getApplicationId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY
                .marshall(uriResourcePath, "segment-id", getSegmentImportJobsRequest.getSegmentId());
        request.setResourcePath(uriResourcePath);

        if (getSegmentImportJobsRequest.getPageSize() != null) {
            request.addParameter("page-size", StringUtils.fromString(getSegmentImportJobsRequest.getPageSize()));
        }

        if (getSegmentImportJobsRequest.getToken() != null) {
            request.addParameter("token", StringUtils.fromString(getSegmentImportJobsRequest.getToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
