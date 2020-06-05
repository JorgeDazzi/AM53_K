package br.dazzi.AM53_K.controller.response.convert

import br.dazzi.AM53_K.controller.response.LogResponse
import br.dazzi.AM53_K.domain.entity.Logs
import br.dazzi.AM53_K.settings.AM53DateFormatter

class LogEntityToLogResponse {
    fun converter(log: Logs) : LogResponse{
        return LogResponse(
                log.id,
                log.date?.format(AM53DateFormatter.AM53_FORMATTER),
                log.ip,
                log.request,
                log.status,
                log.userAgent
        )
    }

    fun converter(list: Set<Logs>?) : MutableList<LogResponse>?{
        val logs = mutableListOf<LogResponse>()

        list?.forEach {
            logs.add(
                    LogEntityToLogResponse()
                            .converter(it)
            )
        }

        return logs

    }

}