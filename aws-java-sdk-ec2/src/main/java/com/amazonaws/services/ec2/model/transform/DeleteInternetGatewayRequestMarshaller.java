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
package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteInternetGatewayRequest Marshaller
 */

public class DeleteInternetGatewayRequestMarshaller implements Marshaller<Request<DeleteInternetGatewayRequest>, DeleteInternetGatewayRequest> {

    public Request<DeleteInternetGatewayRequest> marshall(DeleteInternetGatewayRequest deleteInternetGatewayRequest) {

        if (deleteInternetGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteInternetGatewayRequest> request = new DefaultRequest<DeleteInternetGatewayRequest>(deleteInternetGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteInternetGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteInternetGatewayRequest.getInternetGatewayId() != null) {
            request.addParameter("InternetGatewayId", StringUtils.fromString(deleteInternetGatewayRequest.getInternetGatewayId()));
        }

        return request;
    }

}
