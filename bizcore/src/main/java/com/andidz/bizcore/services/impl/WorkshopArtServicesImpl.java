package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductArtRelationshipDao;
import com.andidz.bizcore.dao.WorkshopArtDao;
import com.andidz.bizcore.domain.Product;
import com.andidz.bizcore.domain.ProductArtRelationship;
import com.andidz.bizcore.domain.WorkshopArt;
import com.andidz.bizcore.services.ProductServices;
import com.andidz.bizcore.services.WorkshopArtServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkshopArtServicesImpl implements WorkshopArtServices {
    @Autowired
    private WorkshopArtDao workshopArtDao;

    @Autowired
    private ProductArtRelationshipDao productArtRelationshipDao;

    @Autowired
    private ProductServices productServices;

    @Override
    public List<WorkshopArt> queryWorkshopArtByProductNumb(String productNumb) {
        List<WorkshopArt> result = new ArrayList<>();
        if(null == productNumb || productNumb.isEmpty())return result;
        List<ProductArtRelationship> arts = productArtRelationshipDao.getRelationshipByProductNumb(productNumb);
        for(ProductArtRelationship relationship : arts){
            Integer shopNumb = relationship.getWorkshopnumb();
            WorkshopArt art = workshopArtDao.getWorkshopArtByShopNumb(shopNumb);
            if(art!= null){
                result.add(art);
            }
        }
        return result;
    }

    @Override
    public Boolean addWorkshopArt(WorkshopArt workshopArt) {
        if(null == workshopArt || workshopArt.getWorkshopnumb() == null)return false;
        return workshopArtDao.insertWorkshopArt(workshopArt);
    }

    @Override
    public Boolean updateWordshopArt(WorkshopArt workshopArt) {
        if(null == workshopArt || workshopArt.getId() == null)return false;
        return workshopArtDao.updateWorkshopArt(workshopArt);
    }

    @Override
    public Boolean addProductArt(Integer productId, List<Integer> shopNumbs) {
        if(null ==productId || null == shopNumbs || shopNumbs.isEmpty())return false;
        Product product = productServices.getProductByProductId(productId);
        if(null == product)return false;
        try {
            addProductArt(product.getProductnumb(),shopNumbs);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public Boolean addProductArt(String productNumb, List<Integer> shopNumbs) throws Exception{
        if(shopNumbs == null|| shopNumbs.isEmpty())return false;
        for(Integer shopNumb : shopNumbs){
            ProductArtRelationship relationship = new ProductArtRelationship();
            relationship.setProductnumb(productNumb);
            relationship.setWorkshopnumb(shopNumb);
            if(!productArtRelationshipDao.insertRelationship(relationship))throw new Exception();
        }
        return true;
    }

    @Override
    public List<WorkshopArt> queryAllArt(Integer start, Integer pageSize) {
        return workshopArtDao.getWorkshopArt(start,pageSize);
    }
}
