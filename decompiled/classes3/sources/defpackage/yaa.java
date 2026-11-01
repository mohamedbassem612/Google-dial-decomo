package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yaa implements defpackage.xzp {
    private static final java.util.Set a = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("file", "content", "android.resource")));
    private final defpackage.xzz b;

    public yaa(defpackage.xzz xzzVar) {
        this.b = xzzVar;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return a.contains(((android.net.Uri) obj).getScheme());
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new ucm(new defpackage.yfn(uri), this.b.a(uri));
    }
}
