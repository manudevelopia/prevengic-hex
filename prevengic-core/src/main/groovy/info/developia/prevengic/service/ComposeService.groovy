package info.developia.prevengic.service

import info.developia.prevengic.exception.ComposeNotFoundException
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository

class ComposeService {

    final ComposeRepository composeRepository

    ComposeService(ComposeRepository composeRepository) {
        this.composeRepository = composeRepository
    }

    Compose getByNcas(String ncas) {
        return composeRepository.getByNcas(ncas)
                .orElseThrow({ new ComposeNotFoundException() })
    }
}
