package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdg {
    public android.graphics.drawable.Drawable a;
    public java.lang.String b;
    public defpackage.wdf c;
    private android.graphics.drawable.Drawable d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private byte i;

    public final defpackage.wdh a() {
        android.graphics.drawable.Drawable drawable;
        defpackage.wdf wdfVar;
        if (this.i == 15 && (drawable = this.d) != null && (wdfVar = this.c) != null) {
            return new defpackage.wdh(drawable, this.a, this.e, this.b, wdfVar, this.f, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" iconDrawable");
        }
        if ((this.i & 1) == 0) {
            sb.append(" nameRes");
        }
        if (this.c == null) {
            sb.append(" actionType");
        }
        if ((this.i & 2) == 0) {
            sb.append(" checkable");
        }
        if ((this.i & 4) == 0) {
            sb.append(" checked");
        }
        if ((this.i & 8) == 0) {
            sb.append(" enabled");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 2);
    }

    public final void c(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    public final void d(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 8);
    }

    public final void e(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.NullPointerException("Null iconDrawable");
        }
        this.d = drawable;
    }

    public final void f(int i) {
        this.e = i;
        this.i = (byte) (this.i | 1);
    }
}
