package com.google.android.gms.people.account.categories;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ClassifyAccountTypeResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(1);
    public final java.lang.String a;
    public final java.lang.String b;
    private final defpackage.aaqo c;
    private final defpackage.aaqp d;

    public ClassifyAccountTypeResult(java.lang.String str, java.lang.String str2, int i, int i2) {
        defpackage.aaqo aaqoVar;
        this.a = str;
        this.b = str2;
        defpackage.aaqp aaqpVar = null;
        switch (i) {
            case 0:
                aaqoVar = defpackage.aaqo.UNKNOWN;
                break;
            case 1:
                aaqoVar = defpackage.aaqo.NULL_ACCOUNT;
                break;
            case 2:
                aaqoVar = defpackage.aaqo.GOOGLE;
                break;
            case 3:
                aaqoVar = defpackage.aaqo.DEVICE;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aaqoVar = defpackage.aaqo.SIM;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aaqoVar = defpackage.aaqo.EXCHANGE;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aaqoVar = defpackage.aaqo.THIRD_PARTY_EDITABLE;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aaqoVar = defpackage.aaqo.THIRD_PARTY_READONLY;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aaqoVar = defpackage.aaqo.SIM_SDN;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aaqoVar = defpackage.aaqo.PRELOAD_SDN;
                break;
            default:
                aaqoVar = null;
                break;
        }
        this.c = aaqoVar == null ? defpackage.aaqo.UNKNOWN : aaqoVar;
        if (i2 == 0) {
            aaqpVar = defpackage.aaqp.UNKNOWN;
        } else if (i2 == 1) {
            aaqpVar = defpackage.aaqp.NONE;
        } else if (i2 == 2) {
            aaqpVar = defpackage.aaqp.EXACT;
        } else if (i2 == 3) {
            aaqpVar = defpackage.aaqp.SUBSTRING;
        } else if (i2 == 4) {
            aaqpVar = defpackage.aaqp.HEURISTIC;
        } else if (i2 == 5) {
            aaqpVar = defpackage.aaqp.SHEEPDOG_ELIGIBLE;
        }
        this.d = aaqpVar == null ? defpackage.aaqp.UNKNOWN : aaqpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.people.account.categories.ClassifyAccountTypeResult classifyAccountTypeResult = (com.google.android.gms.people.account.categories.ClassifyAccountTypeResult) obj;
            if (j$.util.Objects.equals(this.a, classifyAccountTypeResult.a) && j$.util.Objects.equals(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("accountType", this.a);
        ahymVarL.b("dataSet", this.b);
        ahymVarL.b("category", this.c);
        ahymVarL.b("matchTag", this.d);
        return ahymVarL.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.l(parcel, 3, this.c.k);
        aais.l(parcel, 4, this.d.g);
        aais.g(parcel, iF);
    }
}
