package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class agad extends android.graphics.drawable.Drawable.ConstantState {
    public defpackage.agak a;
    defpackage.afsr b;
    android.graphics.ColorFilter c;
    android.content.res.ColorStateList d;
    android.content.res.ColorStateList e;
    android.content.res.ColorStateList f;
    android.content.res.ColorStateList g;
    android.graphics.PorterDuff.Mode h;
    public android.graphics.Rect i;
    float j;
    public float k;
    float l;
    int m;
    float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    android.graphics.Paint.Style v;

    public agad(defpackage.agad agadVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = android.graphics.PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.a = agadVar.a;
        this.b = agadVar.b;
        this.l = agadVar.l;
        this.c = agadVar.c;
        this.d = agadVar.d;
        this.e = agadVar.e;
        this.h = agadVar.h;
        this.g = agadVar.g;
        this.m = agadVar.m;
        this.j = agadVar.j;
        this.s = agadVar.s;
        this.q = agadVar.q;
        boolean z = agadVar.u;
        this.u = false;
        this.k = agadVar.k;
        this.n = agadVar.n;
        this.o = agadVar.o;
        float f = agadVar.p;
        this.p = 0.0f;
        this.r = agadVar.r;
        this.t = agadVar.t;
        this.f = agadVar.f;
        this.v = agadVar.v;
        android.graphics.Rect rect = agadVar.i;
        if (rect != null) {
            this.i = new android.graphics.Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        defpackage.agaf agafVar = new defpackage.agaf(this);
        agafVar.u = true;
        agafVar.v = true;
        return agafVar;
    }

    public agad(defpackage.agak agakVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = android.graphics.PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.a = agakVar;
        this.b = null;
    }
}
