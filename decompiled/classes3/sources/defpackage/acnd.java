package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acnd extends defpackage.acmg {
    public final adae a;
    private final aclt b;

    public acnd(aclt acltVar, adae adaeVar) {
        this.b = acltVar;
        this.a = adaeVar;
    }

    @Override // defpackage.acmg
    public final void a(final acmf acmfVar, final defpackage.acmd acmdVar) {
        this.b.b(new acls() { // from class: acnc
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
            public final java.util.List a() {
                defpackage.acmd acmdVar2 = acmdVar;
                aiwd aiwdVarA = aclm.a();
                ahvr.bZ(acmdVar2 != null, "View is not instrumented.");
                ?? r4 = acmdVar2.d.a;
                if (!r4.isEmpty()) {
                    if (android.util.Log.isLoggable("GIL", 2)) {
                        android.util.Log.v("GIL", "Interaction: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(acmdVar2))));
                    }
                    for (defpackage.aprf aprfVar : r4) {
                        afec.c();
                        java.lang.Object obj = aprfVar.a;
                        defpackage.acmz acmzVar = (defpackage.acmz) obj;
                        java.lang.Runnable runnable = acmzVar.e;
                        if (runnable != null) {
                            afec.f(runnable);
                            defpackage.acmq acmqVar = acmzVar.b;
                            j$.util.Objects.requireNonNull(obj);
                            acmqVar.a(new defpackage.absj(obj, 6)).run();
                        }
                    }
                }
                ahvr.ce(acmdVar2.c(), "VE is not impressed: %s {attached=%s}", acmdVar2, java.lang.Boolean.valueOf(acmdVar2.a.l()));
                ahvr.cc(acmdVar2.d() == 1, "VE is not visible: %s", acmdVar2);
                acmf acmfVar2 = acmfVar;
                defpackage.acnd acndVar = this.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                aaoo.ay(acmdVar2, arrayList);
                acndVar.a.y();
                return aify.p(new acnl(aiwdVarA, arrayList, acmfVar2, -1L, false));
            }
        });
    }
}
