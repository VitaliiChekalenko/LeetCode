class Solution {
    public String defangIPaddr(String address) {
        String[] temp = address.split("");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].equals(".")){
                temp[i]= "["+temp[i]+"]";
            }
        }
        System.gc();
        return String.join("", temp);
        }
}