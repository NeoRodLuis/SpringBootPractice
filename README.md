# API REST de Spring Boot

Este proyecto es una aplicación de Spring Boot que proporciona varios servicios web RESTful. A continuación se describen los endpoints disponibles.

## Controlador de Catálogo

URL base: `/api/catalogo`

- `GET /api/catalogo/`
  - Recupera una lista de elementos del catálogo.
- `GET /api/catalogo/{id}`
  - Recupera un elemento específico del catálogo por su ID.

## Controlador de Encriptación

URL base: `/api/encryption`

- `POST /api/encryption/encrypt`
  - Encripta los datos proporcionados.

## Controlador de Pokémon

URL base: `/api/pokemon`

- `GET /api/pokemon/ditto`
  - Recupera información sobre el Pokémon Ditto.
