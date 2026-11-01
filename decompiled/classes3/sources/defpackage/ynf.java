package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynf extends defpackage.ylk {
    public final defpackage.ymk a;
    public final defpackage.yml b;
    private final java.util.concurrent.Executor c;
    private final dsd d;

    public ynf(defpackage.ymk ymkVar, defpackage.yml ymlVar, java.util.concurrent.Executor executor, dsd dsdVar) {
        this.a = ymkVar;
        this.b = ymlVar;
        this.c = executor;
        this.d = dsdVar;
    }

    @Override // defpackage.yll
    public final void a(java.lang.String str) {
        this.c.execute(new defpackage.yne(this, 0));
        this.d.b((java.lang.Object) null);
    }

    @Override // defpackage.yll
    public final void b(java.lang.String str, int i, java.lang.String str2) {
        defpackage.ymi ymiVar = new defpackage.ymi(1, i == 1 ? 501 : 0, java.lang.String.format(java.util.Locale.ENGLISH, "Feature %s failed with failure status %d and error %s.", str, java.lang.Integer.valueOf(i), str2), null);
        this.c.execute(new mo(this, i, ymiVar, 10));
        this.d.d(ymiVar);
    }

    @Override // defpackage.yll
    public final void c(java.lang.String str, long j) {
        this.c.execute(new defpackage.qpl(this, j, 3));
    }

    @Override // defpackage.yll
    public final void d(java.lang.String str, long j) {
        this.c.execute(new defpackage.qpl(this, j, 2));
    }
}
