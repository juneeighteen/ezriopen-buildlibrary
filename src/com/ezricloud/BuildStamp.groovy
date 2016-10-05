/* package com.ezricloud;

class BuildStamp {
   Date ts;

   def stamp() {
      this.ts = new Date();
      println this.ts;
   }
} */

// vars/helloWorld.groovy
def call(name) {
    // you can call any valid step functions from your code, just like you can from Pipeline scripts
    echo "Hello world, ${name}"
}
