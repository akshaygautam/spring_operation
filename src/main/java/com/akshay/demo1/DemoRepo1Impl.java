package com.akshay.demo1;

public class DemoRepo1Impl implements DemoRepo1Custom {

	@Override
	public DemoDTO getDemoSuper() {
		DemoDTO dto = new DemoDTO();
		dto.setText("From super");
		return dto;
	}

}
