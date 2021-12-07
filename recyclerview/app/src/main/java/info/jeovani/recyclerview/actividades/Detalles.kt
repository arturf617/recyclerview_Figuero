package info.jeovani.recyclerview.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.jeovani.recyclerview.R
import info.jeovani.recyclerview.clasesdatos.Pelicula
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val pelicula = intent.getSerializableExtra("pel") as Pelicula

        adTvTitulo.text = getString(R.string.titulo, pelicula.titulo)
        adTvDirector.text = getString(R.string.director, pelicula.director)
        adTvGenero.text = getString(R.string.genero, pelicula.genero)
        adTvCalificacion.text = getString(R.string.calificacion, pelicula.calificacion.toString())
        adTvDuracion.text = getString(R.string.duracion, pelicula.duracion.toString())
        adTvFecha.text = getString(R.string.fecha, pelicula.fecha)

    }
}
