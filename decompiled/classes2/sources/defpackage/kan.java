package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kan extends defpackage.jlr {
    public final defpackage.kap a;
    public final soe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kan(defpackage.kap kapVar, soe soeVar) {
        super(null);
        aooh.f(kapVar, "key");
        aooh.f(soeVar, "peopleInfo");
        this.a = kapVar;
        this.b = soeVar;
    }

    @Override // defpackage.jlr
    public final /* synthetic */ defpackage.kaq C() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kan) {
            defpackage.kan kanVar = (defpackage.kan) obj;
            if (aooh.n(this.a, kanVar.a) && aooh.n(this.b, kanVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ThirdPartyEntryInfo(key=" + this.a + ", peopleInfo=" + this.b + ')';
    }
}
