package org.acme.grabber.entities

class GuitarString(
        val note: Note,
        val size: StringSize,
        var tension: String = "") {

    override fun toString(): String {
        return String.format("%s - %s - %s", this.note, this.size, this.tension)
    }
}
