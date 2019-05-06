package cn.net.sinodata.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日期 工具类
 * 
 * @author Pangpj
 *
 */
public class DateUtil {
	private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
	/**
	 * 
	 * @param begin
	 *            :开始日期
	 * @param targetDate
	 *            :结束日期
	 * @return :返回相差天数
	 */
	public static long dateCompareByDay(String begin, String end) {
		begin = begin.replaceAll("[^0-9]", "");
		begin = begin.substring(0, 8);
		end = end.replaceAll("[^0-9]", "");
		end = end.substring(0, 8);
		long dis = -1;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date nDate = null;
		Date tDate = null;
		try {
			nDate = df.parse(begin);
			tDate = df.parse(end);
			dis = (tDate.getTime() - nDate.getTime()) / 1000 / 60 / 60 / 24;
		} catch (ParseException e) {
			logger.error("dim dd error -begin:{} -end:{} - error message:", begin, end, e);
		}
		return dis;
	}

	/**
	 * 
	 * @param beginDate
	 *            :被比较日期
	 * @param endDate
	 *            :目标日期
	 * @return :返回目标日期与对象日期相差的天数
	 */
	public static long dateCompareByMiliSec(String beginDate, String endDate) {
		beginDate = beginDate.replaceAll("[^0-9]", "");
		endDate = endDate.replaceAll("[^0-9]", "");
		long dis = -1;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date bDate = null;
		Date eDate = null;
		try {
			bDate = df.parse(beginDate);
			eDate = df.parse(endDate);
			dis = (eDate.getTime() - bDate.getTime());
		} catch (ParseException e) {
			logger.error("dim dd error -beginDate:{} -endDate:{} - error message:", beginDate, endDate, e);
		}
		return dis;
	}

	public static String getDate() {
		return getDate("yyyyMMddHHmmss");
	}

	/**
	 * 
	 * @param date_mode
	 *            :yyyyMMddHHmmss
	 * @return
	 */
	public static String getDate(String date_mode) {
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat(date_mode);
		date.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		String datename = date.format(d).toString();
		return datename;
	}

	/**
	 * 
	 * @param dateTime
	 *            :被加时间
	 * @param days
	 *            :增加MiliSec
	 * @return 加后时间字符串
	 */
	public static String dateTimeAddByMiliSec(String dateTime, long sec) {
		return dateTimeAddByMiliSec(dateTime, sec, "yyyyMMddHHmmss");
	}

