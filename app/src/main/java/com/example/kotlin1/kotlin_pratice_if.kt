package com.example.kotlin1

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    println("성적 평균을 입력하세요 : ")
    val score = sc.nextInt()


    if (score >= 90)
        println("A+ 입니다.")
    else if (score >= 80)
        println("B+ 입니다.")
    else if (score >= 70)
        println("C+입니다.")
    else if (score >= 60)
        println("D+입니다.")
    else
        println("F입니다.")
}

