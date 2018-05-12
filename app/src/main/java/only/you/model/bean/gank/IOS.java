package only.you.model.bean.gank;

import java.util.List;

/**
 * @name Onlyou
 * @class name：only.you.model.bean.gank
 * @anthor 家佑
 * @time 2018/5/9
 */
public class IOS {

    /**
     * error : false
     * results : [{"_id":"5aa5b368421aa9103d719144","createdAt":"2018-03-12T06:53:28.854Z","desc":"iOS-APP内置调试工具(debugging-tool)","images":["http://img.gank.io/03fb5bd6-2004-4c5a-bfe8-a8efd0fe1f9c"],"publishedAt":"2018-03-12T08:44:50.326Z","source":"api","type":"iOS","url":"https://github.com/DotzuX/DotzuX","used":true,"who":"  李满"},{"_id":"5a72da28421aa90d24a065c0","createdAt":"2018-02-01T17:13:12.171Z","desc":"iOS 中效率极高的多 event 定时器，适用于复杂的轮询任务管理！","images":["http://img.gank.io/ac28f08b-1f5b-4f43-8fd6-dd350b6c5cda"],"publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"iOS","url":"https://github.com/CNKCQ/GlobalTimer.git","used":true,"who":"CNKCQ"},{"_id":"5a8a904d421aa91331a69d82","createdAt":"2018-02-19T16:52:29.771Z","desc":"GarlandView seamlessly transitions between multiple lists of content. Made by @Ramotion","images":["http://img.gank.io/87e49a0b-feb8-47b2-b731-d9fc3cd6f485"],"publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"iOS","url":"https://github.com/Ramotion/garland-view","used":true,"who":"Alex Mikhnev"},{"_id":"5a73f096421aa90d2cd3d7dd","createdAt":"2018-02-02T13:01:10.492Z","desc":"iOS 开发一定要尝试的 Texture(ASDK)","images":["http://img.gank.io/e66dcd01-211a-4343-81ee-6a5e84b09d16"],"publishedAt":"2018-02-08T08:13:24.479Z","source":"web","type":"iOS","url":"https://didee.cn/2018/01/29/iOS-ASDK/","used":true,"who":"SunDee"},{"_id":"5a740ce7421aa90d264d0ea1","createdAt":"2018-02-02T15:01:59.430Z","desc":"炫酷交互的第三方微博~~","publishedAt":"2018-02-08T08:13:24.479Z","source":"web","type":"iOS","url":"https://github.com/zhnnnnn/ZHNCosmos","used":true,"who":null},{"_id":"5a5dab55421aa9115696000a","createdAt":"2018-01-16T15:35:49.627Z","desc":"SCIndexView provide a index view like Wechat.","images":["http://img.gank.io/6d510bea-afd4-4489-ba42-d281783d7512"],"publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"iOS","url":"https://github.com/TalkingJourney/SCIndexView","used":true,"who":"自由流水"},{"_id":"5a5f088c421aa91154899285","createdAt":"2018-01-17T16:25:48.635Z","desc":"iOS 一个异步渲染TextKit开源库","images":["http://img.gank.io/977610b0-04b5-49b3-be65-00d76389dd6d"],"publishedAt":"2018-01-23T08:46:45.132Z","source":"web","type":"iOS","url":"https://github.com/12207480/TYText","used":true,"who":"yeBlueColor"},{"_id":"5a60068f421aa91154899288","createdAt":"2018-01-18T10:29:35.552Z","desc":"基于protocol的iOS模块路由和依赖注入框架","images":["http://img.gank.io/08c2da4a-795c-48d7-b470-8ffe5dbd86c4"],"publishedAt":"2018-01-23T08:46:45.132Z","source":"web","type":"iOS","url":"https://github.com/Zuikyo/ZIKRouter","used":true,"who":"Zuik"},{"_id":"576e5468421aa931d70b5f52","createdAt":"2016-06-25T17:52:40.885Z","desc":"iOS应用架构谈 view层的组织和调用方案 - Casa Taloyum","publishedAt":"2018-01-16T08:40:08.101Z","source":"api","type":"iOS","url":"http://casatwy.com/iosying-yong-jia-gou-tan-viewceng-de-zu-zhi-he-diao-yong-fang-an.html","used":true,"who":"tripleCC"},{"_id":"576e5480421aa931d70b5f53","createdAt":"2016-06-25T17:53:04.181Z","desc":"iOS应用架构谈 网络层设计方案 - Casa Taloyum","publishedAt":"2018-01-16T08:40:08.101Z","source":"api","type":"iOS","url":"http://casatwy.com/iosying-yong-jia-gou-tan-wang-luo-ceng-she-ji-fang-an.html","used":true,"who":"tripleCC"}]
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
         * _id : 5aa5b368421aa9103d719144
         * createdAt : 2018-03-12T06:53:28.854Z
         * desc : iOS-APP内置调试工具(debugging-tool)
         * images : ["http://img.gank.io/03fb5bd6-2004-4c5a-bfe8-a8efd0fe1f9c"]
         * publishedAt : 2018-03-12T08:44:50.326Z
         * source : api
         * type : iOS
         * url : https://github.com/DotzuX/DotzuX
         * used : true
         * who :   李满
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
        private List<String> images;

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

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
