# Steps
### 1. Create your resource as the UserResource inside of the Controllers package
### 2. Generate the swagger-spec-generated.json again by using 
```agsl
mvn clean install
```
### 3. Use inside FE (Client), only if your project doesn't have the _**openapi-generator-cli**_ package
```
npm install @openapitools/openapi-generator-cli -g 
```
### 4. Run command
```
openapi-generator-cli generate -i swagger/swagger-spec-generated.json -g typescript-angular -o generated-code
```
