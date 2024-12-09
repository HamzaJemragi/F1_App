package com.hamza.f1app.data

import com.hamza.f1app.R
import com.hamza.f1app.models.*

val circuits = listOf(
    Circuit(
        "Bahrain International Circuit",
        5.312,
        308.238,
        57,
        mapOf("Time" to "1:31.447", "Driver" to "Pedro de la Rosa", "Year" to 2005),
        2004,
        R.drawable.circuit_bahrain
    ), Circuit(
        "Jeddah Corniche Circuit",
        6.174,
        308.45,
        50,
        mapOf("Time" to "1:30.734", "Driver" to "Lewis Hamilton", "Year" to 2021),
        2021,
        R.drawable.circuit_saudi
    ), Circuit(
        "Albert Park Grand Prix Circuit",
        5.278,
        306.124,
        58,
        mapOf("Time" to "1:19.813", "Driver" to "Charles Leclerc", "Year" to 2024),
        1996,
        R.drawable.circuit_australia
    ), Circuit(
        "Suzaka Circuit",
        5.807,
        307.471,
        57,
        mapOf("Time" to "1:30.983", "Driver" to "Lewis Hamilton", "Year" to 2019),
        1987,
        R.drawable.circuit_japan
    ), Circuit(
        "Shanghai International Circuit",
        5.451,
        305.066,
        56,
        mapOf("Time" to "1:32.238", "Driver" to "Michael Schumacher", "Year" to 2004),
        2004,
        R.drawable.circuit_china
    ), Circuit(
        "Miami International Circuit",
        5.412,
        308.326,
        57,
        mapOf("Time" to "1:29.708", "Driver" to "Max Verstappen", "Year" to 2023),
        2022,
        R.drawable.circuit_miami
    ), Circuit(
        "Autodromo Internationale Enzo e Dino Ferrari",
        4.909,
        309.049,
        63,
        mapOf("Time" to "1:15.484", "Driver" to "Lewis Hamilton", "Year" to 2020),
        1980,
        R.drawable.circuit_emiliaromagna
    ), Circuit(
        "Circuit de Monaco",
        3.337,
        260.286,
        78,
        mapOf("Time" to "1:12.909", "Driver" to "Lewis Hamilton", "Year" to 2021),
        1950,
        R.drawable.circuit_monaco
    ), Circuit(
        "Circuit Gilles-Villeneuve",
        4.361,
        305.27,
        70,
        mapOf("Time" to "1:13.078", "Driver" to "Valtteri Bottas", "Year" to 2019),
        1978,
        R.drawable.circuit_canada
    ), Circuit(
        "Circuit de Barcelona-Catalunya",
        4.657,
        307.236,
        66,
        mapOf("Time" to "1:16.330", "Driver" to "Max Verstappen", "Year" to 2023),
        1991,
        R.drawable.circuit_spain
    ), Circuit(
        "Red Bull Ring",
        4.318,
        306.452,
        71,
        mapOf("Time" to "1:05.619", "Driver" to "Carlos Sainz", "Year" to 2020),
        1970,
        R.drawable.circuit_austria
    ), Circuit(
        "Silverstone Circuit",
        5.891,
        306.198,
        52,
        mapOf("Time" to "1:27.097", "Driver" to "Max Verstappen", "Year" to 2020),
        1950,
        R.drawable.circuit_uk
    ), Circuit(
        "Hungaroring",
        4.381,
        306.63,
        70,
        mapOf("Time" to "1:16.627", "Driver" to "Lewis Hamilton", "Year" to 2020),
        1986,
        R.drawable.circuit_hungary
    ), Circuit(
        "Circuit de Spa-Francorchamps",
        7.004,
        308.052,
        44,
        mapOf("Time" to "1:44.701", "Driver" to "Sergio Pérez", "Year" to 2024),
        1950,
        R.drawable.circuit_belium
    ), Circuit(
        "Circuit Zandvoort",
        4.259,
        306.587,
        72,
        mapOf("Time" to "1:11.097", "Driver" to "Lewis Hamilton", "Year" to 2021),
        1952,
        R.drawable.circuit_netherlands
    ), Circuit(
        "Autodromo Nazionale di Monza",
        5.793,
        306.72,
        53,
        mapOf("Time" to "1:21.046", "Driver" to "Rubens Barrichello", "Year" to 2004),
        1950,
        R.drawable.circuit_italy
    ), Circuit(
        "Baku City Circuit",
        6.003,
        306.049,
        57,
        mapOf("Time" to "1:43.009", "Driver" to "Charles Leclerc", "Year" to 2019),
        2016,
        R.drawable.circuit_azerbijan
    ), Circuit(
        "Marina Bay Street Circuit",
        4.94,
        306.143,
        62,
        mapOf("Time" to "1:34.486", "Driver" to "Daniel Ricciardo", "Year" to 2024),
        2008,
        R.drawable.circuit_singapore
    ), Circuit(
        "Circuit of The Americas",
        5.513,
        308.405,
        56,
        mapOf("Time" to "1:36.169", "Driver" to "Charles Leclerc", "Year" to 2019),
        2012,
        R.drawable.circuit_us
    ), Circuit(
        "Autodromo Hermanos Rodríguez",
        4.304,
        305.354,
        71,
        mapOf("Time" to "1:17.774", "Driver" to "Valtteri Bottas", "Year" to 2021),
        1963,
        R.drawable.circuit_mexico
    ), Circuit(
        "Autodromo José Carlos Pace",
        4.309,
        305.879,
        71,
        mapOf("Time" to "1:10.540", "Driver" to "Valtteri Bottas", "Year" to 2018),
        1973,
        R.drawable.circuit_brazil
    ), Circuit(
        "Las Vegas Strip Circuit",
        6.201,
        309.958,
        50,
        mapOf("Time" to "1:34.876", "Driver" to "Lando Norris", "Year" to 2024),
        2023,
        R.drawable.circuit_lasvegas
    ), Circuit(
        "Lusall International Circuit",
        5.419,
        308.611,
        57,
        mapOf("Time" to "1:22.384", "Driver" to "Lando Norris", "Year" to 2024),
        2021,
        R.drawable.circuit_qatar
    ), Circuit(
        "Yas Marina Circuit",
        5.281,
        306.183,
        58,
        mapOf("Time" to "1:26.103", "Driver" to "Max Verstappen", "Year" to 2021),
        2009,
        R.drawable.circuit_abudhabi
    )
)

