import org.apache.spark.sql.SparkSession
import scala.collection.immutable._
import scala.collection.mutable.ListBuffer
import SparkSession._

case class Person(name: String, age: Int)
//object TechPrep extends App {

  //val numbers = List(1,2,3,4,5,6,7,8,9,10)
  //  val doubles = new ListBuffer[Integer]()
  //numbers.foreach(x => doubles.addOne(x * 2))
  //  print(doubles.toList)
//  val p1 = new Person("Eduar", 30)
//  val p2 = new Person("Evan", 18)
//
//
//  val spark = SparkSession.builder()
//    .master("local[*]")
//    .appName("TechPrep")
//    .getOrCreate()
//
//
//  import spark.implicits._
//
//  val people = List(p1, p2)
//  val dsPeople = spark.createDataset(people)
//  dsPeople.show()

  import org.apache.spark.{SparkConf, SparkContext}

  object TestJar {
    def main(args: Array[String]): Unit = {

      val conf = new SparkConf().setAppName("someName").setAppName("WordCount").setMaster("local")
      //create spark context object
      val sc = new SparkContext(conf)


      //Create RDD from parallelize
      val dataSeq = Seq(("Java", 20000), ("Python", 100000), ("Scala", 3000))
      val rdd = sc.parallelize(dataSeq)
      println(rdd.collect().foreach(print))
    }
  }