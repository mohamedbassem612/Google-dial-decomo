package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bqv {
    public final defpackage.bor a;
    public final defpackage.bwo b;
    public final defpackage.bti c;
    public final defpackage.bry d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bqv(byte[] bArr) {
        byte[] bArr2 = null;
        this(defpackage.bos.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new defpackage.bwo(bArr2), new defpackage.bti(bArr2), brx.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.bqv bqvVar = (defpackage.bqv) obj;
            if (defpackage.aooh.n(this.a, bqvVar.a) && defpackage.aooh.n(this.b, bqvVar.b) && defpackage.aooh.n(this.c, bqvVar.c) && defpackage.aooh.n(this.d, bqvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ')';
    }

    public bqv(defpackage.bor borVar, defpackage.bwo bwoVar, defpackage.bti btiVar, defpackage.bry bryVar) {
        this.a = borVar;
        this.b = bwoVar;
        this.c = btiVar;
        this.d = bryVar;
        int i = defpackage.bot.a;
    }

    public bqv() {
        this(null);
    }
}
