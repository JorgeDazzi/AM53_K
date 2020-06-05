package br.dazzi.AM53_K.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import org.intellij.lang.annotations.Pattern
import java.time.ZonedDateTime

class LogRequest(

        @JsonProperty(value = "id")
        var id: Long? = 0,

        @JsonProperty(value = "date")
        @field:Pattern("(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}(?:.\\d{3}\\b)?)\$")
        var date: String? = null,

        @JsonProperty("ip")
        @field:Pattern("^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!\$)|\$)){4}\$")
        var ip: String,

        @JsonProperty(value = "request")
        var request: String? = null,

        @JsonProperty(value = "status")
        var status: Int = 0,

        @JsonProperty(value = "user_agent")
        val userAgent: String? = null
)