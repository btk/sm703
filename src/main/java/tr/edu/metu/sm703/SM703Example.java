package tr.edu.metu.sm703;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

import static java.util.Objects.isNull;

public class SM703Example implements RequestHandler<Map<String, Integer>, String> {

    public boolean checkEquals(Integer o1, Integer o2){
        if (isNull(o1))
            return false; // we assume null's are not equal
        return o1.equals(o2);
    }

    @Override
    public String handleRequest(Map<String,Integer> input, Context context) {
        return "Response is:" + Boolean.toString(checkEquals(input.get("o1"), input.get("o2")));
    }
}
