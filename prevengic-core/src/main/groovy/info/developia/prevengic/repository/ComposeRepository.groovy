package info.developia.prevengic.repository

import info.developia.prevengic.model.Compose

interface ComposeRepository {
    List<Compose> getAll()
    Optional<Compose> getByNcas(String ncas)
    Optional<Compose> getByNce(String nce)
    Optional<Compose> getByName(String s)
}
