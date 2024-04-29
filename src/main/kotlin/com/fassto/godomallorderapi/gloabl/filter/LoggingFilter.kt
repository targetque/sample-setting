package com.fassto.godomallorderapi.gloabl.filter

import com.fassto.godomallorderapi.gloabl.logger
import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.annotation.WebFilter
import org.springframework.stereotype.Component

@Component
@WebFilter("/*")
class LoggingFilter : Filter {

    private val log = this.logger()

    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain) {

        val br = request!!.inputStream
        var requestByteArray: ByteArray = br.readAllBytes()
        val payload = String(requestByteArray)

        log.info("payload : $payload")

        // chain안에 있는 그 다음 필터를 호출하도록 한다. chain.doFilter 호출하지 않으면 중단
        chain.doFilter(request, response)

    }

}