package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqo {
    public int a;
    public int b;

    public final defpackage.qqp a() {
        int i;
        int i2 = this.a;
        if (i2 != 0 && (i = this.b) != 0) {
            return new defpackage.qqp(i2, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == 0) {
            sb.append(" horizontalPosition");
        }
        if (this.b == 0) {
            sb.append(" verticalPosition");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
