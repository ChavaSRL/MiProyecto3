package com.edu.uabc.appm.miproyecto3.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.edu.uabc.appm.miproyecto3.R
import kotlinx.android.synthetic.main.fragment_blibliografia.*

class BibliografiaFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blibliografia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Cont.text="https://www.youtube.com/watch?v=-s39b_Ki1C8\n" +
                "https://www.youtube.com/watch?v=Nc0FAbipWuE\n" +
                "https://www.desarrollolibre.net/blog/android/como-crear-un-navigationview-con-kotlin-en-android-studio#.XLPYQaTp1PY\n" +
                "https://www.youtube.com/watch?v=vC0uHjMDN0E\n" +
                "https://www.youtube.com/watch?v=fGcMLu1GJEc  //iconos\n" +
                "https://www.youtube.com/watch?v=bM8xfBvz71E&t=619s\n" +
                "https://www.youtube.com/watch?v=mN6kM_1M0cY\n" +
                "https://www.youtube.com/watch?v=VIucl1jcJ-I\n" +
                "https://www.youtube.com/watch?v=ZBCNrqYJ7w0 enviar datos del main al activy al xml\n" +
                "https://code.tutsplus.com/es/tutorials/code-an-image-gallery-android-app-with-picasso--cms-30966\n" +
                "https://www.youtube.com/watch?v=An-mS2oneCw\n" +
                "https://github.com/hdodenhof/CircleImageView"
    }


}
