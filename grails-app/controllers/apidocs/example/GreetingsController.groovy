package apidocs.example

import com.imon.apidocs.annotations.Api
import com.imon.apidocs.annotations.ApiOperation

@Api(module="paymentMethod", description = "")
class GreetingsController {

    @ApiOperation(value = "Hello world", responseClass = Employee.class)
    def hello(String name) {
        println "Hello world"
    }
}
