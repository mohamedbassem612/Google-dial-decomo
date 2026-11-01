package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oq {
    public final java.lang.Object a;

    public oq(zjm zjmVar) {
        j$.util.Optional optionalG = zjmVar.g();
        aooh.e(optionalG, "getFeature(...)");
        this.a = (kva) aooh.q(optionalG);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int k(defpackage.eqg eqgVar) {
        java.lang.String str = eqgVar.p;
        if (str == null || !defpackage.eqz.g(str)) {
            return 128;
        }
        java.lang.String str2 = eum.a;
        switch (str.hashCode()) {
            case -1487656890:
                if (!str.equals("image/avif") || android.os.Build.VERSION.SDK_INT < 34) {
                    return 129;
                }
                return 132;
            case -1487464693:
                if (str.equals("image/heic")) {
                    return 132;
                }
                return 129;
            case -1487464690:
                if (str.equals("image/heif")) {
                    return 132;
                }
                return 129;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    return 132;
                }
                return 129;
            case -1487018032:
                if (str.equals("image/webp")) {
                    return 132;
                }
                return 129;
            case -879272239:
                if (str.equals("image/bmp")) {
                    return 132;
                }
                return 129;
            case -879258763:
                if (str.equals("image/png")) {
                    return 132;
                }
                return 129;
            default:
                return 129;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public static defpackage.oq l(defpackage.etx etxVar) {
        java.lang.String str;
        java.lang.String string;
        etxVar.R(2);
        int iN = etxVar.n();
        int i = iN >> 1;
        int i2 = iN & 1;
        int iN2 = etxVar.n() >> 3;
        if (i == 4 || i == 5) {
            str = "dvhe";
        } else if (i != 20) {
            switch (i) {
                case 7:
                case 8:
                    str = "dvhe";
                    break;
                case 9:
                    str = "dvav";
                    break;
                case 10:
                    str = "dav1";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = "dvh1";
        }
        int i3 = (i2 << 5) | iN2;
        if (str == null) {
            string = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(i < 10 ? ".0" : ".");
            sb.append(i);
            sb.append(i3 >= 10 ? "." : ".0");
            sb.append(i3);
            string = sb.toString();
        }
        return new defpackage.oq(string, (byte[]) null);
    }

    public final /* synthetic */ void A() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.kqy) ((akzx) this.a).b).c);
        aooh.e(listUnmodifiableList, "getCallActionsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.kqx B() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kqx) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    public final boolean a(java.lang.String str) {
        java.lang.String str2;
        int i = 31;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        switch (str.hashCode()) {
            case -2126994802:
                if (!str.equals("GLOBAL_SEARCH_SESSION_GET_SCHEMA")) {
                    return false;
                }
                i = 33;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -2096499961:
                str2 = "SET_SCHEMA_REQUEST_SET_WIPEOUT_ACCOUNT";
                str.equals(str2);
                return false;
            case -1990346520:
                if (!str.equals("SEARCH_SPEC_SET_SEARCH_SOURCE_LOG_TAG")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case -1870138211:
                if (!str.equals("ENTERPRISE_GLOBAL_SEARCH_SESSION")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case -1846846381:
                if (!str.equals("SCHEMA_ADD_PARENT_TYPE")) {
                    return false;
                }
                i = 35;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -1759099986:
                str2 = "SEARCH_SPEC_SEARCH_STRING_PARAMETERS";
                str.equals(str2);
                return false;
            case -1699543354:
                if (!str.equals("SCHEMA_EMBEDDING_PROPERTY_CONFIG")) {
                    return false;
                }
                i = 36;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -1563005231:
                if (!str.equals("SEARCH_SPEC_ADVANCED_RANKING_EXPRESSION")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case -1529577860:
                if (!str.equals("ADD_PERMISSIONS_AND_GET_VISIBILITY")) {
                    return false;
                }
                i = 33;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -1500373575:
                if (!str.equals("SEARCH_SPEC_GROUPING_TYPE_PER_SCHEMA")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case -1469615115:
                if (!str.equals("JOIN_SPEC_AND_QUALIFIED_ID")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case -1355782489:
                if (!str.equals("SET_SCHEMA_CIRCULAR_REFERENCES")) {
                    return false;
                }
                i = 34;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -1283455818:
                if (!str.equals("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK")) {
                    return false;
                }
                i = 33;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -947570458:
                if (!str.equals("TOKENIZER_TYPE_RFC822")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case -918282283:
                if (!str.equals("LIST_FILTER_QUERY_LANGUAGE")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case -817612637:
                if (!str.equals("SET_SCHEMA_REQUEST_ADD_SCHEMA_TYPE_VISIBLE_TO_CONFIG")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case -815303865:
                str2 = "SEARCH_EMBEDDING_MATCH_INFO";
                str.equals(str2);
                return false;
            case -571181529:
                if (!str.equals("SCHEMA_EMBEDDING_QUANTIZATION")) {
                    return false;
                }
                i = 36;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -367340628:
                if (!str.equals("SCHEMA_ADD_INDEXABLE_NESTED_PROPERTIES") || dwz.a < 10) {
                    return false;
                }
                return true;
            case -275187393:
                if (!str.equals("SEARCH_SPEC_ADD_INFORMATIONAL_RANKING_EXPRESSIONS")) {
                    return false;
                }
                if (dwz.a < 17) {
                    return false;
                }
                return true;
            case -127342504:
                str2 = "SCHEMA_EMBEDDING_PRE_QUANTIZED_DATA";
                str.equals(str2);
                return false;
            case -111108017:
                if (!str.equals("SEARCH_RESULT_PARENT_TYPES")) {
                    return false;
                }
                i = 36;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -110245711:
                if (!str.equals("SEARCH_RESULT_MATCH_INFO_SUBMATCH")) {
                    return false;
                }
                i = 33;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case -46499615:
                if (!str.equals("SCHEMA_GET_INDEXABLE_NESTED_PROPERTIES")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 49258939:
                str2 = "SCHEMA_JOINABLE_REPEATED_PROPERTIES";
                str.equals(str2);
                return false;
            case 139886785:
                str2 = "SCHEMA_SET_DESCRIPTION";
                str.equals(str2);
                return false;
            case 278741751:
                if (!str.equals("LIST_FILTER_HAS_PROPERTY_FUNCTION")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 325305394:
                if (!str.equals("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION")) {
                    return false;
                }
                if (dwz.a < 17) {
                    return false;
                }
                return true;
            case 381163556:
                str2 = "SCHEMA_EMBEDDING_APPROXIMATE_NEAREST_NEIGHBOR";
                str.equals(str2);
                return false;
            case 564641745:
                if (!str.equals("VERBATIM_SEARCH")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case 609101686:
                if (!str.equals("GLOBAL_SEARCH_SESSION_GET_BY_ID")) {
                    return false;
                }
                i = 33;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case 686278208:
                if (!str.equals("INDEXER_MOBILE_APPLICATIONS")) {
                    return false;
                }
                if (android.os.Build.VERSION.SDK_INT < 36 && defpackage.sb.a((android.content.Context) this.a) < 351112060) {
                    return false;
                }
                return true;
            case 1001112984:
                if (!str.equals("SCHEMA_SCORABLE_PROPERTY_CONFIG")) {
                    return false;
                }
                if (dwz.a < 17) {
                    return false;
                }
                return true;
            case 1164534945:
                if (!str.equals("SET_SCHEMA_REQUEST_SCHEMA_TYPE_DISPLAYED_BY_SYSTEM")) {
                    return false;
                }
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case 1315166622:
                if (!str.equals("SEARCH_SPEC_RANKING_FUNCTION_MAX_MIN_OR_DEFAULT")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 1468618014:
                if (!str.equals("SEARCH_SPEC_PROPERTY_WEIGHTS")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case 1485936891:
                if (!str.equals("SEARCH_SUGGESTION")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case 1595767610:
                if (!str.equals("NUMERIC_SEARCH")) {
                    return false;
                }
                if (dwz.a < 7) {
                    return false;
                }
                return true;
            case 1613726827:
                if (!str.equals("SEARCH_SPEC_RANKING_FUNCTION_FILTER_BY_RANGE")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 1655985039:
                if (!str.equals("SEARCH_SPEC_ADD_FILTER_PROPERTIES")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 1670559952:
                if (!str.equals("SEARCH_SPEC_ADD_FILTER_DOCUMENT_IDS")) {
                    return false;
                }
                if (dwz.a < 17) {
                    return false;
                }
                return true;
            case 1824979820:
                if (!str.equals("SCHEMA_BLOB_HANDLE")) {
                    return false;
                }
                i = 36;
                if (android.os.Build.VERSION.SDK_INT < i) {
                    return false;
                }
                return true;
            case 1991860567:
                if (!str.equals("SET_SCHEMA_REQUEST_SET_PUBLICLY_VISIBLE")) {
                    return false;
                }
                if (dwz.a < 13) {
                    return false;
                }
                return true;
            case 2039976353:
                str2 = "SCHEMA_STRING_PROPERTY_CONFIG_DELETE_PROPAGATION_TYPE_PROPAGATE_FROM";
                str.equals(str2);
                return false;
            default:
                return false;
        }
    }

    public final void b(java.lang.String str) {
        try {
            ((android.content.Context) this.a).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        } catch (android.content.ActivityNotFoundException e) {
            throw new java.lang.IllegalArgumentException(a.bp((byte) 46, str, "Can't open "), e);
        }
    }

    public final void c() {
        try {
            ((android.view.View) this.a).playSoundEffect(0);
        } catch (android.os.DeadObjectException unused) {
        }
    }

    public final long d(long j) {
        int i = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i) <= 0.0f || java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            cwh.d("maximumVelocity should be a positive value. You specified=".concat(defpackage.dpu.b(j)));
        }
        java.lang.Object obj = this.a;
        defpackage.cwf cwfVar = (defpackage.cwf) obj;
        return mni.bj(cwfVar.a.a(java.lang.Float.intBitsToFloat(i)), cwfVar.b.a(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public final void e(long j, long j2) {
        ((defpackage.cwf) this.a).a(j, j2);
    }

    public final void f() {
        ((defpackage.cwf) this.a).b();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.fla g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (defpackage.fla flaVar : this.a.values()) {
            arrayList.add(flaVar.b);
            arrayList2.add(flaVar.c);
            arrayList3.add(flaVar.d);
            arrayList4.add(flaVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        ahvr.bQ(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            java.lang.System.arraycopy(iArr4, 0, iArr3, i2, length2);
            i2 += length2;
        }
        return new defpackage.fla(iArr3, defpackage.ajee.i((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), defpackage.ajee.i((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), defpackage.ajee.i((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void h(defpackage.fla flaVar) {
        long[] jArr = flaVar.e;
        if (jArr.length > 0) {
            ?? r4 = this.a;
            if (r4.containsKey(java.lang.Long.valueOf(jArr[0]))) {
                return;
            }
            r4.put(java.lang.Long.valueOf(jArr[0]), flaVar);
        }
    }

    public final defpackage.erx i(android.content.Context context, defpackage.epy epyVar, defpackage.eqb eqbVar, defpackage.fjw fjwVar, java.util.concurrent.Executor executor) {
        try {
            return ((defpackage.oq) java.lang.Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(defpackage.erv.class).newInstance(this.a)).i(context, epyVar, eqbVar, fjwVar, executor);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public final void j(defpackage.ezv ezvVar) {
        java.util.concurrent.CopyOnWriteArrayList<defpackage.aae> copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.a;
        for (defpackage.aae aaeVar : copyOnWriteArrayList) {
            if (aaeVar.c == ezvVar) {
                aaeVar.a = true;
                copyOnWriteArrayList.remove(aaeVar);
            }
        }
    }

    public final /* synthetic */ defpackage.luj m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.luj) aladVarP;
    }

    public final void n(defpackage.lui luiVar) {
        aooh.f(luiVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.luj lujVar = (defpackage.luj) akzxVar.b;
        defpackage.luj lujVar2 = defpackage.luj.a;
        lujVar.c = luiVar.a();
        lujVar.b |= 1;
    }

    public final /* synthetic */ defpackage.ltu o() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ltu) aladVarP;
    }

    public final void p(defpackage.luj lujVar) {
        aooh.f(lujVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ltu ltuVar = (defpackage.ltu) akzxVar.b;
        defpackage.ltu ltuVar2 = defpackage.ltu.a;
        j$.util.Objects.requireNonNull(lujVar);
        ltuVar.c = lujVar;
        ltuVar.b = 2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final ajcq q(ajcq ajcqVar, long j, java.lang.Object obj, java.lang.Runnable runnable) {
        ajcq ajcqVarA = aiql.A(ajcqVar);
        final ppc ppcVar = new ppc(this, ajcqVar, runnable, obj, 1);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        ?? r8 = this.a;
        ajcq ajcqVarG = aiql.G(ajcqVarA, j, timeUnit, (java.util.concurrent.ScheduledExecutorService) r8);
        j$.util.Objects.requireNonNull(ppcVar);
        return ahvr.B(ajcqVarG, java.util.concurrent.TimeoutException.class, new ahyc() { // from class: lpc
            public final java.lang.Object apply(java.lang.Object obj2) {
                return aa$.ExternalSyntheticApiModelOutline1.m(ppcVar, (java.util.concurrent.TimeoutException) obj2);
            }
        }, (java.util.concurrent.Executor) r8);
    }

    public final /* synthetic */ defpackage.lnk r() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.lnk) aladVarP;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rlv] */
    public final android.content.Intent s() {
        this.a.o(rmx.bV);
        com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp("call_screen_privacy");
        googleHelp.q = android.net.Uri.parse("https://support.google.com/phoneapp");
        com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
        themeSettings.a = 3;
        googleHelp.s = themeSettings;
        return googleHelp.a();
    }

    public final boolean t(kiu kiuVar) {
        aooh.f(kiuVar, "coalescedRow");
        if (this.a == null) {
            return false;
        }
        kui kuiVar = kiuVar.E;
        if (kuiVar == null) {
            kuiVar = kui.a;
        }
        java.lang.String str = kuiVar.c;
        aooh.e(str, "getCallRecordingFilePath(...)");
        return str.length() > 0;
    }

    public final /* synthetic */ defpackage.kra u() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kra) aladVarP;
    }

    public final void v(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kra kraVar = (defpackage.kra) akzxVar.b;
        defpackage.kra kraVar2 = defpackage.kra.a;
        j$.util.Objects.requireNonNull(str);
        kraVar.b |= 1;
        kraVar.c = str;
    }

    public final void w(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kra kraVar = (defpackage.kra) akzxVar.b;
        defpackage.kra kraVar2 = defpackage.kra.a;
        kraVar.b |= 4;
        kraVar.e = i;
    }

    public final void x(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kra kraVar = (defpackage.kra) akzxVar.b;
        defpackage.kra kraVar2 = defpackage.kra.a;
        kraVar.d = i - 1;
        kraVar.b |= 2;
    }

    public final /* synthetic */ defpackage.kqy y() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kqy) aladVarP;
    }

    public final /* synthetic */ void z(java.lang.Iterable iterable) {
        aooh.f(iterable, "values");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kqy kqyVar = (defpackage.kqy) akzxVar.b;
        defpackage.kqy kqyVar2 = defpackage.kqy.a;
        alat alatVar = kqyVar.c;
        if (!alatVar.c()) {
            kqyVar.c = alad.J(alatVar);
        }
        akyl.i(iterable, kqyVar.c);
    }

    public oq(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public oq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = defpackage.fhs.a;
    }

    public oq() {
        this((byte[]) null);
    }

    public oq(char[] cArr, byte[] bArr) {
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public oq(short[] sArr, byte[] bArr) {
        this.a = aihd.r(1, 5);
    }

    public oq(android.content.Context context, char[] cArr) {
        ahvr.ci(context);
        this.a = context;
    }

    public oq(byte[] bArr) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
    }

    public oq(byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.fju();
    }

    public oq(short[] sArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public oq(java.lang.Object obj) {
        this.a = obj;
    }

    public oq(char[] cArr) {
        this.a = new defpackage.cwf();
    }

    public oq(int[] iArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }
}
