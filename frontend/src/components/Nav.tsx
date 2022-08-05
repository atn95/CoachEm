import { NavLink } from 'react-router-dom';
import styles from '../styles/components/Nav.module.css';
import { getLinkClassName } from '../logic/navLogic';

export const Nav = () => {
	return (
		<div className={styles.container}>
			<div className={styles['link-container']}>
				<NavLink className={({ isActive }) => getLinkClassName(isActive)} to='/'>
					Home
				</NavLink>
				<NavLink className={({ isActive }) => getLinkClassName(isActive)} to='/about'>
					About
				</NavLink>
			</div>
			<div>
				<NavLink className={({ isActive }) => getLinkClassName(isActive)} to='/settings'>
					Settings
				</NavLink>
			</div>
		</div>
	);
};
