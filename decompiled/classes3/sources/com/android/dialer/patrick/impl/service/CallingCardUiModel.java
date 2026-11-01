package com.android.dialer.patrick.impl.service;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardUiModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new gec(11);
    public final defpackage.abxt a;
    public final java.lang.String b;
    public final java.lang.String c;

    public CallingCardUiModel(defpackage.abxt abxtVar, java.lang.String str, java.lang.String str2) {
        this.a = abxtVar;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.dialer.patrick.impl.service.CallingCardUiModel) {
            com.android.dialer.patrick.impl.service.CallingCardUiModel callingCardUiModel = (com.android.dialer.patrick.impl.service.CallingCardUiModel) obj;
            if (aooh.n(this.a, callingCardUiModel.a) && aooh.n(this.b, callingCardUiModel.b) && aooh.n(this.c, callingCardUiModel.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.abxt abxtVar = this.a;
        int iHashCode = abxtVar == null ? 0 : abxtVar.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 31;
        java.lang.String str2 = this.c;
        return ((i + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallingCardUiModel(callingCardData=" + this.a + ", gaiaAccountName=" + this.b + ", contactName=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        aooh.f(parcel, "parcel");
        defpackage.abxt abxtVar = this.a;
        parcel.writeByteArray(abxtVar != null ? abxtVar.i() : null);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public CallingCardUiModel() {
        this(null, null, null);
    }
}
