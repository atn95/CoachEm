import React from 'react';

export type User = {
	id: string;
	username: string;
	email: string;
};

export type LoginFormProps = {
	formValue: FormValue;
	handleChange: handleChange;
	handleSubmit: handleSubmit;
};

//[username, password, email]
export type FormValue = [string, string, string];

export type handleChange = (...args: any) => void;
export type handleSubmit = (event: React.SyntheticEvent) => void;
