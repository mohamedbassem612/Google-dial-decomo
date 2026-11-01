package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afts extends android.graphics.drawable.Drawable.ConstantState {
    public android.graphics.drawable.Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public agak t;
    public int u;
    public int v;
    public android.graphics.Rect w;
    public int[] x;
    public int y;

    public afts(defpackage.afts aftsVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = com.google.android.material.focus.FocusRingDrawable.a;
        this.y = Integer.MIN_VALUE;
        if (aftsVar != null) {
            this.a = aftsVar.a;
            this.b = aftsVar.b;
            this.c = aftsVar.c;
            this.d = aftsVar.d;
            this.e = aftsVar.e;
            this.f = aftsVar.f;
            this.g = aftsVar.g;
            this.h = aftsVar.h;
            this.i = aftsVar.i;
            this.j = aftsVar.j;
            this.k = aftsVar.k;
            this.l = aftsVar.l;
            this.m = aftsVar.m;
            this.n = aftsVar.n;
            this.o = aftsVar.o;
            this.p = aftsVar.p;
            this.q = aftsVar.q;
            this.r = aftsVar.r;
            this.s = aftsVar.s;
            this.u = aftsVar.u;
            this.v = aftsVar.v;
            agal agalVar = aftsVar.t;
            if (agalVar instanceof agal) {
                this.t = new agal(new aguv(agalVar));
            } else {
                this.t = agalVar instanceof defpackage.agbd ? new defpackage.agbc((defpackage.agbd) agalVar).a() : agalVar;
            }
            android.graphics.Rect rect = aftsVar.w;
            if (rect != null) {
                this.w = new android.graphics.Rect(rect);
            }
            int[] iArr = aftsVar.x;
            this.x = java.util.Arrays.copyOf(iArr, iArr.length);
            this.y = aftsVar.y;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new com.google.android.material.focus.FocusRingDrawable(this, (android.content.res.Resources) null, (defpackage.aftt) null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new com.google.android.material.focus.FocusRingDrawable(this, resources, (defpackage.aftt) null);
    }
}
