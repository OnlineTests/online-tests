package edu.onlinetests.frontend.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;
import org.springframework.stereotype.Component;

import edu.onlinetests.frontend.Pages;
import edu.onlinetests.utils.FileUtils;
import edu.onlinetests.utils.PropertiesProvider;
import edu.onlinetests.utils.StringKey;

@ManagedBean(name = "aboutController")
@RequestScoped
@Component
public class AboutController {

	private TagCloudModel model;
	
	@PostConstruct
	public void init() {
		model = new DefaultTagCloudModel();
		String filename = PropertiesProvider.getStringResource(StringKey.TECHNOLOGIES_FILE_PATH);
		List<String> lines = FileUtils.getAllLinesFromFile(filename);
		for (String line : lines) {
			String[] tokens = line.split(",");
			model.addTag(new DefaultTagCloudItem(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
		}
	}
	
	public String goToAbout() {
		return Pages.ABOUT_PAGE;
	}
	
	public String back() {
		return Pages.MAIN_PAGE;
	}

	public TagCloudModel getModel() {
		return model;
	}

	public void setModel(TagCloudModel model) {
		this.model = model;
	}
}
