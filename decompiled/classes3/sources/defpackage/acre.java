package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acre implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ acre(java.lang.Object obj, float f, float f2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            float f = this.b;
            float f2 = this.a;
            ((java.lang.Boolean) this.c.a(java.lang.Float.valueOf(f2 + ((f - f2) * fFloatValue)))).booleanValue();
            return java.lang.Boolean.FALSE;
        }
        dbm dbmVar = (dbm) obj;
        aooh.f(dbmVar, "$this$onDrawWithContent");
        java.lang.Object obj2 = this.c;
        defpackage.acrg acrgVar = (defpackage.acrg) obj2;
        defpackage.vqy vqyVar = null;
        if (!acrgVar.d || (this.a == 0.0f && this.b == 0.0f)) {
            defpackage.vqy vqyVar2 = acrgVar.m;
            if (vqyVar2 == null) {
                aooh.j("effectsController");
            } else {
                vqyVar = vqyVar2;
            }
            vqyVar.f(dbmVar, acrgVar.l, acrgVar.c);
        } else {
            cpx cpxVar = acrgVar.l;
            csg csgVarQ = dbmVar.q();
            long jA = csgVarQ.a();
            csgVarQ.b().g();
            try {
                csgVarQ.c.t(cpxVar);
                defpackage.vqy vqyVar3 = ((defpackage.acrg) obj2).m;
                if (vqyVar3 == null) {
                    aooh.j("effectsController");
                } else {
                    vqyVar = vqyVar3;
                }
                vqyVar.f(dbmVar, cpxVar, ((defpackage.acrg) obj2).c);
            } finally {
                csgVarQ.b().e();
                csgVarQ.h(jA);
            }
        }
        return aojh.a;
    }
}
