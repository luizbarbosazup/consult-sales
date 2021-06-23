package br.com.iupp.apivenda

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.iupp.apivenda")
		.start()
}

