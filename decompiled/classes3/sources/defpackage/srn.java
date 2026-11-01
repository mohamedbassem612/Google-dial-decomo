package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class srn {
    public final java.lang.String a;
    public final defpackage.spn b;
    public final long c;

    public srn(java.lang.String str, defpackage.spn spnVar, long j) {
        aooh.f(str, "normalizedNumber");
        aooh.f(spnVar, "phoneLookupInfo");
        this.a = str;
        this.b = spnVar;
        this.c = j;
    }

    public final android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("normalized_number", this.a);
        contentValues.put("phone_lookup_info", this.b.i());
        contentValues.put("last_modified", java.lang.Long.valueOf(this.c));
        return contentValues;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.srn) {
            defpackage.srn srnVar = (defpackage.srn) obj;
            if (aooh.n(this.a, srnVar.a) && aooh.n(this.b, srnVar.b) && this.c == srnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "PhoneLookupHistoryEntry(normalizedNumber=" + this.a + ", phoneLookupInfo=" + this.b + ", lastModified=" + this.c + ')';
    }
}
