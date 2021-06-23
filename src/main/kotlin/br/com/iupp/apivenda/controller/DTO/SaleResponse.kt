package br.com.iupp.apivenda.controller.DTO

import br.com.iupp.apivenda.model.Product
import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class SaleResponse (
    val saleId: UUID,
    val product: Product,
    val price:Double
        )