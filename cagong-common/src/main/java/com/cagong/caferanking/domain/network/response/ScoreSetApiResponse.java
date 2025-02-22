package com.cagong.caferanking.domain.network.response;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class ScoreSetApiResponse {

    private Long id;

    private Double mood;

    private Double light;

    private Double price;

    private Double taste;

    private Long cafeId;

    private String cafeName;

    private String cafeImgUrl;
}
