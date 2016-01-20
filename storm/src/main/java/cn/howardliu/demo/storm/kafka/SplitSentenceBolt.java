package cn.howardliu.demo.storm.kafka;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

import java.util.Arrays;

/**
 * <br/>create at 16-1-19
 *
 * @author liuxh
 * @since 1.0.0
 */
public class SplitSentenceBolt extends BaseBasicBolt {
    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("word"));
    }

    @Override
    public void execute(Tuple input, BasicOutputCollector collector) {
        String sentence = input.getStringByField("msg");
        String[] words = sentence.split(" ");
        Arrays.asList(words).forEach(word -> collector.emit(new Values(word)));
    }
}
