package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity

class CustomAdapter(context: Context?, var mDish1List: List<Dish1>) : ArrayAdapter<Dish1>(context!!, 0, mDish1List) {

    private val layoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Animalの取得
        val dish1 = mDish1List[position]

        // レイアウトの設定
        var view = convertView
        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.row, parent, false)
        }

        // 各Viewの設定
        val menuName = view?.findViewById<TextView>(R.id.rwMenuName)
        menuName?.text = dish1.Name

        val required = view?.findViewById<TextView>(R.id.rwRequired)
        required?.text = dish1.Required.toString()

        val stock = view?.findViewById<TextView>(R.id.rwStock)
        stock?.text = dish1.Stock.toString()

        val cook = view?.findViewById<TextView>(R.id.rwToday)
        cook?.text = dish1.Cook.toString()

        val total = view?.findViewById<TextView>(R.id.rwTotal)
        total?.text = dish1.Total.toString()

        return view!!
    }
}