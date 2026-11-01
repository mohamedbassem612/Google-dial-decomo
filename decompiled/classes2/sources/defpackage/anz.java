package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class anz extends dca {
    private final aonj a;
    private final aonj d;
    private final defpackage.aol f;
    private final aonj b = null;
    private final float e = Float.NaN;

    public anz(aonj aonjVar, aonj aonjVar2, defpackage.aol aolVar) {
        this.a = aonjVar;
        this.d = aonjVar2;
        this.f = aolVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aoa(this.a, this.d, this.f);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aoa aoaVar = (defpackage.aoa) cmvVar;
        float f = aoaVar.c;
        long j = aoaVar.e;
        float f2 = aoaVar.f;
        boolean z = aoaVar.d;
        float f3 = aoaVar.g;
        boolean z2 = aoaVar.h;
        defpackage.aol aolVar = aoaVar.o;
        android.view.View view = aoaVar.i;
        dpf dpfVar = aoaVar.j;
        aoaVar.a = this.a;
        aoaVar.c = Float.NaN;
        aoaVar.d = true;
        aoaVar.e = 9205357640488583168L;
        aoaVar.f = Float.NaN;
        aoaVar.g = Float.NaN;
        aoaVar.h = true;
        aoaVar.b = this.d;
        defpackage.aol aolVar2 = this.f;
        aoaVar.o = aolVar2;
        android.view.View viewF = wl.f(aoaVar);
        dpf dpfVarD = cfo.D(aoaVar);
        if (aoaVar.n != null && (!anty.ah(9205357640488583168L, j) || !dpi.c(Float.NaN, f2) || !dpi.c(Float.NaN, f3) || !z || !z2 || !aooh.n(aolVar2, aolVar) || !aooh.n(viewF, view) || !aooh.n(dpfVarD, dpfVar))) {
            aoaVar.b();
        }
        aoaVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.anz) {
            defpackage.anz anzVar = (defpackage.anz) obj;
            if (this.a == anzVar.a) {
                aonj aonjVar = anzVar.b;
                float f = anzVar.e;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + 2143289344) * 31) + 1231) * 31) + anty.M(9205357640488583168L)) * 31) + 2143289344) * 31) + 2143289344) * 31) + 1231) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }
}
