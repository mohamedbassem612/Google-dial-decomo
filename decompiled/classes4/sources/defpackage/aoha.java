package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoha {
    public final java.lang.String a;
    public final int b;
    private final java.lang.String c;

    public aoha(defpackage.aogz aogzVar) {
        this.a = aogzVar.b;
        this.b = aogzVar.a();
        this.c = aogzVar.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int b(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aoha) && ((defpackage.aoha) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c;
    }
}
