// Importar rutas
const sensorRoutes = require('./routes/sensorRoutes');
app.use('/api/sensores', sensorRoutes);
// Escuchar el puerto
app.listen(port, () => {
 console.log(`Server is running on port ${port}`);
});
const express = require('express');
const router = express.Router();
const Sensor = require('../models/Sensor');
// Obtener todos los sensores
router.get('/', async (req, res) => {
 try {
 const sensores = await Sensor.find();
 res.json(sensores);
 } catch (err) {
 res.status(500).json({ message: err.message });
 }
});
// Agregar un nuevo sensor
router.post ('/', async (req, res) => {
 const sensor = new Sensor ({
 nombre: req.body.nombre,
 ubicacion: req.body.ubicacion,
 ultimaLectura: req.body.ultimaLectura,
 });
 try {
 const nuevoSensor = await sensor.save();
 res.status(201).json(nuevoSensor);
 } catch (err) {
 res.status(400).json({ message: err.message });
 }
});
