package com.fassto.godomallorderapi.gloabl.exception

import com.fassto.godomallorderapi.gloabl.error.ErrorCode
import com.fassto.godomallorderapi.gloabl.error.ExceptionEnum
import com.fassto.godomallorderapi.gloabl.response.ApiResponse
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.badRequest
import org.springframework.http.ResponseEntity.internalServerError
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(CustomException::class)
    fun handleCustomException(e: CustomException): ResponseEntity<ApiResponse<Nothing>> {
        return ResponseEntity(ApiResponse.create(e.errorCode.code, e.errorCode.message), HttpStatusCode.valueOf(e.errorCode.code))
    }

    @ExceptionHandler(Throwable::class)
    fun handleCommonException(e: Throwable): ResponseEntity<ApiResponse<Nothing>> {
        val commonResponse: ApiResponse<Nothing> = ApiResponse(ExceptionEnum.SERVER_ERROR.code, ExceptionEnum.SERVER_ERROR.message)
        return internalServerError().body(commonResponse)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleCommonException(e: HttpMessageNotReadableException) : ResponseEntity<ApiResponse<Nothing>> {
        val commonResponse: ApiResponse<Nothing> = ApiResponse(ExceptionEnum.CHECK_REQUEST_VALUES.code, ExceptionEnum.CHECK_REQUEST_VALUES.message)
        return badRequest().body(commonResponse)
    }

}