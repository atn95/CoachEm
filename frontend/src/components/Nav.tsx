import { Link } from 'react-router-dom';
import styles from '../styles/components/Nav.module.css';

export const Nav = () => {
	return (
		<div className={styles.container}>
			<Link className={styles.link} to='/'>
				Home
			</Link>
			<Link className={styles.link} to='/about'>
				About
			</Link>
		</div>
	);
};
