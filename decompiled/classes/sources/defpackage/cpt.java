package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpt implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public cpt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.apkl) this.a).j(view.getContext());
        } else if (i == 1) {
            android.view.View view2 = (android.view.View) this.a;
            view2.removeOnAttachStateChangeListener(this);
            int i2 = defpackage.dzs.a;
            view2.requestApplyInsets();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aoub, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            android.content.Context context = view.getContext();
            defpackage.apkl apklVar = (defpackage.apkl) this.a;
            if (apklVar.a) {
                context.getApplicationContext().unregisterComponentCallbacks(apklVar.d);
                apklVar.a = false;
                return;
            }
            return;
        }
        if (i != 1) {
            if (i != 2) {
                view.removeOnAttachStateChangeListener(this);
                this.a.s(null);
                return;
            }
            java.lang.Object obj = this.a;
            java.util.Iterator itA = defpackage.aooc.h(((android.view.View) obj).getParent(), dzx.a).a();
            while (itA.hasNext()) {
                java.lang.Object obj2 = (android.view.ViewParent) itA.next();
                if (obj2 instanceof android.view.View) {
                    android.view.View view2 = (android.view.View) obj2;
                    if (view2 == null) {
                        defpackage.aooh.i("<this>");
                    }
                    java.lang.Object tag = view2.getTag(2131428422);
                    java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        return;
                    }
                }
            }
            ((defpackage.ddl) obj).g();
        }
    }
}
