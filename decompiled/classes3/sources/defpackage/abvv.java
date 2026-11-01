package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvv {
    public static final android.net.Uri a;

    static {
        android.net.Uri uri = android.net.Uri.parse("content://com.android.people");
        aooh.e(uri, "parse(...)");
        a = uri;
        aooh.e(android.net.Uri.withAppendedPath(uri, "notification"), "withAppendedPath(...)");
    }
}
