package br.dazzi.AM53_K.controller.response

import com.fasterxml.jackson.annotation.JsonProperty

class LogResponse(
        @JsonProperty("id")
        val id: Long?,

        @JsonProperty("date")
        val date: String?,

        @JsonProperty("ip")
        val ip: String?,

        @JsonProperty("request")
        val request: String?,

        @JsonProperty("status")
        val status: Int?,

        @JsonProperty("user_agent")
        val userAgent: String?
)