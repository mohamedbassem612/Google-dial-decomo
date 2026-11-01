package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akyn implements defpackage.albn {
    private static final defpackage.akzq a = defpackage.akzq.a;

    private static final void m(defpackage.albh albhVar) throws defpackage.alaz {
        if (albhVar != null && !albhVar.w()) {
            throw new defpackage.alch().a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [albh, java.lang.Object] */
    @Override // defpackage.albn
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.albh i(java.io.InputStream inputStream, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.akzf akzfVarJ = defpackage.akzf.J(inputStream, 4096);
        ?? L = l(akzfVarJ, akzqVar);
        akzfVarJ.A(0);
        m(L);
        return L;
    }

    @Override // defpackage.albn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.albh j(byte[] bArr, defpackage.akzq akzqVar) {
        return k(bArr, 0, bArr.length, akzqVar);
    }

    @Override // defpackage.albn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.albh k(byte[] bArr, int i, int i2, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.albh albhVarD = d(bArr, i, i2, akzqVar);
        m(albhVarD);
        return albhVarD;
    }

    public defpackage.albh d(byte[] bArr, int i, int i2, defpackage.akzq akzqVar) {
        throw null;
    }

    @Override // defpackage.albn
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.io.InputStream inputStream) {
        return i(inputStream, a);
    }

    @Override // defpackage.albn
    public final /* bridge */ /* synthetic */ java.lang.Object f(byte[] bArr) {
        return j(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [albh, java.lang.Object] */
    @Override // defpackage.albn
    public final /* bridge */ /* synthetic */ java.lang.Object g(defpackage.akzc akzcVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.akzf akzfVarG = akzcVar.g();
        ?? L = l(akzfVarG, akzqVar);
        akzfVarG.A(0);
        m(L);
        return L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [albh, java.lang.Object] */
    @Override // defpackage.albn
    public final /* bridge */ /* synthetic */ java.lang.Object h(defpackage.akzf akzfVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        ?? L = l(akzfVar, akzqVar);
        m(L);
        return L;
    }
}
