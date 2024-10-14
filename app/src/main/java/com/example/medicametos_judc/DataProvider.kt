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
                        )
                    )
                )
            ),

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
