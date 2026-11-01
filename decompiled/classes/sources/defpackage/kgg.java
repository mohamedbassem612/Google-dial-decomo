package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgg implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kgg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ajcq, java.lang.Object] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        long j;
        int i = this.$cid;
        if (i == 0) {
            this.a.get(((java.lang.Number) obj).intValue());
            return null;
        }
        if (i == 1) {
            defpackage.ckv ckvVar = (defpackage.ckv) obj;
            synchronized (defpackage.ckw.b) {
                j = defpackage.ckw.d;
                defpackage.ckw.d = 1 + j;
            }
            return new defpackage.ckn(j, ckvVar, this.a);
        }
        if (i == 2) {
            this.a.cancel(false);
            return defpackage.aojh.a;
        }
        if (i == 3) {
            this.a.cancel(false);
            return defpackage.aojh.a;
        }
        if (i == 4) {
            this.a.cancel(false);
            return defpackage.aojh.a;
        }
        if (i != 5) {
            this.a.cancel(false);
            return defpackage.aojh.a;
        }
        ?? r5 = this.a;
        defpackage.aojh aojhVar = defpackage.aojh.a;
        r5.w(aojhVar);
        return aojhVar;
    }
}
