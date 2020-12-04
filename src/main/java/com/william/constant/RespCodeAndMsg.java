package com.william.constant;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/20 9:10
 * @since Copyright(c) 爱睿智健康科技
 */
public enum RespCodeAndMsg {

    LOGIN_SUCCESS(Constant.OK,"登录成功"),
    LOGIN_ERROR(Constant.ERROR,"登录失败"),
    LOGIN_ERROR_NON_ACCOUNT(Constant.ERROR,"用户不存在或已过期"),
    LOGIN_ERROR_NON_PASS(Constant.ERROR,"用户名或密码错误"),
    UPDATE_SUCCESS(Constant.OK,"修改成功"),
    UPDATE_ERROR(Constant.ERROR,"修改失败"),
    ADD_SUCCESS(Constant.OK,"添加成功"),
    ADD_ERROR(Constant.ERROR,"添加失败"),
    OPERATE_SUCCESS(Constant.OK,"操作成功"),
    OPERATE_ERROR(Constant.ERROR,"操作失败"),
    CAPTCH_ERROR(Constant.ERROR,"验证码错误"),
    DISPATCH_SUCCESS(Constant.OK, "分配成功"),
    DISPATCH_ERROR(Constant.ERROR, "分配失败"),
    // 统一异常
    UNIFY_EXCEPTION(1000,"系统异常");

    private Integer code;
    private String msg;

    RespCodeAndMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return msg;
    }
}
