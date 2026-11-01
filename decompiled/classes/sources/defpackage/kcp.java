package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kcp implements defpackage.cbm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public kcp(defpackage.emx emxVar, defpackage.emv emvVar, int i) {
        this.$cid = i;
        this.a = emxVar;
        this.b = emvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.cbm
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            this.a.P().d(this.b);
        } else if (i != 1) {
            ((android.view.View) this.b).getViewTreeObserver().removeOnPreDrawListener(this.a);
        } else {
            ((defpackage.beu) this.b).a.h(this.a);
        }
    }

    public kcp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
