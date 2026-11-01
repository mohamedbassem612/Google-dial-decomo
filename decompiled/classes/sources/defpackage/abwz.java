package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abwz implements defpackage.abxa {
    private final java.lang.String a;

    public /* synthetic */ abwz(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.abxa
    public final /* synthetic */ java.lang.Object a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.abwz) && defpackage.aooh.n(this.a, ((defpackage.abwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "StringEntityKey(value=" + this.a + ')';
    }
}
