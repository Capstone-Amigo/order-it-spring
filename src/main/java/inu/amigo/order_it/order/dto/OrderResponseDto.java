package inu.amigo.order_it.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class OrderResponseDto {
    @Schema(description = "주문한 Item 배열")
    private List<DetailDto> detailDtoList;

    private Long orderId;

    @Schema(description = "주문의 총 가격", example = "4500")
    private int totalPrice;

    @Schema(description = "주문의 OrderType", example = "TAKE_OUT, ON_SITE")
    private OrderType orderType;
}
