class Badge {
    public String print(Integer id, String name, String department) {
        String client = "";
        
        if(department == null && id == null) {
            client = name + " - OWNER" ;
        } else if(id == null) {
            client = name + " - " + department.toUpperCase();
        } else if(department == null){
            client = "[" + id + "] - " + name + " - OWNER" ;
        } else {
        client = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
        
        return client;
    }
}
