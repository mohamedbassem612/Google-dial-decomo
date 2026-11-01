package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class goi {
    public static final defpackage.goi a = new defpackage.goi(0);
    public static final defpackage.goi b = new defpackage.goi(1);
    private final int c;

    private goi(int i) {
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.goi) && this.c == ((defpackage.goi) obj).c;
        }
        return true;
    }

    public final int hashCode() {
        return this.c * 31;
    }

    public final java.lang.String toString() {
        return this.c != 0 ? "JUMP_CUT" : "DEFAULT";
    }
}
