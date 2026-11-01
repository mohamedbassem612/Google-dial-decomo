package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpv {
    public android.graphics.Paint a;
    public int b;
    public android.graphics.Shader c;
    public defpackage.cqh d;

    public cpv() {
        this(new android.graphics.Paint(7));
    }

    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    public final float b() {
        return this.a.getStrokeMiter();
    }

    public final float c() {
        return this.a.getStrokeWidth();
    }

    public final int d() {
        return !this.a.isFilterBitmap() ? 0 : 1;
    }

    public final int e() {
        int i;
        android.graphics.Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = defpackage.cpw.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 2 : 0;
        }
        return 1;
    }

    public final int f() {
        int i;
        android.graphics.Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = defpackage.cpw.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 1 : 0;
        }
        return 2;
    }

    public final long g() {
        return defpackage.crh.a.a(this.a);
    }

    public final void h(float f) {
        this.a.setAlpha((int) java.lang.Math.rint(f * 255.0f));
    }

    public final void i(int i) {
        if (this.b != i) {
            this.b = i;
            defpackage.crh.a.b(this.a, i);
        }
    }

    public final void j(long j) {
        defpackage.crh.a.c(this.a, j);
    }

    public final void k(defpackage.cqh cqhVar) {
        this.d = cqhVar;
        this.a.setColorFilter(cqhVar != null ? cqhVar.b : null);
    }

    public final void l(int i) {
        this.a.setFilterBitmap(1 == i);
    }

    public final void m(android.graphics.Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void n(int i) {
        android.graphics.Paint.Cap cap;
        android.graphics.Paint paint = this.a;
        if (i == 2) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else {
            cap = i == 1 ? android.graphics.Paint.Cap.ROUND : android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public final void o(int i) {
        android.graphics.Paint.Join join;
        android.graphics.Paint paint = this.a;
        if (i == 0) {
            join = android.graphics.Paint.Join.MITER;
        } else {
            join = i == 2 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.ROUND;
        }
        paint.setStrokeJoin(join);
    }

    public final void p(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void q(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void r(int i) {
        this.a.setStyle(i == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public cpv(android.graphics.Paint paint) {
        this.a = paint;
        this.b = 3;
    }
}
