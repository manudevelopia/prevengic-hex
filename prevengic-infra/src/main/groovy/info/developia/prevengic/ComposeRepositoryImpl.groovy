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
    Optional<Compose> getByNcas(String ncas) {
        Optional.ofNullable(composeMapper.getByNcas(ncas))
    }

    @Override
    List<Compose> getAll() {
        composeMapper.getAll()
    }

    @Override
    int save(Compose compose) {
        composeMapper.save(compose)
    }

}
