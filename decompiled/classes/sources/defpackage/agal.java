package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agal implements defpackage.agak {
    public static final defpackage.afzz a = new defpackage.agai(0.5f);
    public final defpackage.afzz b;
    public final defpackage.afzz c;
    public final defpackage.afzz d;
    public final defpackage.afzz e;
    public final defpackage.agab f;
    public final defpackage.agab g;
    public final defpackage.agab h;
    public final defpackage.agab i;
    public final defpackage.agab j;
    public final defpackage.agab k;
    public final defpackage.agab l;
    public final defpackage.agab m;

    public agal() {
        this.j = new defpackage.agaj();
        this.k = new defpackage.agaj();
        this.l = new defpackage.agaj();
        this.m = new defpackage.agaj();
        this.b = new defpackage.afzw(0.0f);
        this.c = new defpackage.afzw(0.0f);
        this.d = new defpackage.afzw(0.0f);
        this.e = new defpackage.afzw(0.0f);
        this.f = new defpackage.agab();
        this.g = new defpackage.agab();
        this.h = new defpackage.agab();
        this.i = new defpackage.agab();
    }

    public static defpackage.afzz f(android.content.res.TypedArray typedArray, int i, defpackage.afzz afzzVar) {
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return afzzVar;
        }
        if (typedValuePeekValue.type == 5) {
            return new defpackage.afzw(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return typedValuePeekValue.type == 6 ? new defpackage.agai(typedValuePeekValue.getFraction(1.0f, 1.0f)) : afzzVar;
    }

    public static boolean g(int i, int i2) {
        return (i2 | i) == i;
    }

    public static defpackage.aguv i(android.content.res.Resources.Theme theme, int i) {
        return n(theme.obtainStyledAttributes(i, defpackage.agah.b), new defpackage.afzw(0.0f));
    }

    public static defpackage.aguv j(android.content.Context context, int i, int i2, defpackage.afzz afzzVar) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return n(contextThemeWrapper.obtainStyledAttributes(defpackage.agah.b), afzzVar);
    }

    public static defpackage.aguv k(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.afzz afzzVar) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.agah.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return j(context, resourceId, resourceId2, afzzVar);
    }

    public static defpackage.aguv l(android.content.Context context, int i, int i2) {
        return j(context, i, i2, new defpackage.afzw(0.0f));
    }

    public static defpackage.aguv m(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        return k(context, attributeSet, i, i2, new defpackage.afzw(0.0f));
    }

    private static defpackage.aguv n(android.content.res.TypedArray typedArray, defpackage.afzz afzzVar) {
        try {
            int[] iArr = defpackage.agah.a;
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            defpackage.afzz afzzVarF = f(typedArray, 5, afzzVar);
            defpackage.afzz afzzVarF2 = f(typedArray, 8, afzzVarF);
            defpackage.afzz afzzVarF3 = f(typedArray, 9, afzzVarF);
            defpackage.afzz afzzVarF4 = f(typedArray, 7, afzzVarF);
            defpackage.afzz afzzVarF5 = f(typedArray, 6, afzzVarF);
            defpackage.aguv aguvVar = new defpackage.aguv((byte[]) null);
            aguvVar.t(defpackage.agab.i(i2));
            aguvVar.d = afzzVarF2;
            aguvVar.u(defpackage.agab.i(i3));
            aguvVar.k = afzzVarF3;
            aguvVar.s(defpackage.agab.i(i4));
            aguvVar.f = afzzVarF4;
            aguvVar.r(defpackage.agab.i(i5));
            aguvVar.b = afzzVarF5;
            return aguvVar;
        } finally {
            typedArray.recycle();
        }
    }

    @Override // defpackage.agak
    public final defpackage.agal c(float f) {
        defpackage.aguv aguvVar = new defpackage.aguv(this);
        aguvVar.k(f);
        return new defpackage.agal(aguvVar);
    }

    @Override // defpackage.agak
    public final boolean d() {
        return false;
    }

    @Override // defpackage.agak
    public final defpackage.agal[] e() {
        return new defpackage.agal[]{this};
    }

    public final boolean h(android.graphics.RectF rectF) {
        boolean z = this.i.getClass().equals(defpackage.agab.class) && this.g.getClass().equals(defpackage.agab.class) && this.f.getClass().equals(defpackage.agab.class) && this.h.getClass().equals(defpackage.agab.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && (this.k instanceof defpackage.agaj) && (this.j instanceof defpackage.agaj) && (this.l instanceof defpackage.agaj) && (this.m instanceof defpackage.agaj);
    }

    public final java.lang.String toString() {
        defpackage.afzz afzzVar = this.e;
        defpackage.afzz afzzVar2 = this.d;
        defpackage.afzz afzzVar3 = this.c;
        return "[" + java.lang.String.valueOf(this.b) + ", " + java.lang.String.valueOf(afzzVar3) + ", " + java.lang.String.valueOf(afzzVar2) + ", " + java.lang.String.valueOf(afzzVar) + ']';
    }

    @Override // defpackage.agak
    public final defpackage.agal a() {
        return this;
    }

    @Override // defpackage.agak
    public final defpackage.agal b(int[] iArr) {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afzz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [afzz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [afzz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [afzz, java.lang.Object] */
    public agal(defpackage.aguv aguvVar) {
        this.j = (defpackage.agab) aguvVar.e;
        this.k = (defpackage.agab) aguvVar.g;
        this.l = (defpackage.agab) aguvVar.c;
        this.m = (defpackage.agab) aguvVar.j;
        this.b = aguvVar.d;
        this.c = aguvVar.k;
        this.d = aguvVar.f;
        this.e = aguvVar.b;
        this.f = (defpackage.agab) aguvVar.a;
        this.g = (defpackage.agab) aguvVar.i;
        this.h = (defpackage.agab) aguvVar.l;
        this.i = (defpackage.agab) aguvVar.h;
    }
}
