package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class vv {
    public final java.lang.String a;
    public final androidx.car.app.model.CarText b;
    public final defpackage.dvv c;
    public final androidx.car.app.model.CarIcon d;
    public final boolean e;
    public java.util.List f;
    public final defpackage.vr g;
    public final java.util.List h;
    public final boolean i = true;

    public vv(androidx.car.app.messaging.model.ConversationItem conversationItem) {
        this.a = conversationItem.getId();
        this.b = conversationItem.getTitle();
        this.c = conversationItem.getSelf();
        this.d = conversationItem.getIcon();
        this.e = conversationItem.isGroupConversation();
        this.g = conversationItem.getConversationCallbackDelegate();
        this.f = conversationItem.getMessages();
        this.h = new java.util.ArrayList(conversationItem.getActions());
    }
}
