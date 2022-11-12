package com.jt17.restapi.model


data class ApiModel<T>(
    val per_page: Int,
    val total: Int,
    val data: T
)