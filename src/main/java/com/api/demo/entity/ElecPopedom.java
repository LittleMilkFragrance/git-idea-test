package com.api.demo.entity;

public class ElecPopedom extends ElecPopedomKey {
    private String name;

    private String url;

    private String icon;

    private String target;

    private Boolean isparent;

    private Boolean ismenu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Boolean getIsparent() {
        return isparent;
    }

    public void setIsparent(Boolean isparent) {
        this.isparent = isparent;
    }

    public Boolean getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Boolean ismenu) {
        this.ismenu = ismenu;
    }
}