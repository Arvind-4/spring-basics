import { useEffect, useState } from 'react';
import './App.css';
import config from './config.ts';

function App() {
  const [data, setData] = useState([]);
  useEffect(() => {
    try {
      const fetchData = async () => {
        const result = await fetch(config.baseUrl + '/v1/todos');
        const data = await result.json();
        setData(data);
      };
      fetchData();
    } catch (e) {
      console.log(e);
    }
  }, []);

  const mode = process.env.NODE_ENV;
  console.log('Mode: ', mode);
  console.log('Base URL: ', config.baseUrl);
  console.log('Data: ', data);

  return (
    <div>
      <h1>Hello World</h1>
      <div>
        {(data &&
          data.map((item: any) => (
            <div key={item.title}>
              <p>{item.title}</p>
            </div>
          ))) || <p>No data</p>}
      </div>
    </div>
  );
}

export default App;
