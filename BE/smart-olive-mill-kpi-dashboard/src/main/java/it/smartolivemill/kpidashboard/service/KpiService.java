package it.smartolivemill.kpidashboard.service;

import it.smartolivemill.kpidashboard.model.Kpi;
import it.smartolivemill.kpidashboard.repository.KpiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Gestisce le operazioni sui KPI già registrati, senza calcolarli.
@Service
public class KpiService {

    private final KpiRepository kpiRepository;

    public KpiService(KpiRepository kpiRepository) {
        this.kpiRepository = kpiRepository;
    }

    public List<Kpi> findAll() {
        return kpiRepository.findAll();
    }

    public Optional<Kpi> findById(Long id) {
        return kpiRepository.findById(id);
    }

    public Kpi save(Kpi kpi) {
        return kpiRepository.save(kpi);
    }

    public void delete(Long id) {
        kpiRepository.deleteById(id);
    }
}
