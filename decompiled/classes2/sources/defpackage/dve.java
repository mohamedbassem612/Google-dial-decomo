package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dve {
    static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return aa$.ExternalSyntheticApiModelOutline1.m(messagingStyle, message);
    }

    static android.app.Notification.MessagingStyle b(android.app.Notification.MessagingStyle messagingStyle, java.lang.CharSequence charSequence) {
        return aa$.ExternalSyntheticApiModelOutline1.m(messagingStyle, (java.lang.CharSequence) null);
    }

    public static android.graphics.Shader.TileMode c(int i) {
        if (i != 1) {
            return i != 2 ? android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.MIRROR;
        }
        return android.graphics.Shader.TileMode.REPEAT;
    }
}
