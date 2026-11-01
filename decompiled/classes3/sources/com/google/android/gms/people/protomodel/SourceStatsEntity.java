package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SourceStatsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.SourceStats {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(11);
    public final java.lang.String a;
    public final java.lang.Integer b;
    public final java.lang.Integer c;

    public SourceStatsEntity(java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final java.lang.Integer a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final java.lang.Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final java.lang.String c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.SourceStats)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.SourceStats sourceStats = (com.google.android.gms.people.protomodel.SourceStats) obj;
            if (!j$.util.Objects.equals(c(), sourceStats.c()) || !j$.util.Objects.equals(a(), sourceStats.a()) || !j$.util.Objects.equals(b(), sourceStats.b())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{c(), a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.w(parcel, 3, this.b);
        aais.w(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
