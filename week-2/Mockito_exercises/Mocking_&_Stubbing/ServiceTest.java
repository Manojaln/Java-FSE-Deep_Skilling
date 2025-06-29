import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {
	@Test
    void testExternalApi() {
        // Arrange: create mock and stub behaviour
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);

        // (Optional) Verify the mock was called once
        verify(mockApi, times(1)).getData();
    }
}
