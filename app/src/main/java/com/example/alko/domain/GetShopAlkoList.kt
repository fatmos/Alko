package com.example.alko.domain

class GetShopAlkoList(private val shopListRepository:ShopListRepository) {

    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()

    }
}
