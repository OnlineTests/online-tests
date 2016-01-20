package edu.onlinetests.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;
import org.springframework.stereotype.Component;

import edu.onlinetests.view.Pages;

@ManagedBean(name = "aboutController")
@RequestScoped
@Component
public class AboutController {

	private TagCloudModel model;
	
	@PostConstruct
	public void init() {
		model = new DefaultTagCloudModel();
		model.addTag(new DefaultTagCloudItem("Java", "#", 10));
        model.addTag(new DefaultTagCloudItem("Primefaces", "#", 9));
        model.addTag(new DefaultTagCloudItem("HTML5", "#", 7));
        model.addTag(new DefaultTagCloudItem("MYSQL", "#", 6));
        model.addTag(new DefaultTagCloudItem("Maven", "#", 5));
        model.addTag(new DefaultTagCloudItem("Tomcat", "#", 5));
        model.addTag(new DefaultTagCloudItem("JPA", "#", 4));
        model.addTag(new DefaultTagCloudItem("CSS", "#", 4));
        model.addTag(new DefaultTagCloudItem("Spring", "#", 3));
        model.addTag(new DefaultTagCloudItem("JSF", "#", 2));
        model.addTag(new DefaultTagCloudItem("Javascript", "#", 2));
        model.addTag(new DefaultTagCloudItem("JDBC", "#", 1));
        model.addTag(new DefaultTagCloudItem("Hibernate", "#", 1));
	}
	
	public String goToAbout() {
		return Pages.ABOUT_PAGE;
	}
	
	public String back() {
		return Pages.MAIN_PAGE;
	}
	
}
