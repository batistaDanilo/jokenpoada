package tech.ada.games.jokenpo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RankingDto {

    private Long winnerId;
    private Long gameId;
}
