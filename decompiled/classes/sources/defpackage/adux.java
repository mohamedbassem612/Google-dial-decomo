package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adux {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public defpackage.aihd e;
    public java.lang.String f;
    public java.lang.String g;
    public int h;
    private long i;
    private java.lang.String j;
    private int k;
    private long l;
    private long m;
    private int n;
    private long o;
    private long p;
    private byte q = 127;

    public adux(defpackage.aduy aduyVar) {
        this.i = aduyVar.a;
        this.j = aduyVar.b;
        this.h = aduyVar.p;
        this.a = aduyVar.c;
        this.b = aduyVar.d;
        this.c = aduyVar.e;
        this.k = aduyVar.f;
        this.d = aduyVar.g;
        this.e = aduyVar.h;
        this.f = aduyVar.i;
        this.l = aduyVar.j;
        this.m = aduyVar.k;
        this.n = aduyVar.l;
        this.o = aduyVar.m;
        this.g = aduyVar.n;
        this.p = aduyVar.o;
    }

    public final defpackage.aduy a() {
        java.lang.String str;
        int i;
        if (this.q == 127 && (str = this.j) != null && (i = this.h) != 0) {
            return new defpackage.aduy(this.i, str, i, this.a, this.b, this.c, this.k, this.d, this.e, this.f, this.l, this.m, this.n, this.o, this.g, this.p);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.q & 1) == 0) {
            sb.append(" id");
        }
        if (this.j == null) {
            sb.append(" accountSpecificId");
        }
        if (this.h == 0) {
            sb.append(" accountType");
        }
        if ((this.q & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.q & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.q & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.q & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.q & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        if ((this.q & 64) == 0) {
            sb.append(" fitbitDecodedId");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        this.h = defpackage.agab.bU(accountRepresentation);
        c(accountRepresentation.a());
        if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
            this.a = ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) accountRepresentation).a;
        } else if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
            e(((com.google.android.libraries.notifications.platform.registration.Fitbit) accountRepresentation).b);
        }
    }

    protected final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountSpecificId");
        }
        this.j = str;
    }

    public final void d(long j) {
        this.o = j;
        this.q = (byte) (this.q | 32);
    }

    public final void e(long j) {
        this.p = j;
        this.q = (byte) (this.q | 64);
    }

    public final void f(long j) {
        this.i = j;
        this.q = (byte) (this.q | 1);
    }

    public final void g(int i) {
        this.n = i;
        this.q = (byte) (this.q | 16);
    }

    public final void h(long j) {
        this.m = j;
        this.q = (byte) (this.q | 8);
    }

    public final void i(int i) {
        this.k = i;
        this.q = (byte) (this.q | 2);
    }

    public final void j(long j) {
        this.l = j;
        this.q = (byte) (this.q | 4);
    }
}
