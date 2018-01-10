package com.ruyu.haidihan.helloworldtext.Network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by haidihan on 2018/1/10.
 */

public class GitModel {
    @Expose
    public String login;
    @Expose
    public Integer id;
    @SerializedName("avatar_url")
    @Expose
    public String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    public String gravatarId;
    @Expose
    public String url;
    @SerializedName("html_url")
    @Expose
    public String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    public String followersUrl;
    @SerializedName("following_url")
    @Expose
    public String followingUrl;
    @SerializedName("gists_url")
    @Expose
    public String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    public String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    public String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    public String reposUrl;
    @SerializedName("events_url")
    @Expose
    public String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    public String receivedEventsUrl;
    @Expose
    public String type;
    @SerializedName("site_admin")
    @Expose
    public Boolean siteAdmin;
    @Expose
    public String name;
    @Expose
    public String company;
    @Expose
    public String blog;
    @Expose
    public String location;
    @Expose
    public String email;
    @Expose
    public Boolean hireable;
    @Expose
    public Object bio;
    @SerializedName("public_repos")
    @Expose
    public Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    public Integer publicGists;
    @Expose
    public Integer followers;
    @Expose
    public Integer following;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;
}
