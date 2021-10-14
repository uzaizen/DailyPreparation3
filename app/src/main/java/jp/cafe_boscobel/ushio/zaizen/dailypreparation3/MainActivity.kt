package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.*

var MAXCUSTOMER : Int = 0
var Soup = Dish1("スープ　　　　　", 0, 0, 0, 0)
var PotatoSalad = Dish1("ポテサラ　　　　", 0, 0, 0, 0)
var CarrotRapee = Dish1("人参ラぺ　　　　", 0, 0, 0, 0)
var Rice = Dish1("ライス　　　　　", 0, 0, 0, 0)
var Hamberg = Dish1("ハンバーグ　　　", 0, 0, 0, 0)
var Locomoko = Dish1("ロコモコ　　　　", 0, 0, 0, 0)
var Sarmon = Dish1("サーモン燻製　　", 0, 0, 0, 0)
var Chiken = Dish1("チキングリル　　", 0, 0, 0, 0)
var RoastBeef = Dish1("ローストビーフ　", 0, 0, 0, 0)

var Mayonnaise = Seasoning1("マヨネーズ", 0)
var Tartar = Seasoning1("タルタル",0)
var Mayodre = Seasoning1("マヨドレ",0)
var Rapeedre = Seasoning1("ラぺドレ",0)
var TomatoSauce = Seasoning1("トマトソース",0)
var Balsamic = Seasoning1("バルサミコ",0)
var SmokeShoyu = Seasoning1("燻製醤油",0)
var Whey = Seasoning1("ホエー漬け",0)


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}