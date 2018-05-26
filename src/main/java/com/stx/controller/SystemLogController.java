package com.stx.controller;
import java.util.concurrent.ExecutorService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stx.pojo.SystemLog;
import com.stx.service.SystemLogService;



@RestController
public class SystemLogController {
	
	/**
	 * 接收日志请求
	 * @param systemLog
	 * @return
	 */
	@RequestMapping(name="/recieveLog",method=RequestMethod.POST)
	public Integer recieveLog(@RequestBody SystemLog systemLog){
		try {
			this.systemLogService.dealWithSystemLog(systemLog);
		} catch (Exception e) {
			return 0;
		}
		System.out.println("LogServer1接收日志");
		return 1;
	}
	
	
	
	@Resource(name="systemLogServices")
	private SystemLogService systemLogService;
	@Autowired
	private ExecutorService executorService;
}
