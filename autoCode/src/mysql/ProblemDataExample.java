package mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProblemDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemDataExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationIsNull() {
            addCriterion("first_classification is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationIsNotNull() {
            addCriterion("first_classification is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationEqualTo(String value) {
            addCriterion("first_classification =", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationNotEqualTo(String value) {
            addCriterion("first_classification <>", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationGreaterThan(String value) {
            addCriterion("first_classification >", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("first_classification >=", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationLessThan(String value) {
            addCriterion("first_classification <", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationLessThanOrEqualTo(String value) {
            addCriterion("first_classification <=", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationLike(String value) {
            addCriterion("first_classification like", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationNotLike(String value) {
            addCriterion("first_classification not like", value, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationIn(List<String> values) {
            addCriterion("first_classification in", values, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationNotIn(List<String> values) {
            addCriterion("first_classification not in", values, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationBetween(String value1, String value2) {
            addCriterion("first_classification between", value1, value2, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andFirstClassificationNotBetween(String value1, String value2) {
            addCriterion("first_classification not between", value1, value2, "firstClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationIsNull() {
            addCriterion("second_classification is null");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationIsNotNull() {
            addCriterion("second_classification is not null");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationEqualTo(String value) {
            addCriterion("second_classification =", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationNotEqualTo(String value) {
            addCriterion("second_classification <>", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationGreaterThan(String value) {
            addCriterion("second_classification >", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("second_classification >=", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationLessThan(String value) {
            addCriterion("second_classification <", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationLessThanOrEqualTo(String value) {
            addCriterion("second_classification <=", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationLike(String value) {
            addCriterion("second_classification like", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationNotLike(String value) {
            addCriterion("second_classification not like", value, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationIn(List<String> values) {
            addCriterion("second_classification in", values, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationNotIn(List<String> values) {
            addCriterion("second_classification not in", values, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationBetween(String value1, String value2) {
            addCriterion("second_classification between", value1, value2, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andSecondClassificationNotBetween(String value1, String value2) {
            addCriterion("second_classification not between", value1, value2, "secondClassification");
            return (Criteria) this;
        }

        public Criteria andContentProblemIsNull() {
            addCriterion("content_problem is null");
            return (Criteria) this;
        }

        public Criteria andContentProblemIsNotNull() {
            addCriterion("content_problem is not null");
            return (Criteria) this;
        }

        public Criteria andContentProblemEqualTo(String value) {
            addCriterion("content_problem =", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemNotEqualTo(String value) {
            addCriterion("content_problem <>", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemGreaterThan(String value) {
            addCriterion("content_problem >", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemGreaterThanOrEqualTo(String value) {
            addCriterion("content_problem >=", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemLessThan(String value) {
            addCriterion("content_problem <", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemLessThanOrEqualTo(String value) {
            addCriterion("content_problem <=", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemLike(String value) {
            addCriterion("content_problem like", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemNotLike(String value) {
            addCriterion("content_problem not like", value, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemIn(List<String> values) {
            addCriterion("content_problem in", values, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemNotIn(List<String> values) {
            addCriterion("content_problem not in", values, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemBetween(String value1, String value2) {
            addCriterion("content_problem between", value1, value2, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andContentProblemNotBetween(String value1, String value2) {
            addCriterion("content_problem not between", value1, value2, "contentProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemIsNull() {
            addCriterion("status_problem is null");
            return (Criteria) this;
        }

        public Criteria andStatusProblemIsNotNull() {
            addCriterion("status_problem is not null");
            return (Criteria) this;
        }

        public Criteria andStatusProblemEqualTo(Integer value) {
            addCriterion("status_problem =", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemNotEqualTo(Integer value) {
            addCriterion("status_problem <>", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemGreaterThan(Integer value) {
            addCriterion("status_problem >", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_problem >=", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemLessThan(Integer value) {
            addCriterion("status_problem <", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemLessThanOrEqualTo(Integer value) {
            addCriterion("status_problem <=", value, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemIn(List<Integer> values) {
            addCriterion("status_problem in", values, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemNotIn(List<Integer> values) {
            addCriterion("status_problem not in", values, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemBetween(Integer value1, Integer value2) {
            addCriterion("status_problem between", value1, value2, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andStatusProblemNotBetween(Integer value1, Integer value2) {
            addCriterion("status_problem not between", value1, value2, "statusProblem");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIsNull() {
            addCriterion("amount_money is null");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIsNotNull() {
            addCriterion("amount_money is not null");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyEqualTo(Integer value) {
            addCriterion("amount_money =", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotEqualTo(Integer value) {
            addCriterion("amount_money <>", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyGreaterThan(Integer value) {
            addCriterion("amount_money >", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount_money >=", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyLessThan(Integer value) {
            addCriterion("amount_money <", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("amount_money <=", value, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyIn(List<Integer> values) {
            addCriterion("amount_money in", values, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotIn(List<Integer> values) {
            addCriterion("amount_money not in", values, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyBetween(Integer value1, Integer value2) {
            addCriterion("amount_money between", value1, value2, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andAmountMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("amount_money not between", value1, value2, "amountMoney");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNull() {
            addCriterion("spare_field1 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNotNull() {
            addCriterion("spare_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField1EqualTo(String value) {
            addCriterion("spare_field1 =", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotEqualTo(String value) {
            addCriterion("spare_field1 <>", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThan(String value) {
            addCriterion("spare_field1 >", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field1 >=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThan(String value) {
            addCriterion("spare_field1 <", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThanOrEqualTo(String value) {
            addCriterion("spare_field1 <=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Like(String value) {
            addCriterion("spare_field1 like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotLike(String value) {
            addCriterion("spare_field1 not like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1In(List<String> values) {
            addCriterion("spare_field1 in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotIn(List<String> values) {
            addCriterion("spare_field1 not in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Between(String value1, String value2) {
            addCriterion("spare_field1 between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotBetween(String value1, String value2) {
            addCriterion("spare_field1 not between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNull() {
            addCriterion("spare_field2 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNotNull() {
            addCriterion("spare_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField2EqualTo(String value) {
            addCriterion("spare_field2 =", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotEqualTo(String value) {
            addCriterion("spare_field2 <>", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThan(String value) {
            addCriterion("spare_field2 >", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field2 >=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThan(String value) {
            addCriterion("spare_field2 <", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThanOrEqualTo(String value) {
            addCriterion("spare_field2 <=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2Like(String value) {
            addCriterion("spare_field2 like", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotLike(String value) {
            addCriterion("spare_field2 not like", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2In(List<String> values) {
            addCriterion("spare_field2 in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotIn(List<String> values) {
            addCriterion("spare_field2 not in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2Between(String value1, String value2) {
            addCriterion("spare_field2 between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotBetween(String value1, String value2) {
            addCriterion("spare_field2 not between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNull() {
            addCriterion("spare_field3 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNotNull() {
            addCriterion("spare_field3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField3EqualTo(String value) {
            addCriterion("spare_field3 =", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotEqualTo(String value) {
            addCriterion("spare_field3 <>", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThan(String value) {
            addCriterion("spare_field3 >", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field3 >=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThan(String value) {
            addCriterion("spare_field3 <", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThanOrEqualTo(String value) {
            addCriterion("spare_field3 <=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3Like(String value) {
            addCriterion("spare_field3 like", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotLike(String value) {
            addCriterion("spare_field3 not like", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3In(List<String> values) {
            addCriterion("spare_field3 in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotIn(List<String> values) {
            addCriterion("spare_field3 not in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3Between(String value1, String value2) {
            addCriterion("spare_field3 between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotBetween(String value1, String value2) {
            addCriterion("spare_field3 not between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNull() {
            addCriterion("spare_field4 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNotNull() {
            addCriterion("spare_field4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField4EqualTo(String value) {
            addCriterion("spare_field4 =", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotEqualTo(String value) {
            addCriterion("spare_field4 <>", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThan(String value) {
            addCriterion("spare_field4 >", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field4 >=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThan(String value) {
            addCriterion("spare_field4 <", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThanOrEqualTo(String value) {
            addCriterion("spare_field4 <=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Like(String value) {
            addCriterion("spare_field4 like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotLike(String value) {
            addCriterion("spare_field4 not like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4In(List<String> values) {
            addCriterion("spare_field4 in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotIn(List<String> values) {
            addCriterion("spare_field4 not in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Between(String value1, String value2) {
            addCriterion("spare_field4 between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotBetween(String value1, String value2) {
            addCriterion("spare_field4 not between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNull() {
            addCriterion("spare_field5 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNotNull() {
            addCriterion("spare_field5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField5EqualTo(String value) {
            addCriterion("spare_field5 =", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotEqualTo(String value) {
            addCriterion("spare_field5 <>", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThan(String value) {
            addCriterion("spare_field5 >", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field5 >=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThan(String value) {
            addCriterion("spare_field5 <", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThanOrEqualTo(String value) {
            addCriterion("spare_field5 <=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Like(String value) {
            addCriterion("spare_field5 like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotLike(String value) {
            addCriterion("spare_field5 not like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5In(List<String> values) {
            addCriterion("spare_field5 in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotIn(List<String> values) {
            addCriterion("spare_field5 not in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Between(String value1, String value2) {
            addCriterion("spare_field5 between", value1, value2, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotBetween(String value1, String value2) {
            addCriterion("spare_field5 not between", value1, value2, "spareField5");
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