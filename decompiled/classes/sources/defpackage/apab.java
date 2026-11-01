package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apab extends defpackage.aozv {
    private final java.lang.Iterable d;

    public /* synthetic */ apab(java.lang.Iterable iterable) {
        this(iterable, defpackage.aols.a, -2, 1);
    }

    @Override // defpackage.aozv
    public final java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar) {
        defpackage.apar aparVar = new defpackage.apar(aowsVar);
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            defpackage.aoov.an(aowsVar, null, 0, new defpackage.aeef((defpackage.aoxh) it.next(), aparVar, (defpackage.aoln) null, 3), 3);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aozv
    protected final defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2) {
        return new defpackage.apab(this.d, aolrVar, i, i2);
    }

    @Override // defpackage.aozv
    public final defpackage.aowu e(defpackage.aoss aossVar) {
        return defpackage.aooh.E(aossVar, this.a, this.b, 1, 1, new defpackage.efu((defpackage.aozv) this, (defpackage.aoln) null, 7));
    }

    public apab(java.lang.Iterable iterable, defpackage.aolr aolrVar, int i, int i2) {
        super(aolrVar, i, i2);
        this.d = iterable;
    }
}