val races = listOf(
    Race(
        1,
        "GULF AIR BAHRAIN GRAND PRIX 2024",
        "29-02/FEV.-MARS",
        "14:00",
        "Bahrain",
        null,
        circuits[0],
        R.drawable.track_bahrain
    ), Race(
        2,
        "STC SAUDI ARABIA GRAND PRIX 2024",
        "07-09/MARS",
        "14:00",
        "Saudi Arabia",
        null,
        circuits[1],
        R.drawable.track_saudi
    ), Race(
        3,
        "ROLEX AUSTRALIAN GRAND PRIX 2024",
        "22-24/MARS",
        "14:00",
        "Australia",
        null,
        circuits[2],
        R.drawable.track_australia
    ), Race(
        4,
        "MSC CRUISES JAPANESE GRAND PRIX 2024",
        "05-07/AVR.",
        "14:00",
        "Japan",
        null,
        circuits[3],
        R.drawable.track_japan
    ), Race(
        5,
        "LENOVO CHINESE GRAND PRIX 2024",
        "19-21/AVR.",
        "14:00",
        "China",
        null,
        circuits[4],
        R.drawable.track_china
    ), Race(
        6,
        "CRYPTO.COM MIAMI GRAND PRIX 2024",
        "03-05/MAI",
        "14:00",
        "Miami",
        null,
        circuits[5],
        R.drawable.track_miami
    ), Race(
        7,
        "MSC CRUISES GRAN PREMIO DEL MADE IN ITALY EDELL'EMILIA-ROMAGNA 2024",
        "17-19/MAI",
        "14:00",
        "Emilia-Romagna",
        null,
        circuits[6],
        R.drawable.track_emiliaromagna
    ), Race(
        8,
        "GRAND PRIX DE MONACO 2024",
        "24-26/MAI",
        "14:00",
        "Monaco",
        null,
        circuits[7],
        R.drawable.track_monaco
    ), Race(
        9,
        "AWS GRAND PRIX DE CANADA 2024",
        "07-09/JUIN",
        "14:00",
        "Canada",
        null,
        circuits[8],
        R.drawable.track_canada
    ), Race(
        10,
        "ARAMCO GRAN PREMIO DE ESPAÑA 2024",
        "21-23/JUIN",
        "14:00",
        "Spain",
        null,
        circuits[9],
        R.drawable.track_spain
    ), Race(
        11,
        "QATAR AIRWAYS AUSTRIAN GRAND PRIX 2024",
        "28-30/JUIN",
        "14:00",
        "Austria",
        null,
        circuits[10],
        R.drawable.track_austria
    ), Race(
        12,
        "QATAR AIRWAYS BRITISH GRAND PRIX 2024",
        "05-07/JUIL.",
        "14:00",
        "Great Britain",
        null,
        circuits[11],
        R.drawable.track_uk
    ), Race(
        13,
        "HUNGARIAN GRAND PRIX 2024",
        "19-21/JUIL.",
        "14:00",
        "Hungary",
        null,
        circuits[12],
        R.drawable.track_hungary
    ), Race(
        14,
        "ROLEX BELGIUM GRAND PRIX 2024",
        "26-28/JUIL.",
        "14:00",
        "Belgium",
        null,
        circuits[13],
        R.drawable.track_belgium
    ), Race(
        15,
        "HEIKEKEN DUTCH GRAND PRIX 2024",
        "23-25/AOUT",
        "14:00",
        "Netherlands",
        null,
        circuits[14],
        R.drawable.track_netherlands
    ), Race(
        16,
        "PIRELLI GRAN PREMIO D'ITALIA 2024",
        "30-01/AOUT-SEPT.",
        "14:00",
        "Italy",
        null,
        circuits[15],
        R.drawable.track_italy
    ), Race(
        17,
        "QATAR AIRWAYS AZERBAIJAN GRAND PRIX 2024",
        "13-15/SEPT.",
        "14:00",
        "Azerbaijan",
        null,
        circuits[16],
        R.drawable.track_azerbijan
    ), Race(
        18,
        "SINGAPORE AIRLINES SINGAPORE GRAND PRIX 2024",
        "20-22/SEPT.",
        "14:00",
        "Singapore",
        null,
        circuits[17],
        R.drawable.track_singapour
    ), Race(
        19,
        "PIRELLI UNITED STATES GRAND PRIX 2024",
        "18-20/OCT.",
        "14:00",
        "United States",
        null,
        circuits[18],
        R.drawable.track_us
    ), Race(
        20,
        "GRAN PREMIO DE LA CIUDAD DE MEXICO 2024",
        "25-27/OCT.",
        "14:00",
        "Mexico",
        null,
        circuits[19],
        R.drawable.track_mexico
    ), Race(
        21,
        "LENOVO GRANDE PREMIO DE SAO PAULO 2024",
        "01-03/NOV.",
        "14:00",
        "Brazil",
        null,
        circuits[20],
        R.drawable.track_brazil
    ), Race(
        22,
        "HEINEKEN SILVER LAS VEGAS GRAND PRIX 2024",
        "21-23/NOV.",
        "14:00",
        "Las Vegas",
        null,
        circuits[21],
        R.drawable.track_lasvegas
    ), Race(
        23,
        "QATAR AIRWAYS QATAR GRAND PRIX 2024",
        "29-01/NOV.-DEC.",
        "14:00",
        "Qatar",
        null,
        circuits[22],
        R.drawable.track_qatar
    ), Race(
        24,
        "ETIHAD AIRWAYS ABU DHABI GRAND PRIX 2024",
        "06-08/DEC.",
        "14:00",
        "Abu Dhabi",
        null,
        circuits[23],
        R.drawable.track_abudhabi
    )
)