package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ess {
    public static final java.lang.String a;
    public static final java.lang.String b;
    public static final java.lang.String c;
    public static final java.lang.String d;
    public static final java.lang.String e;
    public static final java.lang.String f;
    public static final java.lang.String g;
    public static final java.lang.String h;
    public static final java.lang.String i;
    public static final java.lang.String j;
    public static final java.lang.String k;
    public static final java.lang.String l;
    public static final java.lang.String m;
    public static final java.lang.String n;
    public static final java.lang.String o;
    public static final java.lang.String p;
    public static final java.lang.String q;
    public static final java.lang.String r;
    public static final java.lang.String s;
    public static final java.lang.String t;
    public final int A;
    public final float B;
    public final int C;
    public final float D;
    public final float E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final int L;
    public final java.lang.CharSequence u;
    public final android.text.Layout.Alignment v;
    public final android.text.Layout.Alignment w;
    public final android.graphics.Bitmap x;
    public final float y;
    public final int z;

    static {
        defpackage.esr esrVar = new defpackage.esr();
        esrVar.d("");
        esrVar.a();
        java.lang.String str = eum.a;
        a = "0";
        b = "h";
        c = "1";
        d = "2";
        e = "3";
        f = "i";
        g = "4";
        h = "5";
        i = "6";
        j = "7";
        k = "8";
        l = "9";
        m = "a";
        n = "b";
        o = "c";
        p = "d";
        q = "e";
        r = "f";
        s = "g";
        t = "j";
    }

    public ess(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, int i8) {
        if (charSequence == null) {
            ahvr.ci(bitmap);
        } else {
            ahvr.bM(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.u = android.text.SpannedString.valueOf(charSequence);
        } else {
            this.u = charSequence != null ? charSequence.toString() : null;
        }
        this.v = alignment;
        this.w = alignment2;
        this.x = bitmap;
        this.y = f2;
        this.z = i2;
        this.A = i3;
        this.B = f3;
        this.C = i4;
        this.D = f5;
        this.E = f6;
        this.F = z;
        this.G = i6;
        this.H = i5;
        this.I = f4;
        this.J = i7;
        this.K = f7;
        this.L = i8;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ess essVar = (defpackage.ess) obj;
            if (android.text.TextUtils.equals(this.u, essVar.u) && this.v == essVar.v && this.w == essVar.w && ((bitmap = this.x) != null ? !((bitmap2 = essVar.x) == null || !bitmap.sameAs(bitmap2)) : essVar.x == null) && this.y == essVar.y && this.z == essVar.z && this.A == essVar.A && this.B == essVar.B && this.C == essVar.C && this.D == essVar.D && this.E == essVar.E && this.F == essVar.F && this.G == essVar.G && this.H == essVar.H && this.I == essVar.I && this.J == essVar.J && this.K == essVar.K && this.L == essVar.L) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.u, this.v, this.w, this.x, java.lang.Float.valueOf(this.y), java.lang.Integer.valueOf(this.z), java.lang.Integer.valueOf(this.A), java.lang.Float.valueOf(this.B), java.lang.Integer.valueOf(this.C), java.lang.Float.valueOf(this.D), java.lang.Float.valueOf(this.E), java.lang.Boolean.valueOf(this.F), java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(this.H), java.lang.Float.valueOf(this.I), java.lang.Integer.valueOf(this.J), java.lang.Float.valueOf(this.K), java.lang.Integer.valueOf(this.L)});
    }
}
