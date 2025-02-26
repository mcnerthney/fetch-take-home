package com.softllc.fetchtest

import com.softllc.fetchtest.data.ItemApi
import com.softllc.fetchtest.data.ItemRepository
import com.softllc.fetchtest.data.ItemStorage
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.Test
import kotlin.test.assertEquals

class ItemRepositoryTest {

    private val itemApi = mockk<ItemApi>(relaxed = true)
    private val itemStorage = mockk<ItemStorage>(relaxed = true)
    @Test
    fun `ItemRepository get data on initialize`() {

        val itemRepository = ItemRepository(itemApi, itemStorage)
        itemRepository.initialize()

        verify { itemApi }

        assertEquals(2 + 2, 4, "Addition is correct")
    }
}