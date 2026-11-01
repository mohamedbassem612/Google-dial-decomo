package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rts extends defpackage.aomh implements defpackage.aonn {
    final /* synthetic */ rtj a;
    final /* synthetic */ defpackage.aomy b;
    final /* synthetic */ defpackage.aoss c;
    final /* synthetic */ defpackage.aonj d;
    final /* synthetic */ defpackage.aomy e;
    final /* synthetic */ defpackage.ccp f;
    final /* synthetic */ defpackage.ccp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rts(rtj rtjVar, defpackage.aomy aomyVar, defpackage.aoss aossVar, defpackage.aonj aonjVar, defpackage.aomy aomyVar2, defpackage.ccp ccpVar, defpackage.ccp ccpVar2, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.a = rtjVar;
        this.b = aomyVar;
        this.c = aossVar;
        this.d = aonjVar;
        this.e = aomyVar2;
        this.f = ccpVar;
        this.g = ccpVar2;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.rts) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.rrz rrzVar;
        defpackage.aooc.af(obj);
        rth rthVar = this.a;
        if (rthVar instanceof defpackage.rti) {
            this.b.a();
        }
        boolean z = rthVar instanceof rth;
        rth rthVar2 = z ? rthVar : null;
        defpackage.rsd rsdVarB = (rthVar2 == null || (rrzVar = rthVar2.a) == null) ? null : rrzVar.b();
        defpackage.ccp ccpVar = this.f;
        if (rsdVarB != defpackage.pez.aX(ccpVar)) {
            defpackage.aoov.an(this.c, null, 0, new isf(rthVar, rsdVarB, this.g, ccpVar, (defpackage.aoln) null, 4), 3);
            if (z) {
                this.d.a(rthVar);
            }
            if (defpackage.pez.aX(ccpVar) != null && rsdVarB == null) {
                this.e.a();
            } else if (defpackage.pez.aX(ccpVar) != null && rsdVarB != null && defpackage.pez.aX(ccpVar) != rsdVarB) {
                this.e.a();
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.rts(this.a, this.b, this.c, this.d, this.e, this.f, this.g, aolnVar);
    }
}
