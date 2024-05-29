package com.fassto.godomallorderapi.domain.order

import com.fassto.godomallorderapi.domain.dto.InvoiceDTO
import com.fassto.godomallorderapi.gloabl.response.ApiResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/invoice")
internal class GodomallInvoiceController {

    @RequestMapping("")
    @PostMapping
    fun attachInvoice(@RequestBody(required = false) invoiceDTO: InvoiceDTO?): String {
        return "invoice"
    }
}