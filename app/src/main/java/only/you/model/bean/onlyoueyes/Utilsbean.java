package only.you.model.bean.onlyoueyes;

/**
 * @name 工具bean
 * @class name：only.you.model.bean
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/5
 */
public class Utilsbean {
    private long id;
    private String playUrl;
    private String title;
    private String detail;
    private String description;
    private String category;
    private String tagstr1;
    private String tagstr2;
    private String tagstr3;
    private String tagstriv3;
    private String tagstriv2;
    private String tagstriv1;
    public Utilsbean(long id, String playUrl, String title, String detail, String description, String category, String tagstr1, String tagstr2, String tagstr3, String tagstriv3, String tagstriv2, String tagstriv1) {
        this.id = id;
        this.playUrl = playUrl;
        this.title = title;
        this.detail = detail;
        this.description = description;
        this.category = category;
        this.tagstr1 = tagstr1;
        this.tagstr2 = tagstr2;
        this.tagstr3 = tagstr3;
        this.tagstriv3 = tagstriv3;
        this.tagstriv2 = tagstriv2;
        this.tagstriv1 = tagstriv1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTagstr1() {
        return tagstr1;
    }

    public void setTagstr1(String tagstr1) {
        this.tagstr1 = tagstr1;
    }

    public String getTagstr2() {
        return tagstr2;
    }

    public void setTagstr2(String tagstr2) {
        this.tagstr2 = tagstr2;
    }

    public String getTagstr3() {
        return tagstr3;
    }

    public void setTagstr3(String tagstr3) {
        this.tagstr3 = tagstr3;
    }

    public String getTagstriv3() {
        return tagstriv3;
    }

    public void setTagstriv3(String tagstriv3) {
        this.tagstriv3 = tagstriv3;
    }

    public String getTagstriv2() {
        return tagstriv2;
    }

    public void setTagstriv2(String tagstriv2) {
        this.tagstriv2 = tagstriv2;
    }

    public String getTagstriv1() {
        return tagstriv1;
    }

    public void setTagstriv1(String tagstriv1) {
        this.tagstriv1 = tagstriv1;
    }

    @Override
    public String toString() {
        return "Utilsbean{" +
                "playUrl='" + playUrl + '\'' +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", tagstr1='" + tagstr1 + '\'' +
                ", tagstr2='" + tagstr2 + '\'' +
                ", tagstr3='" + tagstr3 + '\'' +
                ", tagstriv3='" + tagstriv3 + '\'' +
                ", tagstriv2='" + tagstriv2 + '\'' +
                ", tagstriv1='" + tagstriv1 + '\'' +
                '}';
    }
}
