package com.example.alko.domain

class AddAlkoShop(private val shopListRepository:ShopListRepository) {
    fun addShopItem (shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)

    }
}