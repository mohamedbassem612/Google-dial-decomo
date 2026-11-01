package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class akge {
    protected int a = 0;
    protected final java.util.TreeSet b = new java.util.TreeSet();

    public abstract int a(int i);

    public abstract java.lang.String b(int i);

    public abstract void c(java.io.ObjectInput objectInput);

    public abstract void d(java.io.ObjectOutput objectOutput);

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(a(i2));
            sb.append('|');
            sb.append(b(i2));
            sb.append('\n');
        }
        return sb.toString();
    }
}
