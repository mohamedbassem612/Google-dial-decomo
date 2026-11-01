package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfk implements defpackage.xuo {
    private final int b;
    private final defpackage.xuo c;

    public yfk(int i, defpackage.xuo xuoVar) {
        this.b = i;
        this.c = xuoVar;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yfk)) {
            return false;
        }
        defpackage.yfk yfkVar = (defpackage.yfk) obj;
        return this.b == yfkVar.b && this.c.equals(yfkVar.c);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return defpackage.ygc.c(this.c, this.b);
    }
}
