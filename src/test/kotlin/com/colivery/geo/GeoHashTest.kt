package com.colivery.geo

import org.junit.jupiter.api.Assertions.*

internal class GeoHashTest {

    @org.junit.jupiter.api.Test
    fun encode() {
        val geoHash = GeoHash.encode(48.669467, -4.329468)
        assertEquals("gbsuv", geoHash)
    }

    @org.junit.jupiter.api.Test
    fun neighbours() {
        val neighbors = GeoHash.neighbours("gbsuv")

        assertEquals("gbsvh", neighbors.nw)
        assertEquals("gbsvj", neighbors.n)
        assertEquals("gbsvn", neighbors.ne)
        assertEquals("gbsuu", neighbors.w)
        assertEquals("gbsuy", neighbors.e)
        assertEquals("gbsus", neighbors.sw)
        assertEquals("gbsut", neighbors.s)
        assertEquals("gbsuw", neighbors.se)
    }
}