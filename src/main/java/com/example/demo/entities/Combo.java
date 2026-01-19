package com.example.demo.entities;
import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;



public class Combo {
	private Integer comboId;
    private String name;
    private BigDecimal comboPrice;
    private BigDecimal originalPrice;
    private String description;
    private String thumnailUrl;
    private List<ComboItem> comboItems ;
}
