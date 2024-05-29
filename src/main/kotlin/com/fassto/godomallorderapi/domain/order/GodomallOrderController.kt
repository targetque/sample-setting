package com.fassto.godomallorderapi.domain.order

import com.fassto.godomallorderapi.domain.dto.OrderDTO
import com.fassto.godomallorderapi.domain.order.service.GodomallOrderService
import com.fassto.godomallorderapi.gloabl.response.ApiResponse
import com.fassto.godomallorderapi.gloabl.response.OmsOrderResponseDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/order")
class GodomallOrderController(
    private val godomallOrderService : GodomallOrderService,
) {


    @PostMapping("")
    fun batchOrder(@RequestBody(required = false) orderDTO : OrderDTO?) : String {

        godomallOrderService.order()

        return "api"
    }

}