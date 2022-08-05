import { LoginForm } from '../components/LoginForm';
import styles from '../styles/components/Login.module.css';
import React, { useState } from 'react';
import { FormValue } from '../logic/types';
export const Login = () => {
	//[username, password, email]
	const [formValue, setFormValue] = useState<FormValue>([``, ``, ``]);

	function handleFormInputChange(e: React.FormEvent<HTMLInputElement>, index: number): void {
		let tempFormValues: FormValue = [...formValue];
		tempFormValues[index] = e.currentTarget.value;
		console.log(tempFormValues);
		setFormValue(tempFormValues);
	}

	function handleLogin(e: React.SyntheticEvent) {
		e.preventDefault();
		//HandleLogin
	}

	return (
		<div className={styles.container}>
			<LoginForm formValue={formValue} handleChange={handleFormInputChange} handleSubmit={handleLogin} />
		</div>
	);
};
