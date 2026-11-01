package com.google.android.gms.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final java.lang.Integer e;
    public final android.os.Bundle f;
    private final android.app.PendingIntent g;
    public static final com.google.android.gms.common.ConnectionResult a = new com.google.android.gms.common.ConnectionResult(1, 0, null, null, null, null);
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(7);

    public ConnectionResult(int i, int i2, android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.Integer num, android.os.Bundle bundle) {
        this.b = i;
        this.c = i2;
        this.g = pendingIntent;
        this.d = str;
        this.e = num;
        this.f = bundle;
    }

    public static java.lang.String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    case 26:
                        return "FEATURE_MISSING_OR_NEEDS_UPDATE";
                    default:
                        return defpackage.a.bw((byte) 41, i, "UNKNOWN_ERROR_CODE(");
                }
        }
    }

    public final android.app.PendingIntent a() {
        android.os.Bundle bundle = this.f;
        android.app.PendingIntent pendingIntent = bundle != null ? (android.app.PendingIntent) defpackage.dpe.t(bundle, "pendingIntent", android.app.PendingIntent.class) : null;
        return pendingIntent == null ? this.g : pendingIntent;
    }

    public final boolean c() {
        return (this.c == 0 || a() == null) ? false : true;
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.ConnectionResult) {
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) obj;
            if (this.c == connectionResult.c && j$.util.Objects.equals(this.g, connectionResult.g) && j$.util.Objects.equals(this.d, connectionResult.d) && j$.util.Objects.equals(this.e, connectionResult.e) && defpackage.aehj.bV(this.f, connectionResult.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), this.g, this.d, this.e, java.lang.Boolean.valueOf(this.f != null)});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aehj.bX("statusCode", b(this.c), arrayList);
        defpackage.aehj.bX("resolution", this.g, arrayList);
        defpackage.aehj.bX("message", this.d, arrayList);
        defpackage.aehj.bX("clientMethodKey", this.e, arrayList);
        defpackage.aehj.bX("errorResolutionInfo", this.f, arrayList);
        return defpackage.aehj.bW(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, this.b);
        defpackage.aais.l(parcel, 2, this.c);
        defpackage.aais.z(parcel, 3, a(), i);
        defpackage.aais.A(parcel, 4, this.d);
        defpackage.aais.w(parcel, 5, this.e);
        defpackage.aais.p(parcel, 6, this.f);
        defpackage.aais.g(parcel, iF);
    }
}
