package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzs extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, android.graphics.drawable.Animatable {
    private android.graphics.RectF A;
    private android.graphics.Paint B;
    private android.graphics.Rect C;
    private android.graphics.Rect D;
    private android.graphics.RectF E;
    private android.graphics.RectF F;
    private android.graphics.Matrix G;
    private android.graphics.Matrix H;
    private final android.animation.ValueAnimator.AnimatorUpdateListener I;
    private float J;
    private int K;
    public defpackage.gzh b;
    public final defpackage.hgg c;
    public boolean d;
    public final java.util.ArrayList e;
    public defpackage.hcs f;
    public java.lang.String g;
    public java.lang.String h;
    public boolean i;
    public defpackage.heg j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final java.util.concurrent.Semaphore o;
    public final java.lang.Runnable p;
    public int q;
    public int r;
    private boolean t;
    private defpackage.hcr u;
    private boolean v;
    private final android.graphics.Matrix w;
    private android.graphics.Bitmap x;
    private android.graphics.Canvas y;
    private android.graphics.Rect z;
    private static final java.util.List s = java.util.Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final java.util.concurrent.Executor a = new java.util.concurrent.ThreadPoolExecutor(0, 2, 35L, java.util.concurrent.TimeUnit.MILLISECONDS, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) new java.util.concurrent.LinkedBlockingQueue(), (java.util.concurrent.ThreadFactory) new hgf());

    public gzs() {
        defpackage.hgg hggVar = new defpackage.hgg();
        this.c = hggVar;
        this.t = true;
        this.d = false;
        this.q = 1;
        this.e = new java.util.ArrayList();
        this.v = true;
        this.k = 255;
        this.l = false;
        this.K = 1;
        this.m = false;
        this.w = new android.graphics.Matrix();
        this.n = false;
        defpackage.mh mhVar = new defpackage.mh(this, 3, null);
        this.I = mhVar;
        this.o = new java.util.concurrent.Semaphore(1);
        this.p = new defpackage.fkh(this, 11, null);
        this.J = -3.4028235E38f;
        hggVar.addUpdateListener(mhVar);
    }

    private final void A() {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar != null) {
            int i = this.K - 1;
            int i2 = gzhVar.m;
            boolean z = false;
            if (i != 1 && (i == 2 || i2 > 4)) {
                z = true;
            }
            this.m = z;
        }
    }

    private final boolean B() {
        return this.t || this.d;
    }

    private static final void C(android.graphics.RectF rectF, android.graphics.Rect rect) {
        rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
    }

    private final void z() {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar != null) {
            int i = defpackage.hfj.a;
            android.graphics.Rect rect = gzhVar.i;
            defpackage.heg hegVar = new defpackage.heg(this, new defpackage.hei(java.util.Collections.EMPTY_LIST, gzhVar, "__container", -1L, 1, -1L, null, java.util.Collections.EMPTY_LIST, new defpackage.hdk(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, java.util.Collections.EMPTY_LIST, 1, null, false, null, null, 1), gzhVar.h, gzhVar);
            this.j = hegVar;
            hegVar.k = this.v;
        }
    }

    public final float a() {
        return this.c.d();
    }

    public final float b() {
        return this.c.e();
    }

    public final float c() {
        return this.c.c();
    }

    public final float d() {
        return this.c.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        float f;
        float fC;
        defpackage.heg hegVar = this.j;
        if (hegVar != null) {
            boolean zU = u();
            if (zU) {
                try {
                    this.o.acquire();
                    if (x()) {
                        r(this.c.c());
                    }
                } catch (java.lang.InterruptedException unused) {
                    if (!zU) {
                        return;
                    } else {
                        if ((f > fC ? 1 : (f == fC ? 0 : -1)) == 0) {
                            return;
                        }
                    }
                } finally {
                    if (zU) {
                        this.o.release();
                        if (hegVar.j != this.c.c()) {
                            a.execute(this.p);
                        }
                    }
                }
            }
            if (this.m) {
                l(canvas, hegVar);
            } else {
                defpackage.heg hegVar2 = this.j;
                defpackage.gzh gzhVar = this.b;
                if (hegVar2 != null && gzhVar != null) {
                    android.graphics.Matrix matrix = this.w;
                    matrix.reset();
                    android.graphics.Rect bounds = getBounds();
                    if (!bounds.isEmpty()) {
                        matrix.preScale(bounds.width() / gzhVar.i.width(), bounds.height() / gzhVar.i.height());
                        matrix.preTranslate(bounds.left, bounds.top);
                    }
                    hegVar2.b(canvas, matrix, this.k);
                }
            }
            this.n = false;
        }
    }

    public final int e() {
        return this.c.getRepeatCount();
    }

    public final defpackage.hcr f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.u == null) {
            defpackage.hcr hcrVar = new defpackage.hcr(getCallback());
            this.u = hcrVar;
            java.lang.String str = this.h;
            if (str != null) {
                hcrVar.e = str;
            }
        }
        return this.u;
    }

    public final void g(final defpackage.hcw hcwVar, final java.lang.Object obj, final defpackage.hgp hgpVar) {
        java.util.List list;
        if (this.j == null) {
            this.e.add(new defpackage.gzr() { // from class: gzo
                @Override // defpackage.gzr
                public final void a() {
                    this.a.g(hcwVar, obj, hgpVar);
                }
            });
            return;
        }
        if (hcwVar == defpackage.hcw.a) {
            this.j.a(obj, hgpVar);
        } else {
            defpackage.hcx hcxVar = hcwVar.b;
            if (hcxVar != null) {
                hcxVar.a(obj, hgpVar);
            } else {
                if (this.j == null) {
                    defpackage.hge.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = java.util.Collections.EMPTY_LIST;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    this.j.e(hcwVar, 0, arrayList, new defpackage.hcw(new java.lang.String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((defpackage.hcw) list.get(i)).b.a(obj, hgpVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == defpackage.gzx.E) {
            r(c());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar == null) {
            return -1;
        }
        return gzhVar.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar == null) {
            return -1;
        }
        return gzhVar.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        defpackage.hgg hggVar = this.c;
        if (hggVar.k) {
            hggVar.cancel();
            if (!isVisible()) {
                this.q = 1;
            }
        }
        this.b = null;
        this.j = null;
        this.f = null;
        this.J = -3.4028235E38f;
        hggVar.j = null;
        hggVar.h = -2.1474836E9f;
        hggVar.i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void i(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (this.b != null) {
                z();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.n) {
            return;
        }
        this.n = true;
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return v();
    }

    public final void j() {
        this.e.clear();
        defpackage.hgg hggVar = this.c;
        hggVar.h(true);
        java.util.Iterator it = hggVar.b.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator.AnimatorPauseListener) it.next()).onAnimationPause(hggVar);
        }
        if (isVisible()) {
            return;
        }
        this.q = 1;
    }

    public final void k() {
        if (this.j == null) {
            this.e.add(new defpackage.gzp(this, 0));
            return;
        }
        A();
        if (B() || e() == 0) {
            if (isVisible()) {
                defpackage.hgg hggVar = this.c;
                hggVar.k = true;
                java.util.Set set = hggVar.a;
                boolean zL = hggVar.l();
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    aa$.ExternalSyntheticApiModelOutline0.m$1((android.animation.Animator.AnimatorListener) it.next(), hggVar, zL);
                }
                hggVar.j((int) (hggVar.l() ? hggVar.d() : hggVar.e()));
                hggVar.d = 0L;
                hggVar.g = 0;
                hggVar.g();
                this.q = 1;
            } else {
                this.q = 2;
            }
        }
        if (B()) {
            return;
        }
        aeve aeveVar = null;
        for (java.lang.String str : s) {
            defpackage.gzh gzhVar = this.b;
            int size = gzhVar.e.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    aeveVar = null;
                    break;
                }
                aeve aeveVar2 = (aeve) gzhVar.e.get(i);
                java.lang.String str2 = (java.lang.String) aeveVar2.b;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    aeveVar = aeveVar2;
                    break;
                }
                i++;
            }
            if (aeveVar != null) {
                break;
            }
        }
        if (aeveVar != null) {
            p((int) aeveVar.a);
        } else {
            p((int) (d() < 0.0f ? b() : a()));
        }
        this.c.f();
        if (isVisible()) {
            return;
        }
        this.q = 1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00df  */
    public final void l(android.graphics.Canvas canvas, defpackage.heg hegVar) throws java.lang.Throwable {
        if (this.b != null) {
            if (this.y == null) {
                this.y = new android.graphics.Canvas();
                this.F = new android.graphics.RectF();
                this.G = new android.graphics.Matrix();
                this.H = new android.graphics.Matrix();
                this.z = new android.graphics.Rect();
                this.A = new android.graphics.RectF();
                this.B = new defpackage.hae();
                this.C = new android.graphics.Rect();
                this.D = new android.graphics.Rect();
                this.E = new android.graphics.RectF();
            }
            canvas.getMatrix(this.G);
            canvas.getClipBounds(this.z);
            android.graphics.Rect rect = this.z;
            this.A.set(rect.left, rect.top, rect.right, rect.bottom);
            this.G.mapRect(this.A);
            C(this.A, this.z);
            boolean z = this.v;
            android.graphics.RectF rectF = this.F;
            if (z) {
                rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                hegVar.c(rectF, null, false);
            }
            this.G.mapRect(this.F);
            android.graphics.Rect bounds = getBounds();
            float fWidth = bounds.width();
            float intrinsicWidth = getIntrinsicWidth();
            float fHeight = bounds.height();
            float intrinsicHeight = getIntrinsicHeight();
            android.graphics.RectF rectF2 = this.F;
            float f = fWidth / intrinsicWidth;
            float f2 = fHeight / intrinsicHeight;
            rectF2.set(rectF2.left * f, rectF2.top * f2, rectF2.right * f, rectF2.bottom * f2);
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (callback instanceof android.view.View) {
                android.view.ViewParent parent = ((android.view.View) callback).getParent();
                if (!(parent instanceof android.view.ViewGroup) || ((android.view.ViewGroup) parent).getClipChildren()) {
                    this.F.intersect(this.z.left, this.z.top, this.z.right, this.z.bottom);
                }
            } else {
                this.F.intersect(this.z.left, this.z.top, this.z.right, this.z.bottom);
            }
            int iCeil = (int) java.lang.Math.ceil(this.F.width());
            int iCeil2 = (int) java.lang.Math.ceil(this.F.height());
            if (iCeil <= 0 || iCeil2 <= 0) {
                return;
            }
            android.graphics.Bitmap bitmap = this.x;
            if (bitmap == null || bitmap.getWidth() < iCeil || this.x.getHeight() < iCeil2) {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iCeil, iCeil2, android.graphics.Bitmap.Config.ARGB_8888);
                this.x = bitmapCreateBitmap;
                this.y.setBitmap(bitmapCreateBitmap);
                this.n = true;
            } else if (this.x.getWidth() > iCeil || this.x.getHeight() > iCeil2) {
                android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(this.x, 0, 0, iCeil, iCeil2);
                this.x = bitmapCreateBitmap2;
                this.y.setBitmap(bitmapCreateBitmap2);
                this.n = true;
            }
            if (this.n) {
                android.graphics.Matrix matrix = this.w;
                matrix.set(this.G);
                matrix.preScale(f, f2);
                matrix.postTranslate(-this.F.left, -this.F.top);
                this.x.eraseColor(0);
                hegVar.b(this.y, matrix, this.k);
                this.G.invert(this.H);
                this.H.mapRect(this.E, this.F);
                C(this.E, this.D);
            }
            this.C.set(0, 0, iCeil, iCeil2);
            canvas.drawBitmap(this.x, this.C, this.D, this.B);
        }
    }

    public final void m() {
        if (this.j == null) {
            this.e.add(new defpackage.gzp(this, 1));
            return;
        }
        A();
        if (B() || e() == 0) {
            if (isVisible()) {
                defpackage.hgg hggVar = this.c;
                hggVar.k = true;
                hggVar.g();
                hggVar.d = 0L;
                if (hggVar.l() && hggVar.f == hggVar.e()) {
                    hggVar.j(hggVar.d());
                } else if (!hggVar.l() && hggVar.f == hggVar.d()) {
                    hggVar.j(hggVar.e());
                }
                java.util.Iterator it = hggVar.b.iterator();
                while (it.hasNext()) {
                    ((android.animation.Animator.AnimatorPauseListener) it.next()).onAnimationResume(hggVar);
                }
                this.q = 1;
            } else {
                this.q = 3;
            }
        }
        if (B()) {
            return;
        }
        p((int) (d() < 0.0f ? b() : a()));
        this.c.f();
        if (isVisible()) {
            return;
        }
        this.q = 1;
    }

    public final void n(boolean z) {
        if (z != this.l) {
            this.l = z;
            invalidateSelf();
        }
    }

    public final void o(boolean z) {
        if (z != this.v) {
            this.v = z;
            defpackage.heg hegVar = this.j;
            if (hegVar != null) {
                hegVar.k = z;
            }
            invalidateSelf();
        }
    }

    public final void p(final int i) {
        if (this.b == null) {
            this.e.add(new defpackage.gzr() { // from class: gzm
                @Override // defpackage.gzr
                public final void a() {
                    this.a.p(i);
                }
            });
        } else {
            this.c.j(i);
        }
    }

    public final void q(final int i, final int i2) {
        if (this.b == null) {
            this.e.add(new defpackage.gzr() { // from class: gzn
                @Override // defpackage.gzr
                public final void a() {
                    this.a.q(i, i2);
                }
            });
        } else {
            this.c.k(i, i2 + 0.99f);
        }
    }

    public final void r(final float f) {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar == null) {
            this.e.add(new defpackage.gzr() { // from class: gzq
                @Override // defpackage.gzr
                public final void a() {
                    this.a.r(f);
                }
            });
            return;
        }
        defpackage.hgg hggVar = this.c;
        float f2 = gzhVar.j;
        float f3 = gzhVar.k;
        int i = defpackage.hgh.a;
        hggVar.j(f2 + (f * (f3 - f2)));
    }

    public final void s(int i) {
        this.c.setRepeatCount(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        defpackage.hge.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.q;
            if (i == 2) {
                k();
            } else if (i == 3) {
                m();
            }
        } else if (this.c.k) {
            j();
            this.q = 3;
        } else if (zIsVisible) {
            this.q = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if ((callback instanceof android.view.View) && ((android.view.View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        this.c.f();
        if (isVisible()) {
            return;
        }
        this.q = 1;
    }

    public final void t(java.lang.Boolean bool) {
        this.t = bool.booleanValue();
    }

    public final boolean u() {
        int i = this.r;
        return i != 0 && i == 2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v() {
        defpackage.hgg hggVar = this.c;
        if (hggVar == null) {
            return false;
        }
        return hggVar.k;
    }

    public final boolean w(defpackage.gzh gzhVar) {
        if (this.b == gzhVar) {
            return false;
        }
        this.n = true;
        h();
        this.b = gzhVar;
        z();
        defpackage.hgg hggVar = this.c;
        defpackage.gzh gzhVar2 = hggVar.j;
        hggVar.j = gzhVar;
        if (gzhVar2 == null) {
            hggVar.k(java.lang.Math.max(hggVar.h, gzhVar.j), java.lang.Math.min(hggVar.i, gzhVar.k));
        } else {
            hggVar.k((int) gzhVar.j, (int) gzhVar.k);
        }
        float f = hggVar.f;
        hggVar.f = 0.0f;
        hggVar.e = 0.0f;
        hggVar.j((int) f);
        hggVar.b();
        r(hggVar.getAnimatedFraction());
        java.util.ArrayList arrayList = this.e;
        java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            defpackage.gzr gzrVar = (defpackage.gzr) it.next();
            if (gzrVar != null) {
                gzrVar.a();
            }
            it.remove();
        }
        arrayList.clear();
        defpackage.hgt hgtVar = gzhVar.n;
        A();
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final boolean x() {
        defpackage.gzh gzhVar = this.b;
        if (gzhVar == null) {
            return false;
        }
        float f = this.J;
        float fC = this.c.c();
        this.J = fC;
        return java.lang.Math.abs(fC - f) * gzhVar.a() >= 50.0f;
    }

    public final void y(int i) {
        this.K = i;
        A();
    }
}
