package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_num_update.*


class NumUpdateActivity : AppCompatActivity() {
    lateinit var updatename: String
    var updaterequired: Int = 0
    var updatestock: Int = 0
    var updatecook: Int = 0
    var updatetotal: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_update)

        EditRequired.setFocusable(false)
        EditTotal.setFocusable(false)

        val UpdateName = intent.getStringExtra("Name")
        val UpdateRequired = intent.getStringExtra("Required")
        val UpdateStock = intent.getStringExtra("Stock")
        val UpdateCook = intent.getStringExtra("Cook")
        val UpdateTotal = intent.getStringExtra("Total")

        updatename = UpdateName.toString()
        updaterequired = UpdateRequired.toString().toInt()
        updatestock = UpdateStock.toString().toInt()
        updatecook = UpdateCook.toString().toInt()
        updatetotal = UpdateTotal.toString().toInt()

        when (UpdateName) {
            Soup.Name -> {
                updatestock = Soup.Stock
                updatecook = Soup.Cook
                updatetotal = Soup.Total
            }

            PotatoSalad.Name -> {
                updatestock = PotatoSalad.Stock
                updatecook = PotatoSalad.Cook
                updatetotal = PotatoSalad.Total
            }

            CarrotRapee.Name -> {
                updatestock = CarrotRapee.Stock
                updatecook = CarrotRapee.Cook
                updatetotal = CarrotRapee.Total
            }

            Rice.Name -> {
                updatestock = Rice.Stock
                updatecook = Rice.Cook
                updatetotal = Rice.Total
            }

            Hamberg.Name -> {
                updatestock = Hamberg.Stock
                updatecook = Hamberg.Cook
                updatetotal = Hamberg.Total
            }

            Locomoko.Name -> {
                updatestock = Locomoko.Stock
                updatecook = Locomoko.Cook
                updatetotal = Locomoko.Total
            }

            Sarmon.Name -> {
                updatestock = Sarmon.Stock
                updatecook = Sarmon.Cook
                updatetotal = Sarmon.Total
            }

            Chiken.Name -> {
                updatestock = Chiken.Stock
                updatecook = Chiken.Cook
                updatetotal = Chiken.Total
            }

            RoastBeef.Name -> {
                updatestock = RoastBeef.Stock
                updatecook = RoastBeef.Cook
                updatetotal = RoastBeef.Total
            }
        }

        recul()

        var stockswitch: Int = 0
        var stockswitch2: Int = 0

        EditStock.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (stockswitch2 == 1) {
                    stockswitch2 = 0
                    return
                }
                updatestock = p0.toString().toInt()
                if (stockswitch == 0) {
                    updatecook = updaterequired - updatestock
                    updatetotal = updatestock + updatecook
                    recul()
                } else
                    if (stockswitch == 1) {
                        updatetotal = updatestock + updatecook
                        recul()
                    }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p1 == 0 && p2 == 1 && p3 == 0) {
                    stockswitch2 = 1
                    return
                }
            }
        })

        var cookswitch2: Int = 0
        EditCook.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (cookswitch2 == 1) {
                    cookswitch2 = 0
                    return
                }
                stockswitch = 1
                updatecook = p0.toString().toInt()
                if (updatecook < 10000) {
                    updatetotal = updatestock + updatecook
                    recul()
                } else {}
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p1 == 0 && p2 == 1 && p3 == 0) {
                    cookswitch2 = 1
                    return
                }
            }
        })

        FixButton.setOnClickListener { view ->

            /*キーボードを消す*/
            val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)

            when (UpdateName) {
                Soup.Name -> {
                    Soup.Stock = updatestock
                    Soup.Cook = updatecook
                    Soup.Total = updatetotal
                }

                PotatoSalad.Name -> {
                    PotatoSalad.Stock = updatestock
                    PotatoSalad.Cook = updatecook
                    PotatoSalad.Total = updatetotal
                }

                CarrotRapee.Name -> {
                    CarrotRapee.Stock = updatestock
                    CarrotRapee.Cook = updatecook
                    CarrotRapee.Total = updatetotal
                }

                Rice.Name -> {
                    Rice.Stock = updatestock
                    Rice.Cook = updatecook
                    Rice.Total = updatetotal
                }

                Hamberg.Name -> {
                    Hamberg.Stock = updatestock
                    Hamberg.Cook = updatecook
                    Hamberg.Total = updatetotal
                }

                Locomoko.Name -> {
                    Locomoko.Stock = updatestock
                    Locomoko.Cook = updatecook
                    Locomoko.Total = updatetotal
                }

                Sarmon.Name -> {
                    Sarmon.Stock = updatestock
                    Sarmon.Cook = updatecook
                    Sarmon.Total = updatetotal
                }

                Chiken.Name -> {
                    Chiken.Stock = updatestock
                    Chiken.Cook = updatecook
                    Chiken.Total = updatetotal
                }

                RoastBeef.Name -> {
                    RoastBeef.Stock = updatestock
                    RoastBeef.Cook = updatecook
                    RoastBeef.Total = updatetotal
                }
            }
            finish()
        }
    }

    fun recul() {
        UpdateTitle.text = updatename
        EditRequired.hint = updaterequired.toString()
        EditStock.hint = updatestock.toString()
        EditCook.hint = updatecook.toString()
        EditTotal.hint = updatetotal.toString()


        /*　EditTextのTextにStringをセットする方法
        UpdateTitle.setText(updatename, TextView.BufferType.NORMAL)
        EditRequired.setText(updaterequired.toString(), TextView.BufferType.NORMAL)
        EditStock.setText(updatestock.toString(), TextView.BufferType.NORMAL)
        EditCook.setText(updatecook.toString(), TextView.BufferType.NORMAL)
        EditTotal.setText(updatetotal.toString(), TextView.BufferType.NORMAL)

         */
    }


}




