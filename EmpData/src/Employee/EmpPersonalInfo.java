package Employee;

public class EmpPersonalInfo 
{

		private	String EName,EmailId,ResAddr; //  'default'
		private int MobileNo;

		
	    public String getEname() {
			return EName;
		}

		public void setEname(String ename) {
			this.EName = ename;
		}

		public String EmailId() {
			return EmailId;
		}

		public void setEmailId(String emailId) {
			this.EmailId = emailId;
		}

		public String getResaddr() {
			return ResAddr;
		}

		public void setResaddr(String resaddr) {
			this.ResAddr = resaddr;
		}

		public int getMobileno() {
			return MobileNo;
		}

		public void setMobileno(int mobileno) {
			this.MobileNo = mobileno;
		}

		@Override
		public String toString() {
			return "\n1]EmpPersonalInfo [EName=" + EName + ", Email Id=" + EmailId + ", Resident Address =" + ResAddr + ", Mobile No=" + MobileNo + "]";
		}
}