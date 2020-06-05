package br.dazzi.AM53_K.repository

import br.dazzi.AM53_K.domain.entity.EntityDefault

interface Repository< E : EntityDefault> {

    fun add(entity: E): E

    fun update(entity: E)

    fun remove(entity: E)

    fun find(id: Long): E?

    fun findAll(): Set<E>?
}