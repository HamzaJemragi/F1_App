package com.hamza.f1app.Models

import java.util.Date

data class Race(
    val id: Int,
    val nom: String,
    val date: Date,
    val lieu: String,
    val resultats: List<Résultat>?,
    val circuit: Circuit,
    val info: Map<String, Any>,
)

data class Circuit(
    val nom: String,
    val length: Double,
    val distance: Double,
    val laps: Int,
    val LapRecord: String,
    val firstGP: Int,
)

data class Résultat(
    val pilote: Driver,
    val position: Int,
    val temps: String,
    val détails: String,
)

data class Driver(
    val id: Int,
    val nom: String,
    val équipe: Constructor,
    val nationalite: String,
    val points: Int,
    val statistiques: List<Map<String, Int>>,
)

data class Constructor(
    val id: Int,
    val nom: String,
    val logo: Int,
    val nationalite: String,
    val points: Int,
    val historique: String,
    val pilotes: Driver,
)