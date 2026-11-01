package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gmd extends android.graphics.drawable.Drawable.ConstantState {
    int a;
    defpackage.gmc b;
    android.content.res.ColorStateList c;
    android.graphics.PorterDuff.Mode d;
    boolean e;
    android.graphics.Bitmap f;
    android.content.res.ColorStateList g;
    android.graphics.PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    android.graphics.Paint l;

    public gmd(defpackage.gmd gmdVar) {
        this.c = null;
        this.d = gmf.a;
        if (gmdVar != null) {
            this.a = gmdVar.a;
            this.b = new defpackage.gmc(gmdVar.b);
            android.graphics.Paint paint = gmdVar.b.c;
            if (paint != null) {
                this.b.c = new android.graphics.Paint(paint);
            }
            android.graphics.Paint paint2 = gmdVar.b.b;
            if (paint2 != null) {
                this.b.b = new android.graphics.Paint(paint2);
            }
            this.c = gmdVar.c;
            this.d = gmdVar.d;
            this.e = gmdVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.f);
        defpackage.gmc gmcVar = this.b;
        gmcVar.a(gmcVar.d, defpackage.gmc.a, canvas, i, i2);
    }

    public final boolean b() {
        defpackage.gmc gmcVar = this.b;
        if (gmcVar.k == null) {
            gmcVar.k = java.lang.Boolean.valueOf(gmcVar.d.F());
        }
        return gmcVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new gmf(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new gmf(this);
    }

    public gmd() {
        this.c = null;
        this.d = gmf.a;
        this.b = new defpackage.gmc();
    }
}
