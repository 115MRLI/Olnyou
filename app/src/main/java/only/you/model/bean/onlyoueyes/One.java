package only.you.model.bean.onlyoueyes;

/**
 * @name Onlyou
 * @class name：only.you.model.bean
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/4/24
 */
public class One {

    /**
     * ResultCode : 1
     * ErrCode : OK
     * Body : {"id":4752,"vol":"VOL.2026","img_url":"http://image.wufazhuce.com/Ftf-6fyv8r7FO0d9KtUyrxTX_Tka","img_author":"Shelia Liu","img_kind":"插画","date":"2018-04-24 06:00:00","url":"http://m.wufazhuce.com/one/2056","word":"世上最可怕的不是眼前的刑罚，而是那无爱的未来。 ","word_from":"《血观音》","word_id":2056}
     */

    private int ResultCode;
    private String ErrCode;
    private BodyBean Body;

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int ResultCode) {
        this.ResultCode = ResultCode;
    }

    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    public BodyBean getBody() {
        return Body;
    }

    public void setBody(BodyBean Body) {
        this.Body = Body;
    }

    public static class BodyBean {
        /**
         * id : 4752
         * vol : VOL.2026
         * img_url : http://image.wufazhuce.com/Ftf-6fyv8r7FO0d9KtUyrxTX_Tka
         * img_author : Shelia Liu
         * img_kind : 插画
         * date : 2018-04-24 06:00:00
         * url : http://m.wufazhuce.com/one/2056
         * word : 世上最可怕的不是眼前的刑罚，而是那无爱的未来。
         * word_from : 《血观音》
         * word_id : 2056
         */

        private int id;
        private String vol;
        private String img_url;
        private String img_author;
        private String img_kind;
        private String date;
        private String url;
        private String word;
        private String word_from;
        private int word_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getImg_author() {
            return img_author;
        }

        public void setImg_author(String img_author) {
            this.img_author = img_author;
        }

        public String getImg_kind() {
            return img_kind;
        }

        public void setImg_kind(String img_kind) {
            this.img_kind = img_kind;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getWord_from() {
            return word_from;
        }

        public void setWord_from(String word_from) {
            this.word_from = word_from;
        }

        public int getWord_id() {
            return word_id;
        }

        public void setWord_id(int word_id) {
            this.word_id = word_id;
        }
    }
}
