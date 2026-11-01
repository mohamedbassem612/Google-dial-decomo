package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbf implements defpackage.aoxi {
    final /* synthetic */ defpackage.gdg a;

    public gbf(defpackage.gdg gdgVar) {
        this.a = gdgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.dzn dznVar, defpackage.aoln aolnVar) {
        defpackage.gbe gbeVar;
        if (aolnVar instanceof defpackage.gbe) {
            gbeVar = (defpackage.gbe) aolnVar;
            int i = gbeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbeVar.d = i - Integer.MIN_VALUE;
            } else {
                gbeVar = new defpackage.gbe(this, aolnVar);
            }
        } else {
            gbeVar = new defpackage.gbe(this, aolnVar);
        }
        java.lang.Object obj = gbeVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gbeVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.gdg gdgVar = this.a;
                gbeVar.a = null;
                gbeVar.d = 1;
                if (gdgVar.a(dznVar, gbeVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = gbeVar.a;
                defpackage.aooc.af(obj);
            }
        } catch (defpackage.aowp unused) {
        }
        return defpackage.aojh.a;
    }
}
