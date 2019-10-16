package net.togogo.bean;

public class EasyBuyNews {
    private int id;
    private String title;
    private String content;
    private String creatTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public EasyBuyNews(int id, String title, String content, String creatTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creatTime = creatTime;
    }

    public EasyBuyNews() {
    }

    @Override
    public String toString() {
        return "EasyBuyNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creatTime='" + creatTime + '\'' +
                '}';
    }
}
