package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apqx implements java.lang.AutoCloseable {
    public static final java.lang.ThreadLocal a = new defpackage.apqw();
    public static final defpackage.apqx b = new defpackage.apqx(null);
    public final char[] c;

    public apqx(char[] cArr) {
        this.c = cArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c == null) {
            java.lang.Object[] objArr = (java.lang.Object[]) a.get();
            java.util.Arrays.fill((char[]) objArr[1], (char) 0);
            objArr[0] = java.lang.Boolean.FALSE;
        }
    }
}
