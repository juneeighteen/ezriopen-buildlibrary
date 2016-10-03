package com.ezricloud;

class BuildStamp {
   Date ts;

   def stamp() {
      this.ts = new Date();
      println this.ts;
   }
}
