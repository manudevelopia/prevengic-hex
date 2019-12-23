package info.developia.prevengic.service

import info.developia.prevengic.exception.ComposeNotFoundException
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository

class ComposeServiceImpl implements ComposeService {

    final ComposeRepository composeRepository

    ComposeServiceImpl(ComposeRepository composeRepository) {
        this.composeRepository = composeRepository
    }

    @Override
    Compose getByNcas(String ncas) {
        return composeRepository.getByNcas(ncas)
                .orElseThrow({ new ComposeNotFoundException() })
    }

    @Override
    List<Compose> getAll() {
        return composeRepository.getAll()
    }

    @Override
    int save(Compose compose) {
        return composeRepository.save(compose)
    }
}
