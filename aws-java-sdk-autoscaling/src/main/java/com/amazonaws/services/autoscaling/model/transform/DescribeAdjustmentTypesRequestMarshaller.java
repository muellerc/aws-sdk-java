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
package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;

/**
 * DescribeAdjustmentTypesRequest Marshaller
 */

public class DescribeAdjustmentTypesRequestMarshaller implements Marshaller<Request<DescribeAdjustmentTypesRequest>, DescribeAdjustmentTypesRequest> {

    public Request<DescribeAdjustmentTypesRequest> marshall(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) {

        if (describeAdjustmentTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAdjustmentTypesRequest> request = new DefaultRequest<DescribeAdjustmentTypesRequest>(describeAdjustmentTypesRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "DescribeAdjustmentTypes");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        return request;
    }

}
