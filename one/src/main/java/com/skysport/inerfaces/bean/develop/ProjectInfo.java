package com.skysport.inerfaces.bean.develop;

import com.skysport.inerfaces.bean.common.UploadFileInfo;

import java.util.List;
import java.util.Map;

/**
 * 类说明:
 * Created by zhangjh on 2015/8/26.
 */
public class ProjectInfo extends ProjectBomInfo {

    private List<ProjectCategoryInfo> categoryInfos;

    /**
     * 项目状态
     */
    private int status;
    /**
     * 是否可编辑
     */
    private int canEdit;


    public List<ProjectCategoryInfo> getCategoryInfos() {
        return categoryInfos;
    }

    public void setCategoryInfos(List<ProjectCategoryInfo> categoryInfos) {
        this.categoryInfos = categoryInfos;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public ProjectInfo clone() throws CloneNotSupportedException {
        ProjectInfo projectInfo = (ProjectInfo) super.clone();
        return projectInfo;
    }


}
