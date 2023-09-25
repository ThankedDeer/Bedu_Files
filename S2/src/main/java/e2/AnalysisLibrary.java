package e2;

public class AnalysisLibrary {
    public void AnalysisInformation(String json) throws Exception{
        if (!validationJson(json)) {
            throw new Exception("La informacion no tiene formato json");
        }
        System.out.println("Prosesando la informacion.....");





    }
    public boolean validationJson(String data){
        return  true;
    }

}
