package co.villalabs.demo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TollRate {
	
	private int stationId;
	private BigDecimal currentRate;
	private String timestamp;
}