package com.sjh001.springboot3001.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {


    @NotBlank(message = "city参数是必填项")
    private String city;


    //页码
    @NotNull(message = "page参数是必填项")
    private Integer page;

    private int pageSize;
}
