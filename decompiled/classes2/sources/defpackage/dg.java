package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dg extends defpackage.eaa {
    final /* synthetic */ defpackage.dh a;

    public dg(defpackage.dh dhVar) {
        this.a = dhVar;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void a() {
        dq dqVar = this.a.a;
        dqVar.r.setVisibility(8);
        android.widget.PopupWindow popupWindow = dqVar.s;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (dqVar.r.getParent() instanceof android.view.View) {
            android.view.View view = (android.view.View) dqVar.r.getParent();
            int i = dzs.a;
            view.requestApplyInsets();
        }
        dqVar.r.i();
        dqVar.L.m(null);
        dqVar.L = null;
        android.view.ViewGroup viewGroup = dqVar.w;
        int i2 = dzs.a;
        viewGroup.requestApplyInsets();
    }
}
