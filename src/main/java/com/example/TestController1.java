package com.example;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amarendra on 14/12/16.
 */
@RestController
@RequestMapping("/test")
public class TestController1 {

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "helloVal", nickname = "helloNM")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public String hello(){
        return "Hello1";
    }



    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "helloPerson", nickname = "helloPerson")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "Person's name", required = false, dataType = "string", paramType = "query", defaultValue="Amar")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public String helloPerson(@RequestParam(value = "name") String name){
        return "Hello "+ name;
    }

}
