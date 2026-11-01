package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoxe extends defpackage.aozv {
    private final defpackage.aonn d;

    public /* synthetic */ aoxe(defpackage.aonn aonnVar) {
        this(aonnVar, defpackage.aols.a, -2, 1);
    }

    static /* synthetic */ java.lang.Object g(defpackage.aoxe aoxeVar, defpackage.aows aowsVar, defpackage.aoln aolnVar) {
        java.lang.Object objA = aoxeVar.d.a(aowsVar, aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    @Override // defpackage.aozv
    public java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar) {
        return g(this, aowsVar, aolnVar);
    }

    @Override // defpackage.aozv
    protected defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2) {
        return new defpackage.aoxe(this.d, aolrVar, i, i2);
    }

    @Override // defpackage.aozv
    public final java.lang.String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public aoxe(defpackage.aonn aonnVar, defpackage.aolr aolrVar, int i, int i2) {
        super(aolrVar, i, i2);
        this.d = aonnVar;
    }
}
