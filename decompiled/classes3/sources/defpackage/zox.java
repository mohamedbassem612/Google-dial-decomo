package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zox extends aehj {
    private final aojh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zox(byte[] bArr) {
        super((char[]) null);
        aojh aojhVar = aojh.a;
        this.a = aojhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zox) && aooh.n(this.a, ((defpackage.zox) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Uninitialized(empty=" + this.a + ')';
    }

    public zox() {
        this(null);
    }
}
