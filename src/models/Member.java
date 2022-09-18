package models;

import javafx.beans.property.SimpleStringProperty;

public class Member {
	SimpleStringProperty Name;
	SimpleStringProperty Surname;
	SimpleStringProperty Phone;
	SimpleStringProperty Email;
	SimpleStringProperty Action;
	
	public Member(String name, String surname, String phone,
			String email,String action) {
		Name = new SimpleStringProperty(name);
		Surname = new SimpleStringProperty(surname);
		Phone = new SimpleStringProperty(phone);
		Email = new SimpleStringProperty(email);
		Action = new SimpleStringProperty(action);
	}

	public final SimpleStringProperty NameProperty() {
		return this.Name;
	}
	
	public final String getName() {
		return this.NameProperty().get();
	}
	
	public final void setName(final String Name) {
		this.NameProperty().set(Name);
	}
	
	public final SimpleStringProperty SurnameProperty() {
		return this.Surname;
	}
	
	public final String getSurname() {
		return this.SurnameProperty().get();
	}
	
	public final void setSurname(final String Surname) {
		this.SurnameProperty().set(Surname);
	}
	
	public final SimpleStringProperty PhoneProperty() {
		return this.Phone;
	}
	
	public final String getPhone() {
		return this.PhoneProperty().get();
	}
	
	public final void setPhone(final String Phone) {
		this.PhoneProperty().set(Phone);
	}
	
	public final SimpleStringProperty EmailProperty() {
		return this.Email;
	}
	
	public final String getEmail() {
		return this.EmailProperty().get();
	}
	
	public final void setEmail(final String Email) {
		this.EmailProperty().set(Email);
	}

	public final SimpleStringProperty ActionProperty() {
		return this.Action;
	}
	
	public final String getAction() {
		return this.ActionProperty().get();
	}
	
	public final void setAction(final String Action) {
		this.ActionProperty().set(Action);
	}
}
