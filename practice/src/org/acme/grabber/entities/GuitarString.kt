package org.acme.grabber.entities

class GuitarString(
        val note: Note,
        val size: StringSize,
        var tension: String = "") {

    override fun toString() = "${note.value} - ${size.value} - $tension"
}
