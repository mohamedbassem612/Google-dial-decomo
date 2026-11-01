package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class war {
    private static final aimz a = aimz.i("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsDfpRequestSender");
    private final defpackage.zmm b;

    public war(defpackage.zmm zmmVar) {
        this.b = zmmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zmf zmfVar, aoln aolnVar) throws aois {
        defpackage.waq waqVar;
        if (aolnVar instanceof defpackage.waq) {
            waqVar = (defpackage.waq) aolnVar;
            int i = waqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                waqVar.c = i - Integer.MIN_VALUE;
            } else {
                waqVar = new defpackage.waq(this, aolnVar);
            }
        } else {
            waqVar = new defpackage.waq(this, aolnVar);
        }
        java.lang.Object objA = waqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = waqVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.zmm zmmVar = this.b;
            akzx akzxVarM = defpackage.zmc.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(zmfVar, "value");
            akzxVarM.u();
            defpackage.zmc zmcVar = (defpackage.zmc) akzxVarM.b;
            j$.util.Objects.requireNonNull(zmfVar);
            zmcVar.c = zmfVar;
            zmcVar.b = 1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            waqVar.c = 1;
            objA = zmmVar.a((defpackage.zmc) aladVarP, waqVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.zmk zmkVar = (defpackage.zmk) ajsz.bE((java.util.List) objA);
        a.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsDfpRequestSender", "sendRequest", 25, "CrossDeviceMetricsDfpRequestSender.kt").y("Request sent status: %s", zmkVar.a);
        return zmkVar;
    }
}
