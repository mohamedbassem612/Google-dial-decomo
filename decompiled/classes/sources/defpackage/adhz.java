package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhz {
    public java.lang.String a;
    public java.lang.String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private defpackage.aift h;
    private defpackage.aify i;
    private defpackage.adhv j;
    private byte k;

    public final com.google.android.libraries.micore.superpacks.base.RegistrationConfig a() {
        defpackage.adhv adhvVar;
        defpackage.aift aiftVar = this.h;
        if (aiftVar != null) {
            this.i = aiftVar.g();
        } else if (this.i == null) {
            this.i = defpackage.aike.a;
        }
        if (this.k == 31 && (adhvVar = this.j) != null) {
            return new com.google.android.libraries.micore.superpacks.base.AutoValue_RegistrationConfig(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i, adhvVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" connectionConstraints");
        }
        if ((this.k & 2) == 0) {
            sb.append(" chargingConstraints");
        }
        if ((this.k & 4) == 0) {
            sb.append(" idleConstraints");
        }
        if ((this.k & 8) == 0) {
            sb.append(" batteryConstraints");
        }
        if ((this.k & 16) == 0) {
            sb.append(" schedulingFlags");
        }
        if (this.j == null) {
            sb.append(" extras");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        int i = defpackage.adho.a;
        if (str != null) {
            defpackage.adho.e(str);
        }
        if (this.h == null) {
            if (this.i == null) {
                this.h = new defpackage.aift(4);
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                this.h = aiftVar;
                aiftVar.k(this.i);
                this.i = null;
            }
        }
        this.h.i(str);
    }

    public final void c(int i) {
        this.f = i;
        this.k = (byte) (this.k | 8);
    }

    public final void d(int i) {
        this.d = i;
        this.k = (byte) (this.k | 2);
    }

    public final void e(int i) {
        this.c = i;
        this.k = (byte) (this.k | 1);
    }

    public final void f(defpackage.adhv adhvVar) {
        if (adhvVar == null) {
            throw new java.lang.NullPointerException("Null extras");
        }
        this.j = adhvVar;
    }

    public final void g(int i) {
        this.e = i;
        this.k = (byte) (this.k | 4);
    }

    public final void h(int i) {
        this.g = i;
        this.k = (byte) (this.k | 16);
    }
}
