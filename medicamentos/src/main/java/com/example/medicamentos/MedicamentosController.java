package com.example.medicamentos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //para q sea un controlador
public class MedicamentosController {

    private final List<Medicamento> medicamentos = List.of(
            new Medicamento(
                    "Paracetamol",
                    List.of("Acetaminofén"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (analgésico/antipirético).",
                    List.of(
                            "Fiebre",
                            "Dolor leve a moderado",
                            "Cefalea"
                    ),
                    List.of(
                            "Insuficiencia hepática grave",
                            "Alergia al fármaco",
                            "Alcoholismo crónico"
                    ),
                    List.of(
                            "Náuseas",
                            "Erupción cutánea",
                            "Elevación de enzimas hepáticas"
                    ),
                    List.of(
                            "Verificar antecedentes de enfermedad hepática",
                            "Controlar dosis total diaria",
                            "Valorar alivio del dolor y la fiebre"
                    )
            ),
            new Medicamento(
                    "Metamizol",
                    List.of("Dipirona"),
                    List.of("VO", "IV", "IM"),
                    "Según prescripción médica (analgésico/antipirético).",
                    List.of(
                            "Fiebre",
                            "Dolor leve a moderado",
                            "Cefalea"
                    ),
                    List.of(
                            "Insuficiencia hepática grave",
                            "Alergia al fármaco",
                            "Alcoholismo crónico"
                    ),
                    List.of(
                            "Náuseas",
                            "Erupción cutánea",
                            "Elevación de enzimas hepáticas"
                    ),
                    List.of(
                            "Verificar antecedentes de enfermedad hepática",
                            "Controlar dosis total diaria",
                            "Valorar alivio del dolor y la fiebre"
                    )
            ),
            new Medicamento(
                    "Ibuprofeno",
                    List.of("Motrin", "Advil"),
                    List.of("VO"),
                    "Según prescripción médica (AINE).",
                    List.of(
                            "Dolor leve a moderado",
                            "Procesos inflamatorios",
                            "Dismenorrea"
                    ),
                    List.of(
                            "Úlcera péptica activa",
                            "Insuficiencia renal grave",
                            "Alergia a AINE o ácido acetilsalicílico"
                    ),
                    List.of(
                            "Dolor epigástrico",
                            "Náuseas",
                            "Mareos"
                    ),
                    List.of(
                            "Administrar con alimentos para disminuir irritación gástrica",
                            "Vigilar signos de sangrado gastrointestinal",
                            "Controlar función renal en tratamientos prolongados"
                    )
            ),
            new Medicamento(
                    "Diclofenaco",
                    List.of("Voltaren"),
                    List.of("VO", "IM"),
                    "Según prescripción médica (AINE).",
                    List.of(
                            "Dolor leve a moderado",
                            "Procesos inflamatorios",
                            "Dismenorrea"
                    ),
                    List.of(
                            "Úlcera péptica activa",
                            "Insuficiencia renal grave",
                            "Alergia a AINE o ácido acetilsalicílico"
                    ),
                    List.of(
                            "Dolor epigástrico",
                            "Náuseas",
                            "Mareos"
                    ),
                    List.of(
                            "Administrar con alimentos para disminuir irritación gástrica",
                            "Vigilar signos de sangrado gastrointestinal",
                            "Controlar función renal en tratamientos prolongados"
                    )
            ),
            new Medicamento(
                    "Naproxeno",
                    List.of("Naprosyn"),
                    List.of("VO"),
                    "Según prescripción médica (AINE).",
                    List.of(
                            "Dolor leve a moderado",
                            "Procesos inflamatorios",
                            "Dismenorrea"
                    ),
                    List.of(
                            "Úlcera péptica activa",
                            "Insuficiencia renal grave",
                            "Alergia a AINE o ácido acetilsalicílico"
                    ),
                    List.of(
                            "Dolor epigástrico",
                            "Náuseas",
                            "Mareos"
                    ),
                    List.of(
                            "Administrar con alimentos para disminuir irritación gástrica",
                            "Vigilar signos de sangrado gastrointestinal",
                            "Controlar función renal en tratamientos prolongados"
                    )
            ),
            new Medicamento(
                    "Ketorolaco",
                    List.of("Toradol"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (AINE).",
                    List.of(
                            "Dolor leve a moderado",
                            "Procesos inflamatorios",
                            "Dismenorrea"
                    ),
                    List.of(
                            "Úlcera péptica activa",
                            "Insuficiencia renal grave",
                            "Alergia a AINE o ácido acetilsalicílico"
                    ),
                    List.of(
                            "Dolor epigástrico",
                            "Náuseas",
                            "Mareos"
                    ),
                    List.of(
                            "Administrar con alimentos para disminuir irritación gástrica",
                            "Vigilar signos de sangrado gastrointestinal",
                            "Controlar función renal en tratamientos prolongados"
                    )
            ),
            new Medicamento(
                    "Ácido acetilsalicílico",
                    List.of("Aspirina"),
                    List.of("VO"),
                    "Según prescripción médica (AINE).",
                    List.of(
                            "Dolor leve a moderado",
                            "Procesos inflamatorios",
                            "Dismenorrea"
                    ),
                    List.of(
                            "Úlcera péptica activa",
                            "Insuficiencia renal grave",
                            "Alergia a AINE o ácido acetilsalicílico"
                    ),
                    List.of(
                            "Dolor epigástrico",
                            "Náuseas",
                            "Mareos"
                    ),
                    List.of(
                            "Administrar con alimentos para disminuir irritación gástrica",
                            "Vigilar signos de sangrado gastrointestinal",
                            "Controlar función renal en tratamientos prolongados"
                    )
            ),
            new Medicamento(
                    "Amoxicilina",
                    List.of("Amoxil"),
                    List.of("VO"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Ampicilina",
                    List.of("Ampicilina"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Cefalexina",
                    List.of("Keflex"),
                    List.of("VO"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Ceftriaxona",
                    List.of("Rocephin"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Cefuroxima",
                    List.of("Zinnat"),
                    List.of("VO"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Piperacilina/tazobactam",
                    List.of("Tazocin"),
                    List.of("IV"),
                    "Según prescripción médica (antibiótico β-lactámico).",
                    List.of(
                            "Infecciones de vías respiratorias",
                            "Infecciones de piel y tejidos blandos",
                            "Otras infecciones sensibles"
                    ),
                    List.of(
                            "Alergia a penicilinas o cefalosporinas",
                            "Antecedente de reacción anafiláctica a β-lactámicos"
                    ),
                    List.of(
                            "Diarrea",
                            "Náuseas",
                            "Erupciones cutáneas"
                    ),
                    List.of(
                            "Verificar antecedentes de alergia a antibióticos β-lactámicos",
                            "Explicar la importancia de completar el tratamiento",
                            "Observar signos de reacción alérgica"
                    )
            ),
            new Medicamento(
                    "Azitromicina",
                    List.of("Zithromax"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Claritromicina",
                    List.of("Klaricid"),
                    List.of("VO"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Doxiciclina",
                    List.of("Doxiciclina"),
                    List.of("VO"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Ciprofloxacino",
                    List.of("Cipro"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Levofloxacino",
                    List.of("Tavanic"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Clindamicina",
                    List.of("Dalacin"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Gentamicina",
                    List.of("Gentamicina"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Amikacina",
                    List.of("Amikacina"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Vancomicina",
                    List.of("Vancomicina"),
                    List.of("IV"),
                    "Según prescripción médica (antibiótico sistémico).",
                    List.of(
                            "Infecciones bacterianas sensibles",
                            "Infecciones respiratorias o urinarias según cultivo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Uso concomitante con fármacos contraindicado"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Cefalea",
                            "Alteraciones en pruebas de función hepática"
                    ),
                    List.of(
                            "Administrar a intervalos regulares",
                            "Revisar interacciones medicamentosas",
                            "Educar sobre signos de alarma (diarrea intensa, exantema)"
                    )
            ),
            new Medicamento(
                    "Omeprazol",
                    List.of("Losec"),
                    List.of("VO"),
                    "Según prescripción médica (inhibidor de la bomba de protones).",
                    List.of(
                            "Enfermedad por reflujo gastroesofágico",
                            "Úlcera gástrica o duodenal",
                            "Profilaxis de úlcera por AINE"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática grave"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Cefalea",
                            "Diarrea o estreñimiento"
                    ),
                    List.of(
                            "Administrar preferiblemente antes de los alimentos",
                            "Valorar alivio de pirosis y dolor epigástrico",
                            "Vigilar uso prolongado (riesgo de déficit de B12 y magnesio)"
                    )
            ),
            new Medicamento(
                    "Pantoprazol",
                    List.of("Pantozol"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (inhibidor de la bomba de protones).",
                    List.of(
                            "Enfermedad por reflujo gastroesofágico",
                            "Úlcera gástrica o duodenal",
                            "Profilaxis de úlcera por AINE"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática grave"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Cefalea",
                            "Diarrea o estreñimiento"
                    ),
                    List.of(
                            "Administrar preferiblemente antes de los alimentos",
                            "Valorar alivio de pirosis y dolor epigástrico",
                            "Vigilar uso prolongado (riesgo de déficit de B12 y magnesio)"
                    )
            ),
            new Medicamento(
                    "Esomeprazol",
                    List.of("Nexium"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (inhibidor de la bomba de protones).",
                    List.of(
                            "Enfermedad por reflujo gastroesofágico",
                            "Úlcera gástrica o duodenal",
                            "Profilaxis de úlcera por AINE"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática grave"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Cefalea",
                            "Diarrea o estreñimiento"
                    ),
                    List.of(
                            "Administrar preferiblemente antes de los alimentos",
                            "Valorar alivio de pirosis y dolor epigástrico",
                            "Vigilar uso prolongado (riesgo de déficit de B12 y magnesio)"
                    )
            ),
            new Medicamento(
                    "Lansoprazol",
                    List.of("Lansoprazol"),
                    List.of("VO"),
                    "Según prescripción médica (inhibidor de la bomba de protones).",
                    List.of(
                            "Enfermedad por reflujo gastroesofágico",
                            "Úlcera gástrica o duodenal",
                            "Profilaxis de úlcera por AINE"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática grave"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Cefalea",
                            "Diarrea o estreñimiento"
                    ),
                    List.of(
                            "Administrar preferiblemente antes de los alimentos",
                            "Valorar alivio de pirosis y dolor epigástrico",
                            "Vigilar uso prolongado (riesgo de déficit de B12 y magnesio)"
                    )
            ),
            new Medicamento(
                    "Ranitidina",
                    List.of("Ranitidina"),
                    List.of("VO"),
                    "Según prescripción médica (inhibidor de la bomba de protones).",
                    List.of(
                            "Enfermedad por reflujo gastroesofágico",
                            "Úlcera gástrica o duodenal",
                            "Profilaxis de úlcera por AINE"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática grave"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Cefalea",
                            "Diarrea o estreñimiento"
                    ),
                    List.of(
                            "Administrar preferiblemente antes de los alimentos",
                            "Valorar alivio de pirosis y dolor epigástrico",
                            "Vigilar uso prolongado (riesgo de déficit de B12 y magnesio)"
                    )
            ),
            new Medicamento(
                    "Loperamida",
                    List.of("Imodium"),
                    List.of("VO"),
                    "Según prescripción médica (antidiarreico).",
                    List.of(
                            "Diarrea aguda no complicada",
                            "Reducción del número de deposiciones"
                    ),
                    List.of(
                            "Diarrea con sangre o fiebre alta",
                            "Colitis pseudomembranosa"
                    ),
                    List.of(
                            "Estreñimiento",
                            "Dolor abdominal"
                    ),
                    List.of(
                            "Vigilar signos de deshidratación",
                            "No usar en casos de diarrea invasiva",
                            "Educar sobre signos de alarma"
                    )
            ),
            new Medicamento(
                    "Metoclopramida",
                    List.of("Plasil"),
                    List.of("VO", "IV", "IM"),
                    "Según prescripción médica (antiemético/procinético).",
                    List.of(
                            "Náuseas y vómitos",
                            "Gastritis o dispepsia",
                            "Preparación para procedimientos diagnósticos"
                    ),
                    List.of(
                            "Hemorragia, obstrucción o perforación gastrointestinal",
                            "Feocromocitoma"
                    ),
                    List.of(
                            "Somnolencia",
                            "Diarrea",
                            "Reacciones extrapiramidales (raras)"
                    ),
                    List.of(
                            "Valorar frecuencia e intensidad de náuseas y vómitos",
                            "Vigilar efectos extrapiramidales",
                            "Educar sobre posible somnolencia"
                    )
            ),
            new Medicamento(
                    "Domperidona",
                    List.of("Motilium"),
                    List.of("VO"),
                    "Según prescripción médica (antiemético/procinético).",
                    List.of(
                            "Náuseas y vómitos",
                            "Gastritis o dispepsia",
                            "Preparación para procedimientos diagnósticos"
                    ),
                    List.of(
                            "Hemorragia, obstrucción o perforación gastrointestinal",
                            "Feocromocitoma"
                    ),
                    List.of(
                            "Somnolencia",
                            "Diarrea",
                            "Reacciones extrapiramidales (raras)"
                    ),
                    List.of(
                            "Valorar frecuencia e intensidad de náuseas y vómitos",
                            "Vigilar efectos extrapiramidales",
                            "Educar sobre posible somnolencia"
                    )
            ),
            new Medicamento(
                    "Ondansetrón",
                    List.of("Zofran"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antiemético/procinético).",
                    List.of(
                            "Náuseas y vómitos",
                            "Gastritis o dispepsia",
                            "Preparación para procedimientos diagnósticos"
                    ),
                    List.of(
                            "Hemorragia, obstrucción o perforación gastrointestinal",
                            "Feocromocitoma"
                    ),
                    List.of(
                            "Somnolencia",
                            "Diarrea",
                            "Reacciones extrapiramidales (raras)"
                    ),
                    List.of(
                            "Valorar frecuencia e intensidad de náuseas y vómitos",
                            "Vigilar efectos extrapiramidales",
                            "Educar sobre posible somnolencia"
                    )
            ),
            new Medicamento(
                    "Salbutamol",
                    List.of("Ventolin"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (broncodilatador).",
                    List.of(
                            "Asma",
                            "EPOC con broncoespasmo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Temblor fino",
                            "Taquicardia",
                            "Nerviosismo"
                    ),
                    List.of(
                            "Enseñar técnica correcta de inhalación",
                            "Valorar frecuencia de uso de rescate",
                            "Controlar frecuencia cardiaca"
                    )
            ),
            new Medicamento(
                    "Bromuro de ipratropio",
                    List.of("Atrovent"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (broncodilatador).",
                    List.of(
                            "Asma",
                            "EPOC con broncoespasmo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Temblor fino",
                            "Taquicardia",
                            "Nerviosismo"
                    ),
                    List.of(
                            "Enseñar técnica correcta de inhalación",
                            "Valorar frecuencia de uso de rescate",
                            "Controlar frecuencia cardiaca"
                    )
            ),
            new Medicamento(
                    "Budesonida",
                    List.of("Pulmicort"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (corticoide inhalado).",
                    List.of(
                            "Asma persistente",
                            "EPOC según guías"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Candidiasis oral",
                            "Ronquera"
                    ),
                    List.of(
                            "Indicar enjuague bucal posterior a la inhalación",
                            "Valorar control de síntomas respiratorios",
                            "Revisar técnica inhalatoria"
                    )
            ),
            new Medicamento(
                    "Beclometasona",
                    List.of("Becloforte"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (corticoide inhalado).",
                    List.of(
                            "Asma persistente",
                            "EPOC según guías"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Candidiasis oral",
                            "Ronquera"
                    ),
                    List.of(
                            "Indicar enjuague bucal posterior a la inhalación",
                            "Valorar control de síntomas respiratorios",
                            "Revisar técnica inhalatoria"
                    )
            ),
            new Medicamento(
                    "Fluticasona",
                    List.of("Flixotide"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (corticoide inhalado).",
                    List.of(
                            "Asma persistente",
                            "EPOC según guías"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Candidiasis oral",
                            "Ronquera"
                    ),
                    List.of(
                            "Indicar enjuague bucal posterior a la inhalación",
                            "Valorar control de síntomas respiratorios",
                            "Revisar técnica inhalatoria"
                    )
            ),
            new Medicamento(
                    "Loratadina",
                    List.of("Claritin"),
                    List.of("VO"),
                    "Según prescripción médica (antihistamínico de segunda generación).",
                    List.of(
                            "Rinitis alérgica",
                            "Urticaria",
                            "Alergias cutáneas leves"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática o renal"
                    ),
                    List.of(
                            "Somnolencia leve",
                            "Sequedad de boca"
                    ),
                    List.of(
                            "Advertir sobre posible somnolencia",
                            "Valorar control de síntomas alérgicos",
                            "Ajustar dosis en insuficiencia renal si corresponde"
                    )
            ),
            new Medicamento(
                    "Cetirizina",
                    List.of("Zyrtec"),
                    List.of("VO"),
                    "Según prescripción médica (antihistamínico de segunda generación).",
                    List.of(
                            "Rinitis alérgica",
                            "Urticaria",
                            "Alergias cutáneas leves"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática o renal"
                    ),
                    List.of(
                            "Somnolencia leve",
                            "Sequedad de boca"
                    ),
                    List.of(
                            "Advertir sobre posible somnolencia",
                            "Valorar control de síntomas alérgicos",
                            "Ajustar dosis en insuficiencia renal si corresponde"
                    )
            ),
            new Medicamento(
                    "Levocetirizina",
                    List.of("Xyzal"),
                    List.of("VO"),
                    "Según prescripción médica (antihistamínico de segunda generación).",
                    List.of(
                            "Rinitis alérgica",
                            "Urticaria",
                            "Alergias cutáneas leves"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en insuficiencia hepática o renal"
                    ),
                    List.of(
                            "Somnolencia leve",
                            "Sequedad de boca"
                    ),
                    List.of(
                            "Advertir sobre posible somnolencia",
                            "Valorar control de síntomas alérgicos",
                            "Ajustar dosis en insuficiencia renal si corresponde"
                    )
            ),
            new Medicamento(
                    "Clorfenamina",
                    List.of("Clorfenamina"),
                    List.of("VO", "IM"),
                    "Según prescripción médica (antihistamínico de primera generación).",
                    List.of(
                            "Reacciones alérgicas",
                            "Prurito",
                            "Rinitis alérgica"
                    ),
                    List.of(
                            "Glaucoma de ángulo cerrado",
                            "Hiperplasia prostática",
                            "Niños pequeños sin supervisión estricta"
                    ),
                    List.of(
                            "Somnolencia intensa",
                            "Sequedad de boca",
                            "Visión borrosa"
                    ),
                    List.of(
                            "Advertir sobre sedación y evitar conducir",
                            "Vigilar en adultos mayores",
                            "Valorar necesidad de tomar preferentemente por la noche"
                    )
            ),
            new Medicamento(
                    "Difenhidramina",
                    List.of("Benadryl"),
                    List.of("VO", "IM"),
                    "Según prescripción médica (antihistamínico de primera generación).",
                    List.of(
                            "Reacciones alérgicas",
                            "Prurito",
                            "Rinitis alérgica"
                    ),
                    List.of(
                            "Glaucoma de ángulo cerrado",
                            "Hiperplasia prostática",
                            "Niños pequeños sin supervisión estricta"
                    ),
                    List.of(
                            "Somnolencia intensa",
                            "Sequedad de boca",
                            "Visión borrosa"
                    ),
                    List.of(
                            "Advertir sobre sedación y evitar conducir",
                            "Vigilar en adultos mayores",
                            "Valorar necesidad de tomar preferentemente por la noche"
                    )
            ),
            new Medicamento(
                    "Enalapril",
                    List.of("Renitec"),
                    List.of("VO"),
                    "Según prescripción médica (inhibidor de la ECA).",
                    List.of(
                            "Hipertensión arterial",
                            "Insuficiencia cardiaca",
                            "Nefropatía diabética"
                    ),
                    List.of(
                            "Antecedente de angioedema por IECA",
                            "Embarazo",
                            "Estenosis bilateral de arteria renal"
                    ),
                    List.of(
                            "Tos seca",
                            "Hipotensión",
                            "Hiperpotasemia"
                    ),
                    List.of(
                            "Controlar presión arterial",
                            "Monitorizar función renal y potasio",
                            "Educar sobre tos persistente"
                    )
            ),
            new Medicamento(
                    "Captopril",
                    List.of("Capoten"),
                    List.of("VO"),
                    "Según prescripción médica (inhibidor de la ECA).",
                    List.of(
                            "Hipertensión arterial",
                            "Insuficiencia cardiaca",
                            "Nefropatía diabética"
                    ),
                    List.of(
                            "Antecedente de angioedema por IECA",
                            "Embarazo",
                            "Estenosis bilateral de arteria renal"
                    ),
                    List.of(
                            "Tos seca",
                            "Hipotensión",
                            "Hiperpotasemia"
                    ),
                    List.of(
                            "Controlar presión arterial",
                            "Monitorizar función renal y potasio",
                            "Educar sobre tos persistente"
                    )
            ),
            new Medicamento(
                    "Losartán",
                    List.of("Cozaar"),
                    List.of("VO"),
                    "Según prescripción médica (antagonista de receptores de angiotensina II).",
                    List.of(
                            "Hipertensión arterial",
                            "Insuficiencia cardiaca",
                            "Nefropatía diabética"
                    ),
                    List.of(
                            "Embarazo",
                            "Hiperpotasemia severa"
                    ),
                    List.of(
                            "Mareos",
                            "Hipotensión",
                            "Hiperpotasemia"
                    ),
                    List.of(
                            "Controlar presión arterial",
                            "Monitorizar función renal y potasio",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Valsartán",
                    List.of("Diovan"),
                    List.of("VO"),
                    "Según prescripción médica (antagonista de receptores de angiotensina II).",
                    List.of(
                            "Hipertensión arterial",
                            "Insuficiencia cardiaca",
                            "Nefropatía diabética"
                    ),
                    List.of(
                            "Embarazo",
                            "Hiperpotasemia severa"
                    ),
                    List.of(
                            "Mareos",
                            "Hipotensión",
                            "Hiperpotasemia"
                    ),
                    List.of(
                            "Controlar presión arterial",
                            "Monitorizar función renal y potasio",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Amlodipino",
                    List.of("Norvasc"),
                    List.of("VO"),
                    "Según prescripción médica (calcioantagonista).",
                    List.of(
                            "Hipertensión arterial",
                            "Angina estable"
                    ),
                    List.of(
                            "Hipotensión grave",
                            "Insuficiencia cardiaca avanzada (según tipo)"
                    ),
                    List.of(
                            "Edema maleolar",
                            "Cefalea",
                            "Rubor"
                    ),
                    List.of(
                            "Controlar presión arterial y frecuencia cardiaca",
                            "Valorar aparición de edemas",
                            "Educar sobre toma regular"
                    )
            ),
            new Medicamento(
                    "Nifedipino",
                    List.of("Adalat"),
                    List.of("VO"),
                    "Según prescripción médica (calcioantagonista).",
                    List.of(
                            "Hipertensión arterial",
                            "Angina estable"
                    ),
                    List.of(
                            "Hipotensión grave",
                            "Insuficiencia cardiaca avanzada (según tipo)"
                    ),
                    List.of(
                            "Edema maleolar",
                            "Cefalea",
                            "Rubor"
                    ),
                    List.of(
                            "Controlar presión arterial y frecuencia cardiaca",
                            "Valorar aparición de edemas",
                            "Educar sobre toma regular"
                    )
            ),
            new Medicamento(
                    "Furosemida",
                    List.of("Lasix"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (diurético de asa).",
                    List.of(
                            "Edemas por insuficiencia cardiaca",
                            "Hipertensión arterial"
                    ),
                    List.of(
                            "Anuria",
                            "Alergia a sulfonamidas (valorar según ficha técnica)"
                    ),
                    List.of(
                            "Alteraciones electrolíticas",
                            "Hipotensión ortostática",
                            "Incremento de diuresis"
                    ),
                    List.of(
                            "Controlar peso diario y diuresis",
                            "Valorar electrolitos séricos",
                            "Enseñar a levantarse lentamente para evitar mareos"
                    )
            ),
            new Medicamento(
                    "Hidroclorotiazida",
                    List.of("Hidroclorotiazida"),
                    List.of("VO"),
                    "Según prescripción médica (diurético tiazídico).",
                    List.of(
                            "Hipertensión arterial",
                            "Edemas leves"
                    ),
                    List.of(
                            "Anuria",
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Hipokalemia",
                            "Hiperglucemia",
                            "Hiperuricemia"
                    ),
                    List.of(
                            "Controlar presión arterial",
                            "Valorar electrolitos y glucemia",
                            "Educar sobre dieta rica en potasio si procede"
                    )
            ),
            new Medicamento(
                    "Espironolactona",
                    List.of("Aldactone"),
                    List.of("VO"),
                    "Según prescripción médica (diurético ahorrador de potasio).",
                    List.of(
                            "Insuficiencia cardiaca",
                            "Hipertensión resistente"
                    ),
                    List.of(
                            "Hiperpotasemia",
                            "Insuficiencia renal grave"
                    ),
                    List.of(
                            "Hiperkalemia",
                            "Ginecomastia (según fármaco)"
                    ),
                    List.of(
                            "Monitorizar potasio sérico",
                            "Valorar función renal",
                            "Educar sobre evitar suplementos de potasio sin indicación"
                    )
            ),
            new Medicamento(
                    "Atenolol",
                    List.of("Tenormin"),
                    List.of("VO"),
                    "Según prescripción médica (betabloqueante).",
                    List.of(
                            "Hipertensión arterial",
                            "Angina",
                            "Arritmias"
                    ),
                    List.of(
                            "Asma grave",
                            "Bloqueo AV de alto grado sin marcapasos",
                            "Bradicardia significativa"
                    ),
                    List.of(
                            "Bradicardia",
                            "Fatiga",
                            "Frialdad en extremidades"
                    ),
                    List.of(
                            "Controlar frecuencia cardiaca y presión arterial",
                            "No suspender bruscamente salvo indicación médica",
                            "Educar sobre posibles cambios en tolerancia al ejercicio"
                    )
            ),
            new Medicamento(
                    "Metoprolol",
                    List.of("Lopressor"),
                    List.of("VO"),
                    "Según prescripción médica (betabloqueante).",
                    List.of(
                            "Hipertensión arterial",
                            "Angina",
                            "Arritmias"
                    ),
                    List.of(
                            "Asma grave",
                            "Bloqueo AV de alto grado sin marcapasos",
                            "Bradicardia significativa"
                    ),
                    List.of(
                            "Bradicardia",
                            "Fatiga",
                            "Frialdad en extremidades"
                    ),
                    List.of(
                            "Controlar frecuencia cardiaca y presión arterial",
                            "No suspender bruscamente salvo indicación médica",
                            "Educar sobre posibles cambios en tolerancia al ejercicio"
                    )
            ),
            new Medicamento(
                    "Propranolol",
                    List.of("Inderal"),
                    List.of("VO"),
                    "Según prescripción médica (betabloqueante).",
                    List.of(
                            "Hipertensión arterial",
                            "Angina",
                            "Arritmias"
                    ),
                    List.of(
                            "Asma grave",
                            "Bloqueo AV de alto grado sin marcapasos",
                            "Bradicardia significativa"
                    ),
                    List.of(
                            "Bradicardia",
                            "Fatiga",
                            "Frialdad en extremidades"
                    ),
                    List.of(
                            "Controlar frecuencia cardiaca y presión arterial",
                            "No suspender bruscamente salvo indicación médica",
                            "Educar sobre posibles cambios en tolerancia al ejercicio"
                    )
            ),
            new Medicamento(
                    "Digoxina",
                    List.of("Lanoxin"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (cardiotónico).",
                    List.of(
                            "Insuficiencia cardiaca",
                            "Fibrilación auricular con respuesta ventricular rápida"
                    ),
                    List.of(
                            "Bloqueo AV de alto grado sin marcapasos",
                            "Cardiomiopatía hipertrófica obstructiva"
                    ),
                    List.of(
                            "Bradicardia",
                            "Náuseas",
                            "Arritmias"
                    ),
                    List.of(
                            "Controlar frecuencia cardiaca y ritmo",
                            "Vigilar signos de intoxicación digitálica",
                            "Revisar niveles séricos si están indicados"
                    )
            ),
            new Medicamento(
                    "Atorvastatina",
                    List.of("Lipitor"),
                    List.of("VO"),
                    "Según prescripción médica (hipolipemiante).",
                    List.of(
                            "Hipercolesterolemia",
                            "Prevención cardiovascular"
                    ),
                    List.of(
                            "Enfermedad hepática activa",
                            "Embarazo y lactancia"
                    ),
                    List.of(
                            "Mialgias",
                            "Elevación de enzimas hepáticas"
                    ),
                    List.of(
                            "Revisar pruebas de función hepática",
                            "Educar sobre dolor muscular persistente",
                            "Reforzar cambios en estilo de vida"
                    )
            ),
            new Medicamento(
                    "Simvastatina",
                    List.of("Zocor"),
                    List.of("VO"),
                    "Según prescripción médica (hipolipemiante).",
                    List.of(
                            "Hipercolesterolemia",
                            "Prevención cardiovascular"
                    ),
                    List.of(
                            "Enfermedad hepática activa",
                            "Embarazo y lactancia"
                    ),
                    List.of(
                            "Mialgias",
                            "Elevación de enzimas hepáticas"
                    ),
                    List.of(
                            "Revisar pruebas de función hepática",
                            "Educar sobre dolor muscular persistente",
                            "Reforzar cambios en estilo de vida"
                    )
            ),
            new Medicamento(
                    "Rosuvastatina",
                    List.of("Crestor"),
                    List.of("VO"),
                    "Según prescripción médica (hipolipemiante).",
                    List.of(
                            "Hipercolesterolemia",
                            "Prevención cardiovascular"
                    ),
                    List.of(
                            "Enfermedad hepática activa",
                            "Embarazo y lactancia"
                    ),
                    List.of(
                            "Mialgias",
                            "Elevación de enzimas hepáticas"
                    ),
                    List.of(
                            "Revisar pruebas de función hepática",
                            "Educar sobre dolor muscular persistente",
                            "Reforzar cambios en estilo de vida"
                    )
            ),
            new Medicamento(
                    "Clopidogrel",
                    List.of("Plavix"),
                    List.of("VO"),
                    "Según prescripción médica (antiagregante plaquetario).",
                    List.of(
                            "Prevención de eventos trombóticos",
                            "Síndrome coronario agudo"
                    ),
                    List.of(
                            "Sangrado activo",
                            "Úlcera péptica activa",
                            "Alergia al fármaco"
                    ),
                    List.of(
                            "Riesgo de sangrado",
                            "Equimosis"
                    ),
                    List.of(
                            "Valorar signos de sangrado",
                            "Educar al paciente sobre riesgo hemorrágico",
                            "Revisar otros medicamentos que aumenten el riesgo de sangrado"
                    )
            ),
            new Medicamento(
                    "Ácido acetilsalicílico baja dosis",
                    List.of("Aspirina cardio"),
                    List.of("VO"),
                    "Según prescripción médica (antiagregante plaquetario).",
                    List.of(
                            "Prevención de eventos trombóticos",
                            "Síndrome coronario agudo"
                    ),
                    List.of(
                            "Sangrado activo",
                            "Úlcera péptica activa",
                            "Alergia al fármaco"
                    ),
                    List.of(
                            "Riesgo de sangrado",
                            "Equimosis"
                    ),
                    List.of(
                            "Valorar signos de sangrado",
                            "Educar al paciente sobre riesgo hemorrágico",
                            "Revisar otros medicamentos que aumenten el riesgo de sangrado"
                    )
            ),
            new Medicamento(
                    "Warfarina",
                    List.of("Coumadin"),
                    List.of("VO"),
                    "Según prescripción médica (anticoagulante).",
                    List.of(
                            "Prevención y tratamiento de trombosis venosa",
                            "Fibrilación auricular"
                    ),
                    List.of(
                            "Sangrado activo",
                            "Trastornos graves de la coagulación"
                    ),
                    List.of(
                            "Hemorragias",
                            "Equimosis fáciles"
                    ),
                    List.of(
                            "Controlar parámetros de coagulación según el fármaco",
                            "Evitar inyecciones intramusculares si es posible",
                            "Educar sobre signos de sangrado"
                    )
            ),
            new Medicamento(
                    "Enoxaparina",
                    List.of("Clexane"),
                    List.of("SC"),
                    "Según prescripción médica (anticoagulante).",
                    List.of(
                            "Prevención y tratamiento de trombosis venosa",
                            "Fibrilación auricular"
                    ),
                    List.of(
                            "Sangrado activo",
                            "Trastornos graves de la coagulación"
                    ),
                    List.of(
                            "Hemorragias",
                            "Equimosis fáciles"
                    ),
                    List.of(
                            "Controlar parámetros de coagulación según el fármaco",
                            "Evitar inyecciones intramusculares si es posible",
                            "Educar sobre signos de sangrado"
                    )
            ),
            new Medicamento(
                    "Metformina",
                    List.of("Glucophage"),
                    List.of("VO"),
                    "Según prescripción médica (antidiabético oral).",
                    List.of(
                            "Diabetes mellitus tipo 2"
                    ),
                    List.of(
                            "Insuficiencia renal o hepática grave (según fármaco)",
                            "Cetoacidosis diabética"
                    ),
                    List.of(
                            "Hipoglucemia (especialmente sulfonilureas)",
                            "Molestias gastrointestinales"
                    ),
                    List.of(
                            "Educar sobre control de glucemia capilar",
                            "Valorar signos de hipoglucemia",
                            "Reforzar dieta y ejercicio"
                    )
            ),
            new Medicamento(
                    "Glibenclamida",
                    List.of("Daonil"),
                    List.of("VO"),
                    "Según prescripción médica (antidiabético oral).",
                    List.of(
                            "Diabetes mellitus tipo 2"
                    ),
                    List.of(
                            "Insuficiencia renal o hepática grave (según fármaco)",
                            "Cetoacidosis diabética"
                    ),
                    List.of(
                            "Hipoglucemia (especialmente sulfonilureas)",
                            "Molestias gastrointestinales"
                    ),
                    List.of(
                            "Educar sobre control de glucemia capilar",
                            "Valorar signos de hipoglucemia",
                            "Reforzar dieta y ejercicio"
                    )
            ),
            new Medicamento(
                    "Gliclazida",
                    List.of("Diamicron"),
                    List.of("VO"),
                    "Según prescripción médica (antidiabético oral).",
                    List.of(
                            "Diabetes mellitus tipo 2"
                    ),
                    List.of(
                            "Insuficiencia renal o hepática grave (según fármaco)",
                            "Cetoacidosis diabética"
                    ),
                    List.of(
                            "Hipoglucemia (especialmente sulfonilureas)",
                            "Molestias gastrointestinales"
                    ),
                    List.of(
                            "Educar sobre control de glucemia capilar",
                            "Valorar signos de hipoglucemia",
                            "Reforzar dieta y ejercicio"
                    )
            ),
            new Medicamento(
                    "Insulina NPH",
                    List.of("Insulina NPH"),
                    List.of("SC"),
                    "Según prescripción médica (insulina).",
                    List.of(
                            "Diabetes mellitus tipo 1",
                            "Diabetes mellitus tipo 2 descompensada"
                    ),
                    List.of(
                            "Hipoglucemia"
                    ),
                    List.of(
                            "Hipoglucemia",
                            "Aumento de peso"
                    ),
                    List.of(
                            "Educar en técnica de inyección",
                            "Controlar glucemias capilares",
                            "Instruir sobre manejo de hipoglucemias"
                    )
            ),
            new Medicamento(
                    "Insulina regular",
                    List.of("Insulina cristálina"),
                    List.of("SC", "IV"),
                    "Según prescripción médica (insulina).",
                    List.of(
                            "Diabetes mellitus tipo 1",
                            "Diabetes mellitus tipo 2 descompensada"
                    ),
                    List.of(
                            "Hipoglucemia"
                    ),
                    List.of(
                            "Hipoglucemia",
                            "Aumento de peso"
                    ),
                    List.of(
                            "Educar en técnica de inyección",
                            "Controlar glucemias capilares",
                            "Instruir sobre manejo de hipoglucemias"
                    )
            ),
            new Medicamento(
                    "Insulina glargina",
                    List.of("Lantus"),
                    List.of("SC"),
                    "Según prescripción médica (insulina).",
                    List.of(
                            "Diabetes mellitus tipo 1",
                            "Diabetes mellitus tipo 2 descompensada"
                    ),
                    List.of(
                            "Hipoglucemia"
                    ),
                    List.of(
                            "Hipoglucemia",
                            "Aumento de peso"
                    ),
                    List.of(
                            "Educar en técnica de inyección",
                            "Controlar glucemias capilares",
                            "Instruir sobre manejo de hipoglucemias"
                    )
            ),
            new Medicamento(
                    "Insulina lispro",
                    List.of("Humalog"),
                    List.of("SC"),
                    "Según prescripción médica (insulina).",
                    List.of(
                            "Diabetes mellitus tipo 1",
                            "Diabetes mellitus tipo 2 descompensada"
                    ),
                    List.of(
                            "Hipoglucemia"
                    ),
                    List.of(
                            "Hipoglucemia",
                            "Aumento de peso"
                    ),
                    List.of(
                            "Educar en técnica de inyección",
                            "Controlar glucemias capilares",
                            "Instruir sobre manejo de hipoglucemias"
                    )
            ),
            new Medicamento(
                    "Levotiroxina",
                    List.of("Eutirox"),
                    List.of("VO"),
                    "Según prescripción médica (hormona tiroidea).",
                    List.of(
                            "Hipotiroidismo"
                    ),
                    List.of(
                            "Tirotoxicosis no tratada",
                            "Infarto agudo de miocardio reciente (precaución)"
                    ),
                    List.of(
                            "Síntomas de hipertiroidismo si dosis excesiva"
                    ),
                    List.of(
                            "Administrar en ayunas",
                            "Controlar TSH periódicamente",
                            "Educar sobre toma diaria a la misma hora"
                    )
            ),
            new Medicamento(
                    "Diazepam",
                    List.of("Valium"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (benzodiacepina).",
                    List.of(
                            "Ansiedad aguda",
                            "Insomnio de corta duración",
                            "Convulsiones (según fármaco)"
                    ),
                    List.of(
                            "Insuficiencia respiratoria grave",
                            "Miastenia gravis",
                            "Abuso previo de sustancias"
                    ),
                    List.of(
                            "Somnolencia",
                            "Dependencia con uso prolongado",
                            "Mareos"
                    ),
                    List.of(
                            "Limitar duración del tratamiento",
                            "Advertir sobre no conducir",
                            "No suspender bruscamente tras uso prolongado"
                    )
            ),
            new Medicamento(
                    "Lorazepam",
                    List.of("Ativan"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (benzodiacepina).",
                    List.of(
                            "Ansiedad aguda",
                            "Insomnio de corta duración",
                            "Convulsiones (según fármaco)"
                    ),
                    List.of(
                            "Insuficiencia respiratoria grave",
                            "Miastenia gravis",
                            "Abuso previo de sustancias"
                    ),
                    List.of(
                            "Somnolencia",
                            "Dependencia con uso prolongado",
                            "Mareos"
                    ),
                    List.of(
                            "Limitar duración del tratamiento",
                            "Advertir sobre no conducir",
                            "No suspender bruscamente tras uso prolongado"
                    )
            ),
            new Medicamento(
                    "Alprazolam",
                    List.of("Xanax"),
                    List.of("VO"),
                    "Según prescripción médica (benzodiacepina).",
                    List.of(
                            "Ansiedad aguda",
                            "Insomnio de corta duración",
                            "Convulsiones (según fármaco)"
                    ),
                    List.of(
                            "Insuficiencia respiratoria grave",
                            "Miastenia gravis",
                            "Abuso previo de sustancias"
                    ),
                    List.of(
                            "Somnolencia",
                            "Dependencia con uso prolongado",
                            "Mareos"
                    ),
                    List.of(
                            "Limitar duración del tratamiento",
                            "Advertir sobre no conducir",
                            "No suspender bruscamente tras uso prolongado"
                    )
            ),
            new Medicamento(
                    "Clonazepam",
                    List.of("Rivotril"),
                    List.of("VO"),
                    "Según prescripción médica (benzodiacepina).",
                    List.of(
                            "Ansiedad aguda",
                            "Insomnio de corta duración",
                            "Convulsiones (según fármaco)"
                    ),
                    List.of(
                            "Insuficiencia respiratoria grave",
                            "Miastenia gravis",
                            "Abuso previo de sustancias"
                    ),
                    List.of(
                            "Somnolencia",
                            "Dependencia con uso prolongado",
                            "Mareos"
                    ),
                    List.of(
                            "Limitar duración del tratamiento",
                            "Advertir sobre no conducir",
                            "No suspender bruscamente tras uso prolongado"
                    )
            ),
            new Medicamento(
                    "Haloperidol",
                    List.of("Haldol"),
                    List.of("VO", "IM"),
                    "Según prescripción médica (antipsicótico).",
                    List.of(
                            "Esquizofrenia",
                            "Trastornos psicóticos",
                            "Episodios de agitación"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Sedación",
                            "Aumento de peso",
                            "Efectos extrapiramidales (según fármaco)"
                    ),
                    List.of(
                            "Vigilar signos de síndrome extrapiramidal",
                            "Controlar peso y metabolismo",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Risperidona",
                    List.of("Risperdal"),
                    List.of("VO"),
                    "Según prescripción médica (antipsicótico).",
                    List.of(
                            "Esquizofrenia",
                            "Trastornos psicóticos",
                            "Episodios de agitación"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Sedación",
                            "Aumento de peso",
                            "Efectos extrapiramidales (según fármaco)"
                    ),
                    List.of(
                            "Vigilar signos de síndrome extrapiramidal",
                            "Controlar peso y metabolismo",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Olanzapina",
                    List.of("Zyprexa"),
                    List.of("VO"),
                    "Según prescripción médica (antipsicótico).",
                    List.of(
                            "Esquizofrenia",
                            "Trastornos psicóticos",
                            "Episodios de agitación"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Sedación",
                            "Aumento de peso",
                            "Efectos extrapiramidales (según fármaco)"
                    ),
                    List.of(
                            "Vigilar signos de síndrome extrapiramidal",
                            "Controlar peso y metabolismo",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Quetiapina",
                    List.of("Seroquel"),
                    List.of("VO"),
                    "Según prescripción médica (antipsicótico).",
                    List.of(
                            "Esquizofrenia",
                            "Trastornos psicóticos",
                            "Episodios de agitación"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Precaución en cardiopatías"
                    ),
                    List.of(
                            "Sedación",
                            "Aumento de peso",
                            "Efectos extrapiramidales (según fármaco)"
                    ),
                    List.of(
                            "Vigilar signos de síndrome extrapiramidal",
                            "Controlar peso y metabolismo",
                            "Educar sobre adherencia al tratamiento"
                    )
            ),
            new Medicamento(
                    "Sertralina",
                    List.of("Zoloft"),
                    List.of("VO"),
                    "Según prescripción médica (antidepresivo ISRS).",
                    List.of(
                            "Depresión mayor",
                            "Trastorno de ansiedad"
                    ),
                    List.of(
                            "Uso concomitante con IMAO",
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Náuseas",
                            "Insomnio o somnolencia",
                            "Disfunción sexual"
                    ),
                    List.of(
                            "Informar sobre latencia de efecto terapéutico",
                            "Vigilar ideación suicida, especialmente al inicio",
                            "No suspender bruscamente"
                    )
            ),
            new Medicamento(
                    "Fluoxetina",
                    List.of("Prozac"),
                    List.of("VO"),
                    "Según prescripción médica (antidepresivo ISRS).",
                    List.of(
                            "Depresión mayor",
                            "Trastorno de ansiedad"
                    ),
                    List.of(
                            "Uso concomitante con IMAO",
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Náuseas",
                            "Insomnio o somnolencia",
                            "Disfunción sexual"
                    ),
                    List.of(
                            "Informar sobre latencia de efecto terapéutico",
                            "Vigilar ideación suicida, especialmente al inicio",
                            "No suspender bruscamente"
                    )
            ),
            new Medicamento(
                    "Citalopram",
                    List.of("Celexa"),
                    List.of("VO"),
                    "Según prescripción médica (antidepresivo ISRS).",
                    List.of(
                            "Depresión mayor",
                            "Trastorno de ansiedad"
                    ),
                    List.of(
                            "Uso concomitante con IMAO",
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Náuseas",
                            "Insomnio o somnolencia",
                            "Disfunción sexual"
                    ),
                    List.of(
                            "Informar sobre latencia de efecto terapéutico",
                            "Vigilar ideación suicida, especialmente al inicio",
                            "No suspender bruscamente"
                    )
            ),
            new Medicamento(
                    "Escitalopram",
                    List.of("Lexapro"),
                    List.of("VO"),
                    "Según prescripción médica (antidepresivo ISRS).",
                    List.of(
                            "Depresión mayor",
                            "Trastorno de ansiedad"
                    ),
                    List.of(
                            "Uso concomitante con IMAO",
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Náuseas",
                            "Insomnio o somnolencia",
                            "Disfunción sexual"
                    ),
                    List.of(
                            "Informar sobre latencia de efecto terapéutico",
                            "Vigilar ideación suicida, especialmente al inicio",
                            "No suspender bruscamente"
                    )
            ),
            new Medicamento(
                    "Amitriptilina",
                    List.of("Amitriptilina"),
                    List.of("VO"),
                    "Según prescripción médica (antidepresivo tricíclico).",
                    List.of(
                            "Depresión",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Infarto de miocardio reciente",
                            "Bloqueos de conducción cardiaca"
                    ),
                    List.of(
                            "Sedación",
                            "Sequedad de boca",
                            "Arritmias (sobredosis)"
                    ),
                    List.of(
                            "Precaución en pacientes con riesgo suicida",
                            "Vigilar efectos anticolinérgicos",
                            "Controlar ECG en dosis altas"
                    )
            ),
            new Medicamento(
                    "Carbamazepina",
                    List.of("Tegretol"),
                    List.of("VO"),
                    "Según prescripción médica (antiepiléptico).",
                    List.of(
                            "Epilepsia",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Somnolencia",
                            "Mareos",
                            "Alteraciones en pruebas hepáticas (según fármaco)"
                    ),
                    List.of(
                            "No suspender bruscamente",
                            "Controlar niveles plasmáticos si procede",
                            "Educar sobre adherencia estricta"
                    )
            ),
            new Medicamento(
                    "Ácido valproico",
                    List.of("Depakene"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antiepiléptico).",
                    List.of(
                            "Epilepsia",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Somnolencia",
                            "Mareos",
                            "Alteraciones en pruebas hepáticas (según fármaco)"
                    ),
                    List.of(
                            "No suspender bruscamente",
                            "Controlar niveles plasmáticos si procede",
                            "Educar sobre adherencia estricta"
                    )
            ),
            new Medicamento(
                    "Fenitoína",
                    List.of("Epamin"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antiepiléptico).",
                    List.of(
                            "Epilepsia",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Somnolencia",
                            "Mareos",
                            "Alteraciones en pruebas hepáticas (según fármaco)"
                    ),
                    List.of(
                            "No suspender bruscamente",
                            "Controlar niveles plasmáticos si procede",
                            "Educar sobre adherencia estricta"
                    )
            ),
            new Medicamento(
                    "Gabapentina",
                    List.of("Neurontin"),
                    List.of("VO"),
                    "Según prescripción médica (antiepiléptico).",
                    List.of(
                            "Epilepsia",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Somnolencia",
                            "Mareos",
                            "Alteraciones en pruebas hepáticas (según fármaco)"
                    ),
                    List.of(
                            "No suspender bruscamente",
                            "Controlar niveles plasmáticos si procede",
                            "Educar sobre adherencia estricta"
                    )
            ),
            new Medicamento(
                    "Pregabalina",
                    List.of("Lyrica"),
                    List.of("VO"),
                    "Según prescripción médica (antiepiléptico).",
                    List.of(
                            "Epilepsia",
                            "Dolor neuropático (según fármaco)"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Somnolencia",
                            "Mareos",
                            "Alteraciones en pruebas hepáticas (según fármaco)"
                    ),
                    List.of(
                            "No suspender bruscamente",
                            "Controlar niveles plasmáticos si procede",
                            "Educar sobre adherencia estricta"
                    )
            ),
            new Medicamento(
                    "Morfina",
                    List.of("Morfina"),
                    List.of("IV", "IM", "SC"),
                    "Según prescripción médica (analgésico opioide).",
                    List.of(
                            "Dolor moderado a severo"
                    ),
                    List.of(
                            "Depresión respiratoria",
                            "Íleo paralítico"
                    ),
                    List.of(
                            "Estreñimiento",
                            "Náuseas",
                            "Depresión respiratoria (dosis altas)"
                    ),
                    List.of(
                            "Valorar intensidad del dolor y nivel de sedación",
                            "Vigilar frecuencia respiratoria",
                            "Prevenir y tratar estreñimiento asociado"
                    )
            ),
            new Medicamento(
                    "Tramadol",
                    List.of("Tramal"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (analgésico opioide débil).",
                    List.of(
                            "Dolor moderado"
                    ),
                    List.of(
                            "Depresión respiratoria significativa",
                            "Uso concomitante con depresores del SNC sin control"
                    ),
                    List.of(
                            "Náuseas",
                            "Mareos",
                            "Estreñimiento"
                    ),
                    List.of(
                            "Valorar alivio del dolor y efectos adversos",
                            "Advertir sobre mareos y no conducir",
                            "Revisar interacciones medicamentosas"
                    )
            ),
            new Medicamento(
                    "Codeína",
                    List.of("Codeína"),
                    List.of("VO"),
                    "Según prescripción médica (analgésico opioide débil).",
                    List.of(
                            "Dolor moderado"
                    ),
                    List.of(
                            "Depresión respiratoria significativa",
                            "Uso concomitante con depresores del SNC sin control"
                    ),
                    List.of(
                            "Náuseas",
                            "Mareos",
                            "Estreñimiento"
                    ),
                    List.of(
                            "Valorar alivio del dolor y efectos adversos",
                            "Advertir sobre mareos y no conducir",
                            "Revisar interacciones medicamentosas"
                    )
            ),
            new Medicamento(
                    "Fentanilo",
                    List.of("Fentanilo"),
                    List.of("IV", "Transdérmica"),
                    "Según prescripción médica (analgésico opioide).",
                    List.of(
                            "Dolor moderado a severo"
                    ),
                    List.of(
                            "Depresión respiratoria",
                            "Íleo paralítico"
                    ),
                    List.of(
                            "Estreñimiento",
                            "Náuseas",
                            "Depresión respiratoria (dosis altas)"
                    ),
                    List.of(
                            "Valorar intensidad del dolor y nivel de sedación",
                            "Vigilar frecuencia respiratoria",
                            "Prevenir y tratar estreñimiento asociado"
                    )
            ),
            new Medicamento(
                    "Ketamina",
                    List.of("Ketalar"),
                    List.of("IV", "IM"),
                    "Según prescripción médica (anestésico/ sedante IV).",
                    List.of(
                            "Sedación",
                            "Inducción anestésica"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Depresión respiratoria",
                            "Hipotensión",
                            "Somnolencia intensa"
                    ),
                    List.of(
                            "Requiere monitorización continua",
                            "Controlar constantes vitales",
                            "Disponibilidad de equipo de reanimación"
                    )
            ),
            new Medicamento(
                    "Midazolam",
                    List.of("Dormicum"),
                    List.of("IV", "VO"),
                    "Según prescripción médica (anestésico/ sedante IV).",
                    List.of(
                            "Sedación",
                            "Inducción anestésica"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Depresión respiratoria",
                            "Hipotensión",
                            "Somnolencia intensa"
                    ),
                    List.of(
                            "Requiere monitorización continua",
                            "Controlar constantes vitales",
                            "Disponibilidad de equipo de reanimación"
                    )
            ),
            new Medicamento(
                    "Propofol",
                    List.of("Diprivan"),
                    List.of("IV"),
                    "Según prescripción médica (anestésico/ sedante IV).",
                    List.of(
                            "Sedación",
                            "Inducción anestésica"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Depresión respiratoria",
                            "Hipotensión",
                            "Somnolencia intensa"
                    ),
                    List.of(
                            "Requiere monitorización continua",
                            "Controlar constantes vitales",
                            "Disponibilidad de equipo de reanimación"
                    )
            ),
            new Medicamento(
                    "Nistatina",
                    List.of("Nistatina"),
                    List.of("VO", "Tópica"),
                    "Según prescripción médica (antifúngico).",
                    List.of(
                            "Infecciones fúngicas cutáneas o sistémicas"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Alteración de enzimas hepáticas"
                    ),
                    List.of(
                            "Vigilar función hepática en tratamientos prolongados",
                            "Educar sobre duración del tratamiento",
                            "Revisar interacciones medicamentosas"
                    )
            ),
            new Medicamento(
                    "Fluconazol",
                    List.of("Diflucan"),
                    List.of("VO", "IV"),
                    "Según prescripción médica (antifúngico).",
                    List.of(
                            "Infecciones fúngicas cutáneas o sistémicas"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Molestias gastrointestinales",
                            "Alteración de enzimas hepáticas"
                    ),
                    List.of(
                            "Vigilar función hepática en tratamientos prolongados",
                            "Educar sobre duración del tratamiento",
                            "Revisar interacciones medicamentosas"
                    )
            ),
            new Medicamento(
                    "Aciclovir",
                    List.of("Zovirax"),
                    List.of("VO", "IV", "Tópica"),
                    "Según prescripción médica (antiviral).",
                    List.of(
                            "Infecciones virales específicas (p. ej. herpes)",
                            "Profilaxis en pacientes de riesgo"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco"
                    ),
                    List.of(
                            "Náuseas",
                            "Cefalea"
                    ),
                    List.of(
                            "Iniciar tratamiento lo antes posible según indicación",
                            "Ajustar dosis en insuficiencia renal si procede",
                            "Educar sobre adherencia al esquema"
                    )
            ),
            new Medicamento(
                    "Albendazol",
                    List.of("Zentel"),
                    List.of("VO"),
                    "Según prescripción médica (antiparasitario).",
                    List.of(
                            "Helmintiasis",
                            "Otras parasitosis intestinales"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Embarazo en determinados fármacos (valorar ficha técnica)"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Diarrea"
                    ),
                    List.of(
                            "Educar sobre medidas higiénicas para evitar reinfección",
                            "Valorar necesidad de tratar contactos",
                            "Seguir esquema completo de tratamiento"
                    )
            ),
            new Medicamento(
                    "Mebendazol",
                    List.of("Mebendazol"),
                    List.of("VO"),
                    "Según prescripción médica (antiparasitario).",
                    List.of(
                            "Helmintiasis",
                            "Otras parasitosis intestinales"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Embarazo en determinados fármacos (valorar ficha técnica)"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Diarrea"
                    ),
                    List.of(
                            "Educar sobre medidas higiénicas para evitar reinfección",
                            "Valorar necesidad de tratar contactos",
                            "Seguir esquema completo de tratamiento"
                    )
            ),
            new Medicamento(
                    "Praziquantel",
                    List.of("Biltricide"),
                    List.of("VO"),
                    "Según prescripción médica (antiparasitario).",
                    List.of(
                            "Helmintiasis",
                            "Otras parasitosis intestinales"
                    ),
                    List.of(
                            "Hipersensibilidad al fármaco",
                            "Embarazo en determinados fármacos (valorar ficha técnica)"
                    ),
                    List.of(
                            "Dolor abdominal",
                            "Diarrea"
                    ),
                    List.of(
                            "Educar sobre medidas higiénicas para evitar reinfección",
                            "Valorar necesidad de tratar contactos",
                            "Seguir esquema completo de tratamiento"
                    )
            ),
            new Medicamento(
                    "Sales de rehidratación oral",
                    List.of("SRO"),
                    List.of("VO"),
                    "Según prescripción médica (sales de rehidratación oral).",
                    List.of(
                            "Deshidratación leve a moderada por diarrea",
                            "Prevención de deshidratación"
                    ),
                    List.of(
                            "Shock hipovolémico",
                            "Vómitos incoercibles"
                    ),
                    List.of(
                            "Náuseas si se administra demasiado rápido"
                    ),
                    List.of(
                            "Administrar en pequeños sorbos frecuentes",
                            "Valorar signos de hidratación",
                            "Educar a familiares sobre preparación correcta"
                    )
            ),
            new Medicamento(
                    "Solución salina 0.9%",
                    List.of("Suero fisiológico"),
                    List.of("IV"),
                    "Según prescripción médica (solución intravenosa).",
                    List.of(
                            "Reposición de volumen",
                            "Hidratación parenteral"
                    ),
                    List.of(
                            "Sobrecarga de volumen",
                            "Insuficiencia cardiaca descompensada"
                    ),
                    List.of(
                            "Edemas si hay sobrecarga",
                            "Alteraciones electrolíticas (según solución)"
                    ),
                    List.of(
                            "Valorar balance hídrico",
                            "Controlar signos de sobrecarga de volumen",
                            "Revisar punto de inserción del acceso venoso"
                    )
            ),
            new Medicamento(
                    "Ringer lactato",
                    List.of("Ringer lactato"),
                    List.of("IV"),
                    "Según prescripción médica (solución intravenosa).",
                    List.of(
                            "Reposición de volumen",
                            "Hidratación parenteral"
                    ),
                    List.of(
                            "Sobrecarga de volumen",
                            "Insuficiencia cardiaca descompensada"
                    ),
                    List.of(
                            "Edemas si hay sobrecarga",
                            "Alteraciones electrolíticas (según solución)"
                    ),
                    List.of(
                            "Valorar balance hídrico",
                            "Controlar signos de sobrecarga de volumen",
                            "Revisar punto de inserción del acceso venoso"
                    )
            ),
            new Medicamento(
                    "Glucosa al 5%",
                    List.of("Dextrosa 5%"),
                    List.of("IV"),
                    "Según prescripción médica (solución intravenosa).",
                    List.of(
                            "Reposición de volumen",
                            "Hidratación parenteral"
                    ),
                    List.of(
                            "Sobrecarga de volumen",
                            "Insuficiencia cardiaca descompensada"
                    ),
                    List.of(
                            "Edemas si hay sobrecarga",
                            "Alteraciones electrolíticas (según solución)"
                    ),
                    List.of(
                            "Valorar balance hídrico",
                            "Controlar signos de sobrecarga de volumen",
                            "Revisar punto de inserción del acceso venoso"
                    )
            ),
            new Medicamento(
                    "Oxígeno medicinal",
                    List.of("Oxígeno"),
                    List.of("Inhalatoria"),
                    "Según prescripción médica (oxígeno medicinal).",
                    List.of(
                            "Hipoxemia",
                            "Insuficiencia respiratoria"
                    ),
                    List.of(
                            "Uso sin indicación ni monitorización adecuada"
                    ),
                    List.of(
                            "Riesgo de toxicidad por O2 a altas fracciones inspiradas",
                            "Sequedad de mucosas"
                    ),
                    List.of(
                            "Monitorizar saturación de oxígeno",
                            "Ajustar flujo según indicaciones",
                            "Controlar integridad de piel bajo dispositivos"
                    )
            )
    );

    @GetMapping("/medicamentos") //maneja las peticiones GET en la ruta raíz (http://localhost:8080/)
    public List<Medicamento> listaDeMedicamentos() {
        return medicamentos;
    }
    @GetMapping("/sintoma") //maneja las peticiones GET en la ruta raíz (http://localhost:8080/)
    public List<Medicamento> sintoma(@RequestParam String sintoma) {
        List<Medicamento> medicamentosSintoma = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            if(medicamento.getIndicaciones().contains(sintoma)) {
                medicamentosSintoma.add(medicamento);
            }
        }
        return medicamentosSintoma;
    }

}
