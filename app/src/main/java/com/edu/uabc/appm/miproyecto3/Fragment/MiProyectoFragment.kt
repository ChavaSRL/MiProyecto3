package com.edu.uabc.appm.miproyecto3.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.edu.uabc.appm.miproyecto3.R
import kotlinx.android.synthetic.main.fragment_mi_proyecto.*



class MiProyectoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mi_proyecto, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        primerpa.text="Desarrollo de una aplicación web para la gestión de información en el área de control escolar del CEART Mexicali."

        segundopa.text="La presente investigación aborda una de las problemáticas que desde hace años ha afectado" +
                " a la institución, la cual es llevar un control adecuado en el área de Control Escolar del Centro Estatal" +
                " de las artes (CEART) Mexicali, donde actualmente cuentan con un sistema llamado CEARTESC instalado en un" +
                " solo equipo para la gestión de información de los 180 alumnos, 6 disciplinas en las cuales hay en promedio" +
                " 5 clases y 20 maestros."

        tercerpa.text="Desarrollo de aplicación web para la gestión de información del área de control escolar apoyando en la toma de decisiones."


        cuartapa.text="•\tDiseñar una interfaz de administrador amigable.\n" +
                "•\tAcceder a la información en tiempo real y disminuir el tiempo de respuesta.\n" +
                "•\tControl de estatus de pago de alumnos.\n" +
                "•\tBrindar facilidad de inscripción en línea a los alumnos del CEART.\n" +
                "•\tGenerar lista de asistencia de alumnos y personal docente.\n" +
                "•\tConsultar datos académicos de alumnos y maestros.\n" +
                "•\tAdministrar los ciclos escolares.\n"
    }





}
