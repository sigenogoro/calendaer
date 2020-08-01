package com.example.calender

import org.springframework.stereotype.Controller

@Controller
class CalendarController(){

    fun index(): String{
        return "index.html"
    }
}