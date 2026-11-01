package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abkg implements abki {
    public final abkf a;
    private final defpackage.abjz b;

    public abkg(abkf abkfVar) {
        this.a = abkfVar;
        this.b = defpackage.abjz.a;
    }

    public final defpackage.abjz a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abkg) && aooh.n(this.a, ((defpackage.abkg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "UnassignedItem(colorStyle=" + this.a + ')';
    }

    public abkg() {
        this((byte[]) null);
    }

    public /* synthetic */ abkg(byte[] bArr) {
        this(defpackage.abkd.a);
    }
}
