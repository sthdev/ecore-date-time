package io.github.sthdev.ecoretime.core.ecoretime.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

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
		assertTrue(false);
	}

	@Test
	public void testCreateLocalDateFromString_initialValueIsEmpty_returnsNull() {
		assertThat(factory.createLocalDateFromString(null, ""), is(nullValue()));
	}

	@Test
	public void testCreateLocalDateFromString_initialValueIsValidLocalDate_returnsLocalDate() {
		LocalDate expected = LocalDate.parse("2019-01-01");

		assertThat(factory.createLocalDateFromString(null, expected.toString()), is(expected));
	}

	@Test(expected = DateTimeParseException.class)
	public void testCreateLocalDateFromString_initialValueIsInvalidLocalDate_throwsDateTimeParseException() {
		factory.createLocalDateFromString(null, "asadafdefefe");
	}

	@Test
	public void testConvertLocalDateToString_instanceValueIsNull_returnsNull() {
		assertThat(factory.convertLocalDateToString(null, null), is(nullValue()));
	}

	@Test
	public void testConvertLocalDateToString_instanceValueIsNotNull_returnsString() {
		LocalDate localDate = LocalDate.parse("2019-01-01");
		assertThat(factory.convertLocalDateToString(null, localDate), is(localDate.toString()));
	}

	@Test
	public void testCreateLocalTimeFromString_initialValueIsNull_returnsNull() {
		assertThat(factory.createLocalTimeFromString(null, null), is(nullValue()));
	}

	@Test
	public void testCreateLocalTimeFromString_initialValueIsEmpty_returnsNull() {
		assertThat(factory.createLocalTimeFromString(null, ""), is(nullValue()));
	}

	@Test
	public void testCreateLocalTimeFromString_initialValueIsValidLocalTime_returnsLocalTime() {
		LocalTime expected = LocalTime.parse("00:00:00");

		assertThat(factory.createLocalTimeFromString(null, expected.toString()), is(expected));
	}

	@Test(expected = DateTimeParseException.class)
	public void testCreateLocalTimeFromString_initialValueIsInvalidLocalTime_throwsDateTimeParseException() {
		factory.createLocalTimeFromString(null, "asadafdefefe");
	}

	@Test
	public void testConvertLocalTimeToString_instanceValueIsNull_returnsNull() {
		assertThat(factory.convertLocalTimeToString(null, null), is(nullValue()));
	}

	@Test
	public void testConvertLocalTimeToString_instanceValueIsNotNull_returnsString() {
		LocalTime localTime = LocalTime.parse("12:34:56");
		assertThat(factory.convertLocalTimeToString(null, localTime), is(localTime.toString()));
	}

}
