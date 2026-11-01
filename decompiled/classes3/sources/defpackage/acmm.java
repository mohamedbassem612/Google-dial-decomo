package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmm {
    public final defpackage.vaa a;

    public acmm(defpackage.vaa vaaVar) {
        this.a = vaaVar;
    }

    public final void a(android.view.View view, defpackage.acma acmaVar) {
        afec.c();
        defpackage.acmd acmdVarC = acmaVar.c(this.a);
        defpackage.acmd acmdVarB = defpackage.acml.b(view);
        if (acmdVarB == null) {
            defpackage.acml acmlVar = new defpackage.acml(view, acmdVarC);
            acmdVarC.a = acmlVar;
            android.view.View view2 = acmlVar.a;
            view2.setTag(2131429374, acmlVar.b);
            if (acmlVar.f.I()) {
                view2.addOnAttachStateChangeListener(acmlVar);
                int i = dzs.a;
                if (view2.isAttachedToWindow()) {
                    acmlVar.onViewAttachedToWindow(view2);
                    return;
                }
                return;
            }
            return;
        }
        if (acmdVarB.b()) {
            if (acmdVarB.c()) {
                aaoo.as(new java.lang.IllegalStateException("CVE is already impressed and cannot be replaced."));
                return;
            } else {
                aaoo.as(new java.lang.IllegalStateException("CVE is already attached and cannot be replaced."));
                return;
            }
        }
        ahvr.bY(acmdVarC.a == null);
        ahvr.bY(!acmdVarB.b());
        ahvr.bY(acmdVarB.f == acmdVarC.f);
        boolean zL = acmdVarB.a.l();
        if (zL) {
            acmdVarB.d.H(acmdVarB);
        }
        akzz akzzVar = acmdVarB.c;
        akzzVar.x();
        akzzVar.z(acmdVarC.c.p());
        if (zL) {
            acmdVarB.d.G(acmdVarB);
        }
    }
}
