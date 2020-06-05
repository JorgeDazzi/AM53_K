package br.dazzi.AM53_K.repository.jpql

import br.dazzi.AM53_K.domain.entity.Logs
import br.dazzi.AM53_K.repository.LogRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class LogRepositoryImp : LogRepository {

    @PersistenceContext
    lateinit var entityManager : EntityManager

    override fun add(logs: List<Logs>) {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun add(entity: Logs): Logs {
        entityManager.persist(entity)
        return entity
    }

    override fun update(entity: Logs) {
        TODO("Not yet implemented")
    }

    override fun remove(entity: Logs) {
        TODO("Not yet implemented")
    }

    override fun find(id: Long): Logs? {
        TODO("Not yet implemented")
    }

    override fun findAll(): Set<Logs>? {
        return entityManager
                .createQuery("SELECT L FROM Logs L WHERE 1=1", Logs::class.java)
                .resultList.toSet()
    }
}