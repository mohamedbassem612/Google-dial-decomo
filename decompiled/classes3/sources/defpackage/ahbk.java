package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahbk implements ahjr, ahjm {
    private final defpackage.ahbj a;
    private final java.util.Set b;
    private final ahbz c;

    public ahbk(j$.util.Optional optional, java.util.Map map, ahbz ahbzVar, ajcu ajcuVar) {
        aooh.f(optional, "received");
        aooh.f(map, "subpackagedToTier");
        aooh.f(ahbzVar, "configurationUpdater");
        aooh.f(ajcuVar, "lightweightExecutor");
        this.c = ahbzVar;
        this.a = (defpackage.ahbj) aooh.q(optional);
        this.b = map.keySet();
    }

    public final ajcq a(android.content.Intent intent, int i) {
        ajcq ajcqVarZ;
        aooh.f(intent, "intent");
        defpackage.ahbj ahbjVar = this.a;
        if (ahbjVar != null) {
            ahbjVar.a();
        }
        java.lang.String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        ahoq ahoqVarX = ahvr.X(1346, "Updating experiments", ahot.a, true);
        try {
            if (stringExtra == null) {
                ajcqVarZ = this.c.d(false);
            } else if (this.b.contains(stringExtra)) {
                ahbz ahbzVar = this.c;
                ajcqVarZ = ahbzVar.c(((apnt) ahbzVar.e).c(stringExtra), false);
            } else {
                ajcqVarZ = aiql.z((java.lang.Object) null);
            }
            agsm.i(1347, ajcqVarZ, "Failed updating experiments for package %s", new java.lang.Object[]{stringExtra});
            ajcq ajcqVarB = ahvr.B(ajcqVarZ, java.lang.Exception.class, new defpackage.agnw(new defpackage.agkh(9), 16), ajbm.a);
            ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
            return ajcqVarB;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarX, th);
                throw th2;
            }
        }
    }

    public final long b() {
        return 25000L;
    }

    public final long c() {
        return 25000L;
    }
}
