package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_num_update.*
import kotlinx.android.synthetic.main.activity_seasoning_update.*

class SeasoningUpdateActivity : AppCompatActivity() {
    lateinit var updatename: String
    var updateneedcook: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seasoning_update)

        val UpdateName = intent.getStringExtra("Name")
        val UpdateNeedCook = intent.getStringExtra("NeedCook")

        Log.d("uztest","UpdateName is "+UpdateName.toString())
        Log.d("uztest","UpdateNeedCook is ${UpdateNeedCook}")

        updatename = UpdateName.toString()
        SeasoningName.text = updatename

        updateneedcook = UpdateNeedCook.toString().toInt()

        if (updateneedcook == 0){  toggleButton.isChecked = false}
        else if (updateneedcook ==1) {toggleButton.isChecked = true}

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Log.d("uztest","toggle button is enabled")
                updateneedcook = 1
                // The toggle is enabled
            } else {
                Log.d("uztest", "tobble button is disabled")
                updateneedcook = 0
                // The toggle is disabled
            }
        }


        SeasoningUpdateButton.setOnClickListener { view ->

            /*キーボードを消す*/
            val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
           inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)

            Log.d("uztest", "updatename="+updatename)
            Log.d("uztest", "updateneedcook = ${updateneedcook}")
            when (updatename){
                  Mayonnaise.Name ->   {
                      Mayonnaise.Needcook = updateneedcook
                  }

                Tartar.Name -> {
                    Tartar.Needcook = updateneedcook
                }

                Mayodre.Name -> {
                    Mayodre.Needcook = updateneedcook
                }

                Soydre.Name -> {
                    Soydre.Needcook = updateneedcook
                }

                Rapeedre.Name -> {
                    Rapeedre.Needcook = updateneedcook
                }

                TomatoSauce.Name -> {
                    TomatoSauce.Needcook = updateneedcook
                }

                Balsamic.Name -> {
                    Balsamic.Needcook = updateneedcook
                }

                SmokeShoyu.Name -> {
                    SmokeShoyu.Needcook = updateneedcook
                }

                Whey.Name -> {
                    Whey.Needcook = updateneedcook
                }
            }
            finish()
        }
    }
}