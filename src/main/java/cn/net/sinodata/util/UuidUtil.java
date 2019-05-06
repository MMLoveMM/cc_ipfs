package cn.net.sinodata.util;

import java.util.Date;
import java.util.UUID;

/**
 * 唯一标识
 * @author Pangpj 2017年9月12日09:02:17
 *
 */
public class UuidUtil {

	/**
	 * 获取位唯一id
	 * @return
	 */
	public static String getUuid() {
		String machineId = DateUtil.formatDate(new Date(), "yyyyMMddHHmmss");//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0     
        // 4 代表长度为4     
        // d 代表参数为正数型
        return machineId + String.format("%04d", hashCodeV);
	}
}