package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class df extends defpackage.eaa {
    final /* synthetic */ dq a;

    public df(dq dqVar) {
        this.a = dqVar;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void a() {
        dq dqVar = this.a;
        dqVar.r.setAlpha(1.0f);
        dqVar.L.m(null);
        dqVar.L = null;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void b() {
        dq dqVar = this.a;
        dqVar.r.setVisibility(0);
        if (dqVar.r.getParent() instanceof android.view.View) {
            android.view.View view = (android.view.View) dqVar.r.getParent();
            int i = dzs.a;
            view.requestApplyInsets();
        }
    }
}
