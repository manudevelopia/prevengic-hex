package info.developia.prevengic.controller

import info.developia.prevengic.ComposeRepositoryImpl
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository
import info.developia.prevengic.service.ComposeService

class ComposeController {

    ComposeRepository composeRepository = new ComposeRepositoryImpl()
    ComposeService composeService = new ComposeService(composeRepository)

    Compose getByNcas(String ncas) {
        return composeService.getByNcas(ncas)
    }

}
