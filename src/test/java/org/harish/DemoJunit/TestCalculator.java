package org.harish.DemoJunit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class TestCalculator {

	@Spy
	Calculator calculator;

	/*
	 * CalculatorService service = new CalculatorService() {
	 * 
	 * public int add(int i, int j) { return i + j; } };
	 */

	// CalculatorService service = Mockito.mock(CalculatorService.class);

	@Test
	public void testAdd() {
		// when(service.add(2, 3)).thenReturn(5);

		Calculator cal = spy(Calculator.class);

		doNothing().when(cal).getMessage();
		assertEquals(10, cal.perform(2, 3));
		// verify(service).add(2, 3);
	}

}
