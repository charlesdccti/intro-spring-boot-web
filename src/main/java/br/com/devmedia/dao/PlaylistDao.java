package br.com.devmedia.dao;

import br.com.devmedia.domain.Playlist;

import java.util.List;

public interface PlaylistDao {

    /**
     * Salva uma playlist de musicas
     * @param playlist
     * @outor Charles Ferreira
     */
    void salvar(Playlist playlist);

    /**
     *
     * @return
     */
    List<Playlist> recuperar();

    /**
     *
     * @param id
     * @return
     */
    Playlist recuperarPorID(long id);

    /**
     *
     * @param playlist
     */
    void atualizar(Playlist playlist);

    /**
     *
     * @param id
     */
    void excluir(long id);

}