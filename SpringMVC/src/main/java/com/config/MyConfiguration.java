package com.config;

public class MyConfiguration {

   private String environmentName;
   private int portNumber;

   public MyConfiguration() {
   }

   public MyConfiguration(String environmentName, int portNumber) {
      this.environmentName = environmentName;
      this.portNumber = portNumber;
   }

   public String getEnvironmentName() {
      return environmentName;
   }

   public void setEnvironmentName(String environmentName) {
      this.environmentName = environmentName;
   }

   public int getPortNumber() {
      return portNumber;
   }

   public void setPortNumber(int portNumber) {
      this.portNumber = portNumber;
   }
}
