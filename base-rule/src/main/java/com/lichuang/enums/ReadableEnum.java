package com.lichuang.enums;

/**
 * 可读性枚举的规范，必须包含一个key和一个value
 * <p>
 * key一般是编码，id，具有标识性的类型
 * value一般是String类型，是一串文字
 *
 */
public interface ReadableEnum<T> {

    /**
     * 获取枚举中具有标识性的key或者id
     * <p>
     * 例如：状态枚举中的装填值，1 或 2
     *
     */
    Object getKey();

    /**
     * 获取枚举中具有可读性的value值
     * <p>
     * 例如：状态枚举中的状态名称，"启用" 或 "禁用"
     */
    Object getName();

    /**
     * 将原始值转化为具体枚举对象
     */
    T parseToEnum(String originValue);

}
