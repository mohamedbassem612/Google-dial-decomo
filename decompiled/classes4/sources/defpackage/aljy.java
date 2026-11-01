package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljy {
    private static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ErrorHandlerImpl");
    public j$.util.Optional a = j$.util.Optional.empty();

    public final synchronized void a(java.lang.Throwable th, java.lang.String str, java.lang.String str2, defpackage.aljr aljrVar) {
        b.c().k(th).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ErrorHandlerImpl", "handleException", 25, "ErrorHandlerImpl.java").I("%s(): %s", str2, str);
        try {
            j$.util.Optional optional = this.a;
            defpackage.alkq alkqVar = new defpackage.alkq(str, aljrVar, th, 1);
            if (true != optional.isPresent()) {
                return;
            }
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = alkqVar.b;
            java.lang.String str3 = (java.lang.String) obj2;
            defpackage.amgv amgvVar = (defpackage.amgv) obj;
            amgvVar.c(new defpackage.aljs(str3, (defpackage.aljr) alkqVar.a, (java.lang.Throwable) alkqVar.c));
        } catch (java.lang.RuntimeException e) {
            b.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ErrorHandlerImpl", "handleException", 29, "ErrorHandlerImpl.java").y("%s(): Error while reporting an exception.", str2);
        }
    }
}
