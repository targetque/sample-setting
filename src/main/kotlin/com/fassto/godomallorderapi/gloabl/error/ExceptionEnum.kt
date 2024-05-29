package com.fassto.godomallorderapi.gloabl.error

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.UNAUTHORIZED
import org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR

enum class ExceptionEnum(
    val status: HttpStatus,
    val code: Int,
    val message: String

) {
    // System Exception
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.reasonPhrase),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.reasonPhrase),
    //INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.reasonPhrase),

    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, INTERNAL_SERVER_ERROR.value(), "서버 에러가 발생했습니다."),


    // Custom Exception
    SECURITY(HttpStatus.UNAUTHORIZED, BAD_REQUEST.value(), "로그인이 필요합니다"),
    GOD_SHORTAGE(HttpStatus.BAD_REQUEST, BAD_REQUEST.value(), "%s(%s)의 재고가 부족합니다.(현재고: %d)"),
    EMPTY_PARAM(HttpStatus.BAD_REQUEST, BAD_REQUEST.value(), "%s이(가) 없습니다."),
    INVALID_PARAM(HttpStatus.BAD_REQUEST, BAD_REQUEST.value(), "%s이(가) 잘못되었습니다."),
    CHECK_REQUEST_VALUES(HttpStatus.BAD_REQUEST, BAD_REQUEST.value(), "요청 변수의 형식이 잘못됐습니다."),


   /* constructor(status: HttpStatus, code: String, message: String) {
        this.status = status,
        code = code,
        message = message
    }*/

}