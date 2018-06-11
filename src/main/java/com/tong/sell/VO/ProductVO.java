package com.tong.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *   类目扩展，包含商品的列表
 * @author 元素滴
 * @date 2018/6/9 15:13
 */
@Data
public class ProductVO {

    /**类目名称，并且将返回给前端的字段变成name*/
    @JsonProperty("name")
    private String categoryName;

    /**类目类型编号.*/
    @JsonProperty("type")
    private Integer categoryType;

    /**该类目下的商品列表.*/
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
