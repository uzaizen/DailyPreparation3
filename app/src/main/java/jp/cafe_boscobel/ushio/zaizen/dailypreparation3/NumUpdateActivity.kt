package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class NumUpdateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("uztest","debug1")
        setContentView(R.layout.activity_num_update)
        Log.d("uztest","debug2")

        val UpdateName = intent.getStringExtra("Name")
        val UpdateRequired = intent.getStringExtra("Required")
        val UpdateStock = intent.getStringExtra("Stock")
        val UpdateCook = intent.getStringExtra("Cook")
        val UpdateTotal = intent.getStringExtra("Total")

        Log.d("uztest", "debug3"+UpdateName+UpdateRequired+UpdateStock+UpdateCook+UpdateTotal)

        var updaterequired:Int = UpdateRequired.toString().toInt()
        var updatestock:Int = UpdateStock.toString().toInt()
        var updatecook: Int = UpdateCook.toString().toInt()
        var updatetotal :Int = UpdateTotal.toString().toInt()

        Log.d("uztest","debug4")
    }
}
