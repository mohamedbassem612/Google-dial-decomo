package com.google.android.libraries.surveys.internal.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Answer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(10);
    public amig a;
    public java.lang.String b;
    public amit c;
    public long d;
    public boolean e;
    public java.lang.String f;
    public int g;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Answer(android.os.Parcel parcel) {
        int i;
        byte[] bArrCreateByteArray;
        byte[] bArrCreateByteArray2 = parcel.createByteArray();
        if (afjy.b != null) {
            aehj aehjVar = afjy.c;
            if (afjy.b(ankz.c(afjy.b))) {
                this.a = bArrCreateByteArray2 != null ? (amig) afjz.c(amig.a, bArrCreateByteArray2) : amig.a;
            } else {
                this.a = afjz.c(amig.a, bArrCreateByteArray2);
            }
        } else {
            this.a = afjz.c(amig.a, bArrCreateByteArray2);
        }
        java.lang.String string = parcel.readString();
        switch (string.hashCode()) {
            case -1446966090:
                if (string.equals("NOT_SET")) {
                    i = 1;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
            case -1226895677:
                if (string.equals("INVITATION_ANSWERED")) {
                    i = 4;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
            case -904377066:
                if (string.equals("QUESTION_ANSWERED")) {
                    i = 5;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
            case -801661455:
                if (string.equals("SURVEY_CLOSED")) {
                    i = 6;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
            case -541898004:
                if (string.equals("SURVEY_ACCEPTED")) {
                    i = 3;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
            case 127344588:
                if (string.equals("SURVEY_SHOWN")) {
                    i = 2;
                    this.g = i;
                    this.b = parcel.readString();
                    bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray != null) {
                        this.c = afjz.c(amit.a, bArrCreateByteArray);
                    } else {
                        this.c = amit.a;
                    }
                    this.d = parcel.readLong();
                    this.e = parcel.readInt() > 0;
                    this.f = parcel.readString();
                    return;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str;
        parcel.writeByteArray(this.a.i());
        int i2 = this.g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "INVITATION_ANSWERED";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "QUESTION_ANSWERED";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 == 0) {
            throw null;
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c.i());
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }

    public Answer() {
        this.a = amig.a;
        this.g = 1;
        this.b = "";
        this.c = amit.a;
        this.d = 0L;
        this.e = false;
        this.f = "";
    }
}
