package pl.sdacademy.unit.test.advance.exercises.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AnimalServiceTest {
    private final static Animal ANIMAL = new Animal(1L, "cat", "Filemon");

    @Mock
    private AnimalRepository animalRepository;

    @InjectMocks
    private AnimalService animalService;

    @Test
    void shouldThrowExceptionWhenAnimalDoesNotExist() {
        //given
        when(animalRepository.findById(anyLong())).thenReturn(Optional.empty());
        //when & then
        assertThatThrownBy(() -> animalService.getById(100L))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Animal does not exist with id: 100");
    }

    @Test
    void shouldGetAnimalById() {
        //given
        when(animalRepository.findById(anyLong())).thenReturn(Optional.of(ANIMAL));
        //when
        Animal result = animalService.getById(1L);
        //then
        assertThat(result).isEqualTo(ANIMAL);
    }
}