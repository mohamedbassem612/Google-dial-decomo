package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjb {
    public int a;

    public cjb(byte[] bArr) {
        this.a = 0;
    }

    public final java.lang.String toString() {
        int i = this.a;
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        defpackage.aooh.e(string, "toString(...)");
        return "IntRef(element = " + i + ")@" + string;
    }

    public cjb() {
        this(null);
    }
}
