package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfm extends defpackage.ced implements java.lang.Iterable, defpackage.cma, defpackage.aoow {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public java.util.HashMap i;
    public defpackage.aco j;
    public int[] a = new int[0];
    public java.lang.Object[] c = new java.lang.Object[0];
    public java.util.ArrayList h = new java.util.ArrayList();

    public static final void g(defpackage.cfp cfpVar, int i) {
        while (cfpVar.q >= 0 && cfpVar.p <= i) {
            cfpVar.I();
            cfpVar.V();
        }
    }

    @Override // defpackage.ced
    public final void a() {
        this.j = new defpackage.aco(6);
    }

    @Override // defpackage.ced
    public final void b() {
        this.i = new java.util.HashMap();
    }

    @Override // defpackage.ced
    public final boolean c() {
        return this.b == 0;
    }

    public final int d(defpackage.cfh cfhVar) {
        if (this.f) {
            defpackage.cax.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!cfhVar.a()) {
            defpackage.cdh.a("Anchor refers to a group that was removed");
        }
        return cfhVar.a;
    }

    public final defpackage.cfl e() {
        if (this.f) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new defpackage.cfl(this);
    }

    public final defpackage.cfp f() {
        if (this.f) {
            defpackage.cax.b("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            defpackage.cax.b("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new defpackage.cfp(this);
    }

    public final boolean h(defpackage.cfh cfhVar) {
        int iC;
        return cfhVar.a() && (iC = defpackage.cfo.c(this.h, cfhVar.a, this.b)) >= 0 && defpackage.aooh.n(this.h.get(iC), cfhVar);
    }

    public final void i(int[] iArr, int i, java.lang.Object[] objArr, int i2, java.util.ArrayList arrayList, java.util.HashMap map, defpackage.aco acoVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = acoVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new cfi(this, 0, this.b);
    }

    public final rr j(int i) {
        int i2;
        java.util.HashMap map = this.i;
        if (map == null) {
            return null;
        }
        if (this.f) {
            defpackage.cax.b("use active SlotWriter to crate an anchor for location instead");
        }
        defpackage.cfh cfhVarE = (i < 0 || i >= (i2 = this.b)) ? null : defpackage.cfo.e(this.h, i, i2);
        if (cfhVarE != null) {
            return (rr) map.get(cfhVarE);
        }
        return null;
    }
}
