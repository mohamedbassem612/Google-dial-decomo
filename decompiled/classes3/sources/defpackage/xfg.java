package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xfg implements emv {
    private final aomy a;
    private final android.content.Intent b;
    private final aomy c;
    private final defpackage.xfp d;
    private boolean e;

    public xfg(aomy aomyVar, android.content.Intent intent, aomy aomyVar2, defpackage.xfp xfpVar) {
        aooh.f(aomyVar, "componentName");
        aooh.f(intent, "intent");
        aooh.f(aomyVar2, "isFinishing");
        this.a = aomyVar;
        this.b = intent;
        this.c = aomyVar2;
        this.d = xfpVar;
    }

    private final void b() {
        if (this.e || !((java.lang.Boolean) this.c.a()).booleanValue()) {
            return;
        }
        this.e = true;
        android.content.Intent intent = this.b;
        defpackage.xfp xfpVar = this.d;
        defpackage.xix xixVar = defpackage.xjb.c;
        long jC = defpackage.xhp.c(intent);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        aooh.f(instantNow, "timestamp");
        xixVar.a(new defpackage.xii(xfpVar.asNodeRef(), jC, instantNow));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(emx emxVar, emp empVar) throws aois {
        long j;
        switch (empVar.ordinal()) {
            case 0:
            case 1:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return;
            case 2:
                long jC = defpackage.xhp.c(this.b);
                if (jC == -1) {
                    aomy aomyVar = this.a;
                    java.util.Objects.toString(aomyVar);
                    defpackage.xox.e("OnboardingApiContract", java.lang.String.valueOf(aomyVar).concat(" does not contain node id."));
                    j = -1;
                } else {
                    j = jC;
                }
                defpackage.xfp xfpVar = this.d;
                defpackage.xix xixVar = defpackage.xjb.c;
                j$.time.Instant instantNow = j$.time.Instant.now();
                aooh.e(instantNow, "now(...)");
                aooh.f(instantNow, "timestamp");
                xixVar.a(new defpackage.xik(xfpVar.asNodeRef(), j, instantNow));
                if (j != -1) {
                    java.util.Map map = defpackage.xfp.waitingForResumeActivity;
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    if (map.containsKey(lValueOf)) {
                        java.lang.Long l = (java.lang.Long) defpackage.xfp.waitingForResumeActivity.get(lValueOf);
                        long jLongValue = l != null ? l.longValue() : -1L;
                        j$.time.Instant instantNow2 = j$.time.Instant.now();
                        aooh.e(instantNow2, "now(...)");
                        aooh.f(instantNow2, "timestamp");
                        xixVar.a(new defpackage.xil(xfpVar.asNodeRef(), jLongValue, j, instantNow2));
                        defpackage.xfp.waitingForResumeActivity.remove(lValueOf);
                        return;
                    }
                    return;
                }
                return;
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                b();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                b();
                defpackage.xfp.waitingForResumeActivity.remove(java.lang.Long.valueOf(defpackage.xhp.c(this.b)));
                return;
            default:
                throw new aois();
        }
    }
}
