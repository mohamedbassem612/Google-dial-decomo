package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rnq implements defpackage.mdo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/tracing/cuimetadata/TiktokTracingCuiMetadataPopulator");

    @Override // defpackage.mdo
    public final java.lang.Object a(defpackage.aivp aivpVar, defpackage.aoln aolnVar) {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
        java.util.UUID uuidG = defpackage.ahvr.U(ahpjVar) ? ahpjVar.g() : null;
        defpackage.akzx akzxVarM = defpackage.amrt.a.m();
        if (akzxVarM == null) {
            defpackage.aooh.i("builder");
        }
        long jZ = uuidG == null ? 0L : defpackage.ahvr.z(uuidG.getMostSignificantBits(), uuidG.getLeastSignificantBits());
        akzxVarM.u();
        defpackage.amrt amrtVar = (defpackage.amrt) akzxVarM.b;
        amrtVar.b |= 1;
        amrtVar.c = jZ;
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        defpackage.amrt amrtVar2 = (defpackage.amrt) aladVarR;
        ((defpackage.aimw) a.b().l("com/android/dialer/logging/tracing/cuimetadata/TiktokTracingCuiMetadataPopulator", "populate", 17, "TiktokTracingCuiMetadataPopulator.kt")).x("positiveTraceId: %s", amrtVar2.c);
        defpackage.ahda ahdaVarAo = defpackage.aiql.ao(aivpVar.L());
        if (amrtVar2 == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) ahdaVarAo.a;
        akzxVar.u();
        defpackage.aivp aivpVar2 = (defpackage.aivp) akzxVar.b;
        j$.util.Objects.requireNonNull(amrtVar2);
        aivpVar2.e = amrtVar2;
        aivpVar2.b |= 4;
        return ahdaVarAo.i();
    }
}
