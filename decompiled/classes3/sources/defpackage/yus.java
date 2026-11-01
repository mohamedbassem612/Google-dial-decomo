package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yus extends defpackage.yuu {
    public final defpackage.yse a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yus(byte[] bArr) {
        super(defpackage.yuv.b);
        defpackage.yse yseVar = defpackage.yse.d;
        this.a = yseVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yus) && this.a == ((defpackage.yus) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AiCoreIntentClassifier(aiCoreFeature=" + this.a + ')';
    }

    public yus() {
        this(null);
    }
}
