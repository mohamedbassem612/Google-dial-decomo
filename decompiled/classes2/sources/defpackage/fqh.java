package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqh {
    public final defpackage.fqn a;
    public final defpackage.fqq b;
    public final defpackage.fmk c;
    public final defpackage.fml d;
    public final boolean e;
    public final boolean f;
    public int g;
    public defpackage.eqg h;

    public fqh(defpackage.fqn fqnVar, defpackage.fqq fqqVar, defpackage.fmk fmkVar) {
        this.a = fqnVar;
        this.b = fqqVar;
        this.c = fmkVar;
        this.e = fqnVar.b == 2;
        this.f = j$.util.Objects.equals(fqnVar.g.p, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(fqnVar.g.p) ? new defpackage.fml() : null;
    }
}
