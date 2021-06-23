package br.com.iupp.apivenda.model

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.inject.Singleton

@Introspected
data class Sale (
    val saleId:UUID,
    val productId:UUID,
    val qty:Double
        )