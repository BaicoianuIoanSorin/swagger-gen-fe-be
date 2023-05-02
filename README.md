Create your resource as the UserResource inside of the Controllers package
Generate the swagger-spec-generated.json again by using mvn clean install
Use
npm install @openapitools/openapi-generator-cli -g
for FE
run this command
openapi-generator-cli generate -i swagger/swagger-spec-generated.json -g typescript-angular -o generated-code


//TODO update it so it's more readable...
