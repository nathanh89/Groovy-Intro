package org.thirdparty.lib
import org.acme.groovy.Song

class SongExample {
    static void main(args){
        def sng = new Song(name:"Le Freak", artist:"Chic", genre:"Disco")
        
        def sng2 = new Song()
        sng2.name = "Funkytown"
        sng2.setGenre("Disco")
		
		def sng3 = new Song(name:"Meaning of Life", artist:"Disturbed")
        
        assert sng2.genre == "DISCO"
        assert sng2.getName() == "Funkytown"
        
        println sng2.artist?.toUpperCase()
		println sng3
		
    }

}