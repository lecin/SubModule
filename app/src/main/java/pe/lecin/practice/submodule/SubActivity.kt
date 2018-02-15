package pe.lecin.practice.submodule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
    
    fun test() {
        Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
        toast.show();
    }
}
