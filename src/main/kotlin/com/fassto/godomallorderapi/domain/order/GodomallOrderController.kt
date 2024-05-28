package com.fassto.godomallorderapi.domain.order

import com.fassto.godomallorderapi.domain.Person
import com.fassto.godomallorderapi.gloabl.response.ApiResponse
import com.fassto.godomallorderapi.gloabl.response.OmsOrderResponseDto
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.print.attribute.IntegerSyntax

@RestController
class GodomallOrderController() {

    /*@GetMapping("/batch/order")
    fun batchOrder() : ApiResponse<OmsOrderResponseDto> {
        return "api"
    }*/

    @PostMapping("/api/body")
    fun apiBody(@RequestBody person : Person) : String {
        return "api"
    }

}