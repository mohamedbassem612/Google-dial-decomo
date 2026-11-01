package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abwy implements defpackage.abxa {
    private final long a;

    public /* synthetic */ abwy(long j) {
        this.a = j;
    }

    @Override // defpackage.abxa
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return java.lang.Long.valueOf(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.abwy) && this.a == ((defpackage.abwy) obj).a;
    }

    public final int hashCode() {
        return defpackage.anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "LongEntityKey(value=" + this.a + ')';
    }
}
