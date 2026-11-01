package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aabc extends java.lang.ClassLoader {
    @Override // java.lang.ClassLoader
    protected final java.lang.Class loadClass(java.lang.String str, boolean z) {
        if (!j$.util.Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        if (android.util.Log.isLoggable("CloudMessengerCompat", 3)) {
            android.util.Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        }
        return com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat.class;
    }
}
