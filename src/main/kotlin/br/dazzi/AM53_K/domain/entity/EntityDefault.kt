package br.dazzi.AM53_K.domain.entity

import java.time.ZoneId
import java.time.ZonedDateTime
import javax.persistence.*

@MappedSuperclass
open class EntityDefault {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
    var date: ZonedDateTime? = null

    @PostPersist
    fun PostPersistDate() {
        if (date == null) date = ZonedDateTime.now(ZoneId.systemDefault())
    }

}