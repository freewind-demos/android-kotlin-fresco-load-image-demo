package demos

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.facebook.drawee.view.SimpleDraweeView


class MainActivity : AppCompatActivity() {

    private val imageUri = "https://images.pexels.com/photos/5716513/pexels-photo-5716513.jpeg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val imageView = findViewById<SimpleDraweeView>(R.id.my_image_view)
            imageView.setImageURI(imageUri)
        }
    }

}
