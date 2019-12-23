package info.developia.prevengic

import info.developia.prevengic.controller.ComposeController

class App {
    static void main(String[] args) {
        println new ComposeController().getByNcas("0123456789")
    }
}
