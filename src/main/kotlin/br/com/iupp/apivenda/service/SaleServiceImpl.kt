package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.model.Sale
import br.com.iupp.apivenda.repository.SaleRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class SaleServiceImpl(val repository: SaleRepository):SaleService {

    override fun listAll(): List<Sale> {
        return repository.listAll()
    }

    override fun findSaleById(saleId: UUID): Sale? {
        return repository.findSaleById(saleId = saleId)
    }
}