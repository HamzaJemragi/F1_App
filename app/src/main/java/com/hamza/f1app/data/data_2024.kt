package com.hamza.f1app.data

import com.hamza.f1app.Models.Circuit
import com.hamza.f1app.Models.Constructor
import com.hamza.f1app.Models.Driver
import com.hamza.f1app.Models.Race
import com.hamza.f1app.Models.Resultat
import com.hamza.f1app.R

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



var drivers = listOf(
        Driver(
            1,
            "Alexander",
            "Albon",
            8,
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
            23, R.drawable.flag_thailand,
            false,
            12
        ),
        Driver(
            2,
            "Carlos",
            "Sainz",
            2,
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
            55, R.drawable.flag_spain, false, 290
        ),
        Driver(
            3,
            "Charles",
            "Leclerc",
            2,
            "Monaco",
            1040,
            25,
            18,
            0,
            110,
            "Monte Carlo, Monaco",
            "16-10-1997",
            R.drawable.driver_charlesleclerc_1,
            R.drawable.driver_charlesleclerc_2, 16, R.drawable.flag_monaco, false, 356
        ),
        Driver(
            4,
            "Esteban",
            "Ocon",
            4,
            "France",
            372,
            2,
            0,
            0,
            134,
            "Évreux, France",
            "17-09-1996",
            R.drawable.driver_estebanocon_1,
            R.drawable.driver_estebanocon_2, 31, R.drawable.flag_france, false, 23
        ),
        Driver(
            5,
            "Fernando",
            "Alonso",
            6,
            "Spain",
            2100,
            105,
            22,
            2,
            370,
            "Oviedo, Spain",
            "29-07-1981",
            R.drawable.driver_fernandoalonso_1,
            R.drawable.driver_fernandoalonso_2, 14, R.drawable.flag_spain, false, 70
        ),
        Driver(
            6,
            "Franco",
            "Colapinto",
            8,
            "Argentina",
            0,
            0,
            0,
            0,
            0,
            "Pilar, Argentina",
            "27-05-2003",
            R.drawable.driver_francocolapinto_1,
            R.drawable.driver_francocolapinto_2, 43, R.drawable.flag_argentina, false, 5
        ),
        Driver(
            7,
            "George",
            "Russell",
            3,
            "United Kingdom",
            539,
            10,
            1,
            0,
            95,
            "King's Lynn, England",
            "15-02-1998",
            R.drawable.driver_georgerussell_1,
            R.drawable.driver_georgerussell_2, 63, R.drawable.flag_uk, false, 245
        ),
        Driver(
            8,
            "Kevin",
            "Magnussen",
            7,
            "Denmark",
            183,
            1,
            0,
            0,
            160,
            "Roskilde, Denmark",
            "05-10-1992",
            R.drawable.driver_kevinmagnussen_1,
            R.drawable.driver_kevinmagnussen_2, 20, R.drawable.flag_denmark, false, 16
        ),
        Driver(
            9,
            "Lance",
            "Stroll",
            6,
            "Canada",
            232,
            3,
            1,
            0,
            143,
            "Montreal, Canada",
            "29-10-1998",
            R.drawable.driver_lancestroll_1,
            R.drawable.driver_lancestroll_2, 18, R.drawable.flag_canada, false, 24
        ),
        Driver(
            10,
            "Lando",
            "Norris",
            5,
            "United Kingdom",
            532,
            11,
            1,
            0,
            100,
            "Bristol, England",
            "13-11-1999",
            R.drawable.driver_landonorris_1,
            R.drawable.driver_landonorris_2, 4, R.drawable.flag_uk, false, 374
        ),
        Driver(
            11,
            "Lewis",
            "Hamilton",
            3,
            "United Kingdom",
            4400,
            195,
            104,
            7,
            320,
            "Stevenage, England",
            "07-01-1985",
            R.drawable.driver_lewishamilton_1,
            R.drawable.driver_lewishamilton_2, 44, R.drawable.flag_uk, false, 223
        ),
        Driver(
            12,
            "Liam",
            "Lawson",
            10,
            "New Zealand",
            2,
            0,
            0,
            0,
            5,
            "Hastings, New Zealand",
            "11-02-2002",
            R.drawable.driver_liamlawson_1,
            R.drawable.driver_liamlawson_2, 30, R.drawable.flag_newzealand, false,4
        ),
        Driver(
            13,
            "Max",
            "Verstappen",
            1,
            "Netherlands",
            2500,
            100,
            30,
            3,
            180,
            "Hasselt, Belgium",
            "30-09-1997",
            R.drawable.driver_maxverstappen_1,
            R.drawable.driver_maxverstappen_2, 1, R.drawable.flag_netherlands, false,437
        ),
        Driver(
            14,
            "Nico",
            "Hülkenberg",
            7,
            "Germany",
            523,
            0,
            1,
            0,
            195,
            "Emmerich am Rhein, Germany",
            "19-08-1987",
            R.drawable.driver_nicohulkenberg_1,
            R.drawable.driver_nicohulkenberg_2, 27, R.drawable.flag_germany, false, 41
        ),
        Driver(
            15,
            "Oscar",
            "Piastri",
            5,
            "Australia",
            97,
            1,
            0,
            0,
            23,
            "Melbourne, Australia",
            "06-04-2001",
            R.drawable.driver_oscarpiastri_1,
            R.drawable.driver_oscarpiastri_2, 81, R.drawable.flag_australia, false, 292
        ),
        Driver(
            16,
            "Pierre",
            "Gasly",
            4,
            "France",
            342,
            3,
            1,
            0,
            123,
            "Rouen, France",
            "07-02-1996",
            R.drawable.driver_pierregasly_1,
            R.drawable.driver_pierregasly_2, 10, R.drawable.flag_france, false, 42
        ),
        Driver(
            17,
            "Sergio",
            "Perez",
            1,
            "Mexico",
            1500,
            35,
            2,
            0,
            245,
            "Guadalajara, Mexico",
            "26-01-1990",
            R.drawable.driver_sergioperez_1,
            R.drawable.driver_sergioperez_2, 11, R.drawable.flag_mexico, false, 152
        ),
        Driver(
            18,
            "Valtteri",
            "Bottas",
            9,
            "Finland",
            1800,
            67,
            20,
            0,
            200,
            "Nastola, Finland",
            "28-08-1989",
            R.drawable.driver_valtteribottas_1,
            R.drawable.driver_valtteribottas_2, 77, R.drawable.flag_finland, false, 0
        ),
        Driver(
            19,
            "Yuki",
            "Tsunoda",
            10,
            "Japan",
            53,
            0,
            0,
            0,
            65,
            "Sagamihara, Japan",
            "11-05-2000",
            R.drawable.driver_yukitsunoda_1,
            R.drawable.driver_yukitsunoda_2, 22, R.drawable.flag_japan, false, 30
        ),
        Driver(
            20,
            "Guanyu",
            "Zhou",
            9,
            "China",
            20,
            0,
            0,
            0,
            45,
            "Shanghai, China",
            "30-05-1999",
            R.drawable.driver_zhouguanyu_1,
            R.drawable.driver_zhouguanyu_2, 24, R.drawable.flag_china, false, 4
        ),
        Driver(
            21,
            "Daniel",
            "Riccardo",
            10,
            "",
            0,
            0,
            0,
            0,
            0,
            "",
            "",
            R.drawable.driver_danielriccardo_1,
            R.drawable.f1_logo,
            3,
            0,
            true, 12
        ),
        Driver(
            22,
            "Logan",
            "Sargeant",
            8,
            "",
            0,
            0,
            0,
            0,
            0,
            "",
            "",
            R.drawable.driver_logansargeant_1,
            R.drawable.f1_logo,
            2,
            0,
            true, 0
        ),
        Driver(
            23,
            "Jack",
            "Doohan",
            4,
            "",
            0,
            0,
            0,
            0,
            0,
            "",
            "",
            R.drawable.driver_jackdoohan_1,
            R.drawable.f1_logo,
            61,
            0,
            true, 0
        ),
        Driver(
            24,
            "Oliver",
            "Bearman",
            7,
            "",
            0,
            0,
            0,
            0,
            0,
            "",
            "",
            R.drawable.driver_oliverbearman_1,
            R.drawable.f1_logo,
            55,
            0,
            true, 7
        ),
    )

