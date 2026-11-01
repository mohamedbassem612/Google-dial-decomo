package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kfd {
    public final boolean a;
    public final defpackage.kdf b;
    public final int c;

    public /* synthetic */ kfd(int i, int i2) {
        this(false, (i2 & 2) != 0 ? defpackage.kdf.a().a() : null, (i2 & 4) != 0 ? 0 : i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kfd) {
            defpackage.kfd kfdVar = (defpackage.kfd) obj;
            if (this.a == kfdVar.a && aooh.n(this.b, kfdVar.b) && this.c == kfdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.L(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "CallLogFragmentUiModel(hasCallLogPermission=" + this.a + ", callLogUiModelRowsWithCallingOptions=" + this.b + ", forceRefreshUiCounter=" + this.c + ')';
    }

    public kfd(boolean z, defpackage.kdf kdfVar, int i) {
        aooh.f(kdfVar, "callLogUiModelRowsWithCallingOptions");
        this.a = z;
        this.b = kdfVar;
        this.c = i;
    }

    public kfd() {
        this(0, 7);
    }
}
