package com.xiaowu.shardingjdbcdemo.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 吴家峰
 * @version 1.0 2021-01-17:17:46
 * @see
 * @since 1.0
 */
@Data
@TableName("user")
public class User {
    private Long userId;
    private String userName;
    private String userStatus;
}
