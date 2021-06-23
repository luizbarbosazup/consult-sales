package br.com.iupp.apivenda.repository

import br.com.iupp.apivenda.model.Sale
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.ResultSet
import com.datastax.oss.driver.api.core.cql.Row
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import kotlin.collections.ArrayList

class SaleRepositoryImpl(val cqlSession: CqlSession):SaleRepository {

    override fun listAll(): List<Sale> {

        val result:ResultSet = cqlSession.execute(
            SimpleStatement
                .newInstance("SELECT * FROM pdvdata.sale")
        )

        val saleList:MutableList<Sale> = ArrayList<Sale>()
        for(row:Row in result){
            val uuid = row.getUuid("id")!!
            val productId:UUID = row.getUuid("productId")!!
            val qty:Double = row.getDouble("qty")

            saleList.add(Sale(uuid,productId,qty))
        }
        return saleList

    }
}