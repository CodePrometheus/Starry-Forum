package com.star.forum.model;

import java.util.ArrayList;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andVipRankIsNull() {
            addCriterion("vip_rank is null");
            return (Criteria) this;
        }

        public Criteria andVipRankIsNotNull() {
            addCriterion("vip_rank is not null");
            return (Criteria) this;
        }

        public Criteria andVipRankEqualTo(Integer value) {
            addCriterion("vip_rank =", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotEqualTo(Integer value) {
            addCriterion("vip_rank <>", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankGreaterThan(Integer value) {
            addCriterion("vip_rank >", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_rank >=", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankLessThan(Integer value) {
            addCriterion("vip_rank <", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankLessThanOrEqualTo(Integer value) {
            addCriterion("vip_rank <=", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankIn(List<Integer> values) {
            addCriterion("vip_rank in", values, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotIn(List<Integer> values) {
            addCriterion("vip_rank not in", values, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankBetween(Integer value1, Integer value2) {
            addCriterion("vip_rank between", value1, value2, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_rank not between", value1, value2, "vipRank");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("score1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("score1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(Integer value) {
            addCriterion("score1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(Integer value) {
            addCriterion("score1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(Integer value) {
            addCriterion("score1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("score1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(Integer value) {
            addCriterion("score1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(Integer value) {
            addCriterion("score1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<Integer> values) {
            addCriterion("score1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<Integer> values) {
            addCriterion("score1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(Integer value1, Integer value2) {
            addCriterion("score1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("score1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(Integer value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(Integer value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(Integer value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(Integer value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(Integer value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<Integer> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<Integer> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(Integer value1, Integer value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("score2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("score3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("score3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(Integer value) {
            addCriterion("score3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(Integer value) {
            addCriterion("score3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(Integer value) {
            addCriterion("score3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(Integer value) {
            addCriterion("score3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(Integer value) {
            addCriterion("score3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(Integer value) {
            addCriterion("score3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<Integer> values) {
            addCriterion("score3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<Integer> values) {
            addCriterion("score3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(Integer value1, Integer value2) {
            addCriterion("score3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(Integer value1, Integer value2) {
            addCriterion("score3 not between", value1, value2, "score3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}