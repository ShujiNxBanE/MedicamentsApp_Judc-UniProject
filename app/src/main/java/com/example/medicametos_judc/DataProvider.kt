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
        )
    }

    fun obtenerCapitulosEspeciales(): List<Capitulo> {
        return listOf(
            Capitulo(
                nombre = "Gastroenterologia",
                descripcion = "1",
                subgrupos = listOf(
                    Subgrupo(
                            nombre = "DISPERSIA Y REFLUJO GASTROESOFAGICO ",
                        descripcion = "1",
                        medicamentos = listOf(
                            Medicamento(
                                nombre = "Omeprazol",
                                descripcion = "Inhibidor de bomba de protones (IBP) de las células parietales del estómago inhibe " +
                                        "la secreción ácida en el estómago. Frasco ampolla con polvo liofilizado 40 mg y tableta o capsula de 20 mg ",
                                indicaciones = listOf("Dispepsia asociada con acidez"
                                    ,"Enfermedad por reflujo gastro–esofágico"
                                    ,"Enfermedad ulcerosa péptica (incluyendo la erradicación de H. pylori y el seguimiento postendoscópico de la hemorragia grave por ulceración)"
                                    ,"Profilaxis en pacientes con antecedentes de úlcera, lesiones gastrointestinales o dispepsia asociada a AINE y requieren tratamiento continuo con AINE"
                                    ,"Profilaxis de úlcera de estrés en pacientes hospitalizados con condición de riesgo Ventilación mecánica, coagulopatía, trauma cerebral, quemaduras graves politraumatismo, sepsis, insuficiencia renal aguda (B) Pacientes en UCI con índice de gravedad de trauma >15 o requerimientos de dosis altas de corticoide >250 mg de hidrocortisona o equivalente"
                                    ,"Síndrome de Zollinger–Ellison"
                                    ,"Profilaxis de aspiración ácida durante anestesia general (C)"),
                                contraindicaciones = listOf("No"),
                                precauciones = listOf("Descartar cáncer gástrico antes de iniciar tratamiento en pacientes con dispepsia y signos de alarma Los pacientes con osteoporosis deberán mantener una adecuada ingesta de calcio y vitamina D. La medición de la concentración sérica de magnesio debe considerarse antes o durante un tratamiento prolongado sobre todo cuando se administran en combinación con otros medicamentos que causen hipomagnesemia o con digoxina. El omeprazol debe ser prescrito para las indicaciones adecuadas en la dosis eficaz más baja durante el menor tiempo posible, la necesidad de tratamiento a largo plazo debe ser revisado periódicamente."
                                    ,"Insuficiencia hepática: reducir la dosis (no más de 20 mg diario)."
                                    ,"Insuficiencia renal: no es necesario corregir la dosis."),
                                dosificacion = listOf("VÍA ORAL"
                                    ,"En la mayoría de las indicaciones se recomienda habitualmente una dosis única por la mañana antes de comer, sin embargo, la absorción no está afectada significativamente con la comida"
                                    ,"Dispepsia asociada con acidez: 1020 mg PO id por 2 a 4 semanas"
                                    ,"Enfermedad por reflujo gastroesofágico: 20 mg PO id por 4 sem., si curación incompleta continuar por otras 48 sem."),
                                efectosAdversos = listOf("Náuseas y vómitos, hepatitis, ictericia colestásica, síndrome de Stevens Johnson, necrólisis epidérmica tóxica, dermatitis exfoliativa, casos de vasculitis, rara vez prolongación del tiempo de sangrado, mareos, dolor de cabeza, convulsiones (especialmente con dosis altas o en pacientes con insuficiencia renal); tinción superficial de los dientes con la suspensión. La diarrea es común debido tanto al componente clavulánico como a la amoxicilina 6"),
                                imagenesResIds = listOf(R.drawable.omeprazol_1)
                            )
                        )
                    )
                )
            ),
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
                            Medicamento(
                                nombre = "Omeprazol",
                                descripcion = "Inhibidor de bomba de protones (IBP) de las células parietales del estómago inhibe " +
                                        "la secreción ácida en el estómago. Frasco ampolla con polvo liofilizado 40 mg y tableta o capsula de 20 mg ",
                                indicaciones = listOf("Dispepsia asociada con acidez"
                                    ,"Enfermedad por reflujo gastro–esofágico"
                                    ,"Enfermedad ulcerosa péptica (incluyendo la erradicación de H. pylori y el seguimiento postendoscópico de la hemorragia grave por ulceración)"
                                    ,"Profilaxis en pacientes con antecedentes de úlcera, lesiones gastrointestinales o dispepsia asociada a AINE y requieren tratamiento continuo con AINE"
                                    ,"Profilaxis de úlcera de estrés en pacientes hospitalizados con condición de riesgo Ventilación mecánica, coagulopatía, trauma cerebral, quemaduras graves politraumatismo, sepsis, insuficiencia renal aguda (B) Pacientes en UCI con índice de gravedad de trauma >15 o requerimientos de dosis altas de corticoide >250 mg de hidrocortisona o equivalente"
                                    ,"Síndrome de Zollinger–Ellison"
                                    ,"Profilaxis de aspiración ácida durante anestesia general (C)"),
                                contraindicaciones = listOf("No"),
                                precauciones = listOf("Descartar cáncer gástrico antes de iniciar tratamiento en pacientes con dispepsia y signos de alarma Los pacientes con osteoporosis deberán mantener una adecuada ingesta de calcio y vitamina D. La medición de la concentración sérica de magnesio debe considerarse antes o durante un tratamiento prolongado sobre todo cuando se administran en combinación con otros medicamentos que causen hipomagnesemia o con digoxina. El omeprazol debe ser prescrito para las indicaciones adecuadas en la dosis eficaz más baja durante el menor tiempo posible, la necesidad de tratamiento a largo plazo debe ser revisado periódicamente."
                                    ,"Insuficiencia hepática: reducir la dosis (no más de 20 mg diario)."
                                    ,"Insuficiencia renal: no es necesario corregir la dosis."),
                                dosificacion = listOf("VÍA ORAL"
                                    ,"En la mayoría de las indicaciones se recomienda habitualmente una dosis única por la mañana antes de comer, sin embargo, la absorción no está afectada significativamente con la comida"
                                    ,"Dispepsia asociada con acidez: 1020 mg PO id por 2 a 4 semanas"
                                    ,"Enfermedad por reflujo gastroesofágico: 20 mg PO id por 4 sem., si curación incompleta continuar por otras 48 sem."),
                                efectosAdversos = listOf("Náuseas y vómitos, hepatitis, ictericia colestásica, síndrome de Stevens Johnson, necrólisis epidérmica tóxica, dermatitis exfoliativa, casos de vasculitis, rara vez prolongación del tiempo de sangrado, mareos, dolor de cabeza, convulsiones (especialmente con dosis altas o en pacientes con insuficiencia renal); tinción superficial de los dientes con la suspensión. La diarrea es común debido tanto al componente clavulánico como a la amoxicilina 6"),
                                imagenesResIds = listOf(R.drawable.omeprazol_1)
                            ),
                        )
                    )
                )
            ),
        )
    }
}
