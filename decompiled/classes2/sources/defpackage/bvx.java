package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvx extends cmv implements dbd {
    public boolean a;
    public ajl b;
    public boolean c;
    public aii d;
    public aii e;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public kaw h;

    public bvx(kaw kawVar, boolean z, ajl ajlVar) {
        this.h = kawVar;
        this.a = z;
        this.b = ajlVar;
    }

    public final boolean cO() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        float f;
        defpackage.bvx bvxVar;
        boolean z = (cydVar.c(dpd.b(j)) == 0 || cydVar.d(dpd.a(j)) == 0) ? false : true;
        if (this.c) {
            f = 28.0f;
        } else {
            f = (z || this.a) ? 24.0f : 16.0f;
        }
        float fDl = cyiVar.dl(f);
        aii aiiVar = this.e;
        int iFloatValue = (int) (aiiVar != null ? ((java.lang.Number) aiiVar.d()).floatValue() : fDl);
        czc czcVarV = cydVar.v(dpe.l(iFloatValue, iFloatValue));
        float fDl2 = cyiVar.dl((((32.0f - cyiVar.di(fDl)) + 0.0f) / 2.0f) + 0.0f);
        float fDl3 = cyiVar.dl(24.0f);
        if (this.c) {
            boolean z2 = this.a;
            if (z2) {
                fDl2 = fDl3 - cyiVar.dl(2.0f);
            } else if (!z2) {
                fDl2 = cyiVar.dl(2.0f);
            } else if (this.a) {
                fDl2 = fDl3;
            }
        } else if (this.a) {
            fDl2 = fDl3;
        }
        aii aiiVar2 = this.e;
        if (aooh.l(aiiVar2 != null ? (java.lang.Float) aiiVar2.c() : null, fDl)) {
            bvxVar = this;
        } else {
            bvxVar = this;
            aoov.an(M(), (aolr) null, 0, new defpackage.bvw(bvxVar, fDl, null, 1, null), 3);
        }
        aii aiiVar3 = bvxVar.d;
        if (!aooh.l(aiiVar3 != null ? (java.lang.Float) aiiVar3.c() : null, fDl2)) {
            aoov.an(bvxVar.M(), (aolr) null, 0, new defpackage.bvw(bvxVar, fDl2, (aoln) null, 0), 3);
        }
        if (java.lang.Float.isNaN(bvxVar.g) && java.lang.Float.isNaN(bvxVar.f)) {
            bvxVar.g = fDl;
            bvxVar.f = fDl2;
        }
        return den.z(cyiVar, iFloatValue, iFloatValue, new defpackage.bvv(czcVarV, bvxVar, fDl2, 0));
    }

    public final void cZ() {
        this.d = null;
        this.e = null;
        this.g = Float.NaN;
        this.f = Float.NaN;
    }

    public final void dc() {
        aoov.an(M(), (aolr) null, 0, new defpackage.bgx(this, (aoln) null, 16), 3);
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.f(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.g(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.h(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.i(this, cxfVar, cxeVar, i);
    }
}
