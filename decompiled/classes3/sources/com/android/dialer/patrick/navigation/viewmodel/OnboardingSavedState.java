package com.android.dialer.patrick.navigation.viewmodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class OnboardingSavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new gec(12);
    public final android.net.Uri a;
    public final defpackage.sjg b;
    public final defpackage.abxt c;
    public final defpackage.abxt d;
    public final defpackage.sjj e;
    public final defpackage.sjk f;
    public final java.lang.String g;
    public final java.lang.String h;

    public OnboardingSavedState(android.net.Uri uri, defpackage.sjg sjgVar, defpackage.abxt abxtVar, defpackage.abxt abxtVar2, defpackage.sjj sjjVar, defpackage.sjk sjkVar, java.lang.String str, java.lang.String str2) {
        aooh.f(sjgVar, "currentStep");
        aooh.f(abxtVar, "flowData");
        aooh.f(abxtVar2, "initialFlowData");
        aooh.f(sjjVar, "callingCardType");
        aooh.f(sjkVar, "entryPoint");
        aooh.f(str, "displayName");
        aooh.f(str2, "gaiaAccountName");
        this.a = uri;
        this.b = sjgVar;
        this.c = abxtVar;
        this.d = abxtVar2;
        this.e = sjjVar;
        this.f = sjkVar;
        this.g = str;
        this.h = str2;
    }

    public static /* synthetic */ com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState a(com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedState, android.net.Uri uri, defpackage.sjg sjgVar, defpackage.abxt abxtVar, defpackage.abxt abxtVar2, defpackage.sjj sjjVar, defpackage.sjk sjkVar, java.lang.String str, java.lang.String str2, int i) {
        if ((i & 1) != 0) {
            uri = onboardingSavedState.a;
        }
        if ((i & 2) != 0) {
            sjgVar = onboardingSavedState.b;
        }
        if ((i & 4) != 0) {
            abxtVar = onboardingSavedState.c;
        }
        if ((i & 8) != 0) {
            abxtVar2 = onboardingSavedState.d;
        }
        if ((i & 16) != 0) {
            sjjVar = onboardingSavedState.e;
        }
        if ((i & 32) != 0) {
            sjkVar = onboardingSavedState.f;
        }
        if ((i & 64) != 0) {
            str = onboardingSavedState.g;
        }
        if ((i & 128) != 0) {
            str2 = onboardingSavedState.h;
        }
        aooh.f(sjgVar, "currentStep");
        aooh.f(abxtVar, "flowData");
        aooh.f(abxtVar2, "initialFlowData");
        aooh.f(sjjVar, "callingCardType");
        aooh.f(sjkVar, "entryPoint");
        aooh.f(str, "displayName");
        aooh.f(str2, "gaiaAccountName");
        return new com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState(uri, sjgVar, abxtVar, abxtVar2, sjjVar, sjkVar, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) {
            com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedState = (com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) obj;
            if (aooh.n(this.a, onboardingSavedState.a) && this.b == onboardingSavedState.b && aooh.n(this.c, onboardingSavedState.c) && aooh.n(this.d, onboardingSavedState.d) && this.e == onboardingSavedState.e && this.f == onboardingSavedState.f && aooh.n(this.g, onboardingSavedState.g) && aooh.n(this.h, onboardingSavedState.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.a;
        return ((((((((((((((uri == null ? 0 : uri.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "OnboardingSavedState(cameraUri=" + this.a + ", currentStep=" + this.b + ", flowData=" + this.c + ", initialFlowData=" + this.d + ", callingCardType=" + this.e + ", entryPoint=" + this.f + ", displayName=" + this.g + ", gaiaAccountName=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
        snl.m(this.c, parcel);
        snl.m(this.d, parcel);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public OnboardingSavedState() {
        this(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnboardingSavedState(byte[] bArr) {
        defpackage.sjg sjgVar = defpackage.sjg.a;
        defpackage.abxt abxtVar = defpackage.abxt.a;
        aooh.e(abxtVar, "getDefaultInstance(...)");
        aooh.e(abxtVar, "getDefaultInstance(...)");
        this(null, sjgVar, abxtVar, abxtVar, defpackage.sjj.a, defpackage.sjk.a, "", "");
    }
}
