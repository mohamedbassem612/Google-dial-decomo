package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dqr extends cmv implements coy {
    public final void c(defpackage.cow cowVar) {
        android.view.View viewG = defpackage.dpm.g(this);
        boolean z = false;
        if (((cmv) this).t.D && defpackage.dpm.g(this).hasFocusable()) {
            z = true;
        }
        cowVar.a(z);
        android.view.View viewFindFocus = viewG.findFocus();
        if (viewFindFocus != null) {
            cowVar.b(con.b(viewFindFocus, viewG));
        }
    }
}
