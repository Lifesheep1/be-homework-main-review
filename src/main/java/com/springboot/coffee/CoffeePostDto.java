package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
public class CoffeePostDto {

    @Pattern(regexp = ".*\\S.*", message = "공백만으로 구성될 수 없습니다.")
    private String korName;

    @Pattern(regexp = ".*\\S.*", message = "공백만으로 구성될 수 없습니다.")
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+)*$", message = "영문 대소문자와 단어 사이에 한 칸의 공백만 허용됩니다.")
    private String engName;

    @Min(value = 100, message = "100 이상이어야 합니다.")
    @Max(value = 50000, message = "50000 이하이어야 합니다.")
    private int price;
}
