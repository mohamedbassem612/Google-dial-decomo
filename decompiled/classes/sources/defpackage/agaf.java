package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class agaf extends android.graphics.drawable.Drawable implements defpackage.agaw {
    public static final /* synthetic */ int C = 0;
    private static final java.lang.String a = "agaf";
    private static final android.graphics.Paint b;
    private static final defpackage.agae[] c;
    public float[] A;
    public aprf B;
    private boolean D;
    private defpackage.agal E;
    private eka F;
    private float[] G;
    private final defpackage.apnt H;
    private final defpackage.apnt I;
    private final android.graphics.Matrix d;
    private final android.graphics.Path e;
    private final android.graphics.RectF f;
    private final android.graphics.RectF g;
    private final android.graphics.Region h;
    private final android.graphics.Region i;
    private final android.graphics.Paint j;
    private final android.graphics.Paint k;
    private final defpackage.afzv l;
    private final defpackage.agan m;
    private android.graphics.PorterDuffColorFilter n;
    private android.graphics.PorterDuffColorFilter o;
    private final android.graphics.RectF p;
    public defpackage.agad q;
    public final defpackage.agau[] r;
    public final defpackage.agau[] s;
    public final java.util.BitSet t;
    public boolean u;
    public boolean v;
    public final android.graphics.Path w;
    public int x;
    public boolean y;
    defpackage.ejz[] z;

    static {
        new defpackage.aguv((byte[]) null).q(0.0f);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        c = new defpackage.agae[4];
        int i = 0;
        while (true) {
            defpackage.agae[] agaeVarArr = c;
            int length = agaeVarArr.length;
            if (i >= 4) {
                return;
            }
            agaeVarArr[i] = new defpackage.agae(i);
            i++;
        }
    }

    protected agaf(defpackage.agad agadVar) {
        this.I = new defpackage.apnt(this, (byte[]) null);
        this.r = new defpackage.agau[4];
        this.s = new defpackage.agau[4];
        this.t = new java.util.BitSet(8);
        this.d = new android.graphics.Matrix();
        this.w = new android.graphics.Path();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.RectF();
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Region();
        this.i = new android.graphics.Region();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.j = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.k = paint2;
        this.l = new defpackage.afzv();
        this.m = defpackage.agan.a();
        this.p = new android.graphics.RectF();
        this.y = true;
        this.D = true;
        this.z = new defpackage.ejz[4];
        this.q = agadVar;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        l();
        k(getState());
        this.H = new defpackage.apnt(this);
    }

    public static defpackage.agaf J(android.content.Context context, float f, android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(defpackage.agab.Z(context, 2130969105, "agaf"));
        }
        defpackage.agaf agafVar = new defpackage.agaf();
        agafVar.N(context);
        agafVar.R(colorStateList);
        agafVar.Q(f);
        return agafVar;
    }

    private final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.graphics.Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = E(colorForState);
            }
            this.x = colorForState;
            return new android.graphics.PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iE = E(color);
            this.x = iE;
            if (iE != color) {
                return new android.graphics.PorterDuffColorFilter(iE, android.graphics.PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    private final android.graphics.RectF b() {
        android.graphics.RectF rectF = this.g;
        rectF.set(I());
        float fA = A();
        rectF.inset(fA, fA);
        return rectF;
    }

    private final void c(android.graphics.RectF rectF, android.graphics.Path path) {
        K(rectF, path);
        if (this.q.j != 1.0f) {
            android.graphics.Matrix matrix = this.d;
            matrix.reset();
            float f = this.q.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.p, true);
    }

    private final void d(android.graphics.Canvas canvas) {
        if (this.t.cardinality() > 0) {
            android.util.Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.q.s != 0) {
            canvas.drawPath(this.w, this.l.e);
        }
        for (int i = 0; i < 4; i++) {
            defpackage.agau[] agauVarArr = this.r;
            defpackage.afzv afzvVar = this.l;
            agauVarArr[i].c(afzvVar, this.q.r, canvas);
            this.s[i].c(afzvVar, this.q.r, canvas);
        }
        if (this.y) {
            int iF = F();
            int iG = G();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.w, b);
            canvas.translate(iF, iG);
        }
    }

    private final void e(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        android.graphics.RectF rectFI = I();
        if (!this.q.a.d() || rectFI.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.F == null);
        if (this.A == null) {
            this.A = new float[4];
        }
        defpackage.agal agalVarB = this.q.a.b(iArr);
        float[] fArr = this.A;
        int length = fArr.length;
        float f = fArr[0];
        int i = 1;
        while (true) {
            int length2 = fArr.length;
            if (i >= 4) {
                if (agalVarB.h(I())) {
                    z2 = true;
                    break;
                }
            } else if (fArr[i] == f) {
                i++;
            }
            z2 = false;
            break;
        }
        this.D = z2;
        if (!z2) {
            this.u = true;
            this.v = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float fA = defpackage.agan.b(i2, agalVarB).a(rectFI);
            if (z4) {
                this.A[i2] = fA;
                z3 = true;
            } else {
                z3 = false;
            }
            defpackage.ejz ejzVar = this.z[i2];
            if (ejzVar != null) {
                ejzVar.j(fA);
                if (z3) {
                    this.z[i2].k();
                }
            }
        }
        if (z4) {
            invalidateSelf();
        }
    }

    private final void g() {
        float fD = D();
        this.q.r = (int) java.lang.Math.ceil(0.75f * fD);
        this.q.s = (int) java.lang.Math.ceil(fD * 0.25f);
        l();
        if (j()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    private final boolean h() {
        defpackage.agad agadVar = this.q;
        int i = agadVar.q;
        if (i == 1 || agadVar.r <= 0) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (ab()) {
            return false;
        }
        this.w.isConvex();
        return false;
    }

    private final boolean i() {
        return (this.q.v == android.graphics.Paint.Style.FILL_AND_STROKE || this.q.v == android.graphics.Paint.Style.STROKE) && this.k.getStrokeWidth() > 0.0f;
    }

    private final boolean j() {
        return h() || !ab();
    }

    private final boolean k(int[] iArr) {
        android.graphics.Paint paint;
        int color;
        int colorForState;
        android.graphics.Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.q.d != null && color2 != (colorForState2 = this.q.d.getColorForState(iArr, (color2 = (paint2 = this.j).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.q.e == null || color == (colorForState = this.q.e.getColorForState(iArr, (color = (paint = this.k).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean l() {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = this.n;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = this.o;
        defpackage.agad agadVar = this.q;
        this.n = a(agadVar.g, agadVar.h, this.j, true);
        defpackage.agad agadVar2 = this.q;
        this.o = a(agadVar2.f, agadVar2.h, this.k, false);
        boolean z = this.q.u;
        return (j$.util.Objects.equals(porterDuffColorFilter, this.n) && j$.util.Objects.equals(porterDuffColorFilter2, this.o)) ? false : true;
    }

    public final float A() {
        if (i()) {
            return this.k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float B() {
        float[] fArr = this.A;
        return fArr != null ? fArr[3] : this.q.a.a().b.a(I());
    }

    public final float C() {
        float[] fArr = this.A;
        return fArr != null ? fArr[0] : this.q.a.a().c.a(I());
    }

    public final float D() {
        float fZ = z();
        float f = this.q.p;
        return fZ + 0.0f;
    }

    protected final int E(int i) {
        float fD = D();
        defpackage.agad agadVar = this.q;
        float f = fD + agadVar.n;
        defpackage.afsr afsrVar = agadVar.b;
        return afsrVar != null ? afsrVar.b(i, f) : i;
    }

    public final int F() {
        defpackage.agad agadVar = this.q;
        return (int) (((double) agadVar.s) * java.lang.Math.sin(java.lang.Math.toRadians(agadVar.t)));
    }

    public final int G() {
        defpackage.agad agadVar = this.q;
        return (int) (((double) agadVar.s) * java.lang.Math.cos(java.lang.Math.toRadians(agadVar.t)));
    }

    public final android.content.res.ColorStateList H() {
        return this.q.d;
    }

    public final android.graphics.RectF I() {
        android.graphics.RectF rectF = this.f;
        rectF.set(getBounds());
        return rectF;
    }

    protected final void K(android.graphics.RectF rectF, android.graphics.Path path) {
        this.m.c(this.q.a.a(), this.A, this.q.k, rectF, this.H, path);
    }

    public final void L(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, defpackage.agal agalVar, float[] fArr, android.graphics.RectF rectF) {
        float fX = x(rectF, agalVar, fArr);
        if (fX < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fX * this.q.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void M(android.graphics.Canvas canvas) {
        L(canvas, this.k, this.e, this.E, this.G, b());
    }

    public final void N(android.content.Context context) {
        this.q.b = new defpackage.afsr(context);
        g();
    }

    public final void O(float f) {
        q(this.q.a.c(f));
    }

    public final void P(eka ekaVar) {
        if (this.F == ekaVar) {
            return;
        }
        this.F = ekaVar;
        int i = 0;
        while (true) {
            defpackage.ejz[] ejzVarArr = this.z;
            int length = ejzVarArr.length;
            if (i >= 4) {
                e(getState(), true);
                invalidateSelf();
                return;
            }
            if (ejzVarArr[i] == null) {
                ejzVarArr[i] = new defpackage.ejz(this, c[i]);
            }
            defpackage.ejz ejzVar = this.z[i];
            eka ekaVar2 = new eka();
            ekaVar2.c((float) ekaVar.b);
            double d = ekaVar.a;
            ekaVar2.e((float) (d * d));
            ejzVar.t = ekaVar2;
            i++;
        }
    }

    public final void Q(float f) {
        defpackage.agad agadVar = this.q;
        if (agadVar.o != f) {
            agadVar.o = f;
            g();
        }
    }

    public final void R(android.content.res.ColorStateList colorStateList) {
        defpackage.agad agadVar = this.q;
        if (agadVar.d != colorStateList) {
            agadVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void S(float f) {
        defpackage.agad agadVar = this.q;
        if (agadVar.k != f) {
            agadVar.k = f;
            this.u = true;
            this.v = true;
            invalidateSelf();
        }
    }

    public final void T(float f) {
        defpackage.agad agadVar = this.q;
        if (agadVar.n != f) {
            agadVar.n = f;
            g();
        }
    }

    public final void U(int i) {
        this.l.a(i);
        this.q.u = false;
        super.invalidateSelf();
    }

    public final void V(defpackage.agak agakVar) {
        if (agakVar instanceof defpackage.agal) {
            q((defpackage.agal) agakVar);
            return;
        }
        defpackage.agak agakVar2 = (agbd) agakVar;
        defpackage.agad agadVar = this.q;
        if (agadVar.a != agakVar2) {
            agadVar.a = agakVar2;
            e(getState(), true);
            invalidateSelf();
        }
    }

    public final void W(float f, int i) {
        aa(f);
        Y(android.content.res.ColorStateList.valueOf(i));
    }

    public final void X(float f, android.content.res.ColorStateList colorStateList) {
        aa(f);
        Y(colorStateList);
    }

    public final void Y(android.content.res.ColorStateList colorStateList) {
        defpackage.agad agadVar = this.q;
        if (agadVar.e != colorStateList) {
            agadVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void Z(android.content.res.ColorStateList colorStateList) {
        this.q.f = colorStateList;
        l();
        super.invalidateSelf();
    }

    public final void aa(float f) {
        this.q.l = f;
        invalidateSelf();
    }

    public final boolean ab() {
        if (this.q.a.b(getState()).h(I())) {
            return this.A == null || this.D;
        }
        return false;
    }

    public final void ac() {
        defpackage.agad agadVar = this.q;
        if (agadVar.t != 180) {
            agadVar.t = 180;
            super.invalidateSelf();
        }
    }

    public final void ad() {
        defpackage.agad agadVar = this.q;
        if (agadVar.q != 2) {
            agadVar.q = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.j;
        paint.setColorFilter(this.n);
        int alpha = paint.getAlpha();
        int i = this.q.m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        android.graphics.Paint paint2 = this.k;
        paint2.setColorFilter(this.o);
        paint2.setStrokeWidth(this.q.l);
        int alpha2 = paint2.getAlpha();
        int i2 = this.q.m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean zJ = j();
        if (this.q.v == android.graphics.Paint.Style.FILL_AND_STROKE || this.q.v == android.graphics.Paint.Style.FILL) {
            if (this.u) {
                if (zJ) {
                    c(I(), this.w);
                }
                this.u = false;
            }
            if (h()) {
                canvas.save();
                canvas.translate(F(), G());
                if (this.y) {
                    android.graphics.Rect bounds = getBounds();
                    android.graphics.RectF rectF = this.p;
                    float fWidth = rectF.width() - bounds.width();
                    int iHeight = (int) (rectF.height() - bounds.height());
                    int i3 = (int) fWidth;
                    if (i3 < 0 || iHeight < 0) {
                        throw new java.lang.IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + i3 + " extra height: " + iHeight + " path bounds: " + java.lang.String.valueOf(rectF));
                    }
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(((int) rectF.width()) + (this.q.r << 1) + i3, ((int) rectF.height()) + (this.q.r << 1) + iHeight, android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
                    float f = (bounds.left - this.q.r) - i3;
                    float f2 = (bounds.top - this.q.r) - iHeight;
                    canvas2.translate(-f, -f2);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (android.graphics.Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            L(canvas, paint, this.w, this.q.a.a(), this.A, I());
        }
        if (i()) {
            if (this.v) {
                defpackage.agal agalVarEs = es();
                defpackage.apnt apntVar = this.I;
                defpackage.aguv aguvVar = new defpackage.aguv(agalVarEs);
                aguvVar.d = apntVar.d(agalVarEs.b);
                aguvVar.k = apntVar.d(agalVarEs.c);
                aguvVar.b = apntVar.d(agalVarEs.e);
                aguvVar.f = apntVar.d(agalVarEs.d);
                this.E = new defpackage.agal(aguvVar);
                if (this.A != null) {
                    if (this.G == null) {
                        this.G = new float[4];
                    }
                    float fA = A();
                    int i4 = 0;
                    while (true) {
                        float[] fArr = this.A;
                        int length = fArr.length;
                        if (i4 >= 4) {
                            break;
                        }
                        this.G[i4] = java.lang.Math.max(0.0f, fArr[i4] - fA);
                        i4++;
                    }
                } else {
                    this.G = null;
                }
                if (zJ) {
                    this.m.c(this.E, this.G, this.q.k, b(), null, this.e);
                }
                this.v = false;
            }
            M(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // defpackage.agaw
    public final defpackage.agal es() {
        return this.q.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.q.q != 2) {
            android.graphics.RectF rectFI = I();
            if (rectFI.isEmpty()) {
                return;
            }
            float fX = x(rectFI, this.q.a.a(), this.A);
            if (fX >= 0.0f) {
                outline.setRoundRect(getBounds(), fX * this.q.k);
                return;
            }
            if (this.u) {
                c(rectFI, this.w);
                this.u = false;
            }
            defpackage.afsq.b(outline, this.w);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.q.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        android.graphics.Region region = this.h;
        region.set(getBounds());
        android.graphics.RectF rectFI = I();
        android.graphics.Path path = this.w;
        c(rectFI, path);
        android.graphics.Region region2 = this.i;
        region2.setPath(path, region);
        region.op(region2, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.u = true;
        this.v = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.content.res.ColorStateList colorStateList3;
        android.content.res.ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.q.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.q.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.q.e) != null && colorStateList3.isStateful()) || (((colorStateList4 = this.q.d) != null && colorStateList4.isStateful()) || this.q.a.d())));
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.q = new defpackage.agad(this.q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        this.u = true;
        this.v = true;
        super.onBoundsChange(rect);
        if (!this.q.a.d() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        defpackage.ejz[] ejzVarArr = this.z;
        int length = ejzVarArr.length;
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            defpackage.ejz ejzVar = ejzVarArr[i];
            if (ejzVar != null && ejzVar.n) {
                z = true;
                break;
            }
        }
        e(state, !z);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.q.a.d()) {
            e(iArr, false);
        }
        boolean z = k(iArr) || l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // defpackage.agaw
    public final void q(defpackage.agal agalVar) {
        this.q.a = agalVar;
        this.A = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        defpackage.agad agadVar = this.q;
        if (agadVar.m != i) {
            agadVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.q.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.q.g = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        defpackage.agad agadVar = this.q;
        if (agadVar.h != mode) {
            agadVar.h = mode;
            l();
            super.invalidateSelf();
        }
    }

    public final float x(android.graphics.RectF rectF, defpackage.agal agalVar, float[] fArr) {
        if (fArr == null) {
            if (agalVar.h(rectF)) {
                return agalVar.b.a(rectF);
            }
        } else if (this.D) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final float y() {
        float[] fArr = this.A;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        android.graphics.RectF rectFI = I();
        return (((es().b.a(rectFI) + es().e.a(rectFI)) - es().d.a(rectFI)) - defpackage.agan.b(0, es()).a(rectFI)) / 2.0f;
    }

    public final float z() {
        return this.q.o;
    }

    public agaf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(new defpackage.agal(defpackage.agal.m(context, attributeSet, i, i2)));
    }

    public agaf() {
        this(new defpackage.agal());
    }

    public agaf(defpackage.agak agakVar) {
        this(new defpackage.agad(agakVar));
    }

    public agaf(defpackage.agal agalVar) {
        this(new defpackage.agad(agalVar));
    }
}
