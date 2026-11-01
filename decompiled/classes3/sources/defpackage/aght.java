package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aght implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aght(java.lang.Object obj, android.view.View.OnClickListener onClickListener, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = onClickListener;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            this.b.onClick(view);
            ((defpackage.aghu) this.a).c++;
            return;
        }
        if (i == 1) {
            int id = view.getId();
            defpackage.aggf aggfVar = (defpackage.aggf) this.b;
            if (id == aggfVar.i) {
                defpackage.aggf.C.x("Primary button is clicked.");
                aggfVar.x.b(1);
            } else if (view.getId() == aggfVar.j) {
                defpackage.aggf.C.x("Secondary button is clicked.");
                aggfVar.x.b(2);
            } else if (view.getId() == 0) {
                defpackage.aggf.C.x("Tertiary button is clicked.");
                aggfVar.x.b(3);
            }
            ((defpackage.aggh) this.a).onClick(view);
            return;
        }
        if (i == 2) {
            ((com.google.android.material.button.MaterialButton) this.b).setClickable(false);
            ((defpackage.agiu) this.a).b();
            return;
        }
        boolean zI = afsq.I(view);
        ?? r1 = this.b;
        if (zI) {
            ahok ahokVarG = ((ahpz) ((ajwr) this.a).b).g(1483, ajwr.i("Toolbar navigation clicked", view));
            try {
                r1.onClick(view);
                ahokVarG.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarG.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public /* synthetic */ aght(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
