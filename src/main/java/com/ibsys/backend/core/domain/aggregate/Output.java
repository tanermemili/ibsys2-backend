package com.ibsys.backend.core.domain.aggregate;

import com.ibsys.backend.core.domain.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class Output {
    private QualityControl qualityControl;
    private List<SellWish> sellWishes;
    private List<SellDirect> sellDirects;
    private List<OrderItem> orderItems;
    private List<Production> productions;
    private List<OverTime> workstations;
}
