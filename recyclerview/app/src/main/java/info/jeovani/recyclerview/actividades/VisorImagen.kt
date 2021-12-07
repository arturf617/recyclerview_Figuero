package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.clasesdatos.Pelicula
import info.jeovani.recyclerview.R
import kotlinx.android.synthetic.main.activity_visor_imagen.*

class VisorImagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val pelicula = intent.getSerializableExtra("pel") as Pelicula

        aviIvPelicula.setImageResource(pelicula.idImagen)
    }
}
