package cn.xinxing.json.status;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 */
public class StatusHouse {

	
	public static StatusObject COMMON_STATUS_OK = new StatusObject(StatusCode.CODE_SUCCESS, "�ɹ�");
	public static StatusObject COMMON_STATUS_ERROR = new StatusObject(StatusCode.CODE_ERROR, "����(" + StatusCode.CODE_ERROR + ")");
	public static StatusObject COMMON_STATUS_NO_LOGIN_OR_TIMEOUT = new StatusObject(StatusCode.CODE_ERROR_NO_LOGIN_OR_TIMEOUT, "��ʱ(" + StatusCode.CODE_ERROR_NO_LOGIN_OR_TIMEOUT + ")");
	public static StatusObject COMMON_STATUS_ERROR_PROGRAM = new StatusObject(StatusCode.CODE_ERROR_PROGRAM, "�������(" + StatusCode.CODE_ERROR_PROGRAM + ")");
	public static StatusObject COMMON_STATUS_ERROR_PARAMETER = new StatusObject(StatusCode.CODE_ERROR_PARAMETER, "��������(" + StatusCode.CODE_ERROR_PARAMETER + ")");
	public static StatusObject COMMON_STATUS_EXIST_OPERATION = new StatusObject(StatusCode.CODE_ERROR_EXIST_OPERATION, "��������(" + StatusCode.CODE_ERROR_EXIST_OPERATION + ")");


}
