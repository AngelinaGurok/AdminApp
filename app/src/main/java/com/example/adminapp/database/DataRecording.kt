package com.example.adminapp.database
import com.example.adminapp.AddRoute
import com.example.adminapp.databinding.AddRouteBinding
import com.example.adminapp.database.RouteInfo
import androidx.appcompat.app.AppCompatActivity




class DataRecording (_route : RouteInfo){

    var route : RouteInfo

    init {
        route = RouteInfo(_route)
    }
    fun addToDatabase (){

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