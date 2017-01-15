package jp.co.demodemo;

import java.util.LinkedList;
import java.util.List;

import jp.co.demodemo.form.RadioForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RadioSampleController {

	@RequestMapping(value = "/sample/radio/disp/", method = RequestMethod.GET)
	public String disp(Model model) {
		model.addAttribute("message", "radioのサンプル");
		RadioForm form = new RadioForm();
		form.setName("次郎");
		model.addAttribute("radioForm", form);
		model.addAttribute("checkEmployees", getRadioEmployees());
		return "radioSample";
	}

	@RequestMapping(value = "/sample/radio/info/", method = RequestMethod.POST)
	public String getradioInfo(@ModelAttribute RadioForm form, Model model) {
		String selectedName = form.getName();
		model.addAttribute("message", selectedName);
		model.addAttribute("radioForm", form);
		model.addAttribute("checkEmployees", getRadioEmployees());
		return "radioSample";
	}

	private List<String> getRadioEmployees() {
		List<String> list = new LinkedList<String>();
		list.add("一太郎");
		list.add("次郎");
		list.add("三郎");
		return list;
	}
}
