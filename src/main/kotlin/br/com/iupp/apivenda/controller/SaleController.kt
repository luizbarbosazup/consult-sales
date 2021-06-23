package br.com.iupp.apivenda.controller

import br.com.iupp.apivenda.controller.DTO.SaleResponse
import br.com.iupp.apivenda.model.Sale
import br.com.iupp.apivenda.service.SaleService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/sales")
class SaleController(val service: SaleService) {

    @Get
    fun getAllSales():HttpResponse<List<Sale>>{
        return HttpResponse.ok(service.listAll())
    }


}