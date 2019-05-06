package cn.net.sinodata.model;

public class ReminderInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 属性
     */
    private String property;

    /**
     * 属性名
     */
    private String propertyname;

    /**
     * 天数
     */
    private String daynum;

    /**
     * ID
     * @return ID ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 属性
     * @return PROPERTY 属性
     */
    public String getProperty() {
        return property;
    }

    /**
     * 属性
     * @param property 属性
     */
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    /**
     * 属性名
     * @return PROPERTYNAME 属性名
     */
    public String getPropertyname() {
        return propertyname;
    }

    /**
     * 属性名
     * @param propertyname 属性名
     */
    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname == null ? null : propertyname.trim();
    }

    /**
     * 天数
     * @return DAYNUM 天数
     */
    public String getDaynum() {
        return daynum;
    }

    /**
     * 天数
     * @param daynum 天数
     */
    public void setDaynum(String daynum) {
        this.daynum = daynum == null ? null : daynum.trim();
    }
}