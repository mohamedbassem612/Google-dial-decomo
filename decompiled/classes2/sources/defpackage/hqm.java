package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqm implements defpackage.zd {
    final /* synthetic */ defpackage.hqp a;
    final /* synthetic */ defpackage.hqg b;

    public hqm(defpackage.hqp hqpVar, defpackage.hqg hqgVar) {
        this.a = hqpVar;
        this.b = hqgVar;
    }

    @Override // defpackage.zd
    public final void a(java.lang.String str) {
        aooh.f(str, "tabIdString");
        defpackage.hqp hqpVar = this.a;
        ahpz ahpzVar = hqpVar.b;
        aonj aonjVar = this.b.b;
        ahok ahokVarF = ahpzVar.f(78, "TabTemplateConverter.onTabSelected");
        try {
            defpackage.hqh hqhVar = (defpackage.hqh) java.lang.Enum.valueOf(defpackage.hqh.class, str);
            defpackage.hqp.a.b().l("com/android/dialer/androidauto/impl/tab/TabTemplateConverter", "onTabSelected$<anonymous>", 227, "TabTemplateConverter.kt").y("Tab selected: %s", hqpVar.e.get(hqhVar));
            hqpVar.i.i(ahvr.ag(hqpVar.d, hqpVar.h, new defpackage.fyn(hqhVar, hqpVar, (aoln) null, 5)));
            aonjVar.a(hqhVar);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
