# lambda

Java implementation of a Lambda function.

Prior to creating the function, create an IAM role

aws iam get-role --role-name lambda-ex

aws iam get-role --role-name lambda-ex
{
    "Role": {
        "Path": "/",
        "RoleName": "lambda-ex",
        "RoleId": "AROAVJRCPRL2657VXS677",
        "Arn": "arn:aws:iam::364070800117:role/lambda-ex",
        "CreateDate": "2021-07-24T23:27:52+00:00",
        "AssumeRolePolicyDocument": {
            "Version": "2012-10-17",
            "Statement": [
                {
                    "Effect": "Allow",
                    "Principal": {
                        "Service": "lambda.amazonaws.com"
                    },
                    "Action": "sts:AssumeRole"
                }
            ]
        },
        "Description": "Allows Lambda functions to call AWS services on your behalf.",
        "MaxSessionDuration": 3600,
        "RoleLastUsed": {
            "LastUsedDate": "2021-07-24T23:36:07+00:00",
            "Region": "us-west-1"
        }
    }
}

Create the function:

aws lambda create-function --function-name FauxPhone --zip-file fileb://target/FauxPhone-1.0-SNAPSHOT.jar --runtime java11 --role arn:aws:iam::<acount id>:role/lambda-ex --handler tech.robNelson.lambda.FauxPhoneHandler

aws lambda invoke --function-name FauxPhone --payload '{"count": 5}' --cli-binary-format raw-in-base64-out target/output.txt && cat target/output.txt
