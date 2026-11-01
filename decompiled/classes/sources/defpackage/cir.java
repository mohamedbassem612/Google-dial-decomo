package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cir extends defpackage.aoju implements j$.util.Set, java.util.Collection, defpackage.chl, defpackage.aoow {
    public static final defpackage.cir a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final defpackage.cic d;

    static {
        defpackage.ciu ciuVar = defpackage.ciu.a;
        a = new defpackage.cir(ciuVar, ciuVar, defpackage.cic.a);
    }

    public cir(java.lang.Object obj, java.lang.Object obj2, defpackage.cic cicVar) {
        this.b = obj;
        this.c = obj2;
        this.d = cicVar;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.d.b();
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.aoju, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new cis(this.b, this.d);
    }
}
