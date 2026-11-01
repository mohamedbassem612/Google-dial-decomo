package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xto extends css implements cdv {
    public final emx a;
    public final boolean b;
    public final ccp c;
    private final defpackage.xsv d;
    private final ccp e;
    private final ccp f;
    private final ccp g;
    private final aoss h;
    private aoub i;
    private final ceg j;
    private final defpackage.xff k;

    public xto(defpackage.xsv xsvVar, defpackage.xff xffVar, aoss aossVar, emx emxVar) {
        aooh.f(xsvVar, "requestBuilder");
        aooh.f(aossVar, "scope");
        aooh.f(emxVar, "lifecycleOwner");
        this.d = xsvVar;
        this.k = xffVar;
        this.a = emxVar;
        this.b = xsvVar.b.g.a(defpackage.xrt.class);
        defpackage.xub xubVar = defpackage.xub.a;
        cdu cduVar = cdu.c;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(xubVar, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        aoss aossVarP = aosv.p(aossVar, new aovh(aooc.V(aossVar.c())));
        aosp aospVar = aoth.a;
        this.h = aosv.p(aossVarP, apcg.a.j());
        aoov.an(aossVar, (aolr) null, 0, new defpackage.wcj(this, (aoln) null, 19), 3);
    }

    private final css n() {
        return (css) this.g.a();
    }

    private final void o() {
        p(null);
        aoub aoubVar = this.i;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.i = null;
        k();
    }

    private final void p(css cssVar) {
        this.g.b(cssVar);
    }

    public final long a() {
        css cssVarN = n();
        if (cssVarN != null) {
            return cssVarN.a();
        }
        return 9205357640488583168L;
    }

    protected final void b(csj csjVar) {
        css cssVarN = n();
        if (cssVarN != null) {
            cssVarN.e(csjVar, csjVar.o(), this.j.c(), (cqh) this.f.a());
        }
    }

    protected final void c(float f) {
        this.j.h(f);
    }

    protected final void d(cqh cqhVar) {
        this.f.b(cqhVar);
    }

    public final java.lang.Object g(aoln aolnVar) {
        defpackage.xsv xsvVar = this.d;
        aooh.f(xsvVar, "<this>");
        aooh.f(xsvVar, "<this>");
        java.lang.Object objH = aozv.h(new aoxa(new defpackage.xtv(this.k, xsvVar, xsvVar.a, null)), new bnk(this, 13), aolnVar);
        return objH != aolu.a ? aojh.a : objH;
    }

    public final void h() {
        cdv cdvVarN = n();
        cdv cdvVar = cdvVarN instanceof cdv ? cdvVarN : null;
        if (cdvVar != null) {
            cdvVar.h();
        }
        if (this.b) {
            o();
        }
    }

    public final void i() {
        cdv cdvVarN = n();
        cdv cdvVar = cdvVarN instanceof cdv ? cdvVarN : null;
        if (cdvVar != null) {
            cdvVar.i();
        }
        if (this.b) {
            o();
            return;
        }
        aoub aoubVar = this.i;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.i = null;
        this.c.b((java.lang.Object) null);
        p(null);
    }

    public final void j() {
        java.lang.Object obj;
        cdv cdvVarN = n();
        cdv cdvVar = cdvVarN instanceof cdv ? cdvVarN : null;
        if (cdvVar != null) {
            cdvVar.j();
        }
        boolean z = this.b;
        aoub aoubVar = this.i;
        if (z) {
            if (aoubVar == null || !aoubVar.t()) {
                this.i = aoov.an(this.h, (aolr) null, 0, new defpackage.xtn(this, (aoln) null, 0), 3);
            }
            if (this.a.P().a().a(emq.d)) {
                return;
            }
            k();
            return;
        }
        if (aoubVar == null) {
            this.i = aoov.an(this.h, (aolr) null, 0, new defpackage.wcj(this, (aoln) null, 20, (byte[]) null), 3);
        }
        if (this.a.P().a().a(emq.d) || (obj = (android.graphics.drawable.Drawable) this.c.a()) == null || !(obj instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        ((android.graphics.drawable.Animatable) obj).stop();
    }

    public final void k() {
        ccp ccpVar = this.c;
        java.lang.Object objA = ccpVar.a();
        android.graphics.drawable.Animatable animatable = objA instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) objA : null;
        if (animatable != null) {
            animatable.stop();
        }
        m(null);
        ccpVar.b((java.lang.Object) null);
        l(defpackage.xub.a);
    }

    public final void l(defpackage.xub xubVar) {
        this.e.b(xubVar);
    }

    public final void m(android.graphics.drawable.Drawable drawable) {
        csq yknVar;
        if (drawable != null) {
            j$.util.Objects.checkIndex(0, 3);
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                aooh.e(bitmap, "getBitmap(...)");
                yknVar = new csq(new cpu(bitmap));
            } else if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                yknVar = new csr(cfd.M(((android.graphics.drawable.ColorDrawable) drawable).getColor()));
            } else {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                aooh.e(drawableMutate, "mutate(...)");
                yknVar = new defpackage.ykn(drawableMutate);
            }
        } else {
            yknVar = null;
        }
        csq csqVarN = n();
        if (yknVar != csqVarN) {
            cdv cdvVar = csqVarN instanceof cdv ? (cdv) csqVarN : null;
            if (cdvVar != null) {
                cdvVar.i();
            }
            defpackage.ykn yknVar2 = yknVar instanceof cdv ? (cdv) yknVar : null;
            if (yknVar2 != null) {
                yknVar2.j();
            }
            this.c.b(drawable);
            p(yknVar);
        }
    }
}
