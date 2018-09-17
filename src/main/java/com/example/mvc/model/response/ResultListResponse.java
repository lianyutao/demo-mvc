package com.example.mvc.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

//@ApiModel(value = "resultListResponse", description = "返回对象")
public class ResultListResponse<Entity> extends ResultResponse {

	/**
     * 
     */
    private static final long serialVersionUID = 7243348462340540834L;
    private List<Entity> list=new ArrayList<Entity>();
//    @ApiModelProperty(value = "总页数")
    private Long size;
//    @ApiModelProperty(value = "当前页码")
    private Integer page;
//    @ApiModelProperty(value = "总记录数")
    private Long total;
    public List<Entity> getList() {
        return list;
    }

    public void setList(List<Entity> list) {
        this.list = list;
    }

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
    
}