val constructors = listOf(
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
                R.drawable.car_redbullracing, 103,6
            ),
            Constructor(
                2, "Ferrari", R.drawable.constructor_ferrari, 1950, "SF-24", "Ferrari",
                "Fred Vasseur", "Italy", 600, R.color.ferrariColor,
                listOf(drivers[1], drivers[2]), R.drawable.car_ferrari, 253, 16
            ),
            Constructor(
                3, "Mercedes", R.drawable.constructor_mercedes, 1954, "W15", "Mercedes",
                "Toto Wolff", "Germany", 550, R.color.mercedesColor,
                listOf(drivers[10], drivers[6]), R.drawable.car_mercedes, 133,8
            ),
            Constructor(
                4, "Alpine", R.drawable.constructor_alpine, 2021, "A524", "Renault",
                "Bruno Famin", "France", 180, R.color.alpineColor,
                listOf(drivers[3], drivers[15]), R.drawable.car_alpine,20, 2
            ),
            Constructor(
                5, "McLaren", R.drawable.constructor_mclaren, 1966, "MCL61", "Mercedes",
                "Andrea Stella", "United Kingdom", 250, R.color.mclarenColor,
                listOf(drivers[9], drivers[14]), R.drawable.car_mclaren, 164,9
            ),
            Constructor(
                6, "Aston Martin", R.drawable.constructor_astonmartin, 2021, "AMR24", "Mercedes",
                "Mike Krack", "United Kingdom", 200, R.color.astonmartinColor,
                listOf(drivers[4], drivers[8]), R.drawable.car_astonmartin, 1 ,0
            ),
            Constructor(
                7, "Haas", R.drawable.constuctor_haas, 2016, "VF-24", "Ferrari",
                "Guenther Steiner", "United States", 80, R.color.haasColor,
                listOf(drivers[7], drivers[13]), R.drawable.car_haas,1,0
            ),
            Constructor(
                8, "Williams", R.drawable.constuctor_williams, 1977, "FW46", "Mercedes",
                "James Vowles", "United Kingdom", 60, R.color.williamsColor,
                listOf(drivers[0], drivers[5]), R.drawable.car_williams, 128, 9
            ),
            Constructor(
                9, "Kick Sauber", R.drawable.constuctor_kicksauber, 1993, "C44", "Ferrari",
                "Alessandro Alunni Bravi", "Switzerland", 45, R.color.kicksauberColor,
                listOf(drivers[19], drivers[17]), R.drawable.car_kicksauber,1 ,0
            ),
            Constructor(
                10, "RB", R.drawable.constuctor_rb, 1985, "VCARB 02", "Honda RBPT",
                "Laurent Mekies", "Italy", 35, R.color.rbColor,
                listOf(drivers[11], drivers[18]), R.drawable.car_rb,1 ,0
            )
        )




