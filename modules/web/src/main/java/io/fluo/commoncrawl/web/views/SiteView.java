package io.fluo.commoncrawl.web.views;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import io.dropwizard.views.View;
import io.fluo.commoncrawl.web.models.Site;

public class SiteView extends View {

  private final Site site;

  public SiteView(Site site) {
    super("site.ftl");
    this.site = site;
  }

  public Site getSite() {
    return site;
  }
}