package info.developia.prevengic.service

import info.developia.prevengic.model.Compose

interface ComposeService {

    List<Compose> getAll()
    Compose getByNcas(String ncas)
    Compose getByNce(String nce)
    Compose getByName(String name)
}
