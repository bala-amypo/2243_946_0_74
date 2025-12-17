public class StudentController {

@Autowired
StudentService ser;

@PostMapping("/adddata")
public Student createData(@RequestBody Student stu){
return ser.createData(stu);

@GetMapping("/fetche")
public List<Student> fetchRecord(){
return ser.fetchRecord();

@GetMapping("/fetchdatabyid/{id}")
public Optional<Student> fetchDataById(@PathVariable int id){
return ser.fetchDataById(id);
}