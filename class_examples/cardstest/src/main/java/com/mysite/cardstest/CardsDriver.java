package com.mysite.cardstest;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.mapreduce.lib.reduce.IntSumReducer;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class CardsDriver  extends Configured implements Tool{

	public static void main(String[] args) throws Exception {
		int exit= ToolRunner.run(new CardsDriver(), args);
		
		System.exit(exit);

	}

	public int run(String[] arg0) throws Exception {
		Job job= Job.getInstance(getConf(), "FirstJob");
		job.setJarByClass(getClass()); //during jar submission to search classes.
		
		TextInputFormat.addInputPath(job, new Path(arg0[0]));
		TextOutputFormat.setOutputPath(job, new Path(arg0[1]));
		
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setMapperClass(CardsMapper.class);
		job.setReducerClass(IntSumReducer.class);
		
		//job.setMapOutputKeyClass(Text.class);
		//job.setOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		return job.waitForCompletion(true) ? 0 :1;
	}

}
