package com.android.dialer.interactions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PhoneNumberInteraction$PhoneItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new gec(10);
    public long a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public long e;
    public java.lang.String f;
    public java.lang.String g;

    public PhoneNumberInteraction$PhoneItem(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akfm */
    /* JADX INFO: Thrown type has an unknown type hierarchy: akfp */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, android.content.Context context) throws akfm {
        int iT;
        java.lang.String str = this.b;
        java.lang.String str2 = ((com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) obj).b;
        aimz aimzVar = defpackage.rho.a;
        if (android.text.TextUtils.equals(str, str2)) {
            return true;
        }
        if (str != null && str2 != null) {
            java.lang.String string = str.toString();
            java.lang.String string2 = str2.toString();
            if (string.contains("#") == string2.contains("#") && string.contains("*") == string2.contains("*")) {
                java.util.List listJ = ahzf.e(";").j(string);
                java.util.List listJ2 = ahzf.e(";").j(string2);
                if (listJ.size() == listJ2.size()) {
                    defpackage.akfx akfxVarAI = pez.bl(context).tb().aI();
                    for (int i = 0; i < listJ.size(); i++) {
                        java.lang.String strConvertKeypadLettersToDigits = android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits((java.lang.String) listJ.get(i));
                        java.lang.String str3 = (java.lang.String) listJ2.get(i);
                        if (!android.text.TextUtils.equals(strConvertKeypadLettersToDigits, str3)) {
                            try {
                                iT = akfxVarAI.u(akfxVarAI.i(strConvertKeypadLettersToDigits, akfg.eq), str3);
                            } catch (akfp e) {
                                if (e.a == defpackage.akfo.a) {
                                    try {
                                        iT = akfxVarAI.u(akfxVarAI.i(str3, akfg.eq), strConvertKeypadLettersToDigits);
                                    } catch (akfp e2) {
                                        if (e2.a == defpackage.akfo.a) {
                                            try {
                                                defpackage.akgu akguVar = defpackage.akgu.a;
                                                akzx akzxVarM = akguVar.m();
                                                akzx akzxVarM2 = akguVar.m();
                                                akfxVarAI.F(strConvertKeypadLettersToDigits, defpackage.akfr.b(), false, akzxVarM);
                                                akfxVarAI.F(str3, defpackage.akfr.b(), false, akzxVarM2);
                                                iT = akfxVarAI.t((defpackage.akgu) akzxVarM.p(), (defpackage.akgu) akzxVarM2.p());
                                            } catch (akfp unused) {
                                                iT = 1;
                                            }
                                        } else {
                                            iT = 1;
                                        }
                                    }
                                } else {
                                    iT = 1;
                                }
                            }
                            int i2 = iT - 1;
                            if (i2 != 0 && i2 != 1 && i2 != 2) {
                                if (i2 == 3) {
                                    try {
                                        try {
                                            if (akfxVarAI.i(strConvertKeypadLettersToDigits, null).c != 1 || str3.trim().charAt(0) == '1') {
                                            }
                                        } catch (akfp unused2) {
                                            continue;
                                        }
                                    } catch (akfp unused3) {
                                        akfxVarAI.i(str3, null);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public PhoneNumberInteraction$PhoneItem() {
    }
}
