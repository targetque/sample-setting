package com.fassto.godomallorderapi.gloabl.error

import org.springframework.http.HttpStatus

interface ErrorCode {
    val message : String
    val code : Int
    fun getHttpStatus() : HttpStatus
}