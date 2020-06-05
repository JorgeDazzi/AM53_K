package br.dazzi.AM53_K.domain.entity

import org.jetbrains.annotations.NotNull
import java.time.ZonedDateTime
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Logs : EntityDefault {

    lateinit var ip: String
    var request: String? = null
    var status: Int = 0

    @Column(name = "user_agent")
    var userAgent: String? = null

    constructor(date: ZonedDateTime?, ip: String, request: String?, status: Int, userAgent: String?) {
        this.date = date
        this.ip = ip
        this.request = request
        this.status = status
        this.userAgent = userAgent
    }

    constructor(ip: String, request: String?, status: Int, userAgent: String?) {
        date = null
        this.ip = ip
        this.request = request
        this.status = status
        this.userAgent = userAgent
    }

    constructor() {}

    constructor(id: Long?, date: ZonedDateTime?, ip: String, request: String?, status: Int, userAgent: String?) {
        this.id = id
        this.date = date
        this.ip = ip
        this.request = request
        this.status = status
        this.userAgent = userAgent
    }
}