val Bio = mapOf<Int, String>(
    1 to "Born in London but racing under the flag of Thailand, Alexander Albon’s first word was in fact Italian. That word was Ferrari – though it was with another Italian team that he got his big F1 break.\n" +
            "\n" +
            "Idolising Michael Schumacher and dreaming of one day racing in Formula 1, the junior Albon was pipped to the 2016 GP3 title by a certain Charles Leclerc. He then left his great friendship with George Russell trackside as he took the 2018 Formula 2 title fight down to the wire.\n" +
            "\n" +
            "Graduating to the F1 big league along with yet another contemporary – Lando Norris – in 2019, Albon did his talking on track with Toro Rosso in the opening races, earning a mid-season promotion to Red Bull Racing.\n" +
            "\n" +
            "A stylish overtaker with a championship mentality, Albon was unfazed by partnering Max Verstappen for the second half of his rookie season, taking top-six finishes in eight of his nine 2019 races with Red Bull.\n" +
            "\n" +
            "Staying in touch with the future champion proved tougher in 2020 and Red Bull dropped him from their race line-up. Crucially, though, Albon was retained as test and reserve driver, keeping him very much on team bosses’ radar, leading to his 2022 return to the grid with Williams, where he has established a reputation as a fast qualifier and mature racer.\n" +
            "\n" +
            "Laidback and cheerful with a cheeky grin, the Thai driver is popular among his peers – not always easy in motorsport’s cauldron of competition – but you don’t succeed in Formula 1 by being popular. Albon’s challenge remains a big one – to make the most of a rare second F1 opportunity.",
    2 to "He’s the matador from Madrid racing royalty.\n" +
            "\n" +
            "After entering F1’s Bull Ring paired alongside Max Verstappen at Toro Rosso in 2015, Sainz quickly showed his fighting spirit. A tenacious racer, he puts the car on the edge as he hustles his way through the pack. No wonder Sainz has earned the nickname Chilli.\n" +
            "\n" +
            "But the Spaniard is intelligent as well as instinctive, thinking his way through a race and into the points. This calm temperament follows him off track where he remains unfazed by the pressures of forging a Grand Prix career with a famous name.\n" +
            "\n" +
            "Sainz is the son of double World Rally champion, also his namesake, and has brought some of Dad’s driving skills to the F1 circuit – junior loves a delicious dose of drift for one.\n" +
            "\n" +
            "After following in his famous father’s tyre tracks, Sainz has had big racing boots to fill – first at McLaren where he replaced his childhood hero Fernando Alonso, and now at Ferrari, in the seat formerly owned by Sebastian Vettel.\n" +
            "\n" +
            "It is never easy living in the shadow of sporting giants, but Sainz has shown the drive and disposition to deal with it - he has scored a Grand Prix victory in both his Scuderia seasons to date. Vamos!",
    3 to "Born in the Mediterranean idyll of Monaco, Leclerc arrived in F1 on a tidal wave of expectation.\n" +
            "\n" +
            "Practically peerless on his way to the GP3 and Formula 2 crowns, he showcased a dazzling array of skills from scorching pole positions, commanding victories – even when his car caught fire twice at Silverstone – to an ability to muscle his way through the pack. Winning back-to-back championships also taught Leclerc how to handle pressure, another useful tool in the big pond of Formula 1 racing.\n" +
            "\n" +
            "Stepping up to F1 in 2018, Leclerc showed flashes of ballistic pace on Saturdays and racing brilliance on Sundays, dragging his Sauber beyond its limits – and earning himself a money-can’t-buy race seat at Ferrari for 2019, stepping into the shoes of the Scuderia’s last world champion, Kimi Raikkonen.\n" +
            "\n" +
            "There he immediately put the cat among the proverbial pigeons, unafraid to go wheel-to-wheel with established number one, Sebastian Vettel. A maiden F1 victory at Spa was followed by another a week later on Ferrari’s hallowed home turf of Monza. The tifosi had found another new hero – who then became the first man to out-score Vettel over a season with the Scuderia, a feat he repeated in crushing fashion the following year.\n" +
            "\n" +
            "The 2020 and ’21 seasons bore little fruit for Ferrari, but Leclerc maintained his resolve to emerge a true title contender in 2022. With three wins, 11 podiums and nine pole positions, he was the only man able to consistently take the fight to champion Max Verstappen - a feat he and the Scuderia were sadly unable to repeat in 2023.\n" +
            "\n" +
            "Out of the car, Leclerc is modest and thoughtful - but then he is on his own very personal mission. This exciting young talent is racing for his late father Herve and his friend and mentor Jules Bianchi, the F1 driver who died in 2015.\n" +
            "\n" +
            "On the evidence so far, he is doing them both proud.",
    4 to "If there’s one word that dominates Esteban Ocon’s career, it’s ‘sacrifice’.\n" +
            "\n" +
            "Back when he was just a promising karter, Ocon’s parents sold their house, put their jobs on hold, and began a life on the road, living in a caravan and travelling from circuit to circuit to support their son’s burgeoning career.\n" +
            "\n" +
            "Sacrifice, see – but it worked. 2014 saw Ocon break through in the world of single-seaters, as he beat a certain Max Verstappen to the European F3 title. Backed by Mercedes, he won the GP3 title the following year and was halfway through a season of DTM in 2016 when he was offered the chance to replace Rio Haryanto at the minnow Manor team from the Belgian Grand Prix onwards.\n" +
            "\n" +
            "That opportunity led to a full-time seat the following year with Force India, where his wheel-to-wheel duels with highly-rated team mate Sergio Perez quickly marked him out as a rising star. But when Lawrence Stroll, father of racer Lance, stepped in midway through 2018 to secure the squad’s financial future, the writing was on the wall for Ocon, who was moved aside at the end of the year to allow Stroll Jnr to join from Williams.\n" +
            "\n" +
            "Ocon bided his time, though, and after a year on the sidelines as Mercedes’ reserve driver, he found his way back into a race seat for 2020 with Renault, who became Alpine for 2021 – when his wait finally paid off, as he scored his – and the famous French marque’s – first F1 win.\n" +
            "\n" +
            "Nothing in Ocon’s motorsport career has come easy – but if Ocon has managed to return to the F1 grid and step atop the podium, it’s through a combination of self-belief, determination and a talent that’s up there with the very best.",
    5 to "Michael Schumacher was the undisputed king of Formula 1 in the early 2000s, picking up wins and championships at a rate that was simply unheard of at the time. It was going to take someone very special to topple the Ferrari legend from his throne – and that it was Fernando Alonso who did it, tells you all you need to know about the Spaniard.\n" +
            "\n" +
            "Fiercely competitive, Alonso is not shy about his talent, rating himself as 9/10 “in everything”, and few in the know would disagree, with his performances in F1 characterised by blistering speed, brilliant tactical thinking, exemplary race craft, a razor-sharp eye for detail and a relentless determination to win.\n" +
            "\n" +
            "A serial record breaker in his early days, he was – at one time – F1’s youngest polesitter, race winner, world champion and double world champion as he gobbled up success with the Renault team. Even Alonso couldn’t continue that amazing run in his later career though, failing to add another title to his collection despite spells at McLaren and Ferrari.\n" +
            "\n" +
            "But after two years away from Formula 1 racing – and with two Le Mans wins in his pocket – Alonso returned with Alpine in 2021. His speed and determination undiminished, he was back on the podium that year, but frustrated by poor reliability – and the lack of a long-term contract – the following season, he opted to jump ship once more.\n" +
            "\n" +
            "And after eight podiums in his first season with Aston Martin, Alonso now hopes it will be with the team in green that he finally returns to winning ways, as he has unfinished business with F1…",
    6 to "At the end of August, Williams announced that their academy driver and F2 racer Franco Colapinto will contest the remainder of the 2024 season with the squad, replacing Logan Sargeant as Alex Albon’s team mate from the Italian Grand Prix.\n" +
            "\n" +
            "Colapinto joined the Williams Racing Driver Academy in early 2023 and made his FP1 debut with the F1 team at this year’s British Grand Prix – giving him an initial taste of the FW46.\n" +
            "\n" +
            "A race winner in an array of categories on the junior single-seater scene, the 21-year-old had been contesting his second season in the F2 feeder championship, holding sixth in the 2024 standings with a race win and two second-place finishes to his name.\n" +
            "\n" +
            "He is the first Argentine driver in F1 for 23 years, after Gaston Mazzacane’s last appearances for Prost back in 2001, and only the second Argentine to drive for Williams, following on from his countryman Carlos Reutemann.",
    7 to "He’s the driver with the motto: “If in doubt, go flat out”.\n" +
            "\n" +
            "George Russell has lived by it throughout his F1 career to date, out-qualifying seasoned team mate Robert Kubica at all 21 Grands Prix in his rookie season, putting Williams back on the podium in 2021, and landing his first race win with Mercedes in 2022.\n" +
            "\n" +
            "That brilliant baseline speed served Russell well as he totted up titles on his way to Formula 1. The Briton stormed to the 2017 GP3 championship and delivered the 2018 Formula 2 crown under immense pressure.\n" +
            "\n" +
            "Spotting his potential, world champions Mercedes swooped to sign him to their junior programme in 2017, when Russell already had a DTM deal on the table. He banked more experience with practice sessions with Force India and tests for the Silver Arrows, before landing his Mercedes-powered Williams race drive.\n" +
            "\n" +
            "A refusal to cede ground to his rivals - and commitment to a tricky pass – underpins Russell’s winning mentality. And it’s what got him the call-up to replace Lewis Hamilton for a one-off Mercedes appearance for Sakhir 2020 when the reigning champ was struck down by Covid-19.\n" +
            "\n" +
            "That star turn saw Russell miss out on pole by just 0.026s and then outrace Mercedes stalwart Valtteri Bottas. Only a bungled pit stop and a heart-breaking late puncture prevented a near-certain maiden win for the up-and-coming super-sub.\n" +
            "\n" +
            "He kept his head down at Williams in 2021, scoring his first points and podium, all the while keeping his eye on the bigger prize. Having proved himself a hard worker and a tenacious talent, that prize arrived in the form of a chance to take on compatriot and seven-time champion Hamilton in identical machinery.\n" +
            "\n" +
            "It was an opportunity Russell has relished, and he took his first F1 win – and Mercedes’ only 2022 victory – in Brazil. The 2023 season proved tougher, but if the Silver Arrows can bounce back and provide a truly competitive car, a title bid surely beckons. A huge challenge, but as always, ‘Russell the Rocket’ will be going flat out.",
    8 to "Call him a lone ranger or a maverick, but Magnussen is in Formula 1 for one reason only – to race.\n" +
            "\n" +
            "He may be a second-generation F1 driver – following his father, Jan, onto the grid – but Magnussen’s idols are from the ‘golden era’ of Grand Prix racing when the likes of Juan Manuel Fangio and Stirling Moss risked it all for the love of the sport.\n" +
            "\n" +
            "The Roskilde racer’s own prowess was proven on debut for McLaren, who guided him through the junior ranks, when he cruised into the top-three at the 2014 Australian Grand Prix, becoming the first Dane to claim a podium in F1.\n" +
            "\n" +
            "Other champagne moments were more difficult to find, as he left McLaren behind for a season with Renault, before settling in for four among kindred spirits at Haas. And after a year away in the States, racing Indy and sportscars among other things, he returned to the American team in 2022, securing their first-ever pole position at the Brazilian Grand Prix.\n" +
            "\n" +
            "His meaty manoeuvres and elbows-out approach have earned him a bad-boy reputation on track, something that still leaves him baffled. Out of the car Magnussen is laidback and affable. After all he has his dream job – and he is only here to race.",
    9 to "There is no such thing as too much too soon for Stroll, a teenage sensation with a wet weather predilection. One of the cool kids on the grid, Stroll was unveiled shortly after his 18th birthday by Williams – before he finished high school and got his road licence.\n" +
            "\n" +
            "Stroll meant business in his debut 2017 season, setting records on the way. An opportunistic racer he bounded onto the podium in Baku, the youngest rookie to do so. As the son of a wealthy entrepreneur, Stroll is used to a champagne lifestyle but now he knows the fizz tastes all the sweeter on the rostrum. Then in Monza he mastered the downpours to become the youngest driver in history to line up on the front row.\n" +
            "\n" +
            "A single-minded starter, the Canadian loves to make up places on the opening lap and fight through to the points. Stroll has the potential to be a long-term fixture in Formula 1 – as amply illustrated by a maiden pole and another two podiums in 2020.\n" +
            "\n" +
            "Those came after his father Lawrence led the consortium that took over Force India midway through the 2018 season, and then transformed it from Racing Point to Aston Martin for 2021. The future looks bright for both the team and their young driver – and even if it rains then Stroll can keep on motoring at the sharp end of the pack.",
    10 to "Lando Norris may not be named after Star Wars rebel Lando Calrissian - his Mum just liked the moniker - but he has flair and fighting spirit in bountiful supply.\n" +
            "\n" +
            "McLaren had the British teenager on their books for two years before fast-tracking him into F1’s galaxy of stars in 2019. A firecracker in his junior career, with a penchant for pole positions and wheel-to-wheel tussles, Norris didn’t let them down.\n" +
            "\n" +
            "Paired with the highly-rated – and far more experienced – Carlos Sainz, his rookie season was impressive, Norris edging the Spaniard in their head-to-head qualifying battle, scoring points 11 times, and only narrowly missing out on a top-10 championship placing.\n" +
            "\n" +
            "A maiden podium came in 2020, with more following in the subsequent two seasons – he narrowly missed out on a win at Russia 2021 – as he dominated another more senior team mate, Daniel Ricciardo, to firmly establish himself in F1’s top tier.\n" +
            "\n" +
            "Away from the track, Norris brims with a modest charm and an artistic side sees him design and paint his own race gear as a hobby. The focus for the future is allying artistry and ambition on track as McLaren rely on the promise of youth to take them back to the top.\n" +
            "\n" +
            "Norris hopes the downforce will be with him…",
    11 to "‘Still I Rise’ – these are the words emblazoned across the back of Lewis Hamilton’s helmet and tattooed across his shoulders, and ever since annihilating expectations with one of the greatest rookie performances in F1 history in 2007, that’s literally all he’s done: risen to the top of the all-time pole positions list ahead of his hero Ayrton Senna, surged into first place in the wins column surpassing the inimitable Michael Schumacher, and then matched the legendary German’s seven world titles.\n" +
            "\n" +
            "Is he the G.O.A.T? Few would deny that he’s in the conversation – and what’s more he’s got there his way, twinning his relentless speed with a refusal to conform to stereotypes for how a racing driver should think, dress or behave.\n" +
            "\n" +
            "Respect is hard earned in F1, but Hamilton – Sir Lewis Hamilton to be precise – has it from every one of his peers. Why? Because they know that whatever the track, whatever the conditions, whatever the situation, when his visor goes down and the lights go out, it’s Hammertime.",
    12 to "Liam Lawson knows a thing or two about jumping in at the deep end.\n" +
            "\n" +
            "A race winner at pretty much every level of junior motorsport, and a front-runner in the highly competitive F3 and F2 championships, the New Zealander was keenly awaiting his F1 chance as Red Bull’s reserve driver when a twist of fate presented it.\n" +
            "\n" +
            "With AlphaTauri racer Daniel Ricciardo breaking his hand in a practice crash at the 2023 Dutch Grand Prix, Lawson – inspired as a youngster by the Lightning McQueen character from the Disney animation Cars – was ready to strike.\n" +
            "\n" +
            "After a sink-or-swim debut in the relentless rain at Zandvoort, the entire paddock stood up and took notice amid the intense humidity of Singapore, where the rookie brilliantly beat world champion Max Verstappen to a Q3 spot and bagged some valuable points on race day.\n" +
            "\n" +
            "Red Bull told Lawson just before his stellar qualifying run under the Marina Bay lights that there would be no room at the inn for 2024, with a rebranded RB team combining experience and youth once more in the healed Ricciardo and Yuki Tsunoda.\n" +
            "\n" +
            "Lawson had been in this position before, though. He underlined his talents to Red Bull’s chiefs when it mattered most and just needed to wait for the next opportunity to arise.\n" +
            "\n" +
            "Of all the places for it to unfold, Singapore triggered a second twist of fate. Ricciardo would be out, and Lawson back in, this time as Red Bull try to understand the “bigger picture” with their driver line-ups for 2025 and beyond.\n" +
            "\n" +
            "It marks a golden opportunity for Lawson to not only cement himself in RB colours, but also knock on the door of a Red Bull promotion in what has been a whirlwind F1 career to date.\n" +
            "\n" +
            "Only time will tell where the adventure takes him next.",
    13 to "He’s Max by name, and max by nature.\n" +
            "\n" +
            "Arriving as Formula 1’s youngest ever competitor at just 17 years old, Verstappen pushed his car, his rivals and the sport’s record books to the limit. The baby-faced Dutchman with the heart of a lion took the Toro Rosso – and then the Red Bull – by the horns with his instinctive racing style.\n" +
            "\n" +
            "F1’s youngest points scorer soon became its youngest race winner – at the age of 18 years and 228 days – with an opportunistic but controlled drive on debut for Red Bull in Barcelona 2016. A true wheel-to-wheel racer, another stunning drive in Brazil from the back of the pack to the podium on a treacherous wet track kept the plaudits coming.\n" +
            "\n" +
            "Verstappen’s no-holds-barred attitude and hard defending have sometimes landed him in hot water with his peers and paymasters. But the mistakes that initially marred his potential have given way to maturity, while the bravado and energy that make him a blockbuster talent have remained – and the victories have kept on coming.\n" +
            "\n" +
            "They led to his first F1 drivers’ crown after that now legendary, final-round showdown with Lewis Hamilton in 2021. He followed that up with a powerhouse title defence in 2022, before an epic third successive championship triumph, featuring a record 19 wins from 23 Grands Prix.\n" +
            "\n" +
            "The son of former F1 driver Jos Verstappen and super-quick karting Mum Sophie Kumpen, racing runs through his genes. Despite moving out of Dad’s house to live in Monaco, Verstappen remains close to his family, and though he’s not afraid to speak his mind, he can still be surprisingly shy.\n" +
            "\n" +
            "Having become the Netherlands' first world champion aged just 24, the expectations for the new generation’s leading light are sky high – but with Verstappen there’s a feeling that the sky’s the limit.",
    14 to "He’s the Superhero with the talent to become a racing superstar – if only he could get to flex his muscles with a top team. F1’s 'Hulk' has shown incredible strength and stamina as a midfield marauder for Williams, Force India, Sauber, Renault, Racing Point, Aston Martin and Haas during a career spanning back to 2010.\n" +
            "\n" +
            "In that rookie season, Hulkenberg mastered changing track conditions to take a brilliant pole position in Brazil, showing he had brains as well as brawn. Since then his ability to consistently hoover up the points has made him a highly valued team player. In 2015, his reputation grew once more when, on a weekend away from his day job, he won the classic Le Mans 24 Hours race for Porsche at the first time of asking.\n" +
            "\n" +
            "Hulkenberg’s off-track alter ego is down to earth – he’s the sort of driver who holds his own umbrella when it’s raining on the way to the grid – with a cheeky sense of humour. When he reached the unwanted record of most race starts without a podium finish he laughed it off as the start of the 'Hulkenberg era'.\n" +
            "\n" +
            "Thankfully, even after being dropped by Renault at the end of 2019, the popular German’s era continued with some stand-in (and stand-out) drives in 2020 and 2022, and after landing a full-time F1 return with Haas, the ‘Hulk’ has embraced another chance to set the record straight.",
    15 to "Born in Melbourne, just a stone’s throw away from the Australian Grand Prix venue, a young Oscar Piastri’s dreams of one day racing in Formula 1 were ignited by the sport’s star drivers roaring around his local streets, otherwise known as Albert Park.\n" +
            "\n" +
            "But it would take huge commitment and sacrifice to turn that dream into a reality, with a move to Europe – made by the likes of fellow countrymen Mark Webber and Daniel Ricciardo before him – the only way to go up against the best and catch the attention of the sport’s decision-makers.\n" +
            "\n" +
            "Using success on the Australian karting scene as a springboard, Piastri continued to learn the craft in championships across Europe, before getting his first taste of single-seater competition as a 15-year-old – two podium finishes in F4 UAE a sign of things to come.\n" +
            "\n" +
            "From there, success flowed. British F4 runner-up. Formula Renault champion. F3 champion. F2 champion (by more than 50 points). Piastri did not simply climb the junior single-seater ladder, he charged up it to knock loudly on the F1 door.\n" +
            "\n" +
            "So impressive was Piastri that two F1 teams squabbled over his services for 2023, adding a new dimension to the driver market and so-called ‘silly season’. McLaren, and not long-time backers Alpine, won out and their rookie repaid them in spades, taking two podiums in a highly impressive debut campaign.",
    16 to "If there’s one man who knows how big a rollercoaster ride an F1 driver’s career can be, it’s Pierre Gasly!\n" +
            "\n" +
            "The flying Frenchman was called up to make his 2017 debut in Malaysia in place of Daniil Kvyat and, after proving his mettle, he was named a Toro Rosso driver the following year. A further 21 races into his fledgling career, Gasly was moved up again – this time to replace Red Bull big gun Daniel Ricciardo.\n" +
            "\n" +
            "Gasly seemed to have a knack of being in the right place at the right time – a quality that’s equally handy on track. A series of impressive 2018 performances for Toro Rosso – including a brilliant fourth place in Bahrain – showed exciting promise for what he might do with the ‘A’ team in 2019.\n" +
            "\n" +
            "Unfortunately that promise only appeared in flashes – and he quickly suffered from unfavourable comparisons with superstar team mate Max Verstappen. So much so that after the summer break, he was sent back to Toro Rosso, with another young up-and-comer – Alex Albon – being given a shot in the ‘senior’ Red Bull seat.\n" +
            "\n" +
            "But Gasly bounced back, as only Gasly can. In the season’s remaining nine races he scored almost as many points as team mate Kvyat managed over the entire year – and secured his best-ever race result with P2 in Brazil. That trajectory continued in 2020, peaking with an emotional maiden win at the renamed AlphaTauri team’s home race in Italy, and didn’t let up in 2021 when he was back on the podium and scored 110 of the squad’s 142 points.\n" +
            "\n" +
            "When AlphaTauri’s momentum stalled in 2022, Gasly decided it was time for a change – in the form of French team Alpine, with fellow Frenchman – and old adversary – Esteban Ocon as team mate. The question now is can he regain momentum and get himself another shot at the F1 bigtime…",
    17 to "He’s the fighter with a gentle touch from the land of the Lucha Libre.\n" +
            "\n" +
            "Perez’s reputation in F1 has been built on opposite approaches to Grand Prix racing. On the one hand, he is a punchy combatant who wrestles his way through the pack and into the points. Never afraid to add a bit of spice to his on-track encounters, even his team mates don’t always escape the Mexican’s heat.\n" +
            "\n" +
            "Then on the other hand, Perez is a smooth operator, a master at managing tyres to eke out extra performance and give him the upper hand on strategy. A firm favourite on the grid after his time with Sauber, McLaren, Force India and Racing Point, Perez has matured into an analytical racer and team player.\n" +
            "\n" +
            "A proud countryman, the Guadalajara gunslinger has amassed more points than any other Mexican in the history of F1. In Sakhir 2020 he also matched hero and compatriot Pedro Rodriguez by taking the chequered flag in first – a performance that landed him a seat with title contenders Red Bull.\n" +
            "\n" +
            "There he provided a supporting role to Max Verstappen’s 2021/22/23 championship-winning campaigns, also adding a further five victories to his personal tally. His own title challenge may not be assured, especially with Verstappen as team mate, but Perez working hard and racing with his heart are.",
    18 to "Learning his craft on Finnish roads of ice and snow, he was born to be a Grand Prix racer.\n" +
            "\n" +
            "Bottas explains that if you can drive on the frozen roads of his homeland then you can drive anywhere. Then there’s the Finnish mentality –reserved, diligent and calm the fast lane of F1 doesn’t faze him.\n" +
            "\n" +
            "Making his F1 debut with Williams in 2013, Bottas soon became part of the family. Points and podiums followed with the reliable racer even amassing the most points without a win, a record he resented but that showcased his ability. The fact the Finn was such a points machine saw him suddenly promoted to the most coveted seat in F1 - Nico Rosberg’s vacant championship-winning seat at Mercedes.\n" +
            "\n" +
            "Bottas blossomed at the Silver Arrows in 2017, unleashing his pace to clock up personal pole positions and victories as well as a team championship for the famous Mercedes marque alongside Lewis Hamilton. He even tied with Hamilton and Sebastian Vettel with 13 podiums.\n" +
            "\n" +
            "For a shy guy, it brought a confidence boost and a new swagger – albeit in a very demur Finnish fashion. He would need all that confidence in 2018 – a season Bottas described as his worst in F1, as he took zero wins to Hamilton’s 11. That, though, was a reflection more of his team mate’s brilliance than of any shortcomings on his own part.\n" +
            "\n" +
            "Bottas stepped it up a level in 2019, four victories securing a convincing second in the championship behind Hamilton, but that dropped to two wins to his team mate's 11 in 2020 and then just one in 2021, prompting Mercedes to drop him after five seasons.\n" +
            "\n" +
            "In 2022 he started a new chapter in his F1 career, replacing compatriot Kimi Raikkonen to lead an all-new line-up at Alfa Romeo, now Kick Sauber, and taking Chinese rookie Zhou Guanyu under his wing.",
    19 to "In the entire history of Formula 1, no Japanese driver has ever won a World Championship Grand Prix. Could Yuki Tsunoda be the first? Red Bull certainly think so, with the youngster very much on the path to their senior team if he continues to impress as he has done over the past few years.\n" +
            "\n" +
            "Tsunoda's ascent to the top tier of motorsport was astonishingly rapid: he went from racing in Japanese F4 to a Formula 1 seat with AlphaTauri, now RB, in just over three years, having arrived in Europe in 2019 with no knowledge of the circuits.\n" +
            "\n" +
            "But after a slow start in F3, followed by a hugely impressive debut F2 campaign that saw him finish third in the championship and pick up three wins along the way, Tsunoda proved he had the speed and the race craft to force his way on to the F1 grid.\n" +
            "\n" +
            "He may not have adapted to Grand Prix racing quite as quickly as he did to F2, but having now firmly established himself in Formula 1, he could yet find himself battling at the very sharp end in a Red Bull.",
    20 to "China had never boasted a Grand Prix starter among its citizens – until Zhou Guanyu changed that state of affairs, after receiving the call-up to make his F1 debut for Alfa Romeo, now Kick Sauber, in 2022.\n" +
            "\n" +
            "The Shanghai-born racer attended his home city’s inaugural Grand Prix in 2004 at the age of five, cheering on his hero Fernando Alonso. But having caught the racing bug, the Chinese driver then set himself the ambitious goal of becoming his country’s first-ever F1 racer – achieving a feat that Ma Qinghua, the only other Chinese driver to take part in a Formula 1 weekend, never managed.\n" +
            "\n" +
            "Showing boldness and dedication, Zhou put his plan into action by moving to England with his family aged just 12 to pursue his motorsport ambitions. A second-place finish in the 2015 Italian F4 championship proved Zhou was possessed of the right stuff – a fact already noted by Ferrari, who’d signed him to their driver academy a year earlier.\n" +
            "\n" +
            "A move to Renault’s academy for 2019 coincided with his debut in Formula 2, with Zhou building his confidence in the series via multiple wins and pole positions across three seasons, leading to him challenging for the drivers’ title in 2021.\n" +
            "\n" +
            "That was enough to convince Team Principal Fred Vasseur to put his faith in Zhou for 2022 and field him alongside ex-Mercedes racer Valtteri Bottas – allowing Zhou to achieve his dream of racing in F1, and even to see how he fares against his own childhood hero, Fernando Alonso."
)


