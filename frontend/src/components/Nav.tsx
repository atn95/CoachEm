import { NavLink } from 'react-router-dom';
import styles from '../styles/components/Nav.module.css';
import { getLinkClassName } from '../logic/navLogic';

export const Nav = ({ logout }: { logout: React.MouseEventHandler<HTMLDivElement> }) => {
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
			<div className={styles['link-container']}>
				<div className={styles['link']} onClick={logout}>
					Logout
				</div>
				<NavLink className={({ isActive }) => getLinkClassName(isActive)} to='/settings'>
					Settings
				</NavLink>
			</div>
		</div>
	);
};
