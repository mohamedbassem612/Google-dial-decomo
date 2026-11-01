package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kam extends defpackage.jlr {
    public final defpackage.kao a;
    public final spn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kam(defpackage.kao kaoVar, spn spnVar) {
        super(null);
        aooh.f(kaoVar, "key");
        aooh.f(spnVar, "phoneLookupInfo");
        this.a = kaoVar;
        this.b = spnVar;
    }

    @Override // defpackage.jlr
    public final /* synthetic */ defpackage.kaq C() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kam) {
            defpackage.kam kamVar = (defpackage.kam) obj;
            if (aooh.n(this.a, kamVar.a) && aooh.n(this.b, kamVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CarrierEntryInfo(key=" + this.a + ", phoneLookupInfo=" + this.b + ')';
    }
}
