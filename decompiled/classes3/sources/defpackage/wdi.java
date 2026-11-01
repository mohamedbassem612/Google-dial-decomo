package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdi {
    public int a;
    public int b;
    public byte c = 3;
    public java.lang.Object d;
    public java.lang.Object e;
    private java.lang.Object f;

    public wdi(defpackage.wdj wdjVar) {
        this.a = wdjVar.a;
        this.d = wdjVar.b;
        this.e = wdjVar.c;
        this.b = wdjVar.d;
        this.f = wdjVar.e;
    }

    public final defpackage.wdj a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (this.c == 3 && (obj = this.d) != null && (obj2 = this.f) != null) {
            return new defpackage.wdj(this.a, (android.graphics.drawable.Icon) obj, (android.graphics.drawable.Drawable) this.e, this.b, (aify) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" primaryColor");
        }
        if (this.d == null) {
            sb.append(" primaryIcon");
        }
        if ((this.c & 2) == 0) {
            sb.append(" startingYPosition");
        }
        if (this.f == null) {
            sb.append(" actions");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.util.List list) {
        this.f = aify.n(list);
    }

    public final defpackage.tiv c() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (this.c == 3 && (obj = this.e) != null && (obj2 = this.f) != null && (obj3 = this.d) != null) {
            return new defpackage.tiv((defpackage.tkd) obj, (java.lang.String) obj2, this.b, (defpackage.abvz) obj3, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == null) {
            sb.append(" rowClickListener");
        }
        if (this.f == null) {
            sb.append(" phoneNumber");
        }
        if ((this.c & 1) == 0) {
            sb.append(" ranking");
        }
        if (this.d == null) {
            sb.append(" calleeId");
        }
        if ((this.c & 2) == 0) {
            sb.append(" carrierPresence");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(defpackage.abvz abvzVar) {
        if (abvzVar == null) {
            throw new java.lang.NullPointerException("Null calleeId");
        }
        this.d = abvzVar;
    }

    public final void e(int i) {
        this.a = i;
        this.c = (byte) (this.c | 2);
    }

    public final void f(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null phoneNumber");
        }
        this.f = str;
    }

    public final void g(int i) {
        this.b = i;
        this.c = (byte) (this.c | 1);
    }
}
