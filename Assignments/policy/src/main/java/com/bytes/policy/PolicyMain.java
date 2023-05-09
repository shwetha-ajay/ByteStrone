package com.bytes.policy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class PolicyMain {
	public static void main(String[] args) {
		
		Customer c1=new Customer(101,"Arun","arun43@gmail.com",788945675,"mg nagar,tvm");
		Customer c2=new Customer(102,"Maya","maya33@gmail.com",795625445,"cp street,pkd");
		Customer c3=new Customer(103,"Sudha","sudha22@gmail.com",899655613,"anna nagar,knr");
		Customer c4=new Customer(104,"Roy","roy67@gmail.com",948563255,"RM street,Cochin");
		Customer c5=new Customer(105,"Zara","zara66@gmail.com",875425245,"ss nagar,pkd");
		
		Claims claim1=new Claims(301,"P102",LocalDate.of(2023,05, 12),"claimed",25000);
		Claims claim2=new Claims(302,"P103",LocalDate.of(2023,05, 14),"claimed",50000);
		Claims claim3=new Claims(303,"P101",LocalDate.of(2023,05, 25),"claimed",45000);
		Claims claim4=new Claims(304,"P102",LocalDate.of(2023,05, 26),"claimed",30000);
		Claims claim5=new Claims(305,"P104",LocalDate.of(2023,06, 27),"claimed",35000);
		
		
		
		Policy p1=new Policy("P101","Life insurance policy","active",LocalDate.of(2023, 04, 23),LocalDate.of(2024, 05, 13),102,Arrays.asList(claim1,claim2));
		Policy p2=new Policy("P102","Health policy","active",LocalDate.of(2023, 02, 23),LocalDate.of(2024, 05, 24),101,Arrays.asList(claim3,claim4,claim2));
		Policy p3=new Policy("P103","education policy","inactive",LocalDate.of(2023, 05, 04),LocalDate.of(2024, 05, 13),103,Arrays.asList(claim1,claim3));
		Policy p4=new Policy("P104","vehicle policy","active",LocalDate.of(2023, 05, 26),LocalDate.of(2024, 11, 12),104,Arrays.asList(claim2,claim4,claim1));
		Policy p5=new Policy("P105","home policy","active",LocalDate.of(2023, 05, 27),LocalDate.of(2024, 11, 11),105,Arrays.asList(claim1,claim4));
		
		
		PolicyHolder pH1=new PolicyHolder("PH11","Maya","maya33@gmail.com",795625445,101,"mg nagar,tvm");
		PolicyHolder pH2=new PolicyHolder("PH12","Riya","riya45@gmail.com",954752245,102,"cp street,pkd");
		PolicyHolder pH3=new PolicyHolder("PH13","Sudha","sudha22@gmail.com",899655613,104,"RM street,Cochin");
		PolicyHolder pH4=new PolicyHolder("PH14","Roy","roy67@gmail.com",948563255,105,"ss nagar,pkd");
		PolicyHolder pH5=new PolicyHolder("PH15","Zara","zara66@gmail.com",875425245,103,"anna nagar,knr");
		
		
		List<Policy> policies=new ArrayList();
		policies.add(p1);
		policies.add(p2);
		policies.add(p3);
		policies.add(p4);
		policies.add(p5);
		
		List<Customer> customers=new ArrayList();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		
		List<PolicyHolder> policyholders=new ArrayList();
		policyholders.add(pH1);
		policyholders.add(pH2);
		policyholders.add(pH3);
		policyholders.add(pH4);
		policyholders.add(pH5);
		
		List<Claims> claims=new ArrayList();
		claims.add(claim1);
		claims.add(claim2);
		claims.add(claim3);
		claims.add(claim4);
		claims.add(claim5);
		
		

		
//		Map<String, Integer> policyClaimCounts = policies.stream()
//                .collect(Collectors.toMap(
//                   
//                    policy -> policy.getClaims().size(),
//                   ));

		
		
		// find the average amount of all active policies
		
		Double avgAmt=policies.stream().filter(a->a.getStatus().equals("active")).

				flatMap(b->b.claims.stream()).mapToDouble(amount->amount.getAmount()).average().orElse(0.0);

				System.out.println("average amount is:" +avgAmt);
				
				
				
			
				//	find the Policy entity with the highest premium amount
		Optional<Policy> maxPolicy = policies.stream()
				        .max(Comparator.comparingDouble(Claims::getAmount));
				
				
	  // find the total number of claims made against each policy
				
				
				Long noOfClaims = policies.stream()
					.filter(claim -> claim.getClaims()
					.count().collect(Collectors.toList());
				System.out.println("Number of claims against each policy: " + noOfClaims);
				
				
	  //find the Policy entity with the highest number of claims made against it
				
		Optional<Policy> policyWithMostClaims = policies.stream()
				        .max(Comparator.comparingInt(policy -> policy.getClaims().size()));
				
				

			}
	}


