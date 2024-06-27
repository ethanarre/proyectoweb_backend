package org.example.proyecto_backend.services;

import org.example.proyecto_backend.entities.TipoPago;
import org.example.proyecto_backend.repositories.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPagoService {
    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    public List<TipoPago> getAllTipoPagos() {
        return tipoPagoRepository.findAll();
    }
    public Optional<TipoPago> getTipoPagoById(int id) {
        return tipoPagoRepository.findById(id);
    }
    public TipoPago createTipoPago(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }
    public TipoPago updateTipoPago(int id, TipoPago tipoPago) {
        if(tipoPagoRepository.existsById(id)) {
            tipoPago.setId(id);
            return tipoPagoRepository.save(tipoPago);
        }
        return null;
    }
    public void deleteTipoPago(int id) {
        tipoPagoRepository.deleteById(id);
    }
}
