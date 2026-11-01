package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvu {
    public static final android.net.Uri a;

    static {
        android.net.Uri uri = defpackage.abvv.a;
        android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(defpackage.abvv.a, "persons");
        aooh.e(uriWithAppendedPath, "withAppendedPath(...)");
        a = uriWithAppendedPath;
        aooh.e(android.net.Uri.withAppendedPath(uriWithAppendedPath, "lookup"), "withAppendedPath(...)");
    }
}
