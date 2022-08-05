import styles from './styles/App.module.css';
import { Routes, Route } from 'react-router-dom';
import { Home } from './pages/Home';
import { Login } from './pages/Login';
import { Nav } from './components/Nav';
import { useState } from 'react';
import { User } from './logic/types';
import { About } from './pages/About';
import { Register } from './pages/Register';
import { Settings } from './pages/Settings';
import { setSourceMapRange } from 'typescript';

function App() {
	const [user, setUser] = useState<User | null>({
		//faking a login
		id: 1,
		username: '',
		email: '',
	});

	const logout = () => {
		setUser(null);
	};

	return (
		<div className={styles.container}>
			<Nav logout={logout} />
			<Routes>
				{user ? (
					<>
						<Route path='/' element={<Home />} />
						<Route path='/about' element={<About />} />
						<Route path='/settings' element={<Settings />} />
					</>
				) : (
					<>
						<Route path='/register' element={<Register />} />
						<Route path='/*' element={<Login />} /> <Route />
					</>
				)}
			</Routes>
			{user ? <div className={styles['profile']}>Profile Bar</div> : <></>}
		</div>
	);
}

export default App;
