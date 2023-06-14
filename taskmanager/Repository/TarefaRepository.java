package com.example.taskmanager.Repository;

import com.example.taskmanager.Entity.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TarefaRepository {
    List<Tarefa> tarefas = new ArrayList<>();


    public List<Tarefa> buscarTarefas() {
        return tarefas;
    }
    public Tarefa buscarTarefaPorId(Long id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Tarefa adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }
    public Tarefa deletarTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
        return tarefa;
    }
}
