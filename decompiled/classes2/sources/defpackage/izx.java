package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izx {
    public final aomy a;
    public final aomy b;
    public final aomy c;

    public /* synthetic */ izx(aomy aomyVar, int i) {
        this((i & 1) != 0 ? new defpackage.eli(10) : aomyVar, new defpackage.eli(11), new defpackage.eli(12));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.izx) {
            defpackage.izx izxVar = (defpackage.izx) obj;
            if (aooh.n(this.a, izxVar.a) && aooh.n(this.b, izxVar.b) && aooh.n(this.c, izxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "GreetingActions(onSetAsDefault=" + this.a + ", onRenameAttempt=" + this.b + ", onDeleteAttempt=" + this.c + ')';
    }

    public izx(aomy aomyVar, aomy aomyVar2, aomy aomyVar3) {
        aooh.f(aomyVar, "onSetAsDefault");
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = aomyVar3;
    }

    public izx() {
        this(null, 7);
    }
}
