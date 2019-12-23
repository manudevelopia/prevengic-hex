package info.developia.prevengic

import info.developia.prevengic.mapper.ComposeMapper
import info.developia.prevengic.model.Compose
import info.developia.prevengic.repository.ComposeRepository

class ComposeRepositoryImpl implements ComposeRepository {

    PersistenceService persistenceService = new PersistenceService()

    @Override
    Optional<Compose> getByNcas(String ncas) {
        persistenceService.getSqlSession().getMapper(ComposeMapper).getByNcas(ncas)
    }

    @Override
    List<Compose> getAll() {
        persistenceService.getSqlSession().getMapper(ComposeMapper).getAll()
    }

    int save(Compose compose) {
        int result = persistenceService.getSqlSession().getMapper(ComposeMapper).save(compose)
        persistenceService.getSqlSession().commit()
        return result
    }
}
