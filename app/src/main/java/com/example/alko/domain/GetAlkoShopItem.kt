package com.example.alko.domain

class GetAlkoShopItem(private val shopListRepository:ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}