package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yuq {
    public final boolean a;

    public yuq(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yuq) && this.a == ((defpackage.yuq) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "BackgroundDownloadConfig(shouldEnableAiCoreModelBackgroundDownload=" + this.a + ')';
    }
}
