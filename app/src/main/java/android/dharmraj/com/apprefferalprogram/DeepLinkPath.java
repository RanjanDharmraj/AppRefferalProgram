package android.dharmraj.com.apprefferalprogram;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Dharmraj on 2/4/2017.
 */

public class DeepLinkPath implements Serializable {

    @SerializedName("+is_first_session")
    @Expose
    private Boolean isFirstSession;
    @SerializedName("+clicked_branch_link")
    @Expose
    private Boolean clickedBranchLink;
    @SerializedName("$marketing_title")
    @Expose
    private String $marketingTitle;
    @SerializedName("$one_time_use")
    @Expose
    private String $oneTimeUse;
    @SerializedName("categoryid")
    @Expose
    private String categoryid;
    @SerializedName("productid")
    @Expose
    private String productid;
    @SerializedName("post_id")
    @Expose
    private String postid;
    @SerializedName("~campaign")
    @Expose
    private String campaign;
    @SerializedName("~channel")
    @Expose
    private String channel;
    @SerializedName("~id")
    @Expose
    private String id;
    @SerializedName("~marketing")
    @Expose
    private Boolean marketing;
    @SerializedName("+click_timestamp")
    @Expose
    private Integer clickTimestamp;
    @SerializedName("~referring_link")
    @Expose
    private String referringLink;
    @SerializedName("+match_guaranteed")
    @Expose
    private Boolean matchGuaranteed;

    /**
     *
     * @return
     *     The isFirstSession
     */
    public Boolean getIsFirstSession() {
        return isFirstSession;
    }

    /**
     *
     * @param isFirstSession
     *     The +is_first_session
     */
    public void setIsFirstSession(Boolean isFirstSession) {
        this.isFirstSession = isFirstSession;
    }

    /**
     *
     * @return
     *     The clickedBranchLink
     */
    public Boolean getClickedBranchLink() {
        return clickedBranchLink;
    }

    /**
     *
     * @param clickedBranchLink
     *     The +clicked_branch_link
     */
    public void setClickedBranchLink(Boolean clickedBranchLink) {
        this.clickedBranchLink = clickedBranchLink;
    }

    /**
     *
     * @return
     *     The $marketingTitle
     */
    public String get$marketingTitle() {
        return $marketingTitle;
    }

    /**
     *
     * @param $marketingTitle
     *     The $marketing_title
     */
    public void set$marketingTitle(String $marketingTitle) {
        this.$marketingTitle = $marketingTitle;
    }

    /**
     *
     * @return
     *     The $oneTimeUse
     */
    public String get$oneTimeUse() {
        return $oneTimeUse;
    }

    /**
     *
     * @param $oneTimeUse
     *     The $one_time_use
     */
    public void set$oneTimeUse(String $oneTimeUse) {
        this.$oneTimeUse = $oneTimeUse;
    }

    /**
     *
     * @return
     *     The categoryid
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     *
     * @param categoryid
     *     The categoryid
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    /**
     *
     * @return
     *     The productid
     */
    public String getProductid() {
        return productid;
    }

    /**
     *
     * @param productid
     *     The productid
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }
    /**
     *
     * @return
     *     The post_id
     */

    public String getPostId() {
        return postid;
    }
    /**
     *
     * @param postid
     *     The post_id
     */

    public void setPostId(String postid) {
        this.postid = postid;
    }

    /**
     *
     * @return
     *     The campaign
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     *
     * @param campaign
     *     The ~campaign
     */
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    /**
     *
     * @return
     *     The channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     *
     * @param channel
     *     The ~channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The ~id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The marketing
     */
    public Boolean getMarketing() {
        return marketing;
    }

    /**
     *
     * @param marketing
     *     The ~marketing
     */
    public void setMarketing(Boolean marketing) {
        this.marketing = marketing;
    }

    /**
     *
     * @return
     *     The clickTimestamp
     */
    public Integer getClickTimestamp() {
        return clickTimestamp;
    }

    /**
     *
     * @param clickTimestamp
     *     The +click_timestamp
     */
    public void setClickTimestamp(Integer clickTimestamp) {
        this.clickTimestamp = clickTimestamp;
    }

    /**
     *
     * @return
     *     The referringLink
     */
    public String getReferringLink() {
        return referringLink;
    }

    /**
     *
     * @param referringLink
     *     The ~referring_link
     */
    public void setReferringLink(String referringLink) {
        this.referringLink = referringLink;
    }

    /**
     *
     * @return
     *     The matchGuaranteed
     */
    public Boolean getMatchGuaranteed() {
        return matchGuaranteed;
    }

    /**
     *
     * @param matchGuaranteed
     *     The +match_guaranteed
     */
    public void setMatchGuaranteed(Boolean matchGuaranteed) {
        this.matchGuaranteed = matchGuaranteed;
    }

}

