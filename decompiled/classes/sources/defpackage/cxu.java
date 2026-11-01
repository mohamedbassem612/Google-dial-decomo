package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cxu extends defpackage.dbj {
    final /* synthetic */ defpackage.cxy a;
    final /* synthetic */ defpackage.aonn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxu(defpackage.cxy cxyVar, defpackage.aonn aonnVar, java.lang.String str) {
        super(str);
        this.a = cxyVar;
        this.b = aonnVar;
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(defpackage.cyi cyiVar, java.util.List list, long j) {
        defpackage.cxy cxyVar = this.a;
        defpackage.cxs cxsVar = cxyVar.f;
        cxsVar.a = cyiVar.p();
        cxsVar.b = cyiVar.a();
        cxsVar.c = cyiVar.b();
        if (cyiVar.dw() || cxyVar.a.j == null) {
            cxyVar.d = 0;
            defpackage.cyf cyfVar = (defpackage.cyf) this.b.a(cxsVar, new defpackage.dpd(j));
            return new defpackage.cxt(cyfVar, cxyVar, cxyVar.d, cyfVar, 0);
        }
        cxyVar.e = 0;
        defpackage.cyf cyfVar2 = (defpackage.cyf) this.b.a(cxyVar.g, new defpackage.dpd(j));
        return new defpackage.cxt(cyfVar2, cxyVar, cxyVar.e, cyfVar2, 1);
    }
}
