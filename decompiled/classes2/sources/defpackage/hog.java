package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hog extends amzm {
    private final amzg b;

    public hog(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.hog.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        pom pomVar = (pom) obj;
        aooh.f(pomVar, "contactGridModel");
        java.lang.CharSequence charSequence = pomVar.e.a;
        return aiql.z(new defpackage.hnh(charSequence != null ? charSequence.toString() : "", pomVar.c.a));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
