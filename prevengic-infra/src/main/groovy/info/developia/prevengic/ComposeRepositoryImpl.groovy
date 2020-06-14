package info.developia.prevengic

import info.developia.prevengic.mapper.ComposeMapper
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository

class ComposeRepositoryImpl implements ComposeRepository {

    ComposeMapper composeMapper

    ComposeRepositoryImpl(ComposeMapper composeMapper) {
        this.composeMapper = composeMapper
    }

    @Override
    List<Compose> getAll() {
        composeMapper.getAll()
    }

    @Override
    Optional<Compose> getByNcas(String ncas) {
        composeMapper.getByNcas(ncas)
    }

    @Override
    Optional<Compose> getByNce(String nce) {
        composeMapper.getByNce(nce)
    }

    @Override
    Optional<Compose> getByName(String name) {
        composeMapper.getByName(name)
    }
}
