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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class SetQueueAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attributes are set.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is delayed.
     * Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid values:
     * An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0 to 20
     * (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue. For more
     * information about the redrive policy and dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to 43,200
     * (12 hours). The default is 30. For more information about the visibility timeout, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated as
     * duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters (such as the following) are ignored:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * Default constructor for SetQueueAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public SetQueueAttributesRequest() {
    }

    /**
     * Constructs a new SetQueueAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attributes are set.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @param attributes
     *        A map of attributes to set.
     *        </p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is
     *        delayed. Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default
     *        is 262,144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid
     *        values: An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600
     *        (4 days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     *        <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0
     *        to 20 (seconds). The default is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue.
     *        For more information about the redrive policy and dead letter queues, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a
     *        standard queue must also be a standard queue.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to
     *        43,200 (12 hours). The default is 30. For more information about the visibility timeout, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute applies only to <a
     *        href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated
     *        as duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters (such as the following) are ignored:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code>
     *        </p>
     *        </li>
     */
    public SetQueueAttributesRequest(String queueUrl, java.util.Map<String, String> attributes) {
        setQueueUrl(queueUrl);
        setAttributes(attributes);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attributes are set.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attributes are set.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attributes are set.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue whose attributes are set.</p>
     *         <p>
     *         Queue URLs are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue whose attributes are set.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue whose attributes are set.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is delayed.
     * Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid values:
     * An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0 to 20
     * (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue. For more
     * information about the redrive policy and dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to 43,200
     * (12 hours). The default is 30. For more information about the visibility timeout, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated as
     * duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters (such as the following) are ignored:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of attributes to set.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters that the
     *         <code>SetQueueAttributes</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is
     *         delayed. Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *         rejects it. Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default
     *         is 262,144 (256 KiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid
     *         values: An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is
     *         345,600 (4 days).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy
     *         structure, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview
     *         of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     *         <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from
     *         0 to 20 (seconds). The default is 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue.
     *         For more information about the redrive policy and dead letter queues, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *         >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a
     *         standard queue must also be a standard queue.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to
     *         43,200 (12 hours). The default is 30. For more information about the visibility timeout, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute applies only to <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *         (first-in-first-out) queues</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *         >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Every message must have a unique <code>MessageDeduplicationId</code>,
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You may provide a <code>MessageDeduplicationId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *         <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *         <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the
     *         message).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *         <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *         overrides the generated one.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *         deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated
     *         as duplicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *         a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *         <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *         message is delivered.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Any other valid special request parameters (such as the following) are ignored:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessages</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesDelayed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateNumberOfMessagesNotVisible</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreatedTimestamp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastModifiedTimestamp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QueueArn</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is delayed.
     * Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid values:
     * An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0 to 20
     * (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue. For more
     * information about the redrive policy and dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to 43,200
     * (12 hours). The default is 30. For more information about the visibility timeout, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated as
     * duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters (such as the following) are ignored:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes to set.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is
     *        delayed. Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default
     *        is 262,144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid
     *        values: An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600
     *        (4 days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     *        <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0
     *        to 20 (seconds). The default is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue.
     *        For more information about the redrive policy and dead letter queues, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a
     *        standard queue must also be a standard queue.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to
     *        43,200 (12 hours). The default is 30. For more information about the visibility timeout, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute applies only to <a
     *        href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated
     *        as duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters (such as the following) are ignored:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code>
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes to set.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetQueueAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is delayed.
     * Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it.
     * Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default is 262,144 (256
     * KiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid values:
     * An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600 (4 days).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in
     * the <i>Amazon IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     * <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0 to 20
     * (seconds). The default is 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue. For more
     * information about the redrive policy and dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a standard
     * queue must also be a standard queue.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to 43,200
     * (12 hours). The default is 30. For more information about the visibility timeout, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     * (first-in-first-out) queues</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     * >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every message must have a unique <code>MessageDeduplicationId</code>,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You may provide a <code>MessageDeduplicationId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     * <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     * <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     * <code>ContentBasedDeduplication</code> set, the action fails with an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides
     * the generated one.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     * deduplication interval are treated as duplicates and only one copy of the message is delivered.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated as
     * duplicates.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a
     * <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     * <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message
     * is delivered.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Any other valid special request parameters (such as the following) are ignored:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessages</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesDelayed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateNumberOfMessagesNotVisible</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreatedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModifiedTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QueueArn</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of attributes to set.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetQueueAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DelaySeconds</code> - The number of seconds for which the delivery of all messages in the queue is
     *        delayed. Valid values: An integer from 0 to 900 (15 minutes). The default is 0 (zero).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS
     *        rejects it. Valid values: An integer from 1,024 bytes (1 KiB) up to 262,144 bytes (256 KiB). The default
     *        is 262,144 (256 KiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRetentionPeriod</code> - The number of seconds for which Amazon SQS retains a message. Valid
     *        values: An integer representing seconds, from 60 (1 minute) to 1,209,600 (14 days). The default is 345,600
     *        (4 days).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure,
     *        see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM
     *        Policies</a> in the <i>Amazon IAM User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReceiveMessageWaitTimeSeconds</code> - The number of seconds for which a
     *        <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: an integer from 0
     *        to 20 (seconds). The default is 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RedrivePolicy</code> - The parameters for the dead letter queue functionality of the source queue.
     *        For more information about the redrive policy and dead letter queues, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     *        >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The dead letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead letter queue of a
     *        standard queue must also be a standard queue.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>VisibilityTimeout</code> - The visibility timeout for the queue. Valid values: an integer from 0 to
     *        43,200 (12 hours). The default is 30. For more information about the visibility timeout, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute applies only to <a
     *        href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO
     *        (first-in-first-out) queues</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ContentBasedDeduplication</code> - Enables content-based deduplication. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing"
     *        >Exactly-Once Processing</a> in the <i>Amazon SQS Developer Guide</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Every message must have a unique <code>MessageDeduplicationId</code>,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You may provide a <code>MessageDeduplicationId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable
     *        <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the
     *        <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have
     *        <code>ContentBasedDeduplication</code> set, the action fails with an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code>
     *        overrides the generated one.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the
     *        deduplication interval are treated as duplicates and only one copy of the message is delivered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can also use <code>ContentBasedDeduplication</code> for messages with identical content to be treated
     *        as duplicates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with
     *        a <code>MessageDeduplicationId</code> that is the same as the one generated for the first
     *        <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the
     *        message is delivered.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Any other valid special request parameters (such as the following) are ignored:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessages</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesDelayed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateNumberOfMessagesNotVisible</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreatedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastModifiedTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QueueArn</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SetQueueAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetQueueAttributesRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetQueueAttributesRequest == false)
            return false;
        SetQueueAttributesRequest other = (SetQueueAttributesRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SetQueueAttributesRequest clone() {
        return (SetQueueAttributesRequest) super.clone();
    }

}
