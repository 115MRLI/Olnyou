package only.you.model.bean.onlyoueyes;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * @name Onlyou
 * @class name：分类
 * @anthor 家佑
 * @time 2018/4/19
 */
@Table(name = "classify")
public class Classify {

    /**
     * id : 24
     * name : 时尚
     * alias : null
     * description : 优雅地行走在潮流尖端
     * bgPicture : http://img.kaiyanapp.com/22192a40de238fe853b992ed57f1f098.jpeg
     * bgColor :
     * headerImage : http://img.kaiyanapp.com/c9b19c2f0a2a40f4c45564dd8ea766d3.png
     * defaultAuthorId : 2160
     */
    @Column(name = "_id", isId = true, autoGen = false)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "alias")
    private Object alias;
    @Column(name = "description")
    private String description;
    @Column(name = "bgPicture")
    private String bgPicture;
    @Column(name = "bgColor")
    private String bgColor;
    @Column(name = "headerImage")
    private String headerImage;
    @Column(name = "defaultAuthorId")
    private int defaultAuthorId;
    @Column(name = "position") //做排序保存使用
    private int position;
    @Column(name = "position") //判断是否被选中
    private boolean iselected;

    public boolean iselected() {
        return iselected;
    }

    public void setIselected(boolean iselected) {
        this.iselected = iselected;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getAlias() {
        return alias;
    }

    public void setAlias(Object alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBgPicture() {
        return bgPicture;
    }

    public void setBgPicture(String bgPicture) {
        this.bgPicture = bgPicture;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public int getDefaultAuthorId() {
        return defaultAuthorId;
    }

    public void setDefaultAuthorId(int defaultAuthorId) {
        this.defaultAuthorId = defaultAuthorId;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias=" + alias +
                ", description='" + description + '\'' +
                ", bgPicture='" + bgPicture + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", headerImage='" + headerImage + '\'' +
                ", defaultAuthorId=" + defaultAuthorId +
                ", position=" + position +
                '}';
    }
}
