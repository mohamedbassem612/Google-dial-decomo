package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggt implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.View a;

    public aggt(com.google.android.setupdesign.GlifLayout glifLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(glifLayout);
        this.a = glifLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.$cid;
        android.view.View view = this.a;
        if (i != 0) {
            ((defpackage.agbj) view).h();
        } else {
            ((com.google.android.setupdesign.GlifLayout) view).u();
        }
    }

    public /* synthetic */ aggt(defpackage.agbj agbjVar, int i) {
        this.$cid = i;
        this.a = agbjVar;
    }
}
