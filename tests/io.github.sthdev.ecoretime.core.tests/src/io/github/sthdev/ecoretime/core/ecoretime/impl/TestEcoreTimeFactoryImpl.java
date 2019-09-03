package io.github.sthdev.ecoretime.core.ecoretime.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestEcoreTimeFactoryImpl {

	private EcoreTimeFactoryImpl factory;
	
	@Before
	public void setup() {
		factory = new EcoreTimeFactoryImpl();
	}
	
	@Test
	public void testCreateLocalDateFromString_initialValueIsNull_returnsNull() {
		assertThat(factory.createLocalDateFromString(null, null), is(nullValue()));
	}
}
