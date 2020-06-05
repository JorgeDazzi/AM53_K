package br.dazzi.AM53_K.settings

import java.time.format.DateTimeFormatter

object AM53DateFormatter {
    val AM53_FORMATTER: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
}