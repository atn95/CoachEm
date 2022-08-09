package server.controllers.exercises;

import jakarta.persistence.*;

@Entity
@Table
public class Exercise {
    @Id
    @SequenceGenerator(name = "exercise_sequence", sequenceName = "exercise_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_sequence")
    private long id;
    private String name;
    private String description;
    private String video_url;
    private int type;//string or int?

    public Exercise(String name, String description, String video_url, int type) {
        this.name = name;
        this.description = description;
        this.video_url = video_url;
        this.type = type;
    }

    public Exercise(long id, String name, String description, String video_url, int type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.video_url = video_url;
        this.type = type;
    }

    public Exercise() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", video_url='" + video_url + '\'' +
                ", type=" + type +
                '}';
    }
}
