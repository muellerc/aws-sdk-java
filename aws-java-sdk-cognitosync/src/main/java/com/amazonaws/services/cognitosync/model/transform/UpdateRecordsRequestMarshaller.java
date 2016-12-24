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
 * UpdateRecordsRequest Marshaller
 */
public class UpdateRecordsRequestMarshaller implements Marshaller<Request<UpdateRecordsRequest>, UpdateRecordsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateRecordsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateRecordsRequest> marshall(UpdateRecordsRequest updateRecordsRequest) {

        if (updateRecordsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateRecordsRequest> request = new DefaultRequest<UpdateRecordsRequest>(updateRecordsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        if (updateRecordsRequest.getClientContext() != null) {
            request.addHeader("x-amz-Client-Context", StringUtils.fromString(updateRecordsRequest.getClientContext()));
        }

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityPoolId",
                updateRecordsRequest.getIdentityPoolId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityId", updateRecordsRequest.getIdentityId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "DatasetName", updateRecordsRequest.getDatasetName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateRecordsRequest.getDeviceId() != null) {
                jsonGenerator.writeFieldName("DeviceId").writeValue(updateRecordsRequest.getDeviceId());
            }

            com.amazonaws.internal.SdkInternalList<RecordPatch> recordPatchesList = (com.amazonaws.internal.SdkInternalList<RecordPatch>) updateRecordsRequest
                    .getRecordPatches();
            if (!recordPatchesList.isEmpty() || !recordPatchesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("RecordPatches");
                jsonGenerator.writeStartArray();
                for (RecordPatch recordPatchesListValue : recordPatchesList) {
                    if (recordPatchesListValue != null) {

                        RecordPatchJsonMarshaller.getInstance().marshall(recordPatchesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateRecordsRequest.getSyncSessionToken() != null) {
                jsonGenerator.writeFieldName("SyncSessionToken").writeValue(updateRecordsRequest.getSyncSessionToken());
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
