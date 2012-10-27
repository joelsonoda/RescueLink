package com.balihoo.rescuelink;

import com.balihoo.rescuelink.model.Guest;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.TextField;
import java.util.Arrays;
import org.joda.time.DateTime;
import org.vaadin.addon.vodatime.VodaDateField;

public class IntakeForm extends Form {

	public IntakeForm(BeanItem<Guest> guestItem) {
		setCaption("Emergency Shelter Guest Intake Form");

		CssLayout layout = new CssLayout();
		layout.setMargin(true, false, false, true);
		
		setLayout(layout);
		
		setWriteThrough(false);
		setInvalidCommitted(false);
		
		setFormFieldFactory(new GuestFieldFactory());
		setItemDataSource(guestItem);
		
		setVisibleItemProperties(Arrays.asList(new String[] {
			"firstName", "middleName", "lastName", "dob"
		}));
	}
	
	private class GuestFieldFactory extends DefaultFieldFactory {
		
		@Override
		public Field createField(Item item, Object propertyId, 
				Component uiContext) {
			
			Field field;
			Class<?> type = item.getItemProperty(propertyId).getType();
			if (type == null) {
				field = null;
			} else if (Item.class.isAssignableFrom(type)) {
				field = new Form();
			} else if (DateTime.class.isAssignableFrom(type)) {
				field = new VodaDateField();
			} else if (Boolean.class.isAssignableFrom(type)) {
				field = new CheckBox();
			} else {
				field = new TextField();
			}
			
			field.setCaption(createCaptionByPropertyId(propertyId));
			return field;
		}
	}
}
