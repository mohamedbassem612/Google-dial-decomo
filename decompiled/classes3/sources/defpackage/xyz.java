package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xyz implements defpackage.xvb {
    private final android.content.res.Resources.Theme a;
    private final android.content.res.Resources b;
    private final defpackage.xza c;
    private final int d;
    private java.lang.Object e;

    public xyz(android.content.res.Resources.Theme theme, android.content.res.Resources resources, defpackage.xza xzaVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = xzaVar;
        this.d = i;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.c.a();
    }

    @Override // defpackage.xvb
    public final void e() {
        java.lang.Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        try {
            java.lang.Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            xvaVar.c(objC);
        } catch (android.content.res.Resources.NotFoundException e) {
            xvaVar.f(e);
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }
}
