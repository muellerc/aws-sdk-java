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
 * TransferCertificateRequest Marshaller
 */
public class TransferCertificateRequestMarshaller implements Marshaller<Request<TransferCertificateRequest>, TransferCertificateRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public TransferCertificateRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<TransferCertificateRequest> marshall(TransferCertificateRequest transferCertificateRequest) {

        if (transferCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TransferCertificateRequest> request = new DefaultRequest<TransferCertificateRequest>(transferCertificateRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/transfer-certificate/{certificateId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "certificateId",
                transferCertificateRequest.getCertificateId());
        request.setResourcePath(uriResourcePath);

        if (transferCertificateRequest.getTargetAwsAccount() != null) {
            request.addParameter("targetAwsAccount", StringUtils.fromString(transferCertificateRequest.getTargetAwsAccount()));
        }

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (transferCertificateRequest.getTransferMessage() != null) {
                jsonGenerator.writeFieldName("transferMessage").writeValue(transferCertificateRequest.getTransferMessage());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
