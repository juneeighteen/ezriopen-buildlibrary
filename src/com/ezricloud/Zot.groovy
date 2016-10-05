// src/org/foo/Zot.groovy
package com.ezricloud;

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}
