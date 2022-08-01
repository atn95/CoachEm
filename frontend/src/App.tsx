import './App.css';
import { Routes, Route } from 'react-router-dom';
import { Home } from './pages/Home';
import { Nav } from './components/Nav';

function App() {
	return (
		<div className='App'>
			<Nav />
			<br />
			<br />
			<br />
			<Routes>
				<Route path='/' element={<Home />} />
			</Routes>
		</div>
	);
}

export default App;
