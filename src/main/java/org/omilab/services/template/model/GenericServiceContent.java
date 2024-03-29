package org.omilab.services.template.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement
public final class GenericServiceContent {

	private String content;

	private Map<String, String> submenu;

	public GenericServiceContent() {
	}

	public GenericServiceContent(String content, Map<String, String> submenu) {
		this.content = content;
		this.submenu = submenu;
	}

	public GenericServiceContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = content;
	}

	public Map<String, String> getSubmenu() {
		return submenu;
	}

	private void setSubmenu(Map<String, String> submenu) {
		this.submenu = submenu;
	}

}
