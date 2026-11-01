package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjb {
    public com.google.android.libraries.micore.superpacks.base.VersionedName a;
    public java.lang.String b;
    private defpackage.adhw c;
    private long d;
    private int e;
    private int f;
    private long g;
    private int h;
    private byte i;

    public final defpackage.adjc a() {
        defpackage.adhw adhwVar;
        if (this.i == 31 && (adhwVar = this.c) != null) {
            defpackage.adiw adiwVar = new defpackage.adiw(adhwVar, this.a, this.d, this.e, this.f, this.g, this.b, this.h);
            long j = adiwVar.b;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "Reserved size must be larger or equals than 0, value: "));
            }
            long j2 = adiwVar.e;
            if (j2 >= 0) {
                return adiwVar;
            }
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j2, "Last access must be larger or equals than 0, value: "));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" name");
        }
        if ((this.i & 1) == 0) {
            sb.append(" reservedSize");
        }
        if ((this.i & 2) == 0) {
            sb.append(" gcPriority");
        }
        if ((this.i & 4) == 0) {
            sb.append(" reservationState");
        }
        if ((this.i & 8) == 0) {
            sb.append(" lastAccessMillis");
        }
        if ((this.i & 16) == 0) {
            sb.append(" validationFailureCount");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.i = (byte) (this.i | 2);
    }

    public final void c(long j) {
        this.g = j;
        this.i = (byte) (this.i | 8);
    }

    public final void d(defpackage.adhw adhwVar) {
        if (adhwVar == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.c = adhwVar;
    }

    public final void e(int i) {
        this.f = i;
        this.i = (byte) (this.i | 4);
    }

    public final void f(long j) {
        this.d = j;
        this.i = (byte) (this.i | 1);
    }

    public final void g(int i) {
        this.h = i;
        this.i = (byte) (this.i | 16);
    }
}
