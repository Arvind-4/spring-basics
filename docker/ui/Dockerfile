FROM node:lts as builder

WORKDIR /app-ui
COPY ./ui .
RUN npm install && npm run build


FROM node:lts as runner

RUN npm i -g serve
COPY --from=builder /app-ui/dist /app-ui/build
CMD ["serve", "-s", "/app-ui/build", "-l", "3000"]



