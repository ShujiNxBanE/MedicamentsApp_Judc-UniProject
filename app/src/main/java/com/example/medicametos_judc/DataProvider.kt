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
            // Capitulo 1
            Capitulo(
                nombre = "ANTIINFECCIOSOS",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "PENICILINAS",
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
                            Medicamento(
                                nombre =
                                "Cloxacilina",
                                descripcion =
                                "Cloxacilina Dicloxacilina | Penicilinas isoxazólicas Cloxacilina: frasco-ampolla de 500 mg Dicloxacilina: cápsulas de 500 mg, y suspensión de 125 mg/5 mL",
                                indicaciones = listOf(
                                    "Infecciones por Staphylococcus productores de β-lactamasas incluyendo:"
                                    ,"Neumonía aguda complicada (con compromiso pleural o destrucción de parénquima)"
                                    ,"Neumonía nosocomial no grave de inicio tardía o de inicio temprano asociada a ventilación mecánica   Artritis séptica y osteomielitis"
                                    ,"Impétigo, celulitis y otras infecc. de piel y tejidos blandos"
                                    ,"Linfadenitis cervical (alternativa a la amoxicilina)"
                                    ,"Otitis externa grave (supurada, forunculosis)"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "Cloxacilina (IV): infecciones graves:"
                                    ,"ADULTOS: 8-12 g/d"
                                    ,"NIÑOS: 100-200 mg/kg/d (máx. 12 g/día). Dosis repartidas en 4-6 administraciones de 60 min. cada una. • Dicloxacilina (PO)"
                                    ,"Infecciones leves a moderadas: Al cambiar la terapéutica con cloxacilina (IV) a dicloxacilina (PO), tomar en cuenta que las dosis de dicloxacilina son menores que las de cloxacilina"
                                    ,"ADULTOS y NIÑOS: 25 mg/kg/d divididos en 3 dosis: Máx. 1.5-2 g por día."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Además: dolor, inflamación, flebitis o tromboflebitis en el sitio de inyección de cloxacilina"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cloxacilina_1
                                    ,R.drawable.cloxacilina_2
                                    ,R.drawable.cloxacilina_3
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Benzatinica",
                                descripcion =
                                "Penicilina benzatínica | Benzil penicilina G de liberación prolongada Polvo liofilizado de 1.2 millones de UI",
                                indicaciones = listOf(
                                    "Faringoamigdalitis estreptocócica pyogenes  (como profilaxis primaria de la fiebre reumática)"
                                    ,"Profilaxis secundaria de la fiebre reumática"
                                    ,"Sífilis y profilaxis en embarazo para sífilis"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                    ,"Inyección intravascular, neurosífilis"
                                ),
                                precauciones = listOf(
                                    "Extremar precauciones con el fin de evitar la administración IV (riesgo de paro cardiorrespiratorio), o la inyección en o cerca de los principales nervios periféricos o vasos sanguíneos (riesgo de daño neurovascular grave)"
                                ),
                                dosificacion = listOf(
                                    "Administración por inyección IM profunda"
                                    ,"Amigdalitis estreptocócica: ADULTOS y NIÑOS >30 kg: 1.2 millones de UI, NIÑOS 30 kg, 1.2 millones de UI,NIÑOS <30 kg: 600 mil UI una dosis cada 3-4 semanas"
                                    ,"Sífilis precoz: ADULTOS: 2.4 millones de UI en dosis única dosis dividida en 2 sitios IM profunda"
                                    ,"Sífilis tardía: ADULTOS: 2.4 millones de UI dosis dividida en 2 sitios IM profunda una vez por semana durante 3 semanas consecutivas"
                                    ,"Sífilis congénita (asintomática)*: NIÑOS hasta 2 años: 50 mil UI/kg id"
                                    ,"Embarazo de alto y mediano riesgo (RPR positiva) 2.4 millones UI id"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Dolor e inflamación en el sitio de inyección"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.benzatinica_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Procainica",
                                descripcion =
                                "Penicilina G procaínica Benzil penicilina procaínica o penicilina G procaínica acuosa | Polvo liofilizado de 800,000 UI ",
                                indicaciones = listOf(
                                    "Enfermedad muy grave, neumonía grave, enfermedad febril muy grave o mastoiditis antes de referir (AIEPI)"
                                    ,"Neumonía no grave en niños menores y mayores de 5 años (en ambos casos si no se cuenta con amoxicilina)"
                                    ,"Difteria"
                                    ,"Leptospirosis leve a moderada en niños de 2 m a 10 años"
                                    ,"Sífilis temprana o tardía latente como alternativa a la penicilina benzatínica"
                                    ,"Sífilis congénita (sin neurosífilis) Contraindicaciones hipersensibilidad o alergia a penicilinas"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                    ,"Inyección intravascular, neurosífilis"
                                ),
                                precauciones = listOf(
                                    "Extremar precauciones con el fin de evitar la administración IV (riesgo de paro cardiorrespiratorio), o la inyección en o cerca de los principales nervios periféricos o vasos sanguíneos (riesgo de daño neurovascular grave)"
                                ),
                                dosificacion = listOf(
                                    "Mayoría de indicaciones: NIÑOS: 50,000 UI/kg diario. ADULTOS: 0.6 a 1.2 millones UI/día"
                                    ,"Sífilis: ADULTOS 1.2 millones de UI/día por 10-15 días; hasta 3 semanas en sífilis tardía"
                                    ,"Sífilis congénita sin neurosífilis:"
                                    ,"NIÑOS <2 años: 50,000 UI/kg diario durante 10 días"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Reacciones de hipersensibilidad como urticaria, fiebre, dolores articulares, exantemas, angioedema, anafilaxia, reacción tipo enfermedad del suero. Raros: encefalopatía por irritación cerebral en particular con altas dosis o en pacientes con insuficiencia renal grave; en estas mismas circunstancias, riesgo de acumulación de electrolito, pues las penicilinas inyectables contienen sodio o potasio; diarrea, sobre todo con penicilinas orales de amplio espectro (incluyendo colitis asociada a antibióticos)"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.benzatinica_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Sodica",
                                descripcion =
                                "Penicilina G sódica | Bencilpenicilina sódica (conocida en Nicaragua como penicilina cristalina) Polvo liofilizado en frasco de 1,000,000 UI y de 4,000,000 UI",
                                indicaciones = listOf(
                                    "Tratamiento de primera línea para neumonía grave o muy grave adquirida en la comunidad, septicemia, pericarditis, endocarditis"
                                    ,"Meningitis en mayores de 5 años y septicemia por meningococos (meningococcemia)"
                                    ,"Mordeduras de serpientes"
                                    ,"Leptospirosis"
                                    ,"Neurosífilis y sífilis congénita"
                                    ,"Enterocolitis necrotizante"
                                    ,"Fascitis necrotizante"
                                    ,"Ántrax, actinomicosis, gangrena gaseosa, tétanos (adyuvante a la inmunoglobulina antitetánica), celulitis"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                ),
                                precauciones = listOf(
                                    "Además, la penicilina G sódica contiene 1.68 mEq de sodio por 1 millón de unidades. La penicilina G potásica contiene 1.7 mEq de potasio y 0.3 a 1.02 mEq de sodio por 1 millón de unidades. Tener cuidado con las alteraciones electrolíticas y sobrecarga iatrogénica de líquidos. Realizar valoración periódica del equilibrio de electrolitos; función hepática, sistemas renal y hematopoyético, y del estado cardiovascular durante el tratamiento prolongado con dosis altas de penicilina G, IV"
                                ),
                                dosificacion = listOf(
                                    "Administrar por inyección IM, IV lenta o por infusión IV"
                                    ,"ADULTOS:"
                                    ,"4-8 millones de UI al día en 4 administraciones(las dosis mayores en infecciones graves)"
                                    ,"NIÑOS 1 mes-12 años:"
                                    ,"160 mil UI/kg/día en 4 administraciones (las dosis superiores en infecciones graves)"
                                    ,"NEONATOS <1 semana de edad:"
                                    ,"80 mil UI/kg/d en 2 dosis"
                                    ,"1-4 semanas de edad"
                                    ,"120 mil UI/kg/d distribuidos en 3 tomas"
                                    ,"Enfermedad meningocócica:"
                                    ,"ADULTOS: hasta 24 millones de UI al día en 6 dosis"
                                    ,"NEONATOS <1 semana y prematuros: 160 mil UI/Kg/d distribuidos en 2 tomas"
                                    ,"Neurosífilis: ADULTOS 3-4 millones de UI cada 4 h por 2 sem"
                                    ,"Sífilis congénita:"
                                    ,"NIÑOS: 100,000 a 150,000 U/kg/d IV c/8-12 h x 10-14 d, en caso de neurosífilis igual dosis en intervalos de 6-8 h"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Reacciones de hipersensibilidad como urticaria, fiebre, dolores articulares, exantemas, angioedema, anafilaxia, reacción tipo enfermedad del suero. Raros: encefalopatía por irritación cerebral en particular con altas dosis o en pacientes con insuficiencia renal grave; en estas mismas circunstancias, riesgo de acumulación de electrolito, pues las penicilinas inyectables contienen sodio o potasio; diarrea, sobre todo con penicilinas orales de amplio espectro (incluyendo colitis asociada a antibióticos)"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.sodica_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Piperacilina",
                                descripcion =
                                "Piperacilina/tazobactam | Ureidopenicilina asociada a un inhibidor de beta lactamasas Frasco ampolla 4.5 g: piperacilina 4 g + tazobactam 500 mg ",
                                indicaciones = listOf(
                                    "Tercera o 4ta elección en infecciones causadas por Pseudomonas aeruginosa y por otras bacterias susceptibles"
                                    ,"Neumonía intrahospitalaria de inicio tardía, como 4ta alternativa"
                                    ,"Septicemia"
                                    ,"Infecciones intra-abdominales complicadas (peritonitis, apendicitis, colecistitis, colangitis, diverticulitis)"
                                    ,"Pielonefritis en embarazadas, alternativa a ceftriaxona"
                                    ,"Infecciones complicadas de la piel y tejidos blandos (Pie diabético principalmente)"
                                    ,"Infecciones en pacientes inmunocomprometidos (neutropénicos)"
                                    ,"Infecciones del tracto biliar (colangitis)"
                                    ,"Para el tratamiento de infecciones graves, la piperacilinatazobactam se usa en combinación con un aminoglucósido, debiendo darse por separado debido a la posibilidad de incompatibilidad"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad o alergia a penicilinas"
                                ),
                                precauciones = listOf(
                                    "En casos de insuficiencia renal: si TFG de 20-40 mL/min./1.73 m2 dosis máxima:"
                                    ,"4.5 g cada 8 h; si TFG <20 mL/min./1.73 m2 dosis máx. 4.5 g cada 12 h.2"
                                    ,"Embarazo: evitar en lo posible"
                                    ,"Lactancia: se pueden usar en lactantes no hipersensibles"
                                ),
                                dosificacion = listOf(
                                    "Neumonía adquirida en el hospital, septicemia, infecciones intra-abdominales, infecciones complicadas del tracto urinario o de la piel y tejidos blandos:"
                                    ,"ADULTOS y NIÑOS mayores de 12 años: 4.5 g cada 8 h, aumentar a 4.5 g cada 6 h en infecciones graves"
                                    ,"Infecciones intra-abdominales complicadas: NIÑOS de 2-12 años: 112.5 mg/kg (máximo 4.5 g) cada 8 h"
                                    ,"Infecciones en pacientes neutropénicos: ADULTOS y NIÑOS mayores de 12 años: 4.5 g cada 6 h"
                                    ,"NIÑOS de 2-12 años: 90 mg/kg (máx. 4.5 g) cada 6 horas"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Reacciones de hipersensibilidad como urticaria, fiebre, dolores articulares, exantemas, angioedema, anafilaxia, reacción tipo enfermedad del suero. Raros: encefalopatía por irritación cerebral en particular con altas dosis o en pacientes con insuficiencia renal grave; en estas mismas circunstancias, riesgo de acumulación de electrolito, pues las penicilinas inyectables contienen sodio o potasio; diarrea, sobre todo con penicilinas orales de amplio espectro (incluyendo colitis asociada a antibióticos)"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.piperacilina_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "CEFALOSPORINAS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Cefalexina",
                                descripcion =
                                "Cefalexina Cefalosporina de 1ra generación | Tabletas o cápsulas de 500 mg, 250 mg, y 1 g Suspensión oral de 125 mg y 250 mg/5 mL",
                                indicaciones = listOf(
                                    "Segunda alternativa en infecciones urinarias asintomáticas sintomáticas y tratamiento oral complementario a ceftriaxona en caso de pielonefritis en embarazadas"
                                    ,"Alternativa a la nitrofurantoína y amoxicilina + ácido clavulánico en infecciones de las vías urinarias superiores en niños"
                                    ,"Alternativa a la amoxicilina en infecciones del tracto respiratorio, otitis media aguda, sinusitis"
                                    ,"Alternativa a dicloxacilina en infecciones de piel y tejidos blandos "
                                ),
                                contraindicaciones = listOf(
                                    "Antecedentes de hipersensibilidad inmediata a la penicilina. Aprox. 0.5-6.5% de los pacientes sensibles a la penicilina también son alérgicos a las cefalosporinas. Sin embargo si una cefalosporina es la única alternativa en estos pacientes se pueden utilizar con precaución cefixima, cefotaxima, ceftazidima o ceftriaxona (evitar cefadroxilo y cefalexina)"
                                ),
                                precauciones = listOf(
                                    "Considerar riesgo-beneficio en caso de historia de colitis, enfermedad GI, colitis ulcerativa, enteritis regional o colitis asociada a antibióticos (las cefalosporinas pueden causar colitis pseudomembranosa); en caso de disfunción renal puede ser necesario reducir las dosis de la mayoría de cefalosporinas"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS:"
                                    ,"500 mg bid o tid, y hasta 1–1.5 g tid en infecciones graves"
                                    ,"NIÑOS:"
                                    ,"25 mg/kg/d en 2 o 3 dosis. Se puede duplicar esta dosis en caso de infecciones graves"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "El principal efecto adverso de las cefalosporinas es la reacción de hipersensibilidad. Otros efectos comunes: heces oscuras, dolor torácico, escalofríos, tos, fiebre, dolor o dificultad al orinar, disnea, odinofagia, aftas o lesiones labiales o bucales, adenopatías, lesiones purpúricas (principalmente con cefuroxima), fatiga o debilidad"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cefalexina_1
                                    ,R.drawable.cefalexina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Cefepima",
                                descripcion =
                                "Cefepima Cefalosporina de 4ta generación Polvo liofilizado para inyección de 1 g (como sal diclorhidrato monohidrato)",
                                indicaciones = listOf(
                                    "Neumonía intrahospitalaria asociada a ventilación mecánica, neumonía grave de inicio temprano o tardío con factores de riesgo "
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad a otras cefalosporinas, penicilinas u otros betalactámicos"
                                ),
                                precauciones = listOf(
                                    "Administración en insuficiencia renal: Después de la dosis inicial, las dosis subsecuentes deben ajustarse según aclaramiento de creatinina y la gravedad de la infección:"
                                    ,"AC 30–60 mL/min.: 0.5–2 g c/24 h (2g c/12 h en caso de neutropenia febril)"
                                    ,"AC 11–29 mL/min.: 0.5–1 g c/24 h (2g c/24 h en caso de neutropenia febril)"
                                    ,"AC ≤10 mL/min: 250–500 mg c/24 h (1g c/24 h en la neutropenia febril)"
                                    ," Los pacientes sometidos a hemodiálisis deben recibir dosis de 1 g el 1er día del tratamiento, seguido de 500 mg diariamente (1 g/día en casos de neutropenia febril)"
                                ),
                                dosificacion = listOf(
                                    "IM profunda o en infusión durante 30 min. o más"
                                    ,"ADULTOS Y NIÑOS >40 kgInfecciones leve a moderadas, 1–2 g/d dividido en 2 dosis"
                                    ,"Infecciones graves, hasta 4 g/d en 2 dosis"
                                    ,"Neutropenia febril: hasta 6 g/d dividido en 3 dosis NIÑOS >2 meses y hasta 40 kg: 50 mg/kg bid"
                                    ,"Neutropenia febril: 50 mg/kg tid"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Posibles reacciones de neurotoxicidad (principalmente en personas con deterioro de la función renal)"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cefepima_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Cefotaxima",
                                descripcion =
                                "Cefalosporina de 3ra generación Polvo liofilizado de 1 g",
                                indicaciones = listOf(
                                    "Septicemia adquirida en la comunidad en niños previamente sanos Alternativa en el tratamiento hospitalario de:"
                                    ,"Neumonía muy grave y neumonía grave en niños de 1-3meses Abscesos pulmonares en >5 años y adolescentes"
                                    ,"Infecciones del tracto urinario superior en niños"
                                    ,"Meningitis bacteriana aguda en niños, incluyendo meningitis neonatal adquirida en la comunidad (en los <3 meses de edad se debe asociar a otro antibacteriano)"
                                    ,"Sepsis neonatal adquirida en la comunidad"
                                    ,"Celulitis orbitaria o periorbitaria de origen traumático en niños, asociada a otros antibacterianos"
                                    ,"Osteomielitis y artritis séptica en niños"
                                    ,"Infecciones graves de piel y tejidos blandos en niños"
                                    ,"Neumonía adquirida en la comunidad en adultos"
                                    ,"Embarazadas con neumonía grave"
                                    ,"Colecistitis aguda grave en niños de mayores de 5 años, adolescentes y adultos"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad a las cefalosporinas"
                                ),
                                precauciones = listOf(
                                    "TFG <5 mL/min./1.73 m2, proporcionar una dosis inicial de 1 g, luego usar la mitad de la dosis normal"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: para la mayoría de infecciones por vía IM, IV o por infusión: 1 g cada 12 h; incrementándose en infecciones graves (Ej. meningitis) a 8 g/d divididos en 4 dosis. Pueden requerirse hasta 12 g/d en 3–4 dosis"
                                    ,"NIÑOS: 100-150 mg/kg/d, divididos en 4 dosis. Aumentar hasta 200 mg/kg/d en infecciones muy graves incluyendo meningitis y sepsis. NEONATOS: 50 mg/kg/d, divididos en 2-4 dosis"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Raramente se han reportado arritmias después de la administración IV rápida"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cefotaxima_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Cefoxitina",
                                descripcion =
                                "Cefoxitina Cefamicina con estructura próxima a las cefalosporinas, clasificado como cefalosporina de 2ª generación Polvo liofilizado de 1 g",
                                indicaciones = listOf(
                                    "Profilaxis quirúrgica en casos de laparotomía por traumatismo abdominal y apendicitis no supurada"
                                    ,"Profilaxis quirúrgica en cirugía gastrointestinal, histerectomía vaginal y abdominal debido al riesgo de infecciones por microorganismos anaerobios"
                                ),
                                contraindicaciones = listOf(
                                    "Considerar riesgo-beneficio en caso de historia de colitis, enfermedad GI, colitis ulcerativa, enteritis regional o colitis asociada a antibióticos (las cefalosporinas pueden causar colitis pseudomembranosa); en caso de disfunción renal puede ser necesario reducir las dosis de la mayoría de cefalosporinas"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: Profilaxis quirúrgica, 1 g IV dosis única durante la inducción anestésica"
                                    ,"Profilaxis de apendicitis, 2 g IV dosis única"
                                    ,"NIÑOS: 30-40 mg/kg en dosis única"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "El principal efecto adverso de las cefalosporinas es la reacción de hipersensibilidad. Otros efectos comunes: heces oscuras, dolor torácico, escalofríos, tos, fiebre, dolor o dificultad al orinar, disnea, odinofagia, aftas o lesiones labiales o bucales, adenopatías, lesiones purpúricas (principalmente con cefuroxima), fatiga o debilidad3. Menos comunes o raros: cólicos y dolor abdominal (grave), diarrea (a veces disentería), urticaria, eritema, prurito o erupción cutánea, dolor, enrojecimiento e hinchazón en el sitio de inyección, descamación cutánea y convulsiones3. Puede ocurrir colitis asociada a antibióticos con el uso de cefalosporinas de amplio espectro, particularmente las de segunda y de tercera generación"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cefoxitina_1
                                    ,R.drawable.cefoxitina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Ceftazidima",
                                descripcion =
                                "Cefalosporina de 3ra generación Polvo para solución inyectable (como pentahidrato), vial 1 g",
                                indicaciones = listOf(
                                    "Sospecha de Pseudomonas como agente causal en:"
                                    ,"Neumonía intrahospitalaria grave, neumonía asociada a ventilación mecánica y abscesos pulmonares en niños y adultos"
                                    ,"Sepsis de origen intrahospitalario secundaria a infección respiratoria en niños  y adultos"
                                    ,"Infecciones complicadas del tracto urinario en niños  y adultos"
                                    ,"Úlcera por presión o por insuficiencia venosa (infectado)"
                                    ,"Pacientes febriles con neutropenia"
                                    ,"Infecciones pulmonares en afectados de fibrosis quística"
                                    ,"Osteomielitis y artritis sépticas 3 • Infecciones de piel y tejidos blandos causados por Pseudomonas y otros Gram (-) (los pacientes quemados son particularmente susceptibles)"
                                    ,"Meningitis bacteriana en niños, como fármaco alternativo"
                                ),
                                contraindicaciones = listOf(
                                    "Considerar riesgo-beneficio en caso de historia de colitis, enfermedad GI, colitis ulcerativa, enteritis regional o colitis asociada a antibióticos (las cefalosporinas pueden causar colitis pseudomembranosa); en caso de disfunción renal puede ser necesario reducir las dosis de la mayoría de cefalosporinas"
                                ),
                                precauciones = listOf(
                                    "Insuficiencia hepática grave: usar con cuidado 1 Insuficiencia renal: reducir la dosis si TFG <50 mL/min./1.73 m2, consultar la documentación del producto"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 1-2 g cada 8 h. Dosis mayores en infecciones graves, especialmente en meningitis, septicemia, neumonía intrahospitalaria o en pacientes febriles con neutropenia  En caso de fibrosis quística e infección por Pseudomonas: 100-150 mg/kg/día (máx. 9 g/día) dividido en 3 dosis/día"
                                    ,"NIÑOS y ADOLESCENTES (1 mes-18 años): 25 mg/kg c/8 h; el doble de la dosis en casos de infecciones graves, neutropenia febril y meningitis (máximo 6 g/d) Infecciones pulmonares por Pseudomonas en casos de fibrosis quística: 50 mg/kg c/8 h (máx. 9 g/d)"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "El principal efecto adverso de las cefalosporinas es la reacción de hipersensibilidad. Otros efectos comunes: heces oscuras, dolor torácico, escalofríos, tos, fiebre, dolor o dificultad al orinar, disnea, odinofagia, aftas o lesiones labiales o bucales, adenopatías, lesiones purpúricas (principalmente con cefuroxima), fatiga o debilidad3. Menos comunes o raros: cólicos y dolor abdominal (grave), diarrea (a veces disentería), urticaria, eritema, prurito o erupción cutánea, dolor, enrojecimiento e hinchazón en el sitio de inyección, descamación cutánea y convulsiones3. Puede ocurrir colitis asociada a antibióticos con el uso de cefalosporinas de amplio espectro, particularmente las de segunda y de tercera generación"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ceftazidima_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Ceftriaxona",
                                descripcion =
                                "Cefalosporina de 3ra generación Polvo para solución inyectable de 1 g (como sal sódica) y 250 mg",
                                indicaciones = listOf(
                                    "Meningitis bacteriana aguda y septicemia  adultos y niños >3 meses"
                                    ,"Profilaxis de meningitis por N. meningitidis adquirida en la comunidad en embarazadas"
                                    ,"Neumonías de manejo hospitalaria"
                                    ,"IVU complicadas o con síntomas graves"
                                    ,"Enfermedad inflamatoria pélvica"
                                    ,"Choque séptico extrahospitalario (excepto en caso de foco respiratorio) en niños y adolescentes"
                                    ,"Shigelosis en embarazadas"
                                    ,"Tifoidea"
                                    ,"Trauma penetrante de abdomen (asociada a metronidazol)"
                                    ,"Apendicitis con peritonitis grave (asociada a metronidazol o clindamicina)"
                                    ,"Colecistitis aguda y coledocolitiasis con colangitis no tóxica"
                                    ,"Úlcera por presión infectada (asociada a un aminoglucósido y metronidazol o clindamicina)"
                                    ,"Gonorrea y chancro blando Como alternativa a otros antibióticos en particular en caso de:"
                                    ,"Diarrea inflamatoria y disentería por Salmonella sp (no typhi) y Shigella sp"
                                    ,"Aborto séptico"
                                ),
                                contraindicaciones = listOf(
                                    "Uso en neonatos de menos de 41 semanas de edad gestacional corregida; neonatos de más de 41 semanas de edad gestacional corregida con ictericia, hipoalbuminemia o acidosis; recién nacidos de más de 41 semanas de edad gestacional que reciben tratamiento concomitante con calcio intravenoso (incluyendo nutrición parenteral total que contiene calcio), ya que aumenta el riesgo de precipitación urinaria y pulmonar"
                                ),
                                precauciones = listOf(
                                    "Insuficiencia hepática: reducir la dosis. En la insuficiencia hepática grave, monitorear la concentración plasmática de ceftriaxona"
                                    ,"Insuficiencia renal: reducir la dosis si TFG <10 mL/min./1.73 m2 (máximo 2 g al día)"
                                    ,"Monitorear la concentración plasmática de ceftriaxona en insuficiencia renal grave"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS 1–2 g/d o 500 mg cada 12 h"
                                    ,"Infecciones graves 2-4 g/d"
                                    ,"Gonorrea no complicada y EIP: 250 mg IM profundo, id"
                                    ,"NIÑOS"
                                    ,"Meningitis, 100 mg/kg (hasta 4 g) en infusión IV el primer día, luego 100 mg/kg cada 24 h ó 50 mg/kg cada 12 h, hasta 4 g/d por 7–14 d; para el resto de indicaciones, 25 – 37.5 mg/kg en infusión IV cada 12 h, hasta 2 g/d"
                                    ,"NEONATOS: 20 – 50 mg/kg/d, máximo de 50 mg/kg/d"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "la ceftriaxona puede desplazar a la bilirrubina de la albúmina sérica, en los recién nacidos se debe administrar la dosis en más de 60 minutos. Cuando se usa más de 14 días puede llevar a insuficiencia renal, deshidratación y riesgo de precipitación de ceftriaxona en la vesícula biliar. Raras: prolongación del tiempo de protrombina, pancreatitis"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ceftriaxona_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Cefuroxima",
                                descripcion =
                                "Cefuroxima (axetil) | Cefalosporina de 2da generación Suspensión oral de 250 mg/5 mL",
                                indicaciones = listOf(
                                    "Alternativa en:"
                                    ,"Infecciones del tracto urinario superior en niños"
                                    ,"Sinusitis e impétigo en niños"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "En insuficiencia renal: dosis parenteral de 750 mg 2 veces al día si TFG de 10-20 mL/min./1.73 m2. Dosis de 750 mg 1 vez al día si TFG<10 mL/min./1.73 m2"
                                ),
                                dosificacion = listOf(
                                    "Administrar con la comida"
                                    ,"NIÑOS, 3 meses-2 años: 10 mg/kg (máx. 125 mg) bid, 2-12 años: 15 mg/kg (máx. 250 mg) bid"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "El principal efecto adverso de las cefalosporinas es la reacción de hipersensibilidad. Otros efectos comunes: heces oscuras, dolor torácico, escalofríos, tos, fiebre, dolor o dificultad al orinar, disnea, odinofagia, aftas o lesiones labiales o bucales, adenopatías, lesiones purpúricas (principalmente con cefuroxima), fatiga o debilidad. Menos comunes o raros: cólicos y dolor abdominal (grave), diarrea (a veces disentería), urticaria, eritema, prurito o erupción cutánea, dolor, enrojecimiento e hinchazón en el sitio de inyección, descamación cutánea y convulsiones. Puede ocurrir colitis asociada a antibióticos con el uso de cefalosporinas de amplio espectro, particularmente las de segunda y de tercera generación. Después de suspender el tratamiento pueden aparecer algunos efectos secundarios raros que pueden requerir atención como: formación de ampollas, dermatosis, oliguria, pérdida o disminución de la capacidad auditiva (con cefuroxima), artralgias, pérdida del apetito, náuseas y/o vómitos (más frecuentes con ceftriaxona), eritema conjuntival, dificultad para respirar e ictericia. Algunos efectos secundarios que usualmente no requieren atención y pueden desaparecer durante el tratamiento son: diarrea (leve), cefalea, dolor en la boca o en la lengua, cólicos (leves), prurito y/o flujo vaginal"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cefuroxima_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "CARBAPENEMS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Imipenem",
                                descripcion =
                                "Imipenem/cilastatina | Frasco ampolla (IV) con 500 mg de imipenem y 500 mg de cilastatina sódica. El imipinem es parcialmente inactivado en el riñón. Por lo tanto, se asocia con cilastatina que bloquea el metabolismo renal del imipenem (cilastatina no tiene actividad antibacteriana ni afecta la actividad del imipenemp",
                                indicaciones = listOf(
                                    "Infecciones intrahospitalarias graves por bacterias Gram (+) y Gram (+) aeróbicas y anaeróbicas (no indicado en infecciones del SNC), incluyendo infecciones causadas por Pseudomonas resistentes y Acinetobacter sp, ver introducción a carbapenem. Las normas del MINSA la recomiendan en particular en las indicaciones siguientes:"
                                    ,"Septicemia x pseudomonas u otro agente nosocomial agresivo"
                                    ,"Alternativa en manejo de la neumonia intrahospitalaria grave"
                                    ,"Alternativa en sepsis intrahospitalaria en niños con foco respiratorio"
                                    ,"Alternativa en la pielonefritis de manejo hospitalario en embarazadas en caso de resistencia a ceftriaxona y falla de piperacilina/tazobactam"
                                ),
                                contraindicaciones = listOf(
                                    "Meningitis bacteriana en niños hipersensibilidad conocida a imipenem, otros derivados del carbapenem, o cualquier otro ingrediente en la formulación"
                                ),
                                precauciones = listOf(
                                    "Hipersensibilidad a otros betalactámicos (evitar si hay antecedente de hipersensibilidad inmediata); trastornos del sistema nervioso central como epilepsia; Insuficiencia renal reducir dosis si TFG <70mL/min./1.73 m²"
                                    ,"Interacciones: reduce la concentración plasmática del valproato (evitar uso concomitante)"
                                    ,"Embarazo: evitar en lo posible (categoria C de la FDA)"
                                    ,"Lactancia: se puede usar con precaución. Presente en la leche materna pero es improbable que sea absorbido a"
                                ),
                                dosificacion = listOf(
                                    "Por infusión IV (dosis en función del imipenem):"
                                    ,"ADULTOS: 500 mg cada 6 holg cada 8 h. Infección causada por Pseudomonas u otros microorganismos menos sensibles, infección que amenaza la vida o tratamiento empírico de las infecciones en pacientes con neutropenia febril: 1 g cada 6 h"
                                    ,"NIÑOS 1-2 meses: 20 mg/kg cada 6 h, ≥3 meses: 15 mg/kg (máx. 500 mg) cada 6 h"
                                    ,"Infección causada por Pseudomonas u otros microorganismos menos sensibles, infección que amenaza la vida o tratamiento empírico de la infección en pacientes febriles con neutropenia: 25 mg/kg (máx. 1 g) cada 6 h"
                                    ,"NEONATOS <7 días: 20 mg/kg cada 12 h, 7-20 dias: 20 mg/kg cada 8 h, 21-27 dias: 20 mg/kg cada 6 h"
                                    ,"Precaución para la administración:"
                                    ,"Reconstituir con 10 mL de SSN para formar una suspensión turbia. No administrar esta suspensión sin dilución adicional. Diluir aún más a 5 mg/mL con solución compatible para dar una solución clara. Para 500 mg o menos: administrar en más de 20-30 minutos. Más de 500 mg: administrar en más de 40-60 minutos "
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas (disminuyen al reducir la velocidad de infusión), vómitos, diarrea (raramente colitis asociada a antibióticos), eosinofilia, erupción cutánea (raramente necrõlisis epidérmica tóxica y sindrome de Stevens-Johnson). Menos comunes: hipotensión, convulsiones, actividad mioclónica, mareos, somnolencia, alucinaciones, confusión, leucopenia, trombocitopenia, trombocitosis, test de Coombs positivo. Raras: alteraciones del gusto, hepatitis, encefalopatia, reacciones anafilácticas, parestesias, temblores, insuficiencia renal aguda, poliuria, decoloración de los dientes, de la lengua o de la orina, pérdida de audición. Muy raras: dolor abdominal, acidez, glositis, taquicardia, palpitaciones, rubor, cianosis, disnea, hiperventilación, cefalea, astenia, anemia hemolitica, agravamiento de la miastenia gravis, poliartralgia, tinnitus, salivación excesiva e hiperhidrosis"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.imipenem_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Meropenem",
                                descripcion =
                                "Frasco ampolla de 500 mg, 1 g y 250 mg \n" +
                                        "El meropenem tiene un espectro antibacteriano similar a imipenem, ligeramente más activo frente a enterobacterias y un poco menos activo contra microorganismos Gram (+). No requiere ser asociado a cilastatina para conservar su actividad\n",
                                indicaciones = listOf(
                                    "Infecciones del tracto urinario superior en niños"
                                    ,"Sinusitis e impétigo en niños"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Insuficiencia renal"
                                    ,"TFG: 26-50 mL/min./1.73 m2: dosis normal cada 12 h"
                                    ,"TFG: 10-25 mL/min./1.73 m2: mitad de la dosis cada 12 h"
                                    ,"TFG <10 mL/min./1.73 m2: mitad de la dosis cada 24 h"
                                ),
                                dosificacion = listOf(
                                    "Mediante inyección IV durante 5 minutos o por infusión IV"
                                    ,"ADULTOS y NIÑOS >50 kg: 0.5-1 g cada 8 h"
                                    ,"NIÑOS de 3 meses-12 años: 60-120 mg/kg/d cada 8 h"
                                    ,"Exacerbaciones de enf. crónicas del tracto respiratorio inferior en la fibrosis quística o meningitis: 2 g cada 8 h"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas, vómitos, diarrea (colitis asociada a antibióticos), dolor abdominal, alteraciones de las pruebas hepáticas, cefalea, trombocitopenia, exantema, prurito; menos comunes: parestesia, eosinofilia, trombocitopenia, leucopenia y raramente convulsiones, anemia hemolítica, prueba de Coombs positiva, síndrome de Stevens-Johnson y necrólisis epidérmica tóxica"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.meropenem_1
                                    ,R.drawable.meropenem_2
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "MACROLIDOS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Azitromicina",
                                descripcion =
                                "Tabletas recubiertas 250 y 500 mg; Polvo para suspensión oral 200 mg/5 mL",
                                indicaciones = listOf(
                                    "ADULTOS y NIÑOS"
                                    ,"Infecciones por mycobacterias (no tuberculosis) del complejo M. avium (asociado a otro antibacteriano)"
                                    ,"Infecciones de piel y tejidos blandos"
                                    ,"Amigdalitis en caso de alergia a la penicilina"
                                    ,"Diarrea con deshidratación grave causada por V. cholerae"
                                    ,"Profilaxis para contactos directos de V. cholerae"
                                    ,"NIÑOS"
                                    ,"Alternativa en el impétigo"
                                    ,"ADULTOS"
                                    ,"Neumonía adquirida en la comunidad y alternativa en neumonía bacteriana agregada en infección por el virus de la influenza humana A H1N1  otitis media"
                                    ,"Clamidiasis y chancroide Manejo sindrómico de ITS dolor abdominal bajo (EIP), secreción uretral, ulcera genital, inflamación escrota, infección cervical"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad a macrólidos Enfermedad hepática grave"
                                ),
                                precauciones = listOf(
                                    "Pacientes con predisposición a la prolongación del intervalo QT (incluyendo alteraciones electrolíticas y uso concomitante de fármacos que prolongan el intervalo QT). Además, pacientes con miastenia gravis"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS, PO: 500 mg /d por 3 días 1"
                                    ,"En casos de cólera  clamidiasis y chancroide: 1 g oral id"
                                    ,"EIP: 1 g c/sem. por 2 sem además de ceftriaxona id"
                                    ,"Infección por complejo Mycobacterium avium, 600 mg PO c/sem"
                                    ,"NIÑOS, PO: 10 mg/kg id por 3 días (por 5 días para la prevención de la fiebre reumática en caso de amigdalitis)"
                                    ,"En caso de cólera, 20 mg/kg en dosis única"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Anorexia, dispepsia, flatulencia, mareos, cefalea, malestar general, parestesias, artralgias, trastornos del gusto y de la visión y estreñimiento. Menos frecuentes: gastritis, dolor de pecho, edema, ansiedad, trastornos del sueño, hipoestesia, leucopenia y fotosensibilidad. Raros: agitación, síncope, convulsiones, alteraciones olfatorias, nefritis intersticial, insuficiencia renal aguda, trombocitopenia, anemia hemolítica y decoloración de la lengua.Pérdida de audición reversible (a veces con tinnitus) después de grandes dosis y terapia a largo plazo"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.azitromicina_1
                                    ,R.drawable.azitromicina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Claritromicina",
                                descripcion =
                                "Tabletas de 500 mg; suspensión 250 mg/5 mL ",
                                indicaciones = listOf(
                                    "ADULTOS"
                                    ,"Alternativa a la azitromicina en neumonía adquirida en la comunidad ambulatoria y alternativa en la neumonía bacteriana agregada a infección por el virus de la influenza humana A H1N1 (en combinación con una penicilina)"
                                    ,"Erradicación de Helicobacter pylori"
                                    ,"Niños"
                                    ,"Profilaxis primaria para infecciones por mycobacterias no tuberculosis (dar asociado a otro antibacteriano) Tratamiento de infección diseminada causada por mycobacterias no tuberculosis"
                                    ,"Alternativa en infecciones de piel y tejidos blandos"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad a macrólidos "
                                ),
                                precauciones = listOf(
                                    "Insuficiencia hepática: riesgo de disfunción hepática incluyendo ictericia 1. \n" +
                                            "Insuficiencia renal: utilizar ½ de la dosis normal si TFG <30 mL/min./1.73 m2. \n" +
                                            "Interacciones incrementa la concentración plasmática de carbamacepina, atorvastatina; aumenta el riesgo de miopatía de la simvastatina, el efecto anticoagulante de los cumarínicos, el riesgo de arritmias ventriculares con saquanavir (evitar uso concomitante), inhibe el metabolismo de midazolam y probablemente el de los bloqueadores de los canales del calcio aumentando el riesgo de efectos adversos. La claritromicina oral reduce la absorción de zidovudina (tomar 2 horas aparte). El ritonavir aumenta la concentración plasmática de claritromicina\n"
                                    ,"Embarazo: evitar en lo posible"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 500 mg oral bid por 7 días"
                                    ,"NIÑOS: 15 mg/kg/d por 7 días"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Dispepsia, decoloración de dientes y lengua, alteraciones de la olfacción y el gusto, estomatitis, glositis y cefalea. Menos frecuentes: artralgias y mialgias. Raros: tinnitus. Muy raros: mareos, insomnio, pesadillas, ansiedad, confusión, psicosis, parestesias, convulsiones, hipoglucemia, insuficiencia renal, nefritis intersticial, leucopenia y trombocitopenia"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.claritromicina_1
                                    ,R.drawable.claritromicina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Eritromicina",
                                descripcion =
                                "Estearato de eritromicina tab. de 500 mg",
                                indicaciones = listOf(
                                    "Ruptura prematura de membranas en parto pretérmino, asociada a ampicilina o amoxicilina"
                                    ,"Alternativa a azitromicina en profilaxis a embarazadas que tuvieron contacto directo con casos de cólera"
                                    ,"Sífilis en gestantes alérgicas a penicilinas"
                                    ,"Acné grave"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad a eritromicina o cualquier macrólido"
                                    ,"Interacciones"
                                    ,"Aumenta la concentración plasmática de la teofilina, carbamacepina, midazolam. Puede inhibir el metabolismo de los bloqueadores de los canales de calcio (aumentando el riesgo de efectos secundarios). Evitar el uso concomitante con fluconazol"
                                    ,"Embarazo: se puede usar (Categoría B de la FDA)"
                                    ,"Lactancia: se puede usar; pequeñas cantidades en la leche"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "500 mg cada 8 h por 7 días 7; en sífilis temprana, por 14 días  La dosis habitual de 1-2/d, puede dividirse en 2-3 tomas al día 7"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Comunes: náuseas, vómitos, malestar abdominal y diarrea; son leves y menos frecuentes con azitromicina y claritromicina que con eritromicina. Menos frecuentes: hepatotoxicidad (incluyendo ictericia colestásica) y erupción cutánea. Raros o muy raros: pancreatitis, colitis asociada a antibióticos, prolongación del intervalo QT, arritmias, sínd. de Stevens-Johnson y necrólisis epidérmica tóxica"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.eritromicina_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "LINCOSAMINAS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Clindamicina",
                                descripcion =
                                "Cápsula de 300 mg; solución inyectable (FAM) de 150 mg/mL",
                                indicaciones = listOf(
                                    "ADULTOS Y NIÑOS"
                                    ,"Alternativa en neumonía aguda complicada Neumonía asociada a ventilación mecánica cuando se sospecha anaerobios"
                                    ,"Alternativa en infecciones con foco intraabdominal,incluyendo apendicitis aguda complicada (en asociación con otro antibacteriano)"
                                    ,"ADULTOS"
                                    ,"Alternativa en casos de politraumatizados, colecistitis aguda grave y la coledocolitiasis con colangitis no tóxica"
                                    ,"Alternativa en ruptura prematura de membranas en mujeres alérgicas a penicilinas y sospecha de anaerobio, y alternativa en la hemorragia postparto y retención placentaria"
                                    ,"Aborto séptico, cuando se sospecha anaerobios involucrados, endometritis, anexitis, tromboflebitis pélvica grave, shock séptico (sepsis grave), absceso pélvico, peritonitis pélvica, peritonitis generalizada, absceso intraabdominal, septicemia"
                                    ,"Alternativa en el absceso dentoalveolar que no ha respondido a la penicilina o metronidazol"
                                    ,"Alternativa en mastitis puerperal (3ra)"
                                    ,"Alternativa a cefazolina en antibioterapia profiláctica en la mayoría de los procedimientos quirúrgicos en caso de alergia a betalactámico"
                                    ,"NIÑOS"
                                    ,"Alternativa en osteomielitis y artritis séptica"
                                    ,"Alternativa en infecciones graves de piel y tejidos blandos como ectima y foliculitis extensa"
                                    ,"Alternativa en infecciones por Toxoplasma gondii (asociada a otros antimicrobianos)"
                                ),
                                contraindicaciones = listOf(
                                    "Episodios de diarrea; evitar inyecciones que contienen alcohol bencílico en neonatos (provoca jadeos “gasping” en neonatos prematuros)"
                                ),
                                precauciones = listOf(
                                    "Interrumpir inmediatamente si se desarrolla diarrea o colitis; monitorear las funciones hepática y renal en recién nacidos y lactantes y si el tratamiento es por más de 10 días, evitar la administración intravenosa rápida"
                                    ,"Interacciones"
                                    ,"Incrementa el efecto de los miorrelajantes no despolarizantes (pancuronio, vecuronio)"
                                    ,"Antagoniza el efecto de laneostigmina y de la piridostigmina"
                                    ,"Embarazo: se puede usar (Categoría B de la FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS IV, 900 mg c/8 h; endometritis y anexitis, 900 mg IV c/6 h. PO, 150-300 mg c/6 h, hasta 450 mg c/6 h en"
                                    ,"Infecciones graves"
                                    ,"NIÑOS IV; osteomielitis, artritis séptica, neumonía 40 mg/kg/d, IV en 4 dosis; septicemia y neumonía grave hasta 60 mg/kg/d, IV en 4 dosis; encefalitis por toxoplasmosis, 20-30 mg/kg/día en 4 dosis. PO: 3-6 mg/kg c/6 h 1"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Diarrea (suspender el tratamiento), molestias abdominales, esofagitis, úlceras esofágicas, alteraciones del gusto, náuseas, vómitos, colitis asociada a antibióticos, ictericia, leucopenia, eosinofilia, trombocitopenia, poliartritis. Además, exantema, prurito, urticaria, reacciones anafilácticas, síndrome de Stevens-Johnson, necrólisis epidérmica tóxica, dermatitis exfoliativa y versículo ampollosa. También dolor, induración y absceso en el sitio de inyección intramuscular; tromboflebitis después de inyección IV"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.clindamicina_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Clindamicina",
                                descripcion =
                                "Cápsula de 300 mg; solución inyectable (FAM) de 150 mg/mL",
                                indicaciones = listOf(
                                    "ADULTOS Y NIÑOS"
                                    ,"Alternativa en neumonía aguda complicada Neumonía asociada a ventilación mecánica cuando se sospecha anaerobios"
                                    ,"Alternativa en infecciones con foco intraabdominal,incluyendo apendicitis aguda complicada (en asociación con otro antibacteriano)"
                                    ,"ADULTOS"
                                    ,"Alternativa en casos de politraumatizados, colecistitis aguda grave y la coledocolitiasis con colangitis no tóxica"
                                    ,"Alternativa en ruptura prematura de membranas en mujeres alérgicas a penicilinas y sospecha de anaerobio, y alternativa en la hemorragia postparto y retención placentaria"
                                    ,"Aborto séptico, cuando se sospecha anaerobios involucrados, endometritis, anexitis, tromboflebitis pélvica grave, shock séptico (sepsis grave), absceso pélvico, peritonitis pélvica, peritonitis generalizada, absceso intraabdominal, septicemia"
                                    ,"Alternativa en el absceso dentoalveolar que no ha respondido a la penicilina o metronidazol"
                                    ,"Alternativa en mastitis puerperal (3ra)"
                                    ,"Alternativa a cefazolina en antibioterapia profiláctica en la mayoría de los procedimientos quirúrgicos en caso de alergia a betalactámico"
                                    ,"NIÑOS"
                                    ,"Alternativa en osteomielitis y artritis séptica"
                                    ,"Alternativa en infecciones graves de piel y tejidos blandos como ectima y foliculitis extensa"
                                    ,"Alternativa en infecciones por Toxoplasma gondii (asociada a otros antimicrobianos)"
                                ),
                                contraindicaciones = listOf(
                                    "Episodios de diarrea; evitar inyecciones que contienen alcohol bencílico en neonatos (provoca jadeos “gasping” en neonatos prematuros)"
                                ),
                                precauciones = listOf(
                                    "Interrumpir inmediatamente si se desarrolla diarrea o colitis; monitorear las funciones hepática y renal en recién nacidos y lactantes y si el tratamiento es por más de 10 días, evitar la administración intravenosa rápida"
                                    ,"Interacciones"
                                    ,"Incrementa el efecto de los miorrelajantes no despolarizantes (pancuronio, vecuronio)"
                                    ,"Antagoniza el efecto de laneostigmina y de la piridostigmina"
                                    ,"Embarazo: se puede usar (Categoría B de la FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS IV, 900 mg c/8 h; endometritis y anexitis, 900 mg IV c/6 h. PO, 150-300 mg c/6 h, hasta 450 mg c/6 h en"
                                    ,"Infecciones graves"
                                    ,"NIÑOS IV; osteomielitis, artritis séptica, neumonía 40 mg/kg/d, IV en 4 dosis; septicemia y neumonía grave hasta 60 mg/kg/d, IV en 4 dosis; encefalitis por toxoplasmosis, 20-30 mg/kg/día en 4 dosis. PO: 3-6 mg/kg c/6 h 1"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Diarrea (suspender el tratamiento), molestias abdominales, esofagitis, úlceras esofágicas, alteraciones del gusto, náuseas, vómitos, colitis asociada a antibióticos, ictericia, leucopenia, eosinofilia, trombocitopenia, poliartritis. Además, exantema, prurito, urticaria, reacciones anafilácticas, síndrome de Stevens-Johnson, necrólisis epidérmica tóxica, dermatitis exfoliativa y versículo ampollosa. También dolor, induración y absceso en el sitio de inyección intramuscular; tromboflebitis después de inyección IV"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.clindamicina_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "TETRACICLINAS Y CLORANFENICOL",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Doxiciclina",
                                descripcion =
                                "Tabletas y cápsulas de 100 mg",
                                indicaciones = listOf(
                                    "Como alternativa a un macrólido en la neumonía del adulto adquirida en la comunidad de manejo ambulatorio, asociado a un betalactámico"
                                    ,"Como alternativa a azitromicina en el manejo sindrómico de ITS del dolor abdominal bajo (EPI), cervicitis, secreción uretral , úlcera genital, bubón inguinal proctitis  (en la inflamación escrotal, es de 1ra elección)"
                                    ,"Sífilis en personas alérgicos a penicilina"
                                    ,"Prostatitis crónica, como alternativa a las fluoroquinolinas"
                                    ,"Brucelosis, asociado a rifampicina o aminoglucósido"
                                    ,"Acné moderado o grave que no responde a tratamiento oral"
                                ),
                                contraindicaciones = listOf(
                                    "No dar a niños <12 años, mujeres embarazadas o lactando debido a que el depósito del fármaco al calcio en huesos y dientes en desarrollo causa coloración y ocasionalmente hipoplasia del esmalte dental"
                                ),
                                precauciones = listOf(
                                    "Las tetraciclinas pueden aumentar la debilidad muscular en personas con miastenia gravis y exacerbar el lupus eritematoso sistémico. Evitar exposición a la luz solar durante el tratamiento (se ha reportado fotosensibilidad)"
                                    ,"Insuficiencia renal: usar con precaución"
                                    ,"Insuficiencia hepática: usar con precaución"
                                    ,"Usar con precaución en pacientes alcohólicos o que recibieron fármacos potencialmente hepatotóxicos"
                                    ,"Interacciones"
                                    ," Los antiácidos, el calcio, hierro, magnesio y zinc, disminuyen la absorción de las tetraciclinas. Ladoxiciclina incrementa el riesgo de toxicidad del metotrexate"
                                    ,"La rifampicina reduce la concentración plasmática de la doxiciclina. Las tetraciclinas pueden antagonizar el efecto de las penicilinas y aumentar el efecto anticoagulante de los cumarínicos"
                                    ,"Embarazo: no usar (Categoría D de la FDA)"
                                    ,"Lactancia: no usar"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 100 mg bid por 7 d (14 d para EIP, bubón inguinal, y úlcera genital por sífilis, 6-12 sem. para acné)"
                                    ,"NIÑOS >12 años: 2 mg/kg (máx. 100 mg) 2 veces al día el primer día, luego 2 mg/kg/d"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas, vómitos, diarrea (ocasionalmente colitis asociada a antibióticos), disfagia e irritación esofágica Raros: hepatotoxicidad, pancreatitis, alteraciones de la sangre, fotosensibilidad y reacciones de hipersensibilidad incluyendo erupción cutánea, dermatitis exfoliativa, síndrome de Stevens-Johnson, urticaria, angioedema, anafilaxia y pericarditis), cefalea, anorexia, sequedad de boca,enrojecimiento, ansiedad y tinnitus"
                                ),
                                imagenesResIds = listOf(
                                      R.drawable.doxiciclina_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                "Cloranfenicol",
                                descripcion =
                                "Polvo liofilizado para inyección de 1 g",
                                indicaciones = listOf(
                                    "En adultos y niños, reservado como alternativa para infecc. graves en la cuales antibióticos potencialmente menos tóxicos son inefectivos o contraindicados, especialmente las causadas por H. influenzae y la fiebre tifoidea"
                                    ,"Tosferina (con fiebre)"
                                    ,"Neumonía grave y muy grave o cuando presentan complicaciones (cardiopatía, retraso psicomotor, síndrome de Down, radiografía con focos)"
                                    ,"Apendicitis supurada + colección intraabdominal o complicada"
                                    ,"Neumonía aguda complicada, asociada a dicloxacilina"
                                    ,"Profilaxis antibiótica en fístula de LCR"
                                    ,"Septicemia y meningitis bacterianas"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad conocida a cloranfenicol. Historia previa de reacción tóxica al cloranfenicol"
                                ),
                                precauciones = listOf(
                                    "Realizar recuentos hematológicos antes y durante el tratamiento; controlar las concentraciones plasmáticas en neonatos"
                                    ,"Insuficiencia hepática y renal: reducir dosis"
                                    ,"Interacciones: aumenta el efecto anticoagulante de los cumarínicos y el efecto de las sulfonilureas. La rifampicina acelera el metabolismo del cloranfenicol, el fenobarbital puede acelerarlo"
                                    ,"Embarazo: evitar en lo posible  (Categoría C de la FDA)"
                                    ,"Lactancia: evitar en lo posible riesgo de toxicidad a la médula ósea"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: IV, 1 g c/6 h  6"
                                    ,"NIÑOS: IV, 50 mg/kg/d en 4 dosis 7. En infecciones graves (meningitis septicemia): 100 mg/kg/d en 4 dosis 7"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: náuseas, vómitos, sequedad de la boca, supresión reversible de la médula ósea, cefalea. Poco frecuentes: diarrea, glositis, estomatitis, enterocolitis depresión leve, colitis por antibióticos, confusión, delirio. Raros: neuropatía periférica, neuritis periférica, dermatitis de contacto, urticaria, angioedema, anafilaxia, destrucción ungueal (onicolisis), supresión irreversible de la médula ósea (anemia aplásica: leucopenia, trombocitopenia, anemia hemolítica y leucemia), hepatotoxicidad, atrofia y neuritis óptica, ototoxicidad, broncoespasmo, reacción de Jarisch-Herxheimer (a), acidosis metabólica y síndrome del niño gris (b)(a) Reacción aguda febril con frecuencia acompañada de escalofríos, fiebre, malestar general, náuseas, cefalea, mialgias y artralgias) (b) Vómitos, diarrea verdosa, distensión abdominal, hipotermia, cianosis pálida, respiración irregular, colapso circulatorio"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cloranfenicol_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "AMINOGLUCOSIDOS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Amikacina",
                                descripcion =
                                "Solución para inyección de 250 mg/1 mL (FAM de 2 mL) \n" +
                                        "Solución para inyección de 50 mg/1mL (FAM de 2 mL) \n",
                                indicaciones = listOf(
                                    "Infecciones graves por Gram (–) resistentes a gentamicina"
                                    ,"Alternativa en casos de neumonía grave y muy grave en niños y adolescentes y adultos, y neumonía intrahospitalaria no grave de inicio tardío"
                                    ,"Septicemia con foco intrahospitalario respiratorio en niños y adolescentes, septicemia neonatal (junto con otro antibacteriano)"
                                    ,"Artritis séptica y osteomielitis neonatal por Gram (–)"
                                    ,"Onfalitis diseminada (tratar como sepsis neonatal tardía)"
                                    ,"Manejo inicial de abdomen agudo con sospecha de contaminación peritoneal (peritonitis)"
                                    ,"Úlceras por presión, úlceras por insuficiencia venosa"
                                    ,"Alternativa de segunda línea en septicemia secundaria a complicaciones obstétricas  (shock séptico)"
                                ),
                                contraindicaciones = listOf(
                                    "Miasterina graves"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "En adultos o niños obesos, para evitar dosis excesivas, usar el peso ideal de acuerdo a la talla para el cálculo de la dosis"
                                    ,"ADULTOS:"
                                    ,"Régimen de dosis múltiples: IM, IV lento o por infusión (en 30-60 min): 15 mg/kg/d en 2 dosis, y hasta 22.5 mg/kg/d en 3 dosis en infecciones graves (máx. 1.5 y hasta 10 días, dosis cumulativa máx. 15 g)"
                                    ,"Régimen de dosis única cuando posible por infusión IV, inicialmente 15 mg/kg (máx. 1.5 g), luego ajustar según concentración sérica de amikacina, dosis cumulativa máx. 15 g"
                                    ,"Úlceras de presión: IV 1 g diario"
                                    ,"NIÑOS: IV lento: 1 mes a 12 años: 7.5 mg/kg c/12 h 12 a 18 años"
                                    ,"7.5 mg /kg. c/12 h y hasta c/8 h en infecciones graves. Máx. 500 mg c/8 h por máx.10 d (dosis cumulativa máx. 15 g)"
                                    ,"Régimen de dosis única, como en adultos"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Los más importantes son la nefrotoxicidad y la ototoxicidad irreversible (daño vestibular y auditivo). Un rash es común con estreptomicina, pero menos con los otros aminoglucósidos"
                                    ,"Efectos poco comunes: náuseas, vómitos, colitis asociada a antibióticos, neuropatía periférica, alteraciones electrolíticas (especialmente hipomagnesemia en tratamientos prolongados, hipocalcemia e hipopotasemia) y estomatitis"
                                    ,"Muy raros: trastornos de la sangre y efectos sobre el sistema nervioso central (cefalea, encefalopatía y convulsiones). Los amino-glucósidos pueden reducir la transmisión neuromuscular,  grandes dosis administradas durante la cirugía han sido responsables de síndrome miasténico transitorio en personas con función neuromuscular previamente normal"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.amikacina_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Gentamicina",
                                descripcion =
                                    "Solución para inyección 10 mg/1mL (FAM de 2 mL) y de 40 mg/1 mL (FAM de 2 mL)",
                                indicaciones = listOf(
                                    "Primera elección en neumonía grave y muy grave en niños de 1-3 meses (asociado a otro antibacteriano)"
                                    ,"Primera elección en sepsis de origen extrahospitalario con foco intra-abdominal en niños)"
                                    ,"Onfalitis localizada en niños pretérmino o con bajo peso al nacer y en infecciones por cateterización"
                                    ,"Sepsis neonatal (manejo empírico en caso de transmisión vertical o adquirida en la comunidad)"
                                    ,"Síndrome de dificultad respiratoria (SDR) del neonato"
                                    ,"Infecciones del tracto urinario en niños y neonatos(especialmente en alérgicos a cefalosporinas)"
                                    ,"Heridas por mordeduras de serpientes con antecedentes de manipulación (colocación de emplastos) en niños y adolescentes"
                                    ,"Primera elección en adultos con colecistitis aguda, coledocolitiasis, úlceras de presión infectadas"
                                    ,"Adultos con politraumatismo, apendicitis aguda"
                                    ,"Aborto séptico, endometritis, endomiometritis, anexitis y tromboflebitis pélvica grave"
                                    ,"Profilaxis en procedimientos quirúrgicos ginecológico en caso de alergia a cefalosporinas"
                                    ,"En la ruptura prematura de membrana si se sospecha infección ovular"
                                    ,"Septicemia en adultos, sepsis puerperal"
                                    ,"Infección de episiotomías o desgarros reparados, extracción manual de placenta retenida y corrección de inversión uterina"
                                ),
                                contraindicaciones = listOf(
                                    "Miastenia gravis"
                                    ,"Interacciones: además la gentamicina puede aumentar la concentración plasmática de digoxina"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: vía IM, inyección IV lenta (en por lo menos 3 minutos) o infusión IV (en 30 a 60 min): 5-7 mg/kg id, o 3-5 mg/kg/día en 3 dosis 1"
                                    ,"NIÑOS: por vía IV. 7 mg en dosis única 3,4 o <12 años: 2.5 mg/kg c/8 h, >12 años, 2 mg c/8 h 4"
                                    ,"NEONATO a término: vía IV: 4-5 mg/kg id, o 2.5 mg/kg bid"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Los más importantes son la nefrotoxicidad y la ototoxicidad irreversible (daño vestibular y auditivo). Un rash es común con estreptomicina, pero menos con los otros aminoglucósidos"
                                    ,"Efectos poco comunes: náuseas, vómitos, colitis asociada a antibióticos, neuropatía periférica, alteraciones electrolíticas (especialmente hipomagnesemia en tratamientos prolongados, hipocalcemia e hipopotasemia) y estomatitis"
                                    ,"Muy raros: trastornos de la sangre y efectos sobre el sistema nervioso central (cefalea, encefalopatía y convulsiones). Los amino-glucósidos pueden reducir la transmisión neuromuscular,  grandes dosis administradas durante la cirugía han sido responsables de síndrome miasténico transitorio en personas con función neuromuscular previamente normal"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.gentamicina_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "SULFONAMIDAS Y TRIMETOPRIM",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Sulfadiazina",
                                descripcion =
                                    "Tableta de 500 mg",
                                indicaciones = listOf(
                                    "Profilaxis y tratamiento de infección oportunista por Toxoplasma gondii en personas afectadas por el VIH"
                                ),
                                contraindicaciones = listOf(
                                    "Sensibilidad a las sulfonamidas"
                                ),
                                precauciones = listOf(
                                    "Insuficiencia hepática: usar con cuidado en insuficiencia leve a moderada evitar en casos de deterioro grave"
                                    ,"Insuficiencia renal: usar con cuidado en insuficiencia leve a moderada evitar en casos de deterioro grave; alto riesgo de cristaluria"
                                    ,"Interacciones"
                                    ,"La sulfadiazina puede reducir la concentración de ciclosporina. Como otras sulfamidas: aumenta el riesgo de nefrotoxicidad con ciclosporina, de cristaluria con metenamina, aumenta el efecto anticoagulante de los cumarínicos, la toxicidad del metotrexate; aumenta el efecto del tiopental (barbitúrico) y raramente, el de las sulfonilureas. Con pirimetamina aumenta el efecto antifolatos de las sulfamidas"
                                    ,"Embarazo: evitar en lo posible. (Categoría C de la FDA)"
                                    ,"Riesgo de hemólisis neonatal y metahemoglobinemia en el tercer trimestre, no existe evidencia sólida de un aumento de kernicterus"
                                    ,"Lactancia: Evitar en lo posible. Pequeño riesgo de kernicterus en recién nacidos con ictericia y de hemólisis en niños con deficiencia de G6PD"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 500 mg PO c/6 h (asociada a pirimetamina en toxoplasmosis)"
                                    ,"NIÑOS: Toxoplasmosis congénita, 50 mg/kg bid (asociada a pirimetamina) durante 12 meses"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Ver trimetoprim sulfametoxazol, además: con el uso de sulfadiazina se ha reportado hipotiroidismo, hipertensión intracraneal benigna y neuropatía óptica"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.sulfadiazina_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Cotrimoxazol",
                                descripcion =
                                    "Trimetroprim sulfametoxazol (Cotrimoxazol) | " +
                                        "Tableta de 80 mg de TMP + 400 mg de SMX; \n" +
                                        "Tableta forte 160 mg de TMP + 800 mg de SMX; \n" +
                                        "Suspensión oral de 40 mg de TMP + 200 mg SMX/5 mL; \n" +
                                        "Solución inyectable de 16 mg de TMP + 80 mg de SMX/1 mL (FAM 5-10 mL) \n",
                                indicaciones = listOf(
                                    "Tratamiento y profilaxis de la neumonía por Pneumocystis jirovecii (Carinii), en adultos y niños con VIH/Sida * 1,3"
                                    ,"Profilaxis para T. gondii en personas con VIH/sida * 3"
                                    ,"Nocardiosis"
                                ),
                                contraindicaciones = listOf(
                                    "Sensibilidad a las sulfonamidas"
                                ),
                                precauciones = listOf(
                                    "Mantener ingesta adecuada de líquidos durante su administración; evitar en trastornos hematológicos (a menos que se administre bajo supervisión de un especialista); monitorear recuentos celulares sanguíneos en tratamientos prolongados; retirar de inmediato si aparecen alteraciones de la sangre o exantemas cutáneos; evitar en predisposición a la deficiencia de folatos, hiperpotasemia en ancianos, asma, deficiencia de G6PD; además, evitar en lactantes <6 semanas (excepto para el tratamiento o profilaxis de la neumonía por Pneumocystis)"
                                    ,"Insuficiencia hepática: evitar en la enfermedad hepática grave"
                                    ,"Insuficiencia renal: utilizar la mitad de la dosis normal si TFG entre 15-30 mL/min./1.73 m2; evitar si TFG <15 mL/min./1.73 m2 y si la concentración plasmática de sulfametoxazol no se puede monitorear"
                                    ,"Interacciones del sulfametoxazol: aumenta el riesgo de toxicidad hemática con azatioprina, mercaptopurina y metotrexato"
                                    ,"Interacciones de las sulfonamidas del trimetoprim: aumenta la concentración plasmática de lamivudina (evitar uso concomitante con altas dosis de cotrimoxazol) y de difenilhidantoína. La difenilhidantoína aumenta el efecto antifolatos del trimetoprim"
                                    ,"Embarazo: evitar  (Categoría C de la FDA) Riesgo teratógeno en el primer trimestre. Puede producir hemólisis y metahemo- globinemia neonatal cuando se administra en el 3er trimestre. El temor a un riesgo  aumentado de kernicterus en el neonato no parece justificarse"
                                    ,"Lactancia: se puede usar excepto si el lactante tiene ictericia (bajo riesgo de hemolisis) o deficiencia en G6PD (bajo riesgo de hemolisis por el sulfametoxazol"
                                ),
                                dosificacion = listOf(
                                    "PO o IV"
                                    ,"ADULTOS y NIÑOS >40 kg: 160 mg TMP+800 mg SMX bid"
                                    ,"Tratamiento de neumonía por Pneumocystis jirovecii (antes carinii): 20/100 mg/kg/d en 2-4 dosis por 14 a 21 d"
                                    ,"Profilaxis de infecciones por Pneumocystis jirovecii: 160/800 mg id. Para mejorar tolerancia usar: 160 mg/800 mg, 3 veces a la sem. (días alternos) o reducir dosis a 80/400 mg/d 1"
                                    ,"NIÑOS <40 kg: 8/40 mg/kg/d en 2 dosis"
                                    ,"Tratamiento de neumonía por Pneumocystis jirovecii:"
                                    ,"NIÑOS >1 mes: 20/100 mg/kg/d en 2-4 dosis por 14-21 d"
                                    ,"Profilaxis de infecciones por Pneumocystis jirovecii (antes carinii): 6 sem-5 meses: 20/100 mg bid por 3 d a la semana (consecutivos o alternos)"
                                    ,"6 meses-5 años: 40/200 mg; 6-12 años: 80/400 mg"
                                    ,"Iniciar a la 6ta semana de nacido. Se debe continuar profilaxis con T. sulfametoxazol hasta el 1er año de vida excepto cuando la infección por VIH haya sido descartada. La profilaxis se mantiene después del 1er año solamente en niños infectados"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas, diarrea, cefalea e hiperpotasemia, exantema cutáneo (incluyendo muy raramente sínd. de Stevens-Johnson), necrólisis epidérmica tóxica y fotosensibilidad (interrumpir la administración inmediatamente). Menos frecuentes: vómitos. Muy raramente glositis, estomatitis, anorexia, daño hepático (incluyendo ictericia y necrosis hepática), pancreatitis, colitis asociada a antibióticos, miocarditis, tos y problemas respiratorios, infiltrados pulmonares, meningitis aséptica, depresión, convulsiones, neuropatía periférica, ataxia, tinnitus, vértigo, alucinaciones, hipoglucemia, alteraciones hematológicas (incluyendo leucopenia, trombocitopenia, anemia megaloblástica y eosinofilia), hiponatremia. Además, trastornos renales incluyendo nefritis intersticial; artralgias, mialgias, vasculitis, lupus eritematoso sistémico y uveítis, rabdomiólisis en personas con VIH"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.cotrimoxazol_1
                                    ,R.drawable.cotrimoxazol_2
                                    ,R.drawable.cotrimoxazol_3
                                    ,R.drawable.cotrimoxazol_4
                                )
                            ),
                        )
                    )
                )
            ),

            Capitulo(
                nombre = "Gastroenterologia",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "DISPERSIA Y REFLUJO GASTROESOFAGICO",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Omeprazol",
                                descripcion =
                                    "Inhibidor de bomba de protones (IBP) de las células parietales del estómago, \n" +
                                            "inhibe la secreción ácida en el estómago. \n" +
                                            "Frasco ampolla con polvo liofilizado 40 mg y tableta o capsula de 20 mg \n",
                                indicaciones = listOf(
                                    "Dispepsia asociada con acidez"
                                    ,"Enfermedad por reflujo gastro–esofágico"
                                    ,"Enfermedad ulcerosa péptica (incluyendo la erradicación de H. pylori y el seguimiento postendoscópico de la hemorragia grave por ulceración)"
                                    ,"Profilaxis en pacientes con antecedentes de úlcera, lesiones gastrointestinales o dispepsia asociada a AINE y requieren tratamiento continuo con AINE"
                                    ,"Profilaxis de úlcera de estrés en pacientes hospitalizados con condición de riesgo"
                                    ,"Ventilación mecánica, coagulopatía, trauma cerebral, quemaduras graves politraumatismo, sepsis, insuficiencia renal aguda (B) Pacientes en UCI con índice de gravedad de trauma >15 o requerimientos de dosis altas de corticoide >250 mg de hidrocortisona o equivalente"
                                    ,"Síndrome de Zollinger–Ellison"
                                    ,"Profilaxis de aspiración ácida durante anestesia general (C)"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Descartar cáncer gástrico antes de iniciar tratamiento en pacientes con dispepsia y signos de alarma Los pacientes con osteoporosis deberán mantener una adecuada ingesta de calcio y vitamina D. La medición de la concentración sérica de magnesio debe considerarse antes o durante un tratamiento prolongado sobre todo cuando se administran en combinación con otros medicamentos que causen hipomagnesemia o con digoxina"
                                    ,"El omeprazol debe ser prescrito para las indicaciones adecuadas en la dosis eficaz más baja durante el menor tiempo posible, la necesidad de tratamiento a largo plazo debe ser revisado periódicamente"
                                    ,"Insuficiencia hepática: reducir la dosis (no más de 20 mg diario)"
                                    ,"Insuficiencia renal: no es necesario corregir la dosis"
                                    ,"Interacciones:"
                                    ,"El omeprazol reduce el efecto antiplaquetario del clopidogrel, puede aumentar el efecto anticoagulante de los cumarínicos, aumenta la concentración plasmática de saquinavir, reduce la de atazanavir, puede reducir la concentración plasmática de itraconazol y la excreción de metotrexato (aumento del riesgo de toxicidad)"
                                    ,"Embarazo: se puede usar(Categoría C de FDA)"
                                    ,"Lactancia: se puede usar. Presente en la leche, pero es poco probable que sea dañino"
                                ),
                                dosificacion = listOf(
                                    "VÍA ORAL"
                                    ,"En la mayoría de las indicaciones se recomienda habitualmente una dosis única por la mañana antes de comer, sin embargo, la absorción no está afectada significativamente con la comida"
                                    ,"Dispepsia asociada con acidez: 1020 mg PO id por 2 a 4 semanas"
                                    ,"Enfermedad por reflujo gastroesofágico: 20 mg PO id por 4 sem., si curación incompleta continuar por otras 48 sem"
                                    ,"Enfermedad ulcerosa péptica: 20 mg PO id (40 mg para casos graves), por 4 semanas en casos de úlcera duodenal y 8 semanas en la úlcera gástrica. Luego puede necesitarse dosis de mantenimiento de 10 a 40 mg PO id, pero por un tiempo limitado"
                                    ,"Erradicación de H. pylori se combina con terapia antibiótica (triple terapia) en dosis de 20 mg bid PO por 1 semana, seguida de omeprazol solo por 4 a 8 semanas 6"
                                    ,"Úlcera asociada a tratamiento con AINE: 20 mg PO id por 4 semanas si curación incompleta seguir por 4 semanas más - Profilaxis en pacientes con antecedentes de úlcera, lesiones gastrointestinales o dispepsia asociada a AINE y requieren tratamiento continuo con AINE: 20 mg id mientras dure el tratamiento con AINE 1"
                                    ,"Profilaxis de aspiración ácida durante anestesia general: 40 mg PO la noche anterior y 40 mg de 26 horas antes del procedimiento quirúrgico 6"
                                    ,"Síndrome de ZollingerEllison: inicialmente 60 mg PO id, luego de 20120 mg id (si la dosis es >80 mg, dar bid)"
                                    ,"IV lenta en 5 min"
                                    ,"INFUSIÓN en 2030 min. en 100 mL de SSN 0.9% o DW 5%"
                                    ,"Tratamiento y prevención de ulcera péptica y reflujo gastro esofágico: 40 mg id hasta que la vía PO sea posible"
                                    ,"Síndrome de ZollingerEllison: inicialmente 60 mg id, ajustar luego según respuesta (si dosis es >80 mg, dar bid)"
                                    ,"Sangrados graves por úlcera péptica (después de tratamiento endoscópico): se inicia con una infusión IV de 80 mg en 4060 min. y luego una infusión continua de 8 mg/h por 72 h (luego pasar a vía PO)"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Son poco comunes, principalmente dolor de cabeza y molestias gastrointestinales (incluyen náuseas, vómitos, dolor abdominal, flatulencia, diarrea, estreñimiento) Menos frecuentes: boca seca, edema periférico, mareos, trastornos del sueño, fatiga, parestesia, artralgia, mialgia, erupción y prurito. Raros: alteraciones del gusto, estomatitis, hepatitis, ictericia, reacciones de hipersensibilidad (incluyendo anafilaxia, broncoespasmo), fiebre, depresión, alucinaciones, confusión, ginecomastia, nefritis intersticial, hiponatremia, hipomagne semia (generalmente después de 1 año de tratamiento, pero a veces después de 3 meses de tratamiento), trastornos de la sangre (incluyendo la leucocitosis, leucopenia, trombocito penia, pancitopenia), alteraciones visuales, sudoración, fotosensibilidad, alopecia, síndrome StevensJohnson y necrólisis epidérmica tóxica"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.omeprazol_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Ranitidina",
                                descripcion =
                                    "Antagonista de los receptores H2 de la histamina\n" +
                                            "Tableta o cápsula de 300 mg; solución para inyectar, 25 mg/mL, ampolla de 2 mL\n",
                                indicaciones = listOf(
                                    "Como alternativa al omeprazol en:"
                                    ,"Manejo de úlcera gástrica o duodenal benigna (incluida la asociada a H. pylori)8 (B)"
                                    ,"Profilaxis de úlcera duodenal en tratamientos con AINE 8(B)"
                                    ,"Enfermedad por reflujo gastro–esofágico 8 (B)9,10"
                                    ,"Profilaxis de úlceras por stress  8 (A)11"
                                    ,"Dispepsia crónica episódica 8 (A)9"
                                    ,"Profilaxis de aspiración ácida (anestesia general, inicio del trabajo de parto) (C)1,8"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Descartar cáncer gástrico antes de iniciar tratamiento enpacientes con dispepsia y síntomas de alarma"
                                    ,"Insuficiencia renal: usar la mitad de la dosis si TFG <50 mL/min"
                                ),
                                dosificacion = listOf(
                                    "Ulceras benignas gástricas o duodenales, dispepsia episódica crónica:"
                                    ,"ADULTOS Y NIÑOS >12 años: 300 mg PO al acostarse o 150 mg PO bid inicialmente al menos por 4-8 sem. Mantenimiento (si necesaria): 150 mg PO al acostarse"
                                    ,"NIÑOS <12 años: 2-4 mg/kg (máx. 150 mg) bid por 4-8 sem"
                                    ,"Profilaxis de úlcera duodenal en tratamientos con AINE:"
                                    ,"ADULTOS Y NIÑOS>12 años: PO 300 mg bid durante el tiempo que dure la terapia"
                                    ,"Reflujo gastro-esofágico: ADULTOS Y NIÑOS >12 años: 300 mg PO al acostarse o 150 mg bid por 8-12 semanas (casos moderado a graves, hasta 600 mg PO en 2 dosis hasta por 12 semanas). Dosis de mantenimiento: 150 mg PO bid. NIÑOS 3-12 años: 2.5 a 5 mg/kg (máx. 300 mg) PO bid"
                                    ,"Profilaxis de úlceras por stress: ADULTOS Y NIÑOS >12 años: IV lenta en al menos 2 min, 50 mg diluidos en 20 mL cada 8h y con dosis oral de 150 mg PO bid al reiniciar la vía oral"
                                    ,"Profilaxis de aspiración ácida en obstetricia: 150 mg PO al iniciar el trabajo de parto, seguida de una dosis similar cada 6 horas. En procedimientos quirúrgicos: 150 mg PO, 2 h antes de la inducción de la anestesia PO y si es posible la noche previa. Alternativamente vía IM o IV lento: 50 mg diluidos en 20 mL, 45-60 min. antes de inducir la anestesia 1"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Son muy poco comunes: diarrea, dolor de cabeza y mareos. Menos frecuentes: visión borrosa, rash (incluyendo eritema multiforme y necrólisis epidérmica toxica). Raros o muy raros: hepatitis, ictericia colestásica, bradicardia, reacciones psiquiátricas (incluyendo confusión depresión y alucinaciones) especialmente en los ancianos o pacientes muy enfermos, alteraciones hematológicas (incluyendo leucopenias, trombocitopenia y pancitopenia), artralgia y mialgia, pancreatitis, movimientos involuntarios, nefritis intersticial y alopecia 1"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ranitidina_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "Medicamentos usados en la diarrea",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "SRO",
                                descripcion =
                                    "Sales de rehidratación oral (SRO) | Sales para preparar solución para rehidratación por vía oral Polvo para solución estándar hipoosmolar (245 mOsm/L) que contiene: cloruro de sodio: 2.6 g/L, glucosa anhidra: 13.5 g/L cloruro de potasio: 1.5 g/L, citrato trisódico: 2.9 g/L. Sobre de 20.5 g",
                                indicaciones = listOf(
                                    "Prevención y tratamiento de deshidratación en enfermedad diarreica aguda incluyendo cólera * (A)5"
                                    ,""
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Insuficiencia renal anuria u oligúrica, obstrucción intestinal o en deshidratación grave donde está recomendada la terapia parenteral. No agregar azúcar u otros aditivos a la solución"
                                    ,"Embarazo y lactancia: usar con cuidado 2. Categoría C de FDA"
                                ),
                                dosificacion = listOf(
                                    "Según si se desea prevenir o tratar la deshidratación, con base en los planes recomendados por las normas. (planes A, B o bien seguimiento a un plan C que evoluciona satisfactoriamente). Para el plan B, la cantidad aproximada necesaria (en mL) puede calcularse multiplicando el peso (en kilos) por 100 mL para 4 horas"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Vómitos (que pueden indicar una administración demasiado rápida), hipernatremia e hipercalemia los cuales pueden resultar de sobredosis en pacientes con IRC (este efecto es raro en pacientes con función normal) 2,6"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.sro_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Zinc",
                                descripcion =
                                    "Sal mineral tableta de 20mg",
                                indicaciones = listOf(
                                    "Adyuvante en tratamiento de diarrea aguda en niños *(A)"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Insuficiencia renal aguda (puede acumularse)"
                                ),
                                dosificacion = listOf(
                                    "NIÑOS < 6 meses: 10 mg (no dar en niños emaciados) id por 14 d *, 6 meses-4 años: 20 mg id por 14 d"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Dolor abdominal, dispepsia, náuseas, vómito, diarrea, irritación gástrica, gastritis, en particular al administrarlo con el estómago vacío, irritabilidad, dolor de cabeza, letargia"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.zinc_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Loperamida",
                                descripcion =
                                    "Derivado sintético de la petidina (opioide) Tabletas o capsulas de 2 mg",
                                indicaciones = listOf(
                                    "Tratamiento sintomático de diarrea aguda en adultos 7(B)8"
                                    ,"Tratamiento de diarrea crónica en adultos 7(B)9"
                                ),
                                contraindicaciones = listOf(
                                    "No usar en diarrea aguda en niños"
                                    ,"No usar en condiciones donde la inhibición de la peristalsis debe ser evitada como en casos de íleo o constipación, así como en distensión abdominal, enfermedad intestinal inflamatoria aguda o colitis asociada con antibióticos, ni en pacientes con disentería"
                                ),
                                precauciones = listOf(
                                    "Interacciones: puede incrementar la absorción de desmopresina. Itraconazol, gemfibrozilo, ritonavir y cotrimoxazol aumentan los efectos de loperamida. El uso concomitante con quinidina puede provocar depresión respiratoria"
                                    ,"Embarazo: se puede usar en caso de diarrea aguda, evitar en caso de diarrea crónica 12. Categoría C de FDA"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "Diarrea aguda: iniciar con 4 mg PO, seguido de 2 mg PO después de cada deposición suelta, hasta por 5 días, sin pasar de 16 mg diarios. Dosis habitual: 6 a 8 mg/d"
                                    ,"Diarrea crónica: 4-8 mg/d en dosis divididas y posteriormente ajustar según respuesta en 2 dosis diarias sin pasar de 16 mg/d. Si no se observa mejoria después 10 días con la dosis máxima, prolongar el tratamiento no aporta probablemente ningún beneficio"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Nauseas, flatulencia, dolor de cabeza, mareos, menos comunes: dispepsia, vómitos, dolor abdominal, sequedad de boca, somnolencia, erupción cutánea. Raramente: síndrome de Steven-Johnson, necrólisis epidérmica toxica, íleo paralitico, fatiga, hipertonía, retención urinaria"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.loperamida_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "Laxantes",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Lactulosa",
                                descripcion =
                                    "Disacárido semi-sintético que no se absorbe en tracto gastro-intestinal. Suspensión oral 3.1-3.7g/5 mL",
                                indicaciones = listOf(
                                    "Constipación 2 * (B)3"
                                    ,"Encefalopatía hepática 2 (A)4"
                                ),
                                contraindicaciones = listOf(
                                    "Galactosemia y obstrucción intestinal"
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de intolerancia a la lactosa y en la diabetes"
                                    ,"Embarazo: se puede usar"
                                    ,"Lactancia: se puede usar con precaución"
                                ),
                                dosificacion = listOf(
                                    "Constipación: iniciar con 15 mL bid, ajustando la dosis de acuerdo a la respuesta"
                                    ,"NIÑOS menores de 1 año: 2.5 mL bid; 1 a 5 años: 2.5 a 10 mL bid; 5 a 18 años: 5 a 20mL bid; en cada caso deberá ajustarse la dosis 2"
                                    ,"Encefalopatía hepática: 30-50 mL tid, ajustando la dosis para provocar 2 a 3 deposiciones suaves al día"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas (se puede reducir al administrar con agua, jugo de frutas o alimentos), vómito, flatulencia, calambres y molestias intestinales y abdominales"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.lactulosa_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Aceite",
                                descripcion =
                                    "Aceite mineral | Lubricante y suavizante de las heces, Solución oral (oleosa)",
                                indicaciones = listOf(
                                    "Tratamiento sintomático de constipación 6 (B)3"
                                ),
                                contraindicaciones = listOf(
                                    "Niños menores de 3 años 7"
                                ),
                                precauciones = listOf(
                                    "Evitar el uso prolongado"
                                    ,"Embarazo: evitar si es posible. (Categoría C de la FDA)"
                                ),
                                dosificacion = listOf(
                                    "Constipación: 10 a 30 mL diario PO en dosis divididas preferentemente antes del desayuno y en la noche"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Filtración anal de aceite mineral y la consiguiente irritación anal después de uso prolongado, reacciones granulomatosas causadas por absorción de pequeñas cantidades de aceite mineral (especialmente de la emulsión), neumonía lipoidea e interferencia con la absorción de vitaminas liposolubles"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.aceite_1
                                    ,R.drawable.aceite_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Enema",
                                descripcion =
                                    "Enema de fosfato y bifosfato sódico | Laxante osmótico por vía rectal Solución rectal: 6-16 g",
                                indicaciones = listOf(
                                    "Constipación"
                                    ,"Evacuación intestinal antes de procedimientos radiológicos, endoscópicos y quirúrgicos"
                                ),
                                contraindicaciones = listOf(
                                    "Enfermedades gastrointestinales agudas (como obstrucción, enfermedad inflamatoria intestinal, condiciones donde está aumentada la absorción en el colon)"
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en personas muy ancianas o debilitadas. En alteraciones electrolíticas, insuficiencia cardiaca congestiva, ascitis, hipertensión no controlada, insuficiencia renal crónica. Debe mantenerse una adecuada hidratación 8"
                                    ,"Embarazo: se puede usar. (Categoría C de la FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS Y NIÑOS >12 años: consultar recomendaciones del fabricante"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Irritacion local y alteraciones electroliticas"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.enema_1
                                )
                            ),
                        )
                    ),
                    Subgrupo(
                        nombre = "Medicamentos usados en nauseas y vomitos",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Metoclopramida",
                                descripcion =
                                    "Antiemético y procinético de acción central Solución inyectable 10 mg/mL, frasco ampolla de 2 mL. Tab. de 10 mg",
                                indicaciones = listOf(
                                    "Nausea y vómitos en desordenes gastrointestinales"
                                    ,"Náusea y vómitos asociados a migraña (B)"
                                    ,"Reflujo gastro-esofágico (C)"
                                    ,"Gastroparesia"
                                    ,"Premedicación para cirugías y post-operatorio  (B)"
                                    ,"Adyuvante en intubación gastrointestinal (C)"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "No se recomienda en niños y adolescente hasta 18 años Usar con cuidado en ancianos (iniciar con dosis bajas) 4, en caso de alergia atópica (incluyendo asma), desordenes de la conducción cardíaca, epilepsia. Puede enmascarardesórdenes subyacentes como la irritación cerebral"
                                    ,"Insuficiencia hepática: reducir la dosis"
                                    ,"Insuficiencia renal grave: usar dosis baja para disminuir riesgo de efectos"
                                    ,"Extrapiramidales"
                                    ,"Embarazo: puede usarse. (Categoría B de la FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "Náusea y vómito en reflujo gastro-esofágico y gastroparesia, PO, IM o IV lento (1-2 min.) ADULTOS: 10 mg tid"
                                    ,"Premedicación quirúrgica por inyección IV lenta ADULTOS: 10 mg id"
                                    ,"Tratamiento con citotóxicos (dosis son mayores de las usuales): 1-2 mg/kg en infusión IV en 30 min., según la intensidad de las náuseas y vómitos, previo a la administración del tratamiento citostático, o de 10-40 mg PO, seguido de dosis cada 2-3 h según el caso"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Efectos extrapiramidales (sobre todo en niños y adultos jóvenes, ocurren pronto después del inicio del tratamiento y pueden permanecer hasta 24 h después de suspenderlo), hiperprolactinemia, ocasionalmente discinesia tardía con tratamientos prolongados, disnea, ansiedad, confusión, somnolencia, mareos, temblores, inquietud, cefalea, diarrea, depresión, síndrome neuroléptico maligno"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.metoclopramida_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Dimenhidrinato",
                                descripcion =
                                    "Antihistamínico sedativo \n" +
                                            "Tableta de 50 mg. Solución para inyección de 50 mg/mL\n",
                                indicaciones = listOf(
                                    "Prevención y tratamiento de cinetosis"
                                    ,"Manejo sintomático de náuseas y vómito en la enfermedad\n" +
                                            "de Ménière y otros desórdenes del laberinto\n"
                                    ,"Náuseas y vómitos asociados a embarazo"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Embarazo: se puede usar  Categoría B de FDA"
                                    ,"Lactancia: evitar"
                                ),
                                dosificacion = listOf(
                                    "ORAL:"
                                    ,"ADULTOS: 50-100 mg PO tid. En cinetosis la primera dosis debe darse 30 minutos antes de iniciar el viaje"
                                    ,"NIÑOS de 2-6 años, 12.5-25 mg PO tid. Máx.: 75 mg/día"
                                    ,"6-12 años, 25-50 mg PO tid. Máx.: 150 mg/día"
                                    ,"PARENTERAL (IM o IV lenta)"
                                    ,"ADULTOS: 50 mg. NIÑOS: 1.25 mg/kg dosis tid"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: El más común es la somnolencia aunque la estimulación paradójica puede ocurrir en raras ocasiones, especialmente con dosis altas o en niños y ancianos. La somnolencia puede disminuir después de unos días de tratamiento y es mucho menos problemática con los nuevos antihistamínicos (Ej. loratadina)"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.dimenidrato_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Ondansetron",
                                descripcion =
                                    "Antiemético del grupo de los antagonistas de los receptores para serotonina 5HT3\n" +
                                            "Tabletas de 8 mg, solución para inyección 2 mg/mL, suspensión 4 mg/5mL\n",
                                indicaciones = listOf(
                                    "Náusea y vómito asociados a quimio o radioterapia"
                                    ,"Prevención y tratamiento de náusea y vómito postoperatorio"
                                ),
                                contraindicaciones = listOf(
                                    "Síndrome de QT prolongado congénito"
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de susceptibilidad a la prolongación de intervalo QT, obstrucción intestinal subaguda, cirugía adeno-tonsilar"
                                    ,"En insuficiencia hepática moderada o grave: limitar la dosis a 8 mg/día"
                                    ,"Interacciones: Con apomorfina, puede aumentar el efecto hipotensivo; carbamazepina, fenitoína y rifampicina aceleranel metabolismo de ondansetrón y pueden reducir su efecto"
                                    ,"Embarazo: evitar en lo posible (Categoría B de la FDA)"
                                    ,"Lactancia: evitar"
                                ),
                                dosificacion = listOf(
                                    "Radio o quimioterapia moderadamente emetogénica"
                                    ,"ADULTOS: PO 8 mg 1-2 h antes del tratamiento. IM o IV lenta, 8 mg inmediatamente antes de iniciar el tratamiento. Luego PO 8 mg bid hasta por 5 días"
                                    ,"Quimioterapia altamente emetogénica. ADULTOS: IM o IV lenta, 8 mg inmediatamente antes del inicio de la quimioterapia. Cuando fuera necesario continuar con 2 bolos de 8 mg con intervalos de 2-4 h o 1 mg/h en infusión continua IV por hasta 24 h. Luego 8 mg PO bid hasta por 5 días"
                                    ,"Náusea y vomito inducido por quimioterapia. NIÑOS de 6 meses a 18 años: infusión IV por al menos 15 min., 5 mg/m2 (máx. 8 mg) inmediatamente antes del inicio de la quimioterapia. Luego, en niños con superficie corporal (SC) <0.6 m2, dar 2 mg PO bid por 5 días; niños con SC ≥0.6 m2 4 mg PO bid hasta por 5 días. Máx.: 32 mg/d"
                                    ,"Alternativamente: infusión IV durante al menos 15 min, 150 mcg/kg (máx. 8 mg) inmediatamente antes de la quimioterapia repetida dos veces cada 4 h, luego si se requiere, dar PO bid por hasta 5 días: si peso ≤10 kg, 2 mg; si peso >10 kg: 4 mg. Máx: 32 mg/d"
                                    ,"Prevención de náusea y vómito post-operatorio"
                                    ,"ADULTOS:"
                                    ,"PO 16 mg 1 h antes de la anestesia u 8 mg antes de la anestesia seguida por hasta 2 dosis de 8 mg cada 8 h"
                                    ,"Alternativamente, por via IM o IV lenta 4 mg al momento de la inducción de la anestesia"
                                    ,"NIÑOS de 1 mes a 18 años: IV lenta en al menos 30 seg., 100 mcg/kg (máx. 4 mg) antes durante y después de la inducción de la anestesia"
                                    ,"Tratamiento de náuseas y vómitos post-quirúrgicos. IM o IV lenta 4 mg. NIÑOS de 1 mes a 18 años: IV lenta hasta por 30 seg., 100 mcg/kg (máx. 4 mg)"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Constipación, cefalea, rubor, reacciones locales en el sitio de inyección. Menos comunes: hipo, bradicardia, hipotensión, dolor en el pecho, arritmias, desordenes del movimiento y convulsiones. Con la administración IV, raramente: somnolencia, alteraciones visuales transitorias, muy raramente ceguera transitoria"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ondansetron_1
                                )
                            ),
                        )
                    ),
                )
            ),

            Capitulo(
                nombre = "NEUMOLOGIA Y ALERGIA",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "Broncodilatadores",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Ipratropio",
                                descripcion =
                                    "Bromuro de ipratropio | Broncodilatador anticolinérgico de acción corta\n" +
                                            "Solución para aerosol al 0.02% (20 µg /dosis inhalada), fco. de 200 dosis.\n" +
                                            "Solución para nebulizar al 0.25% (250 µg/mL), fco. de 20 mL\n",
                                indicaciones = listOf(
                                    "Solución para nebulizar"
                                    ,"Crisis de asma grave que pone en peligro la vida, en asociación con los β2 agonistas *(A)"
                                    ,"Crisis de asma grave con pobre respuesta a β2 agonistas"
                                    ,"Obstrucción reversible de las vías respiratorias"
                                    ,"En EPOC"
                                    ,"Inhalación por aerosol"
                                    ,"EPOC leve: para el alivio de la disnea y mejorar tolerancia al ejercicio, como alternativa al salbutamol spray 8 (B)"
                                    ,"EPOC: de manera continua en caso de disnea persistente o exacerbaciones si no se dispone de anticolinérgico de acción larga  (ej. tiotropio) (B)"
                                ),
                                contraindicaciones = listOf(
                                    "Hipersensibilidad conocida a la atropina o sus derivados, o al bromuro de ipratropio. Pacientes con arritmias preexistentes y otros problemas cardíacos"
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de hipertrofia prostática, obstrucción de la vesícula y susceptibilidad al glaucoma de ángulo cerrado"
                                    ,"Interacciones: no hay interacción notable con la forma inhalada"
                                    ,"Embarazo: se puede usar  (Categoría B de FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "Crisis de asma grave (nebulización)"
                                    ,"ADULTOS: añadir 0.5 mg de ipratropio al salbutamol, puede repetirse a los 15 min. y luego cada 4-6 h"
                                    ,"NIÑOS <12 años: en las primeras 2 h nebulizar con 250 µg de ipratropio + 5 mg de salbutamol y luego cada 20-30 min"
                                    ,"Si hay buena respuesta clínica, reducir la dosis de ipratropio en 4-6 h o descontinuar"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: boca seca (el más común), estreñimiento y diarrea, tos, dolor de cabeza; Menos frecuentes: reflujo gastroesofágico, disfagia, irritación de garganta, faringitis, disfonía, estomatitis, taquicardia, palpitaciones, fibrilación auricular, broncoespasmo paradójico, retención urinaria, midriasis, glaucoma de ángulo cerrado, visión borrosa, mareo, prurito, vómitos, espasmos de la laringe, estomatitis; Raros: caries dental o piel seca 8"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ipratropio_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Salbutamol",
                                descripcion =
                                    "β2 agonista de acción corta\n" +
                                            "Solución para aerosol, 100 µg/inhalación. Fco 200-250 dosis.\n" +
                                            "Solución para nebulizar al 5%, 5 mg/mL. Fco 20 mL, diluir con SSN estéril 8\n",
                                indicaciones = listOf(
                                    "Asma agudo tanto en adultos como en niños de todas edades (de primera elección)"
                                    ,"Crisis de sibilancia en menores de 5 años"
                                    ,"Profilaxis y tratamiento de asma inducido por el ejercicio"
                                    ,"Exacerbaciones agudas de EPOC"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de hipertiroidismo, enfermedad cardiovascular, arritmias, susceptibilidad a la prolongación del intervalo QT, hipertensión, diabetes. Monitorear el potasio sérico en el asma grave por el riesgo de hipopotasemia favorecido por otros medicamentos y la hipoxia"
                                    ,"Interacciones: riesgo aumentado de hipopotasemia cuando altas dosis de β2 agonista se usan con teofilina, corticoides o diuréticos"
                                    ,"Embarazo: se puede usar (Categoría C de FDA)"
                                    ,"Lactancia: se puede usar"
                                ),
                                dosificacion = listOf(
                                    "La dosis para nebulizar es sustancialmente mayor que la que se da por aerosol"
                                    ,"Crisis de asma, sibilancias o exacerbación de EPOC"
                                    ,"Inhalación por aerosol"
                                    ,"ADULTOS y NIÑOS: 100-200 µg (1-2 puff). Si persisten los síntomas hasta qid 5,8"
                                    ,"Inhalación de solución nebulizada  158 Asma y EPOC"
                                    ,"Inhalación de solución nebulizada"
                                    ,"ADULTOS y NIÑOS >5 años: 2.5-5 mg, repetir hasta qid o con mayor frecuencia en casos graves"
                                    ,"NIÑOS <5 años: 2.5 mg, repetir hasta qid o con mayor frecuencia en los casos graves"
                                    ,"Profilaxis del broncoespasmo inducido por alérgeno o ejercicio:"
                                    ,"ADULTOS: 200 µg (2 puff)"
                                    ,"NIÑOS: 100-200 µg (1-2 puff)"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: temblor fino (sobre todo en las manos), tensión nerviosa, dolor de cabeza, calambres musculares y palpitaciones; Menos frecuentes: taquicardia, arritmias, vasodilatación periférica, isquemia miocárdica, y trastornos del sueño y del comportamiento; Raros: broncoespasmo paradójico (ocasionalmente grave), urticaria, angioedema, hipotensión y colapso. Dosis altas se asocian con hipopotasemia"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.salbutamol_1
                                )
                            ),
                        )
                    ),
                )
            ),

            // Demas capitulos

            //Capitulo 15
            Capitulo(
                nombre = "Analgésicos, antipiréticos antiinflamatorios",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "ANALGÉSICOS NO OPIÁCEOS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Paracetamol",
                                descripcion =
                                "Analgésico antipirético sin efecto antiinflamatorio Tableta 500 mg, jarabe 120 mg/5 mL gotas 100 mg/1 mL. Supositorio 300 mg ",
                                indicaciones = listOf(
                                    "Dolor leve a moderado * incluyendo ataque agudo demigraña y cefalea tensional (A) • Fiebre (A)* "
                                ),
                                contraindicaciones = listOf(

                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de alcoholismo, insuficiencia hepática (dosis máxima diaria de 3 g), desnutrición crónica o deshidratación."
                                    ,"Interacciones: la absorción del paracetamol es aumentada por la metoclopramida; el uso prolongado de paracetamol puede aumentar el efecto anticoagulante de la warfarina, el metabolismo del paracetamol puede ser aumentado por carbamacepina, fenitoína y fenobarbital (raros casos de hepatotoxicidad reportados)."
                                    ,"Embarazo: se puede usar 2. (Categoría B de la FDA) Lactancia: se puede usar 2."
                                ),
                                dosificacion = listOf(
                                    "POR VIA ORAL O RECTAL"
                                    ,"Fiebre post vacunación: NIÑOS 2-3 meses: 60 mg seguidos de una segunda dosis, si es necesario 4-6 h más tarde."
                                    ,"Dolor leve a moderado, fiebre: ADULTOS 0.5-1 g cada 4-6 h (máx. 4 g/d)1 NIÑOS: 15 mg/kg/dosis cada 4-6 h según necesidad 1 o según la edad: 3 meses-1 año: 60-125 mg, 1-5 años: 120-250 mg, 6-12 años: 250-500 mg (estas dosis se pueden repetir cada 4-6 h si necesario. Máx. 4 dosis o 4 g/día)."
                                    ,"NEONATOS: 10 mg/kg tid o qid según necesidad. 4 dosis máximo por día. En caso de ictericia se puede usar 5 mg/kg/dosis 2"
                                ),
                                dosificacionImagenes = listOf(

                                ),
                                efectosAdversos = listOf(
                                    "Raros: erupciones cutáneas, trastornos hematológicos (trom- bocitopenia, leucopenia, neutropenia)."
                                    ,"SOBREDOSIS E INTOXICACIÓN: la administración de 10 a 15 g o 150 mg/kg en 24 h puede provocar necrosis hepática grave. Los únicos síntomas de intoxicación pueden ser náuseas y vómitos, los cuales pueden tardar hasta 24 h para producirse. En caso de sobredosificación o intoxicación ocurrida en las últimas 24 horas referir urgente al hospital sin esperar estos síntomas. El antídoto (acetilcisteína)."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.paracetamol_1
                                    ,R.drawable.paracetamol_2
                                    ,R.drawable.paracetamol_3
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Antiinflamatorios no esteroideos (AINE)",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Diclofenaco",
                                descripcion =
                                    "Diclofenaco sódico | Antiinflamatorio no esteroideo Tableta de 50 mg, solución 25 mg/1 mL.(ampolla de 3 mL) para inyección IM.",
                                indicaciones = listOf(
                                    "Dolor e inflamación en artritis reumatoidea (incluida reumatoidea idiopática juvenil) y otros trastornos musculo esqueléticos."
                                    ,"Gota aguda."
                                    ,"Dolor post operatorio."
                                    ,"Cólico renal."
                                ),
                                contraindicaciones = listOf(
                                    "No se debe dar AINE en pacientes con historia de hipersensi- bilidad a la aspirina o cualquier otro AINE, lo cual incluye aquellos en quienes un ataque de asma, angioedema, urticaria o rinitis han sido precipitados por aspirina u otro AINE."
                                ),
                                precauciones = listOf(
                                    "Los AINE deben ser usados con precaución en ancianos (riesgo de efectos adversos graves y muerte), desórdenes alérgicos, defectos de la coagulación, pacientes con desórdenes del tejido conectivo, insuficiencia cardíaca o renal, hipertensión no controlada, insuficiencia cardíaca, enfermedad arterial periférica, enfermedad cerebrovascula."
                                ),
                                dosificacion = listOf(
                                    "Inflamación y dolor leve a moderado"
                                    ,"ADULTOS: PO: 75–150 mg/d divididos en 2-3 dosis."
                                    ,"NIÑOS 6 meses - 18 años: 0.3-1 mg/kg (máx. 50 mg) en 3 dosis."
                                    ,"Dolor e inflamación en artritis reumatoidea (incluida reumatoidea idiopática juvenil):"
                                    ,"NIÑOS (6 meses-18 años): IM: 1.5-2.5 mg/kg, máx. 75 mg, 1 o 2 veces al día por un máximo de 2 días."
                                    ,"Dolor postoperatorio y exacerbaciones severas del dolor: ADULTOS: 75 mg IM una vez al día (dos veces al día en casos graves), máximo hasta dos días."
                                    ,"NIÑOS 2-18 años: IM: 0.3-1 mg/kg id o bid por un máx. de 2 días (máx.150 mg/día)"
                                    ,"Cólico renal: 75 mg IM profundo, aplicar segunda dosis después de 30 min si es necesario."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Todos los AINE son asociados con seria toxicidad gastro-intestinal, el riesgo es mayor en ancianos. Riesgo intermedio."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.diclofenaco_1
                                    ,R.drawable.diclofenaco_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Dipirona",
                                descripcion =
                                    "AINE, derivado de pirazolona usado principalmente por su actividad analgésica y antipirética. Solución inyectable de 500 mg/1 mL.",
                                indicaciones = listOf(
                                        "Debido al riesgo de efectos adversos graves, en muchos países se considera que su uso sólo se justifica en el dolor intenso o fiebre cuando no exista otra alternativa disponible o adecuada."
                                        ,"Dolor posquirúrgico (alternativa a otros analgésicos)."
                                        ,"Cólico renal como alternativa a otros analgésicos."
                                ),
                                contraindicaciones = listOf(
                                    "Úlcera péptica; insuficiencia renal o hepática grave, sensibilidad a las pirazolonas, hemopatías, disfunción cardíaca, hipertensión, déficit congénito de G6PD."
                                ),
                                precauciones = listOf(
                                    "La administración intravenosa debe realizarse lentamente."
                                    ,"Usar con cuidado en pacientes que sufren de asma bronquial o infecc. crónicas de las vías respiratorias. Cuando existe fiebre anormalmente elevada y/o se administra demasiado rápido la inyección, puede producirse un descenso crítico de la tensión arterial sin otros síntomas de reacción de hipersensibilidad."
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 0.5 a 4 g IM/IV diarios en dosis divididas"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Raras: reacciones de hipersensibilidad incluyendo shock anafiláctico (estas reacciones pueden ocurrir inmediatamente y hasta una hora después de la administración), agranulocitosis. Puede presentarse dolor en el sitio de la inyección, especialmente luego del uso IM."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.dipirona_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Ibuprofeno",
                                descripcion =
                                    "Antiinflamatorio no esteroideo Tableta 400 mg.",
                                indicaciones = listOf(
                                    "Dolor e inflamación en enfermedad reumática y otros trastornos musculo esqueléticos incluyendo artritis reumatoide juvenil."
                                    ,"Dolor leve a moderado, incluyendo dismenorrea."
                                    ,"Dolor dental"
                                    ,"Analgesia post operatoria"
                                    ,"Fiebre asociada a malestar y dolor en niños"
                                    ,"Crisis aguda de migraña"
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "Dolor moderado a grave, fiebre, enfermedad inflamatoria musculo esquelética: PO, ADULTOS: 400 mg cada 6-8 h Aumentar si es necesario hasta un máximo de 2.4 g (3.2 g en enfermedad inflamatoria). Mantenimiento: 0.6-1.2 g/día."
                                    ,"Artritis juvenil:"
                                    ,"PO: NIÑOS>3 meses: 30 – 40 mg/kg/dia en 3 - 4 dosis."
                                    ,"Dolor en niños > 3meses: 20-40 mg/kg día ; 1-2 años: 50 mg; 3-7 años: 100 mg; 8-12 años: 200 mg 3 veces al día. No se recomienda para niños menores de 5 kg."
                                    ,"ORIENTACIÓN AL PACIENTE: Tomar con o después de la comida."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Raras: reacciones de hipersensibilidad incluyendo shock anafiláctico (estas reacciones pueden ocurrir inmediatamente y hasta una hora después de la administración), agranulocitosis. Puede presentarse dolor en el sitio de la inyección, especialmente luego del uso IM."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.ibuprofeno_1
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Analgésicos Opiáceos",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Codeina",
                                descripcion =
                                    "Analgésico opiáceo débil Tableta de 30 mg; solución oral 10 mg/5 mL.",
                                indicaciones = listOf(
                                    "Manejo del dolor leve a moderado, en cuidados paliativo (Se asocia a menudo con acetaminofén o AINE)."
                                    ,"Antidiarréico 21 para diarreas secretoras de causa inespecífica en cuidados paliativos"
                                    ,"Supresor de la tos 21, en caso de tos incesante con peligro de paro respiratorio en la tosferina."
                                ),
                                contraindicaciones = listOf(
                                    "Depresión respiratoria aguda, riesgo de íleo paralitico, situaciones asociadas con presión intracraneal elevada y en el trauma cráneo encefálico (afecta las respuestas pupilares para la evaluación neurológica), estado comatoso, abdomen agudo y retraso en el vaciamiento gástrico, falla cardíaca secundaria a enfermedad pulmonar crónica."
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en caso de insuficiencia renal y hepática, arritmias cardíacas, abdomen agudo y cálculos biliares."
                                ),
                                dosificacion = listOf(

                                ),
                                dosificacionImagenes = listOf(

                                ),
                                efectosAdversos = listOf(

                                ),
                                imagenesResIds = listOf(
                                    R.drawable.codeina_1
                                    ,R.drawable.codeina_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Morfina",
                                descripcion =
                                    "Analgésico opiáceo fuerte Solución de 20 mg/1mL ampolla de 1 a 2 mL para inyección IM/IV tableta de 10 mg, tab de liberación prolongada de 60 mg; Solución oral de 10 mg/5 mL Fco 100 mL.",
                                indicaciones = listOf(
                                    "Dolor agudo grave."
                                    ,"Dolor crónico en particular en cuidados paliativos."
                                    ,"Premedicación anestésica."
                                    ,"Infarto agudo al miocardio."
                                    ,"Dolor post operatorio."
                                    ,"Tos en pacientes terminales."
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "Dolor agudo:"
                                    ,"Via SC (excepto en caso de edema) o IM, ADULTOS: 10 mg (ancianos o muy delgados: 5 mg) cada 4 h (o más frecuentemente inicialmente si es necesario), ajustar dosis según respuesta. NIÑOS 1-6 meses iniciar 100-200 mcg/kg cada 6 h; 6 meses-2 años: iniciar 100-200 mcg/kg cada 4 h; 2-12 años: iniciar 200 mcg/kg cada 4 h; 12-18 años: iniciar 2.5-10 mg cada 4 h, todas las dosis ajustadas según respuesta. NEONATOS : iniciar 100 mcg/kg cada 6 h."
                                    ,"Inyección IV lenta, ADULTOS: iniciar con 5 mg (reducir la dosis en personas de edad avanzada o débiles) cada 4 h (o con mayor frecuencia durante la titulación), ajustada según respuesta; NIÑO 1-6 meses: iniciar con 100 mcg/kg cada 6 horas, ajustados según respuesta; 6 meses-12 años: inicialmente 100 mcg/kg cada 4 h, ajustados según respuesta."
                                    ,"Infarto agudo de miocardio: IV lento (1-2 mg/min.) iniciar con 5-10 mg, seguido de 5-10 mg más si es necesario. ANCIANOS y personas muy delgadas: reducir la dosis a la mitad."
                                    ,"Edema agudo de pulmón: IV lento (2 mg/min.): 5-10 mg. ANCIANOS y personas muy delgadas: reducir la dosis a la mitad."
                                    ,"Dolor crónico: PO, por vía SC (excepto en caso de edema) o IM: 5-10 mg cada 4 h, ajustar dosis según respuesta."
                                    ,"Premedicación, vía SC o IM, hasta 10 mg 60–90 min antes de la operación. NIÑOS por via IM, 150 mcg/kg"
                                    ,"Tos en pacientes terminales: inicialmente 5 mg cada 4 h."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Íleo  paralítico, dolor abdominal, anorexia, dispepsia, exacerbación de la pancreatitis, alteración del gusto, síncope; broncoespasmo, inhibición del reflejo de la tos; inquietud, convulsiones, parestesia, astenia, malestar, desorientación, excitación, agitación, delirio, aumento presión intracraneal,"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.morfina_1
                                    ,R.drawable.morfina_2
                                    ,R.drawable.morfina_3
                                    ,R.drawable.morfina_4
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Medicamentos para tratar la gota",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Alopurinol",
                                descripcion =
                                    "Uricosúrico Tableta de 300 y de 100 mg.",
                                indicaciones = listOf(
                                    "Profilaxis secundaria de la gota (recurrente) y de cálculos renales de oxalato de calcio."
                                    ,"Profilaxis de la hiperuricemia asociada a quimioterapia del Cáncer."
                                    ,"Nota: El alopurinol no está indicado en la hiperuricemia asintomática."
                                ),
                                contraindicaciones = listOf(
                                    "Gota aguda: no es un tratamiento para la crisis aguda pero continuarlo si ya lo estaba tomando cuando ocurre la crisis."
                                ),
                                precauciones = listOf(
                                    "El inicio del tratamiento puede precipitar una crisis aguda, por lo que se recomienda administrar un AINE a dosis adecuada como profiláctico y continuar por al menos un mes después de la corrección de la hiperuricemia (considerar la necesidad de protección gástrica con omeprazol), asegurar ingesta adecuada de líquidos (2-3 litros/día)."
                                ),
                                dosificacion = listOf(
                                    "Iniciar 1-2 semanas mínimo después de un ataque agudo haya desaparecido. ADULTOS: Inicialmente 100 mg PO id., preferiblemente después de la comida. Ajustar luego en función de la concentración plasmática (≤6 mg/100mL) o urinaria. Dosis habitual de mantenimiento en condición leve 100-200 mg/d, moderada 300-600 mg/d, severa 700- 900 mg/d; dosis de más de 300 mg/d en dosis divididas."
                                    ,"Profilaxis de la hiperuricemia asociada a quimioterapia: ADULTOS: igual que para la profilaxis de la gota, ajustados según la respuesta, a iniciar 24 h antes del tratamiento del cáncer y continuar hasta 7-10 días después. NIÑOS <15 años: 10-20 mg/kg/d (máx. 400 mg/d)."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Más frecuente: rash, (suspender inmediatamente si ocurre) . A veces trastornos gastrointestinales, malestar general, dolor de cabeza, vértigo, somnolencia, alteraciones visuales y del gusto, hipertensión, alopecia."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.alopurinol_1
                                    ,R.drawable.alopurinol_2
                                )
                            )
                        )
                    )
                )
            ),

            //Capitulo 16
            Capitulo(
                nombre = "ENDOCRINOLOGÍA",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "corticoides",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Betametasona",
                                descripcion =
                                    "Betametasona (dipropionato + fosfato sódico) Paracetamol (acetaminofén) | Glucocorticoide de acción rápida y prolongada. Solución 5 mg+2 mg/1 mL, para inyección IM, intralesional, ampolla de 1 a 2 mL.",
                                indicaciones = listOf(
                                    "Enfermedad inflamatoria intestinal crónica"
                                    ,"Síndrome nefrótico en niños."
                                    ,"Tratamiento del Síndrome Inflamatorio de Reconstitución Inmunológica (SIRI) en pacientes con VIH"
                                    ,"Meningitis tuberculosa."
                                    ,"Neonatos con toxoplasmosis sintomática o trombocitopenia "
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "No inyectar en el tendón de Aquiles."
                                    ,"Esta presentación no es para uso IV, ni intradérmico."
                                ),
                                dosificacion = listOf(
                                    "IM profunda en el glúteo: 1 a 2 mL."
                                    ,"Inyección intralesional: 0.5 a 2 mL, dependiendo del tipo de lesión o tamaño articula."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.betametasona_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Dexametasona",
                                descripcion =
                                    "Dexametasona (fosfato sódico) | Glucocorticoide con actividad mineralocorticoide insignificante Solución para inyección 4 mg/mL tableta de 0.5 mg.",
                                indicaciones = listOf(
                                    "Hiperplasia adrenal congénita."
                                    ,"Desordenes alérgicos o inflamatorios."
                                    ,"Enfermedad reumática."
                                    ,"Maduración pulmonar fetal en la APP y preeclampsia (útil solamente entre las 24 y 346/7 semanas de gestación)."
                                    ,"Crup."
                                    ,"Meningitis bacteriana."
                                    ,"Intoxicación por Paraquat."
                                    ,"Nausea y vómito asociado a quimioterapia."
                                    ,"Edema cerebral asociado a cáncer."
                                    ,"Varias afecciones en cuidados paliativos (ver sección dosificación)."
                                ),
                                contraindicaciones = listOf(
                                    "Cobertura de corticoide en caso de estrés:"
                                    ,"Para compensar una respuesta adrenocortical reducida cau- sada por el tratamiento prolongado con corticoide, cualquier enfermedad significativa intercurrente, trauma o procedi- miento quirúrgico requiere un aumento temporal de la dosis de corticoide"
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "PO: dosis habitual: ADULTOS: 0.5-10 mg/día NIÑOS 10-100 mcg/kg/d."
                                    ,"Vía IM o IV lenta o infusión. ADULTOS 0.4-20 mg; NIÑOS 200-400 mcg/kg/d 3."
                                    ,"Maduración pulmonar del feto en la APP y preeclampsia:"
                                    ,"6 mg cada 12 h por 2 días (4 dosis)*"
                                    ,"Crup leve o moderado: 150 mcg/kg PO dosis única y repetir la dosis al ingreso en hospital y 12 horas después si se considera necesario"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Dosis demasiado altas o el uso prolongado pueden exagerar la acción fisiológica de los corticoides."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.dexametasona_1
                                    ,R.drawable.dexametasona_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Hidrocortisona",
                                descripcion =
                                    "Hidrocortisona (succinato sódico) | Glucocorticoide con actividad mineralocorticoide relativamente alta Polvo liofilizado estéril de 500 mg para inyección IM o IV",
                                indicaciones = listOf(
                                    "Insuficiencia adrenal."
                                    ,"Choque."
                                    ,"Reacciones de hipersensibilidad (incluyendo anafilaxis)."
                                    ,"Adjunto en asma grave si no se puede usar la vía oral."
                                    ,"Tratamientos de complicaciones neonatales (ver dosificación)"
                                    ,"Pericarditis por intoxicación por fosfina."
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Cobertura de corticoide en caso de estrés:"
                                    ,"Para compensar una respuesta adrenocortical reducida cau- sada por el tratamiento prolongado con corticoide, cualquier enfermedad significativa intercurrente, trauma o procedi- miento quirúrgico requiere un aumento temporal de la dosis de corticoide, o reintroducción temporal del tratamiento si ya fue interrumpido."
                                ),
                                dosificacion = listOf(
                                    "Por vía IM o IV lento o en infusión:"
                                    ,"ADULTOS: 100 a 500 mg, 3-4 veces en 24 horas o como sea necesario. NIÑOS por inyección IV lenta, <1 año: 25 mg, 1-5 años: 50 mg, 6 -12 años: 100 mg 3."
                                    ,"Insuficiencia adrenal: 2 mg/kg IV lento seguida de infusión 0.18 mg/kg/hora"
                                    ,"Choque: 2 a 8 mg/kg/dosis IV lento qid o infusión 0.18 mg/kg/h."
                                    ,"Reacciones de hipersensibilidad : 10 mg/kg/dosis."
                                    ,"Shock anafiláctico:1-15 mg/kg/día dividida entre 4 dosis IV lento."
                                    ,"Como adjunto en asma severa si no se puede usar la vía oral: 100-200 mg, IV lento."
                                    ,"Tratamientos de complicaciones neonatales :"
                                    ,"Hipoglucemia grave y persistente: 5 mg/kg/d durante 3-5d"
                                    ,"Hipercalcemia: 10 mg/kg/d."
                                    ,"Hemorragia moderada o grave en hijos de madres con púrpura: 5-10 mg/kg/d en 3 dosis."
                                    ,"Pericarditis por intoxicación por fosfina: 500 mg c/6 h IV lento."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Dosis demasiado altas o el uso prolongado pueden exagerar la acción fisiológica de los corticoides."
                                    ,"Efectos mineralocorticoides: hipertensión, retención de sodio y agua y pérdida de potasio y calcio, son más significativos con la hidrocortisona."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.hidrocortisona_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Metilprednisolona",
                                descripcion =
                                    "Glucocorticoide Suspensión acuosa 40 mg/mL (acetato) para inyecciones IM, IV, IA Polvo estéril 500 mg (succinato) para inyección IM, IV.",
                                indicaciones = listOf(
                                    "Condiciones alérgicas severas."
                                    ,"Choque (incluyendo choque alérgico)."
                                    ,"Asma bronquial grave cuando no se puede usar vía oral."
                                    ,"Edema cerebral asociado a malignidad."
                                    ,"Enfermedad reumática"
                                    ,"Tratamientos de complicaciones neonatales (ver dosificación)."
                                    ,"Intoxicación por plaguicidas."
                                    ,"Síndrome nefrítico en niños "
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Cobertura de corticoide en caso de estrés:"
                                    ,"Para compensar una respuesta adrenocortical reducida cau- sada por el tratamiento prolongado con corticoide, cualquier enfermedad significativa intercurrente, trauma o procedi- miento quirúrgico requiere un aumento temporal de la dosis de corticoide, o reintroducción temporal del tratamiento si ya fue interrumpido."
                                ),
                                dosificacion = listOf(
                                    "Vía IM o IV lenta; inicialmente 10–500 mg"
                                    ,"Choque: 1-2 mg/kg/día dividida en 3-4 dosis."
                                    ,"Asma bronquial grave: 2 mg/kg/dosis (máx: 80 mg) continuando con 1 mg/kg/dosis c/6 h."
                                    ,"Complicaciones neonatales:"
                                    ,"Hipercalcemia: 2 mg/kg/día."
                                    ,"Hemorragia moderada o grave en hijos de madres con púrpura 10-15 mg/kg/día."
                                    ,"Infecciones en neonato 1.5 mg/kg día en 2 dosis."
                                    ,"Intoxicación por Paraquat® 15 mg/kg/día diluido en 200 mL de DW5% a pasar en 2 h."
                                    ,"Intoxicación por fosfina. 1-2 mg/kg *"
                                    ,"Síndrome nefrítico en niños. bolo de 15 mg/kg"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Efectos mineralocorticoides: hipertensión, retención de sodio y agua y pérdida de potasio y calcio (ocurre levemente)."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.metilprednisolona_1
                                    ,R.drawable.metilprednisolona_2
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Prednisolona",
                                descripcion =
                                    "Prednisolona y prednisona | Corticosteroides con acción predominante glucocorticoide. Prednisolona: solución oral 15 mg/5 mL. Prednisona: tableta de 5 mg, tableta ranurada de 50 mg.",
                                indicaciones = listOf(
                                    "Desordenes inflamatorios y alérgicos."
                                    ,"Asma bronquial y crisis de sibilancias en niños >2 meses."
                                    ,"Enfermedad reumática."
                                    ,"Crup."
                                    ,"Enfermedad inflamatoria intestinal crónica."
                                    ,"Tratamiento del Síndrome Inflamatorio de Reconstitución Inmunológica (SIRI) en pacientes con VIH."
                                    ,"Meningitis tuberculosa."
                                    ,"Neonatos con toxoplasmosis sintomática o trombocitopenia."
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Cobertura de corticoide en caso de estrés:"
                                    ,"Para compensar una respuesta adrenocortical reducida cau- sada por el tratamiento prolongado con corticoide, cualquier enfermedad significativa intercurrente, trauma o procedi- miento quirúrgico requiere un aumento temporal de la dosis de corticoide, o reintroducción temporal del tratamiento si ya fue interrumpido."
                                ),
                                dosificacion = listOf(
                                    "En general, inicialmente 10-20 mg PO diario (en casos de enfermedad grave hasta 60 mg) con dosis de mantenimiento de 2.5 a 15 mg diario PO por días a sem. según respuesta."
                                    ,"Artritis reumática moderada o severa: 7.5 mg id por al menos 2 años 3."
                                    ,"Crup moderado: dosis única de 1-2 mg/kg PO 3."
                                    ,"Crisis aguda de asma bronquial: 1 mg/kg id, por 5 días."
                                    ,"En crisis graves y embarazo 20-40 mg cada 12 h *"
                                    ,"Urticaria severa: 40 mg diario por 3 a 5 días 11."
                                    ,"Lupus Eritematoso Sistémico y sus crisis. 1-2 mg/kg/día *"
                                    ,"Síndrome nefrótico en niños. 60 mg/m2/día por 4-8 semanas según respuesta."
                                    ,"Neumonía grave por neumocistis. 1 mg/kg/d (40 mg c/12 h) por 5 d, seguida de 40 mg id por 5 días y 20 mg id por 11 d *"
                                    ,"Meningitis tuberculosa. 1 mg/kg/día por 1 a 2 semanas y reducirlos gradualmente *"
                                    ,"Tratamiento de Síndrome Inflamatorio de Reconstitución Inmunológica. 0.6 a 1 mg/kg/día por 5 a 10 días"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Efectos mineralocorticoides: hipertensión, retención de sodio y agua y pérdida de potasio y calcio (ocurren levemente)."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.prednisolona_1
                                    ,R.drawable.prednisolona_2
                                    ,R.drawable.prednisolona_3
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Triamcinolona",
                                descripcion =
                                    "Triamcinolona (acetonida) | Glucocorticoide de depósito. Solución 6 mg/mL (sin preservante) para inyección IM, o intralesional, amp 20 mL.",
                                indicaciones = listOf(
                                    "Desordenes inflamatorios e inflamatorios."
                                    ,"Enfermedad reumática."
                                    ,"Inflamación local de articulación o tejidos blandos."
                                ),
                                contraindicaciones = listOf(
                                    "No inyectar en el tendón de Aquiles."
                                ),
                                precauciones = listOf(
                                    "Altas dosis pueden provocar miopatía, evitar en terapia crónica. Las inyecciones intraarticulares de corticosteroides pueden causar enrojecimiento y puede afectar al cartílago hialino. No se debe inyectar una articulación más de 4 veces en un año. Las medidas de asepsia completa son esenciales, se debe evitar las áreas infectadas."
                                ),
                                dosificacion = listOf(
                                    "IM profunda en el glúteo: 40 mg."
                                    ,"Repetir en intervalos de acuerdo a la respuesta del paciente."
                                    ,"No administrar más de 100 mg en una sola dosis."
                                    ,"Inyección intraarticular: ver indicaciones del fabricante:"
                                    ,"Dosis de acuerdo al tamaño de la articulación."
                                    ,"Inyección intradérmica: 2-3 mg; máx. 5 mg por sitio. Dosis total máx. 30 mg. Cuando es apropiado, puede ser repetido después de 1-2 semanas. No usar en menores de 6 años."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(

                                ),
                                imagenesResIds = listOf(
                                    R.drawable.triamcinolona_1
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Diabetes",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Insulina",
                                descripcion =
                                    "Insulina cristalina (soluble) | Insulina de acción corta Frasco con 10 mL con 100 UI/mL.",
                                indicaciones = listOf(
                                    "Diabetes mellitus."
                                    ,"Emergencias en diabéticos y cirugía."
                                    ,"Coma o cetoacidosis diabética."
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Las necesidades de insulina pueden incrementarse por infección, estrés, trauma o cirugía durante la pubertad y durante el embarazo (2do y 3er trimestre)"
                                ),
                                dosificacion = listOf(
                                    "ADULTOS Y NIÑOS de cualquier edad, por vías: SC, IM, IV o por infusión continua, según requerimientos del paciente o la circunstancia 8 (0.3-1 UI/kg/día)."
                                ),
                                dosificacionImagenes = listOf(

                                ),
                                efectosAdversos = listOf(

                                ),
                                imagenesResIds = listOf(
                                    R.drawable.insulina_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Intermedia",
                                descripcion =
                                    "Insulina de acción intermedia | Frasco con 10 mL con 100 UI/mL.",
                                indicaciones = listOf(
                                    "Diabetes mellitus."
                                ),
                                contraindicaciones = listOf(
                                    "No administrar por vía IV."
                                ),
                                precauciones = listOf(
                                ),
                                dosificacion = listOf(
                                    "Por vía subcutánea, según los requerimientos de cada paciente 8 (0.3-1 UI/kg/día) 10,11"
                                    ,"Consultar normas del MINSA para el cálculo progresivo de la dosis"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: hipoglucemia por sobredosis, aumento de peso"
                                    ,"Raros: reacciones de hipersensibilidad, incluyendo urticaria rash, reacciones locales y lipodistrofia si no se alternan los sitios de aplicación."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.intermedia_1
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Hipoglucemiantes orales (sub)",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Glibenclamida",
                                descripcion =
                                    "Hipoglicemiante oral del grupo sulfonilureas (duración de acción hasta 24 horas) Tabletas de 5 mg.",
                                indicaciones = listOf(
                                    "De segunda elección en la diabetes tipo 2."
                                ),
                                contraindicaciones = listOf(
                                    "cetoacidosis."
                                ),
                                precauciones = listOf(
                                    "Puede favorecer el aumento de peso. Evitar su uso en pacientes con deficiencia de G6PD y personas de edad avanzada."
                                    ,"Insuficiencia hepática o renal: evitar en lo posible (riesgo aumentado de hipoglicemia)."
                                    ,"Interacciones: pueden reducir su efecto hipoglucémico: la clorpromazina, corticoides, anticonceptivos orales, hidroclorotiazida, hormonas tiroides. Pueden aumentar el efecto: los IECA, el alcohol, el fluconazol y la claritromicina."
                                    ,"Embarazo: no usar. (Categoría C de la FDA)."
                                    ,"Lactancia: no usar."
                                ),
                                dosificacion = listOf(
                                    "Inicialmente 2.5-5 mg diario con o inmediatamente después del desayuno. Se ajusta la dosis según las necesidades, hasta un máximo de 15 mg diario (Utilizar un aplicador estéril)."
                                ),
                                dosificacionImagenes = listOf(

                                ),
                                efectosAdversos = listOf(
                                    "Leves y poco comunes: nausea, vómito, diarrea y constipación."
                                    ,"Ocasionalmente: hipoglucemia, alteraciones en la función hepática, lo cual raramente puede llevar a ictericia colestática, hepatitis o falla hepática. Reacciones alérgicas de la piel, (usualmente en las primeras 6 a 8 semanas de tratamiento)."
                                    ,"Raros: leucopenia, trombocitopenia, anemia aplásica."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.glibenclamida_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Metformina",
                                descripcion =
                                    "Hipoglicemiante oral del grupo biguanidas Tabletas de 500 mg.",
                                indicaciones = listOf(
                                    "De primera elección en la diabetes tipo 2."
                                    ,"El uso en caso de Síndrome Ovario Poliquístico es controversial.  Una revisión Cochrane (2012) reveló que la metformina usada sola o en asociación con clomifeno, no mejoró la tasa de nacimiento en estas mujeres 19."
                                ),
                                contraindicaciones = listOf(
                                    "cetoacidosis, antecedentes de acidosis láctica, antes de cirugías o procedimientos diagnósticos con medios de contraste yodado."
                                ),
                                precauciones = listOf(
                                    "Antes de iniciar el tratamiento deberá evaluarse la función renal y luego al menos anualmente, debido al riesgo incrementado de acidosis láctica en pacientes con insuficiencia renal. Retirar o interrumpir en los casos de riesgo de hipoxia de los tejidos, como: deshidratación, infección grave, shock, falla cardiaca aguda o falla respiratoria, deficiencia hepática."
                                    ,"Insuficiencia renal: evitar en lo posible (riesgo aumentado de acidosis láctica). Interacciones: el alcohol puede aumentar el riesgo de acidosis láctica y de hipoglucemia.."
                                    ,"Embarazo: se puede usar tanto en diabetes preexistente, como en diabetes gestacional. (Categoría C de la FDA)."
                                    ,"Lactancia: se puede usar."
                                ),
                                dosificacion = listOf(
                                    "ADULTOS Y NIÑOS >10 años: inicialmente 500 mg con el desayuno por al menos 1 semana, luego 500 mg con cada comida, hasta un máximo de 3 g diario."
                                ),
                                dosificacionImagenes = listOf(

                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: anorexia, nausea, vómitos, diarrea (usualmente pasajera), dolor abdominal, trastornos del gusto."
                                    ,"Raros: acidosisx láctica, disminución en la absorción de vitamina B12, eritema, prurito, urticaria y hepatitis."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.metformina_1
                                )
                            )
                        )
                    ),
                    Subgrupo(
                        nombre = "Hormonas tiroideas y medicamentos antitiroideos",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Metimazol",
                                descripcion =
                                    "Metimazol (Tiamazol carbamizol) | Inhibidor de la función tiroidea Tableta 5 mg.",
                                indicaciones = listOf(
                                    "Hipertiroidismo."
                                    ,"Tratamiento paliativo, terapia de mantenimiento en estado eutiroideo preparación para el tratamiento quirúrgico (por ejemplo, la tiroidectomía subtotal) o para tratamiento con yodo radioactivo"
                                ),
                                contraindicaciones = listOf(
                                    "Desórdenes sanguíneos graves."
                                ),
                                precauciones = listOf(
                                    "Riesgo de agranulocitosis y de hepatotoxicidad (aunque es mayor con propiltiouracilo sobre todo en niños). Realizar conteo de leucocitos en presencia de cualquier infección. Suspender de inmediato el tratamiento en caso de neutropenia o evidencia clínicamente significativa de anomalía hepática incluyendo valores de transaminasas hepáticas superior a 3 veces el límite superior normal."
                                    ,"Interacciones: Puede  aumentar la actividad de la warfarina, por lo que hay que monitorear el TP e INR especialmente antes de procedimientos quirúrgicos. Puede aumentar los niveles séricos de betabloqueadores, digoxina y teofilina (puede ser necesaria reducir dosis de estos medicamentos cuando el paciente está eutiroideo)."
                                ),
                                dosificacion = listOf(
                                    "ADULTOS: 15-40 mg/d PO; dosis más altas deben ser prescritas sólo bajo supervisión de un especialista."
                                    ,"Continuar hasta que el paciente está eutiroideo, por lo general después de 4 a 8 semanas, entonces reducir gradualmente hasta una dosis de mantenimiento de 5 a 15 mg. La terapia suele administrarse durante 12 a 18 meses 2."
                                    ,"NIÑOS de 1 mes a 12 años: inicialmente 750 mcg/kg/d en una o varias dosis por día, hasta que este eutiroideo (máx. 30 mg en niños de 1-12 meses)."
                                    ,"12-18 años: inicialmente 30 mg/d , id o dividida 3."
                                    ,"ORIENTACIÓN AL PACIENTE"
                                    ,"Acudir inmediatamente a la unidad de salud si presenta dolor de garganta, úlceras en la boca, moretones, fiebre, malestar o enfermedad no específica."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Frecuentes: náuseas, trastornos gastrointestinales leves, alteración del gusto, dolor de cabeza, fiebre, malestar general, erupción cutánea, prurito, artralgias."
                                    ,"Raras: miopatía, alopecia, depresión de la médula ósea (incluyendo pancitopenia y agranulocitosis)."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.metimazol_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Solucion",
                                descripcion =
                                    "Solución  de Lugol | Solución Iodo acuso al 5% + ioduro de potasio 10% (Iodo total 130 mg/1 mL).",
                                indicaciones = listOf(
                                    "Tirotoxicosis (preoperatorio)."
                                ),
                                contraindicaciones = listOf(
                                ),
                                precauciones = listOf(
                                    "Usar con cuidado en niños, no usar para el tratamiento a largo plazo."
                                    ,"Embarazo: evitar en lo posible. Riesgo de bocio neonatal e hipotiroidismo."
                                    ,"Lactancia: no usar, riesgo de bocio neonatal e hipotiroidismo."
                                ),
                                dosificacion = listOf(
                                    "0.1–0.3 mL tid bien diluido en leche o agua."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Reacciones de hipersensibilidad, incluyendo síntomas similares a la coriza, dolor de cabeza, lagrimeo, conjuntivitis, dolor en las glándulas salivares, laringitis, bronquitis, erupciones cutáneas, en caso de tratamiento prolongado depresión, el insomnio, la impotencia. Bocio en niños de madres que toman yoduros."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.solucion_1
                                )
                            )
                        )
                    )
                )
            ),
            //Capitulo 17
            Capitulo(
                nombre = "Antídotos",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "Antídotos",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                    "Carbon",
                                descripcion =
                                    "Carbón activado | Polvo en sobre de 30 g.",
                                indicaciones = listOf(
                                    "Reducción de la absorción de los venenos en el sistema gastrointestinal."
                                    ,"Eliminación activa de algunos fármacos después de su absorción (ej. carbamacepina, dapsona, fenobarbital, quinina, teofilina) y de plaguicidas muy tóxicos como Paraquat© u organosfosforados."
                                ),
                                contraindicaciones = listOf(
                                    "No usar en envenenamiento por productos derivados del petróleo (gasolina, keroseno), sustancias corrosivas alcoholes, malatión, cianuros y sales de metales como el hierro y sales de litio."
                                ),
                                precauciones = listOf(
                                    "Riesgo de aspiración en persona somnolienta o comatosas (garantizar protección de las vías aéreas, uso de sonda nasogástrica). Usar con cuidado en caso de reducción de la motilidad gastrointestinal (riesgo de obstrucción)."
                                    ,"Interacciones: Puede disminuir la absorción y la respuesta terapéutica de otros medicamentos por vía oral. Los fármacos que no sean los utilizadas para la descontaminación gastrointestinal o antídotos contra las toxinas ingeridas no se debe administrarse dentro de las 2 horas de haberse administrado el carbón activado."
                                ),
                                dosificacion = listOf(
                                    "Por vía oral o por sonda nasogástrica."
                                    ,"Reducción de la absorción: ADULTOS y NIÑOS>12 años: 50g."
                                    ,"NIÑOS <12 años: 1 g/kg (máx. 50 g), lo más pronto posible (dentro de 1 h) después de la ingestión del tóxico 4."
                                    ,"Eliminación activa: dosis repetidas"
                                    ,"ADULTOS y NIÑOS>12 años: 50 g a repetir cada 4 h, en caso de vómito administrar antiemético, porque se puede reducir la eficacia del tratamiento. En casos de intolerancia, la dosis puede ser reducida y se aumenta la frecuencia (por ejemplo, 25 g cada 2 h o 12.5 g cada hora), pero esto puede comprometer la eficacia."
                                    ,"NIÑOS<12 años 1g/kg (max. 50 g) a repetir cada 4 h. En caso de intolerancia disminuir la dosis y aumentar la frecuencia."
                                    ,"Después de un lavado gástrico: ADULTOS, 1 g/kg diluidos en 300 mL de agua. NIÑOS 0.5 g/kg. en 100 mL de agua 5. Si el paciente no tiene diarrea administrar un catártico como sorbitol (Adultos y mayores de 12 años: 1 g/kg, niños: 0.5 g/kg) o Manitol (3-4 mL/kg) 5."
                                    ,"Nota: la suspensión o polvo reconstituida pueden mezclar con bebidas sin alcohol (por ejemplo, cafeína cola de la dieta) o zumos de frutas para enmascarar el sabor."
                                    ,"ORIENTACIÓN AL PACIENTE: Aconsejar no usarlo como antídoto en casa. Explicar que las heces serán de color negro durante varios días y que la diarrea puede continuar durante 24 a 48 h 3."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Vómitos, estreñimiento, diarrea, heces negras."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.carbon_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Flumazenil",
                                descripcion =
                                    "Flumazenil | Antagonista de las benzodiazepinas Solución de 0.1 mg/1 mL para inyección IV.",
                                indicaciones = listOf(
                                    "Reversión de los efectos sedantes de las benzodiazepinas en anestesia, cuidados intensivos, y los procedimientos clínicos."
                                    ,"Sobredosis con benzodiazepinas sobre todo en caso de coma o depresión respiratoria."
                                ),
                                contraindicaciones = listOf(
                                    "Afecciones potencialmente mortales controladas por benzodiazepinas (por ej. aumento de la presión intracraneal, estado epiléptico)  Intoxicación con uso concomitante de antidepresivos tricíclicos (riesgo de convulsiones, aritmias y paro cardiáco)."
                                ),
                                precauciones = listOf(
                                    "El flumazenil es de acción corta por lo que puede ser necesario repetir la dosis (los efectos de varias benzodiacepinas pueden persistir durante al menos 24 horas), cuidado en caso de dependencia a benzodiazepinas (puede precipitar los síntomas de abstinencia),; evitar la inyección rápida en pacientes de alto riesgo o ansiosos y después de una cirugía mayor, traumatismo craneoencefálico (la rápida reversión de la sedación por benzodiacepinas pueden causar convulsiones)."
                                ),
                                dosificacion = listOf(
                                    "Uso en anestesia y procedimientos clínicos, por vía IV lenta:"
                                    ,"0.2 mg en 15 s., luego 0.1 mg a intervalos de 60 s. si es necesario; rango habitual de dosis: 0.3-0.6 mg, dosis máx. total 1 mg; NIÑOS 1 mes-18 años: 0.01 mg/kg (máx. 0.2 mg), a repetir a intervalos de 1 min, si es necesario."
                                    ,"Dosis máx. total: 0.05 mg/kg (1 mg) (2 mg en cuidados intensivos). Por infusión IV si la somnolencia recurre después de la inyección: 2–10 mcg/kg/h, a ajustar en función de la respuesta. (máx. 400 mcg/h)."
                                    ,"Uso en cuidados intensivos, por vía IV: 0.3 mg en 15 s., luego 0.1 mg a intervalos de 60 s. si es necesario; dosis máx. total de 2 mg, y luego si se repite la somnolencia ya sea, por inyección IV, 0.3 mg, o por infusión IV, 0.1-0.4 mg/h, ajustados según la respuesta."
                                    ,"NIÑOS 1 mes-18 años: ver párrafo superior."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas y vómitos, con menos frecuencia palpitaciones, ansiedad, miedo."
                                    ,"Raras veces: hipertensión transitoria, taquicardia, enrojecimiento facial, agitación, convulsiones (sobre todo en pacientes con epilepsia), mareos, trastornos sensitivos, escalofríos, sudoración."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.flumazenil_1
                                )
                            ),
                            Medicamento(
                                nombre =
                                    "Naloxona",
                                descripcion =
                                    "Naloxona | Antagonista de los opioides Solución de 0.4 mg/1 mL para inyección IV.",
                                indicaciones = listOf(
                                    "Sobredosis de opioides."
                                    ,"Reversión de depresión respiratoria postoperatoria y reversión de la depresión central y respiratoria del neonato producidos por la administración de opioide durante el parto."
                                ),
                                contraindicaciones = listOf(
                                    "No usar en envenenamiento por productos derivados del petróleo (gasolina, keroseno), sustancias corrosivas alcoholes, malatión, cianuros y sales de metales como el hierro y sales de litio."
                                ),
                                precauciones = listOf(
                                    "Dependencia física a los opioides, irritabilidad cardíaca. El paciente tiene que ser vigilado estrictamente porque la naloxona tiene una duración de acción corta y dosis repetidas pueden ser necesarias, sobretodo en la intoxicación por opiáceos con efectos prolongados. El uso en el postoperatorio puede incrementar el dolor postquirúrgico."
                                    ,"Embarazo: se puede usar con cuidado. En esta situación el beneficio supera el riesgo (Categoría C de la FDA)."
                                    ,"Lactancia: usar con cuidado (no se sabe si se excreta en la leche)."
                                ),
                                dosificacion = listOf(
                                    "Vía IV (Usar las mismas dosis SC o IM únicamente si la vía IV no es factible)"
                                    ,"ADULTOS: 0.4–2 mg. Si no hay respuesta, repetir a intervalos de 2-3 min. hasta un máximo de 10 mg (luego revisar el diagnóstico). Otras dosis pueden ser necesarias si la función respiratoria se deteriora. NIÑOS: 10 mcg/kg. Si no hay res- puesta dar nueva dosis de 100 mcg/kg (luego revisar el diagnóstico). Otras dosis pueden ser necesarias si la función respiratoria se deteriora."
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Náuseas, vómitos, hipotensión, hipertensión, taquicardia, dolor de cabeza, mareos."
                                    ,"Menos comúnmente: diarrea, boca seca, bradicardia, arritmia, hiperventilación, temblor, sudoración."
                                    ,"Rara vez: convulsiones."
                                    ,"Muy rara vez: fibrilación ventricular, paro cardíaco, edema pulmonar, eritema multiforme, y reacciones de hipersensibilidad (incluyen anafilaxia), agitación."
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.naloxona_1
                                )
                            )
                        )
                    )
                )
            )
        )
    }

    fun obtenerCapitulosEspeciales(): List<Capitulo> {
        return listOf(
            Capitulo(
                nombre = "NEUROLOGÍA",
                descripcion = "",
                subgrupos =
                listOf(
                    Subgrupo(
                        nombre = "ANTICONVULSIONANTES / ANTIPILEPTICOS",
                        descripcion = "",
                        medicamentos =
                        listOf(
                            Medicamento(
                                nombre =
                                "Valproico",
                                descripcion =
                                "Ácido valproico/ Valproato sódico | Antiepiléptico de amplio espectro activo sobre todas las formas de epilepsia.\n" +
                                        "Ácido valproico: Tabletas/capsula de 250 mg\n" +
                                        "Valproato sódico: Solución de 250 mg/5 mL para vía oral, Fco de 100-120 mL\n",
                                indicaciones = listOf(
                                    "Todas las formas de epilepsia: convulsiones tónico-clónicas (sobre todo en epilepsia generalizada primaria), ausencias generalizadas y convulsiones mioclónicas, convulsiones tónicas o atónica"
                                    ,"Alternativa al litio en la manía asociada con trastorno bipolar"
                                ),
                                contraindicaciones = listOf(
                                    "Antecedentes familiares de disfunción hepática grave  No se recomienda en la prevención de la convulsión febril por su toxicidad hepática  y ventaja clínica no relevante"
                                ),
                                precauciones = listOf(
                                    "Vigilar la función hepática antes del tratamiento y durante los 6 primeros meses, especialmente en pacientes con elevado riesgo. Realizar conteo sanguíneo completo y asegurarse que no exista potencial para sangrado excesivo antes de realizar una cirugía. Usar con cuidado en el Lupus Eritematoso Sistémico. Puede producir falsos positivos en las pruebas de orina para cetonas. Evitar la retirada brusca"
                                    ,"Toxicidad hepática: riesgo de disfunción hepática (incluyendo insuficiencia hepática fatal) con el uso de valproato (especialmente en niños <3 años y en personas con trastornos metabólicos o degenerativos, enfermedad orgánica cerebral o trastornos convulsivos graves asociados con retraso mental) por lo general en los primeros 6 meses y por lo general con tratamiento antiepiléptico múltiple. El aumento de las enzimas hepáticas durante el tratamiento suele ser transitorio, pero los pacientes deben ser reevaluados clínicamente y monitoreada su función hepática (incluyendo el tiempo de protrombina)"
                                    ,"Interacciones"
                                    ,"Reducen concentración de valproato: carbamacepina, carbapenems (evitar uso concomitante), etinilestradiol, fenobarbital. Aumentan la concentración de valproato: cimetidina, y eritromicina. El valproato aumenta la concentración de: carbamacepina, diazepam, lorazepam, fenobarbital, zidovudina y etoxusimida. La aspirina aumenta los efectos del valproato. Puede ocurrir aumento de reacciones adversas cuando se usa conjuntamente con clonazepam y olanzapina (incluyendo neutropenia)"
                                ),
                                dosificacion = listOf(
                                    "Epilepsia: ADULTOS, PO: iniciar con 600 mg/d divididos en1–2 dosis, incrementar gradualmente (en etapas de 150 –300 mg) cada 3 días"
                                    ,"Dosis de mantenimiento: 1–2 g/d(20-30 mg/kg), máximo 2.5 g/d"
                                    ,". NIÑOS 1-12 años: dosis inicial, 10-15 mg/kg/d (máx. 600 mg) divididos en 1-2 dosis"
                                    ,"Manía: ADULTOS, PO: 750 mg/d en 1–2 dosis"
                                    ,"Dosis de mantenimiento: 1–2 g/d"
                                    ,"Dosis mayores a 45 mg/kg requieren monitoreo cuidadoso"
                                ),
                                dosificacionImagenes = listOf(
                                ),
                                efectosAdversos = listOf(
                                    "Nauseas, irritación gástrica, diarrea, aumento de peso, hiperamonemia, trombocitopenia, pérdida transitoria del cabello. Menos frecuente: mayor estado de alerta, agresividad, hiperactividad, alteraciones del comportamiento, ataxia, temblor y vasculitis. Raramente: disfunción hepática, letargia, somnolencia, confusión, estupor, alucinaciones, desordenes sanguíneos (incluyendo anemia, leucopenia y pancitopenia), pérdida auditiva y erupción"
                                ),
                                imagenesResIds = listOf(
                                    R.drawable.valproico_1
                                    ,R.drawable.valproico_2
                                )   
                            ),
                        )
                    ),
                )
            ),
        )
    }
}
