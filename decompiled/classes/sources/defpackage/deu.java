package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class deu implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public deu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ajcq, java.lang.Object] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        long j;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.a;
            synchronized (((defpackage.det) obj3).e) {
                ((defpackage.det) obj3).f.remove(obj2);
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            defpackage.ckv ckvVar = (defpackage.ckv) obj;
            synchronized (defpackage.ckw.b) {
                j = defpackage.ckw.d;
                defpackage.ckw.d = 1 + j;
            }
            return new defpackage.ckk(j, ckvVar, this.b, this.a);
        }
        if (i != 2) {
            return this.a.a(this.b.get(((java.lang.Number) obj).intValue()));
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th instanceof defpackage.guu) {
            ((defpackage.gsg) this.b).i(((defpackage.guu) th).a);
        }
        this.a.cancel(false);
        return defpackage.aojh.a;
    }

    public deu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
