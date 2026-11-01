package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgt implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.lang.Object b;

    public dgt(android.view.View view, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        defpackage.emx emxVar;
        if (this.$cid != 0) {
            android.view.View view2 = this.a;
            android.view.View view3 = view2;
            while (true) {
                emxVar = null;
                if (view3 == null) {
                    break;
                }
                java.lang.Object tag = view3.getTag(2131429434);
                defpackage.emx emxVar2 = tag instanceof defpackage.emx ? (defpackage.emx) tag : null;
                if (emxVar2 != null) {
                    emxVar = emxVar2;
                    break;
                } else {
                    java.lang.Object objD = defpackage.dzp.d(view3);
                    view3 = objD instanceof android.view.View ? (android.view.View) objD : null;
                }
            }
            if (emxVar == null) {
                defpackage.cwh.b(defpackage.a.bg(view2, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new defpackage.aoiq();
            }
            defpackage.ddl ddlVar = (defpackage.ddl) view2;
            ((defpackage.aoot) this.b).a = defpackage.dfa.h(ddlVar, emxVar.P());
            ddlVar.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        if (this.$cid == 0) {
            this.a.removeOnAttachStateChangeListener(this);
            ((defpackage.cds) this.b).D();
        }
    }
}
