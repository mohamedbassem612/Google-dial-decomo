package com.google.android.gms.usagereporting;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConsentInformation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final java.util.List c;

    /* JADX INFO: compiled from: PG */
    public class AccountConsentInformation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(2);
        public final java.lang.String a;
        public final byte[] b;
        public final java.util.List c;

        public AccountConsentInformation(java.lang.String str, byte[] bArr, java.util.List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new java.util.ArrayList(0) : new java.util.ArrayList(list);
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation) {
                com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation accountConsentInformation = (com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation) obj;
                if (j$.util.Objects.equals(this.a, accountConsentInformation.a) && java.util.Arrays.equals(this.b, accountConsentInformation.b) && j$.util.Objects.equals(this.c, accountConsentInformation.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), this.c});
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            java.lang.String str = this.a;
            int iF = aais.f(parcel, 20293);
            aais.A(parcel, 1, str);
            aais.q(parcel, 2, this.b);
            java.util.ArrayList arrayList = new java.util.ArrayList(this.c);
            int iF2 = aais.f(parcel, 3);
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((java.lang.Integer) arrayList.get(i2)).intValue());
            }
            aais.g(parcel, iF2);
            aais.g(parcel, iF);
        }
    }

    static {
        new com.google.android.gms.usagereporting.ConsentInformation(null, false, false);
        CREATOR = new defpackage.aatx(3);
    }

    public ConsentInformation(java.util.List list, boolean z, boolean z2) {
        this.c = list == null ? new java.util.ArrayList(0) : new java.util.ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.usagereporting.ConsentInformation) {
            com.google.android.gms.usagereporting.ConsentInformation consentInformation = (com.google.android.gms.usagereporting.ConsentInformation) obj;
            if (j$.util.Objects.equals(this.c, consentInformation.c) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(consentInformation.a))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.c, java.lang.Boolean.valueOf(this.a)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, new java.util.ArrayList(this.c));
        aais.h(parcel, 2, this.a);
        aais.h(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
