import styles from '../styles/components/Login.module.css';
import { Link } from 'react-router-dom';
import { LoginFormProps } from '../datatype/types';

export const LoginForm = ({ formValue, handleChange, handleSubmit }: LoginFormProps) => {
	return (
		<div>
			<form className={styles.form} onSubmit={handleSubmit}>
				<label className={styles.formItems} htmlFor='username'>
					Username
				</label>
				<input className={styles.formItems} value={formValue[0]} onChange={(e) => handleChange(e, 0)} type='text' placeholder='username' name='username' id='username' />
				<label className={styles.formItems} htmlFor='email'>
					Email
				</label>
				<input className={styles.formItems} value={formValue[1]} onChange={(e) => handleChange(e, 1)} type='email' placeholder='password' name='email' id='email' />
				<label className={styles.formItems} htmlFor='password'>
					Password
				</label>
				<input className={styles.formItems} value={formValue[2]} onChange={(e) => handleChange(e, 2)} type='password' placeholder='email@email.com' name='password' id='password' />
				<div className={styles.formItems}>
					<button className={styles.btn50} type='submit'>
						Login
					</button>
					<Link className={styles.btn50} to='/register'>
						<button className={styles.registerBtn}>Register</button>
					</Link>
				</div>
			</form>
		</div>
	);
};
