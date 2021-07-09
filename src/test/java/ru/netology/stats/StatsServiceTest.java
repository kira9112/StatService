package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    public long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public StatService service = new StatService();

    @Test
    public void shouldReturnSum() {
        assertEquals(180, service.sum(purchases));

    }

    @Test
    public void shouldReturnAverage() {
        assertEquals(15, service.average(purchases));
    }


    @Test
    public void shouldReturnMonthWithMin() {
        assertEquals(9, service.monthWithMin(purchases));
    }

    @Test
    public void shouldReturnMonthWithMax() {
        assertEquals(8, service.monthWithMax(purchases));
    }

    @Test
    public void shouldReturnCountMoreThenAverage() {
        assertEquals(5, service.monthCountMoreThenAverage(purchases));
    }

    @Test
    public void shouldReturnCountLessThenAverage() {
        assertEquals(5, service.monthCountLessThenAverage(purchases));
    }
}


