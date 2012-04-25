package org.acme.groovy

class Song {
	
	def name
	String artist
	def genre
	
	String toString(){
		"${name}, ${artist}, ${genre}"
	}

}
