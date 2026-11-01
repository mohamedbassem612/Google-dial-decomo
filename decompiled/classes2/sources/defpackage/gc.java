package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class gc {
    public android.view.View a;
    public android.widget.PopupWindow.OnDismissListener c;
    private final android.content.Context d;
    private final ft e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private gd j;
    private defpackage.gb k;
    public int b = 8388611;
    private final android.widget.PopupWindow.OnDismissListener l = new defpackage.kd(this, 1);

    public gc(android.content.Context context, ft ftVar, android.view.View view, boolean z, int i, int i2) {
        this.d = context;
        this.e = ftVar;
        this.a = view;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final defpackage.gb a() {
        defpackage.gb fnVar = this.k;
        if (fnVar == null) {
            android.content.Context context = this.d;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            fnVar = java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165208) ? new defpackage.fn(context, this.a, this.g, this.h, this.f) : new defpackage.gl(context, this.e, this.a, this.g, this.h, this.f);
            fnVar.l(this.e);
            fnVar.s(this.l);
            fnVar.o(this.a);
            fnVar.e(this.j);
            fnVar.p(this.i);
            fnVar.q(this.b);
            this.k = fnVar;
        }
        return fnVar;
    }

    public final void b() {
        if (h()) {
            this.k.m();
        }
    }

    public void c() {
        this.k = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.i = z;
        defpackage.gb gbVar = this.k;
        if (gbVar != null) {
            gbVar.p(z);
        }
    }

    public final void e(gd gdVar) {
        this.j = gdVar;
        defpackage.gb gbVar = this.k;
        if (gbVar != null) {
            gbVar.e(gdVar);
        }
    }

    public final void f() {
        if (!i()) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        defpackage.gb gbVarA = a();
        gbVarA.t(z2);
        if (z) {
            if ((android.view.Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            gbVarA.r(i);
            gbVarA.u(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            gbVarA.g = new android.graphics.Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        gbVarA.v();
    }

    public final boolean h() {
        defpackage.gb gbVar = this.k;
        return gbVar != null && gbVar.x();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }
}
