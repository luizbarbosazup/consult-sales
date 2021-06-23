package br.com.iupp.apivenda.service

import br.com.iupp.apivenda.model.Sale
import br.com.iupp.apivenda.repository.SaleRepository

class SaleServiceImpl(val repository: SaleRepository):SaleService {

    override fun listAll(): List<Sale> {
        return repository.listAll()
    }
}