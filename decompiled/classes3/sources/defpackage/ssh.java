package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssh {
    public static final aimz a = aimz.i("com/android/dialer/phonenumbercache/ContactInfoHelper");
    public final ssr b;
    public final ssq c;
    private final android.content.Context d;
    private final java.lang.String e;
    private final ojo f;
    private final defpackage.ryu g;

    public ssh(java.lang.String str, android.content.Context context, defpackage.ryu ryuVar, ssr ssrVar, ssq ssqVar, ojo ojoVar) {
        this.e = str;
        this.d = context;
        this.b = ssrVar;
        this.c = ssqVar;
        this.g = ryuVar;
        this.f = ojoVar;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:0: B:26:0x0092->B:87:?, LOOP_END, SYNTHETIC] */
    public final defpackage.ssg a(android.net.Uri uri) {
        defpackage.ssg ssgVar;
        android.database.Cursor cursorB;
        if (uri == null) {
            a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupContactFromUri", 248, "ContactInfoHelper.java").v("uri is null");
            return null;
        }
        if (!zqz.a(this.d, "android.permission.READ_CONTACTS")) {
            a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupContactFromUri", 252, "ContactInfoHelper.java").v("no contact permission, return empty");
            return defpackage.ssg.a;
        }
        ojo ojoVar = this.f;
        android.database.Cursor cursorB2 = ojoVar.b(uri, defpackage.ssk.b, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
        try {
            if (cursorB2 == null) {
                a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "lookupContactFromUri", 264, "ContactInfoHelper.java").v("phoneLookupCursor is null");
                return null;
            }
            if (cursorB2.moveToFirst() && cursorB2.moveToFirst()) {
                ahvr.bM(cursorB2.getColumnCount() > 4);
                java.lang.String lastPathSegment = uri.getLastPathSegment();
                if (!android.text.TextUtils.isEmpty(lastPathSegment)) {
                    boolean zH = ssq.h(lastPathSegment);
                    while (true) {
                        java.lang.String string = cursorB2.getString(4);
                        boolean zH2 = ssq.h(string);
                        if (zH || zH2) {
                            if (string == null) {
                                if (lastPathSegment == null) {
                                }
                                if (!cursorB2.moveToNext()) {
                                }
                            } else {
                                if (lastPathSegment != null && android.telephony.PhoneNumberUtils.stripSeparators(android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(string)).equals(android.telephony.PhoneNumberUtils.stripSeparators(android.telephony.PhoneNumberUtils.convertKeypadLettersToDigits(lastPathSegment)))) {
                                }
                                if (!cursorB2.moveToNext()) {
                                }
                            }
                            ssgVar = ssgVar;
                            cursorB2.close();
                            return ssgVar;
                        }
                        java.lang.String string2 = cursorB2.getString(7);
                        defpackage.ssg ssgVar2 = new defpackage.ssg();
                        ssgVar2.b = android.provider.ContactsContract.Contacts.getLookupUri(cursorB2.getLong(0), string2);
                        ssgVar2.c = cursorB2.getString(1);
                        ssgVar2.e = cursorB2.getInt(2);
                        ssgVar2.f = cursorB2.getString(3);
                        ssgVar2.g = cursorB2.getString(4);
                        ssgVar2.i = cursorB2.getString(5);
                        ssgVar2.j = cursorB2.getLong(6);
                        java.lang.String string3 = cursorB2.getString(8);
                        ssgVar2.k = string3 == null ? null : android.net.Uri.parse(string3);
                        ssgVar2.h = null;
                        long j = cursorB2.getLong(0);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                        lValueOf.getClass();
                        long j2 = 0;
                        if (j != 0) {
                            lValueOf.getClass();
                            if (android.provider.ContactsContract.Contacts.isEnterpriseContactId(j)) {
                                j2 = 1;
                            }
                        }
                        ssgVar2.n = j2;
                        if (ssgVar2.g != null && (cursorB = ojoVar.b(android.net.Uri.withAppendedPath(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, android.net.Uri.encode(ssgVar2.g)), defpackage.ssk.a, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null)) != null) {
                            try {
                                if (cursorB.moveToFirst()) {
                                    ssgVar2.d = cursorB.getString(0);
                                    ssgVar2.o = cursorB.getInt(1);
                                }
                                cursorB.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    cursorB.close();
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        ssgVar = ssgVar2;
                        cursorB2.close();
                        return ssgVar;
                    }
                }
            }
            defpackage.ssg ssgVar3 = defpackage.ssg.a;
            ssgVar = ssgVar3;
            cursorB2.close();
            return ssgVar;
        } catch (java.lang.Throwable th3) {
            if (cursorB2 == null) {
                throw th3;
            }
            try {
                cursorB2.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        ssq ssqVar = this.c;
        if (ssqVar.f(str)) {
            return str;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = this.e;
        }
        return ssqVar.g(str, str2);
    }

    public final android.net.Uri c(java.lang.String str) {
        return android.provider.ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI.buildUpon().appendPath(str).appendQueryParameter("sip", java.lang.String.valueOf(this.c.f(str))).build();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0137 A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x015d A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0163 A[Catch: all -> 0x0288, TRY_LEAVE, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0169 A[Catch: all -> 0x0288, TRY_ENTER, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x017c A[Catch: all -> 0x0288, TRY_LEAVE, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5 A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9 A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fe A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x020f A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x021e A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0225 A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:19:0x0090, B:21:0x0096, B:22:0x009f, B:24:0x00ab, B:25:0x00ad, B:27:0x00bb, B:30:0x00c4, B:32:0x00cb, B:34:0x00d1, B:36:0x00eb, B:38:0x0103, B:40:0x0113, B:42:0x0120, B:43:0x0137, B:45:0x015d, B:47:0x0163, B:50:0x0169, B:51:0x017c, B:54:0x0182, B:56:0x0186, B:58:0x018a, B:60:0x018e, B:61:0x01a5, B:63:0x01b9, B:64:0x01be, B:66:0x01c8, B:68:0x01fe, B:75:0x022b, B:79:0x023c, B:70:0x020f, B:71:0x021e, B:73:0x0225), top: B:91:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x022a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0239  */
    /* JADX WARN: Code duplicated, block: B:78:0x023b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ssg] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v1 */
    public final defpackage.ssg d(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursorB;
        rmt rmtVarB;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        int i;
        int i2;
        java.lang.String string4;
        android.net.Uri uriBuild;
        boolean z;
        defpackage.ryu ryuVar;
        android.net.Uri.Builder builderEncodedFragment;
        defpackage.ryu ryuVar2 = null;
        ryuVar2 = null;
        android.net.Uri uriBuild2 = null;
        ryuVar2 = null;
        if (android.text.TextUtils.isEmpty(str)) {
            a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "queryContactInfoForPhoneNumber", 344, "ContactInfoHelper.java").v("number is empty");
            return null;
        }
        ?? A = a(c(str));
        if (A != 0) {
            if (A != defpackage.ssg.a) {
                A.h = b(str, str2);
            }
            return (defpackage.ssg) A;
        }
        a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "queryContactInfoForPhoneNumber", 350, "ContactInfoHelper.java").v("info looked up is null");
        defpackage.ryu ryuVar3 = this.g;
        if (defpackage.ryu.b == null) {
            defpackage.ryu.b = new defpackage.ahso(ryuVar3.a);
        }
        android.content.Context context = this.d;
        ojo ojoVar = this.f;
        defpackage.ahso ahsoVar = defpackage.ryu.b;
        if (!android.text.TextUtils.isEmpty(str) && (cursorB = ojoVar.b(defpackage.ssl.b.buildUpon().appendPath(str).build(), (java.lang.String[]) defpackage.ssf.a.toArray(new java.lang.String[0]), (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null)) != null) {
            try {
                if (cursorB.moveToFirst()) {
                    rmt rmtVarB2 = rmt.b(cursorB.getInt(8));
                    if (rmtVarB2 == null) {
                        rmtVarB2 = rmt.a;
                    }
                    if (((java.lang.Boolean) ahsoVar.a.a()).booleanValue() && rmtVarB2 == rmt.f) {
                        cursorB.close();
                    } else if (com.android.dialer.phonenumbercache.PhoneNumberCacheProvider.a(rmtVarB2)) {
                        if (abyl.i(context) && context.getSharedPreferences(java.lang.String.valueOf(context.getPackageName()).concat("_preferences"), 0).getBoolean("google_caller_id", true)) {
                            tcg tcgVar = (tcg) agab.aH(context, tcg.class);
                            if ((((java.lang.Boolean) tcgVar.hD().a()).booleanValue() || ((java.lang.Boolean) tcgVar.hE().a()).booleanValue()) && android.accounts.AccountManager.get(context).getAccountsByType("com.google").length != 0) {
                                defpackage.ssg ssgVar = new defpackage.ssg();
                                rmtVarB = rmt.b(cursorB.getInt(8));
                                string = cursorB.getString(9);
                                string2 = cursorB.getString(7);
                                string3 = cursorB.getString(10);
                                if (android.text.TextUtils.isEmpty(string3)) {
                                    uriBuild2 = null;
                                } else if (!android.text.TextUtils.isEmpty(string)) {
                                    if (rmtVarB == rmt.b) {
                                        uriBuild2 = android.net.Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, string3).buildUpon().appendQueryParameter("directory", string).build();
                                    } else if (rmtVarB != rmt.c) {
                                        builderEncodedFragment = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").encodedFragment(string3);
                                        if (!android.text.TextUtils.isEmpty(string2)) {
                                            builderEncodedFragment.appendQueryParameter("displayName", string2);
                                        }
                                        uriBuild2 = builderEncodedFragment.appendQueryParameter("directory", string).build();
                                    } else {
                                        builderEncodedFragment = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").encodedFragment(string3);
                                        if (!android.text.TextUtils.isEmpty(string2)) {
                                            builderEncodedFragment.appendQueryParameter("displayName", string2);
                                        }
                                        uriBuild2 = builderEncodedFragment.appendQueryParameter("directory", string).build();
                                    }
                                }
                                ssgVar.b = uriBuild2;
                                cursorB.getString(10);
                                ssgVar.c = cursorB.getString(0);
                                ssgVar.e = cursorB.getInt(5);
                                ssgVar.f = cursorB.getString(6);
                                ssgVar.g = cursorB.getString(4);
                                ssgVar.i = str;
                                ssgVar.h = null;
                                ssgVar.j = 0L;
                                i = cursorB.getInt(1);
                                i2 = cursorB.getInt(2);
                                if (i != 0) {
                                    uriBuild = defpackage.ssl.c.buildUpon().appendPath(str).build();
                                } else if (i2 != 0) {
                                    uriBuild = defpackage.ssl.d.buildUpon().appendPath(str).build();
                                } else {
                                    string4 = cursorB.getString(3);
                                    if (string4 != null) {
                                        uriBuild = android.net.Uri.parse(string4);
                                    } else {
                                        uriBuild = null;
                                    }
                                }
                                ssgVar.k = uriBuild;
                                if (cursorB.getLong(11) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ssgVar.l = z;
                                ssgVar.m = cursorB.getString(12);
                                ssgVar.n = cursorB.getLong(13);
                                ryuVar = new defpackage.ryu(ssgVar, null);
                                cursorB.getString(7);
                                cursorB.getLong(9);
                            }
                        }
                        mfk mfkVarA = mfk.a(context);
                        mfkVarA.d(rmt.d);
                        mfkVarA.d(rmt.e);
                        ryuVar = new defpackage.ryu(defpackage.ssg.a, null);
                    } else {
                        defpackage.ssg ssgVar2 = new defpackage.ssg();
                        rmtVarB = rmt.b(cursorB.getInt(8));
                        string = cursorB.getString(9);
                        string2 = cursorB.getString(7);
                        string3 = cursorB.getString(10);
                        if (android.text.TextUtils.isEmpty(string3)) {
                            uriBuild2 = null;
                        } else if (!android.text.TextUtils.isEmpty(string)) {
                            if (rmtVarB == rmt.b) {
                                uriBuild2 = android.net.Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, string3).buildUpon().appendQueryParameter("directory", string).build();
                            } else if (rmtVarB != rmt.c || rmtVarB == rmt.d || rmtVarB == rmt.e) {
                                builderEncodedFragment = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").encodedFragment(string3);
                                if (!android.text.TextUtils.isEmpty(string2)) {
                                    builderEncodedFragment.appendQueryParameter("displayName", string2);
                                }
                                uriBuild2 = builderEncodedFragment.appendQueryParameter("directory", string).build();
                            } else if (rmtVarB == rmt.f) {
                                uriBuild2 = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("directory", "9223372036854775807").encodedFragment(string3).build();
                            } else {
                                uriBuild2 = null;
                            }
                        }
                        ssgVar2.b = uriBuild2;
                        cursorB.getString(10);
                        ssgVar2.c = cursorB.getString(0);
                        ssgVar2.e = cursorB.getInt(5);
                        ssgVar2.f = cursorB.getString(6);
                        ssgVar2.g = cursorB.getString(4);
                        ssgVar2.i = str;
                        ssgVar2.h = null;
                        ssgVar2.j = 0L;
                        i = cursorB.getInt(1);
                        i2 = cursorB.getInt(2);
                        if (i != 0) {
                            uriBuild = defpackage.ssl.c.buildUpon().appendPath(str).build();
                        } else if (i2 != 0) {
                            uriBuild = defpackage.ssl.d.buildUpon().appendPath(str).build();
                        } else {
                            string4 = cursorB.getString(3);
                            if (string4 != null) {
                                uriBuild = android.net.Uri.parse(string4);
                            } else {
                                uriBuild = null;
                            }
                        }
                        ssgVar2.k = uriBuild;
                        if (cursorB.getLong(11) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ssgVar2.l = z;
                        ssgVar2.m = cursorB.getString(12);
                        ssgVar2.n = cursorB.getLong(13);
                        ryuVar = new defpackage.ryu(ssgVar2, null);
                        cursorB.getString(7);
                        cursorB.getLong(9);
                    }
                } else {
                    ryuVar = new defpackage.ryu(defpackage.ssg.a, null);
                }
                cursorB.close();
                ryuVar2 = ryuVar;
            } catch (java.lang.Throwable th) {
                cursorB.close();
                throw th;
            }
        }
        if (ryuVar2 != null) {
            java.lang.Object obj = ryuVar2.a;
            if (((defpackage.ssg) obj).l) {
                a.b().l("com/android/dialer/phonenumbercache/ContactInfoHelper", "queryContactInfoForPhoneNumber", 370, "ContactInfoHelper.java").v("info is bad data");
                return A;
            }
            A = obj;
        }
        return (defpackage.ssg) A;
    }
}
