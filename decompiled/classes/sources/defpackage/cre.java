package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cre extends defpackage.cmv implements defpackage.dbd, defpackage.ddc {
    public float a;
    public float b;
    public float c;
    public float f;
    public float i;
    public float j;
    public long k;
    public defpackage.crd l;
    public boolean m;
    public long n;
    public long o;
    public int p;
    public defpackage.cqr s;
    public float d = 0.0f;
    public float e = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public defpackage.sa F = null;
    public int q = 3;
    public defpackage.cqh r = null;
    public final defpackage.aonj E = new defpackage.bjp(this, 13);

    public cre(float f, float f2, float f3, float f4, float f5, float f6, long j, defpackage.crd crdVar, boolean z, long j2, long j3, int i, defpackage.cqr cqrVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.f = f4;
        this.i = f5;
        this.j = f6;
        this.k = j;
        this.l = crdVar;
        this.m = z;
        this.n = j2;
        this.o = j3;
        this.p = i;
        this.s = cqrVar;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        if (this.m) {
            diqVar.a(defpackage.din.U, this.l);
        }
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.bet(czcVarV, this, 7, null));
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.c(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.d(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.e(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.f(new dbc(this), cxfVar, cxeVar, i);
    }

    public final java.lang.String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.f + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.i + ", cameraDistance=" + this.j + ", transformOrigin=" + defpackage.crg.a(this.k) + ", shape=" + this.l + ", clip=" + this.m + ", renderEffect=null, ambientShadowColor=" + defpackage.cqg.g(this.n) + ", spotShadowColor=" + defpackage.cqg.g(this.o) + ", compositingStrategy=" + defpackage.cqk.a(this.p) + ", blendMode=" + defpackage.cpz.a(this.q) + ", colorFilter=nulloutsets=" + this.s + ')';
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final boolean y() {
        return false;
    }
}
