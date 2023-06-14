package com.example.taskmanager.Entity;

import com.example.taskmanager.Entity.Enum.Status;
import com.example.taskmanager.Entity.Enum.Prioridade;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeVencimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private LocalDateTime dataDeCriacao;
    private LocalDateTime dataDeFinalizacao;

}
