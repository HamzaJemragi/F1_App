package com.hamza.f1app.data

import com.hamza.f1app.Models.Circuit
import com.hamza.f1app.Models.Constructor
import com.hamza.f1app.Models.Driver
import com.hamza.f1app.Models.Race
import com.hamza.f1app.Models.Resultat
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

val constructors = mutableListOf<Constructor>()
var drivers = mutableListOf<Driver>()

fun main() {
    drivers.addAll(
        listOf(
            Driver(
                1,
                "Alexander",
                "Albon",
                constructors[7],
                "Thailand",
                24,
                0,
                0,
                0,
                240,
                "London, England",
                "23-03-1996",
                R.drawable.driver_alexanderalbon_1,
                R.drawable.driver_alexanderalbon_2,
                23,
                R.drawable.flag_thailand
            ), Driver(
                2,
                "Carlos",
                "Sainz",
                constructors[1],
                "Spain",
                818,
                16,
                0,
                0,
                170,
                "Madrid, Spain",
                "01-09-1994",
                R.drawable.driver_carlossainz_1,
                R.drawable.driver_carlossainz_2,
                55,
                R.drawable.flag_spain
            ), Driver(
                3,
                "Charles",
                "Leclerc",
                constructors[1],
                "Monaco",
                1040,
                25,
                18,
                0,
                110,
                "Monte Carlo, Monaco",
                "16-10-1997",
                R.drawable.driver_charlesleclerc_1,
                R.drawable.driver_charlesleclerc_2,
                16,
                R.drawable.flag_monaco
            ), Driver(
                4,
                "Esteban",
                "Ocon",
                constructors[3],
                "France",
                372,
                2,
                0,
                0,
                134,
                "Évreux, France",
                "17-09-1996",
                R.drawable.driver_estebanocon_1,
                R.drawable.driver_estebanocon_2,
                31,
                R.drawable.flag_france
            ), Driver(
                5,
                "Fernando",
                "Alonso",
                constructors[5],
                "Spain",
                2100,
                105,
                22,
                2,
                370,
                "Oviedo, Spain",
                "29-07-1981",
                R.drawable.driver_fernandoalonso_1,
                R.drawable.driver_fernandoalonso_2,
                14,
                R.drawable.flag_spain
            ), Driver(
                6,
                "Franco",
                "Colapinto",
                constructors[0],
                "Argentina",
                0,
                0,
                0,
                0,
                0,
                "Pilar, Argentina",
                "27-05-2003",
                R.drawable.driver_francocolapinto_1,
                R.drawable.driver_francocolapinto_2,
                43,
                R.drawable.flag_argentina
            ), Driver(
                7,
                "George",
                "Russell",
                constructors[2],
                "United Kingdom",
                539,
                10,
                1,
                0,
                95,
                "King's Lynn, England",
                "15-02-1998",
                R.drawable.driver_georgerussell_1,
                R.drawable.driver_georgerussell_2,
                63,
                R.drawable.flag_uk
            ), Driver(
                8,
                "Kevin",
                "Magnussen",
                constructors[6],
                "Denmark",
                183,
                1,
                0,
                0,
                160,
                "Roskilde, Denmark",
                "05-10-1992",
                R.drawable.driver_kevinmagnussen_1,
                R.drawable.driver_kevinmagnussen_2,
                20,
                R.drawable.flag_denmark
            ), Driver(
                9,
                "Lance",
                "Stroll",
                constructors[5],
                "Canada",
                232,
                3,
                1,
                0,
                143,
                "Montreal, Canada",
                "29-10-1998",
                R.drawable.driver_lancestroll_1,
                R.drawable.driver_lancestroll_2,
                18,
                R.drawable.flag_canada
            ), Driver(
                10,
                "Lando",
                "Norris",
                constructors[4],
                "United Kingdom",
                532,
                11,
                1,
                0,
                100,
                "Bristol, England",
                "13-11-1999",
                R.drawable.driver_landonorris_1,
                R.drawable.driver_landonorris_2,
                4,
                R.drawable.flag_uk
            ), Driver(
                11,
                "Lewis",
                "Hamilton",
                constructors[2],
                "United Kingdom",
                4400,
                195,
                104,
                7,
                320,
                "Stevenage, England",
                "07-01-1985",
                R.drawable.driver_lewishamilton_1,
                R.drawable.driver_lewishamilton_2,
                44,
                R.drawable.flag_uk
            ), Driver(
                12,
                "Liam",
                "Lawson",
                constructors[8],
                "New Zealand",
                2,
                0,
                0,
                0,
                5,
                "Hastings, New Zealand",
                "11-02-2002",
                R.drawable.driver_liamlawson_1,
                R.drawable.driver_liamlawson_2,
                30,
                R.drawable.flag_newzealand
            ), Driver(
                13,
                "Max",
                "Verstappen",
                constructors[0],
                "Netherlands",
                2500,
                100,
                30,
                3,
                180,
                "Hasselt, Belgium",
                "30-09-1997",
                R.drawable.driver_maxverstappen_1,
                R.drawable.driver_maxverstappen_2,
                1,
                R.drawable.flag_netherlands
            ), Driver(
                14,
                "Nico",
                "Hülkenberg",
                constructors[6],
                "Germany",
                523,
                0,
                1,
                0,
                195,
                "Emmerich am Rhein, Germany",
                "19-08-1987",
                R.drawable.driver_nicohulkenberg_1,
                R.drawable.driver_nicohulkenberg_2,
                27,
                R.drawable.flag_germany
            ), Driver(
                15,
                "Oscar",
                "Piastri",
                constructors[4],
                "Australia",
                97,
                1,
                0,
                0,
                23,
                "Melbourne, Australia",
                "06-04-2001",
                R.drawable.driver_oscarpiastri_1,
                R.drawable.driver_oscarpiastri_2,
                81,
                R.drawable.flag_australia
            ), Driver(
                16,
                "Pierre",
                "Gasly",
                constructors[3],
                "France",
                342,
                3,
                1,
                0,
                123,
                "Rouen, France",
                "07-02-1996",
                R.drawable.driver_pierregasly_1,
                R.drawable.driver_pierregasly_2,
                10,
                R.drawable.flag_france
            ), Driver(
                17,
                "Sergio",
                "Perez",
                constructors[0],
                "Mexico",
                1500,
                35,
                2,
                0,
                245,
                "Guadalajara, Mexico",
                "26-01-1990",
                R.drawable.driver_sergioperez_1,
                R.drawable.driver_sergioperez_2,
                11,
                R.drawable.flag_mexico
            ), Driver(
                18,
                "Valtteri",
                "Bottas",
                constructors[9],
                "Finland",
                1800,
                67,
                20,
                0,
                200,
                "Nastola, Finland",
                "28-08-1989",
                R.drawable.driver_valtteribottas_1,
                R.drawable.driver_valtteribottas_2,
                77,
                R.drawable.flag_finland
            ), Driver(
                19,
                "Yuki",
                "Tsunoda",
                constructors[8],
                "Japan",
                53,
                0,
                0,
                0,
                65,
                "Sagamihara, Japan",
                "11-05-2000",
                R.drawable.driver_yukitsunoda_1,
                R.drawable.driver_yukitsunoda_2,
                22,
                R.drawable.flag_japan
            ), Driver(
                20,
                "Guanyu",
                "Zhou",
                constructors[9],
                "China",
                20,
                0,
                0,
                0,
                45,
                "Shanghai, China",
                "30-05-1999",
                R.drawable.driver_zhouguanyu_1,
                R.drawable.driver_zhouguanyu_2,
                24,
                R.drawable.flag_china
            )
        )
    )

    constructors.addAll(
        listOf(
            Constructor(
                1,
                "Red Bull Racing",
                R.drawable.constructor_redbullrecing,
                2005,
                "RB19",
                "Honda RBPT",
                "Christian Horner",
                "Austria",
                700,
                R.color.redbullracingColor,
                listOf(drivers[12], drivers[16]),
                R.drawable.car_redbullracing
            ), Constructor(
                2,
                "Ferrari",
                R.drawable.constructor_ferrari,
                1950,
                "SF-24",
                "Ferrari",
                "Fred Vasseur",
                "Italy",
                600,
                R.color.ferrariColor,
                listOf(drivers[1], drivers[2]),
                R.drawable.car_ferrari
            ), Constructor(
                3,
                "Mercedes",
                R.drawable.constructor_mercedes,
                1954,
                "W15",
                "Mercedes",
                "Toto Wolff",
                "Germany",
                550,
                R.color.mercedesColor,
                listOf(drivers[10], drivers[6]),
                R.drawable.car_mercedes
            ), Constructor(
                4,
                "Alpine",
                R.drawable.constructor_alpine,
                2021,
                "A524",
                "Renault",
                "Bruno Famin",
                "France",
                180,
                R.color.alpineColor,
                listOf(drivers[3], drivers[15]),
                R.drawable.car_alpine
            ), Constructor(
                5,
                "McLaren",
                R.drawable.constructor_mclaren,
                1966,
                "MCL61",
                "Mercedes",
                "Andrea Stella",
                "United Kingdom",
                250,
                R.color.mclarenColor,
                listOf(drivers[9], drivers[14]),
                R.drawable.car_mclaren
            ), Constructor(
                6,
                "Aston Martin",
                R.drawable.constructor_astonmartin,
                2021,
                "AMR24",
                "Mercedes",
                "Mike Krack",
                "United Kingdom",
                200,
                R.color.astonmartinColor,
                listOf(drivers[4], drivers[8]),
                R.drawable.car_astonmartin
            ), Constructor(
                7,
                "Haas",
                R.drawable.constuctor_haas,
                2016,
                "VF-24",
                "Ferrari",
                "Guenther Steiner",
                "United States",
                80,
                R.color.haasColor,
                listOf(drivers[7], drivers[13]),
                R.drawable.car_haas
            ), Constructor(
                8,
                "Williams",
                R.drawable.constuctor_williams,
                1977,
                "FW46",
                "Mercedes",
                "James Vowles",
                "United Kingdom",
                60,
                R.color.williamsColor,
                listOf(drivers[0], drivers[5]),
                R.drawable.car_williams
            ), Constructor(
                9,
                "Kick Sauber",
                R.drawable.constuctor_kicksauber,
                1993,
                "C44",
                "Ferrari",
                "Alessandro Alunni Bravi",
                "Switzerland",
                45,
                R.color.kicksauberColor,
                listOf(drivers[19], drivers[17]),
                R.drawable.car_kicksauber
            ), Constructor(
                10,
                "RB",
                R.drawable.constuctor_rb,
                1985,
                "VCARB 02",
                "Honda RBPT",
                "Laurent Mekies",
                "Italy",
                35,
                R.color.rbColor,
                listOf(drivers[11], drivers[18]),
                R.drawable.car_rb
            )
        )
    )
}


val resultats = listOf(
    listOf(
        Resultat(1, drivers[12], "1:31:44.742", 26),
        Resultat(2, drivers[16], "+22.457s", 18)
    )
)