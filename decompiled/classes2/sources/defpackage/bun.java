package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bun implements defpackage.arr {
    public final float[] a;
    public aso b;
    public boolean c;
    public final ccp d;
    public final defpackage.arl e;
    public final aopm f;
    public final cei g;
    public final cei h;
    public final cei i;
    public final cei j;
    public final nf k;
    private boolean l;
    private final ccp m;
    private final ceg n;
    private final ceg o;
    private final ceg p;

    public bun(float f, aopm aopmVar) {
        this.f = aopmVar;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(f);
        this.l = true;
        this.a = new float[0];
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.b = aso.b;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar = cdu.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        float fA = defpackage.bul.a(((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue(), f);
        this.o = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(((1.0f - fA) * 0.0f) + (fA * 0.0f));
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.e = new defpackage.bum(this, 0);
        this.k = new nf((char[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.arr
    public final java.lang.Object a(defpackage.aoc aocVar, aonn aonnVar, aoln aolnVar) {
        java.lang.Object objM = aosv.m(new defpackage.amh(this, aocVar, aonnVar, (aoln) null, 13), aolnVar);
        return objM != aolu.a ? aojh.a : objM;
    }

    public final float b() {
        aopm aopmVar = this.f;
        return defpackage.bul.a(((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue(), aooc.s(d(), ((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue()));
    }

    public final float c() {
        return this.o.c();
    }

    public final float d() {
        return this.n.c();
    }

    public final int e() {
        return this.j.c();
    }

    public final int f() {
        return this.i.c();
    }

    public final int g() {
        return this.g.c();
    }

    public final void h(float f, aonj aonjVar) {
        float fMax;
        float fMin;
        if (this.b == aso.a) {
            fMax = java.lang.Math.max(this.h.c() - (e() / 2.0f), 0.0f);
            fMin = java.lang.Math.min(e() / 2.0f, fMax);
        } else {
            fMax = java.lang.Math.max(g() - (f() / 2.0f), 0.0f);
            fMin = java.lang.Math.min(f() / 2.0f, fMax);
        }
        this.o.h(c() + f + this.p.c());
        j(0.0f);
        float fC = c();
        aopm aopmVar = this.f;
        float fFloatValue = ((java.lang.Number) aopmVar.b()).floatValue();
        float fFloatValue2 = ((java.lang.Number) aopmVar.a()).floatValue();
        float fA = defpackage.bul.a(fMin, fMax, fC);
        float f2 = ((1.0f - fA) * fFloatValue) + (fA * fFloatValue2);
        if (f2 != d()) {
            if (aonjVar != null) {
                aonjVar.a(java.lang.Float.valueOf(f2));
            } else {
                k(f2);
            }
        }
    }

    public final void i(boolean z) {
        this.m.b(java.lang.Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.p.h(f);
    }

    public final void k(float f) {
        if (this.l) {
            aopm aopmVar = this.f;
            f = aooc.s(f, ((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue());
            ((java.lang.Number) aopmVar.b()).floatValue();
            ((java.lang.Number) aopmVar.a()).floatValue();
        }
        this.n.h(f);
    }

    public final boolean l() {
        return ((java.lang.Boolean) this.m.a()).booleanValue();
    }

    public bun() {
        this(0.0f, new aopm(0.0f, 1.0f));
    }
}
