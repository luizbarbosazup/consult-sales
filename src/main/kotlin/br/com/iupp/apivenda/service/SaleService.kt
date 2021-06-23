package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.model.Sale
import javax.inject.Singleton

@Singleton
interface SaleService {
    fun listAll():List<Sale>
}