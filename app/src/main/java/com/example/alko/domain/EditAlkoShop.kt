package com.example.alko.domain

class EditAlkoShop(private val shopListRepository:ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)

    }
}