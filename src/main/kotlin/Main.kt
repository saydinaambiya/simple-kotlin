package org.example

import java.time.LocalDateTime

fun main() {
    val year = LocalDateTime.now().year
    val month = LocalDateTime.now().monthValue
    val today = LocalDateTime.now().dayOfMonth
    val openHours = LocalDateTime.of(year, month, today, 7, 0).hour
    val now = LocalDateTime.now().hour
    val office: String = if (now>openHours){
        "Office already open"
    }else if(now == openHours){
        "Wait a minute, office will be open"
    }else{
        "Office is closed"
    }
    print(office)
}

/*
    [output]
    depend on the hour this code will execute

    note: kotlin not support ternary operator cause replace by normal if expressions
 */