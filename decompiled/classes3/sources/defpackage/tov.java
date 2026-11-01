package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tov extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public tov(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tov.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.zlr zlrVar = (defpackage.zlr) list.get(1);
        aooh.f(zlrVar, "sharpieState");
        if (zBooleanValue) {
            z = true;
        } else if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            defpackage.tth tthVarB = defpackage.tth.b(zlrVar.m().c);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            if (tthVarB == defpackage.tth.SCAM_DETECTION_RUNNING) {
                z = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
