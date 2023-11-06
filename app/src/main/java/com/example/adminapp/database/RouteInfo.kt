package com.example.adminapp.database

class RouteInfo ()
{
    var id : String
    var depPoint : String
    var arrivalPoint : String
    var depTime : String
    var arrivalTime : String
    var tickets : Int
    var price : Double
    var date : String

    init {
        id = ""
        depPoint = ""
        arrivalPoint = ""
        depTime = ""
        arrivalTime = ""
        tickets = 0
        price = 0.0
        date = "dd/MM/YYYY"
    }

    constructor(depPoint : String, arrivalPoint : String, depTime : String,
                arrivalTime : String, tickets : String, price : String, date : String) : this(){
        this.id = "$date/$depPoint$arrivalPoint/$depTime-$arrivalTime"
        this.depPoint = depPoint
        this.arrivalPoint = arrivalPoint
        this.depTime = depTime
        this.arrivalTime = arrivalTime
        this.tickets = tickets.toInt()
        this.price = price.toDouble()
        this.date = date
    }

    constructor(route : RouteInfo) : this(){
        id = route.id
        depPoint = route.depPoint
        arrivalPoint = route.arrivalPoint
        depTime = route.depTime
        arrivalTime = route.arrivalTime
        tickets = route.tickets
        price = route.price
        date = route.date
    }
}