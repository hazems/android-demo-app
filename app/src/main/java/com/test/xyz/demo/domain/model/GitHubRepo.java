package com.test.xyz.demo.domain.model;

import java.util.Date;

public class GitHubRepo {
    public long id;
    public String name;
    public String full_name;
    public GitHubUser owner;
    public String html_url;
    public String description;
    public String url;
    public Date created_at;
    public Date updated_at;
    public Date pushed_at;
    public String git_url;
    public String ssh_url;
    public String clone_url;
    public String svn_url;
    public String homepage;
    public int stargazers_count;
    public int watchers_count;
    public String language;
    public boolean has_issues;
    public boolean has_downloads;
    public boolean has_wiki;
    public boolean has_pages;
    public int forks_count;
    public int open_issues_count;
    public int forks;
    public int open_issues;
    public int watchers;
    public String default_branch;

    public GitHubRepo() {
    }

    public GitHubRepo(String name) {
        this.name = name;
    }
}