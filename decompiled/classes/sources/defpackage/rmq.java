package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmq implements defpackage.mdo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/metadatacontributor/cuimetadata/WindowLayoutCuiMetadataPopulator");
    private final j$.util.Optional b;

    public rmq(j$.util.Optional optional) {
        if (optional == null) {
            defpackage.aooh.i("windowLayoutMetadataContributorOptional");
        }
        this.b = optional;
    }

    @Override // defpackage.mdo
    public final java.lang.Object a(defpackage.aivp aivpVar, defpackage.aoln aolnVar) {
        j$.util.Optional optionalP;
        defpackage.amtg amtgVar;
        j$.util.Optional optional = this.b;
        if (optional == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.zzx zzxVar = (defpackage.zzx) optional.orElse((java.lang.Object) null);
        if (zzxVar == null || (optionalP = zzxVar.p()) == null || (amtgVar = (defpackage.amtg) optionalP.orElse((java.lang.Object) null)) == null) {
            return aivpVar;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/logging/metadatacontributor/cuimetadata/WindowLayoutCuiMetadataPopulator", "populate", 25, "WindowLayoutCuiMetadataPopulator.kt")).y("windowLayout: %s", amtgVar);
        defpackage.ahda ahdaVarAo = defpackage.aiql.ao(aivpVar.L());
        defpackage.akzx akzxVar = (defpackage.akzx) ahdaVarAo.a;
        akzxVar.u();
        defpackage.aivp aivpVar2 = (defpackage.aivp) akzxVar.b;
        j$.util.Objects.requireNonNull(amtgVar);
        aivpVar2.f = amtgVar;
        aivpVar2.b |= 8;
        return ahdaVarAo.i();
    }
}
