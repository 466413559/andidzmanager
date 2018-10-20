package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.WorkshopArt;
import com.andidz.bizcore.domain.WorkshopArtExample;
import com.andidz.bizcore.mapper.WorkshopArtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkshopArtDao {
    @Autowired
    private WorkshopArtMapper workshopArtMapper;

    public List<WorkshopArt> getWorkshopArt(){
        return workshopArtMapper.selectByExample(new WorkshopArtExample());
    }

    /**
     * 没有返回null
     * @param code
     * @return
     */
    public WorkshopArt getWorkshopArtByArtCode(String code){
        WorkshopArtExample example = new WorkshopArtExample();
        WorkshopArtExample.Criteria criteria = example.createCriteria();
        criteria.andArtcodeEqualTo(code);
        List<WorkshopArt> result = workshopArtMapper.selectByExample(example);
        if(null == result || result.isEmpty()){
            return null;
        }
        return result.get(0);
    }

    public WorkshopArt getWorkshopArtByShopNumb(Integer numb){
        WorkshopArtExample example = new WorkshopArtExample();
        WorkshopArtExample.Criteria criteria = example.createCriteria();
        criteria.andWorkshopnumbEqualTo(numb);
        List<WorkshopArt> result = workshopArtMapper.selectByExample(example);
        if(null == result || result.isEmpty()){
            return null;
        }
        return result.get(0);
    }

    public WorkshopArt getWorkshopArtByPrimaryKey(Integer id){
        WorkshopArtExample example = new WorkshopArtExample();
        WorkshopArtExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<WorkshopArt> result = workshopArtMapper.selectByExample(example);
        if(null == result || result.isEmpty()){
            return null;
        }
        return result.get(0);
    }

    public Boolean insertWorkshopArt(WorkshopArt workshopArt){
        return workshopArtMapper.insert(workshopArt)>0;
    }

    public Boolean deleteWorkshopArtByKey(Integer id){
        return workshopArtMapper.deleteByPrimaryKey(id)>0;
    }

    public Boolean deleteWoshopArtByshopNumb(Integer numb){
        WorkshopArtExample example = new WorkshopArtExample();
        WorkshopArtExample.Criteria criteria = example.createCriteria();
        criteria.andWorkshopnumbEqualTo(numb);
        return workshopArtMapper.deleteByExample(example)>0;
    }
}
