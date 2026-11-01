package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olq {
    public final int a;
    public final int b;
    public final long c;

    public olq(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public static defpackage.olp a() {
        defpackage.olp olpVar = new defpackage.olp();
        olpVar.c(0L);
        return olpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.olq) {
            defpackage.olq olqVar = (defpackage.olq) obj;
            if (this.a == olqVar.a && this.b == olqVar.b && this.c == olqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ ((int) this.c);
    }

    public final java.lang.String toString() {
        return "FeatureDemoAnimationClip{startFrame=" + this.a + ", endFrame=" + this.b + ", fadeInDurationMillis=" + this.c + '}';
    }

    public olq() {
        throw null;
    }
}
