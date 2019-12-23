package info.developia.prevengic.repository

import info.developia.prevengic.model.Compose

interface ComposeRepository {

    Optional<Compose> getByNcas(String ncas)
    List<Compose> getAll()
    
}
