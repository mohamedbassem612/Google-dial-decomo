package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkc {
    public com.google.android.libraries.micore.superpacks.base.BasePriority a;
    private defpackage.adhw b;
    private long c;
    private int d;
    private int e;
    private byte f;

    public final defpackage.adkd a() {
        defpackage.adhw adhwVar;
        com.google.android.libraries.micore.superpacks.base.BasePriority basePriority;
        if (this.f == 7 && (adhwVar = this.b) != null && (basePriority = this.a) != null) {
            return new defpackage.adjt(adhwVar, this.c, this.d, this.e, basePriority);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" name");
        }
        if ((this.f & 1) == 0) {
            sb.append(" reservedSize");
        }
        if ((this.f & 2) == 0) {
            sb.append(" gcPriority");
        }
        if ((this.f & 4) == 0) {
            sb.append(" reservationState");
        }
        if (this.a == null) {
            sb.append(" baseGcPriority");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.f = (byte) (this.f | 2);
    }

    public final void c(defpackage.adhw adhwVar) {
        if (adhwVar == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.b = adhwVar;
    }

    public final void d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 4);
    }

    public final void e(long j) {
        this.c = j;
        this.f = (byte) (this.f | 1);
    }
}
