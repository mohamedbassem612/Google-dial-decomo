package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkg {
    public final boolean a;
    public final int b;

    public dkg(byte[] bArr) {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkg) {
            defpackage.dkg dkgVar = (defpackage.dkg) obj;
            if (this.a == dkgVar.a && this.b == dkgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + defpackage.djq.a(this.b) + ')';
    }

    public dkg(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public dkg() {
        this(0, false);
    }
}
