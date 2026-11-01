package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ord {
    public android.content.Intent a;
    private android.content.Context b;
    private int c;
    private int d;
    private aify e;
    private final j$.util.Optional f = j$.util.Optional.empty();
    private byte g;

    public static defpackage.ord a() {
        defpackage.ord ordVar = new defpackage.ord();
        ordVar.e(aike.a);
        return ordVar;
    }

    public final defpackage.orf b() {
        android.content.Context context;
        android.content.Intent intent;
        aify aifyVar;
        if (this.g == 3 && (context = this.b) != null && (intent = this.a) != null && (aifyVar = this.e) != null) {
            return new defpackage.orf(context, intent, this.c, this.d, aifyVar, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" context");
        }
        if (this.a == null) {
            sb.append(" intent");
        }
        if ((this.g & 1) == 0) {
            sb.append(" text");
        }
        if ((this.g & 2) == 0) {
            sb.append(" image");
        }
        if (this.e == null) {
            sb.append(" impressions");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(android.content.Context context) {
        if (context == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        this.b = context;
    }

    public final void d(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }

    public final void e(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null impressions");
        }
        this.e = aifyVar;
    }

    public final void f(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
    }
}
