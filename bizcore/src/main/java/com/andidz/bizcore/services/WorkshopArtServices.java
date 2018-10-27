package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.WorkshopArt;

import java.util.List;

public interface WorkshopArtServices {
    /**
     * 根据产品id获取产品对应的工艺流程
     * @param productId
     * @return
     */
    public List<WorkshopArt> queryWorkshopArtByProductId(Integer productId);

    /**
     * 添加工艺
     * @param workshopArt
     * @return
     */
    public Boolean addWorkshopArt(WorkshopArt workshopArt);

    /**
     * 更新车间工艺信息
     * @param workshopArt
     * @return
     */
    public Boolean updateWordshopArt(WorkshopArt workshopArt);

    /**
     * 添加产品工艺对应关系
     * @param productId
     * @param shopNumbs
     * @return
     */
    public Boolean addProductArt(Integer productId,List<Integer> shopNumbs);

    /**
     * 分页获取所有车间工艺信息
     * @param start
     * @param pageSize
     * @return
     */
    public List<WorkshopArt> queryAllArt(Integer start,Integer pageSize);
}
