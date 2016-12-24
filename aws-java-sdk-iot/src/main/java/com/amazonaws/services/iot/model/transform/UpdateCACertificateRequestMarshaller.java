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
 * UpdateCACertificateRequest Marshaller
 */
public class UpdateCACertificateRequestMarshaller implements Marshaller<Request<UpdateCACertificateRequest>, UpdateCACertificateRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateCACertificateRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateCACertificateRequest> marshall(UpdateCACertificateRequest updateCACertificateRequest) {

        if (updateCACertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCACertificateRequest> request = new DefaultRequest<UpdateCACertificateRequest>(updateCACertificateRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/cacertificate/{caCertificateId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "caCertificateId",
                updateCACertificateRequest.getCertificateId());
        request.setResourcePath(uriResourcePath);

        if (updateCACertificateRequest.getNewStatus() != null) {
            request.addParameter("newStatus", StringUtils.fromString(updateCACertificateRequest.getNewStatus()));
        }

        if (updateCACertificateRequest.getNewAutoRegistrationStatus() != null) {
            request.addParameter("newAutoRegistrationStatus", StringUtils.fromString(updateCACertificateRequest.getNewAutoRegistrationStatus()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
