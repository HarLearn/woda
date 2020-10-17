package com.woda.run.Ebbinghaus;

import java.util.LinkedList;

/**
 * 基于艾宾浩斯的遗忘推荐
 */
public interface Ebbinghaus {
    /**
     * 用于 返回用户 需要 复习的内容
     * @return 内容列表
     */
    LinkedList<String> getCurrentLearnPlain();

    /**
     * 设置复习的计划
     * @param plain 复习计划
     */
    void setLearnPlain(int[] plain);

    /**
     * 根据文章的ID 对当天复习计划的文章进行删除
     * @param id 文章的id
     * @return 返回是否删除成功
     */
    boolean removeContentById(String id);
}
