package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezk {
    public static final defpackage.ezk a;
    public static final defpackage.ezk b;
    public static final defpackage.ezk c;
    public final long d;
    public final long e;

    static {
        defpackage.ezk ezkVar = new defpackage.ezk(0L, 0L);
        a = ezkVar;
        new defpackage.ezk(Long.MAX_VALUE, Long.MAX_VALUE);
        b = new defpackage.ezk(Long.MAX_VALUE, 0L);
        new defpackage.ezk(0L, Long.MAX_VALUE);
        c = ezkVar;
    }

    public ezk(long j, long j2) {
        ahvr.bM(true);
        ahvr.bM(true);
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ezk ezkVar = (defpackage.ezk) obj;
            if (this.d == ezkVar.d && this.e == ezkVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.d) * 31) + ((int) this.e);
    }
}
