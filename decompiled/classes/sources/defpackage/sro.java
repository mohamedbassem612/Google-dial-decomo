package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sro {
    public static final android.net.Uri a = android.net.Uri.withAppendedPath(defpackage.srp.a, "PhoneLookupHistory");

    public static android.net.Uri a(java.lang.String str) {
        return a.buildUpon().appendQueryParameter("number", android.net.Uri.encode(str)).build();
    }
}
