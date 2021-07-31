package com.bilgeadam.bilgeadamproject;



import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.    util.List;
import com.bilgeadam.bilgeadamproject.GetData;
import com.bilgeadam.bilgeadamproject.Employees;

@Service
@Transactional
public class EmployeeService {
    private final GetData getData;
    public EmployeeService(GetData getData) {
        this.getData = getData;
    }
    public List<Employees> showAllData(){
        List<Employees> employees = new ArrayList<>();
        for (Employees employee : getData.findAll()){
            employees.add(employee);
        }
        return employees;
    }
}
