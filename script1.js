/*
let s ;
s= "hello World";
console.log(s.length);
console.log(s.split(" "));
console.log(s.toUpperCase());
let n;
n=10;
console.log(typeof n);
let isCool=true;
console.log(typeof isCool);
console.log(s.substring(0,5).toUpperCase());
//Arrays
//if we use const we can manipulate or add but not reassign it
const numbers=new Array(1,2,3,4,5);
console.log(numbers);
const fruits=["apples","oranges","pears"];
console.log(fruits);
console.log(fruits[1]);
fruits[3]="grapes";
//when u do not know the length of array
fruits.push("mangoes");
fruits.unshift("strawberries");
console.log(fruits);
console.log(fruits.indexOf("oranges"));
//object new feature(address: {class})in js:40
const person ={
	firstName:"John",
	lastName:"Doe",
	age:30,
	hobbies:["music","movies","sports"],
	address:{
		street :"50th main street",
		class  :"boston",
		state  : "MA"
	}
}
console.log(person.firstName);
console.log(person.hobbies[1]);
console.log(person.address.class);
const{ firstName,lastName} = person;//we are only pulling out values over here not assigning the object person 
console.log(`My name is ${firstName} ${lastName} `);
//back is before 1
person.email="john@gmail.com";
console.log(person);
console.warn("This ia a warning");
console.error("This is an error");
//arrays of object
const todos=[
	{
     id :1,
     text :"You have to attend a meeting",
     isCompleted :true
	},
	{
	 id : 2,
     text :"You have to attend a party",
     isCompleted : false	
	},
	{
	 id : 3,
     text :"You have to attend a board meeting",
     isCompleted : false
	}
];
for(let todo of todos){
	console.log(todo.text);
};
//converting into Json
const todoJSON=JSON.stringify(todos);
console.log(todoJSON);
console.log(todos[2].text);
//using higher order methods
//forEach
todos.forEach(function(todo){
   console.log(todo.text);
	});
//map
const todotext=todos.map(function(todo){
	return todo.text;
});
console.log(todotext);
//combining map and filter
const todoisCompleted =todos.filter(function(todo){
 return	todo.isCompleted===false;
}).map(function(todoisCompleted){
return todoisCompleted.text;
});
console.log(todoisCompleted);
//Difference between === and ==
let a="10";
if(a==10){
	console.log("The value of the variable is 10");
}
if(a===10)
{
}else{
	console.log("This is a string not a number");
}
//=== is for data type and equals == is only for equals
//creating user defined function
function addNum(num1=1,num2=1){
console.log(num1+num2);
}
addNum(5,4);
//#1
function addNums(num1=1,num2=2){
	return num1+num2;
}
console.log(addNums(5,4));
//#2(arrow function)
const addNumbs = (num1=1,num2=1) =>{
	return num1+num2;
}
console.log(addNumbs(5,3));
//aliter
const addNumbs1 =(num1=1,num2=2)=>num1+num2
console.log(addNumbs1(5,3));

//constructor function
function Person(firstName,lastName,dob){
	this.firstName=firstName;
	this.lastName=lastName;
	this.dob=new Date(dob);
}
Person.prototype.getFullname=function(){
	return `${firstName} ${lastName}`;
}
Person.prototype.getBirthyear=function(){
	return this.dob.getFullYear();
}

const person1=new Person("john","doe",'4-4-1980');
const person2=new Person("joe","mary",'6-6-1970');
console.log(person2.getBirthyear());
*/
//class
class Person{
constructor(firstName,lastName,dob){
	this.firstName=firstName;
	this.lastName=lastName;
	this.dob=new Date(dob);
}
getFullName(){
	return `${this.firstName} ${this.lastName}`;
}
getBirthyear(){
    return this.dob.getFullYear();	
}
}
const person1=new Person("john","doe",'4-4-1980');
const person2=new Person("joe","mary",'6-6-1970');
console.log(person1);
console.log(person2.getFullName());





