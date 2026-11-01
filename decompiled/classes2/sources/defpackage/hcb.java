package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcb implements cer {
    public final ccp a;
    public final ccp b;
    public final ccp c;
    public final ccp d;
    public final ccp e;
    private final ccp f;
    private final ccp g;
    private final cer h;
    private final ccp i;
    private final ccp j;
    private final ccp k;
    private final ccp l;
    private final cer m;
    private final nf n;

    public hcb() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar = cdu.c;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(1, cduVar);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(1, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Float.valueOf(1.0f), cduVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        defpackage.fxt fxtVar = new defpackage.fxt(this, 13);
        ajxw ajxwVar = ceo.a;
        this.h = new cbk(fxtVar, (cen) null);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(fValueOf, cduVar);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(fValueOf, cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(Long.MIN_VALUE, cduVar);
        this.m = new cbk(new defpackage.fxt(this, 14), (cen) null);
        new cbk(new defpackage.fxt(this, 15), (cen) null);
        this.n = new nf((char[]) null, (byte[]) null, (byte[]) null);
    }

    private final float q() {
        return ((java.lang.Number) this.h.a()).floatValue();
    }

    private final float r() {
        return ((java.lang.Number) this.j.a()).floatValue();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return java.lang.Float.valueOf(c());
    }

    public final float b() {
        return ((java.lang.Number) this.m.a()).floatValue();
    }

    public final float c() {
        return ((java.lang.Number) this.k.a()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) this.d.a()).floatValue();
    }

    public final int e() {
        return ((java.lang.Number) this.g.a()).intValue();
    }

    public final long f() {
        return ((java.lang.Number) this.l.a()).longValue();
    }

    public final defpackage.gzh g() {
        return (defpackage.gzh) this.i.a();
    }

    public final defpackage.hch h() {
        return (defpackage.hch) this.c.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object i(defpackage.gzh gzhVar, float f, int i, boolean z, aoln aolnVar) {
        defpackage.hbz hbzVar;
        if (aolnVar instanceof defpackage.hbz) {
            hbzVar = (defpackage.hbz) aolnVar;
            int i2 = hbzVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hbzVar.c = i2 - Integer.MIN_VALUE;
            } else {
                hbzVar = new defpackage.hbz(this, aolnVar);
            }
        } else {
            hbzVar = new defpackage.hbz(this, aolnVar);
        }
        defpackage.hbz hbzVar2 = hbzVar;
        java.lang.Object obj = hbzVar2.a;
        aolu aoluVar = aolu.a;
        int i3 = hbzVar2.c;
        if (i3 == 0) {
            aooc.af(obj);
            nf nfVar = this.n;
            defpackage.hca hcaVar = new defpackage.hca(this, gzhVar, f, i, z, null);
            hbzVar2.c = 1;
            if (nfVar.O(defpackage.aoc.a, hcaVar, hbzVar2) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void j(defpackage.gzh gzhVar) {
        this.i.b(gzhVar);
    }

    public final void k(int i) {
        this.g.b(java.lang.Integer.valueOf(i));
    }

    public final void l(long j) {
        this.l.b(java.lang.Long.valueOf(j));
    }

    public final void m(boolean z) {
        this.f.b(java.lang.Boolean.valueOf(z));
    }

    public final void n(float f) {
        defpackage.gzh gzhVarG;
        this.j.b(java.lang.Float.valueOf(f));
        if (((java.lang.Boolean) this.e.a()).booleanValue() && (gzhVarG = g()) != null) {
            f -= f % (1.0f / gzhVarG.l);
        }
        this.k.b(java.lang.Float.valueOf(f));
    }

    public final boolean o(int i, long j) {
        defpackage.gzh gzhVarG = g();
        if (gzhVarG != null) {
            long jF = f() == Long.MIN_VALUE ? 0L : j - f();
            l(j);
            defpackage.hch hchVarH = h();
            float f = hchVarH != null ? hchVarH.a : 0.0f;
            h();
            float fA = ((jF / 1000000) / gzhVarG.a()) * q();
            float fR = q() < 0.0f ? f - (r() + fA) : (r() + fA) - 1.0f;
            if (fR < 0.0f) {
                n(aooc.s(r(), f, 1.0f) + fA);
            } else {
                float f2 = 1.0f - f;
                int i2 = (int) (fR / f2);
                int i3 = i2 + 1;
                if (e() + i3 > i) {
                    n(b());
                    k(i);
                    return false;
                }
                k(e() + i3);
                float f3 = fR - (i2 * f2);
                n(q() < 0.0f ? 1.0f - f3 : f + f3);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object p(defpackage.gzh gzhVar, int i, int i2, float f, defpackage.hch hchVar, float f2, int i3, aoln aolnVar) {
        defpackage.hbw hbwVar;
        if (aolnVar instanceof defpackage.hbw) {
            hbwVar = (defpackage.hbw) aolnVar;
            int i4 = hbwVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hbwVar.c = i4 - Integer.MIN_VALUE;
            } else {
                hbwVar = new defpackage.hbw(this, aolnVar);
            }
        } else {
            hbwVar = new defpackage.hbw(this, aolnVar);
        }
        defpackage.hbw hbwVar2 = hbwVar;
        java.lang.Object obj = hbwVar2.a;
        aolu aoluVar = aolu.a;
        int i5 = hbwVar2.c;
        if (i5 == 0) {
            aooc.af(obj);
            nf nfVar = this.n;
            defpackage.hby hbyVar = new defpackage.hby(this, i, i2, f, hchVar, gzhVar, f2, i3, null);
            hbwVar2.c = 1;
            if (nf.S(nfVar, hbyVar, hbwVar2) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
