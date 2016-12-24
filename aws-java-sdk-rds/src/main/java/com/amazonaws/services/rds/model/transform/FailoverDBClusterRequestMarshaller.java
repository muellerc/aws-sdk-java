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
package com.amazonaws.services.rds.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * FailoverDBClusterRequest Marshaller
 */

public class FailoverDBClusterRequestMarshaller implements Marshaller<Request<FailoverDBClusterRequest>, FailoverDBClusterRequest> {

    public Request<FailoverDBClusterRequest> marshall(FailoverDBClusterRequest failoverDBClusterRequest) {

        if (failoverDBClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<FailoverDBClusterRequest> request = new DefaultRequest<FailoverDBClusterRequest>(failoverDBClusterRequest, "AmazonRDS");
        request.addParameter("Action", "FailoverDBCluster");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (failoverDBClusterRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(failoverDBClusterRequest.getDBClusterIdentifier()));
        }

        if (failoverDBClusterRequest.getTargetDBInstanceIdentifier() != null) {
            request.addParameter("TargetDBInstanceIdentifier", StringUtils.fromString(failoverDBClusterRequest.getTargetDBInstanceIdentifier()));
        }

        return request;
    }

}
