package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zql implements defpackage.zoh {
    private static final aimz b = aimz.i("com/google/android/dialershared/incall/core/logging/impl/CallScopeFinishedLogger");
    public final zdi a;
    private final ajct c;
    private final agsm d;
    private final aoin e;
    private final android.content.pm.PackageManager f;
    private final zzx g;

    public zql(agsm agsmVar, ajct ajctVar, zzx zzxVar, zdi zdiVar, android.content.pm.PackageManager packageManager, aoin aoinVar) {
        this.d = agsmVar;
        this.c = ajctVar;
        this.g = zzxVar;
        this.a = zdiVar;
        this.f = packageManager;
        this.e = aoinVar;
    }

    @Override // defpackage.zoh
    public final void a() {
        aift aiftVar = new aift(4);
        ailj ailjVarK = this.g.e().k();
        while (ailjVarK.hasNext()) {
            defpackage.zqk zqkVar = (defpackage.zqk) ailjVarK.next();
            ajcq ajcqVarF = zqkVar.f();
            ajcq ajcqVarE = zqkVar.e();
            defpackage.zql zqlVar = this;
            aiftVar.i(ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarE}).o(new joq(zqlVar, ajcqVarF, zqkVar, ajcqVarE, 19), zqlVar.c));
            this = zqlVar;
        }
        defpackage.zql zqlVar2 = this;
        try {
            agsm agsmVar = zqlVar2.d;
            ajcq ajcqVarO = ahvr.aj(aiftVar.h()).o(new defpackage.vnc(11), ajbm.a);
            agsmVar.k(ajcqVarO);
            if (zqlVar2.f.hasSystemFeature("android.hardware.type.watch")) {
                agsmVar.g(ajcqVarO, ((java.lang.Long) zqlVar2.e.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        } catch (java.lang.Throwable th) {
            a.bq(b.d(), "tidepods - logging the call without attaching a service", "com/google/android/dialershared/incall/core/logging/impl/CallScopeFinishedLogger", "logCallScopeData", 'u', "CallScopeFinishedLogger.java", th, zct.b);
        }
    }
}
