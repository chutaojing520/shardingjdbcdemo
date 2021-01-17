package com.xiaowu.shardingjdbcdemo.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-17:20:39
 * @see
 * @since 1.0
 */
@Data
@TableName("sttc_dict")
public class DataDict {
    private Long dictId;
    private String dictCnname;
    private String dictName;
    private String dictValue;
    private String dictStatus;
}
