package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blb extends aomg implements aonn {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ aoos c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(long j, aoos aoosVar, aoln aolnVar) {
        super(aolnVar);
        this.b = j;
        this.c = aoosVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        cwc cwcVar = (cwc) this.d;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            long j = this.b;
            axo axoVar = new axo(this.c, 8);
            this.d = cwcVar;
            this.a = 1;
            obj = defpackage.ro.l(cwcVar, j, axoVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        if (((defpackage.cvm) obj) != null && (this.c.a & 9223372034707292159L) != 9205357640488583168L) {
            return defpackage.bkb.b;
        }
        defpackage.cvm cvmVar = (defpackage.cvm) ajsz.bE(cwcVar.p().a);
        if (!uu.t(cvmVar)) {
            return defpackage.bkb.d;
        }
        cvmVar.b();
        return defpackage.bkb.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.blb blbVar = new defpackage.blb(this.b, this.c, aolnVar);
        blbVar.d = obj;
        return blbVar;
    }
}
