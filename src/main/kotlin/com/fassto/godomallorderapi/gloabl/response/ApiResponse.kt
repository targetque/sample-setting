package com.fassto.godomallorderapi.gloabl.response

import org.springframework.http.HttpStatus

data class ApiResponse<T>(
    val code: Int = HttpStatus.OK.value(),
    val message: String = HttpStatus.OK.reasonPhrase,
    val data: T? = null
) {
    companion object {
        fun create(code: Int, message: String) = ApiResponse(code, message, null)
    }

    constructor (code: Int, message: String) : this(code, message, null)
}