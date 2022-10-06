package com.example.slip28q2;

    public class Details {
        String roll_no;
        String name;
        String email;
        String contact;
        String gender;
        String std;

        public Details(String roll_no,String name,String email,String contact,String gender,String std){
            this.roll_no=roll_no;
            this.name=name;
            this.email=email;
            this.contact=contact;
            this.gender=gender;
            this.std=std;
        }

        public String getRoll_no(){
            return this.roll_no;
        }
        public void setRoll_no(String roll_no){
            this.roll_no=roll_no;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getEmail(){
            return this.email;
        }
        public void setEmail(String email){
            this.email=email;
        }
        public String getContact(){
            return this.contact;
        }
        public void setContact(String contact){
            this.contact=contact;
        }
        public String getGender(){
            return this.gender;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public String getStd(){
            return this.std;
        }
        public void setStd(String std){
            this.std=std;
        }
    }


