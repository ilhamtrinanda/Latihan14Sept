package com.ilham.latihan14sept.model

import com.ilham.latihan14sept.R

data class PnpModel(
    val image : Int,
    val image1 : Int
)

object Mocklist {
    fun getModel() : List<PnpModel> {
        val itemModel1 = PnpModel(
            R.drawable.pnp,
            R.drawable.pnp1
        )

        val itemModel2 = PnpModel(
            R.drawable.pnp2,
            R.drawable.pnp3
        )

        val itemModel3 = PnpModel(
            R.drawable.pnp4,
            R.drawable.pnp5
        )

        val itemModel4 = PnpModel(
            R.drawable.pnp6,
            R.drawable.pnp7
        )


        val itemList: ArrayList<PnpModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)

        return itemList
    }
}