package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agii {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Enum c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;

    public agii(defpackage.dpq dpqVar, defpackage.aoss aossVar, defpackage.aonn aonnVar, defpackage.bbh bbhVar, int i) {
        defpackage.aooh.f(dpqVar, "layoutDirection");
        defpackage.aooh.f(aossVar, "scope");
        defpackage.aooh.f(bbhVar, "state");
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
        this.d = defpackage.aooh.H(0, 0, null, 7);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
        this.c = dpqVar;
        this.i = aossVar;
        this.j = aonnVar;
        this.b = bbhVar;
        this.a = i;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.e = defpackage.aij.a(0.0f);
    }

    public static float k(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final java.lang.Integer a() {
        return (java.lang.Integer) this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ccp, java.lang.Object] */
    public final void b(java.lang.Integer num) {
        this.f.b(num);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ccp, java.lang.Object] */
    public final void c(java.lang.Integer num) {
        this.k.b(num);
    }

    public final float d() {
        return ((defpackage.ceg) this.g).c();
    }

    public final float e() {
        defpackage.baz bazVarJ = j();
        if (bazVarJ != null) {
            return (((defpackage.cei) this.h).c() + d()) - i(bazVarJ);
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [aoss, java.lang.Object] */
    public final void f() {
        if (a() != null) {
            c(a());
            defpackage.aoov.an(this.i, null, 0, new bvw(this, e(), (defpackage.aoln) null, 4), 3);
        }
        g(0.0f);
        b(null);
        h(0);
    }

    public final void g(float f) {
        ((defpackage.ceg) this.g).h(f);
    }

    public final void h(int i) {
        ((defpackage.cei) this.h).h(i);
    }

    public final int i(defpackage.baz bazVar) {
        if (this.c != defpackage.dpq.b) {
            return bazVar.g;
        }
        return (((int) (((defpackage.bbh) this.b).j().d() >> 32)) - bazVar.g) - bazVar.h;
    }

    public final defpackage.baz j() {
        java.lang.Object next;
        java.util.Iterator it = ((defpackage.bbh) this.b).j().k.iterator();
        while (it.hasNext()) {
            next = it.next();
            int i = ((defpackage.baz) next).a;
            java.lang.Integer numA = a();
            if (numA != null && i == numA.intValue()) {
                return (defpackage.baz) next;
            }
        }
        next = null;
        return (defpackage.baz) next;
    }

    public agii() {
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
        this.d = defpackage.aooh.H(0, 0, null, 7);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
    }

    public agii(agfx agfxVar, agfx agfxVar2, agfx agfxVar3, agfx agfxVar4, agfx agfxVar5, agfx agfxVar6, agfx agfxVar7, agfx agfxVar8, agfx agfxVar9, agfx agfxVar10, int i) {
        this.b = agfxVar;
        this.c = agfxVar2;
        this.d = agfxVar3;
        this.e = agfxVar4;
        this.f = agfxVar5;
        this.g = agfxVar6;
        this.h = agfxVar7;
        this.i = agfxVar8;
        this.j = agfxVar9;
        this.k = agfxVar10;
        this.a = i;
    }
}
