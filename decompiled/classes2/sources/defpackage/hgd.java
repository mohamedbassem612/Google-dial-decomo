package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgd implements defpackage.gzv {
    private static final java.util.Set a = new java.util.HashSet();

    @Override // defpackage.gzv
    public final void a(java.lang.String str, java.lang.Throwable th) {
        java.util.Set set = a;
        if (set.contains(str)) {
            return;
        }
        android.util.Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
