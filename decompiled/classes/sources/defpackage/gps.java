package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gps {
    public static final defpackage.gps a = new defpackage.gps("NEVER", 0);
    public static final defpackage.gps b = new defpackage.gps("ALWAYS", 1);
    public static final defpackage.gps c = new defpackage.gps("ADJACENT", 2);
    public final java.lang.String d;
    private final int e;

    private gps(java.lang.String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e;
    }

    public final java.lang.String toString() {
        return this.d;
    }
}
