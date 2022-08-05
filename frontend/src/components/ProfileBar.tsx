import styles from '../styles/components/ProfileBar.module.css';
export const ProfileBar = () => {
	return (
		<div className={styles['container']}>
			<img className={styles['profile']} src='https://avatars.githubusercontent.com/u/17553205?v=4' />
			<p>{'jtran30'}</p>
			<br />
			<p>Calendar</p>
		</div>
	);
};
