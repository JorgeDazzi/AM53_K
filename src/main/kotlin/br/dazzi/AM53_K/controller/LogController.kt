package br.dazzi.AM53_K.controller

import br.dazzi.AM53_K.controller.request.LogRequest
import br.dazzi.AM53_K.controller.request.converter.LogRequestToLogEntity
import br.dazzi.AM53_K.controller.response.LogResponse
import br.dazzi.AM53_K.controller.response.convert.LogEntityToLogResponse
import br.dazzi.AM53_K.domain.entity.Logs
import br.dazzi.AM53_K.repository.jpql.LogRepositoryImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
@RequestMapping("api/logs/")
class LogController {


    @Autowired
    lateinit var repo : LogRepositoryImp

    @GetMapping(path = ["/"])
    fun findAll() : ResponseEntity<MutableList<LogResponse>>?{
        val logs = repo.findAll()

        return ResponseEntity(
                LogEntityToLogResponse().converter(logs),
                HttpStatus.OK
        )
    }

    @PostMapping(path = ["/"], consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun add(@RequestBody @Validated logRequest : LogRequest) : ResponseEntity<LogResponse>?{
        val log = repo.add(
                LogRequestToLogEntity().converter(logRequest)
        )
        return ResponseEntity(
                LogEntityToLogResponse().converter(log),
                HttpStatus.CREATED
        )
    }

}