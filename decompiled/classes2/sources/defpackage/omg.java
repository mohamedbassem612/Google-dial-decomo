package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omg implements znk, znp, defpackage.olu {
    private final ahzh a = new ahzh(ahwr.a);

    @Override // defpackage.olu
    public final ajcq a() {
        otm otmVar = new otm((char[]) null);
        otmVar.a = "call_duration_in_minutes";
        otmVar.f(java.lang.String.format("%1$s:00-%1$s:59", java.lang.Long.toString(c(java.util.concurrent.TimeUnit.MINUTES))));
        return aiql.z(otmVar.e());
    }

    public final ajcq b() {
        ahzh ahzhVar = this.a;
        if (!ahzhVar.a) {
            ahzhVar.e();
        }
        return ajcm.a;
    }

    final long c(java.util.concurrent.TimeUnit timeUnit) {
        return this.a.a(timeUnit);
    }

    public final ajcq ek() {
        ahzh ahzhVar = this.a;
        if (ahzhVar.a) {
            ahzhVar.f();
        }
        return ajcm.a;
    }
}
