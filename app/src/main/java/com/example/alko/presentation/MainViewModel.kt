package com.example.alko.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alko.data.ShopListRepositoryImpl // DATA -> Знать друг друга не должны <-PRESENTATION
import com.example.alko.domain.DeleteAlkoShop
import com.example.alko.domain.EditAlkoShop
import com.example.alko.domain.GetShopAlkoList
import com.example.alko.domain.ShopItem

class MainViewModel: ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopList = GetShopAlkoList(repository)
    private val deleteShop = DeleteAlkoShop(repository)
    private val editShop = EditAlkoShop(repository)

    val shopList = getShopList.getShopList()

    /*fun getShopList() {
        val list =  getShopList.getShopList()
        shopList.value = list
    }*/

    fun deleteShop(shopItem:ShopItem){
        deleteShop.deleteShopItem(shopItem)
        //getShopList()

    }

    fun changeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShop.editShopItem(newItem)
        //getShopList()
    }
}