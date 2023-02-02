package org.zerock.sample;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Component
public class Singleton {
	private Date date;
}
