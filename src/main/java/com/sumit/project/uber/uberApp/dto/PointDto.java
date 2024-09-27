package com.sumit.project.uber.uberApp.dto;

import lombok.Data;

@Data
public class PointDto
{
    private Double[] coordinates;
    private  String type="Point";

}
