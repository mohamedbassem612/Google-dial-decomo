package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class htd extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.htr b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htd(defpackage.htr htrVar, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = htrVar;
        this.c = str;
        this.d = str2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        ssg ssgVarD;
        j$.util.Optional optionalEmpty;
        java.lang.String strSubstring;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.htr htrVar = this.b;
            this.a = 1;
            obj = htrVar.e.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        java.lang.String str = this.c;
        java.lang.String str2 = this.d;
        ssh sshVar = (ssh) obj;
        android.net.Uri uriBuild = null;
        if (android.text.TextUtils.isEmpty(str)) {
            ssh.a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupNumber", 158, "ContactInfoHelper.java").v("number is empty");
        } else {
            if (sshVar.c.f(str)) {
                ssh.a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupNumber", 165, "ContactInfoHelper.java").v("number is sip");
                ssgVarD = sshVar.a(sshVar.c(str));
                if (ssgVarD == null || ssgVarD == ssg.a) {
                    int iIndexOf = str.indexOf(64);
                    if (iIndexOf < 0) {
                        iIndexOf = str.indexOf("%40");
                    }
                    if (iIndexOf < 0) {
                        ssq.a.b().l("com/android/dialer/phonenumberutil/PhoneNumberHelper", "getUsernameFromUriNumber", 261, "PhoneNumberHelper.java").y("getUsernameFromUriNumber: no delimiter found in SIP address: %s", aais.aD(str));
                        strSubstring = str;
                    } else {
                        strSubstring = str.substring(0, iIndexOf);
                    }
                    if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(strSubstring)) {
                        ssgVarD = sshVar.d(strSubstring, str2);
                    }
                }
            } else {
                ssgVarD = sshVar.d(str, str2);
                if (ssgVarD == null || ssgVarD == ssg.a) {
                    aike aikeVarA = sshVar.b.a(str, str2);
                    aimw aimwVarL = ssh.a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "queryNumberVariations", 210, "ContactInfoHelper.java");
                    int i2 = aikeVarA.d;
                    aimwVarL.w("performing variation number lookup for %d variations", i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 < i2) {
                            ssg ssgVarD2 = sshVar.d((java.lang.String) aikeVarA.get(i3), str2);
                            if (ssgVarD2 != null && !ssgVarD2.equals(ssg.a)) {
                                optionalEmpty = j$.util.Optional.of(ssgVarD2);
                                break;
                            }
                            i3++;
                        } else {
                            optionalEmpty = j$.util.Optional.empty();
                            break;
                        }
                    }
                    if (optionalEmpty.isPresent()) {
                        ssgVarD = (ssg) optionalEmpty.orElseThrow();
                    }
                }
            }
            if (ssgVarD != null) {
                if (ssgVarD == ssg.a) {
                    ssgVarD = new ssg();
                    ssgVarD.g = str;
                    ssgVarD.h = sshVar.b(str, str2);
                    ssgVarD.i = android.telephony.PhoneNumberUtils.formatNumberToE164(str, str2);
                    java.lang.String str3 = ssgVarD.h;
                    try {
                        uriBuild = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("directory", "9223372036854775807").encodedFragment(new org.json.JSONObject().put("display_name", str3).put("display_name_source", 20).put("vnd.android.cursor.item/contact", new org.json.JSONObject().put("vnd.android.cursor.item/phone_v2", new org.json.JSONObject().put("data1", str3).put("data2", 0))).toString()).build();
                    } catch (org.json.JSONException e) {
                        a.bq(ssh.a.c(), "failed to create a temporary contact URI", "com/android/dialer/phonenumbercache/ContactInfoHelper", "createTemporaryContactUri", 's', "ContactInfoHelper.java", e, zct.b);
                    }
                    ssgVarD.b = uriBuild;
                }
                return ssgVarD;
            }
            ssh.a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupNumber", 191, "ContactInfoHelper.java").v("lookup failed");
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.htd(this.b, this.c, this.d, aolnVar);
    }
}
