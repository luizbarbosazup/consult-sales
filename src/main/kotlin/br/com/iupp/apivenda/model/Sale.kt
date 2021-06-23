package br.com.iupp.apivenda.model

import java.util.*
import javax.inject.Singleton

@Singleton
data class Sale (
    val saleId:UUID,
    val productId:UUID,
    val qty:Double
        )