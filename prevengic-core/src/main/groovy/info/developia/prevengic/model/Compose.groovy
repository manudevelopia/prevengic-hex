package info.developia.prevengic.model

import groovy.transform.Immutable

@Immutable
class Compose {

    String name
    String description
    String ncas
    String nce

    ChemicalProfile chemicalProfile
    List<Note> notes
}
