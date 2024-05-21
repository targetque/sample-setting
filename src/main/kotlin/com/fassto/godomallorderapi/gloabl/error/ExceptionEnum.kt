package com.fassto.godomallorderapi.gloabl.error

import org.springframework.http.HttpStatus

enum class ExceptionEnum {
    // System Exception
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001"),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "E0002"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E0003"),

    // Custom Exception
    SECURITY(HttpStatus.UNAUTHORIZED, "CE0001", "로그인이 필요합니다");

    private val status: HttpStatus
    private val code: String
    private var message: String? = null

    constructor(status: HttpStatus, code: String) {
        this.status = status
        this.code = code
    }

    constructor(status: HttpStatus, code: String, message: String) {
        this.status = status
        this.code = code
        this.message = message
    }
}