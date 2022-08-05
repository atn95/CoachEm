import styles from './styles/App.module.css';
import { Routes, Route } from 'react-router-dom';
import { Home } from './pages/Home';
import { Login } from './pages/Login';
import { Nav } from './components/Nav';
import { useState } from 'react';
import { User } from './logic/types';
import { About } from './pages/About';
import { Register } from './pages/Register';

function App() {
	const [user, letUser] = useState<User | null>(null);

	return (
		<div className={styles.container}>
			<Nav />
			<Routes>
				{user ? (
					<>
						<Route path='/' element={<Home />} />
						<Route path='/about' element={<About />} />
					</>
				) : (
					<>
						<Route path='/register' element={<Register />} />
						<Route path='/*' element={<Login />} /> <Route />
					</>
				)}
			</Routes>
			<div className={styles['profile']}>Profile Bar</div>
		</div>
	);
}

export default App;
