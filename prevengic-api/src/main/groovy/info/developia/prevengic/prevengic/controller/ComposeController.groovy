package info.developia.prevengic.prevengic.controller

import info.developia.prevengic.model.Compose
import info.developia.prevengic.service.ComposeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/composes")
class ComposeController {

    ComposeService composeService

    ComposeController(ComposeService composeService) {
        this.composeService = composeService
    }

    @GetMapping("/all")
    ResponseEntity<List<Compose>> getAll() {
        ResponseEntity.ok(composeService.getAll())
    }

    @GetMapping
    ResponseEntity<Compose> getByNcas(@RequestParam String ncas) {
        ResponseEntity.ok(composeService.getByNcas(ncas))
    }

    @PostMapping
    ResponseEntity save(@RequestBody Compose compose) {
        ResponseEntity.ok(composeService.save(compose))
    }

}
