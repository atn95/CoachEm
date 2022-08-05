import styles from '../styles/components/Nav.module.css';

export function getLinkClassName(isActive: boolean): string {
	if (isActive) {
		return [styles['link'], styles['active']].join(' ');
	}
	return [styles['link']].join('');
}
