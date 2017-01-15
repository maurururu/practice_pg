package jp.co.demodemo;

import java.util.LinkedList;
import java.util.List;

import jp.co.demodemo.form.SelectForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SelectSampleController {
	@RequestMapping(value = "/sample/select/disp/", method = RequestMethod.GET)
	public String disp(Model model) {
		model.addAttribute("message", "selectのサンプル");
		SelectForm form = new SelectForm();
		form.setEmployees(new String[] { "次郎" });
		model.addAttribute("selectForm", form);
		model.addAttribute("selectEmployees", getSelectEmployees());
		return "selectSample";
	}

	@RequestMapping(value = "/sample/select/info/", method = RequestMethod.POST)
	public String getcheckInfo(@ModelAttribute SelectForm form, Model model) {
		String[] selectedEmployee = form.getEmployees();
		StringBuilder builder = new StringBuilder();
		for (String employee : selectedEmployee) {
			builder.append(employee).append(System.getProperty("line.separator"));
		}
		model.addAttribute("message", builder);
		model.addAttribute("selectForm", form);
		model.addAttribute("selectEmployees", getSelectEmployees());
		return "selectSample";
	}

	private List<String> getSelectEmployees() {
		List<String> list = new LinkedList<String>();
		list.add("一太郎");
		list.add("次郎");
		list.add("三郎");
		return list;
	}
}
