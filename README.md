# Simple Meds API

Este es un proyecto pequeño para entender cómo funcionan las APIs.
La lógica es simple: **Input (Síntoma) -> Output (Medicamento)**.

##💊 Cómo funciona
Haces una petición GET con un síntoma y la API te responde con un JSON.

**Ejemplo:**
* Input: "dolor de cabeza"
* Output:
```json
{
  "sintoma": "dolor de cabeza",
  "medicamento": "Ibuprofeno",
  "dosis_sugerida": "400mg"
}
