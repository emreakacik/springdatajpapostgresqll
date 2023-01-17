package com.haydikodlayalim.dto;


import lombok.Data;

import java.util.List;
@Data

public class KisiDto {
    private Long id;
    private String adi;
    private String soyadi;
    private List<String> adresleri;
}
