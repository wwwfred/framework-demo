package net.wwwfred.framework.demo.manager.util;

import java.util.Map;

import net.wwwfred.framework.core.exception.FrameworkRuntimeException;
import net.wwwfred.framework.spi.request.BaseRequest;

public class CheckBaseRequestUtil {
	
	public static void checkRequestVersion(BaseRequest requestPO, Map<String, ?> serviceMap)
	{
		if(requestPO.getVersion()==null)
			throw new FrameworkRuntimeException("requestVersion不能为空");
		if(!serviceMap.containsKey(requestPO.getVersion()))
		{
			throw new FrameworkRuntimeException("requestVersion illegal");
		}
	}
	
}
