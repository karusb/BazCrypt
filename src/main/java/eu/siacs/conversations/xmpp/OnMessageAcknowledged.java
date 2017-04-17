package eu.siacs.conversations.xmpp;

import eu.siacs.conversations.entities.Account;

public interface OnMessageAcknowledged {
    void onMessageAcknowledged(Account account, String id);
}
