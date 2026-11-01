package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvh {
    static android.app.Notification.MessagingStyle.Message a(java.lang.CharSequence charSequence, long j, android.app.Person person) {
        return new android.app.Notification.MessagingStyle.Message(charSequence, j, person);
    }

    static void b(android.app.Notification.MessagingStyle.Message message, android.os.Bundle bundle) {
        da$.ExternalSyntheticApiModelOutline1.m(message).putAll(bundle);
    }

    public static java.lang.Object c(android.content.Intent intent, java.lang.String str, java.lang.Class cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return ae$.ExternalSyntheticApiModelOutline0.m(intent, str, cls);
        }
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static final void e(android.content.ContentProviderClient contentProviderClient) throws java.lang.Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }
}
