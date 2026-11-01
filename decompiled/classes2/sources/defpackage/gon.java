package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gon {
    public static final defpackage.gon a = new defpackage.gon(0);
    public static final defpackage.gon b = new defpackage.gon(1);
    public static final defpackage.gon c = new defpackage.gon(2);
    public static final defpackage.gon d = new defpackage.gon(3);
    public final int e;

    public gon(int i) {
        this.e = i;
        if (i < 0 || i >= 4) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.gon) && this.e == ((defpackage.gon) obj).e;
        }
        return true;
    }

    public final int hashCode() {
        return this.e;
    }

    public final java.lang.String toString() {
        int i = this.e;
        if (i == 0) {
            return "left";
        }
        if (i == 1) {
            return "top";
        }
        if (i != 2) {
            return i != 3 ? a.bj(i, "unknown position:") : "bottom";
        }
        return "right";
    }
}
