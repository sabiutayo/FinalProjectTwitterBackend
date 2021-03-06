CREATE TABLE IF NOT EXISTS entry
(
    entry_id     BIGINT UNSIGNED UNIQUE AUTO_INCREMENT     NOT NULL,
    content      VARCHAR(160)                              NOT NULL,
    link         VARCHAR(255),
    image_path   VARCHAR(255),
    created_data TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status       ENUM ('ORIGINAL', 'EDITED')               NOT NULL,
    type         ENUM ('ENTRY', 'COMMENT', 'SHARED_ENTRY') NOT NULL,
    account_id   BIGINT UNSIGNED                           NOT NULL,
    PRIMARY KEY (entry_id),
    CONSTRAINT FOREIGN KEY (account_id) REFERENCES account (account_id)
)
