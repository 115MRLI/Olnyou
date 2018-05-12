package only.you.model.bean.gank;

import java.util.List;

/**
 * @name 拓展
 * @class name：only.you.model.bean.gank
 * @anthor 家佑
 * @time 2018/5/9
 */
public class Expand {

    /**
     * error : false
     * results : [{"_id":"5a96219b421aa9106fb5f460","createdAt":"2018-02-28T11:27:23.566Z","desc":"一个帮你轻松完成Api接口调试的IDEA插件","publishedAt":"2018-03-12T08:44:50.326Z","source":"web","type":"拓展资源","url":"https://github.com/fingerart/ApiDebugger","used":true,"who":"指尖上的艺术"},{"_id":"5a9c9261421aa9103fff20b0","createdAt":"2018-03-05T08:42:09.572Z","desc":"\u200bBlockchain 区块链-学习资源汇总","publishedAt":"2018-03-12T08:44:50.326Z","source":"chrome","type":"拓展资源","url":"https://news.zossin-tech.com/blockchain-qukuailian-xuexiziyuanhuizong/","used":true,"who":"daimajia"},{"_id":"5a72cffe421aa90d21aa1135","createdAt":"2018-02-01T16:29:50.735Z","desc":"nuster - 高性能 web 缓存服务器 v1.7.9.3发布","publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"拓展资源","url":"https://github.com/jiangwenyuan/nuster/releases/tag/v1.7.9.3","used":true,"who":null},{"_id":"5a5eedd6421aa91154899284","createdAt":"2018-01-17T14:31:50.245Z","desc":"2018年最受欢迎的编程挑战网站","publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"拓展资源","url":"https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247489312&idx=1&sn=e028fd71ad9b1c89fa12c9a90c0f7a4c","used":true,"who":"陈宇明"},{"_id":"5a6ad11d421aa911577aa7fe","createdAt":"2018-01-26T14:56:29.911Z","desc":"Love2.io 是一个全新的开源技术文档发布和分享平台，专注于提供用户更优雅的技术文档写作和阅读体验。","publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"拓展资源","url":"https://love2.io/","used":true,"who":null},{"_id":"5a28a661421aa90fef20358c","createdAt":"2017-12-07T10:24:33.438Z","desc":"程序员的鄙视链，你被鄙视了吗？","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"拓展资源","url":"https://mp.weixin.qq.com/s?__biz=MzU3NzA0ODQzMw==&mid=2247483747&idx=1&sn=d31acba906001a324ad9722da7eb5981","used":true,"who":"陈宇明"},{"_id":"5a4b230c421aa90fef2035de","createdAt":"2018-01-02T14:13:32.173Z","desc":" Python 详细教程","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"拓展资源","url":"https://www.readwithu.com/","used":true,"who":"两点水"},{"_id":"5a41e1ff421aa90fe72536e1","createdAt":"2017-12-26T13:45:35.622Z","desc":"最简单详细的草根学习 Python 教程","publishedAt":"2017-12-27T12:13:22.418Z","source":"web","type":"拓展资源","url":"https://github.com/TwoWater/Python","used":true,"who":"两点水"},{"_id":"5a274946421aa90fe2f02cb8","createdAt":"2017-12-06T09:35:02.292Z","desc":"九张图让你了解最神秘的团体\u2014\u2014程序员","publishedAt":"2017-12-11T08:43:39.682Z","source":"web","type":"拓展资源","url":"https://mp.weixin.qq.com/s?__biz=MzU3NzA0ODQzMw==&mid=2247483743&idx=1&sn=b9484e36e8712195cf35f152e0c575af","used":true,"who":"陈宇明"},{"_id":"5a20b0e8421aa90fe2f02ca0","createdAt":"2017-12-01T09:31:20.204Z","desc":"程序员的17种状态，你有过几种？","publishedAt":"2017-12-06T08:49:34.303Z","source":"web","type":"拓展资源","url":"https://mp.weixin.qq.com/s?__biz=MzU3NzA0ODQzMw==&mid=2247483684&idx=1&sn=7ad69e5f6934b8038b64d073596c144e","used":true,"who":"陈宇明"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5a96219b421aa9106fb5f460
         * createdAt : 2018-02-28T11:27:23.566Z
         * desc : 一个帮你轻松完成Api接口调试的IDEA插件
         * publishedAt : 2018-03-12T08:44:50.326Z
         * source : web
         * type : 拓展资源
         * url : https://github.com/fingerart/ApiDebugger
         * used : true
         * who : 指尖上的艺术
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
