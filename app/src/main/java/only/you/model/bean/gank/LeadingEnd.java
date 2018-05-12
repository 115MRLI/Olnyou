package only.you.model.bean.gank;

import java.util.List;

/**
 * @name 前端
 * @class name：only.you.model.bean.gank
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/9
 */
public class LeadingEnd {

    /**
     * error : false
     * results : [{"_id":"5a967887421aa9107543cd93","createdAt":"2018-02-28T17:38:15.933Z","desc":"A tiny but mighty list virtualization library for Angular","publishedAt":"2018-03-12T08:44:50.326Z","source":"web","type":"前端","url":"https://a-jie.github.io/angular-infinite-list","used":true,"who":"A-JIE"},{"_id":"5a9fc070421aa9103fff20b7","createdAt":"2018-03-07T18:35:28.967Z","desc":"前端每周清单第 53 期：Go 与 WebAssembly, React Suspense 演练, CSS 技巧","publishedAt":"2018-03-12T08:44:50.326Z","source":"web","type":"前端","url":"https://zhuanlan.zhihu.com/p/34320651","used":true,"who":"王下邀月熊(Chevalier)"},{"_id":"5a795384421aa90d2cd3d7e9","createdAt":"2018-02-06T15:04:36.955Z","desc":"Readline utils, for moving the cursor, clearing lines, creating a readline interface, and more.","publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"前端","url":"https://github.com/enquirer/readline-utils","used":true,"who":"鑫花璐放"},{"_id":"5a7997e2421aa90d21aa1141","createdAt":"2018-02-06T19:56:18.739Z","desc":"Chrome插件，在新选项卡展示GitHub 趋势榜、linux 命令索引，浏览历史记录，时钟页面。","publishedAt":"2018-02-08T08:13:24.479Z","source":"web","type":"前端","url":"https://github.com/jaywcjlove/oscnews","used":true,"who":"小弟调调™"},{"_id":"5a79cd28421aa90d2cd3d7f1","createdAt":"2018-02-06T23:43:36.212Z","desc":"《React 学习之道》The Road to learn React (简体中文版) 通往 React 实战大师之旅：掌握 React 最简单，且最实用的教程。","publishedAt":"2018-02-08T08:13:24.479Z","source":"web","type":"前端","url":"https://github.com/the-road-to-learn-react/the-road-to-learn-react-chinese","used":true,"who":"吕立青"},{"_id":"5a7a6b59421aa90d2cd3d7f5","createdAt":"2018-02-07T10:58:33.646Z","desc":"前端页面热更新实现方案","publishedAt":"2018-02-08T08:13:24.479Z","source":"web","type":"前端","url":"http://refined-x.com/2018/02/07/%E5%89%8D%E7%AB%AF%E9%A1%B5%E9%9D%A2%E7%83%AD%E6%9B%B4%E6%96%B0%E5%AE%9E%E7%8E%B0%E6%96%B9%E6%A1%88/","used":true,"who":"zangtao"},{"_id":"5a5c7784421aa911577aa7c3","createdAt":"2018-01-15T17:42:28.480Z","desc":"前端每周清单第 47 期：NPM 年度报告与 2018 展望，Airbnb React Router 实践","publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"前端","url":"https://zhuanlan.zhihu.com/p/32962454","used":true,"who":"王下邀月熊(Chevalier)"},{"_id":"5a65aa65421aa91156960029","createdAt":"2018-01-22T17:09:57.815Z","desc":"前端每周清单第 48 期：Slack Webpack 构建优化，CSS 命名规范与用户追踪，Vue.js 单元测试","publishedAt":"2018-01-23T08:46:45.132Z","source":"web","type":"前端","url":"https://zhuanlan.zhihu.com/p/33185341","used":true,"who":"王下邀月熊(Chevalier)"},{"_id":"59e5dae8421aa90fe2f02bc6","createdAt":"2017-10-17T18:26:48.298Z","desc":"awesome 系列 - 看看近百位歌手們的官方網站設計概念","publishedAt":"2018-01-16T08:40:08.101Z","source":"web","type":"前端","url":"https://github.com/WeiChiaChang/awesome-singer-official-portal","used":true,"who":"WesleyChang"},{"_id":"5a39c48b421aa90fe50c0296","createdAt":"2017-12-20T10:01:47.729Z","desc":"在5分钟内搭建企业内部私有npm仓库","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"https://github.com/jaywcjlove/handbook/blob/master/CentOS/%E5%9C%A85%E5%88%86%E9%92%9F%E5%86%85%E6%90%AD%E5%BB%BA%E4%BC%81%E4%B8%9A%E5%86%85%E9%83%A8%E7%A7%81%E6%9C%89npm%E4%BB%93%E5%BA%93.md","used":true,"who":"小弟调调™"}]
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
         * _id : 5a967887421aa9107543cd93
         * createdAt : 2018-02-28T17:38:15.933Z
         * desc : A tiny but mighty list virtualization library for Angular
         * publishedAt : 2018-03-12T08:44:50.326Z
         * source : web
         * type : 前端
         * url : https://a-jie.github.io/angular-infinite-list
         * used : true
         * who : A-JIE
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
