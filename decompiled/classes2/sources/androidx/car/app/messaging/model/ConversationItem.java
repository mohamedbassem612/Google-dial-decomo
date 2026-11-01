package androidx.car.app.messaging.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class ConversationItem implements defpackage.xh {
    private final java.util.List mActions;
    private final defpackage.vr mConversationCallbackDelegate;
    private final androidx.car.app.model.CarIcon mIcon;
    private final java.lang.String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final java.util.List mMessages;
    private final defpackage.dvv mSelf;
    private final androidx.car.app.model.CarText mTitle;

    public ConversationItem(defpackage.vv vvVar) {
        this.mId = (java.lang.String) j$.util.Objects.requireNonNull(vvVar.a);
        this.mTitle = (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(vvVar.b);
        defpackage.dvv dvvVar = vvVar.c;
        validateSender(dvvVar);
        this.mSelf = dvvVar;
        this.mIcon = vvVar.d;
        this.mIsGroupConversation = vvVar.e;
        java.util.List list = (java.util.List) j$.util.Objects.requireNonNull(defpackage.rv.d(vvVar.f));
        this.mMessages = list;
        dzk.v(!list.isEmpty(), "Message list cannot be empty.");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dzk.v(((androidx.car.app.messaging.model.CarMessage) it.next()) != null, "Message list cannot contain null messages");
        }
        this.mConversationCallbackDelegate = (defpackage.vr) j$.util.Objects.requireNonNull(vvVar.g);
        this.mActions = defpackage.rv.d(vvVar.h);
        boolean z = vvVar.i;
        this.mIndexable = true;
    }

    static defpackage.dvv validateSender(defpackage.dvv dvvVar) {
        j$.util.Objects.requireNonNull(dvvVar);
        j$.util.Objects.requireNonNull(dvvVar.a);
        j$.util.Objects.requireNonNull(dvvVar.d);
        return dvvVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.messaging.model.ConversationItem) {
            androidx.car.app.messaging.model.ConversationItem conversationItem = (androidx.car.app.messaging.model.ConversationItem) obj;
            if (j$.util.Objects.equals(this.mId, conversationItem.mId) && j$.util.Objects.equals(this.mTitle, conversationItem.mTitle) && j$.util.Objects.equals(this.mIcon, conversationItem.mIcon) && ru.c(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && j$.util.Objects.equals(this.mMessages, conversationItem.mMessages) && j$.util.Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public defpackage.vr getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.util.List getMessages() {
        return this.mMessages;
    }

    public defpackage.dvv getSelf() {
        return this.mSelf;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(ru.b(getSelf())), this.mId, this.mTitle, this.mIcon, java.lang.Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, java.lang.Boolean.valueOf(this.mIndexable)});
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new androidx.car.app.model.CarText.Builder("").build();
        defpackage.dvu dvuVar = new defpackage.dvu();
        dvuVar.a = "";
        this.mSelf = new defpackage.dvv(dvuVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new java.util.ArrayList();
        this.mConversationCallbackDelegate = new androidx.car.app.messaging.model.ConversationCallbackDelegateImpl(new defpackage.vu());
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
