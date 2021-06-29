import static org.lwjgl.opengl.GL33.*;

public class Shader {
    private final int programID;
    private final int vertexShaderID;
    private final int fragmentShaderID;

    public Shader(String vertexShaderPath, String fragmentShaderPath){
        programID = glCreateProgram();

    }
}
