package io.github.yuhangjiang.messaging.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(
    indexes = @Index(columnList = "conversationId, sequenceNumber")
)
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long conversationId;
    private Long senderId;

    @Column(nullable = false)
    private String content;

    private Long sequenceNumber;
    private Instant createdAt = Instant.now();

    public Long getId() {
        return id;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}