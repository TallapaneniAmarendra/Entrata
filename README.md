# Entrata
Entrata

In this project write  tests cases on automating the website of entrata.com on using selenium tool and using language of java with Testng framework.
 could include scenarios such as navigating through different pages, interacting with forms (without submitting them), verifying dynamic content, or any other interesting feature


## Roadmap

-First Install Eclipse IDE
-create a maven project its give by default pom.xml and add dependicies using mvn repository selenium java ,testng dependencies
-write the test cases using the website of Entrata.com
-could include scenarios such as navigating through different pages, interacting with forms (without submitting them), verifying dynamic content, or any other interesting feature.

 

-


## Installation

Install my-project with npm

```bash
  
  Eclipse IDE
  selenium webdriver
  Testng

  
```
    
## Authors

- [@octokatherine](https://www.github.com/octokatherine)


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY`

`ANOTHER_API_KEY`


## Run Locally

Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run start
```


## Running Tests

To run tests, run the following command

```bash
  Run as Testng
```


## Features

- Light/dark mode toggle
- Live previews
- Fullscreen mode
- Cross platform

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |


## Deployment

To deploy this project run

```bash
  npm run deploy
```


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.
