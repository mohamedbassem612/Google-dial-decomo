package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class zbi extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.zbm b;
    final /* synthetic */ defpackage.zat c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbi(defpackage.zbm zbmVar, defpackage.zat zatVar, long j, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = zbmVar;
        this.c = zatVar;
        this.d = j;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.zbi) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2 = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.zbm zbmVar = this.b;
            defpackage.zat zatVar = this.c;
            long j = this.d;
            this.a = 1;
            java.lang.Object objM = defpackage.aosv.m(new defpackage.zbl(zatVar, zbmVar, j, null), this);
            if (objM != obj2) {
                objM = defpackage.aojh.a;
            }
            if (objM == obj2) {
                return obj2;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.zbi(this.b, this.c, this.d, aolnVar);
    }
}
