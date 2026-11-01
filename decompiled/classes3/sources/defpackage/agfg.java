package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agfg implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public agfg(mli mliVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(mliVar);
        this.a = mliVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        defpackage.aggf aggfVar;
        android.widget.LinearLayout linearLayout;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            defpackage.agfh agfhVar = (defpackage.agfh) obj;
            defpackage.agfo agfoVarA = defpackage.agfo.a(agfhVar.getContext());
            java.lang.String shortString = agfhVar.a.getComponentName().toShortString();
            android.app.Activity activity = agfhVar.a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("packageName", activity.getComponentName().getPackageName());
            bundle.putString("screenName", activity.getComponentName().getShortClassName());
            bundle.putInt("hash", obj.hashCode());
            bundle.putBoolean("focus", z);
            bundle.putLong("timeInMillis", java.lang.System.currentTimeMillis());
            agfoVarA.e(shortString, bundle);
            return;
        }
        if (i != 1) {
            if (!z || (linearLayout = (aggfVar = (defpackage.aggf) this.a).f) == null) {
                return;
            }
            if (linearLayout.getRootView() != null) {
                aggfVar.f.getRootView().requestApplyInsets();
                return;
            } else {
                aggfVar.f.requestApplyInsets();
                return;
            }
        }
        mli mliVar = (mli) this.a;
        android.view.View view = ((aw) mliVar.g).Q;
        if (view != null) {
            mliVar.j.c.a();
            mliVar.d = false;
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    public /* synthetic */ agfg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
