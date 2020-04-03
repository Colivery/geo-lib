package com.colivery.geo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DistanceTest {

    @Test
    fun haversine() {
        val distance = Distance.haversine(Coordinate(48.330713, 12.003011), Coordinate(48.348057, 12.077770))
        assertEquals(5.854210722896341, distance)
    }
}