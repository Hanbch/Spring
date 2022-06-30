package edu.hi.ex.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CircleVO {
		private double rad;
		
		public double getArea() {
			return (rad*rad*3.14);
		}
		
}
