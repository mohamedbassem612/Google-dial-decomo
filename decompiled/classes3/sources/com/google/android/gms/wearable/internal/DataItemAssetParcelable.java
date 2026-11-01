package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DataItemAssetParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, defpackage.aavz {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(13);
    public final java.lang.String a;
    public final java.lang.String b;

    public DataItemAssetParcelable(defpackage.aavz aavzVar) {
        java.lang.String strJ = aavzVar.j();
        aais.as(strJ);
        this.a = strJ;
        java.lang.String strI = aavzVar.i();
        aais.as(strI);
        this.b = strI;
    }

    @Override // defpackage.aavz
    public final java.lang.String i() {
        return this.b;
    }

    @Override // defpackage.aavz
    public final java.lang.String j() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataItemAssetParcelable[@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        java.lang.String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(',');
            sb.append(str);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.A(parcel, 3, this.b);
        aais.g(parcel, iF);
    }

    public DataItemAssetParcelable(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }
}
