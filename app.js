const express = require('express');
const app = express();
app.get('/', (req, res) => {
  res.json([
    {
      id: '1',
      title: 'Book 1: The Bear & The Nightingale',
    },
    {
      id: '2',
      title: 'Book 2: Pokemon Brilliant Diamond',
    },
    {
      id: '3',
      title: 'Book 3: Alice in Borderland',
    },
    {
      id: '4',
      title: 'Book 4: The Name of the Wind',
    },
    {
      id: '5',
      title: 'Book 5: Lord of the Ring',
    },
    {
      id: '6',
      title: 'Book Review: The Night Circus',
    }
  ]);
});

module.exports = app;
