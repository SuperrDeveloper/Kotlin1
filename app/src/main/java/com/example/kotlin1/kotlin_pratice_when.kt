package com.example.kotlin1

import java.util.*

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    println("오늘의 운세 1~5 중 하나 선택하세요 ")
    val user = sc.nextInt()

    when (user) {
        1 -> println("오늘의 운세 : 계획 했던 일들이 성공적으로!")
        2 -> println("오늘의 운세 : 너무 자만 하지마세요")
        3 -> println("오늘의 운세 : 좋아하는 일을 계속하세요")
        4 -> println("오늘의 운세 : 원하시는 목표를 이룰 수 있을거에요")
        5 -> println("오늘의 운세 : 좋아하는 사람에게 직진하세요!")
        else -> print("숫자 1~5 까지 입력해주세요")
    }
}