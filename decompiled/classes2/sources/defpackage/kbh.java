package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbh {
    public final abko a;
    public final java.lang.String b;

    public /* synthetic */ kbh(byte[] bArr) {
        this(new defpackage.abkp(new defpackage.abkg((byte[]) null), null), null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kbh) {
            defpackage.kbh kbhVar = (defpackage.kbh) obj;
            if (aooh.n(this.a, kbhVar.a) && aooh.n(this.b, kbhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CallLogAvatarUiModel(monogramUiData=" + this.a + ", contactUri=" + this.b + ')';
    }

    public kbh(abko abkoVar, java.lang.String str) {
        this.a = abkoVar;
        this.b = str;
    }

    public kbh() {
        this(null);
    }
}
