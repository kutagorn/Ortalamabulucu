package kutaycan.kaynak.ortalamabulucu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hesapla.setOnClickListener{
            if(editTextNumber1.text.isNotEmpty()&&editTextNumber2.text.isNotEmpty()){
                var sinav1 =editTextNumber1.text.toString().toInt()
                var sinav2 =editTextNumber2.text.toString().toInt()
                var ortalama:Double = (sinav1+sinav2)/2.toDouble()
                if(ortalama>=50){
                    sonucText.text = ortalama.toString()+ " " + "Geçtiniz!!"
                    sonucText.setTextColor(getColor(R.color.green))

                }else {
                    sonucText.text = ortalama.toString()+ " " + "Kaldin!!"
                    sonucText.setTextColor(getColor(R.color.red))
                }

            }else {
                sonucText.text ="Sinav notunu gir"
                sonucText.setTextColor(getColor(R.color.red))}
        }
    }
}