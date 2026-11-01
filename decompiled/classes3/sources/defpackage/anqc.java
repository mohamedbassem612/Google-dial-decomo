package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class anqc extends antw {
    private final anmv a;
    private final antw b;

    public anqc(antw antwVar, anmv anmvVar) {
        this();
        this.b = antwVar;
        this.a = anmvVar;
    }

    public final void a() {
        anmv anmvVarA = this.a.a();
        try {
            this.b.a();
        } finally {
            this.a.f(anmvVarA);
        }
    }

    public final void b() {
        anmv anmvVarA = this.a.a();
        try {
            this.b.b();
        } finally {
            this.a.f(anmvVarA);
        }
    }

    public final void c() {
        anmv anmvVarA = this.a.a();
        try {
            this.b.c();
        } finally {
            this.a.f(anmvVarA);
        }
    }

    public final void d(java.lang.Object obj) {
        anmv anmvVarA = this.a.a();
        try {
            this.b.d(obj);
        } finally {
            this.a.f(anmvVarA);
        }
    }

    public final void e() {
        anmv anmvVarA = this.a.a();
        try {
            this.b.e();
        } finally {
            this.a.f(anmvVarA);
        }
    }

    protected final antw g() {
        return this.b;
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", g());
        return ahymVarL.toString();
    }

    public anqc() {
        super((char[]) null);
    }
}
