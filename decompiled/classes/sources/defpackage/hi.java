package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hi {
    public lq a;
    private final android.view.View b;
    private lq e;
    private lq f;
    private int d = -1;
    private final defpackage.ho c = defpackage.ho.d();

    public hi(android.view.View view) {
        this.b = view;
    }

    public final void a() {
        android.view.View view = this.b;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                lq lqVar = this.f;
                if (lqVar == null) {
                    lqVar = new lq();
                    this.f = lqVar;
                }
                lqVar.a = null;
                lqVar.d = false;
                lqVar.b = null;
                lqVar.c = false;
                int i = defpackage.dzs.a;
                android.content.res.ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    lqVar.d = true;
                    lqVar.a = backgroundTintList;
                }
                android.graphics.PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    lqVar.c = true;
                    lqVar.b = backgroundTintMode;
                }
                if (lqVar.d || lqVar.c) {
                    defpackage.lg.g(background, lqVar, view.getDrawableState());
                    return;
                }
            }
            lq lqVar2 = this.a;
            if (lqVar2 != null) {
                defpackage.lg.g(background, lqVar2, view.getDrawableState());
                return;
            }
            lq lqVar3 = this.e;
            if (lqVar3 != null) {
                defpackage.lg.g(background, lqVar3, view.getDrawableState());
            }
        }
    }

    public final void b(android.util.AttributeSet attributeSet, int i) {
        android.view.View view = this.b;
        android.content.Context context = view.getContext();
        int[] iArr = defpackage.ef.A;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        java.lang.Object obj = ajxwVar.b;
        android.content.Context context2 = view.getContext();
        int i2 = defpackage.dzs.a;
        defpackage.dzp.b(view, context2, iArr, attributeSet, (android.content.res.TypedArray) obj, i, 0);
        try {
            if (ajxwVar.z(0)) {
                this.d = ajxwVar.r(0, -1);
                android.content.res.ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (ajxwVar.z(1)) {
                view.setBackgroundTintList(ajxwVar.s(1));
            }
            if (ajxwVar.z(2)) {
                int iO = ajxwVar.o(2, -1);
                android.graphics.Rect rect = defpackage.iz.a;
                view.setBackgroundTintMode(defpackage.a.q(iO, null));
            }
        } finally {
            ajxwVar.x();
        }
    }

    public final void c(int i) {
        this.d = i;
        defpackage.ho hoVar = this.c;
        d(hoVar != null ? hoVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            lq lqVar = this.e;
            if (lqVar == null) {
                lqVar = new lq();
                this.e = lqVar;
            }
            lqVar.a = colorStateList;
            lqVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
