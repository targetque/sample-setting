package com.fassto.godomallorderapi.domain.order

import com.fassto.godomallorderapi.domain.Person
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

    @GetMapping("/api")
    fun api() : String {
        return "api"
    }

    @PostMapping("/api/body")
    fun apiBody(@RequestBody person : Person) : String {
        return "api"
    }

}