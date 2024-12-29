package com.example.KotlinOperators

import kotlin.math.PI
fun main( ) {

	val a = 7
	val perimeterSquare = 4 * a
	val squareSquare = a * a

	val b = 3
	val squareRectangle = a * b
	val perimeterRectangle = 2 * (a + b)

	val d = 6
	val circumferenceLength  = PI * d

	val LSm = 120000
	val LM  = LSm / 100


	val A = 100
	val B = 10
	val numberOfSegmentsB = A/B

	println("P = " + perimeterSquare + " | " + "S (Square) = " + squareSquare + " | " +
			"S (Rectangle) = " +  squareRectangle + " | " + "P (Rectangle) = "
			+ perimeterRectangle + " | " +   "L (Circumference length) = "
			+ circumferenceLength +  " | " + "N (Number of meters) = "
			+ LM + " | " +  "N (Number of segments B) = " + numberOfSegmentsB)













}
