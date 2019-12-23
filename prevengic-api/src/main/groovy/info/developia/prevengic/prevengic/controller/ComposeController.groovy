package info.developia.prevengic.prevengic.controller

import info.developia.prevengic.model.Compose
import info.developia.prevengic.service.ComposeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/composes")
class ComposeController {

    ComposeService composeService

    ComposeController(ComposeService composeService) {
        this.composeService = composeService
    }

    @GetMapping("/all")
    ResponseEntity<Compose> getAll() {
        ResponseEntity.ok(composeService.getAll())
    }
    
}
