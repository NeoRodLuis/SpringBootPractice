
# Spring Boot REST API

This project is a Spring Boot application that provides various RESTful web services. Below are the available endpoints.

## Catalogo Controller

Base URL: `/api/catalogo`

- `GET /api/catalogo/`
  - Retrieves a list of catalog items.
- `GET /api/catalogo/{id}`
  - Retrieves a specific catalog item by ID.

## Encryption Controller

Base URL: `/api/encryption`

- `POST /api/encryption/encrypt`
  - Encrypts the given data.
- `POST /api/encryption/decrypt`
  - Decrypts the given data.

## Pokemon Controller

Base URL: `/api/pokemon`

- `GET /api/pokemon/ditto`
  - Retrieves information about the Pokémon Ditto.
