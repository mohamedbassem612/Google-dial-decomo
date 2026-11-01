package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfj {
    public final java.util.List a;
    public final snl b;

    public sfj(java.util.List list, snl snlVar) {
        this.a = list;
        this.b = snlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sfj) {
            defpackage.sfj sfjVar = (defpackage.sfj) obj;
            if (aooh.n(this.a, sfjVar.a) && aooh.n(this.b, sfjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        snl snlVar = this.b;
        return iHashCode + (snlVar == null ? 0 : snlVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CallingCardSettingsUiModel(contactsWithCallingCard=" + this.a + ", myCallingCardData=" + this.b + ')';
    }
}
