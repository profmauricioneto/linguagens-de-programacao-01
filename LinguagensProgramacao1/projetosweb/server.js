const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');

// Configurando o body parser para pegar/converter POSTS
const app = express();
const port = process.env.PORT || 3000; // porta padrão

// convertendo os valores das requisições
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Configurando o servidor para usar arquivos estáticos
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'ç/aulas_html/aula7.html'));
});

app.post('/result', (req, res) => {
    res.status(200).send(req.body);
});

app.listen(port, (error) => {
    if (error) {
        console.log(error);
    }
    console.log(`Server started at localhost in port ${port}`);
});