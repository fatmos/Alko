package com.example.alko.domain

import androidx.lifecycle.LiveData

class GetShopAlkoList(private val shopListRepository:ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()

    }
}
