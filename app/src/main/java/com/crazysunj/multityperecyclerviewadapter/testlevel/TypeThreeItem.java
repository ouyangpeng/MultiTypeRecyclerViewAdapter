package com.crazysunj.multityperecyclerviewadapter.testlevel;

/**
 * author: sunjian
 * created on: 2018/4/3 上午11:11
 * description:
 */

public class TypeThreeItem implements MultiTypeTitleEntity {

    public static final int TYPE_THREE = 3;
    private long id;
    private String msg;

    public TypeThreeItem(long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public int getItemType() {
        return TYPE_THREE;
    }

    @Override
    public long getId() {
        return id;
    }
}
