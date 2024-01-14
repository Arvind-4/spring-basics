import { createBrowserRouter } from 'react-router-dom';
import App from './App.tsx';

const router = createBrowserRouter([
  {
    path: '/',
    element: <App />,
  },
  {
    path: '/about',
    element: <div>About Me</div>,
  },
]);

export default router;
