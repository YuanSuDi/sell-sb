package com.tong.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *   商品，包含类目
 * @author 元素滴
 * @date 2018/6/9 15:13
 */
@Data
public class ProductVO {

    /**类目名称，并且将返回给前端的字段变成name*/
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
