package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oum {
    private defpackage.ous a;
    private int b;
    private defpackage.ouq c;
    private byte d;

    public final defpackage.our a() {
        int i = ~this.d;
        if ((i & 3) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" priority");
            }
            if ((this.d & 2) == 0) {
                sb.append(" textRes");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        defpackage.ous ousVar = this.a;
        int i2 = this.b;
        defpackage.ouq ouqVar = this.c;
        int i3 = (i & 4) == 0 ? 0 : 1;
        if ((i & 8) != 0) {
            ouqVar = defpackage.oup.a;
        }
        return new defpackage.our(ousVar, i2, i3, ouqVar);
    }

    public final void b(defpackage.ouq ouqVar) {
        this.c = ouqVar;
        this.d = (byte) (this.d | 8);
    }

    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(defpackage.ous ousVar) {
        this.a = ousVar;
        this.d = (byte) (this.d | 1);
    }
}
