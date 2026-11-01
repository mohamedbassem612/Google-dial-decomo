package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class edn implements defpackage.aoxi {
    final /* synthetic */ defpackage.eei a;

    public edn(defpackage.eei eeiVar) {
        this.a = eeiVar;
    }

    @Override // defpackage.aoxi
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        return b(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        edm edmVar;
        if (aolnVar instanceof edm) {
            edmVar = (edm) aolnVar;
            int i = edmVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                edmVar.e = i - Integer.MIN_VALUE;
            } else {
                edmVar = new edm(this, aolnVar);
            }
        } else {
            edmVar = new edm(this, aolnVar);
        }
        java.lang.Object obj = edmVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = edmVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.eei eeiVar = this.a;
            if (!(eeiVar.h.X() instanceof defpackage.eeu)) {
                edmVar.a = null;
                edmVar.b = null;
                edmVar.e = 1;
                if (eeiVar.f(true, edmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = edmVar.b;
            java.lang.Object obj3 = edmVar.a;
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
