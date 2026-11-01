package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tuw {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/wear/SharpieWearDfpMessageSender");
    private final defpackage.afpl b;

    public tuw(defpackage.afpl afplVar) {
        this.b = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zla zlaVar, aoln aolnVar) {
        defpackage.tuv tuvVar;
        if (aolnVar instanceof defpackage.tuv) {
            tuvVar = (defpackage.tuv) aolnVar;
            int i = tuvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tuvVar.c = i - Integer.MIN_VALUE;
            } else {
                tuvVar = new defpackage.tuv(this, aolnVar);
            }
        } else {
            tuvVar = new defpackage.tuv(this, aolnVar);
        }
        java.lang.Object objAe = tuvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tuvVar.c;
        if (i2 == 0) {
            aooc.af(objAe);
            defpackage.afpl afplVar = this.b;
            defpackage.zoe zoeVarCo = aehj.co(defpackage.zki.a.m());
            zoeVarCo.k();
            defpackage.zoe zoeVarCn = aehj.cn(defpackage.zkh.a.m());
            aooh.f(zlaVar, "value");
            akzx akzxVar = (akzx) zoeVarCn.a;
            akzxVar.u();
            defpackage.zkh zkhVar = (defpackage.zkh) akzxVar.b;
            j$.util.Objects.requireNonNull(zlaVar);
            zkhVar.c = zlaVar;
            zkhVar.b = 5;
            zoeVarCo.j(zoeVarCn.h());
            defpackage.zki zkiVarI = zoeVarCo.i();
            tuvVar.c = 1;
            objAe = afplVar.ae(zkiVarI, tuvVar);
            if (objAe == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAe);
        }
        defpackage.zke zkeVar = (defpackage.zke) ajsz.bE((java.util.List) objAe);
        a.b().l("com/android/dialer/sharpie/impl/wear/SharpieWearDfpMessageSender", "sendMessage", 27, "SharpieWearDfpMessageSender.kt").y("Message sent status: %s", zkeVar);
        return zkeVar;
    }
}
