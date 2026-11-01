package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyr implements defpackage.xvb {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public xyr(android.content.Context context, android.graphics.drawable.Icon icon, int i) {
        this.$cid = i;
        aooh.f(context, "context");
        aooh.f(icon, "icon");
        this.b = context;
        this.a = icon;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xyq] */
    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.$cid != 0 ? android.graphics.drawable.Drawable.class : this.b.a();
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        int i = this.$cid;
        return defpackage.xuc.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xyq] */
    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        if (this.$cid == 0) {
            xvaVar.c(this.b.b((byte[]) this.a));
            return;
        }
        aooh.f(xsmVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        android.graphics.drawable.Drawable drawableLoadDrawable = ((android.graphics.drawable.Icon) this.a).loadDrawable((android.content.Context) this.b);
        if (drawableLoadDrawable != null) {
            xvaVar.c(drawableLoadDrawable);
        } else {
            xvaVar.f(new java.lang.IllegalArgumentException("Unable to load icon"));
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }

    @Override // defpackage.xvb
    public final void e() {
    }

    public xyr(byte[] bArr, defpackage.xyq xyqVar, int i) {
        this.$cid = i;
        this.a = bArr;
        this.b = xyqVar;
    }
}
