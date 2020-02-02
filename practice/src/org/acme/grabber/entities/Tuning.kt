package org.acme.grabber.entities

import org.acme.grabber.entities.Note.*

enum class Tuning(val noteList: List<Note>) {

    STANDARD(listOf(E, B, G, D, A, E)),
    STANDARD_D(listOf(D, A, F, C, G, D)),
    DROP_D(listOf(E, B, G, D, A, D)),
    DROP_C_SHARP(listOf(Ds, As, Fs, Cs, Gs, Cs)),
    DROP_C(listOf(D, A, F, C, G, C))
}

