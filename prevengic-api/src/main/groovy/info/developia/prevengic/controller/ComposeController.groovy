package info.developia.prevengic.controller

import info.developia.prevengic.exception.BadRequestException
import info.developia.prevengic.model.Compose
import info.developia.prevengic.service.ComposeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

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
    ResponseEntity<Compose> getByNcas(@RequestParam Optional<String> ncas,
                                      @RequestParam Optional<String> nce,
                                      @RequestParam Optional<String> name
    ) {
        if (ncas.isPresent()) {
            return ResponseEntity.ok(composeService.getByNcas(ncas.get()))
        }
        if (nce.isPresent()) {
            return ResponseEntity.ok(composeService.getByNce(nce.get()))
        }
        if (name.isPresent()){
            return ResponseEntity.ok(composeService.getByName(name.get()))
        }

        throw new BadRequestException("Ncas and Nce criteria cannot be used at the same time")
    }
}
