package com.demo.todolist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "t_category")
public class Category extends BaseModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "code", unique = true, length = 5)
    private String code;

    @Column(name = "category")
    private String category;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
