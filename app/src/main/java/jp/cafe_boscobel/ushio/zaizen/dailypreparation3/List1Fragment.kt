package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class List1Fragment : Fragment() {

    lateinit var mDish1List: ArrayList<Dish1>

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list1, container, false)

        mDish1List = arrayListOf(Soup, PotatoSalad, CarrotRapee, Rice, Hamberg, Locomoko, Sarmon, Chiken, RoastBeef)

        val list1View = view.findViewById<ListView>(R.id.list1_view)

//        val _from = arrayOf("name", "Required", "Stock", "Cook", "Total")
//        val _to = intArrayOf(R.id.rwMenuName, R.id.rwRequired, R.id.rwStock, R.id.rwToday, R.id.rwTotal)

        val adapter = CustomAdapter(requireContext(), mDish1List)

        list1View.adapter = adapter

        list1View.setOnItemClickListener{parent:AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position)
            val dish1 = mDish1List[position]

            val UpdateName = dish1.Name
            val UpdateRequired = dish1.Required.toString()
            var UpdateStock = dish1.Stock.toString()
            var UpdateCook = dish1.Cook.toString()
            var UpdateTotal = dish1.Total.toString()


            val intent2NumInput = Intent(
//                    requireContext(),
                    getActivity(),
                    NumUpdateActivity::class.java
            )

            intent2NumInput.putExtra("Name", UpdateName)
            intent2NumInput.putExtra("Required", UpdateRequired)
            intent2NumInput.putExtra("Stock", UpdateStock)
            intent2NumInput.putExtra("Cook", UpdateCook)
            intent2NumInput.putExtra("Total",UpdateTotal)

//            val requestCode:Int = 9999
//            startActivityForResult(intent2NumInput, requestCode)

            startActivity(intent2NumInput)

        }


        return view
    }

    override fun onStart() {
        super.onStart()
        mDish1List = arrayListOf(Soup, PotatoSalad, CarrotRapee, Rice, Hamberg, Locomoko, Sarmon, Chiken, RoastBeef)

        val list1View = view?.findViewById<ListView>(R.id.list1_view)

//        val _from = arrayOf("name", "Required", "Stock", "Cook", "Total")
//        val _to = intArrayOf(R.id.rwMenuName, R.id.rwRequired, R.id.rwStock, R.id.rwToday, R.id.rwTotal)

        val adapter = CustomAdapter(requireContext(), mDish1List)

        list1View?.adapter = adapter

    }

    /*
    override fun onResume() {
        super.onResume()
        Log.d("uztest", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("uztest","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("uztest","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("uztest","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("uztest","onDestroy")
    }
*/
}