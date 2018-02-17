package com.bobjamin


enum class AwsResourceType(val service: AwsService, val resource: String, val type: String, val arnSeparator: String = "/", val hasRegion: Boolean = true, val hasAccount: Boolean = true){
    INSTANCE(AwsService.EC2, "instance", "Instance"),
    IMAGE(AwsService.EC2, "image", "Image", hasAccount = false),
    VOLUME(AwsService.EC2, "volume", "Volume"),
    SNAPSHOT(AwsService.EC2, "snapshot", "Snapshot", hasAccount = false),
    SECURITY_GROUP(AwsService.EC2, "security-group", "SecurityGroup"),
    FUNCTION(AwsService.LAMBDA, "function", "Function", ":" ),
    ROLE(AwsService.IAM, "role", "Role"),
    INSTANCE_PROFILE(AwsService.IAM, "instance-profile", "InstanceProfile", hasRegion = false),
    KEY(AwsService.KMS, "key", "Key"),
    LOG_GROUP(AwsService.LOGS, "log-group", "LogGroup"),
    QUEUE(AwsService.SQS, "", "", arnSeparator = ""),
    TOPIC(AwsService.SNS, "", "", arnSeparator = ""),
    BUCKET(AwsService.S3, "", "", arnSeparator = "", hasRegion = false, hasAccount = false);

    enum class AwsService(val service: String, val type: String){
        EC2("ec2", "EC2"),
        LAMBDA("lambda", "Lambda"),
        IAM("iam", "IAM"),
        KMS("kms", "KMS"),
        LOGS("logs", "Logs"),
        SQS("sqs", "SQS"),
        SNS("sns", "SNS"),
        S3("s3", "S3")
    }
}