	/**
	 * 
	 * @param dateTime
	 *            :被加时间
	 * @param days
	 *            :增加MiliSec
	 * @param outPutMode
	 *            :输出格式
	 * @return 加后时间字符串
	 */
	public static String dateTimeAddByMiliSec(String dateTime, long sec, String outPutMode) {
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate = new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			logger.error("dim dm String error -dateTime:{} -sec:{} - error message:", dateTime, sec, e);
		}
		Date addedDate = new Date(dealDate.getTime() + sec);
		return df.format(addedDate);
	}

	/**
	 * 
	 * @param dateTime
	 *            :被加时间
	 * @param days
	 *            :增加天数
	 * @param outPutMode
	 *            :输出格式
	 * @return 加后时间字符串
	 */
	public static String dateTimeAddByDays(String dateTime, long days, String outPutMode) {
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate = new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			logger.error("dim dd String error -dateTime:{} -days:{} - error message:", dateTime, days, e);
		}
		long s = days * 24 * 60 * 60 * 1000;
		Date addedDate = new Date(dealDate.getTime() + s);
		return df.format(addedDate);
	}

	/**
	 * 
	 * @param dateTime
	 *            :被加时间
	 * @param days
	 *            :增加天数
	 * @return 加后时间字符串
	 */
	public static String dateTimeAddByDays(String dateTime, long days) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date dealDate = new Date();
		try {
			dealDate = df.parse(dateTime);
		} catch (ParseException e) {
			logger.error("dim dd String2 error -dateTime:{} -days:{} - error message:", dateTime, days, e);
		}
		long s = days * 24 * 60 * 60 * 1000;
		Date addedDate = new Date(dealDate.getTime() + s);
		return df.format(addedDate);
	}
	/**
	 * 将字符串日期增加日期后转换为日期格式 
	 * @param dateTime 字符串日期
	 * @param days 增加天数
	 * @return 加天数后日期格式天数
	 */
	public static Date dateTimeAddDaysReturnDate(String dateTime, int days){
		Date dealDate = DateUtil.formatDate(dateTime);
		long s = ((long)days) * 24 * 60 * 60 * 1000;
		return new Date(dealDate.getTime() + s);
	}
	
	/**
	 * 将日期+-days后返回
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDays(Date date, int days){
		long s = ((long)days) * 24 * 60 * 60 * 1000;
		return new Date(date.getTime() + s);
	}
	
	
	/**
	 * 对系统当前日期进行累加
	 * 
	 * @param days
	 *            :增加天数
	 * @return 加后时间字符串
	 */
	public static String dateTimeAddByDays(long days, String outPutMode) {
		SimpleDateFormat df = new SimpleDateFormat(outPutMode);
		Date dealDate = new Date();
		long s = days * 24 * 60 * 60 * 1000;
		Date addedDate = new Date(dealDate.getTime() + s);
		return df.format(addedDate);
	}

	/**
	 * 格式化指定日期
	 * 
	 * @param d
	 * @param dateMode
	 * @return
	 */
	public static String formatDate(Date d, String dateMode) {
		if (d == null || dateMode == null || "".equals(dateMode.trim())) {
			return null;
		}
		SimpleDateFormat df = new SimpleDateFormat(dateMode);
		return df.format(d);
	}

	/**
	 * 格式化指定字符串日期
	 * 
	 * @param dateStr
	 * @param dateMode
	 * @return
	 */
	public static String formatDate(String dateStr, String dateMode) {
		if (dateStr == null || dateMode == null || "".equals(dateMode.trim())) {
			return null;
		}
		dateStr = dateStr.replaceAll("[^0-9]", "");
		dateStr = rightZero(dateStr, 17);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		try {
			Date target = df.parse(dateStr);
			SimpleDateFormat df2 = new SimpleDateFormat(dateMode);
			return df2.format(target);
		} catch (ParseException e) {
			logger.error("formatting date error -dateStr:{} - error message:", dateStr, e);
		}
		return null;
	}

	/**
	 * 转换成指定格式的时间对象
	 * 
	 * @param obj
	 * @param pattern
	 * @return
	 */
	public static Date tranObj2Date(Object obj, String pattern) {
		if (obj == null) {
			return new Date();
		}
		if (pattern == null) {
			pattern = "yyyy-MM-dd";
		}
		if (obj instanceof String) {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			try {
				return format.parse(obj.toString());
			} catch (ParseException e) {
				logger.error("transform object date error -obj:{} - error message:", obj, e);
				return null;
			}
		}
		if (obj instanceof Date) {
			return (Date) obj;
		}
		if (obj instanceof java.sql.Timestamp) {
			return (Date) obj;
		}
		if (obj instanceof java.sql.Time) {
			return (Date) obj;
		}
		return null;
	}

	/**
	 * 格式化指定字符串日期
	 * @param dateStr 
	 * @param dateMode
	 * @return
	 */
	public static Date formatDate(String dateStr) {
		if (dateStr == null) {
			return null;
		}
		dateStr = dateStr.replaceAll("[^0-9]", "");
		dateStr = rightZero(dateStr, 17);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			logger.error("formatting date error -dateStr:{} - error message:", dateStr, e);
		}
		return null;
	}
	
	
	
	/**
	 * 字符串右补0
	 * 
	 * @param str
	 * @param length
	 *            包含 str 在内字符串总长度
	 * @return
	 */
	private static String rightZero(String str, int length) {
		if (str == null) {
			return null;
		}
		int zeroLength = length - str.length();
		if (zeroLength <= 0) {
			return str;
		}
		for (int i = 0; i < zeroLength; i++) {
			str += "0";
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(DateUtil.rightZero("1", 5));
	}
}
