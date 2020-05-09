package org.acme.grabber.entities

import org.acme.grabber.entities.Note.*

enum class Tuning(val displayName: String, val notes: List<Note>) {

    STANDARD("Standard (6 string)", listOf(E, B, G, D, A, E)),
    STANDARD_D("Standard D (6 string)", listOf(D, A, F, C, G, D)),
    DROP_D("Drop D (6 string)", listOf(E, B, G, D, A, D)),
    DROP_C_SHARP("Drop C# (6 string)", listOf(Ds, As, Fs, Cs, Gs, Cs)),
    DROP_C("Drop C (6 string)", listOf(D, A, F, C, G, C)),
    DROP_A_6("Drop A (6 string)", listOf(B, G, D, A, E, A))
}

