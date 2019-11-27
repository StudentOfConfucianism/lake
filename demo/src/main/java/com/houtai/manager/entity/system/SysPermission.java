package com.houtai.manager.base.entity.system;

import java.util.Date;

import com.houtai.manager.base.entity.tree.TreeEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统权限
 * 
 * @author 抓娃小兵
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysPermission extends TreeEntity<SysPermission> {

	private Integer permId;
	private String permName;
	private String permDesc;
	private Integer permPid;
	private String permUrl;
	private Integer sort;
	private String isShow;
	private Date createTime;

	public Integer getPermId() {
		return permId;
	}

	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	public String getPermName() {
		return permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public String getPermDesc() {
		return permDesc;
	}

	public void setPermDesc(String permDesc) {
		this.permDesc = permDesc;
	}

	public Integer getPermPid() {
		return permPid;
	}

	public void setPermPid(Integer permPid) {
		this.permPid = permPid;
	}

	public String getPermUrl() {
		return permUrl;
	}

	public void setPermUrl(String permUrl) {
		this.permUrl = permUrl;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "SysPermission [permId=" + permId + ", permName=" + permName + ", permDesc=" + permDesc + ", permPid="
				+ permPid + ", isShow=" + isShow + ", permUrl=" + permUrl + ", sort=" + sort + ", createTime="
				+ createTime + ", getId()=" + getId() + ", getParentId()=" + getParentId() + ", getChildren()="
				+ getChildren() + "]";
	}

}
