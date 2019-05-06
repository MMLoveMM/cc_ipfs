package cn.net.sinodata.model;

public class tRoleFuncKey {
    /**
     * 
     */
    private String roleid;

    /**
     * 
     */
    private String resourcesid;

    /**
     * 
     * @return ROLEID 
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 
     * @param roleid 
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * 
     * @return RESOURCESID 
     */
    public String getResourcesid() {
        return resourcesid;
    }

    /**
     * 
     * @param resourcesid 
     */
    public void setResourcesid(String resourcesid) {
        this.resourcesid = resourcesid == null ? null : resourcesid.trim();
    }
}