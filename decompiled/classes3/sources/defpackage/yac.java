package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yac implements defpackage.xzp {
    private static final java.util.Set a = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("http", "https")));
    private final defpackage.xzp b;

    public yac(defpackage.xzp xzpVar) {
        this.b = xzpVar;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return a.contains(((android.net.Uri) obj).getScheme());
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        return this.b.b(new defpackage.xzg(((android.net.Uri) obj).toString(), defpackage.xzh.a), i, i2, xusVar);
    }
}
