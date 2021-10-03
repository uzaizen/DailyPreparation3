package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

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

        val Soup = Dish1("スープ", 110, 220, 330, 1110)
        val PotatoSalad = Dish1("ポテトサラダ", 0, 0, 0, 0)
        val CarrotRapee = Dish1("人参ラぺ", 0, 0, 0, 0)
        val Rice = Dish1("ライス", 0, 0, 0, 0)
        val Hamberg = Dish1("ハンバーグ", 0, 0, 0, 0)
        val Locomoko = Dish1("ロコモコ", 0, 0, 0, 0)
        val Sarmon = Dish1("サーモン燻製", 0, 0, 0, 0)
        val Chiken = Dish1("チキングリル", 0, 0, 0, 0)
        val RoastBeef = Dish1("ローストビーフ", 10, 20, 30, 40)

        mDish1List = arrayListOf(Soup, PotatoSalad, CarrotRapee, Rice, Hamberg, Locomoko, Sarmon, Chiken, RoastBeef)

        val list1View = view.findViewById<ListView>(R.id.list1_view)

        val _from = arrayOf("name", "Required", "Stock", "Cook", "Total")
        val _to = intArrayOf(R.id.rwMenuName, R.id.rwRequired, R.id.rwStock, R.id.rwToday, R.id.rwTotal)

        val adapter = CustomAdapter(requireContext(), mDish1List)


//        val adapter = ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, mDish1List)
        // https://teratail.com/questions/283415
        list1View.adapter = adapter

        /*
        list1View.setOnItemClickListener{ parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val dish1 = mDish1List[position]
            Toast.makeText(getActivity(), dish1.Name, Toast.LENGTH_SHORT).show()
        }
         */

        list1View.setOnItemClickListener{parent:AdapterView<*>, view: View, position: Int, id: Long ->
            val item = parent.getItemAtPosition(position)
             Log.d("uztest", "value= ${item}")


        }


        return view
    }

}