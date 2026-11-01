package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class euu {
    public final int d;

    public euu(int i) {
        this.d = i;
    }

    public static java.lang.String e(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public java.lang.String toString() {
        return e(this.d);
    }
}
