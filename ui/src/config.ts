let baseUrl: string;

let env = process.env.NODE_ENV;

if (env === 'development') {
  baseUrl = 'http://localhost:8080/api';
} else {
  baseUrl = 'http://0.0.0.0/api';
}

export default {
  baseUrl,
  env,
};
