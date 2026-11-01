package androidx.media3.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DrmInitData implements java.util.Comparator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(18);
    public final java.lang.String a;
    public final int b;
    private final androidx.media3.common.DrmInitData.SchemeData[] c;
    private int d;

    public DrmInitData(android.os.Parcel parcel) {
        this.a = parcel.readString();
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) parcel.createTypedArray(androidx.media3.common.DrmInitData.SchemeData.CREATOR);
        java.lang.String str = eum.a;
        this.c = schemeDataArr;
        this.b = schemeDataArr.length;
    }

    public final androidx.media3.common.DrmInitData.SchemeData a(int i) {
        return this.c[i];
    }

    public final androidx.media3.common.DrmInitData b(java.lang.String str) {
        return !j$.util.Objects.equals(this.a, str) ? new androidx.media3.common.DrmInitData(str, false, this.c) : this;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        androidx.media3.common.DrmInitData.SchemeData schemeData = (androidx.media3.common.DrmInitData.SchemeData) obj2;
        java.util.UUID uuid = defpackage.epx.a;
        java.util.UUID uuid2 = ((androidx.media3.common.DrmInitData.SchemeData) obj).a;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(schemeData.a) ? 1 : 0;
        }
        return uuid2.compareTo(schemeData.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) obj;
            if (j$.util.Objects.equals(this.a, drmInitData.a) && java.util.Arrays.equals(this.c, drmInitData.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.c);
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public DrmInitData(java.lang.String str, boolean z, androidx.media3.common.DrmInitData.SchemeData... schemeDataArr) {
        this.a = str;
        schemeDataArr = z ? (androidx.media3.common.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.c = schemeDataArr;
        this.b = schemeDataArr.length;
        java.util.Arrays.sort(schemeDataArr, this);
    }

    /* JADX INFO: compiled from: PG */
    public final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(19);
        public final java.util.UUID a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final byte[] d;
        private int e;

        public SchemeData(android.os.Parcel parcel) {
            this.a = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.b = parcel.readString();
            java.lang.String string = parcel.readString();
            java.lang.String str = eum.a;
            this.c = string;
            this.d = parcel.createByteArray();
        }

        public final boolean a(java.util.UUID uuid) {
            java.util.UUID uuid2 = defpackage.epx.a;
            java.util.UUID uuid3 = this.a;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.common.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj != this) {
                androidx.media3.common.DrmInitData.SchemeData schemeData = (androidx.media3.common.DrmInitData.SchemeData) obj;
                if (!j$.util.Objects.equals(this.b, schemeData.b) || !j$.util.Objects.equals(this.c, schemeData.c) || !j$.util.Objects.equals(this.a, schemeData.a) || !java.util.Arrays.equals(this.d, schemeData.d)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = this.e;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.a.hashCode() * 31;
            java.lang.String str = this.b;
            int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + java.util.Arrays.hashCode(this.d);
            this.e = iHashCode2;
            return iHashCode2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            java.util.UUID uuid = this.a;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeByteArray(this.d);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            ahvr.ci(uuid);
            this.a = uuid;
            this.b = str;
            ahvr.ci(str2);
            this.c = defpackage.eqz.d(str2);
            this.d = bArr;
        }
    }
}
