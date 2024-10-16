package com.pfc.pfcl.infrastructure.dao;

import com.pfc.pfcl.infrastructure.po.RuleTreeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 规则树节点DAO
 * @author ypf
 */
@Mapper
public interface RuleTreeNodeDao {

    /**
     * 查询规则树节点
     * @param treeId    规则树ID
     * @return          规则树节点集合
     */
    List<RuleTreeNode> queryRuleTreeNodeList(Long treeId);

    /**
     * 查询规则树节点数量
     * @param treeId    规则树ID
     * @return          节点数量
     */
    int queryTreeNodeCount(Long treeId);

    /**
     * 查询规则树节点
     *
     * @param treeId    规则树ID
     * @return          节点集合
     */
    List<RuleTreeNode> queryTreeRulePoint(Long treeId);

}
