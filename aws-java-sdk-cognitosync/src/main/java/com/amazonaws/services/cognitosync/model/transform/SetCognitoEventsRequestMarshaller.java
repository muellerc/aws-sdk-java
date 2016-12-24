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
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * SetCognitoEventsRequest Marshaller
 */
public class SetCognitoEventsRequestMarshaller implements Marshaller<Request<SetCognitoEventsRequest>, SetCognitoEventsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public SetCognitoEventsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SetCognitoEventsRequest> marshall(SetCognitoEventsRequest setCognitoEventsRequest) {

        if (setCognitoEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetCognitoEventsRequest> request = new DefaultRequest<SetCognitoEventsRequest>(setCognitoEventsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/events";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "IdentityPoolId",
                setCognitoEventsRequest.getIdentityPoolId());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalMap<String, String> eventsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) setCognitoEventsRequest
                    .getEvents();
            if (!eventsMap.isEmpty() || !eventsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Events");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> eventsMapValue : eventsMap.entrySet()) {
                    if (eventsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(eventsMapValue.getKey());

                        jsonGenerator.writeValue(eventsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
