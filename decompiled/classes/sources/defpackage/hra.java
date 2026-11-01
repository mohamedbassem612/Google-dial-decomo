package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hra implements defpackage.mdo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/androidauto/logging/cuimetadata/AndroidAutoCuiMetadataPopulator");
    private final defpackage.rsr b;

    public hra(defpackage.rsr rsrVar) {
        this.b = rsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mdo
    public final java.lang.Object a(defpackage.aivp aivpVar, defpackage.aoln aolnVar) {
        defpackage.hqz hqzVar;
        if (aolnVar instanceof defpackage.hqz) {
            hqzVar = (defpackage.hqz) aolnVar;
            int i = hqzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqzVar.c = i - Integer.MIN_VALUE;
            } else {
                hqzVar = new defpackage.hqz(this, aolnVar);
            }
        } else {
            hqzVar = new defpackage.hqz(this, aolnVar);
        }
        java.lang.Object objAt = hqzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hqzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAt);
            defpackage.rsr rsrVar = this.b;
            hqzVar.d = aivpVar;
            hqzVar.c = 1;
            objAt = rsrVar.at(hqzVar);
            if (objAt == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aivpVar = hqzVar.d;
            defpackage.aooc.af(objAt);
        }
        defpackage.amnr amnrVar = (defpackage.amnr) objAt;
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/androidauto/logging/cuimetadata/AndroidAutoCuiMetadataPopulator", "populate", 23, "AndroidAutoCuiMetadataPopulator.kt");
        defpackage.amnq amnqVarB = defpackage.amnq.b(amnrVar.c);
        if (amnqVarB == null) {
            amnqVarB = defpackage.amnq.ANDROID_AUTO_CONNECTION_STATUS_UNKNOWN;
        }
        aimwVar.y("androidAutoConnectionStatus: %s", amnqVarB.name());
        defpackage.ahda ahdaVarAo = defpackage.aiql.ao(aivpVar.L());
        if (amnrVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) ahdaVarAo.a;
        akzxVar.u();
        defpackage.aivp aivpVar2 = (defpackage.aivp) akzxVar.b;
        j$.util.Objects.requireNonNull(amnrVar);
        aivpVar2.g = amnrVar;
        aivpVar2.b |= 16;
        return ahdaVarAo.i();
    }
}
