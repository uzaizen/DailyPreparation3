package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.fragment_max_customers.*
import kotlinx.android.synthetic.main.fragment_max_customers.view.*


class MaxCustomersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("uztest", "MaxCustomerFragment has started")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_max_customers, container, false)

        view.maxcustomersbutton.setOnClickListener(maxcustomernumberset())

        return view
    }

    private inner class maxcustomernumberset : View.OnClickListener {
        override fun onClick(view: View) {
            if (maxcustomers.text == null) {
                Log.d("uztest", "it is null")
            } else {
                MAXCUSTOMER = maxcustomers.text.toString().toInt()
                Log.d("uztest", "data is ${MAXCUSTOMER}")
            }
            /*キーボードを消す*/
            val inputManager = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
        }
    }

