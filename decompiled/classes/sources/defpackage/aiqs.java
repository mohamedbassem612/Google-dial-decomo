package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiqs {
    public static final java.util.Comparator a = new defpackage.beg(18);
    public static final defpackage.aiqs b = new defpackage.aiqs(new defpackage.aiqq(java.util.Collections.EMPTY_LIST));
    public final defpackage.aiqq c;

    public aiqs(defpackage.aiqq aiqqVar) {
        this.c = aiqqVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aiqs) && ((defpackage.aiqs) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c.toString();
    }
}
