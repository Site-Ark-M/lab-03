package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf
var INDEX = 0
class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )


    fun addCity(city: City) {
        _cities.add(city)
    }

    fun checkCity(city:City): Boolean {
        if (city in _cities) {
            INDEX = _cities.indexOf(city)
            return true
        }
        else
            return false
    }

    fun modifyCity(city:City) {
        _cities[INDEX] = city
    }

    val cities: List<City>
        get() = _cities
}