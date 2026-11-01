package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ajsz {
    private static java.lang.Thread a;
    public static defpackage.ajsz h;
    public static volatile defpackage.ajsz i;

    public ajsz() {
    }

    static java.lang.String A(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajva */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c A[Catch: IOException -> 0x0228, RuntimeException -> 0x0260, TryCatch #1 {IOException -> 0x0228, blocks: (B:109:0x01f3, B:111:0x020c, B:112:0x0210, B:113:0x0227), top: B:123:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0210 A[Catch: IOException -> 0x0228, RuntimeException -> 0x0260, TryCatch #1 {IOException -> 0x0228, blocks: (B:109:0x01f3, B:111:0x020c, B:112:0x0210, B:113:0x0227), top: B:123:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0244 A[Catch: RuntimeException -> 0x0260, TryCatch #6 {RuntimeException -> 0x0260, blocks: (B:108:0x01c1, B:109:0x01f3, B:111:0x020c, B:112:0x0210, B:113:0x0227, B:114:0x0228, B:116:0x0244, B:117:0x0258, B:118:0x025f), top: B:130:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0258 A[Catch: RuntimeException -> 0x0260, TryCatch #6 {RuntimeException -> 0x0260, blocks: (B:108:0x01c1, B:109:0x01f3, B:111:0x020c, B:112:0x0210, B:113:0x0227, B:114:0x0228, B:116:0x0244, B:117:0x0258, B:118:0x025f), top: B:130:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[PHI: r4
      0x00d8: PHI (r4v22 java.lang.String) = (r4v21 java.lang.String), (r4v47 java.lang.String) binds: [B:43:0x00c2, B:46:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196  */
    /* JADX WARN: Type inference failed for: r2v11, types: [ajvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    public static void B(android.content.Intent intent) throws ajva {
        int iIntValue;
        int i2;
        java.lang.String string;
        ajyf ajyfVar;
        java.lang.String string2;
        char c;
        int i3;
        int i4;
        java.lang.String strZ;
        java.lang.String strA;
        java.lang.String string3;
        java.lang.String string4;
        long j;
        java.lang.String str;
        java.lang.String str2;
        long j2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        zzy zzyVar;
        ajvj ajvjVar;
        ajvc ajvcVar;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String[] strArrSplit;
        java.lang.String str5;
        if (E(intent)) {
            C("_nr", intent.getExtras());
        }
        if (intent == null || c(intent) || !D()) {
            return;
        }
        ajye ajyeVar = ajye.b;
        defpackage.zia ziaVar = (defpackage.zia) com.google.firebase.messaging.FirebaseMessaging.a.a();
        if (ziaVar == null) {
            android.util.Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = android.os.Bundle.EMPTY;
        }
        java.lang.Object obj3 = extras.get("google.ttl");
        try {
            try {
                if (!(obj3 instanceof java.lang.Integer)) {
                    if (obj3 instanceof java.lang.String) {
                        try {
                            iIntValue = java.lang.Integer.parseInt((java.lang.String) obj3);
                        } catch (java.lang.NumberFormatException unused) {
                            android.util.Log.w("FirebaseMessaging", "Invalid TTL: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj3))));
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    string = extras.getString("google.to");
                    if (android.text.TextUtils.isEmpty(string)) {
                        try {
                            defpackage.ajtc ajtcVarB = defpackage.ajtc.b();
                            java.lang.Object obj4 = defpackage.ajwh.a;
                            string = (java.lang.String) defpackage.aazc.t(((defpackage.ajwh) ajtcVarB.d(defpackage.ajwi.class)).a());
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                            throw new java.lang.RuntimeException(e);
                        }
                    }
                    java.lang.String str6 = string;
                    java.lang.String packageName = defpackage.ajtc.b().a().getPackageName();
                    ajyg ajygVar = ajyg.b;
                    if (extras == null && agmc.V(extras)) {
                        ajyfVar = ajyf.d;
                    } else {
                        ajyfVar = ajyf.b;
                    }
                    ajyf ajyfVar2 = ajyfVar;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            c = 1;
                        } else if ("normal".equals(string2)) {
                            c = 2;
                        } else {
                            c = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        c = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            c = 1;
                        } else if ("normal".equals(string2)) {
                            c = 2;
                        } else {
                            c = 0;
                        }
                    }
                    if (c == 2) {
                        if (c == 1) {
                            i4 = 10;
                        } else {
                            i3 = 0;
                        }
                        strZ = z(extras);
                        if (strZ == null) {
                            strZ = "";
                        }
                        strA = A(extras);
                        if (strA == null) {
                            strA = "";
                        }
                        string3 = extras.getString("collapse_key");
                        if (string3 == null) {
                            string3 = "";
                        }
                        string4 = extras.getString("google.c.a.m_l");
                        if (string4 == null) {
                            string4 = "";
                        }
                        java.lang.String string5 = extras.getString("google.c.a.c_l");
                        java.lang.String str7 = string5 != null ? string5 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                j = java.lang.Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (java.lang.NumberFormatException e2) {
                                android.util.Log.w("FirebaseMessaging", "error parsing project number", e2);
                                defpackage.ajtc ajtcVarB2 = defpackage.ajtc.b();
                                str3 = ajtcVarB2.c().c;
                                if (str3 != null) {
                                    try {
                                        j = java.lang.Long.parseLong(str3);
                                    } catch (java.lang.NumberFormatException e3) {
                                        android.util.Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                        str4 = ajtcVarB2.c().b;
                                        if (!str4.startsWith("1:")) {
                                            str = strZ;
                                            strArrSplit = str4.split(":");
                                            str2 = string4;
                                            if (strArrSplit.length >= 2) {
                                                str5 = strArrSplit[1];
                                                if (str5.isEmpty()) {
                                                    try {
                                                        j2 = java.lang.Long.parseLong(str5);
                                                    } catch (java.lang.NumberFormatException e4) {
                                                        android.util.Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                        j2 = 0;
                                                    }
                                                }
                                            }
                                            ajyh ajyhVar = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                                            zhz zhzVar = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                            zoe zoeVarA = ziaVar.a(new zhx());
                                            zhy zhyVar = new zhy(new ajyi(ajyhVar), zhzVar);
                                            obj = zoeVarA.a;
                                            obj2 = zhyVar.a;
                                            ulw ulwVar = yju.a;
                                            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                            ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar.b, (java.util.Map) ulwVar.c, (ajvc) ulwVar.a);
                                            ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                                            if (ajvcVar != null) {
                                                throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                                            }
                                            ajvcVar.a(obj2, ajvjVar);
                                            defpackage.akzc akzcVarU = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                                            defpackage.aais.as(akzcVarU);
                                            zzyVar = new zzy((defpackage.zyx) obj, akzcVarU);
                                            zzyVar.o = defpackage.a.aS(0);
                                            if (!zzyVar.b) {
                                                throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                                            }
                                            zzyVar.b = true;
                                            zzyVar.a.f.b(zzyVar).m(new zib());
                                            return;
                                        }
                                        try {
                                            j = java.lang.Long.parseLong(str4);
                                        } catch (java.lang.NumberFormatException e5) {
                                            android.util.Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                            str = strZ;
                                            str2 = string4;
                                            j2 = 0;
                                        }
                                        j2 = 0;
                                        ajyh ajyhVar2 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                                        zhz zhzVar2 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                        zoe zoeVarA2 = ziaVar.a(new zhx());
                                        zhy zhyVar2 = new zhy(new ajyi(ajyhVar2), zhzVar2);
                                        obj = zoeVarA2.a;
                                        obj2 = zhyVar2.a;
                                        ulw ulwVar2 = yju.a;
                                        byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                        ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar2.b, (java.util.Map) ulwVar2.c, (ajvc) ulwVar2.a);
                                        ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                                        if (ajvcVar != null) {
                                            throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                                        }
                                        ajvcVar.a(obj2, ajvjVar);
                                        defpackage.akzc akzcVarU2 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                                        defpackage.aais.as(akzcVarU2);
                                        zzyVar = new zzy((defpackage.zyx) obj, akzcVarU2);
                                        zzyVar.o = defpackage.a.aS(0);
                                        if (!zzyVar.b) {
                                            throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                                        }
                                        zzyVar.b = true;
                                        zzyVar.a.f.b(zzyVar).m(new zib());
                                        return;
                                    }
                                }
                                str4 = ajtcVarB2.c().b;
                                if (!str4.startsWith("1:")) {
                                    str = strZ;
                                    strArrSplit = str4.split(":");
                                    str2 = string4;
                                    if (strArrSplit.length >= 2) {
                                        str5 = strArrSplit[1];
                                        if (str5.isEmpty()) {
                                            j2 = java.lang.Long.parseLong(str5);
                                        }
                                    }
                                    ajyh ajyhVar3 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                                    zhz zhzVar3 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                    zoe zoeVarA3 = ziaVar.a(new zhx());
                                    zhy zhyVar3 = new zhy(new ajyi(ajyhVar3), zhzVar3);
                                    obj = zoeVarA3.a;
                                    obj2 = zhyVar3.a;
                                    ulw ulwVar3 = yju.a;
                                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                    ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar3.b, (java.util.Map) ulwVar3.c, (ajvc) ulwVar3.a);
                                    ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                                    if (ajvcVar != null) {
                                        throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                                    }
                                    ajvcVar.a(obj2, ajvjVar);
                                    defpackage.akzc akzcVarU3 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                                    defpackage.aais.as(akzcVarU3);
                                    zzyVar = new zzy((defpackage.zyx) obj, akzcVarU3);
                                    zzyVar.o = defpackage.a.aS(0);
                                    if (!zzyVar.b) {
                                        throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                                    }
                                    zzyVar.b = true;
                                    zzyVar.a.f.b(zzyVar).m(new zib());
                                    return;
                                }
                                j = java.lang.Long.parseLong(str4);
                                j2 = 0;
                                ajyh ajyhVar4 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                                zhz zhzVar4 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                zoe zoeVarA4 = ziaVar.a(new zhx());
                                zhy zhyVar4 = new zhy(new ajyi(ajyhVar4), zhzVar4);
                                obj = zoeVarA4.a;
                                obj2 = zhyVar4.a;
                                ulw ulwVar4 = yju.a;
                                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar4.b, (java.util.Map) ulwVar4.c, (ajvc) ulwVar4.a);
                                ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                                if (ajvcVar != null) {
                                    throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                                }
                                ajvcVar.a(obj2, ajvjVar);
                                defpackage.akzc akzcVarU4 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                                defpackage.aais.as(akzcVarU4);
                                zzyVar = new zzy((defpackage.zyx) obj, akzcVarU4);
                                zzyVar.o = defpackage.a.aS(0);
                                if (!zzyVar.b) {
                                    throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                                }
                                zzyVar.b = true;
                                zzyVar.a.f.b(zzyVar).m(new zib());
                                return;
                            }
                            str = strZ;
                            long j3 = j;
                            str2 = string4;
                            j2 = j3;
                        } else {
                            defpackage.ajtc ajtcVarB3 = defpackage.ajtc.b();
                            str3 = ajtcVarB3.c().c;
                            if (str3 != null) {
                                j = java.lang.Long.parseLong(str3);
                                str = strZ;
                                long j4 = j;
                                str2 = string4;
                                j2 = j4;
                            }
                            str4 = ajtcVarB3.c().b;
                            if (!str4.startsWith("1:")) {
                                j = java.lang.Long.parseLong(str4);
                                str = strZ;
                                long j5 = j;
                                str2 = string4;
                                j2 = j5;
                            } else {
                                str = strZ;
                                strArrSplit = str4.split(":");
                                str2 = string4;
                                if (strArrSplit.length >= 2) {
                                    str5 = strArrSplit[1];
                                    if (str5.isEmpty()) {
                                        j2 = java.lang.Long.parseLong(str5);
                                    }
                                }
                            }
                            j2 = 0;
                        }
                        ajyh ajyhVar5 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                        zhz zhzVar5 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                        zoe zoeVarA5 = ziaVar.a(new zhx());
                        zhy zhyVar5 = new zhy(new ajyi(ajyhVar5), zhzVar5);
                        obj = zoeVarA5.a;
                        obj2 = zhyVar5.a;
                        ulw ulwVar5 = yju.a;
                        byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar5.b, (java.util.Map) ulwVar5.c, (ajvc) ulwVar5.a);
                        ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                        if (ajvcVar != null) {
                            throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                        }
                        ajvcVar.a(obj2, ajvjVar);
                        defpackage.akzc akzcVarU5 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                        defpackage.aais.as(akzcVarU5);
                        zzyVar = new zzy((defpackage.zyx) obj, akzcVarU5);
                        zzyVar.o = defpackage.a.aS(0);
                        if (!zzyVar.b) {
                            throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                        }
                        zzyVar.b = true;
                        zzyVar.a.f.b(zzyVar).m(new zib());
                        return;
                    }
                    i4 = 5;
                    i3 = i4;
                    strZ = z(extras);
                    if (strZ == null) {
                        strZ = "";
                    }
                    strA = A(extras);
                    if (strA == null) {
                        strA = "";
                    }
                    string3 = extras.getString("collapse_key");
                    if (string3 == null) {
                        string3 = "";
                    }
                    string4 = extras.getString("google.c.a.m_l");
                    if (string4 == null) {
                        string4 = "";
                    }
                    java.lang.String string6 = extras.getString("google.c.a.c_l");
                    if (string6 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j = java.lang.Long.parseLong(extras.getString("google.c.sender.id"));
                        str = strZ;
                        long j6 = j;
                        str2 = string4;
                        j2 = j6;
                    } else {
                        defpackage.ajtc ajtcVarB4 = defpackage.ajtc.b();
                        str3 = ajtcVarB4.c().c;
                        if (str3 != null) {
                            j = java.lang.Long.parseLong(str3);
                            str = strZ;
                            long j7 = j;
                            str2 = string4;
                            j2 = j7;
                        }
                        str4 = ajtcVarB4.c().b;
                        if (!str4.startsWith("1:")) {
                            j = java.lang.Long.parseLong(str4);
                            str = strZ;
                            long j8 = j;
                            str2 = string4;
                            j2 = j8;
                        } else {
                            str = strZ;
                            strArrSplit = str4.split(":");
                            str2 = string4;
                            if (strArrSplit.length >= 2) {
                                str5 = strArrSplit[1];
                                if (str5.isEmpty()) {
                                    j2 = java.lang.Long.parseLong(str5);
                                }
                            }
                        }
                        j2 = 0;
                    }
                    ajyh ajyhVar6 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                    zhz zhzVar6 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                    zoe zoeVarA6 = ziaVar.a(new zhx());
                    zhy zhyVar6 = new zhy(new ajyi(ajyhVar6), zhzVar6);
                    obj = zoeVarA6.a;
                    obj2 = zhyVar6.a;
                    ulw ulwVar6 = yju.a;
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar6.b, (java.util.Map) ulwVar6.c, (ajvc) ulwVar6.a);
                    ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                    if (ajvcVar != null) {
                        throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                    }
                    ajvcVar.a(obj2, ajvjVar);
                    defpackage.akzc akzcVarU6 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                    defpackage.aais.as(akzcVarU6);
                    zzyVar = new zzy((defpackage.zyx) obj, akzcVarU6);
                    zzyVar.o = defpackage.a.aS(0);
                    if (!zzyVar.b) {
                        throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                    }
                    zzyVar.b = true;
                    zzyVar.a.f.b(zzyVar).m(new zib());
                    return;
                }
                iIntValue = ((java.lang.Integer) obj3).intValue();
                if (c == 2) {
                    if (c == 1) {
                        i4 = 10;
                    } else {
                        i3 = 0;
                    }
                    strZ = z(extras);
                    if (strZ == null) {
                        strZ = "";
                    }
                    strA = A(extras);
                    if (strA == null) {
                        strA = "";
                    }
                    string3 = extras.getString("collapse_key");
                    if (string3 == null) {
                        string3 = "";
                    }
                    string4 = extras.getString("google.c.a.m_l");
                    if (string4 == null) {
                        string4 = "";
                    }
                    java.lang.String string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j = java.lang.Long.parseLong(extras.getString("google.c.sender.id"));
                        str = strZ;
                        long j9 = j;
                        str2 = string4;
                        j2 = j9;
                    } else {
                        defpackage.ajtc ajtcVarB5 = defpackage.ajtc.b();
                        str3 = ajtcVarB5.c().c;
                        if (str3 != null) {
                            j = java.lang.Long.parseLong(str3);
                            str = strZ;
                            long j10 = j;
                            str2 = string4;
                            j2 = j10;
                        }
                        str4 = ajtcVarB5.c().b;
                        if (!str4.startsWith("1:")) {
                            j = java.lang.Long.parseLong(str4);
                            str = strZ;
                            long j11 = j;
                            str2 = string4;
                            j2 = j11;
                        } else {
                            str = strZ;
                            strArrSplit = str4.split(":");
                            str2 = string4;
                            if (strArrSplit.length >= 2) {
                                str5 = strArrSplit[1];
                                if (str5.isEmpty()) {
                                    j2 = java.lang.Long.parseLong(str5);
                                }
                            }
                        }
                        j2 = 0;
                    }
                    ajyh ajyhVar7 = new ajyh(j2 > 0 ? j2 : 0L, str, str6, ajyfVar2, ajygVar, packageName, string3, i3, i2, strA, ajyeVar, str2, str7);
                    zhz zhzVar7 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                    zoe zoeVarA7 = ziaVar.a(new zhx());
                    zhy zhyVar7 = new zhy(new ajyi(ajyhVar7), zhzVar7);
                    obj = zoeVarA7.a;
                    obj2 = zhyVar7.a;
                    ulw ulwVar7 = yju.a;
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar7.b, (java.util.Map) ulwVar7.c, (ajvc) ulwVar7.a);
                    ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                    if (ajvcVar != null) {
                        throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                    }
                    ajvcVar.a(obj2, ajvjVar);
                    defpackage.akzc akzcVarU7 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                    defpackage.aais.as(akzcVarU7);
                    zzyVar = new zzy((defpackage.zyx) obj, akzcVarU7);
                    zzyVar.o = defpackage.a.aS(0);
                    if (!zzyVar.b) {
                        throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                    }
                    zzyVar.b = true;
                    zzyVar.a.f.b(zzyVar).m(new zib());
                    return;
                }
                i4 = 5;
                ajvjVar = new ajvj(byteArrayOutputStream, (java.util.Map) ulwVar7.b, (java.util.Map) ulwVar7.c, (ajvc) ulwVar7.a);
                ajvcVar = (ajvc) ajvjVar.c.get(obj2.getClass());
                if (ajvcVar != null) {
                    throw new ajva("No encoder for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2.getClass()))));
                }
                ajvcVar.a(obj2, ajvjVar);
                defpackage.akzc akzcVarU8 = defpackage.akzc.u(byteArrayOutputStream.toByteArray());
                defpackage.aais.as(akzcVarU8);
                zzyVar = new zzy((defpackage.zyx) obj, akzcVarU8);
                zzyVar.o = defpackage.a.aS(0);
                if (!zzyVar.b) {
                    throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
                }
                zzyVar.b = true;
                zzyVar.a.f.b(zzyVar).m(new zib());
                return;
            } catch (java.io.IOException unused2) {
            }
            zhz zhzVar8 = new zhz(java.lang.Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
            zoe zoeVarA8 = ziaVar.a(new zhx());
            zhy zhyVar8 = new zhy(new ajyi(ajyhVar7), zhzVar8);
            obj = zoeVarA8.a;
            obj2 = zhyVar8.a;
            ulw ulwVar8 = yju.a;
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.RuntimeException e6) {
            android.util.Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            return;
        }
        i2 = iIntValue;
        string = extras.getString("google.to");
        if (android.text.TextUtils.isEmpty(string)) {
            defpackage.ajtc ajtcVarB6 = defpackage.ajtc.b();
            java.lang.Object obj5 = defpackage.ajwh.a;
            string = (java.lang.String) defpackage.aazc.t(((defpackage.ajwh) ajtcVarB6.d(defpackage.ajwi.class)).a());
        }
        java.lang.String str8 = string;
        java.lang.String packageName2 = defpackage.ajtc.b().a().getPackageName();
        ajyg ajygVar2 = ajyg.b;
        if (extras == null) {
            ajyfVar = ajyf.b;
        } else {
            ajyfVar = ajyf.b;
        }
        ajyf ajyfVar3 = ajyfVar;
        string2 = extras.getString("google.delivered_priority");
        if (string2 != null) {
            if ("high".equals(string2)) {
                c = 1;
            } else if ("normal".equals(string2)) {
                c = 2;
            } else {
                c = 0;
            }
        } else if ("1".equals(extras.getString("google.priority_reduced"))) {
            string2 = extras.getString("google.priority");
            if ("high".equals(string2)) {
                c = 1;
            } else if ("normal".equals(string2)) {
                c = 2;
            } else {
                c = 0;
            }
        } else {
            c = 2;
        }
        i3 = i4;
        strZ = z(extras);
        if (strZ == null) {
            strZ = "";
        }
        strA = A(extras);
        if (strA == null) {
            strA = "";
        }
        string3 = extras.getString("collapse_key");
        if (string3 == null) {
            string3 = "";
        }
        string4 = extras.getString("google.c.a.m_l");
        if (string4 == null) {
            string4 = "";
        }
        java.lang.String string8 = extras.getString("google.c.a.c_l");
        if (string8 != null) {
        }
        if (extras.containsKey("google.c.sender.id")) {
            j = java.lang.Long.parseLong(extras.getString("google.c.sender.id"));
            str = strZ;
            long j12 = j;
            str2 = string4;
            j2 = j12;
        } else {
            defpackage.ajtc ajtcVarB7 = defpackage.ajtc.b();
            str3 = ajtcVarB7.c().c;
            if (str3 != null) {
                j = java.lang.Long.parseLong(str3);
                str = strZ;
                long j13 = j;
                str2 = string4;
                j2 = j13;
            }
            str4 = ajtcVarB7.c().b;
            if (!str4.startsWith("1:")) {
                j = java.lang.Long.parseLong(str4);
                str = strZ;
                long j14 = j;
                str2 = string4;
                j2 = j14;
            } else {
                str = strZ;
                strArrSplit = str4.split(":");
                str2 = string4;
                if (strArrSplit.length >= 2) {
                    str5 = strArrSplit[1];
                    if (str5.isEmpty()) {
                        j2 = java.lang.Long.parseLong(str5);
                    }
                }
            }
            j2 = 0;
        }
        ajyh ajyhVar8 = new ajyh(j2 > 0 ? j2 : 0L, str, str8, ajyfVar3, ajygVar2, packageName2, string3, i3, i2, strA, ajyeVar, str2, str7);
    }

    public static void C(java.lang.String str, android.os.Bundle bundle) {
        try {
            defpackage.ajtc.b();
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            java.lang.String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            java.lang.String string3 = bundle.getString("google.c.a.m_l");
            if (!android.text.TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            java.lang.String string4 = bundle.getString("google.c.a.m_c");
            if (!android.text.TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            java.lang.String strA = A(bundle);
            if (strA != null) {
                bundle2.putString("_nt", strA);
            }
            java.lang.String string5 = bundle.getString("google.c.a.ts");
            if (string5 != null) {
                try {
                    bundle2.putInt("_nmt", java.lang.Integer.parseInt(string5));
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            java.lang.String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string6 != null) {
                try {
                    bundle2.putInt("_ndt", java.lang.Integer.parseInt(string6));
                } catch (java.lang.NumberFormatException e2) {
                    android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            java.lang.String str2 = true != agmc.V(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2.toString());
            }
            defpackage.ajti ajtiVar = (defpackage.ajti) defpackage.ajtc.b().d(defpackage.ajti.class);
            if (ajtiVar != null) {
                ajtiVar.a();
            } else {
                android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (java.lang.IllegalStateException unused) {
            android.util.Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean D() {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            defpackage.ajtc.b();
            android.content.Context contextA = defpackage.ajtc.b().a();
            android.content.SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                android.content.pm.PackageManager packageManager = contextA.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return false;
                }
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (java.lang.IllegalStateException unused2) {
            android.util.Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean E(android.content.Intent intent) {
        if (intent == null || c(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(android.os.Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static java.util.concurrent.ExecutorService G() {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new defpackage.aaiv("Firebase-Messaging-Network-Io"));
    }

    public static java.util.concurrent.ExecutorService H() {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new defpackage.aaiv("Firebase-Messaging-Task"));
    }

    public static void I(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void J(java.lang.Object obj) {
        obj.getClass();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajty */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public static void K(java.util.List list) throws ajty {
        java.util.Set<defpackage.aogc> set;
        java.util.HashMap map = new java.util.HashMap(list.size());
        java.util.Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                java.util.Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (defpackage.aogc aogcVar : (java.util.Set) it2.next()) {
                        for (defpackage.ajtx ajtxVar : ((defpackage.ajtp) aogcVar.a).c) {
                            if (ajtxVar.a() && (set = (java.util.Set) map.get(new defpackage.ajtw(ajtxVar.a, ajtxVar.b()))) != null) {
                                for (defpackage.aogc aogcVar2 : set) {
                                    aogcVar.b.add(aogcVar2);
                                    aogcVar2.c.add(aogcVar);
                                }
                            }
                        }
                    }
                }
                java.util.HashSet<defpackage.aogc> hashSet = new java.util.HashSet();
                java.util.Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((java.util.Set) it3.next());
                }
                java.util.HashSet hashSet2 = new java.util.HashSet();
                for (defpackage.aogc aogcVar3 : hashSet) {
                    if (aogcVar3.m()) {
                        hashSet2.add(aogcVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    defpackage.aogc aogcVar4 = (defpackage.aogc) hashSet2.iterator().next();
                    hashSet2.remove(aogcVar4);
                    i2++;
                    for (defpackage.aogc aogcVar5 : aogcVar4.b) {
                        aogcVar5.c.remove(aogcVar4);
                        if (aogcVar5.m()) {
                            hashSet2.add(aogcVar5);
                        }
                    }
                }
                if (i2 == list.size()) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (defpackage.aogc aogcVar6 : hashSet) {
                    if (!aogcVar6.m() && !aogcVar6.b.isEmpty()) {
                        arrayList.add(aogcVar6.a);
                    }
                }
                throw new ajty(arrayList);
            }
            defpackage.ajtp ajtpVar = (defpackage.ajtp) it.next();
            defpackage.aogc aogcVar7 = new defpackage.aogc(ajtpVar);
            for (defpackage.ajui ajuiVar : ajtpVar.b) {
                defpackage.ajtw ajtwVar = new defpackage.ajtw(ajuiVar, !ajtpVar.f());
                if (!map.containsKey(ajtwVar)) {
                    map.put(ajtwVar, new java.util.HashSet());
                }
                java.util.Set set2 = (java.util.Set) map.get(ajtwVar);
                if (!set2.isEmpty() && !ajtwVar.a) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Multiple components provide %s.", ajuiVar));
                }
                set2.add(aogcVar7);
            }
        }
    }

    public static void L(com.google.firebase.components.ComponentRegistrar componentRegistrar, java.util.List list) {
        list.add(new defpackage.ajtu(componentRegistrar, 0));
    }

    public static boolean M(byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] < 0) {
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    if (b < 0) {
                        if (b < -32) {
                            if (i4 < i3 && b >= -62) {
                                i2 += 2;
                                if (bArr[i4] > -65) {
                                }
                            }
                            return false;
                        }
                        if (b >= -16) {
                            if (i4 < i3 - 2) {
                                int i5 = i2 + 2;
                                byte b2 = bArr[i4];
                                if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                    int i6 = i2 + 3;
                                    if (bArr[i5] <= -65) {
                                        i2 += 4;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (i4 < i3 - 1) {
                            int i7 = i2 + 2;
                            byte b3 = bArr[i4];
                            if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                                i2 += 3;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return false;
                    }
                    i2 = i4;
                }
                return true;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[PHI: r4
      0x0092: PHI (r4v7 byte) = (r4v6 byte), (r4v12 byte) binds: [B:40:0x008d, B:42:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:81:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00aa A[SYNTHETIC] */
    public static java.lang.String N(byte[] bArr, int i2, int i3) throws defpackage.alaz {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i2 = i6;
                while (i2 < i4) {
                    byte b3 = bArr[i2];
                    if (b3 < 0) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (b2 < -32) {
                if (i6 >= i4) {
                    throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                }
                int i7 = i5 + 1;
                i2 += 2;
                byte b4 = bArr[i6];
                if (b2 < -62 || P(b4)) {
                    throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                }
                cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                i5 = i7;
            } else {
                if (b2 < -16) {
                    if (i6 >= i4 - 1) {
                        throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                    }
                    int i8 = i5 + 1;
                    int i9 = i2 + 2;
                    byte b5 = bArr[i6];
                    i2 += 3;
                    byte b6 = bArr[i9];
                    if (!P(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!P(b6)) {
                                    cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i5 = i8;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!P(b6)) {
                                    cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i5 = i8;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!P(b6)) {
                                    cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i5 = i8;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!P(b6)) {
                                    cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i5 = i8;
                                }
                            }
                        }
                    }
                    throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                }
                if (i6 >= i4 - 2) {
                    throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                }
                byte b7 = bArr[i6];
                int i10 = i2 + 3;
                byte b8 = bArr[i2 + 2];
                i2 += 4;
                byte b9 = bArr[i10];
                if (P(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || P(b8) || P(b9)) {
                    throw new defpackage.alaz("Protocol message had invalid UTF-8.");
                }
                int i11 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i5] = (char) ((i11 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i11 & 1023) + 56320);
                i5 += 2;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }

    public static int O(java.lang.String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i3 < length2) {
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i2 += (127 - cCharAt2) >>> 31;
                        } else {
                            i2 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (java.lang.Character.codePointAt(str, i3) < 65536) {
                                    throw new defpackage.alcp(i3, length2);
                                }
                                i3++;
                            }
                        }
                        i3++;
                    }
                    i4 += i2;
                    break;
                } catch (defpackage.alcp unused) {
                    return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
                }
            }
            i4 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i4 >= length) {
            return i4;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i4) + 4294967296L));
    }

    public static boolean P(byte b) {
        return b > -65;
    }

    public static defpackage.albe Q(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.albe albeVarA = (defpackage.albe) obj;
        defpackage.albe albeVar = (defpackage.albe) obj2;
        if (!albeVar.isEmpty()) {
            if (!albeVarA.b) {
                albeVarA = albeVarA.a();
            }
            albeVarA.b();
            if (!albeVar.isEmpty()) {
                albeVarA.putAll(albeVar);
            }
        }
        return albeVarA;
    }

    public static boolean R(java.lang.Object obj) {
        return !((defpackage.albe) obj).b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static java.util.List S(java.lang.Object obj, long j) {
        defpackage.alcn alcnVar = defpackage.alco.a;
        defpackage.alat alatVar = (defpackage.alat) alcnVar.i(obj, j);
        if (alatVar.c()) {
            return alatVar;
        }
        int size = alatVar.size();
        defpackage.alat alatVarD = alatVar.d(size == 0 ? 10 : size << 1);
        alcnVar.l(obj, j, alatVarD);
        return alatVarD;
    }

    public static defpackage.akzs T(java.lang.Object obj) {
        return ((defpackage.alaa) obj).n;
    }

    public static defpackage.akzs U(java.lang.Object obj) {
        return ((defpackage.alaa) obj).b();
    }

    public static void V(defpackage.akzg akzgVar, java.lang.Object obj, defpackage.akzq akzqVar, defpackage.akzs akzsVar) {
        defpackage.apdi apdiVar = (defpackage.apdi) obj;
        akzsVar.k((defpackage.alac) apdiVar.a, akzgVar.s(apdiVar.c.getClass(), akzqVar));
    }

    public static void W(java.lang.Object obj) {
        ((defpackage.alaa) obj).n.e();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int X(java.lang.String str) {
        if (str.equals("Qaai")) {
            return 207;
        }
        switch (str.hashCode()) {
            case 2035972:
                if (str.equals("Adlm")) {
                    return 1;
                }
                break;
            case 2037551:
                if (str.equals("Afak")) {
                    return 2;
                }
                break;
            case 2038720:
                if (str.equals("Aghb")) {
                    return 3;
                }
                break;
            case 2039909:
                if (str.equals("Ahom")) {
                    return 4;
                }
                break;
            case 2049074:
                if (str.equals("Arab")) {
                    return 5;
                }
                break;
            case 2049086:
                if (str.equals("Aran")) {
                    return 6;
                }
                break;
            case 2049453:
                if (str.equals("Armi")) {
                    return 7;
                }
                break;
            case 2049458:
                if (str.equals("Armn")) {
                    return 8;
                }
                break;
            case 2053494:
                if (str.equals("Avst")) {
                    return 9;
                }
                break;
            case 2062876:
                if (str.equals("Bali")) {
                    return 10;
                }
                break;
            case 2062919:
                if (str.equals("Bamu")) {
                    return 11;
                }
                break;
            case 2063103:
                if (str.equals("Bass")) {
                    return 12;
                }
                break;
            case 2063126:
                if (str.equals("Batk")) {
                    return 13;
                }
                break;
            case 2066780:
                if (str.equals("Beng")) {
                    return 14;
                }
                break;
            case 2066903:
                if (str.equals("Berf")) {
                    return 15;
                }
                break;
            case 2069582:
                if (str.equals("Bhks")) {
                    return 16;
                }
                break;
            case 2073364:
                if (str.equals("Blis")) {
                    return 17;
                }
                break;
            case 2076460:
                if (str.equals("Bopo")) {
                    return 18;
                }
                break;
            case 2078871:
                if (str.equals("Brah")) {
                    return 19;
                }
                break;
            case 2078872:
                if (str.equals("Brai")) {
                    return 20;
                }
                break;
            case 2081941:
                if (str.equals("Bugi")) {
                    return 21;
                }
                break;
            case 2081967:
                if (str.equals("Buhd")) {
                    return 22;
                }
                break;
            case 2092640:
                if (str.equals("Cakm")) {
                    return 23;
                }
                break;
            case 2092739:
                if (str.equals("Cans")) {
                    return 24;
                }
                break;
            case 2092853:
                if (str.equals("Cari")) {
                    return 25;
                }
                break;
            case 2099057:
                if (str.equals("Cham")) {
                    return 26;
                }
                break;
            case 2099186:
                if (str.equals("Cher")) {
                    return 27;
                }
                break;
            case 2099590:
                if (str.equals("Chrs")) {
                    return 28;
                }
                break;
            case 2100552:
                if (str.equals("Cirt")) {
                    return 29;
                }
                break;
            case 2106256:
                if (str.equals("Copt")) {
                    return 30;
                }
                break;
            case 2107118:
                if (str.equals("Cpmn")) {
                    return 31;
                }
                break;
            case 2107279:
                if (str.equals("Cprt")) {
                    return 32;
                }
                break;
            case 2115920:
                if (str.equals("Cyrl")) {
                    return 33;
                }
                break;
            case 2115927:
                if (str.equals("Cyrs")) {
                    return 34;
                }
                break;
            case 2126604:
                if (str.equals("Deva")) {
                    return 35;
                }
                break;
            case 2129807:
                if (str.equals("Diak")) {
                    return 36;
                }
                break;
            case 2135766:
                if (str.equals("Dogr")) {
                    return 37;
                }
                break;
            case 2139953:
                if (str.equals("Dsrt")) {
                    return 38;
                }
                break;
            case 2141805:
                if (str.equals("Dupl")) {
                    return 39;
                }
                break;
            case 2158413:
                if (str.equals("Egyd")) {
                    return 40;
                }
                break;
            case 2158417:
                if (str.equals("Egyh")) {
                    return 41;
                }
                break;
            case 2158425:
                if (str.equals("Egyp")) {
                    return 42;
                }
                break;
            case 2162502:
                if (str.equals("Elba")) {
                    return 43;
                }
                break;
            case 2163227:
                if (str.equals("Elym")) {
                    return 44;
                }
                break;
            case 2170384:
                if (str.equals("Ethi")) {
                    return 45;
                }
                break;
            case 2212009:
                if (str.equals("Gara")) {
                    return 46;
                }
                break;
            case 2215770:
                if (str.equals("Geok")) {
                    return 47;
                }
                break;
            case 2215777:
                if (str.equals("Geor")) {
                    return 48;
                }
                break;
            case 2222059:
                if (str.equals("Glag")) {
                    return 49;
                }
                break;
            case 2225345:
                if (str.equals("Gong")) {
                    return 50;
                }
                break;
            case 2225351:
                if (str.equals("Gonm")) {
                    return 51;
                }
                break;
            case 2225532:
                if (str.equals("Goth")) {
                    return 52;
                }
                break;
            case 2227832:
                if (str.equals("Gran")) {
                    return 53;
                }
                break;
            case 2227953:
                if (str.equals("Grek")) {
                    return 54;
                }
                break;
            case 2230998:
                if (str.equals("Gujr")) {
                    return 55;
                }
                break;
            case 2231019:
                if (str.equals("Gukh")) {
                    return 56;
                }
                break;
            case 2231249:
                if (str.equals("Guru")) {
                    return 57;
                }
                break;
            case 2241677:
                if (str.equals("Hanb")) {
                    return 58;
                }
                break;
            case 2241682:
                if (str.equals("Hang")) {
                    return 59;
                }
                break;
            case 2241684:
                if (str.equals("Hani")) {
                    return 60;
                }
                break;
            case 2241690:
                if (str.equals("Hano")) {
                    return 61;
                }
                break;
            case 2241694:
                if (str.equals("Hans")) {
                    return 62;
                }
                break;
            case 2241695:
                if (str.equals("Hant")) {
                    return 63;
                }
                break;
            case 2241879:
                if (str.equals("Hatr")) {
                    return 64;
                }
                break;
            case 2245165:
                if (str.equals("Hebr")) {
                    return 65;
                }
                break;
            case 2249488:
                if (str.equals("Hira")) {
                    return 66;
                }
                break;
            case 2252486:
                if (str.equals("Hluw")) {
                    return 67;
                }
                break;
            case 2253214:
                if (str.equals("Hmng")) {
                    return 68;
                }
                break;
            case 2253223:
                if (str.equals("Hmnp")) {
                    return 69;
                }
                break;
            case 2254366:
                if (str.equals("Hntl")) {
                    return 70;
                }
                break;
            case 2257939:
                if (str.equals("Hrkt")) {
                    return 71;
                }
                break;
            case 2260902:
                if (str.equals("Hung")) {
                    return 72;
                }
                break;
            case 2283668:
                if (str.equals("Inds")) {
                    return 73;
                }
                break;
            case 2289334:
                if (str.equals("Ital")) {
                    return 74;
                }
                break;
            case 2301241:
                if (str.equals("Jamo")) {
                    return 75;
                }
                break;
            case 2301506:
                if (str.equals("Java")) {
                    return 76;
                }
                break;
            case 2315283:
                if (str.equals("Jpan")) {
                    return 77;
                }
                break;
            case 2320604:
                if (str.equals("Jurc")) {
                    return 78;
                }
                break;
            case 2330995:
                if (str.equals("Kali")) {
                    return 79;
                }
                break;
            case 2331049:
                if (str.equals("Kana")) {
                    return 80;
                }
                break;
            case 2331336:
                if (str.equals("Kawi")) {
                    return 81;
                }
                break;
            case 2337390:
                if (str.equals("Khar")) {
                    return 82;
                }
                break;
            case 2337762:
                if (str.equals("Khmr")) {
                    return 83;
                }
                break;
            case 2337816:
                if (str.equals("Khoj")) {
                    return 84;
                }
                break;
            case 2338941:
                if (str.equals("Kits")) {
                    return 85;
                }
                break;
            case 2343232:
                if (str.equals("Knda")) {
                    return 86;
                }
                break;
            case 2344631:
                if (str.equals("Kore")) {
                    return 87;
                }
                break;
            case 2345196:
                if (str.equals("Kpel")) {
                    return 88;
                }
                break;
            case 2346991:
                if (str.equals("Krai")) {
                    return 89;
                }
                break;
            case 2349130:
                if (str.equals("Kthi")) {
                    return 90;
                }
                break;
            case 2360840:
                if (str.equals("Lana")) {
                    return 91;
                }
                break;
            case 2360885:
                if (str.equals("Laoo")) {
                    return 92;
                }
                break;
            case 2361031:
                if (str.equals("Latf")) {
                    return 93;
                }
                break;
            case 2361032:
                if (str.equals("Latg")) {
                    return 94;
                }
                break;
            case 2361039:
                if (str.equals("Latn")) {
                    return 95;
                }
                break;
            case 2364748:
                if (str.equals("Lepc")) {
                    return 96;
                }
                break;
            case 2368498:
                if (str.equals("Limb")) {
                    return 97;
                }
                break;
            case 2368528:
                if (str.equals("Lina")) {
                    return 98;
                }
                break;
            case 2368529:
                if (str.equals("Linb")) {
                    return 99;
                }
                break;
            case 2368703:
                if (str.equals("Lisu")) {
                    return 100;
                }
                break;
            case 2374263:
                if (str.equals("Loma")) {
                    return 101;
                }
                break;
            case 2383571:
                if (str.equals("Lyci")) {
                    return 102;
                }
                break;
            case 2383602:
                if (str.equals("Lydi")) {
                    return 103;
                }
                break;
            case 2390454:
                if (str.equals("Mahj")) {
                    return 104;
                }
                break;
            case 2390538:
                if (str.equals("Maka")) {
                    return 105;
                }
                break;
            case 2390634:
                if (str.equals("Mand")) {
                    return 106;
                }
                break;
            case 2390639:
                if (str.equals("Mani")) {
                    return 107;
                }
                break;
            case 2390757:
                if (str.equals("Marc")) {
                    return 108;
                }
                break;
            case 2390972:
                if (str.equals("Maya")) {
                    return 109;
                }
                break;
            case 2394170:
                if (str.equals("Medf")) {
                    return 110;
                }
                break;
            case 2394478:
                if (str.equals("Mend")) {
                    return 111;
                }
                break;
            case 2394601:
                if (str.equals("Merc")) {
                    return 112;
                }
                break;
            case 2394613:
                if (str.equals("Mero")) {
                    return 113;
                }
                break;
            case 2401555:
                if (str.equals("Mlym")) {
                    return 114;
                }
                break;
            case 2403783:
                if (str.equals("Modi")) {
                    return 115;
                }
                break;
            case 2404091:
                if (str.equals("Mong")) {
                    return 116;
                }
                break;
            case 2404129:
                if (str.equals("Moon")) {
                    return 117;
                }
                break;
            case 2407013:
                if (str.equals("Mroo")) {
                    return 118;
                }
                break;
            case 2408619:
                if (str.equals("Mtei")) {
                    return 119;
                }
                break;
            case 2409808:
                if (str.equals("Mult")) {
                    return 120;
                }
                break;
            case 2413681:
                if (str.equals("Mymr")) {
                    return 121;
                }
                break;
            case 2420217:
                if (str.equals("Nagm")) {
                    return 122;
                }
                break;
            case 2420425:
                if (str.equals("Nand")) {
                    return 123;
                }
                break;
            case 2420547:
                if (str.equals("Narb")) {
                    return 124;
                }
                break;
            case 2420999:
                if (str.equals("Nbat")) {
                    return 125;
                }
                break;
            case 2424545:
                if (str.equals("Newa")) {
                    return 126;
                }
                break;
            case 2429816:
                if (str.equals("Nkgb")) {
                    return 127;
                }
                break;
            case 2430077:
                if (str.equals("Nkoo")) {
                    return 128;
                }
                break;
            case 2437554:
                if (str.equals("Nshu")) {
                    return 129;
                }
                break;
            case 2455588:
                if (str.equals("Ogam")) {
                    return 130;
                }
                break;
            case 2460453:
                if (str.equals("Olck")) {
                    return 131;
                }
                break;
            case 2462317:
                if (str.equals("Onao")) {
                    return 132;
                }
                break;
            case 2466464:
                if (str.equals("Orkh")) {
                    return 133;
                }
                break;
            case 2466891:
                if (str.equals("Orya")) {
                    return 134;
                }
                break;
            case 2467298:
                if (str.equals("Osge")) {
                    return 135;
                }
                break;
            case 2467480:
                if (str.equals("Osma")) {
                    return 136;
                }
                break;
            case 2469233:
                if (str.equals("Ougr")) {
                    return 137;
                }
                break;
            case 2479954:
                if (str.equals("Palm")) {
                    return 138;
                }
                break;
            case 2480223:
                if (str.equals("Pauc")) {
                    return 139;
                }
                break;
            case 2483984:
                if (str.equals("Perm")) {
                    return 140;
                }
                break;
            case 2486334:
                if (str.equals("Phag")) {
                    return 141;
                }
                break;
            case 2486677:
                if (str.equals("Phli")) {
                    return 142;
                }
                break;
            case 2486684:
                if (str.equals("Phlp")) {
                    return 143;
                }
                break;
            case 2486690:
                if (str.equals("Phlv")) {
                    return 144;
                }
                break;
            case 2486754:
                if (str.equals("Phnx")) {
                    return 145;
                }
                break;
            case 2490702:
                if (str.equals("Plrd")) {
                    return 146;
                }
                break;
            case 2496535:
                if (str.equals("Prti")) {
                    return 147;
                }
                break;
            case 2548241:
                if (str.equals("Rjng")) {
                    return 148;
                }
                break;
            case 2552860:
                if (str.equals("Rohg")) {
                    return 149;
                }
                break;
            case 2553178:
                if (str.equals("Roro")) {
                    return 150;
                }
                break;
            case 2558823:
                if (str.equals("Runr")) {
                    return 151;
                }
                break;
            case 2569363:
                if (str.equals("Samr")) {
                    return 152;
                }
                break;
            case 2569501:
                if (str.equals("Sara")) {
                    return 153;
                }
                break;
            case 2569502:
                if (str.equals("Sarb")) {
                    return 154;
                }
                break;
            case 2569611:
                if (str.equals("Saur")) {
                    return 155;
                }
                break;
            case 2575165:
                if (str.equals("Sgnw")) {
                    return 156;
                }
                break;
            case 2575723:
                if (str.equals("Shaw")) {
                    return 157;
                }
                break;
            case 2576231:
                if (str.equals("Shrd")) {
                    return 158;
                }
                break;
            case 2576758:
                if (str.equals("Sidd")) {
                    return 159;
                }
                break;
            case 2576774:
                if (str.equals("Sidt")) {
                    return 160;
                }
                break;
            case 2577068:
                if (str.equals("Sind")) {
                    return 161;
                }
                break;
            case 2577072:
                if (str.equals("Sinh")) {
                    return 162;
                }
                break;
            case 2582617:
                if (str.equals("Sogd")) {
                    return 163;
                }
                break;
            case 2582628:
                if (str.equals("Sogo")) {
                    return 164;
                }
                break;
            case 2582955:
                if (str.equals("Sora")) {
                    return 165;
                }
                break;
            case 2583186:
                if (str.equals("Soyo")) {
                    return 166;
                }
                break;
            case 2588600:
                if (str.equals("Sund")) {
                    return 167;
                }
                break;
            case 2588617:
                if (str.equals("Sunu")) {
                    return 168;
                }
                break;
            case 2592393:
                if (str.equals("Sylo")) {
                    return 169;
                }
                break;
            case 2592567:
                if (str.equals("Syrc")) {
                    return 170;
                }
                break;
            case 2592569:
                if (str.equals("Syre")) {
                    return 171;
                }
                break;
            case 2592574:
                if (str.equals("Syrj")) {
                    return 172;
                }
                break;
            case 2592578:
                if (str.equals("Syrn")) {
                    return 173;
                }
                break;
            case 2598952:
                if (str.equals("Tagb")) {
                    return 174;
                }
                break;
            case 2599092:
                if (str.equals("Takr")) {
                    return 175;
                }
                break;
            case 2599110:
                if (str.equals("Tale")) {
                    return 176;
                }
                break;
            case 2599126:
                if (str.equals("Talu")) {
                    return 177;
                }
                break;
            case 2599148:
                if (str.equals("Taml")) {
                    return 178;
                }
                break;
            case 2599174:
                if (str.equals("Tang")) {
                    return 179;
                }
                break;
            case 2599435:
                if (str.equals("Tavt")) {
                    return 180;
                }
                break;
            case 2599523:
                if (str.equals("Tayo")) {
                    return 181;
                }
                break;
            case 2602970:
                if (str.equals("Telu")) {
                    return 182;
                }
                break;
            case 2603018:
                if (str.equals("Teng")) {
                    return 183;
                }
                break;
            case 2603979:
                if (str.equals("Tfng")) {
                    return 184;
                }
                break;
            case 2604878:
                if (str.equals("Tglg")) {
                    return 185;
                }
                break;
            case 2605492:
                if (str.equals("Thaa")) {
                    return 186;
                }
                break;
            case 2605500:
                if (str.equals("Thai")) {
                    return 187;
                }
                break;
            case 2606503:
                if (str.equals("Tibt")) {
                    return 188;
                }
                break;
            case 2606987:
                if (str.equals("Tirh")) {
                    return 189;
                }
                break;
            case 2611816:
                if (str.equals("Tnsa")) {
                    return 190;
                }
                break;
            case 2612329:
                if (str.equals("Todr")) {
                    return 191;
                }
                break;
            case 2612578:
                if (str.equals("Tols")) {
                    return 192;
                }
                break;
            case 2612822:
                if (str.equals("Toto")) {
                    return 193;
                }
                break;
            case 2618580:
                if (str.equals("Tutg")) {
                    return 194;
                }
                break;
            case 2634339:
                if (str.equals("Ugar")) {
                    return 195;
                }
                break;
            case 2658603:
                if (str.equals("Vaii")) {
                    return 196;
                }
                break;
            case 2666608:
                if (str.equals("Visp")) {
                    return 197;
                }
                break;
            case 2666631:
                if (str.equals("Vith")) {
                    return 198;
                }
                break;
            case 2688665:
                if (str.equals("Wara")) {
                    return 199;
                }
                break;
            case 2690291:
                if (str.equals("Wcho")) {
                    return 200;
                }
                break;
            case 2701937:
                if (str.equals("Wole")) {
                    return 201;
                }
                break;
            case 2732482:
                if (str.equals("Xpeo")) {
                    return 202;
                }
                break;
            case 2735870:
                if (str.equals("Xsux")) {
                    return 203;
                }
                break;
            case 2752347:
                if (str.equals("Yezi")) {
                    return 204;
                }
                break;
            case 2755664:
                if (str.equals("Yiii")) {
                    return 205;
                }
                break;
            case 2777915:
                if (str.equals("Zanb")) {
                    return 206;
                }
                break;
            case 2785609:
                if (str.equals("Zinh")) {
                    return 207;
                }
                break;
            case 2789639:
                if (str.equals("Zmth")) {
                    return 208;
                }
                break;
            case 2795557:
                if (str.equals("Zsye")) {
                    return 209;
                }
                break;
            case 2795565:
                if (str.equals("Zsym")) {
                    return 210;
                }
                break;
            case 2800350:
                if (str.equals("Zxxx")) {
                    return 211;
                }
                break;
            case 2801343:
                if (str.equals("Zyyy")) {
                    return 212;
                }
                break;
            case 2802336:
                if (str.equals("Zzzz")) {
                    return 213;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static void Y(anpk anpkVar, java.lang.Class cls, boolean z) throws defpackage.anqx {
        java.lang.Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((aohc) (z ? anpkVar.d : anpkVar.e)).a.getClass();
            z2 = false;
        } catch (java.lang.ClassCastException unused) {
            cls2 = java.lang.Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        java.lang.String str = true != z ? "response" : "request";
        java.lang.String str2 = anpkVar.b;
        throw new defpackage.anqx(defpackage.anqw.k.f("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()), null);
    }

    public static defpackage.anrm Z(android.content.Context context, defpackage.aihd aihdVar, java.util.concurrent.Executor executor) {
        return new defpackage.anrm(new defpackage.ahgh(context, 2), context.getPackageManager(), aihdVar, executor);
    }

    public static void aA(java.lang.Object[] objArr, int i2, int i3) {
        defpackage.aooh.f(objArr, "<this>");
        while (i2 < i3) {
            az(objArr, i2);
            i2++;
        }
    }

    public static boolean aB(java.lang.Object[] objArr, int i2, int i3, java.util.List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!defpackage.aooh.n(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.Object[] aC(int i2) {
        if (i2 >= 0) {
            return new java.lang.Object[i2];
        }
        throw new java.lang.IllegalArgumentException("capacity must be non-negative.");
    }

    public static java.lang.Object[] aD(java.lang.Object[] objArr, int i2) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i2);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static java.util.Set aE(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("builder");
        }
        return ((defpackage.aolg) set).b();
    }

    public static java.util.Set aF(java.lang.Object obj) {
        java.util.Set setSingleton = java.util.Collections.singleton(obj);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static java.util.Set aG(java.lang.Object obj) {
        return obj != null ? aF(obj) : defpackage.aoke.a;
    }

    public static java.util.Set aH(java.util.Set set, java.lang.Iterable iterable) {
        java.util.LinkedHashSet linkedHashSet;
        defpackage.aooh.f(set, "<this>");
        defpackage.aooh.f(iterable, "elements");
        java.util.Collection<?> collectionBr = br(iterable);
        if (collectionBr.isEmpty()) {
            return cf(set);
        }
        if (collectionBr instanceof java.util.Set) {
            linkedHashSet = new java.util.LinkedHashSet();
            for (java.lang.Object obj : set) {
                if (!((java.util.Set) collectionBr).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(collectionBr);
        }
        return linkedHashSet;
    }

    public static java.util.Set aI(java.util.Set set, java.lang.Iterable iterable) {
        int size;
        if (set == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable == null) {
            defpackage.aooh.i("elements");
            defpackage.aooh.i("<this>");
        }
        java.lang.Integer numValueOf = iterable instanceof java.util.Collection ? java.lang.Integer.valueOf(((java.util.Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() << 1;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(aL(size));
        linkedHashSet.addAll(set);
        bv(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static java.util.Set aJ(java.util.Set set, java.lang.Object obj) {
        if (set == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(aL(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static java.lang.Object aK(java.util.Map map, java.lang.Object obj) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        if (map instanceof defpackage.aokl) {
            return ((defpackage.aokl) map).a();
        }
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException(defpackage.a.bg(obj, "Key ", " is missing in the map."));
    }

    public static int aL(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i2 / 0.75f) + 1.0f);
    }

    public static java.util.Map aM(defpackage.aoiu aoiuVar) {
        if (aoiuVar == null) {
            defpackage.aooh.i("pair");
        }
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(aoiuVar.a, aoiuVar.b);
        defpackage.aooh.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static java.lang.Object aN(java.util.Map map, java.lang.Object obj) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        return aK(map, obj);
    }

    public static java.util.Map aO(defpackage.aoiu... aoiuVarArr) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aL(aoiuVarArr.length));
        aV(linkedHashMap, aoiuVarArr);
        return linkedHashMap;
    }

    public static java.util.Map aP(defpackage.aoiu... aoiuVarArr) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aL(aoiuVarArr.length));
        aV(linkedHashMap, aoiuVarArr);
        return linkedHashMap;
    }

    public static java.util.Map aQ(java.util.Map map, java.util.Map map2) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        if (map2 == null) {
            defpackage.aooh.i("map");
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map aR(java.lang.Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return defpackage.aokd.a;
        }
        if (size == 1) {
            return aM((defpackage.aoiu) iterable.get(0));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aL(iterable.size()));
        aU(linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static java.util.Map aS(java.util.Map map) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        int size = map.size();
        if (size == 0) {
            return defpackage.aokd.a;
        }
        if (size != 1) {
            if (map == null) {
                defpackage.aooh.i("<this>");
            }
            return new java.util.LinkedHashMap(map);
        }
        if (map == null) {
            defpackage.aooh.i("<this>");
            map = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        defpackage.aooh.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static java.util.Map aT(java.util.Map map) {
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        return new java.util.LinkedHashMap(map);
    }

    public static void aU(java.util.Map map, java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.aoiu aoiuVar = (defpackage.aoiu) it.next();
            map.put(aoiuVar.a, aoiuVar.b);
        }
    }

    public static void aV(java.util.Map map, defpackage.aoiu[] aoiuVarArr) {
        for (defpackage.aoiu aoiuVar : aoiuVarArr) {
            map.put(aoiuVar.a, aoiuVar.b);
        }
    }

    public static java.util.List aW(java.util.Map map) {
        defpackage.aooh.f(map, "<this>");
        if (map.size() != 0) {
            java.util.Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!it.hasNext()) {
                    return aY(new defpackage.aoiu(entry.getKey(), entry.getValue()));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                arrayList.add(new defpackage.aoiu(entry.getKey(), entry.getValue()));
                do {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                    arrayList.add(new defpackage.aoiu(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return defpackage.aokc.a;
    }

    public static java.util.List aX(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("builder");
        }
        return ((defpackage.aokv) list).f();
    }

    public static java.util.List aY(java.lang.Object obj) {
        java.util.List listSingletonList = java.util.Collections.singletonList(obj);
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static int aZ(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        return list.size() - 1;
    }

    public static defpackage.ajtp aa(java.lang.String str, java.lang.String str2) {
        return defpackage.ajtp.d(new defpackage.ajyl(str, str2), defpackage.ajyl.class);
    }

    public static defpackage.ajtp ab(java.lang.String str, defpackage.ajym ajymVar) {
        defpackage.ajto ajtoVarC = defpackage.ajtp.c(defpackage.ajyl.class);
        ajtoVarC.b(new defpackage.ajtx(android.content.Context.class, 1, 0));
        ajtoVarC.c = new defpackage.ajyp(str, ajymVar, 1);
        return ajtoVarC.a();
    }

    public static void ac(defpackage.ajyk ajykVar, java.util.Map.Entry entry) {
        defpackage.alac alacVar = (defpackage.alac) entry.getKey();
        defpackage.alcr alcrVar = defpackage.alcr.DOUBLE;
        switch (alacVar.b.ordinal()) {
            case 0:
                ajykVar.r(alacVar.a, ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 1:
                ajykVar.v(alacVar.a, ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 2:
                ajykVar.y(alacVar.a, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 3:
                ajykVar.H(alacVar.a, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                ajykVar.x(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 5:
                ajykVar.u(alacVar.a, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ajykVar.t(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ajykVar.p(alacVar.a, ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ajykVar.F(alacVar.a, (java.lang.String) entry.getValue());
                break;
            case 9:
                ajykVar.w(alacVar.a, entry.getValue(), defpackage.albp.a.b(((defpackage.alad) entry.getValue()).getClass()));
                break;
            case 10:
                ajykVar.z(alacVar.a, entry.getValue(), defpackage.albp.a.b(((defpackage.alad) entry.getValue()).getClass()));
                break;
            case 11:
                ajykVar.q(alacVar.a, (defpackage.akzc) entry.getValue());
                break;
            case 12:
                ajykVar.G(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                ajykVar.x(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 14:
                ajykVar.B(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                ajykVar.C(alacVar.a, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 16:
                ajykVar.D(alacVar.a, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 17:
                ajykVar.E(alacVar.a, ((java.lang.Long) entry.getValue()).longValue());
                break;
        }
    }

    public static /* synthetic */ defpackage.ajyk ad(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.ajyk(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.ajyk ae(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.ajyk(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.ajyk af(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.ajyk(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ defpackage.ajyk ag(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.ajyk(akzxVar, (byte[]) null);
    }

    public static defpackage.apni ah(java.util.Map map, java.util.Map map2) {
        return new defpackage.apni(j$.util.DesugarCollections.unmodifiableMap(map), j$.util.DesugarCollections.unmodifiableMap(map2));
    }

    public static void ai(java.io.File file, byte[] bArr) throws java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            ak(fileOutputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ak(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static void aj(java.io.File file) {
        aomu aomuVar = new aomu(new aoqr(file, 1));
        while (true) {
            boolean z = true;
            while (aomuVar.hasNext()) {
                java.io.File file2 = (java.io.File) aomuVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (!z) {
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static void ak(java.io.Closeable closeable, java.lang.Throwable th) throws java.io.IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                aoil.b(th, th2);
            }
        }
    }

    public static int al(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static defpackage.aomi am(java.lang.Enum[] enumArr) {
        if (enumArr == null) {
            defpackage.aooh.i("entries");
        }
        return new defpackage.aomj(enumArr);
    }

    public static java.lang.Object an(defpackage.aonn aonnVar, java.lang.Object obj, defpackage.aoln aolnVar) {
        if (aonnVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aolr aolrVarU = aolnVar.u();
        aolz aolzVar = aolrVarU == defpackage.aols.a ? new aolz(aolnVar) : new defpackage.aoma(aolnVar, aolrVarU);
        defpackage.aoov.f(aonnVar, 2);
        return aonnVar.a(obj, aolzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.aoln ao(defpackage.aonn aonnVar, java.lang.Object obj, defpackage.aoln aolnVar) {
        if (aonnVar == 0) {
            defpackage.aooh.i("<this>");
        }
        if (aonnVar instanceof defpackage.aomb) {
            return ((defpackage.aomb) aonnVar).c(obj, aolnVar);
        }
        defpackage.aolr aolrVarU = aolnVar.u();
        return aolrVarU == defpackage.aols.a ? new defpackage.aolx(aolnVar, aonnVar, obj) : new defpackage.aoly(aolnVar, aolrVarU, aonnVar, obj);
    }

    public static defpackage.aoln ap(defpackage.aoln aolnVar) {
        if (aolnVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aomd aomdVar = aolnVar instanceof defpackage.aomd ? (defpackage.aomd) aolnVar : null;
        if (aomdVar != null && (aolnVar = aomdVar.B) == null) {
            defpackage.aolo aoloVar = (defpackage.aolo) aomdVar.u().get(defpackage.aolo.k);
            aolnVar = aoloVar != null ? aoloVar.f(aomdVar) : aomdVar;
            aomdVar.B = aolnVar;
        }
        return aolnVar;
    }

    public static defpackage.aolp aq(defpackage.aolp aolpVar, defpackage.aolq aolqVar) {
        defpackage.aooh.f(aolqVar, "key");
        if (defpackage.aooh.n(aolpVar.getKey(), aolqVar)) {
            return aolpVar;
        }
        return null;
    }

    public static defpackage.aolr ar(defpackage.aolp aolpVar, defpackage.aolq aolqVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("key");
        }
        return defpackage.aooh.n(aolpVar.getKey(), aolqVar) ? defpackage.aols.a : aolpVar;
    }

    public static defpackage.aolr as(defpackage.aolp aolpVar, defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return at(aolpVar, aolrVar);
    }

    public static defpackage.aolr at(defpackage.aolr aolrVar, defpackage.aolr aolrVar2) {
        if (aolrVar2 == null) {
            defpackage.aooh.i("context");
        }
        return aolrVar2 != defpackage.aols.a ? (defpackage.aolr) aolrVar2.fold(aolrVar, new defpackage.dkm(14)) : aolrVar;
    }

    public static int au(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static java.lang.Comparable av(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == null) {
            defpackage.aooh.i("a");
        }
        if (comparable2 == null) {
            defpackage.aooh.i("b");
        }
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static int aw(int i2) {
        if (i2 <= 0) {
            i2 = 1;
        }
        return java.lang.Integer.highestOneBit(i2 * 3);
    }

    public static int ax(java.lang.Object[] objArr, int i2, int i3) {
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            java.lang.Object obj = objArr[i2 + i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static java.lang.String ay(java.lang.Object[] objArr, int i2, int i3, java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i3 * 3) + 2);
        sb.append('[');
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i2 + i4];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void az(java.lang.Object[] objArr, int i2) {
        defpackage.aooh.f(objArr, "<this>");
        objArr[i2] = null;
    }

    public static java.lang.Comparable bA(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Comparable bB(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Iterable bC(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.aokh(new defpackage.acik(iterable, 12));
    }

    public static java.lang.Object bD(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable instanceof java.util.List) {
            return bE((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public static java.lang.Object bE(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static java.lang.Object bF(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            java.util.Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static java.lang.Object bG(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.lang.Object bH(java.util.List list, int i2) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static java.lang.Object bI(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Object bJ(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Object bK(java.lang.Iterable iterable, java.util.Comparator comparator) {
        defpackage.aooh.f(iterable, "<this>");
        defpackage.aooh.f(comparator, "comparator");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static java.lang.Object bL(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return bM((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            throw new java.lang.IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static java.lang.Object bM(java.util.List list) {
        defpackage.aooh.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new java.lang.IllegalArgumentException("List has more than one element.");
    }

    public static java.lang.Object bN(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static java.lang.Object bO(java.util.List list) {
        defpackage.aooh.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static java.util.List bP(java.lang.Iterable iterable, int i2) {
        java.util.ArrayList arrayList;
        defpackage.aooh.f(iterable, "<this>");
        defpackage.aooh.f(iterable, "<this>");
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i2, "size ", " must be greater than zero."));
        }
        if ((iterable instanceof java.util.RandomAccess) && (iterable instanceof java.util.List)) {
            java.util.List list = (java.util.List) iterable;
            int size = list.size();
            arrayList = new java.util.ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            int i3 = 0;
            while (i3 >= 0 && i3 < size) {
                int iU = defpackage.aooc.u(i2, size - i3);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(iU);
                for (int i4 = 0; i4 < iU; i4++) {
                    arrayList2.add(list.get(i4 + i3));
                }
                arrayList.add(arrayList2);
                i3 += i2;
            }
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            defpackage.aooh.f(it, "iterator");
            java.util.Iterator itE = !it.hasNext() ? defpackage.aokb.a : defpackage.aooc.e(new aokq(i2, i2, it, (defpackage.aoln) null));
            while (itE.hasNext()) {
                arrayList.add((java.util.List) itE.next());
            }
        }
        return arrayList;
    }

    public static java.util.List bQ(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        return bZ(ce(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List bR(java.lang.Iterable iterable, int i2) {
        java.util.ArrayList arrayList;
        java.lang.Object objBI;
        defpackage.aooh.f(iterable, "<this>");
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i2, "Requested element count ", " is less than zero."));
        }
        if (i2 == 0) {
            return bZ(iterable);
        }
        if (iterable instanceof java.util.Collection) {
            int size = iterable.size() - i2;
            if (size <= 0) {
                return defpackage.aokc.a;
            }
            if (size == 1) {
                defpackage.aooh.f(iterable, "<this>");
                if (iterable instanceof java.util.List) {
                    objBI = bI(iterable);
                } else {
                    java.util.Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new java.util.NoSuchElementException("Collection is empty.");
                    }
                    java.lang.Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objBI = next;
                }
                return aY(objBI);
            }
            arrayList = new java.util.ArrayList(size);
            if (iterable instanceof java.util.List) {
                if (iterable instanceof java.util.RandomAccess) {
                    int size2 = iterable.size();
                    while (i2 < size2) {
                        arrayList.add(iterable.get(i2));
                        i2++;
                    }
                } else {
                    java.util.ListIterator listIterator = iterable.listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        int i3 = 0;
        for (java.lang.Object obj : iterable) {
            if (i3 >= i2) {
                arrayList.add(obj);
            } else {
                i3++;
            }
        }
        return be(arrayList);
    }

    public static java.util.List bS(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        cp(iterable, arrayList);
        return arrayList;
    }

    public static java.util.List bT(java.util.Collection collection, java.lang.Iterable iterable) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable == null) {
            defpackage.aooh.i("elements");
        }
        if (!(iterable instanceof java.util.Collection)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            bv(arrayList, iterable);
            return arrayList;
        }
        java.util.Collection collection2 = (java.util.Collection) iterable;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static java.util.List bU(java.util.Collection collection, java.lang.Object obj) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List bV(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if ((iterable instanceof java.util.Collection) && iterable.size() <= 1) {
            return bZ(iterable);
        }
        java.util.List listCa = ca(iterable);
        java.util.Collections.reverse(listCa);
        return listCa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List bW(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listCa = ca(iterable);
            bn(listCa);
            return listCa;
        }
        if (iterable.size() <= 1) {
            return bZ(iterable);
        }
        java.lang.Object[] array = iterable.toArray(new java.lang.Comparable[0]);
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) array;
        if (comparableArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (comparableArr.length > 1) {
            java.util.Arrays.sort(comparableArr);
        }
        return cw(array);
    }

    public static java.util.List bX(java.lang.Iterable iterable, java.util.Comparator comparator) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (comparator == null) {
            defpackage.aooh.i("comparator");
        }
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listCa = ca(iterable);
            bo(listCa, comparator);
            return listCa;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return bZ(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        cx(array, comparator);
        if (array == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(array);
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List bY(java.lang.Iterable iterable, int i2) {
        if (iterable == 0) {
            defpackage.aooh.i("<this>");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i2, "Requested element count ", " is less than zero."));
        }
        if (i2 == 0) {
            return defpackage.aokc.a;
        }
        if (iterable instanceof java.util.Collection) {
            if (i2 >= iterable.size()) {
                return bZ(iterable);
            }
            if (i2 == 1) {
                java.util.List listSingletonList = java.util.Collections.singletonList(bD(iterable));
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                return listSingletonList;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        java.util.Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return be(arrayList);
    }

    public static java.util.List bZ(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (!(iterable instanceof java.util.Collection)) {
            return be(ca(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return defpackage.aokc.a;
        }
        if (size != 1) {
            if (collection == null) {
                defpackage.aooh.i("<this>");
            }
            return new java.util.ArrayList(collection);
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static java.util.ArrayList ba(java.lang.Object... objArr) {
        return new java.util.ArrayList(new defpackage.aojv(objArr, true));
    }

    public static java.util.List bb(java.lang.Object... objArr) {
        java.util.List listAsList = java.util.Arrays.asList(objArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static java.util.List bc(java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        di(objArr, arrayList);
        return arrayList;
    }

    public static java.util.List bd(java.lang.Object... objArr) {
        return new java.util.ArrayList(new defpackage.aojv(objArr, true));
    }

    public static java.util.List be(java.util.List list) {
        int size = list.size();
        if (size != 0) {
            return size == 1 ? aY(list.get(0)) : list;
        }
        return defpackage.aokc.a;
    }

    public static defpackage.aopq bf(java.util.Collection collection) {
        defpackage.aooh.f(collection, "<this>");
        return new defpackage.aopq(0, collection.size() - 1);
    }

    public static void bg() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static void bh() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static int bi(java.util.List list, int i2, defpackage.aonj aonjVar) {
        d(list.size(), i2);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iIntValue = ((java.lang.Number) aonjVar.a(list.get(i5))).intValue();
            if (iIntValue < 0) {
                i4 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static int bj(java.util.List list, java.lang.Comparable comparable, int i2) {
        d(list.size(), i2);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iAu = au((java.lang.Comparable) list.get(i5), comparable);
            if (iAu < 0) {
                i4 = i5 + 1;
            } else {
                if (iAu <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static void bk(int i2, java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
    }

    public static int bl(java.lang.Iterable iterable, int i2) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i2;
    }

    public static java.util.List bm(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bv(arrayList, (java.lang.Iterable) it.next());
        }
        return arrayList;
    }

    public static void bn(java.util.List list) {
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static void bo(java.util.List list, java.util.Comparator comparator) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (comparator == null) {
            defpackage.aooh.i("comparator");
        }
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }

    public static java.lang.Object bp(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static java.lang.Object bq(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        return list.remove(list.size() - 1);
    }

    public static java.util.Collection br(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : bZ(iterable);
    }

    public static boolean bs(java.lang.Iterable iterable, defpackage.aonj aonjVar, boolean z) {
        java.util.Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) aonjVar.a(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean bt(java.lang.Iterable iterable, defpackage.aonj aonjVar) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        return bs(iterable, aonjVar, true);
    }

    public static java.util.List bu(java.util.List list) {
        defpackage.aooh.f(list, "<this>");
        return new aokn(list);
    }

    public static void bv(java.util.Collection collection, java.lang.Iterable iterable) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable == null) {
            defpackage.aooh.i("elements");
        }
        if (iterable instanceof java.util.Collection) {
            collection.addAll((java.util.Collection) iterable);
            return;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void bw(java.util.List list, defpackage.aonj aonjVar) {
        int iAZ;
        defpackage.aooh.f(list, "<this>");
        defpackage.aooh.f(aonjVar, "predicate");
        if (!(list instanceof java.util.RandomAccess)) {
            defpackage.aooh.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if ((list instanceof defpackage.aoow) && !(list instanceof defpackage.aoox)) {
                defpackage.aoov.a(list, "kotlin.collections.MutableIterable");
            }
            bs(list, aonjVar, true);
            return;
        }
        int iAZ2 = aZ(list);
        int i2 = 0;
        if (iAZ2 >= 0) {
            int i3 = 0;
            while (true) {
                java.lang.Object obj = list.get(i2);
                if (!((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                    if (i3 != i2) {
                        list.set(i3, obj);
                    }
                    i3++;
                }
                if (i2 == iAZ2) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        }
        if (i2 >= list.size() || i2 > (iAZ = aZ(list))) {
            return;
        }
        while (true) {
            list.remove(iAZ);
            if (iAZ == i2) {
                return;
            } else {
                iAZ--;
            }
        }
    }

    public static void bx(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        if (list.isEmpty()) {
            return;
        }
        if (list == null) {
            defpackage.aooh.i("<this>");
        }
        list.remove(list.size() - 1);
    }

    public static int by(java.lang.Iterable iterable, java.lang.Object obj) {
        defpackage.aooh.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i2 < 0) {
                bh();
            }
            if (defpackage.aooh.n(obj, obj2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int bz(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((java.lang.Number) it.next()).intValue();
        }
        return iIntValue;
    }

    private static boolean c(android.content.Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static java.lang.Object[] cA(java.lang.Object[] objArr, int i2, int i3) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        ct(i3, objArr.length);
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, i2, i3);
        defpackage.aooh.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static java.lang.Object[] cB(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        defpackage.aooh.c(objArrCopyOf);
        return objArrCopyOf;
    }

    public static java.lang.Object[] cC(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = objArr2.length;
        int length2 = objArr.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length2 + length);
        java.lang.System.arraycopy(objArr2, 0, objArrCopyOf, length2, length);
        if (objArrCopyOf == null) {
            defpackage.aooh.g();
        }
        return objArrCopyOf;
    }

    public static int cD(float[] fArr) {
        defpackage.aooh.f(fArr, "<this>");
        return fArr.length - 1;
    }

    public static int cE(int[] iArr) {
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        return iArr.length - 1;
    }

    public static int cF(long[] jArr) {
        defpackage.aooh.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int cG(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        return objArr.length - 1;
    }

    public static int cH(byte[] bArr, byte b) {
        defpackage.aooh.f(bArr, "<this>");
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b == bArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int cI(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i2 == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public static int cJ(java.lang.Object[] objArr, java.lang.Object obj) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
        } else {
            int length2 = objArr.length;
            while (i2 < length2) {
                if (defpackage.aooh.n(obj, objArr[i2])) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public static int cK(int[] iArr) {
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = iArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i2 = iArr[0];
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        int i3 = length - 1;
        if (i3 > 0) {
            int i4 = 1;
            while (true) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    i2 = i5;
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2;
    }

    public static int cL(int[] iArr) {
        defpackage.aooh.f(iArr, "<this>");
        if (iArr.length == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i2 = iArr[0];
        int iCE = cE(iArr);
        if (iCE > 0) {
            int i3 = 1;
            while (true) {
                int i4 = iArr[i3];
                if (i2 > i4) {
                    i2 = i4;
                }
                if (i3 == iCE) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public static int cM(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static java.lang.Iterable cN(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        return objArr.length == 0 ? defpackage.aokc.a : new defpackage.aojz(objArr);
    }

    public static java.lang.Object cO(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.lang.Object cP(java.lang.Object[] objArr, int i2) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static java.lang.Object cQ(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[cG(objArr)];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.util.List cR(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        di(objArr, arrayList);
        return arrayList;
    }

    public static java.util.List cS(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? cV(iArr) : aY(java.lang.Integer.valueOf(iArr[0]));
        }
        return defpackage.aokc.a;
    }

    public static java.util.List cT(long[] jArr) {
        defpackage.aooh.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return defpackage.aokc.a;
        }
        if (length == 1) {
            return aY(java.lang.Long.valueOf(jArr[0]));
        }
        defpackage.aooh.f(jArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (long j : jArr) {
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    public static java.util.List cU(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = objArr.length;
        if (length == 0) {
            return defpackage.aokc.a;
        }
        if (length == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(objArr[0]);
            defpackage.aooh.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        if (objArrCopyOf == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(objArrCopyOf);
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static java.util.List cV(int[] iArr) {
        defpackage.aooh.f(iArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static java.util.Set cW(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        int length = objArr.length;
        if (length == 0) {
            return defpackage.aoke.a;
        }
        if (length != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(aL(length));
            dk(objArr, linkedHashSet);
            return linkedHashSet;
        }
        java.util.Set setSingleton = java.util.Collections.singleton(objArr[0]);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static defpackage.aopq cX(int[] iArr) {
        return new defpackage.aopq(0, cE(iArr));
    }

    public static boolean cY(java.lang.Object[] objArr, java.lang.Object obj) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        return cJ(objArr, obj) >= 0;
    }

    public static void cZ(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        if (bArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (bArr2 == null) {
            defpackage.aooh.i("destination");
        }
        java.lang.System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    public static java.util.List ca(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return cb((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        cs(iterable, arrayList);
        return arrayList;
    }

    public static java.util.List cb(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        return new java.util.ArrayList(collection);
    }

    public static java.util.List cc(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        defpackage.aooh.f(iterable, "<this>");
        defpackage.aooh.f(iterable2, "other");
        java.util.Iterator it = iterable.iterator();
        java.util.Iterator it2 = iterable2.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(bl(iterable, 10), bl(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new defpackage.aoiu(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static java.util.Set cd(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable2 == null) {
            defpackage.aooh.i("other");
        }
        java.util.Collection collectionBr = br(iterable2);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : iterable) {
            if (collectionBr.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set ce(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable instanceof java.util.Collection) {
            return new java.util.LinkedHashSet((java.util.Collection) iterable);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        cs(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Set cf(java.lang.Iterable iterable) {
        if (iterable == 0) {
            defpackage.aooh.i("<this>");
        }
        if (iterable instanceof java.util.Collection) {
            int size = iterable.size();
            if (size == 0) {
                return defpackage.aoke.a;
            }
            if (size != 1) {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(aL(iterable.size()));
                cs(iterable, linkedHashSet);
                return linkedHashSet;
            }
            java.util.Set setSingleton = java.util.Collections.singleton(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next());
            defpackage.aooh.e(setSingleton, "singleton(...)");
            return setSingleton;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        cs(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return defpackage.aoke.a;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        java.util.Set setSingleton2 = java.util.Collections.singleton(linkedHashSet2.iterator().next());
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        return setSingleton2;
    }

    public static java.util.Set cg(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable2 == null) {
            defpackage.aooh.i("other");
        }
        java.util.Set setCe = ce(iterable);
        bv(setCe, iterable2);
        return setCe;
    }

    public static defpackage.aoql ch(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "<this>");
        return new aoka(iterable, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean ci(java.lang.Iterable iterable) {
        if (iterable == 0) {
            defpackage.aooh.i("<this>");
        }
        if (iterable instanceof java.util.Collection) {
            return !iterable.isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    public static boolean cj(java.lang.Iterable iterable, java.lang.Object obj) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).contains(obj);
        }
        return by(iterable, obj) >= 0;
    }

    public static byte[] ck(java.util.Collection collection) {
        defpackage.aooh.f(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = ((java.lang.Number) it.next()).byteValue();
            i2++;
        }
        return bArr;
    }

    public static float[] cl(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        float[] fArr = new float[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = ((java.lang.Number) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    public static int[] cm(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("<this>");
        }
        int[] iArr = new int[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((java.lang.Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static long[] cn(java.util.Collection collection) {
        defpackage.aooh.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((java.lang.Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static java.util.List co(java.util.List list) {
        defpackage.aooh.f(list, "<this>");
        return bY(list, defpackage.aooc.t(list.size() - 1, 0));
    }

    public static void cp(java.lang.Iterable iterable, java.util.Collection collection) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        for (java.lang.Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static void cq(java.lang.Iterable iterable, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i2, java.lang.CharSequence charSequence4, defpackage.aonj aonjVar) throws java.io.IOException {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (charSequence == null) {
            defpackage.aooh.i("separator");
        }
        if (charSequence2 == null) {
            defpackage.aooh.i("prefix");
        }
        if (charSequence3 == null) {
            defpackage.aooh.i("postfix");
        }
        if (charSequence4 == null) {
            defpackage.aooh.i("truncated");
        }
        appendable.append(charSequence2);
        int i3 = 0;
        for (java.lang.Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > 0) {
                i2 = 0;
                break;
            }
            defpackage.aoov.k(appendable, obj, aonjVar);
        }
        if (i2 >= 0 && i3 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ java.lang.String cr(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.aonj aonjVar, int i2) throws java.io.IOException {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        if (1 == (i2 & 1)) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence4 = charSequence;
        if (charSequence4 == null) {
            defpackage.aooh.i("separator");
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        if (charSequence5 == null) {
            defpackage.aooh.i("prefix");
        }
        java.lang.CharSequence charSequence6 = (i2 & 4) != 0 ? "" : charSequence3;
        if (charSequence6 == null) {
            defpackage.aooh.i("postfix");
        }
        java.lang.CharSequence charSequence7 = (i2 & 16) != 0 ? "..." : null;
        if (charSequence7 == null) {
            defpackage.aooh.i("truncated");
        }
        int i3 = i2 & 32;
        int i4 = i2 & 8;
        defpackage.aonj aonjVar2 = i3 != 0 ? null : aonjVar;
        int i5 = i4 != 0 ? -1 : 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cq(iterable, sb, charSequence4, charSequence5, charSequence6, i5, charSequence7, aonjVar2);
        return sb.toString();
    }

    public static void cs(java.lang.Iterable iterable, java.util.Collection collection) {
        if (iterable == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void ct(int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bA(i3, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean cu(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length == objArr2.length) {
            for (int i2 = 0; i2 < length; i2++) {
                java.lang.Object obj = objArr[i2];
                java.lang.Object obj2 = objArr2[i2];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                            if (!cu((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if (!(obj instanceof boolean[]) || !(obj2 instanceof boolean[])) {
                            if ((obj instanceof aoja) && (obj2 instanceof aoja)) {
                                throw null;
                            }
                            if ((obj instanceof aojf) && (obj2 instanceof aojf)) {
                                throw null;
                            }
                            if ((obj instanceof aojb) && (obj2 instanceof aojb)) {
                                throw null;
                            }
                            if ((obj instanceof aojd) && (obj2 instanceof aojd)) {
                                throw null;
                            }
                            if (defpackage.aooh.n(obj, obj2)) {
                            }
                        } else if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static java.util.List cv(byte[] bArr) {
        defpackage.aooh.f(bArr, "<this>");
        return new aojx(bArr);
    }

    public static java.util.List cw(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.List listAsList = java.util.Arrays.asList(objArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static void cx(java.lang.Object[] objArr, java.util.Comparator comparator) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (comparator == null) {
            defpackage.aooh.i("comparator");
        }
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static byte[] cy(byte[] bArr, int i2, int i3) {
        defpackage.aooh.f(bArr, "<this>");
        ct(i3, bArr.length);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i2, i3);
        defpackage.aooh.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static int[] cz(int[] iArr, int[] iArr2) {
        defpackage.aooh.f(iArr, "<this>");
        defpackage.aooh.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + length2);
        java.lang.System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        defpackage.aooh.c(iArrCopyOf);
        return iArrCopyOf;
    }

    private static void d(int i2, int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i3, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i3 > i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bA(i2, i3, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void dA(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
        }
    }

    public static void dB(java.lang.Object obj) {
        obj.getClass();
    }

    public static java.lang.Object dC(android.content.Context context) {
        android.content.ComponentCallbacks2 componentCallbacks2AA = defpackage.anty.aA(context.getApplicationContext());
        boolean z = componentCallbacks2AA instanceof defpackage.amyp;
        java.lang.Object[] objArr = {componentCallbacks2AA.getClass()};
        if (z) {
            return ((defpackage.amyp) componentCallbacks2AA).B();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }

    public static defpackage.eoe dD(defpackage.mp mpVar, defpackage.eoe eoeVar) {
        return ((defpackage.amxb) defpackage.aooc.ar(mpVar, defpackage.amxb.class)).j().a(eoeVar);
    }

    public static defpackage.eoe dE(defpackage.aw awVar, defpackage.eoe eoeVar) {
        return ((defpackage.amxc) defpackage.aooc.ar(awVar, defpackage.amxc.class)).du().a(eoeVar);
    }

    public static void dF() {
        if (a == null) {
            a = android.os.Looper.getMainLooper().getThread();
        }
        if (java.lang.Thread.currentThread() != a) {
            throw new java.lang.IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static ammt dG(java.lang.String str, ammp ammpVar, amms ammsVar, ammw ammwVar) {
        boolean z = true;
        if (!defpackage.ahvr.r("PUT", "put") && !defpackage.ahvr.r("PUT", "post")) {
            z = false;
        }
        defpackage.ahvr.bM(z);
        ammsVar.d();
        ammsVar.d();
        return new ammr(str, ammpVar, ammsVar);
    }

    public static defpackage.akzm dH(j$.time.Duration duration) {
        return defpackage.aldf.f(duration.getSeconds(), duration.getNano());
    }

    public static defpackage.alcf dI(j$.time.Instant instant) {
        return defpackage.aldi.f(instant.getEpochSecond(), instant.getNano());
    }

    public static j$.time.Duration dJ(defpackage.akzm akzmVar) {
        defpackage.akzm akzmVarF = defpackage.aldf.f(akzmVar.b, akzmVar.c);
        return j$.time.Duration.ofSeconds(akzmVarF.b, akzmVarF.c);
    }

    public static j$.time.Instant dK(defpackage.alcf alcfVar) {
        defpackage.alcf alcfVarF = defpackage.aldi.f(alcfVar.b, alcfVar.c);
        return j$.time.Instant.ofEpochSecond(alcfVarF.b, alcfVarF.c);
    }

    public static /* synthetic */ long dL(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j3 = j * j2;
            if (j == 0 || j3 / j == j2) {
                return j3;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static void da(float[] fArr, float[] fArr2, int i2, int i3, int i4) {
        if (fArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (fArr2 == null) {
            defpackage.aooh.i("destination");
        }
        java.lang.System.arraycopy(fArr, i3, fArr2, i2, i4 - i3);
    }

    public static void db(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if (iArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (iArr2 == null) {
            defpackage.aooh.i("destination");
        }
        java.lang.System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void dc(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        defpackage.aooh.f(jArr, "<this>");
        defpackage.aooh.f(jArr2, "destination");
        java.lang.System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
    }

    public static void dd(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i2, int i3, int i4) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (objArr2 == null) {
            defpackage.aooh.i("destination");
        }
        java.lang.System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void de(float[] fArr, float[] fArr2, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = fArr.length;
        }
        da(fArr, fArr2, 0, 0, i2);
    }

    public static /* synthetic */ void df(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        db(iArr, iArr2, i2, 0, i3);
    }

    public static /* synthetic */ void dh(long[] jArr, long j) {
        int length = jArr.length;
        if (jArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(jArr, 0, length, j);
    }

    public static void di(java.lang.Object[] objArr, java.util.Collection collection) {
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static /* synthetic */ java.lang.String dj(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.aonj aonjVar, int i2) throws java.io.IOException {
        defpackage.aooh.f(objArr, "<this>");
        if (1 == (i2 & 1)) {
            charSequence = ", ";
        }
        defpackage.aooh.f(charSequence, "separator");
        java.lang.String str = (i2 & 16) != 0 ? "..." : null;
        defpackage.aooh.f(str, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.aooh.f(objArr, "<this>");
        defpackage.aooh.f(charSequence, "separator");
        defpackage.aooh.f(str, "truncated");
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        sb.append(charSequence2);
        int length = objArr.length;
        byte b = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte b2 = (i2 & 8) != 0 ? (byte) -1 : (byte) 0;
            if (i3 >= length) {
                b = b2;
                break;
            }
            java.lang.Object obj = objArr[i3];
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (b2 >= 0 && i4 > 0) {
                break;
            }
            defpackage.aoov.k(sb, obj, (i2 & 32) != 0 ? null : aonjVar);
            i3++;
        }
        if (b >= 0 && i4 > 0) {
            sb.append((java.lang.CharSequence) str);
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static void dk(java.lang.Object[] objArr, java.util.Collection collection) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        for (java.lang.Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void dl(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        dd(objArr, objArr2, 0, i2, i3);
    }

    public static void dm(java.lang.Object[] objArr, int i2, int i3) {
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, i2, i3, (java.lang.Object) null);
    }

    public static /* synthetic */ void dn(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, 0, length, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static int m0do(int i2, int i3) {
        int i4 = i2 + (i2 >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if ((-2147483639) + i4 > 0) {
            return i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i4;
    }

    public static java.util.List dp(java.lang.Class cls, java.util.Iterator it, defpackage.ahzi ahziVar, defpackage.anqs anqsVar) {
        if (!(it instanceof java.util.ListIterator)) {
            try {
                java.lang.Class.forName("android.app.Application", false, cls.getClassLoader());
                java.lang.Iterable<java.lang.Class> iterable = (java.lang.Iterable) ahziVar.eZ();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Class cls2 : iterable) {
                    java.lang.Object objNewInstance = null;
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (java.lang.ClassCastException unused) {
                    } catch (java.lang.Throwable th) {
                        throw new java.util.ServiceConfigurationError(java.lang.String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } catch (java.lang.Exception unused2) {
                if (!it.hasNext()) {
                    it = java.util.ServiceLoader.load(cls).iterator();
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            anqsVar.b(next);
            arrayList2.add(next);
        }
        java.util.Collections.sort(arrayList2, java.util.Collections.reverseOrder(new defpackage.anqr(anqsVar)));
        return j$.util.DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean dq(java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void dr() {
        java.util.Iterator it = defpackage.apnf.j().h().iterator();
        while (it.hasNext()) {
            ((anml) it.next()).a();
        }
    }

    public static defpackage.anmc ds(defpackage.anmc anmcVar, java.util.List list) {
        if (anmcVar == null) {
            throw new java.lang.NullPointerException("channel");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            anmcVar = new defpackage.anmf(anmcVar, (defpackage.anme) it.next());
        }
        return anmcVar;
    }

    public static defpackage.anmc dt(defpackage.anmc anmcVar, defpackage.anme... anmeVarArr) {
        return ds(anmcVar, java.util.Arrays.asList(anmeVarArr));
    }

    public static /* synthetic */ defpackage.albh dz() {
        try {
            return (defpackage.alfc) defpackage.alad.y(defpackage.alfc.a, android.util.Base64.decode("CgJBVQoCQ0EKAkdCCgJJRQoCSU4KAkpQCgJVUw", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static defpackage.ajel g(java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.Map map5, java.util.Map map6, java.util.Map map7) {
        return new defpackage.ajmr(map, map2, map3, new defpackage.ajms(map4, map5, map6, map7));
    }

    public static void h(java.lang.Class cls, defpackage.ajlq ajlqVar, java.util.Map map) {
        if (map.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bJ(cls, "KeyCreator for ", " already added."));
        }
        map.put(cls, ajlqVar);
    }

    public static void i(java.lang.String str, ajmt ajmtVar, java.util.Map map) {
        if (map.containsKey(str)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bk(str, "KeyParser for ", " already added."));
        }
        map.put(str, ajmtVar);
    }

    public static void j(java.lang.Class cls, ajmu ajmuVar, java.util.Map map) {
        if (map.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bJ(cls, "KeySerializer for ", " already added."));
        }
        map.put(cls, ajmuVar);
    }

    public static void k(java.lang.String str, defpackage.ajmv ajmvVar, java.util.Map map) {
        if (map.containsKey(str)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bk(str, "ParametersParser for ", " already added."));
        }
        map.put(str, ajmvVar);
    }

    public static void l(java.lang.Class cls, defpackage.ajmw ajmwVar, java.util.Map map) {
        if (map.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bJ(cls, "ParametersSerializer for ", " already added."));
        }
        map.put(cls, ajmwVar);
    }

    public static void m(defpackage.ajmn ajmnVar, java.lang.Class cls, java.lang.Class cls2, java.util.Map map) {
        ajmx ajmxVar = new ajmx(cls, cls2);
        if (!map.containsKey(ajmxVar)) {
            map.put(ajmxVar, new defpackage.ajmo(cls, cls2, ajmnVar));
            return;
        }
        throw new java.lang.IllegalArgumentException("PrimitiveConstructor for " + cls.toString() + " and primitive " + cls2.toString() + " already added.");
    }

    public static void n(java.lang.Class cls, java.lang.Class cls2, ajmy ajmyVar, java.util.Map map) {
        if (map.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bJ(cls, "PrimitiveWrapper for ", " already added."));
        }
        map.put(cls, new apjb(cls2, ajmyVar));
    }

    public static com.google.firebase.components.ComponentRegistrar o(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            if (com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (com.google.firebase.components.ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new defpackage.ajub(java.lang.String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.w("ComponentDiscovery", java.lang.String.format("Class %s was not found.", str));
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new defpackage.ajub(java.lang.String.format("Could not instantiate %s.", str), e);
        } catch (java.lang.InstantiationException e2) {
            throw new defpackage.ajub(java.lang.String.format("Could not instantiate %s.", str), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new defpackage.ajub(java.lang.String.format("Could not instantiate %s", str), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new defpackage.ajub(java.lang.String.format("Could not instantiate %s", str), e4);
        }
    }

    public static defpackage.ajwe p(defpackage.ajtq ajtqVar, java.lang.Class cls) {
        return ajtqVar.a(new defpackage.ajui(defpackage.ajuh.class, cls));
    }

    public static java.lang.Object q(defpackage.ajtq ajtqVar, defpackage.ajui ajuiVar) {
        defpackage.ajwe ajweVarA = ajtqVar.a(ajuiVar);
        if (ajweVarA == null) {
            return null;
        }
        return ajweVarA.a();
    }

    public static java.lang.Object r(defpackage.ajtq ajtqVar, java.lang.Class cls) {
        return q(ajtqVar, new defpackage.ajui(defpackage.ajuh.class, cls));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajtz */
    public static java.util.Set s(defpackage.ajtq ajtqVar, java.lang.Class cls) throws ajtz {
        defpackage.ajui ajuiVar = new defpackage.ajui(defpackage.ajuh.class, cls);
        defpackage.ajuk ajukVar = (defpackage.ajuk) ajtqVar;
        if (ajukVar.a.contains(ajuiVar)) {
            return (java.util.Set) ajukVar.b.c(ajuiVar).a();
        }
        throw new ajtz(java.lang.String.format("Attempting to request an undeclared dependency Set<%s>.", ajuiVar));
    }

    public static void t(java.lang.Enum r0, java.lang.Object obj, java.util.Map map, java.util.Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static boolean u(int i2) {
        java.lang.Boolean bool;
        if (i2 - 1 != 0) {
            if (!defpackage.ajir.a()) {
                return true;
            }
            try {
                bool = (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (java.lang.Exception unused) {
                defpackage.ajir.a.logp(java.util.logging.Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = java.lang.Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return true;
            }
        } else if (!defpackage.ajir.a()) {
            return true;
        }
        return false;
    }

    public static defpackage.ajjr v(defpackage.ajjp ajjpVar, defpackage.ajjo ajjoVar, defpackage.ajjm ajjmVar, defpackage.ajjq ajjqVar) throws java.security.GeneralSecurityException {
        if (!ajjpVar.equals(defpackage.ajjp.g) || ajjoVar.equals(defpackage.ajjo.a)) {
            return new defpackage.ajjr(ajjpVar, ajjoVar, ajjmVar, ajjqVar);
        }
        throw new java.security.GeneralSecurityException("Only SHA256 KDF is supported with X-Wing KEM");
    }

    public static android.content.SharedPreferences w(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void x(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        if (w(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        boolean z = true;
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        new rrq(context, z, new defpackage.zzx((char[]) null), 6).run();
    }

    public static boolean y(android.content.Context context) {
        return android.os.Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static java.lang.String z(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public void a(defpackage.anty antyVar, defpackage.anph anphVar) {
        throw null;
    }

    public boolean dU() {
        return false;
    }

    public boolean du() {
        return true;
    }

    public ajsz(byte[] bArr) {
        this();
    }

    public ajsz(float[] fArr) {
    }

    public void dw() {
    }

    public void dx(int i2) {
    }

    public void dy(java.lang.Object obj) {
    }

    public void dv(java.lang.String str, java.lang.Throwable th) {
    }
}
