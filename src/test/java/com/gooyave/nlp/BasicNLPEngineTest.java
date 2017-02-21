package com.gooyave.nlp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicNLPEngineTest {

    private BasicNLPEngine engine;

    @Before
    public void setUp() throws Exception {

        engine = new BasicNLPEngine();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() {
        engine.proceed("Je veux aller de Paris à Alfortville.");
    }

}