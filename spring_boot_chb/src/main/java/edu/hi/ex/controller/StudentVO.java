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
public class StudentVO {
		private int kor;
		private int eng;
		private int math;
		
		public double getAvg() {
			return (kor + eng + math) / 3.0;
		}
		
}
