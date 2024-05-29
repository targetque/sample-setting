package com.fassto.godomallorderapi.domain.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "주문 수집 요청 DTO")
data class OrderDTO(

    @Schema(description = "고객사 코드", example = "34858", required = false)
    val cstCd: String?,
    @Schema(description = "자동 주문 수집 여부", example = "Y", required = false)
    val autoOrderYn: String? = "Y"
)