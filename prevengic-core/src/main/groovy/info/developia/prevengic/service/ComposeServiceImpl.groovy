package info.developia.prevengic.service

import info.developia.prevengic.exception.ComposeNotFoundException
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository

class ComposeServiceImpl implements ComposeService {

    final ComposeRepository composeRepository

    @Override
    List<Compose> getAll() {
        return composeRepository.getAll()
    }

    ComposeServiceImpl(ComposeRepository composeRepository) {
        this.composeRepository = composeRepository
    }

    @Override
    Compose getByNcas(String ncas) {
        return composeRepository.getByNcas(ncas)
                .orElseThrow({ new ComposeNotFoundException() })
    }


    @Override
    Compose getByNce(String nce) {
        return composeRepository.getByNce(nce)
                .orElseThrow({ new ComposeNotFoundException() })
    }

    @Override
    Compose getByName(String name) {
        return composeRepository.getByName(name)
                .orElseThrow({ new ComposeNotFoundException() })
    }
}
