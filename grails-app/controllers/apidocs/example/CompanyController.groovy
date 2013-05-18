package apidocs.example

import com.imon.apidocs.annotations.Api
import com.imon.apidocs.annotations.ApiOperation

@Api(module="companyModule", description="Deals with company resource", href = "https://sites.google.com/home")
class CompanyController {

    @ApiOperation(value="List all companies", notes="", responseClass=List)
    def list() {
        println "List"
    }

    @ApiOperation(value="Create a new company", notes="", responseClass=Company)
    def create() {
        println "Create"
    }

    @ApiOperation(value="Display details for given company", notes="", responseClass=Company)
    def show() {
        println "Show"
    }

    @ApiOperation(value="Delete company", notes="", responseClass=Company)
    def delete() {
        println "Delete"
    }

    @ApiOperation(value="Update company", notes="", responseClass=Company)
    def update() {
        println "Update"
    }
}