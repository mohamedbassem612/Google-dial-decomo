package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advu {
    public final java.lang.String a;
    public final byte[] b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    private final java.lang.String g;
    private final java.lang.Integer h;
    private final int i;
    private final int j;

    public advu(java.lang.String str, int i, int i2, int i3, java.lang.Integer num, java.lang.String str2, byte[] bArr, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.g = str;
        this.f = i;
        this.i = i2;
        this.j = i3;
        this.h = num;
        this.a = str2;
        this.b = bArr;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static defpackage.advu a(android.content.Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        java.lang.String stringExtra = intent.getStringExtra("casp");
        java.lang.String stringExtra2 = intent.getStringExtra("chm");
        int iD = d(intent.getStringExtra("google.original_priority"));
        int iD2 = d(intent.getStringExtra("google.delivered_priority"));
        int iC = c(intent.getStringExtra("message_type"));
        java.lang.String stringExtra3 = intent.getStringExtra("ki");
        java.lang.String stringExtra4 = intent.getStringExtra("cid");
        java.lang.Integer numValueOf = !intent.hasExtra("google.ttl") ? null : java.lang.Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        if (numValueOf == null) {
            numValueOf = null;
        }
        java.lang.String stringExtra5 = intent.getStringExtra("google.message_id");
        return new defpackage.advu(true == android.text.TextUtils.isEmpty(stringExtra5) ? null : stringExtra5, iC, iD, iD2, numValueOf, stringExtra, byteArrayExtra, stringExtra2, stringExtra3, stringExtra4);
    }

    public static int c(java.lang.String str) {
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -2062414158:
                return str.equals("deleted_messages") ? 3 : 1;
            case 102161:
                return str.equals("gcm") ? 2 : 1;
            case 814694033:
                return str.equals("send_error") ? 5 : 1;
            case 814800675:
                return str.equals("send_event") ? 4 : 1;
            default:
                return 1;
        }
    }

    private static int d(java.lang.String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1039745817) {
            return (iHashCode == 3202466 && str.equals("high")) ? 3 : 1;
        }
        return str.equals("normal") ? 2 : 1;
    }

    private static int e(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 == 2 ? 3 : 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    public final defpackage.akqc b() {
        akzx akzxVarM = defpackage.akqc.a.m();
        akzxVarM.u();
        defpackage.akqc akqcVar = (defpackage.akqc) akzxVarM.b;
        akqcVar.e = e(this.i) - 1;
        int i = 4;
        akqcVar.b |= 4;
        akzxVarM.u();
        defpackage.akqc akqcVar2 = (defpackage.akqc) akzxVarM.b;
        akqcVar2.f = e(this.j) - 1;
        akqcVar2.b |= 8;
        int i2 = this.f;
        if (i2 == 0) {
            i = 1;
        } else {
            int i3 = i2 - 1;
            if (i3 == 1) {
                i = 2;
            } else if (i3 == 2) {
                i = 3;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    i = 1;
                } else {
                    i = 5;
                }
            }
        }
        akzxVarM.u();
        defpackage.akqc akqcVar3 = (defpackage.akqc) akzxVarM.b;
        akqcVar3.d = i - 1;
        akqcVar3.b |= 2;
        java.lang.String str = this.g;
        if (!android.text.TextUtils.isEmpty(str)) {
            akzxVarM.u();
            defpackage.akqc akqcVar4 = (defpackage.akqc) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akqcVar4.b |= 1;
            akqcVar4.c = str;
        }
        return (defpackage.akqc) akzxVarM.p();
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.advu) {
            defpackage.advu advuVar = (defpackage.advu) obj;
            java.lang.String str3 = this.g;
            if (str3 != null ? str3.equals(advuVar.g) : advuVar.g == null) {
                int i = this.f;
                if (i != 0 ? i == advuVar.f : advuVar.f == 0) {
                    int i2 = this.i;
                    if (i2 != 0 ? i2 == advuVar.i : advuVar.i == 0) {
                        int i3 = this.j;
                        if (i3 != 0 ? i3 == advuVar.j : advuVar.j == 0) {
                            java.lang.Integer num = this.h;
                            if (num != null ? num.equals(advuVar.h) : advuVar.h == null) {
                                java.lang.String str4 = this.a;
                                if (str4 != null ? str4.equals(advuVar.a) : advuVar.a == null) {
                                    boolean z = advuVar instanceof defpackage.advu;
                                    if (java.util.Arrays.equals(this.b, advuVar.b) && ((str = this.c) != null ? str.equals(advuVar.c) : advuVar.c == null) && ((str2 = this.d) != null ? str2.equals(advuVar.d) : advuVar.d == null)) {
                                        java.lang.String str5 = this.e;
                                        if (str5 == null) {
                                            if (advuVar.e == null) {
                                                return true;
                                            }
                                        } else if (str5.equals(advuVar.e)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.g;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode ^ 1000003;
        int i3 = this.i;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = ((((i2 * 1000003) ^ i) * 1000003) ^ i3) * 1000003;
        int i5 = this.j;
        if (i5 == 0) {
            i5 = 0;
        }
        int i6 = (i4 ^ i5) * 1000003;
        java.lang.Integer num = this.h;
        int iHashCode2 = (i6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.String str2 = this.a;
        int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ java.util.Arrays.hashCode(this.b)) * 1000003;
        java.lang.String str3 = this.c;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.d;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        java.lang.String str5 = this.e;
        return iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        if (i == 1) {
            str = "MESSAGE_TYPE_UNSPECIFIED";
        } else if (i == 2) {
            str = "MESSAGE";
        } else if (i == 3) {
            str = "DELETED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "SEND_ERROR";
        } else {
            str = "SEND_EVENT";
        }
        java.lang.String str2 = this.g;
        int i2 = this.i;
        int i3 = this.j;
        java.lang.Integer num = this.h;
        java.lang.String str3 = this.a;
        byte[] bArr = this.b;
        java.lang.String str4 = this.c;
        java.lang.String str5 = this.d;
        java.lang.String str6 = this.e;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + aesg.w(i2) + ", priorityDelivered=" + aesg.w(i3) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + java.util.Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + ", clientId=" + str6 + '}';
    }

    public advu() {
        throw null;
    }
}
