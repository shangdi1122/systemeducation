package cn.beijing.ssfh.entity;

public class Tbuser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbuser.tbuser_id
     *
     * @mbggenerated
     */
    private Integer tbuserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbuser.user_info_id
     *
     * @mbggenerated
     */
    private Integer userInfoId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbuser.tbuser_id
     *
     * @return the value of tbuser.tbuser_id
     *
     * @mbggenerated
     */
    public Integer getTbuserId() {
        return tbuserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbuser.tbuser_id
     *
     * @param tbuserId the value for tbuser.tbuser_id
     *
     * @mbggenerated
     */
    public void setTbuserId(Integer tbuserId) {
        this.tbuserId = tbuserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbuser.user_info_id
     *
     * @return the value of tbuser.user_info_id
     *
     * @mbggenerated
     */
    public Integer getUserInfoId() {
        return userInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbuser.user_info_id
     *
     * @param userInfoId the value for tbuser.user_info_id
     *
     * @mbggenerated
     */
    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }
}