package com.fassto.godomallorderapi.gloabl.filter

import com.fassto.godomallorderapi.gloabl.logger
import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.annotation.WebFilter

@WebFilter("/*")
class LoggingFilter : Filter {

    private val log = this.logger()

    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val br = request?.reader

        val brList = br?.lines()?.toList()

        log.info("payload : ", brList)

    }

}