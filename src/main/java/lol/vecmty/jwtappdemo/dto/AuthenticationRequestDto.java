package lol.vecmty.jwtappdemo.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 * @author
 * @version 1.0
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
