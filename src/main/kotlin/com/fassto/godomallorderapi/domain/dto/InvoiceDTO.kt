package com.fassto.godomallorderapi.domain.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "송장 등록 요청 DTO")
data class InvoiceDTO(

    @Schema(description = "고객사 코드", example = "34858", required = false)
    val cstCd: String?,
    @Schema(description = "자동 주문 수집 여부", example = "Y", required = false)
    val autoInvoiceYn: String? = "Y"
)