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
                nombre = "Capítulo 1: Antiinfecciosos",
                descripcion = "",
                subgrupos = listOf(
                    Subgrupo(
                        nombre = "Subgrupo 1: Betalactamicos",
                        descripcion = "",
                        medicamentos = listOf(
                            Medicamento(
                                nombre = "Amoxicilina",
                                descripcion = " Aminopenicilina, penicilina de amplio espectro\n" +
                                        "Cápsulas de 500 mg, Suspensión oral de 250 mg/5 mL\n",
                                indicaciones = listOf("Infecciones de vías urinarias en niños "
                                    , "Neumonía adquirida en la comunidad leve a moderada"
                                    , "Otitis media aguda * y sinusitis"
                                    , "Abscesos dentales y otras infecciones orales"
                                    , "Leptospirosis leve a moderada en menores de 2 años"
                                    , "Ruptura prematura de membranas como complemento de otros antibióticos."
                                    , "Prevención de endocarditis bacteriana"
                                    , "Profilaxis post-esplenectomía en niños"
                                    , "Erradicación de Helicobacter pylori"
                                ),
                                contraindicaciones = listOf("hipersensibilidad"
                                    , "alergia a penicilinas "),
                                precauciones = listOf("Aumento  del riesgo de erupciones cutáneas eritematosas " +
                                        "en infecciones por citomegalovirus y leucemia linfocítica aguda o " +
                                        "crónica  y en pacientes tratados con alopurinol. Riesgo de cristaluria " +
                                        "con dosis altas ."
                                    , "Embarazo y lactancia"),
                                dosificacion = listOf("ADULTOS y NIÑOS >40 kg"
                                    , "Infecciones bacterianas del tracto respiratorio superior leves a moderadas, " +
                                            "incluyendo otitis media aguda, 500–1g tid 6"
                                    , "Neumonía adquirida en la comunidad 1 g cada 8 h"
                                    , "Absceso dental (esquema corto): 3 g a repetir 8 h después 2"
                                    , "Erradicación del H. pylori ver. p. 135"
                                ),
                                efectosAdversos = listOf("nausea y vómito."),
                                imagenesResIds = listOf(R.drawable.amoxicilina_1, R.drawable.amoxicilina_2)
                            ),
                        )
                    )
                )
            ),
            Capitulo(
                nombre = "Capítulo 2: Antibióticos",
                descripcion = "Medicamentos para el tratamiento de infecciones bacterianas.",
                subgrupos = listOf(
                    Subgrupo(
                        nombre = "Subgrupo 1: Penicilinas",
                        descripcion = "Antibióticos beta-lactámicos usados en infecciones bacterianas.",
                        medicamentos = listOf(
                            Medicamento(
                                nombre = "Amoxicilina 2",
                                descripcion = "Antibiótico de amplio espectro.",
                                indicaciones = listOf("Infecciones respiratorias", "Infecciones del oído"),
                                contraindicaciones = listOf("Alergia a penicilinas", "Mononucleosis infecciosa"),
                                precauciones = listOf("Ajustar dosis en insuficiencia renal", "Usar con precaución en embarazadas"),
                                dosificacion = listOf("500 mg cada 8 horas."),
                                efectosAdversos = listOf("Diarrea", "Erupción cutánea", "Náuseas"),
                                imagenesResIds = listOf()
                            )
                        )
                    )
                )
            )
        )
    }
}