val resultats = listOf(
    listOf(
        Resultat(1, drivers[12], "1:31:44.742", 26),
        Resultat(2, drivers[16], "+22.457s", 18),
        Resultat(3, drivers[1], "+25.110s", 15),
        Resultat(4, drivers[2], "+39.669s", 12),
        Resultat(5, drivers[6], "+46.788s", 10),
        Resultat(6, drivers[9], "+48.458s", 8),
        Resultat(7, drivers[10], "+50.324s", 6),
        Resultat(8, drivers[14], "+56.082s", 4),
        Resultat(9, drivers[4], "+74.887s", 2),
        Resultat(10, drivers[8], "+93.216s", 1),
        Resultat(11, drivers[19], "+1 lap", 0),
        Resultat(12, drivers[7], "+1 lap", 0),
        Resultat(13, drivers[20], "+1 lap", 0),
        Resultat(14, drivers[18], "+1 lap", 0),
        Resultat(15, drivers[1], "+1 lap", 0),
        Resultat(16, drivers[13], "+1 lap", 0),
        Resultat(17, drivers[3], "+1 lap", 0),
        Resultat(18, drivers[15], "+1 lap", 0),
        Resultat(19, drivers[17], "+1 lap", 0),
        Resultat(20, drivers[21], "+2 lap", 0),
    ),
    listOf(
        Resultat(1, drivers[12], "1:20:43.273", 25),
        Resultat(2, drivers[16], "+13.643s", 18),
        Resultat(3, drivers[2], "+18.639s", 16),
        Resultat(4, drivers[14], "+32.007s", 12),
        Resultat(5, drivers[4], "+35.759s", 10),
        Resultat(6, drivers[6], "+39.936s", 8),
        Resultat(7, drivers[23], "+42.679s", 6),
        Resultat(8, drivers[9], "+45.708s", 4),
        Resultat(9, drivers[10], "+47.391s", 2),
        Resultat(10, drivers[13], "+76.996s", 1),
        Resultat(11, drivers[1], "+88.354s", 0),
        Resultat(12, drivers[7], "+105.737s", 0),
        Resultat(13, drivers[3], "+1 lap", 0),
        Resultat(14, drivers[21], "+1 lap", 0),
        Resultat(15, drivers[18], "+1 lap", 0),
        Resultat(16, drivers[20], "+1 lap", 0),
        Resultat(17, drivers[17], "+1 lap", 0),
        Resultat(18, drivers[19], "+1 lap", 0),
        Resultat("NC", drivers[8], "DNF", 0),
        Resultat("NC", drivers[15], "DNF", 0),
    ),
    listOf(
        Resultat(1, drivers[1], "1:20:26.843", 25),
        Resultat(2, drivers[2], "+2.366s", 19),
        Resultat(3, drivers[9], "+5.904s", 15),
        Resultat(4, drivers[14], "+35.770s", 12),
        Resultat(5, drivers[16], "+56.309s", 10),
        Resultat(6, drivers[8], "+93.222s", 8),
        Resultat(7, drivers[18], "+95.601s", 6),
        Resultat(8, drivers[4], "+100.992s", 4),
        Resultat(9, drivers[13], "+104.553s", 2),
        Resultat(10, drivers[7], "+1 lap", 1),
        Resultat(11, drivers[1], "+1 lap", 0),
        Resultat(12, drivers[20], "+1 lap", 0),
        Resultat(13, drivers[15], "+1 lap", 0),
        Resultat(14, drivers[17], "+1 lap", 0),
        Resultat(15, drivers[19], "+1 lap", 0),
        Resultat(16, drivers[3], "+1 lap", 0),
        Resultat(17, drivers[6], "DNF", 0),
        Resultat("NC", drivers[10], "DNF", 0),
        Resultat("NC", drivers[12], "DNF", 0)
    )
)
