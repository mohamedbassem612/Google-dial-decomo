package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaaj {
    private static volatile defpackage.aaaj c;
    public int a;
    public final java.lang.Object b;

    private aaaj() {
        this.a = 0;
        this.b = new defpackage.aca();
    }

    public static defpackage.aaaj b() {
        if (c == null) {
            synchronized (defpackage.aaaj.class) {
                if (c == null) {
                    c = new defpackage.aaaj();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized void p(java.lang.String str, int i, int i2, com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable) {
        if (i != 1002) {
            defpackage.dxy dxyVar = new defpackage.dxy(str, java.lang.Integer.valueOf(i));
            ?? r1 = this.b;
            com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable2 = (com.google.android.gms.clearcut.internal.LogErrorParcelable) r1.get(dxyVar);
            if (logErrorParcelable2 != null) {
                logErrorParcelable2.c = defpackage.aiql.al(logErrorParcelable2.c, i2);
                return;
            } else if (((defpackage.aec) r1).d < 100) {
                if (logErrorParcelable == null) {
                    logErrorParcelable = new com.google.android.gms.clearcut.internal.LogErrorParcelable(str, i, i2);
                }
                r1.put(dxyVar, logErrorParcelable);
                return;
            }
        }
        this.a = defpackage.aiql.al(this.a, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable a() {
        java.util.ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new java.util.ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new com.google.android.gms.clearcut.internal.LogErrorParcelable("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable(arrayList);
    }

    public final synchronized void c(com.google.android.gms.clearcut.internal.LogErrorParcelable logErrorParcelable) {
        p(logErrorParcelable.a, logErrorParcelable.b, logErrorParcelable.c, logErrorParcelable);
    }

    public final void d(int i, android.content.Context context) {
        if (defpackage.andw.a.eZ().a(context)) {
            e("UNKNOWN", i);
        }
    }

    public final synchronized void e(java.lang.String str, int i) {
        p(str, i, 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final defpackage.apjp f() {
        if (!g()) {
            throw new java.util.NoSuchElementException();
        }
        ?? r0 = this.b;
        int i = this.a;
        this.a = i + 1;
        return (defpackage.apjp) r0.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean g() {
        return this.a < this.b.size();
    }

    public final java.lang.Object h() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = (java.lang.Object[]) this.b;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void i(java.lang.Object obj) {
        int i = this.a;
        if (i < 256) {
            ((java.lang.Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final void j() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void k() {
        android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) this.b).getDrawable();
        if (drawable != null) {
            defpackage.iz.b(drawable);
        }
    }

    public final void l(android.util.AttributeSet attributeSet, int i) {
        int iR;
        java.lang.Object obj = this.b;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        android.content.Context context = imageView.getContext();
        int[] iArr = defpackage.ef.f;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        java.lang.Object obj2 = ajxwVar.b;
        android.content.Context context2 = imageView.getContext();
        int i2 = defpackage.dzs.a;
        defpackage.dzp.b((android.view.View) obj, context2, iArr, attributeSet, (android.content.res.TypedArray) obj2, i, 0);
        try {
            android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) obj).getDrawable();
            if (drawable == null && (iR = ajxwVar.r(1, -1)) != -1) {
                drawable = defpackage.lg.e().c(((android.widget.ImageView) obj).getContext(), iR);
                if (drawable != null) {
                    ((android.widget.ImageView) obj).setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                defpackage.iz.b(drawable);
            }
            if (ajxwVar.z(2)) {
                ((android.widget.ImageView) obj).setImageTintList(ajxwVar.s(2));
            }
            if (ajxwVar.z(3)) {
                int iO = ajxwVar.o(3, -1);
                android.graphics.Rect rect = defpackage.iz.a;
                ((android.widget.ImageView) obj).setImageTintMode(defpackage.a.q(iO, null));
            }
        } finally {
            ajxwVar.x();
        }
    }

    public final void m(android.graphics.drawable.Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void n(int i) {
        java.lang.Object obj = this.b;
        if (i != 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) obj;
            android.graphics.drawable.Drawable drawableBO = defpackage.den.bO(imageView.getContext(), i);
            if (drawableBO != null) {
                defpackage.iz.b(drawableBO);
            }
            imageView.setImageDrawable(drawableBO);
        } else {
            ((android.widget.ImageView) obj).setImageDrawable(null);
        }
        k();
    }

    public final boolean o() {
        return !(((android.widget.ImageView) this.b).getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    public aaaj(java.util.List list) {
        this.b = list;
    }

    public aaaj(byte[] bArr) {
        this.b = new java.lang.Object[256];
    }

    public aaaj(android.widget.ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }
}
