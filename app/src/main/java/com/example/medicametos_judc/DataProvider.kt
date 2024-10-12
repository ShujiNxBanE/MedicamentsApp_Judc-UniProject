package com.example.medicametos_judc

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Medicamento(
    val nombre: String,
    val descripcion: String,
    val indicaciones: List<String>,
    val contraindicaciones: List<String>,
    val precauciones: List<String>,
    val dosificacion: List<String>,
    val dosificacionImagenes: List<Int>,
    val efectosAdversos: List<String>,
    val imagenesResIds: List<Int>
) : Parcelable

@Parcelize
data class Subgrupo(
    val nombre: String,
    val descripcion: String,
    val medicamentos: List<Medicamento>
) : Parcelable

@Parcelize
data class Capitulo(
    val nombre: String,
    val descripcion: String,
    val subgrupos: List<Subgrupo>
) : Parcelable

object DataProvider {
    fun obtenerCapitulos(): List<Capitulo> {
        return listOf(
            Capitulo(
                nombre = "ANTIINFECCIOSOS",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "PENICILINA",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Amoxicilina",
                                descripcion =
                                    "Aminopenicilina asociada a un inhibidor de betalactamasas Suspensión de 250 mg + 62.5 mg/5mL Tabletas de 875 mg+125 mg ",
                                indicaciones = listOf(
                                    "ADULTOS:"
                                    , "Primera elección en el manejo ambulatorio de neumonía adquirida en la comunidad del paciente con factores de riesgo"
                                    , "Alternativa en infecciones que no han respondido a al tratam. de primera línea: neumonía adquirida en la comunidad, exacerbaciones agudas de EPOC, otitis media aguda infecciones óseas y articulares, infecciones genitourinarias, infecciones abdominales, coledocolitiasis con colangitis no tóxica, celulitis, infección dental grave con propagación de la celulitis o infección dental que no responde a antibióticos de primera línea"
                                    , "NIÑOS"
                                    , "De primera elección en celulitis por mordedura de animales (perros, gatos) y humanos  erisipela"
                                    , "Cómo alternativa en sinusitis bacteriana, otitis media aguda, neumonía grave adquirida en la comunidad en niños >3 meses hasta 5 años, en hospitalizados con neumonía atípica  y neumonía grave en >5 años y adolescentes si no hubo mejoría con amoxicilina o penicilina procaínica. Infecciones de vías urinarias como alternativa a la nitrofurantoína  incluyendo profilaxis de infecciones urinarias en la infancia ; infecciones de piel: impétigo , ectima foliculitis y forunculosis Mastitis puerperal como alternativa a la dicloxacilina o eritromicina"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                ),
                                precauciones = listOf(
                                    "Monitorear la función hepática en pacientes con enfermedades del hígado. Riesgo de ictericia colestásica durante o poco después del tratamiento; sobre todo en mayores de 65 años y en varones. La duración del tratamiento no debe ser mayor de 14 días 1"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: dosis habituales de 500 mg a 1 g cada 12-8 h (según la infección)"
                                    ,"Neumonía adquirida en la comunidad: 1-2 g cada 12 horas 13 u 875 mg cada 8 horas"
                                    ,"Mastitis puerperal (alternativa dicloxacilina o eritromicina): 500 mg PO cada 8 h, 7-10 d)"
                                    ,"NIÑOS: 40-50 mg/kg, en dos o tres dosis/d"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas y vómitos, hepatitis, ictericia colestásica, síndrome de Stevens Johnson, necrólisis epidérmica tóxica, dermatitis exfoliativa, casos de vasculitis, rara vez prolongación del tiempo de sangrado, mareos, dolor de cabeza, convulsiones (especialmente con dosis altas o en pacientes con insuficiencia renal); tinción superficial de los dientes con la suspensión. La diarrea es común debido tanto al componente clavulánico como a la amoxicilina 6"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.amoxicilina_1
                                    ,R.drawable.amoxicilina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Ampicilina",
                                descripcion =
                                "Aminopenicilina Polvo para solución inyectable de 1 g",
                                indicaciones = listOf(
                                    "Asociado a otros antibacterianos en Infecciones obstétricas y ginecológicas incluyendo  aborto séptico, episiotomía infectada, profilaxis intraparto en casos de amenaza de parto prematuro y en otros riesgos como alternativa a la penicilina, profilaxis a la madre ante complicaciones fetales y neonatales, complicaciones de la histerectomía postparto (Absceso de cúpula, hematoma de cúpula, lesión vesical e infección de herida quirúrgica), pielonefritis (como complicación obstétrica)"
                                    ,"Infecciones perinatales sistémicas incluyendo sepsis neonatal temprana"
                                    ,"Septicemia adquirida en la comunidad de origen intraabdominal o respiratorio en niños (primera línea)"
                                    ,"Meningitis bacteriana en niños de 1 a 3 meses (primera alternativa)"
                                    ,"IVU en niños (alternativa) en caso de alergia a cefalosporinas"
                                    ,"Neumonía agregada en influenza A H1N1 como primera línea en niños de 1 mes a 4 años"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                ),
                                precauciones = listOf(
                                    "Monitorear la función hepática en pacientes con enfermedades del hígado. Riesgo de ictericia colestásica durante o poco después del tratamiento; sobre todo en mayores de 65 años y en varones. La duración del tratamiento no debe ser mayor de 14 días 1"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS, usualmente 1-2 g IV c/4-6 h"
                                    ,"NIÑOS, 1 mes-12 años: 50 mg/kg cada 4-6 h (máx. 2 g c/4 h) Infec. graves (como meningitis): 150-200 mg/kg/d c/4-6 h NEONATOS"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ampicilina_1
                                    ,R.drawable.ampicilina_2
                                )
                            ),
                        )
                    )
                )
            ),
        )
    }

    fun obtenerCapitulosEspeciales(): List<Capitulo> {
        return listOf(

        )
    }
}
