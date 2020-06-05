package br.dazzi.AM53_K.repository

import br.dazzi.AM53_K.domain.entity.Logs

interface LogRepository : Repository<Logs> {

    fun add(logs: List<Logs>)
}