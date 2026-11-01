package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyk extends defpackage.afyf {
    public final defpackage.afyi a;
    public final defpackage.afyj b;
    public android.graphics.drawable.Drawable c;

    public afyk(android.content.Context context, defpackage.afxn afxnVar, defpackage.afyi afyiVar, defpackage.afyj afyjVar) {
        super(context, afxnVar);
        this.a = afyiVar;
        this.b = afyjVar;
        afyjVar.j = this;
    }

    private final boolean a() {
        return this.p != null && defpackage.aftt.e(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        int i;
        java.util.List list;
        android.graphics.drawable.Drawable drawable;
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.o)) {
            return;
        }
        int i2 = 0;
        if (a() && (drawable = this.c) != null) {
            drawable.setBounds(getBounds());
            this.c.setTint(this.j.e[0]);
            this.c.draw(canvas);
            return;
        }
        canvas.save();
        defpackage.afyi afyiVar = this.a;
        afyiVar.h(canvas, getBounds(), f(), k(), j());
        defpackage.afxn afxnVar = this.j;
        int i3 = afxnVar.i;
        int i4 = this.n;
        boolean z2 = (afxnVar instanceof defpackage.afyt) || ((afxnVar instanceof defpackage.afxz) && ((defpackage.afxz) afxnVar).u);
        if (!z2 || i3 != 0) {
            z = false;
        } else if (afxnVar.c(false)) {
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (z) {
            afyiVar.f(canvas, this.m, 0.0f, 1.0f, afxnVar.f, i4, 0);
        } else {
            if (z2) {
                java.util.List list2 = this.b.k;
                defpackage.afyg afygVar = (defpackage.afyg) list2.get(0);
                defpackage.afyg afygVar2 = (defpackage.afyg) list2.get(list2.size() - 1);
                if (afyiVar instanceof defpackage.afyl) {
                    android.graphics.Paint paint = this.m;
                    i = i3;
                    afyiVar.f(canvas, paint, 0.0f, afygVar.a, afxnVar.f, i4, i);
                    afyiVar.f(canvas, paint, afygVar2.b, 1.0f, afxnVar.f, i4, i);
                } else {
                    i = i3;
                    canvas.save();
                    canvas.rotate(afygVar2.g);
                    afyiVar.f(canvas, this.m, afygVar2.b, 1.0f + afygVar.a, afxnVar.f, i4, i);
                    canvas.restore();
                }
            }
            while (true) {
                list = this.b.k;
                if (i2 < list.size()) {
                    canvas.restore();
                    return;
                }
                defpackage.afyg afygVar3 = (defpackage.afyg) list.get(i2);
                afygVar3.f = g();
                android.graphics.Paint paint2 = this.m;
                afyiVar.e(canvas, paint2, afygVar3, this.n);
                if (i2 <= 0 && !z && z2) {
                    afyiVar.f(canvas, paint2, ((defpackage.afyg) list.get(i2 - 1)).b, afygVar3.a, afxnVar.f, i4, i);
                }
                i2++;
            }
        }
        i = i3;
        while (true) {
            list = this.b.k;
            if (i2 < list.size()) {
                canvas.restore();
                return;
            }
            defpackage.afyg afygVar4 = (defpackage.afyg) list.get(i2);
            afygVar4.f = g();
            android.graphics.Paint paint3 = this.m;
            afyiVar.e(canvas, paint3, afygVar4, this.n);
            if (i2 <= 0) {
            }
            i2++;
        }
    }

    @Override // defpackage.afyf
    public final boolean e(boolean z, boolean z2, boolean z3) {
        android.graphics.drawable.Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (!z || !z3) {
            return zE;
        }
        this.b.f();
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.afyf, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
