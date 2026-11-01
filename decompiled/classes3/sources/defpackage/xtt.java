package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtt implements defpackage.yfa, defpackage.yeo {
    public volatile defpackage.xua a;
    public final java.util.List b;
    public final defpackage.xff c;
    private volatile defpackage.yek d;
    private volatile java.lang.Object e;
    private final aows f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public xtt(aows aowsVar, defpackage.xff xffVar) throws aois {
        aooh.f(aowsVar, "scope");
        this.f = aowsVar;
        this.c = xffVar;
        this.b = new java.util.ArrayList();
        j$.util.Objects.checkIndex(0, 3);
        if (xffVar instanceof defpackage.xtx) {
            this.a = ((defpackage.xtx) xffVar).a;
        } else {
            if (!(xffVar instanceof defpackage.xts)) {
                throw new aois();
            }
            aoov.an(aowsVar, (aolr) null, 0, new defpackage.uke(this, (aoln) null, 11), 3);
        }
    }

    @Override // defpackage.yfa
    public final void a(android.graphics.drawable.Drawable drawable) {
        this.f.b(new defpackage.xty(defpackage.xub.d, drawable));
    }

    @Override // defpackage.yfa
    public final void c(java.lang.Object obj, defpackage.yfi yfiVar) {
        this.e = obj;
        defpackage.yek yekVar = this.d;
        this.f.b(new defpackage.xtz((yekVar == null || !yekVar.l()) ? defpackage.xub.b : defpackage.xub.c, obj));
    }

    @Override // defpackage.yeo
    public final boolean d(defpackage.xxa xxaVar, defpackage.yfa yfaVar) {
        java.lang.Object obj = this.e;
        defpackage.yek yekVar = this.d;
        if (obj == null || yekVar == null || yekVar.l() || yekVar.n()) {
            return false;
        }
        this.f.b(new defpackage.xtz(defpackage.xub.d, obj));
        return false;
    }

    @Override // defpackage.yeo
    public final boolean e(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.xuc xucVar) {
        return false;
    }

    @Override // defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
        this.e = null;
        this.f.b(new defpackage.xty(defpackage.xub.a, drawable));
    }

    @Override // defpackage.yfa
    public final defpackage.yek f() {
        return this.d;
    }

    @Override // defpackage.yfa
    public final void g(defpackage.yez yezVar) {
        defpackage.xua xuaVar = this.a;
        if (xuaVar != null) {
            yezVar.g(xuaVar.a, xuaVar.b);
            return;
        }
        synchronized (this) {
            defpackage.xua xuaVar2 = this.a;
            if (xuaVar2 != null) {
                yezVar.g(xuaVar2.a, xuaVar2.b);
            } else {
                this.b.add(yezVar);
            }
        }
    }

    @Override // defpackage.yfa
    public final void h(android.graphics.drawable.Drawable drawable) {
        this.e = null;
        this.f.b(new defpackage.xty(defpackage.xub.b, drawable));
    }

    @Override // defpackage.yfa
    public final void l(defpackage.yez yezVar) {
        synchronized (this) {
            this.b.remove(yezVar);
        }
    }

    @Override // defpackage.yfa
    public final void m(defpackage.yek yekVar) {
        this.d = yekVar;
    }

    @Override // defpackage.ydm
    public final void i() {
    }

    @Override // defpackage.ydm
    public final void j() {
    }

    @Override // defpackage.ydm
    public final void k() {
    }
}
