package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqw {
    public final defpackage.ajct c;
    public final defpackage.ssr d;
    public final defpackage.ruc e;
    private final android.content.Context g;
    private final defpackage.ojo h;
    private final defpackage.oko i;
    private final defpackage.rlv j;
    private final defpackage.rsr k;
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/cp2/SingleNumberLookup");
    private static final java.lang.String[] f = {"display_name", "photo_thumb_uri", "photo_uri", "photo_id", "type", "label", "contact_id", "lookup", "starred", "number", "normalized_number", "data_id"};
    public static final defpackage.aenj b = new defpackage.aenj("SingleNumberLookup");

    public sqw(android.content.Context context, defpackage.ajct ajctVar, defpackage.ssr ssrVar, defpackage.ruc rucVar, defpackage.ojo ojoVar, defpackage.oko okoVar, defpackage.rsr rsrVar, defpackage.rlv rlvVar) {
        this.g = context;
        this.c = ajctVar;
        this.d = ssrVar;
        this.e = rucVar;
        this.h = ojoVar;
        this.i = okoVar;
        this.k = rsrVar;
        this.j = rlvVar;
    }

    private final android.database.Cursor b(java.lang.String str) {
        return this.h.b(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, android.net.Uri.encode(str)), f, null, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e5 A[Catch: all -> 0x04c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02fd A[Catch: all -> 0x04c4, TRY_ENTER, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0311 A[Catch: all -> 0x04c4, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0325 A[Catch: all -> 0x04c4, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0337 A[Catch: all -> 0x04c4, TRY_LEAVE, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0360 A[Catch: all -> 0x04c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0397 A[Catch: all -> 0x04c4, TRY_ENTER, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x03dc A[Catch: all -> 0x04c4, TRY_LEAVE, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x0446  */
    /* JADX WARN: Code duplicated, block: B:147:0x0450 A[Catch: all -> 0x0494, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0494, blocks: (B:137:0x0435, B:147:0x0450, B:155:0x0481), top: B:245:0x0435 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0476  */
    /* JADX WARN: Code duplicated, block: B:155:0x0481 A[Catch: all -> 0x0494, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0494, blocks: (B:137:0x0435, B:147:0x0450, B:155:0x0481), top: B:245:0x0435 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x049e A[Catch: all -> 0x04b4, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x04b4, blocks: (B:145:0x044a, B:153:0x0477, B:163:0x049e), top: B:242:0x044a }] */
    /* JADX WARN: Code duplicated, block: B:194:0x04f9 A[LOOP:0: B:72:0x01c7->B:194:0x04f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x04b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0419 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[Catch: RuntimeException -> 0x0542, SYNTHETIC, TRY_LEAVE, TryCatch #14 {RuntimeException -> 0x0542, blocks: (B:192:0x04f5, B:212:0x0541, B:211:0x053e, B:208:0x0539), top: B:247:0x013a, inners: #20 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169 A[Catch: RuntimeException -> 0x016e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x016e, blocks: (B:7:0x0035, B:9:0x003d, B:12:0x0062, B:13:0x006c, B:15:0x0072, B:17:0x0088, B:18:0x0090, B:20:0x0098, B:22:0x00b4, B:24:0x00ba, B:26:0x00d0, B:28:0x00da, B:29:0x00dd, B:30:0x00e0, B:32:0x00ea, B:34:0x00f0, B:35:0x00f3, B:37:0x0105, B:39:0x0111, B:43:0x011a, B:45:0x011e, B:47:0x0124, B:49:0x0129, B:48:0x0127, B:62:0x0169), top: B:230:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0175 A[Catch: all -> 0x0530, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0530, blocks: (B:60:0x0163, B:67:0x0175), top: B:234:0x0163 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[Catch: all -> 0x0251, TryCatch #8 {all -> 0x0251, blocks: (B:74:0x01d1, B:76:0x01d7, B:78:0x021d, B:80:0x0223), top: B:236:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0259  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02cd A[Catch: all -> 0x04c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x04c4, blocks: (B:91:0x02b5, B:99:0x02cd, B:102:0x02e5, B:105:0x02fd, B:107:0x0311, B:110:0x0325, B:112:0x0337, B:117:0x0360, B:121:0x0397, B:125:0x03dc, B:130:0x03fa, B:178:0x04c1, B:177:0x04be, B:148:0x046d, B:166:0x04ae), top: B:224:0x02b5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [aift] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r44v0, types: [sqw] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    public final java.util.Set a(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.String str3;
        java.lang.RuntimeException runtimeException;
        ?? r2;
        ?? r3;
        android.database.Cursor cursorB;
        akgu akguVarA;
        java.lang.Throwable th;
        android.database.Cursor cursor;
        java.util.TreeSet treeSet;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int i;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        java.util.TreeSet treeSet2;
        int columnIndexOrThrow8;
        java.lang.String str4;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        java.lang.String str5;
        int columnIndexOrThrow11;
        java.lang.String str6;
        int columnIndexOrThrow12;
        ?? r4;
        java.lang.String string;
        int i2;
        hkd hkdVarR;
        int i3;
        java.util.TreeSet treeSet3;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        int i4;
        int i5;
        java.lang.String string6;
        int i6;
        long j;
        defpackage.akzx akzxVarM;
        j$.util.Optional optionalBU;
        rhb rhbVar;
        long j2;
        java.lang.RuntimeException runtimeException2;
        android.database.Cursor cursorB2;
        java.lang.Throwable th2;
        java.lang.String string7;
        ?? r5 = str;
        java.util.TreeSet treeSet4 = new java.util.TreeSet(j$.util.Comparator.-EL.thenComparing(j$.util.Comparator.-CC.comparing(new rat(12)), new rat(13)));
        if (!android.text.TextUtils.isEmpty(r5)) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    try {
                        if (this.i.aa()) {
                            defpackage.rlv rlvVar = this.j;
                            rlvVar.o(defpackage.rmx.MULTI_FORMAT_PHONE_LOOKUP_QUERIED);
                            defpackage.rsr rsrVar = this.k;
                            defpackage.aooh.f(r5, "number");
                            defpackage.aooh.f(str2, "regionCodeForNumber");
                            ?? aiftVar = new defpackage.aift(4);
                            aiftVar.i(r5);
                            boolean zAd = defpackage.aoov.ad(r5, "+");
                            if (zAd) {
                                java.lang.String strSubstring = r5.substring(1);
                                defpackage.aooh.e(strSubstring, "substring(...)");
                                aiftVar.i(strSubstring);
                            }
                            if (str2.length() > 0) {
                                defpackage.akfg akfgVarA = defpackage.akfg.a(str2);
                                akfx akfxVarAI = ((defpackage.aogc) rsrVar.a).aI();
                                java.lang.String strValueOf = java.lang.String.valueOf(akfxVarAI.b(akfgVarA));
                                if (zAd) {
                                    strValueOf = "+".concat(java.lang.String.valueOf(strValueOf));
                                }
                                java.lang.String str10 = strValueOf;
                                if (defpackage.aoov.ad(r5, str10)) {
                                    java.lang.String strSubstring2 = r5.substring(str10.length());
                                    defpackage.aooh.e(strSubstring2, "substring(...)");
                                    aiftVar.i(strSubstring2);
                                    if (((java.lang.Boolean) rsrVar.b.a()).booleanValue() && (akguVarA = orv.a(akfxVarAI, (java.lang.String) r5, akfgVarA)) != null) {
                                        java.lang.String strX = akfxVarAI.x(akguVarA, 3);
                                        defpackage.aooh.e(strX, "format(...)");
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        int length = strX.length();
                                        for (int i7 = 0; i7 < length; i7++) {
                                            char cCharAt = strX.charAt(i7);
                                            if (java.lang.Character.isDigit(cCharAt)) {
                                                sb.append(cCharAt);
                                            }
                                        }
                                        java.lang.String string8 = sb.toString();
                                        if (string8.length() > 0 && !defpackage.aooh.n(string8, strSubstring2)) {
                                            aiftVar.i(string8);
                                        }
                                    }
                                }
                            }
                            defpackage.aify aifyVarG = aiftVar.g();
                            defpackage.aooh.e(aifyVarG, "build(...)");
                            int i8 = ((defpackage.aike) aifyVarG).d;
                            cursorB = null;
                            int i9 = 0;
                            while (i9 < i8) {
                                ?? r8 = (java.lang.String) aifyVarG.get(i9);
                                android.database.Cursor cursorB3 = b(r8);
                                i9++;
                                if (cursorB3 != null && cursorB3.getCount() > 0) {
                                    rlvVar.o(r8.equals(r5) ? defpackage.rmx.MULTI_FORMAT_PHONE_LOOKUP_ORIGINAL_NUMBER_SUCCESSFUL : defpackage.rmx.MULTI_FORMAT_PHONE_LOOKUP_MODIFIED_NUMBER_SUCCESSFUL);
                                    cursorB = cursorB3;
                                    break;
                                }
                                cursorB = cursorB3;
                            }
                        } else {
                            cursorB = b(str);
                        }
                        try {
                            if (cursorB == null) {
                                try {
                                    if (cursorB.moveToFirst()) {
                                        columnIndexOrThrow = cursorB.getColumnIndexOrThrow("display_name");
                                        columnIndexOrThrow2 = cursorB.getColumnIndexOrThrow("photo_thumb_uri");
                                        columnIndexOrThrow3 = cursorB.getColumnIndexOrThrow("photo_uri");
                                        columnIndexOrThrow4 = cursorB.getColumnIndexOrThrow("photo_id");
                                        columnIndexOrThrow5 = cursorB.getColumnIndexOrThrow("type");
                                        i = 1;
                                        columnIndexOrThrow6 = cursorB.getColumnIndexOrThrow("label");
                                        str3 = "SingleNumberLookup.java";
                                        try {
                                            columnIndexOrThrow7 = cursorB.getColumnIndexOrThrow("contact_id");
                                            treeSet2 = treeSet4;
                                            try {
                                                columnIndexOrThrow8 = cursorB.getColumnIndexOrThrow("lookup");
                                                str4 = "null cursor";
                                                columnIndexOrThrow9 = cursorB.getColumnIndexOrThrow("starred");
                                                columnIndexOrThrow10 = cursorB.getColumnIndexOrThrow("number");
                                                str5 = "com/android/dialer/phonelookup/cp2/SingleNumberLookup";
                                                columnIndexOrThrow11 = cursorB.getColumnIndexOrThrow("normalized_number");
                                                str6 = "0";
                                                columnIndexOrThrow12 = cursorB.getColumnIndexOrThrow("data_id");
                                                r4 = r5;
                                                treeSet2 = treeSet2;
                                                while (true) {
                                                    string = cursorB.getString(columnIndexOrThrow10);
                                                    if (android.text.TextUtils.isEmpty(r4)) {
                                                        i2 = columnIndexOrThrow10;
                                                        string2 = cursorB.getString(columnIndexOrThrow11);
                                                        string3 = cursorB.getString(columnIndexOrThrow);
                                                        string4 = cursorB.getString(columnIndexOrThrow2);
                                                        string5 = cursorB.getString(columnIndexOrThrow3);
                                                        i4 = cursorB.getInt(columnIndexOrThrow4);
                                                        i5 = cursorB.getInt(columnIndexOrThrow5);
                                                        java.lang.String string9 = cursorB.getString(columnIndexOrThrow6);
                                                        int i10 = cursorB.getInt(columnIndexOrThrow7);
                                                        string6 = cursorB.getString(columnIndexOrThrow8);
                                                        i6 = cursorB.getInt(columnIndexOrThrow9);
                                                        j = cursorB.getLong(columnIndexOrThrow12);
                                                        akzxVarM = spd.a.m();
                                                        if (android.text.TextUtils.isEmpty(string2)) {
                                                            cursor = cursorB;
                                                        } else {
                                                            akzxVarM.u();
                                                            spd spdVar = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string2);
                                                            cursor = cursorB;
                                                            spdVar.b |= 16384;
                                                            spdVar.q = string2;
                                                        }
                                                        if (!android.text.TextUtils.isEmpty(string3)) {
                                                            akzxVarM.u();
                                                            spd spdVar2 = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string3);
                                                            spdVar2.b |= 1;
                                                            spdVar2.c = string3;
                                                        }
                                                        if (!android.text.TextUtils.isEmpty(string4)) {
                                                            akzxVarM.u();
                                                            spd spdVar3 = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string4);
                                                            spdVar3.b |= 4;
                                                            spdVar3.e = string4;
                                                        }
                                                        if (!android.text.TextUtils.isEmpty(string5)) {
                                                            akzxVarM.u();
                                                            spd spdVar4 = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string5);
                                                            spdVar4.b |= 8;
                                                            spdVar4.f = string5;
                                                        }
                                                        if (i4 > 0) {
                                                            akzxVarM.u();
                                                            spd spdVar5 = akzxVarM.b;
                                                            spdVar5.b |= 16;
                                                            spdVar5.g = i4;
                                                        }
                                                        if (i6 == i) {
                                                            akzxVarM.u();
                                                            spd spdVar6 = akzxVarM.b;
                                                            spdVar6.b |= 2048;
                                                            spdVar6.n = true;
                                                        }
                                                        if (i5 > 0) {
                                                            akzxVarM.u();
                                                            spd spdVar7 = akzxVarM.b;
                                                            spdVar7.b |= 64;
                                                            spdVar7.i = i5;
                                                        }
                                                        optionalBU = defpackage.mni.bU(this.g.getResources(), i5, string9);
                                                        rhbVar = new rhb(akzxVarM, 12);
                                                        if (true == optionalBU.isPresent()) {
                                                            ?? r6 = optionalBU.get();
                                                            java.lang.Object obj = rhbVar.a;
                                                            java.lang.String string10 = r6.toString();
                                                            ((defpackage.akzx) obj).u();
                                                            spd spdVar8 = ((defpackage.akzx) obj).b;
                                                            j$.util.Objects.requireNonNull(string10);
                                                            spdVar8.b |= 32;
                                                            spdVar8.h = string10;
                                                        }
                                                        j2 = i10;
                                                        akzxVarM.u();
                                                        spd spdVar9 = akzxVarM.b;
                                                        spdVar9.b |= 128;
                                                        spdVar9.j = j2;
                                                        if (android.text.TextUtils.isEmpty(string6)) {
                                                            str8 = str6;
                                                        } else {
                                                            akzxVarM.u();
                                                            spd spdVar10 = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string6);
                                                            spdVar10.b |= 512;
                                                            spdVar10.l = string6;
                                                            str8 = str6;
                                                            java.lang.String string11 = android.provider.ContactsContract.Contacts.getLookupUri(j2, string6).buildUpon().appendQueryParameter("directory", str8).build().toString();
                                                            akzxVarM.u();
                                                            spd spdVar11 = akzxVarM.b;
                                                            j$.util.Objects.requireNonNull(string11);
                                                            spdVar11.b |= 256;
                                                            spdVar11.k = string11;
                                                        }
                                                        if (j > 0) {
                                                            akzxVarM.u();
                                                            spd spdVar12 = akzxVarM.b;
                                                            spdVar12.b |= 8192;
                                                            spdVar12.p = j;
                                                        }
                                                        if (android.text.TextUtils.isEmpty(string)) {
                                                            str9 = str4;
                                                            str7 = str5;
                                                        } else {
                                                            cursorB2 = this.h.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"display_name_alt", "carrier_presence"}, "contact_id = ? AND data1 = ?", new java.lang.String[]{java.lang.Long.toString(j2), string}, null);
                                                            if (cursorB2 == null) {
                                                                str7 = str5;
                                                                str9 = str4;
                                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 358, "SingleNumberLookup.java")).v(str9);
                                                            } else {
                                                                str9 = str4;
                                                                str7 = str5;
                                                                if (cursorB2.moveToFirst()) {
                                                                    string7 = cursorB2.getString(0);
                                                                    if (!android.text.TextUtils.isEmpty(string7)) {
                                                                        akzxVarM.u();
                                                                        spd spdVar13 = akzxVarM.b;
                                                                        j$.util.Objects.requireNonNull(string7);
                                                                        spdVar13.b |= 2;
                                                                        spdVar13.d = string7;
                                                                    }
                                                                    i3 = 1;
                                                                    if ((cursorB2.getInt(1) & 1) == 1) {
                                                                        akzxVarM.u();
                                                                        spd spdVar14 = akzxVarM.b;
                                                                        spdVar14.b |= 1024;
                                                                        i3 = 1;
                                                                        spdVar14.m = true;
                                                                    }
                                                                    cursorB2.close();
                                                                } else {
                                                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 362, "SingleNumberLookup.java")).v("no results");
                                                                    cursorB2.close();
                                                                }
                                                            }
                                                            treeSet = treeSet2;
                                                            treeSet.add(akzxVarM.r());
                                                            treeSet3 = treeSet;
                                                        }
                                                        i3 = 1;
                                                        treeSet = treeSet2;
                                                        treeSet.add(akzxVarM.r());
                                                        treeSet3 = treeSet;
                                                    } else {
                                                        try {
                                                            if (android.text.TextUtils.isEmpty(string)) {
                                                                i2 = columnIndexOrThrow10;
                                                            } else {
                                                                hkd hkdVar = hkd.a;
                                                                i2 = columnIndexOrThrow10;
                                                                defpackage.akzx akzxVarM2 = hkdVar.m();
                                                                akzxVarM2.u();
                                                                hkd hkdVar2 = akzxVarM2.b;
                                                                j$.util.Objects.requireNonNull((java.lang.Object) r4);
                                                                hkdVar2.b |= 1;
                                                                hkdVar2.c = r4;
                                                                hkdVarR = akzxVarM2.r();
                                                                defpackage.akzx akzxVarM3 = hkdVar.m();
                                                                akzxVarM3.u();
                                                                hkd hkdVar3 = akzxVarM3.b;
                                                                j$.util.Objects.requireNonNull(string);
                                                                hkdVar3.b |= 1;
                                                                hkdVar3.c = string;
                                                                hkd hkdVarR2 = akzxVarM3.r();
                                                                if ((defpackage.ahbv.w(hkdVarR) || defpackage.ahbv.w(hkdVarR2)) && !hkdVarR.c.equals(hkdVarR2.c)) {
                                                                    columnIndexOrThrow9 = columnIndexOrThrow9;
                                                                    cursor = cursorB;
                                                                    i3 = i;
                                                                    treeSet3 = treeSet2;
                                                                    str7 = str5;
                                                                    str8 = str6;
                                                                    str9 = str4;
                                                                }
                                                            }
                                                            string2 = cursorB.getString(columnIndexOrThrow11);
                                                            string3 = cursorB.getString(columnIndexOrThrow);
                                                            string4 = cursorB.getString(columnIndexOrThrow2);
                                                            string5 = cursorB.getString(columnIndexOrThrow3);
                                                            i4 = cursorB.getInt(columnIndexOrThrow4);
                                                            i5 = cursorB.getInt(columnIndexOrThrow5);
                                                            java.lang.String string12 = cursorB.getString(columnIndexOrThrow6);
                                                            int i11 = cursorB.getInt(columnIndexOrThrow7);
                                                            string6 = cursorB.getString(columnIndexOrThrow8);
                                                            i6 = cursorB.getInt(columnIndexOrThrow9);
                                                            j = cursorB.getLong(columnIndexOrThrow12);
                                                            akzxVarM = spd.a.m();
                                                            if (android.text.TextUtils.isEmpty(string2)) {
                                                                try {
                                                                    akzxVarM.u();
                                                                    spd spdVar15 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string2);
                                                                    cursor = cursorB;
                                                                    try {
                                                                        spdVar15.b |= 16384;
                                                                        spdVar15.q = string2;
                                                                    } catch (java.lang.Throwable th3) {
                                                                        th = th3;
                                                                        th = th;
                                                                        r5 = treeSet2;
                                                                        if (cursor != null) {
                                                                            throw th;
                                                                        }
                                                                        try {
                                                                            cursor.close();
                                                                            throw th;
                                                                        } catch (java.lang.Throwable th4) {
                                                                            th.addSuppressed(th4);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                    cursor = cursorB;
                                                                    th = th;
                                                                    r5 = treeSet2;
                                                                    if (cursor != null) {
                                                                        throw th;
                                                                    }
                                                                    cursor.close();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                cursor = cursorB;
                                                            }
                                                            try {
                                                                if (!android.text.TextUtils.isEmpty(string3)) {
                                                                    akzxVarM.u();
                                                                    spd spdVar16 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string3);
                                                                    spdVar16.b |= 1;
                                                                    spdVar16.c = string3;
                                                                }
                                                                if (!android.text.TextUtils.isEmpty(string4)) {
                                                                    akzxVarM.u();
                                                                    spd spdVar17 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string4);
                                                                    spdVar17.b |= 4;
                                                                    spdVar17.e = string4;
                                                                }
                                                                if (!android.text.TextUtils.isEmpty(string5)) {
                                                                    akzxVarM.u();
                                                                    spd spdVar18 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string5);
                                                                    spdVar18.b |= 8;
                                                                    spdVar18.f = string5;
                                                                }
                                                                if (i4 > 0) {
                                                                    akzxVarM.u();
                                                                    spd spdVar19 = akzxVarM.b;
                                                                    spdVar19.b |= 16;
                                                                    spdVar19.g = i4;
                                                                }
                                                                if (i6 == i) {
                                                                    akzxVarM.u();
                                                                    spd spdVar20 = akzxVarM.b;
                                                                    spdVar20.b |= 2048;
                                                                    spdVar20.n = true;
                                                                }
                                                                if (i5 > 0) {
                                                                    akzxVarM.u();
                                                                    spd spdVar21 = akzxVarM.b;
                                                                    spdVar21.b |= 64;
                                                                    spdVar21.i = i5;
                                                                }
                                                                optionalBU = defpackage.mni.bU(this.g.getResources(), i5, string12);
                                                                rhbVar = new rhb(akzxVarM, 12);
                                                                if (true == optionalBU.isPresent()) {
                                                                    ?? r7 = optionalBU.get();
                                                                    java.lang.Object obj2 = rhbVar.a;
                                                                    java.lang.String string13 = r7.toString();
                                                                    ((defpackage.akzx) obj2).u();
                                                                    spd spdVar22 = ((defpackage.akzx) obj2).b;
                                                                    j$.util.Objects.requireNonNull(string13);
                                                                    spdVar22.b |= 32;
                                                                    spdVar22.h = string13;
                                                                }
                                                                j2 = i11;
                                                                akzxVarM.u();
                                                                spd spdVar23 = akzxVarM.b;
                                                                spdVar23.b |= 128;
                                                                spdVar23.j = j2;
                                                                if (android.text.TextUtils.isEmpty(string6)) {
                                                                    akzxVarM.u();
                                                                    spd spdVar110 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string6);
                                                                    spdVar110.b |= 512;
                                                                    spdVar110.l = string6;
                                                                    str8 = str6;
                                                                    java.lang.String string14 = android.provider.ContactsContract.Contacts.getLookupUri(j2, string6).buildUpon().appendQueryParameter("directory", str8).build().toString();
                                                                    akzxVarM.u();
                                                                    spd spdVar111 = akzxVarM.b;
                                                                    j$.util.Objects.requireNonNull(string14);
                                                                    spdVar111.b |= 256;
                                                                    spdVar111.k = string14;
                                                                } else {
                                                                    str8 = str6;
                                                                }
                                                                if (j > 0) {
                                                                    akzxVarM.u();
                                                                    spd spdVar112 = akzxVarM.b;
                                                                    spdVar112.b |= 8192;
                                                                    spdVar112.p = j;
                                                                }
                                                                try {
                                                                    if (android.text.TextUtils.isEmpty(string)) {
                                                                        str9 = str4;
                                                                        str7 = str5;
                                                                    } else {
                                                                        try {
                                                                            cursorB2 = this.h.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"display_name_alt", "carrier_presence"}, "contact_id = ? AND data1 = ?", new java.lang.String[]{java.lang.Long.toString(j2), string}, null);
                                                                            if (cursorB2 == null) {
                                                                                try {
                                                                                    str7 = str5;
                                                                                    try {
                                                                                        str9 = str4;
                                                                                        try {
                                                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 358, "SingleNumberLookup.java")).v(str9);
                                                                                        } catch (java.lang.Throwable th6) {
                                                                                            th = th6;
                                                                                            th2 = th;
                                                                                            i3 = 1;
                                                                                            if (cursorB2 != null) {
                                                                                                try {
                                                                                                    cursorB2.close();
                                                                                                } catch (java.lang.Throwable th7) {
                                                                                                    th2.addSuppressed(th7);
                                                                                                }
                                                                                            }
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th8) {
                                                                                        th = th8;
                                                                                        str9 = str4;
                                                                                    }
                                                                                } catch (java.lang.Throwable th9) {
                                                                                    th = th9;
                                                                                    str9 = str4;
                                                                                    str7 = str5;
                                                                                }
                                                                            } else {
                                                                                str9 = str4;
                                                                                str7 = str5;
                                                                                try {
                                                                                    if (cursorB2.moveToFirst()) {
                                                                                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 362, "SingleNumberLookup.java")).v("no results");
                                                                                        try {
                                                                                            cursorB2.close();
                                                                                        } catch (java.lang.RuntimeException e) {
                                                                                            runtimeException2 = e;
                                                                                            i3 = 1;
                                                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(runtimeException2)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "doSecondaryLookup", (char) 394, "SingleNumberLookup.java")).v("lookup failed");
                                                                                        }
                                                                                    } else {
                                                                                        string7 = cursorB2.getString(0);
                                                                                        if (!android.text.TextUtils.isEmpty(string7)) {
                                                                                            akzxVarM.u();
                                                                                            spd spdVar113 = akzxVarM.b;
                                                                                            j$.util.Objects.requireNonNull(string7);
                                                                                            spdVar113.b |= 2;
                                                                                            spdVar113.d = string7;
                                                                                        }
                                                                                        i3 = 1;
                                                                                        try {
                                                                                            if ((cursorB2.getInt(1) & 1) == 1) {
                                                                                                akzxVarM.u();
                                                                                                spd spdVar114 = akzxVarM.b;
                                                                                                spdVar114.b |= 1024;
                                                                                                i3 = 1;
                                                                                                spdVar114.m = true;
                                                                                            }
                                                                                            try {
                                                                                                cursorB2.close();
                                                                                            } catch (java.lang.RuntimeException e2) {
                                                                                                e = e2;
                                                                                                runtimeException2 = e;
                                                                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(runtimeException2)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "doSecondaryLookup", (char) 394, "SingleNumberLookup.java")).v("lookup failed");
                                                                                            }
                                                                                        } catch (java.lang.Throwable th10) {
                                                                                            th = th10;
                                                                                            th2 = th;
                                                                                            if (cursorB2 != null) {
                                                                                                cursorB2.close();
                                                                                            }
                                                                                            throw th2;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th11) {
                                                                                    th = th11;
                                                                                    i3 = 1;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.RuntimeException e3) {
                                                                            e = e3;
                                                                            str9 = str4;
                                                                            str7 = str5;
                                                                            i3 = 1;
                                                                        }
                                                                        treeSet = treeSet2;
                                                                        treeSet.add(akzxVarM.r());
                                                                        treeSet3 = treeSet;
                                                                    }
                                                                    treeSet.add(akzxVarM.r());
                                                                    treeSet3 = treeSet;
                                                                } catch (java.lang.Throwable th12) {
                                                                    th = th12;
                                                                    th = th;
                                                                    r5 = treeSet;
                                                                    if (cursor != null) {
                                                                        throw th;
                                                                    }
                                                                    cursor.close();
                                                                    throw th;
                                                                }
                                                                i3 = 1;
                                                                treeSet = treeSet2;
                                                            } catch (java.lang.Throwable th13) {
                                                                th = th13;
                                                                treeSet = treeSet2;
                                                            }
                                                        } catch (java.lang.Throwable th14) {
                                                            th = th14;
                                                            cursor = cursorB;
                                                            r5 = treeSet2;
                                                            if (cursor != null) {
                                                                throw th;
                                                            }
                                                            cursor.close();
                                                            throw th;
                                                            return r2;
                                                        }
                                                    }
                                                    if (cursor.moveToNext()) {
                                                        treeSet2 = treeSet3;
                                                        str4 = str9;
                                                        str6 = str8;
                                                        str5 = str7;
                                                        i = i3;
                                                        columnIndexOrThrow11 = columnIndexOrThrow11;
                                                        columnIndexOrThrow10 = i2;
                                                        columnIndexOrThrow = columnIndexOrThrow;
                                                        columnIndexOrThrow2 = columnIndexOrThrow2;
                                                        columnIndexOrThrow5 = columnIndexOrThrow5;
                                                        columnIndexOrThrow6 = columnIndexOrThrow6;
                                                        columnIndexOrThrow7 = columnIndexOrThrow7;
                                                        columnIndexOrThrow8 = columnIndexOrThrow8;
                                                        columnIndexOrThrow3 = columnIndexOrThrow3;
                                                        columnIndexOrThrow4 = columnIndexOrThrow4;
                                                        columnIndexOrThrow9 = columnIndexOrThrow9;
                                                        columnIndexOrThrow12 = columnIndexOrThrow12;
                                                        cursorB = cursor;
                                                        r4 = str;
                                                    } else {
                                                        cursor.close();
                                                        r2 = treeSet3;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th15) {
                                                th = th15;
                                                cursor = cursorB;
                                            }
                                        } catch (java.lang.Throwable th16) {
                                            th = th16;
                                            treeSet = treeSet4;
                                            cursor = cursorB;
                                        }
                                    } else {
                                        cursorB.close();
                                    }
                                } catch (java.lang.Throwable th17) {
                                    th = th17;
                                    treeSet = treeSet4;
                                    cursor = cursorB;
                                    str3 = "SingleNumberLookup.java";
                                }
                                th = th;
                                r5 = treeSet;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                            try {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", 175, "SingleNumberLookup.java")).v("null cursor");
                            } catch (java.lang.Throwable th18) {
                                th = th18;
                                r5 = treeSet4;
                                cursor = cursorB;
                                str3 = "SingleNumberLookup.java";
                            }
                        } catch (java.lang.RuntimeException e4) {
                            e = e4;
                            runtimeException = e;
                            r3 = r5;
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(runtimeException)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", (char) 273, str3)).v("lookup failed");
                            r2 = r3;
                        }
                    } catch (java.lang.RuntimeException e5) {
                        runtimeException = e5;
                        r3 = treeSet4;
                        str3 = "SingleNumberLookup.java";
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(runtimeException)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", (char) 273, str3)).v("lookup failed");
                        r2 = r3;
                    }
                } else {
                    cursorB = b(str);
                    if (cursorB == null) {
                        if (cursorB.moveToFirst()) {
                            cursorB.close();
                        } else {
                            columnIndexOrThrow = cursorB.getColumnIndexOrThrow("display_name");
                            columnIndexOrThrow2 = cursorB.getColumnIndexOrThrow("photo_thumb_uri");
                            columnIndexOrThrow3 = cursorB.getColumnIndexOrThrow("photo_uri");
                            columnIndexOrThrow4 = cursorB.getColumnIndexOrThrow("photo_id");
                            columnIndexOrThrow5 = cursorB.getColumnIndexOrThrow("type");
                            i = 1;
                            columnIndexOrThrow6 = cursorB.getColumnIndexOrThrow("label");
                            str3 = "SingleNumberLookup.java";
                            columnIndexOrThrow7 = cursorB.getColumnIndexOrThrow("contact_id");
                            treeSet2 = treeSet4;
                            columnIndexOrThrow8 = cursorB.getColumnIndexOrThrow("lookup");
                            str4 = "null cursor";
                            columnIndexOrThrow9 = cursorB.getColumnIndexOrThrow("starred");
                            columnIndexOrThrow10 = cursorB.getColumnIndexOrThrow("number");
                            str5 = "com/android/dialer/phonelookup/cp2/SingleNumberLookup";
                            columnIndexOrThrow11 = cursorB.getColumnIndexOrThrow("normalized_number");
                            str6 = "0";
                            columnIndexOrThrow12 = cursorB.getColumnIndexOrThrow("data_id");
                            r4 = r5;
                            treeSet2 = treeSet2;
                            while (true) {
                                string = cursorB.getString(columnIndexOrThrow10);
                                if (android.text.TextUtils.isEmpty(r4)) {
                                    if (android.text.TextUtils.isEmpty(string)) {
                                        hkd hkdVar4 = hkd.a;
                                        i2 = columnIndexOrThrow10;
                                        defpackage.akzx akzxVarM4 = hkdVar4.m();
                                        akzxVarM4.u();
                                        hkd hkdVar5 = akzxVarM4.b;
                                        j$.util.Objects.requireNonNull((java.lang.Object) r4);
                                        hkdVar5.b |= 1;
                                        hkdVar5.c = r4;
                                        hkdVarR = akzxVarM4.r();
                                        defpackage.akzx akzxVarM5 = hkdVar4.m();
                                        akzxVarM5.u();
                                        hkd hkdVar6 = akzxVarM5.b;
                                        j$.util.Objects.requireNonNull(string);
                                        hkdVar6.b |= 1;
                                        hkdVar6.c = string;
                                        hkd hkdVarR3 = akzxVarM5.r();
                                        if (defpackage.ahbv.w(hkdVarR)) {
                                            columnIndexOrThrow9 = columnIndexOrThrow9;
                                            cursor = cursorB;
                                            i3 = i;
                                            treeSet3 = treeSet2;
                                            str7 = str5;
                                            str8 = str6;
                                            str9 = str4;
                                        } else {
                                            columnIndexOrThrow9 = columnIndexOrThrow9;
                                            cursor = cursorB;
                                            i3 = i;
                                            treeSet3 = treeSet2;
                                            str7 = str5;
                                            str8 = str6;
                                            str9 = str4;
                                        }
                                    } else {
                                        i2 = columnIndexOrThrow10;
                                    }
                                    string2 = cursorB.getString(columnIndexOrThrow11);
                                    string3 = cursorB.getString(columnIndexOrThrow);
                                    string4 = cursorB.getString(columnIndexOrThrow2);
                                    string5 = cursorB.getString(columnIndexOrThrow3);
                                    i4 = cursorB.getInt(columnIndexOrThrow4);
                                    i5 = cursorB.getInt(columnIndexOrThrow5);
                                    java.lang.String string15 = cursorB.getString(columnIndexOrThrow6);
                                    int i12 = cursorB.getInt(columnIndexOrThrow7);
                                    string6 = cursorB.getString(columnIndexOrThrow8);
                                    i6 = cursorB.getInt(columnIndexOrThrow9);
                                    j = cursorB.getLong(columnIndexOrThrow12);
                                    akzxVarM = spd.a.m();
                                    if (android.text.TextUtils.isEmpty(string2)) {
                                        akzxVarM.u();
                                        spd spdVar115 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string2);
                                        cursor = cursorB;
                                        spdVar115.b |= 16384;
                                        spdVar115.q = string2;
                                    } else {
                                        cursor = cursorB;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string3)) {
                                        akzxVarM.u();
                                        spd spdVar116 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string3);
                                        spdVar116.b |= 1;
                                        spdVar116.c = string3;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string4)) {
                                        akzxVarM.u();
                                        spd spdVar117 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string4);
                                        spdVar117.b |= 4;
                                        spdVar117.e = string4;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string5)) {
                                        akzxVarM.u();
                                        spd spdVar118 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string5);
                                        spdVar118.b |= 8;
                                        spdVar118.f = string5;
                                    }
                                    if (i4 > 0) {
                                        akzxVarM.u();
                                        spd spdVar119 = akzxVarM.b;
                                        spdVar119.b |= 16;
                                        spdVar119.g = i4;
                                    }
                                    if (i6 == i) {
                                        akzxVarM.u();
                                        spd spdVar24 = akzxVarM.b;
                                        spdVar24.b |= 2048;
                                        spdVar24.n = true;
                                    }
                                    if (i5 > 0) {
                                        akzxVarM.u();
                                        spd spdVar25 = akzxVarM.b;
                                        spdVar25.b |= 64;
                                        spdVar25.i = i5;
                                    }
                                    optionalBU = defpackage.mni.bU(this.g.getResources(), i5, string15);
                                    rhbVar = new rhb(akzxVarM, 12);
                                    if (true == optionalBU.isPresent()) {
                                        ?? r9 = optionalBU.get();
                                        java.lang.Object obj3 = rhbVar.a;
                                        java.lang.String string16 = r9.toString();
                                        ((defpackage.akzx) obj3).u();
                                        spd spdVar26 = ((defpackage.akzx) obj3).b;
                                        j$.util.Objects.requireNonNull(string16);
                                        spdVar26.b |= 32;
                                        spdVar26.h = string16;
                                    }
                                    j2 = i12;
                                    akzxVarM.u();
                                    spd spdVar27 = akzxVarM.b;
                                    spdVar27.b |= 128;
                                    spdVar27.j = j2;
                                    if (android.text.TextUtils.isEmpty(string6)) {
                                        akzxVarM.u();
                                        spd spdVar1110 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string6);
                                        spdVar1110.b |= 512;
                                        spdVar1110.l = string6;
                                        str8 = str6;
                                        java.lang.String string17 = android.provider.ContactsContract.Contacts.getLookupUri(j2, string6).buildUpon().appendQueryParameter("directory", str8).build().toString();
                                        akzxVarM.u();
                                        spd spdVar1111 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string17);
                                        spdVar1111.b |= 256;
                                        spdVar1111.k = string17;
                                    } else {
                                        str8 = str6;
                                    }
                                    if (j > 0) {
                                        akzxVarM.u();
                                        spd spdVar1112 = akzxVarM.b;
                                        spdVar1112.b |= 8192;
                                        spdVar1112.p = j;
                                    }
                                    if (android.text.TextUtils.isEmpty(string)) {
                                        str9 = str4;
                                        str7 = str5;
                                    } else {
                                        cursorB2 = this.h.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"display_name_alt", "carrier_presence"}, "contact_id = ? AND data1 = ?", new java.lang.String[]{java.lang.Long.toString(j2), string}, null);
                                        if (cursorB2 == null) {
                                            str7 = str5;
                                            str9 = str4;
                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 358, "SingleNumberLookup.java")).v(str9);
                                        } else {
                                            str9 = str4;
                                            str7 = str5;
                                            if (cursorB2.moveToFirst()) {
                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 362, "SingleNumberLookup.java")).v("no results");
                                                cursorB2.close();
                                            } else {
                                                string7 = cursorB2.getString(0);
                                                if (!android.text.TextUtils.isEmpty(string7)) {
                                                    akzxVarM.u();
                                                    spd spdVar1113 = akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(string7);
                                                    spdVar1113.b |= 2;
                                                    spdVar1113.d = string7;
                                                }
                                                i3 = 1;
                                                if ((cursorB2.getInt(1) & 1) == 1) {
                                                    akzxVarM.u();
                                                    spd spdVar1114 = akzxVarM.b;
                                                    spdVar1114.b |= 1024;
                                                    i3 = 1;
                                                    spdVar1114.m = true;
                                                }
                                                cursorB2.close();
                                            }
                                        }
                                        treeSet = treeSet2;
                                        treeSet.add(akzxVarM.r());
                                        treeSet3 = treeSet;
                                    }
                                    i3 = 1;
                                    treeSet = treeSet2;
                                    treeSet.add(akzxVarM.r());
                                    treeSet3 = treeSet;
                                } else {
                                    i2 = columnIndexOrThrow10;
                                    string2 = cursorB.getString(columnIndexOrThrow11);
                                    string3 = cursorB.getString(columnIndexOrThrow);
                                    string4 = cursorB.getString(columnIndexOrThrow2);
                                    string5 = cursorB.getString(columnIndexOrThrow3);
                                    i4 = cursorB.getInt(columnIndexOrThrow4);
                                    i5 = cursorB.getInt(columnIndexOrThrow5);
                                    java.lang.String string18 = cursorB.getString(columnIndexOrThrow6);
                                    int i13 = cursorB.getInt(columnIndexOrThrow7);
                                    string6 = cursorB.getString(columnIndexOrThrow8);
                                    i6 = cursorB.getInt(columnIndexOrThrow9);
                                    j = cursorB.getLong(columnIndexOrThrow12);
                                    akzxVarM = spd.a.m();
                                    if (android.text.TextUtils.isEmpty(string2)) {
                                        akzxVarM.u();
                                        spd spdVar1115 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string2);
                                        cursor = cursorB;
                                        spdVar1115.b |= 16384;
                                        spdVar1115.q = string2;
                                    } else {
                                        cursor = cursorB;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string3)) {
                                        akzxVarM.u();
                                        spd spdVar1116 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string3);
                                        spdVar1116.b |= 1;
                                        spdVar1116.c = string3;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string4)) {
                                        akzxVarM.u();
                                        spd spdVar1117 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string4);
                                        spdVar1117.b |= 4;
                                        spdVar1117.e = string4;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string5)) {
                                        akzxVarM.u();
                                        spd spdVar1118 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string5);
                                        spdVar1118.b |= 8;
                                        spdVar1118.f = string5;
                                    }
                                    if (i4 > 0) {
                                        akzxVarM.u();
                                        spd spdVar1119 = akzxVarM.b;
                                        spdVar1119.b |= 16;
                                        spdVar1119.g = i4;
                                    }
                                    if (i6 == i) {
                                        akzxVarM.u();
                                        spd spdVar28 = akzxVarM.b;
                                        spdVar28.b |= 2048;
                                        spdVar28.n = true;
                                    }
                                    if (i5 > 0) {
                                        akzxVarM.u();
                                        spd spdVar29 = akzxVarM.b;
                                        spdVar29.b |= 64;
                                        spdVar29.i = i5;
                                    }
                                    optionalBU = defpackage.mni.bU(this.g.getResources(), i5, string18);
                                    rhbVar = new rhb(akzxVarM, 12);
                                    if (true == optionalBU.isPresent()) {
                                        ?? r10 = optionalBU.get();
                                        java.lang.Object obj4 = rhbVar.a;
                                        java.lang.String string19 = r10.toString();
                                        ((defpackage.akzx) obj4).u();
                                        spd spdVar210 = ((defpackage.akzx) obj4).b;
                                        j$.util.Objects.requireNonNull(string19);
                                        spdVar210.b |= 32;
                                        spdVar210.h = string19;
                                    }
                                    j2 = i13;
                                    akzxVarM.u();
                                    spd spdVar211 = akzxVarM.b;
                                    spdVar211.b |= 128;
                                    spdVar211.j = j2;
                                    if (android.text.TextUtils.isEmpty(string6)) {
                                        akzxVarM.u();
                                        spd spdVar11110 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string6);
                                        spdVar11110.b |= 512;
                                        spdVar11110.l = string6;
                                        str8 = str6;
                                        java.lang.String string110 = android.provider.ContactsContract.Contacts.getLookupUri(j2, string6).buildUpon().appendQueryParameter("directory", str8).build().toString();
                                        akzxVarM.u();
                                        spd spdVar11111 = akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string110);
                                        spdVar11111.b |= 256;
                                        spdVar11111.k = string110;
                                    } else {
                                        str8 = str6;
                                    }
                                    if (j > 0) {
                                        akzxVarM.u();
                                        spd spdVar11112 = akzxVarM.b;
                                        spdVar11112.b |= 8192;
                                        spdVar11112.p = j;
                                    }
                                    if (android.text.TextUtils.isEmpty(string)) {
                                        str9 = str4;
                                        str7 = str5;
                                    } else {
                                        cursorB2 = this.h.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new java.lang.String[]{"display_name_alt", "carrier_presence"}, "contact_id = ? AND data1 = ?", new java.lang.String[]{java.lang.Long.toString(j2), string}, null);
                                        if (cursorB2 == null) {
                                            str7 = str5;
                                            str9 = str4;
                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 358, "SingleNumberLookup.java")).v(str9);
                                        } else {
                                            str9 = str4;
                                            str7 = str5;
                                            if (cursorB2.moveToFirst()) {
                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l(str7, "doSecondaryLookup", 362, "SingleNumberLookup.java")).v("no results");
                                                cursorB2.close();
                                            } else {
                                                string7 = cursorB2.getString(0);
                                                if (!android.text.TextUtils.isEmpty(string7)) {
                                                    akzxVarM.u();
                                                    spd spdVar11113 = akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(string7);
                                                    spdVar11113.b |= 2;
                                                    spdVar11113.d = string7;
                                                }
                                                i3 = 1;
                                                if ((cursorB2.getInt(1) & 1) == 1) {
                                                    akzxVarM.u();
                                                    spd spdVar11114 = akzxVarM.b;
                                                    spdVar11114.b |= 1024;
                                                    i3 = 1;
                                                    spdVar11114.m = true;
                                                }
                                                cursorB2.close();
                                            }
                                        }
                                        treeSet = treeSet2;
                                        treeSet.add(akzxVarM.r());
                                        treeSet3 = treeSet;
                                    }
                                    i3 = 1;
                                    treeSet = treeSet2;
                                    treeSet.add(akzxVarM.r());
                                    treeSet3 = treeSet;
                                }
                                if (cursor.moveToNext()) {
                                    cursor.close();
                                    r2 = treeSet3;
                                } else {
                                    treeSet2 = treeSet3;
                                    str4 = str9;
                                    str6 = str8;
                                    str5 = str7;
                                    i = i3;
                                    columnIndexOrThrow11 = columnIndexOrThrow11;
                                    columnIndexOrThrow10 = i2;
                                    columnIndexOrThrow = columnIndexOrThrow;
                                    columnIndexOrThrow2 = columnIndexOrThrow2;
                                    columnIndexOrThrow5 = columnIndexOrThrow5;
                                    columnIndexOrThrow6 = columnIndexOrThrow6;
                                    columnIndexOrThrow7 = columnIndexOrThrow7;
                                    columnIndexOrThrow8 = columnIndexOrThrow8;
                                    columnIndexOrThrow3 = columnIndexOrThrow3;
                                    columnIndexOrThrow4 = columnIndexOrThrow4;
                                    columnIndexOrThrow9 = columnIndexOrThrow9;
                                    columnIndexOrThrow12 = columnIndexOrThrow12;
                                    cursorB = cursor;
                                    r4 = str;
                                }
                            }
                        }
                        th = th;
                        r5 = treeSet;
                        if (cursor != null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", 175, "SingleNumberLookup.java")).v("null cursor");
                }
            } catch (java.lang.RuntimeException e6) {
                e = e6;
                r5 = treeSet4;
                str3 = "SingleNumberLookup.java";
            }
            return r2;
        }
        return treeSet4;
    }
}
