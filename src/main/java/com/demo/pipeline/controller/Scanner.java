package com.demo.pipeline.controller;

import com.demo.pipeline.core.Message;
import com.demo.pipeline.core.Pipeline;
import com.demo.pipeline.core.PipelineFactory;

public class Scanner {
	public void scan(Request request){
		String bizType = request.getBizType();
		Pipeline pipeline = PipelineFactory.getPipeline(bizType);

		Message message = Message.init(request);
		pipeline.process(message);
	}
}
