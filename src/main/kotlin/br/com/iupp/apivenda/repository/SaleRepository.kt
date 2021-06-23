package br.com.iupp.apivenda.repository

import br.com.iupp.apivenda.model.Sale
import javax.inject.Singleton

@Singleton
interface SaleRepository {
    fun listAll():List<Sale>
}