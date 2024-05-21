package com.fassto.godomallorderapi.gloabl.exception

import com.fassto.godomallorderapi.gloabl.error.ErrorCode
import org.springframework.http.HttpStatus


class CustomException : RuntimeException() {
    val errorCode: ErrorCode,

    private companion object defaultErrorCodeHolder {

        val name: String = "SERVER_ERROR"

        fun defaultHttpStatus(): HttpStatus {
            return HttpStatus.INTERNAL_SERVER_ERROR
        }

        fun defaultMessage(): String {
            return "서버 오류"
        }

        fun defaultException(): RuntimeException {
            return CustomException("SERVER_ERROR")
        }

    }


    constructor(message: String) : super(errorCode) {
        errorCode = defaultErrorCode()

    }

    constructor(cause: Throwable, errorCode: ErrorCode) : super(errorCode) {
        super(errorCode.)
    }
}