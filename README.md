![Build Status](https://github.com/UKHomeOffice/identity-service-api/workflows/Publish%20Docker/badge.svg)

# Identity Service API

An api for storing both MRZ scans and biometric information.

This API is fully secured and stores the data in S3.

### Environment

#### Bootstrap configuration

The following environment variables are required to load properties from AWS secrets manager

* AWS_SECRETS_MANAGER_ENABLED
* AWS_REGION
* AWS_ACCESS_KEY
* AWS_SECRET_KEY
* SPRING_PROFILES_ACTIVE

```json
{
  "api.allowedAudiences": "ui",
  "auth.url": "https://keycloak.lodev",
  "auth.realm": "elf",
  "api.read.roles": "read-role, read-role2",
  "api.update.roles": "update-role, update-role2",
  "api.admin.roles": "admin-role, admin-role2",
  "aws.s3.identity.scanData": "scans",
  "openapi.docs.enabled" : true,
  "swagger.auth.realm" : "elf",
  "swagger.auth.clientId" : "swagger-ui",
  "ssl.enabled" : false,
  "javax.net.ssl.trustStore" : "/etc/keystore/cacerts",
  "javax.net.ssl.trustStorePassword" : "changeit",
  "javax.net.ssl.trustStoreType" : "PKCS12",
  "gpg.userId" : "test@lodev.xyz",
  "gpg.password" : "test",
  "gpg.privateKey" : "private key that is based 64 encoded",
  "aws.s3.csca.masterList" : "location of the gpg encrypted master list in S3",
  "csCaCert" : "Base 64 encoded ca cert",
  "workflowApi.url" : "http://localhost:8080"
}
```

### Authorization levels

1. ***Audience is required and checked. If the audience do not match a 403 will be returned***

2. ***If read roles not configured then the caller will get a 403 when performing a GET***

3. ***If update roles not configured then the caller will get a 403 when performing a POST***

4. ***Admin role required to perform admin functions***

5. ***Both update and read roles need to be present in order to perform an update.***

6. ***read, update and admin roles need to be present in order to perform any admin functions.***

6. ***Only read role required for read.***

If you do not want to expose the admin function then provide the following property:

```
admin.controller.enabled: false
```

This will prevent the admin endpoint from ever being exposed.


### Swagger UI

```
{server address}/swagger/ui.html
```

***Please refer to the Open API spec to get a better understanding of the different APIs.***


#### Submit to workflow

There is an additional option within the model that allows you to submit the mrz scan to a camunda workflow. An example:

```json
"workflow": {
 "processKey" : "test",
 "variableName": "mrzScan",
 "workflowUrl" : "http://camunda.workflow.io"    
}
```

The workflow url is optional. If this is not present then the service will use the default configured on start up.
