package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.TipoPago;
import org.example.proyecto_backend.services.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipopagos")
public class TipoPagoController {
    @Autowired
    private TipoPagoService tipoPagoService;

    @GetMapping
    public List<TipoPago> getAllTipoPagos() {
        return tipoPagoService.getAllTipoPagos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<TipoPago> getTipoPagoById(@PathVariable int id) {
        return tipoPagoService.getTipoPagoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public TipoPago createTipoPago(@RequestBody TipoPago tipoPago) {
        return tipoPagoService.createTipoPago(tipoPago);
    }
    @PutMapping("/{id}")
    public ResponseEntity<TipoPago> updateTipoPago(@PathVariable int id, @RequestBody TipoPago tipoPago) {
        TipoPago updatedTipoPago = tipoPagoService.updateTipoPago(id, tipoPago);
        if(updatedTipoPago != null) {
            return ResponseEntity.ok(updatedTipoPago);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoPago(@PathVariable int id) {
        tipoPagoService.deleteTipoPago(id);
        return ResponseEntity.noContent().build();
    }
}
