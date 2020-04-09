package com.cagong.caferanking.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTests {

    @Test
    public void creation() {

        Cafe cafe = Cafe.builder().name("Starbucks").build();

        assertEquals(cafe.getName(), "Starbucks");
    }
}