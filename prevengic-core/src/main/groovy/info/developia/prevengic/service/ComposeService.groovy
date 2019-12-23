package info.developia.prevengic.service

import info.developia.prevengic.model.Compose

interface ComposeService {

    Compose getByNcas(String ncas)
    List<Compose> getAll()

}
