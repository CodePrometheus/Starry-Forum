package com.star.forum.model;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Long value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Long value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Long value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Long value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Long value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Long> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Long> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Long value1, Long value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Long value1, Long value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNull() {
            addCriterion("html is null");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNotNull() {
            addCriterion("html is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlEqualTo(String value) {
            addCriterion("html =", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotEqualTo(String value) {
            addCriterion("html <>", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThan(String value) {
            addCriterion("html >", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("html >=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThan(String value) {
            addCriterion("html <", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThanOrEqualTo(String value) {
            addCriterion("html <=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLike(String value) {
            addCriterion("html like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotLike(String value) {
            addCriterion("html not like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlIn(List<String> values) {
            addCriterion("html in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotIn(List<String> values) {
            addCriterion("html not in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlBetween(String value1, String value2) {
            addCriterion("html between", value1, value2, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotBetween(String value1, String value2) {
            addCriterion("html not between", value1, value2, "html");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNull() {
            addCriterion("pub_date is null");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNotNull() {
            addCriterion("pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubDateEqualTo(String value) {
            addCriterion("pub_date =", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotEqualTo(String value) {
            addCriterion("pub_date <>", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThan(String value) {
            addCriterion("pub_date >", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThanOrEqualTo(String value) {
            addCriterion("pub_date >=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThan(String value) {
            addCriterion("pub_date <", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThanOrEqualTo(String value) {
            addCriterion("pub_date <=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLike(String value) {
            addCriterion("pub_date like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotLike(String value) {
            addCriterion("pub_date not like", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateIn(List<String> values) {
            addCriterion("pub_date in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotIn(List<String> values) {
            addCriterion("pub_date not in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateBetween(String value1, String value2) {
            addCriterion("pub_date between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotBetween(String value1, String value2) {
            addCriterion("pub_date not between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andImageurl1IsNull() {
            addCriterion("imageurl1 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl1IsNotNull() {
            addCriterion("imageurl1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl1EqualTo(String value) {
            addCriterion("imageurl1 =", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotEqualTo(String value) {
            addCriterion("imageurl1 <>", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1GreaterThan(String value) {
            addCriterion("imageurl1 >", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1GreaterThanOrEqualTo(String value) {
            addCriterion("imageurl1 >=", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1LessThan(String value) {
            addCriterion("imageurl1 <", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1LessThanOrEqualTo(String value) {
            addCriterion("imageurl1 <=", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1Like(String value) {
            addCriterion("imageurl1 like", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotLike(String value) {
            addCriterion("imageurl1 not like", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1In(List<String> values) {
            addCriterion("imageurl1 in", values, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotIn(List<String> values) {
            addCriterion("imageurl1 not in", values, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1Between(String value1, String value2) {
            addCriterion("imageurl1 between", value1, value2, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotBetween(String value1, String value2) {
            addCriterion("imageurl1 not between", value1, value2, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl2IsNull() {
            addCriterion("imageurl2 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl2IsNotNull() {
            addCriterion("imageurl2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl2EqualTo(String value) {
            addCriterion("imageurl2 =", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotEqualTo(String value) {
            addCriterion("imageurl2 <>", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2GreaterThan(String value) {
            addCriterion("imageurl2 >", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2GreaterThanOrEqualTo(String value) {
            addCriterion("imageurl2 >=", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2LessThan(String value) {
            addCriterion("imageurl2 <", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2LessThanOrEqualTo(String value) {
            addCriterion("imageurl2 <=", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2Like(String value) {
            addCriterion("imageurl2 like", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotLike(String value) {
            addCriterion("imageurl2 not like", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2In(List<String> values) {
            addCriterion("imageurl2 in", values, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotIn(List<String> values) {
            addCriterion("imageurl2 not in", values, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2Between(String value1, String value2) {
            addCriterion("imageurl2 between", value1, value2, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotBetween(String value1, String value2) {
            addCriterion("imageurl2 not between", value1, value2, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl3IsNull() {
            addCriterion("imageurl3 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl3IsNotNull() {
            addCriterion("imageurl3 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl3EqualTo(String value) {
            addCriterion("imageurl3 =", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotEqualTo(String value) {
            addCriterion("imageurl3 <>", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3GreaterThan(String value) {
            addCriterion("imageurl3 >", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3GreaterThanOrEqualTo(String value) {
            addCriterion("imageurl3 >=", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3LessThan(String value) {
            addCriterion("imageurl3 <", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3LessThanOrEqualTo(String value) {
            addCriterion("imageurl3 <=", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3Like(String value) {
            addCriterion("imageurl3 like", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotLike(String value) {
            addCriterion("imageurl3 not like", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3In(List<String> values) {
            addCriterion("imageurl3 in", values, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotIn(List<String> values) {
            addCriterion("imageurl3 not in", values, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3Between(String value1, String value2) {
            addCriterion("imageurl3 between", value1, value2, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotBetween(String value1, String value2) {
            addCriterion("imageurl3 not between", value1, value2, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentIsNull() {
            addCriterion("gmt_latest_comment is null");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentIsNotNull() {
            addCriterion("gmt_latest_comment is not null");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentEqualTo(Long value) {
            addCriterion("gmt_latest_comment =", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentNotEqualTo(Long value) {
            addCriterion("gmt_latest_comment <>", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentGreaterThan(Long value) {
            addCriterion("gmt_latest_comment >", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_latest_comment >=", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentLessThan(Long value) {
            addCriterion("gmt_latest_comment <", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentLessThanOrEqualTo(Long value) {
            addCriterion("gmt_latest_comment <=", value, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentIn(List<Long> values) {
            addCriterion("gmt_latest_comment in", values, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentNotIn(List<Long> values) {
            addCriterion("gmt_latest_comment not in", values, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentBetween(Long value1, Long value2) {
            addCriterion("gmt_latest_comment between", value1, value2, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andGmtLatestCommentNotBetween(Long value1, Long value2) {
            addCriterion("gmt_latest_comment not between", value1, value2, "gmtLatestComment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("column2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("column2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(Integer value) {
            addCriterion("column2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(Integer value) {
            addCriterion("column2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(Integer value) {
            addCriterion("column2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(Integer value) {
            addCriterion("column2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(Integer value) {
            addCriterion("column2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(Integer value) {
            addCriterion("column2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<Integer> values) {
            addCriterion("column2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<Integer> values) {
            addCriterion("column2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(Integer value1, Integer value2) {
            addCriterion("column2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(Integer value1, Integer value2) {
            addCriterion("column2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Long value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Long value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Long value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Long value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Long value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Long> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Long> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Long value1, Long value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Long value1, Long value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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