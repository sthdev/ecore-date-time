package io.github.sthdev.ecoretime.core.ecoretime.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEcoreTimeFactoryImpl {

	private EcoreTimeFactoryImpl factory;
	
	@BeforeEach
	public void setup() {
		factory = new EcoreTimeFactoryImpl();
	}
	
	@Test
	public void testCreateLocalDateFromString_initialValueIsNull_returnsNull() {
		assertThat(factory.createLocalDateFromString(null, null), is(nullValue()));
	}
}
