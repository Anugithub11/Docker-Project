package com.amdocs.Docker;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dockerselenium {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.Google.com");
		dr.findElement(By.id("APjFqb")).sendKeys("Airtel recharge plans");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("/html/body/div[6]/div/div[13]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
		dr.findElement(By.xpath("//*[@id=\"buttonComponent\"]")).click();
		}




	}


