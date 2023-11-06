package com.example.adminapp.database
import com.example.adminapp.AddRoute
import com.example.adminapp.databinding.AddRouteBinding
import com.example.adminapp.database.RouteInfo
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.widget.Toast





class DataRecording (_route: RouteInfo){

    var route : RouteInfo
    private lateinit var database: DatabaseReference
    init {
        route = RouteInfo(_route)
    }
    fun addToDatabase (_route: RouteInfo){
        database = FirebaseDatabase.getInstance().getReference("Routes")
        this.route = RouteInfo(_route)
        database.child(this.route.id).setValue(this.route).addOnSuccessListener {

        }
    }
    /*
    *  мы считываем информацию о рейсе (место отправления
    *  и прибытия,время и цена одинаковые)
    *  далее проверяем какие дни недели отмечены в чекбоксе
    *  через биндинг и if
    *  далее циклом пройтись до конца года (31/12/2023) и найти дату
    *  каждого отмеченного дня недели. внести данные в бд
    * */



}