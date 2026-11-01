package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ahms implements defpackage.ahpj {
    private final defpackage.ahpj a;
    private final java.util.UUID b;
    private final java.lang.String c;
    private final java.lang.String d;
    private java.lang.Thread e;
    private defpackage.ahne f;

    public ahms(java.lang.String str, defpackage.ahpj ahpjVar, defpackage.ahpe ahpeVar) {
        str.getClass();
        this.d = str;
        this.a = ahpjVar;
        this.b = ahpjVar.g();
        this.c = ahpjVar.e();
        defpackage.ahne ahneVar = ahpeVar.e;
        if (ahneVar == null) {
            this.f = null;
            this.e = java.lang.Thread.currentThread();
        } else {
            this.f = ahneVar;
            this.e = null;
        }
    }

    public static java.lang.String fo(java.util.UUID uuid) {
        return "tk-trace-id: ".concat(java.lang.String.valueOf(java.lang.Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.ahpj
    public final defpackage.ahne a() {
        return this.f;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahpj b() {
        return this.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnp */
    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnq */
    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ahnp, ahnq {
        defpackage.ahns.k(this);
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.ahpj
    public final java.lang.String d() {
        return this.d;
    }

    @Override // defpackage.ahpj
    public final java.lang.String e() {
        return this.c;
    }

    @Override // defpackage.ahpj
    public final java.lang.Thread f() {
        return this.e;
    }

    @Override // defpackage.ahpj
    public final java.util.UUID g() {
        return this.b;
    }

    public final java.lang.String toString() {
        return defpackage.ahns.j(this);
    }

    public ahms(java.lang.String str, java.util.UUID uuid, java.lang.String str2, defpackage.ahpe ahpeVar) {
        str.getClass();
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        defpackage.ahne ahneVar = ahpeVar.e;
        if (ahneVar == null) {
            this.f = null;
            this.e = java.lang.Thread.currentThread();
        } else {
            this.f = ahneVar;
            this.e = null;
        }
    }
}
