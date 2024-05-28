package com.fassto.godomallorderapi.gloabl.exception

import com.fassto.godomallorderapi.gloabl.error.ErrorCode
import com.fassto.godomallorderapi.gloabl.error.ExceptionEnum
import org.springframework.http.HttpStatus


open class CustomException (
    val errorCode: ExceptionEnum,
    val errorMessage: String = errorCode.message
) : RuntimeException()

    /*private companion object defaultErrorCodeHolder {

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

    }*/


