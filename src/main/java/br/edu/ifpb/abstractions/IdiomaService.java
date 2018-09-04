package br.edu.ifpb.abstractions;

import br.edu.ifpb.domain.Idioma;
import java.util.List;

public interface IdiomaService {
    
    public void save(Idioma idioma);
    
    public void save(List<String> idiomas);
    
}