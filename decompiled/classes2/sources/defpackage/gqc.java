package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqc {
    public static final defpackage.gqc a = new defpackage.gqc(1);
    public static final defpackage.gqc b = new defpackage.gqc(2);
    private final int c;

    private gqc(int i) {
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.gqc) && this.c == ((defpackage.gqc) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final java.lang.String toString() {
        return this.c != 1 ? "AUDIO_ON" : "VISUALS_ON";
    }
}
