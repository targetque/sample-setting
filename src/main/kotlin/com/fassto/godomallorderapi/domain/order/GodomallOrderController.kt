package com.fassto.godomallorderapi.domain.order

import com.fassto.godomallorderapi.domain.Person
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

class GodomallOrderController(port : Int) {

    @Value("\${redis.data.port}")
    private val port : Int = 0

    @RequestMapping("/api")
    fun api() : String {
        return "api"
    }

    @RequestMapping("/api/body", method = [RequestMethod.POST])
    fun apiBody(@RequestBody person : Person) : String {
        return "api"
    }

}