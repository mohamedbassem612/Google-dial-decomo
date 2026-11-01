package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmm {
    public float a;
    public byte b;
    private defpackage.pms c;
    private java.lang.String d;
    private java.lang.Integer e;
    private android.graphics.drawable.Drawable f;

    public final defpackage.pmr a() {
        int i = ~this.b;
        if ((i & 3) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" priority");
            }
            if ((this.b & 2) == 0) {
                sb.append(" iconContentDescription");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        defpackage.pms pmsVar = this.c;
        java.lang.String str = this.d;
        java.lang.Integer num = this.e;
        android.graphics.drawable.Drawable drawable = this.f;
        float f = this.a;
        if ((i & 4) != 0) {
            num = null;
        }
        android.graphics.drawable.Drawable drawable2 = (i & 8) != 0 ? null : drawable;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return new defpackage.pmr(pmsVar, str, num, drawable2, f);
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null iconContentDescription");
        }
        this.d = str;
        this.b = (byte) (this.b | 2);
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        this.f = drawable;
        this.b = (byte) (this.b | 8);
    }

    public final void d(java.lang.Integer num) {
        this.e = num;
        this.b = (byte) (this.b | 4);
    }

    public final void e(defpackage.pms pmsVar) {
        this.c = pmsVar;
        this.b = (byte) (this.b | 1);
    }
}
