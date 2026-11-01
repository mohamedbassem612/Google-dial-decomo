package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrm extends dap implements dan, dau, dcp {
    public crd a;
    public long b;
    public int c;
    public float d;
    public defpackage.acrq e;
    public int f;
    public aomy g;
    public aomy h;
    public final java.util.Map i;
    private long j;
    private java.lang.Boolean k;
    private final defpackage.acrg l;

    public acrm(crd crdVar, long j) {
        aooh.f(crdVar, "shape");
        this.a = crdVar;
        this.b = j;
        this.c = 3;
        this.j = 0L;
        this.d = 1.0f;
        defpackage.acrg acrgVar = new defpackage.acrg(new defpackage.acrc[0], this.a, j);
        V(acrgVar);
        this.l = acrgVar;
        this.e = defpackage.acrr.a;
        this.f = 120;
        this.g = new defpackage.abna(5);
        this.h = new defpackage.abna(6);
        this.i = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    public final void a(cxi cxiVar) {
        aooh.f(cxiVar, "coordinates");
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((int) (cxiVar.h() >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (cxiVar.h() & 4294967295L))) & 4294967295L);
        if (anty.ah(this.j, jFloatToRawIntBits)) {
            return;
        }
        this.j = jFloatToRawIntBits;
        if (aooh.n(java.lang.Boolean.valueOf((boolean) (((cpp.a(jFloatToRawIntBits) > ((dpf) cfo.G(this, dfo.e)).dl(((dpi) cfo.G(this, defpackage.acrp.a)).a) ? 1 : (cpp.a(jFloatToRawIntBits) == ((dpf) cfo.G(this, dfo.e)).dl(((dpi) cfo.G(this, defpackage.acrp.a)).a) ? 0 : -1)) ^ (-1)) >>> 31)), this.k) || !((cmv) this).D) {
            return;
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    public final void b() {
        cmy cmyVar = M().a.get(cmy.a);
        int i = ((cmyVar != null ? cmyVar.a() : 1.0f) != 0.0f || a.x(this.c, 0)) ? this.c : 5;
        defpackage.acru acruVarAK = afsq.aK(this.e);
        float fFloatValue = ((java.lang.Number) cfo.G(this, defpackage.acrn.a)).floatValue();
        bor borVar = ((bqv) cfo.G(this, bqx.a)).a;
        float fDl = ((dpf) cfo.G(this, dfo.e)).dl(((dpi) cfo.G(this, defpackage.acrp.a)).a);
        ?? r4 = ((cpp.a(this.j) > fDl ? 1 : (cpp.a(this.j) == fDl ? 0 : -1)) ^ (-1)) >>> 31;
        this.k = java.lang.Boolean.valueOf((boolean) r4);
        defpackage.acrc acrcVarA = acruVarAK.a(i, r4, this.b, borVar, new defpackage.abmn(this, 7), new defpackage.abmn(this, 8), this.f, fFloatValue, fDl, this.i);
        defpackage.acrg acrgVar = this.l;
        if (acrcVarA != null) {
            acrgVar.d(new defpackage.acrc[]{acrcVarA}, this.a, this.b, acruVarAK.b());
        } else {
            acrgVar.d(new defpackage.acrc[0], this.a, this.b, acruVarAK.b());
        }
    }

    public final void dc() {
        den.u(this, new defpackage.abmn(this, 10));
    }

    public final void v() {
        den.u(this, new defpackage.abmn(this, 9));
    }
}
