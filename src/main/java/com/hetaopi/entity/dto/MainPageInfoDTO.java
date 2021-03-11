package com.hetaopi.entity.dto;

import com.hetaopi.entity.bo.HeadLine;
import com.hetaopi.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
