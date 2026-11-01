package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptk {
    public static final defpackage.aptk a = new defpackage.aptk("Body part ended prematurely. Boundary detected in header or EOF reached.");
    public static final defpackage.aptk b = new defpackage.aptk("Unexpected end of headers detected. Higher level boundary detected or EOF reached.");
    public static final defpackage.aptk c = new defpackage.aptk("Invalid header encountered");
    public static final defpackage.aptk d = new defpackage.aptk("Obsolete header encountered");
    public final java.lang.String e;

    public aptk(java.lang.String str) {
        this.e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aptk) {
            return this.e.equals(((defpackage.aptk) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final java.lang.String toString() {
        return this.e;
    }
}
