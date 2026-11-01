package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssl {
    public static final android.net.Uri a;
    public static final android.net.Uri b;
    public static final android.net.Uri c;
    public static final android.net.Uri d;

    static {
        android.net.Uri uri = android.net.Uri.parse("content://com.google.android.dialer.cacheprovider");
        a = uri;
        b = android.net.Uri.withAppendedPath(uri, "contact");
        c = android.net.Uri.withAppendedPath(uri, "photo");
        d = android.net.Uri.withAppendedPath(uri, "thumbnail");
    }
}
