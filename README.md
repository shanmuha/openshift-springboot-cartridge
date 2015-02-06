## Openshift Springboot Cartridge

A cartridge for OpenShift using spring boot and Java 8. This OpenShift cartidge is not scalable yet.

This is based on multiple existing codebases.

### Installation

To install this cartridge you use the cartridge reflector from the command line. In the example below a "myapp" directory will be created in the location where the command is run as the git repo where your static web content will live will be cloned there.

	rhc create-app myapp http://cartreflect-claytondev.rhcloud.com/reflect?github=shanmuha/openshift-springboot-cartridge


### Configuration

No special config needed