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
public class TriangleVo {
		
		private int width;
		private int height;
		
		public double getArea() {
			return width*height;
		}
		
}
