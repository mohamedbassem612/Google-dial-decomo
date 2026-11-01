package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpj {
    public java.lang.String a;
    private ajcq b;
    private int c;
    private int d;
    private byte e;

    public final defpackage.alpk a() {
        ajcq ajcqVar;
        java.lang.String str;
        if (this.e == 3 && (ajcqVar = this.b) != null && (str = this.a) != null) {
            return new defpackage.alpk(ajcqVar, this.c, str, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" inferenceFuture");
        }
        if ((this.e & 1) == 0) {
            sb.append(" aiCoreFeatureId");
        }
        if (this.a == null) {
            sb.append(" aiCoreFeatureName");
        }
        if ((this.e & 2) == 0) {
            sb.append(" version");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    public final void c(ajcq ajcqVar) {
        if (ajcqVar == null) {
            throw new java.lang.NullPointerException("Null inferenceFuture");
        }
        this.b = ajcqVar;
    }

    public final void d(int i) {
        this.d = i;
        this.e = (byte) (this.e | 2);
    }
}
