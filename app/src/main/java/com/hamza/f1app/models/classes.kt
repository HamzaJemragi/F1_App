package com.hamza.f1app.Models


data class Country(
    val nom: String,
    val flag: Int
)

data class Race(
    val id: Int,
    val nom: String,
    val date: String,
    val annee: Int,
    val time: String,
    val lieu: String,
    val resultats: List<Resultat>?,
    val circuit: Circuit,
    val track: Int,
)

data class Circuit(
    val nom: String,
    val length: Double,
    val distance: Double,
    val laps: Int,
    val LapRecord: Map<String, Any>,
    val firstGP: Int,
    val Image: Int,
    val country: Country,
    val race: Int
)

data class Resultat(
    val position: Any,
    val pilote: Driver,
    val temps: String,
    val points: Int,
)

data class Driver(
    val id: Int,
    val firsName: String,
    val lastName: String,
    var equipe: Int,
    val nationalite: String,
    var points: Int,
    var podiums: Int,
    var fastestLap: Int,
    var worldChampionships: Long,
    var GPsEntered: Int,
    val birthPlace: String,
    val birthDate: String,
    var driverImage1: Int,
    var driverImage2: Int,
    var driverNumber: Int,
    var flag: Int,
    var retiredOrNot: Boolean,
    var currentPoints: Int,
    )

data class Constructor(
    val id: Int,
    var nom: String,
    var logo: Int,
    val firstEntry: Int,
    var chassis: String,
    var powerUnit: String,
    var teamChief: String,
    val nationalite: String,
    var points: Int,
    var construcorColor: Int,
    var pilotes: List<Driver>,
    var carImage:Int,
    var polePositions:Int,
    var constructorChampionships:Int
)













