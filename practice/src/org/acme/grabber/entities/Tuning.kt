package org.acme.grabber.entities

import org.acme.grabber.entities.Note.*

enum class Tuning constructor(val noteList: List<Note>) {

    STANDARD(listOf<Note>(E, B, G, D, A, E)),
    STANDARD_D(listOf<Note>(D, A, F, C, G, D)),
    DROP_D(listOf<Note>(E, B, G, D, A, D)),
    DROP_C_SHARP(listOf<Note>(Ds, As, Fs, Cs, Gs, Cs)),
    DROP_C(listOf<Note>(D, A, F, C, G, C))
}

