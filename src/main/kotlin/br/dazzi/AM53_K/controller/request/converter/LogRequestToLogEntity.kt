package br.dazzi.AM53_K.controller.request.converter

import br.dazzi.AM53_K.controller.request.LogRequest
import br.dazzi.AM53_K.domain.entity.Logs
import br.dazzi.AM53_K.settings.AM53DateFormatter
import java.time.LocalDateTime
import java.time.ZoneId

class LogRequestToLogEntity {
    fun converter(logRequest: LogRequest): Logs {
        return Logs(
                logRequest.id,
                if (logRequest.date == null) null else LocalDateTime.parse(logRequest.date, AM53DateFormatter.AM53_FORMATTER).atZone(ZoneId.systemDefault()),
                logRequest.ip,
                logRequest.request,
                logRequest.status,
                logRequest.userAgent
        )
    }
}