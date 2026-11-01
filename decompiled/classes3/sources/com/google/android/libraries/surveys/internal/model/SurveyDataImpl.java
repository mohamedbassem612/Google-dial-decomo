package com.google.android.libraries.surveys.internal.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SurveyDataImpl implements com.google.android.libraries.surveys.SurveyData {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(12);
    public final java.lang.String a;
    public final defpackage.amip b;
    public final amje c;
    public final java.lang.String d;
    public final long e;
    public final aify f;
    private final java.lang.String g;

    public SurveyDataImpl(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        aify aifyVar = aike.a;
        this.f = aifyVar;
        parcel.readStringList(aifyVar);
        defpackage.amip amipVar = defpackage.amip.a;
        akzq akzqVar = akzq.a;
        this.b = defpackage.akmr.k(parcel, amipVar, akzqVar);
        this.c = defpackage.akmr.k(parcel, amje.a, akzqVar);
    }

    @Override // com.google.android.libraries.surveys.SurveyData
    public final com.google.android.libraries.surveys.SurveyMetadata a() {
        return new com.google.android.libraries.surveys.SurveyMetadata(this.a, this.g, b(), true != afjz.l(this.b) ? 2 : 3);
    }

    public final java.lang.String b() {
        amje amjeVar = this.c;
        if (amjeVar != null) {
            return amjeVar.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeStringList(this.f);
        defpackage.akmr.s(parcel, this.b);
        defpackage.akmr.s(parcel, this.c);
    }

    public SurveyDataImpl(java.lang.String str, java.lang.String str2, long j, amje amjeVar, defpackage.amip amipVar, java.lang.String str3, aify aifyVar) {
        this.a = str;
        this.g = str2;
        this.e = j;
        this.d = str3;
        this.f = aifyVar;
        this.b = amipVar;
        this.c = amjeVar;
    }
}
