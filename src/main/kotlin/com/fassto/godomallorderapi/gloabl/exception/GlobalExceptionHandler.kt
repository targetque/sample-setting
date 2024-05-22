package com.fassto.godomallorderapi.gloabl.exception

import com.fassto.godomallorderapi.gloabl.error.ErrorCode
import org.springframework.http.ResponseEntity
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(CustomException::class)
    fun handleCustomException(e: CustomException): ResponseEntity<ErrorCode> {
        return ResponseEntity(ErrorCode.)

    }

}