package employee.importance;

import java.util.*;

//problem link : https://leetcode.com/problems/employee-importance/
public class GetEmployeeImportance {

    public int getImportance(List<Employee> employees, int id) {
        int sum =0;
        Map<Integer, Employee> empMap = new HashMap();
        for(Employee e : employees){
            empMap.put(e.id, e);
        }
        Employee  employee= empMap.get(id);
        List<Integer> subordinates = employee.subordinates;
        Queue<Employee> q = new LinkedList();
        q.offer(employee);
        while(!q.isEmpty()){
            Employee currEmpl = q.poll();
            sum = sum+currEmpl.importance;
            for(Integer id1: currEmpl.subordinates){
                q.offer(empMap.get(id1));
            }
        }
        return sum;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

}
