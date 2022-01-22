package com.example.alko.domain

class DeleteAlkoShop(private val shopListRepository:ShopListRepository){
    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}