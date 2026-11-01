package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aogc {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public aogc(java.util.List list, java.util.List list2, java.util.List list3) {
        this.b = new java.util.HashMap();
        this.a = new java.util.HashMap();
        this.c = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.affu affuVar = (defpackage.affu) it.next();
            if (android.text.TextUtils.isEmpty(affuVar.h())) {
                android.util.Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                defpackage.affu affuVar2 = (defpackage.affu) this.b.put(affuVar.h(), affuVar);
                if (affuVar2 != null) {
                    throw new java.lang.IllegalArgumentException("Cannot override Backend " + affuVar2.getClass().getCanonicalName() + " with " + affuVar.getClass().getCanonicalName());
                }
            }
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            defpackage.affz affzVar = (defpackage.affz) it2.next();
            if (android.text.TextUtils.isEmpty(affzVar.c())) {
                android.util.Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                defpackage.affz affzVar2 = (defpackage.affz) this.a.put(affzVar.c(), affzVar);
                if (affzVar2 != null) {
                    throw new java.lang.IllegalArgumentException("Cannot to override Transform " + affzVar2.getClass().getCanonicalName() + " with " + affzVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }

    public static defpackage.aogc C(java.lang.String str, defpackage.ajfe ajfeVar, defpackage.akzc akzcVar) throws java.security.GeneralSecurityException {
        java.nio.charset.Charset charset = ajnf.a;
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new java.security.GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        ajst.b(bArr);
        return new defpackage.aogc((java.lang.Object) akzcVar, (java.lang.Object) str, (java.lang.Object) ajfeVar, (short[]) null);
    }

    public static final java.lang.String[] D(uzx uzxVar) {
        try {
            return (java.lang.String[]) java.util.Arrays.copyOf(uzxVar.aP(), uzxVar.aP().length, java.lang.String[].class);
        } catch (java.lang.ArrayStoreException e) {
            throw new java.lang.IllegalArgumentException("AsyncContentResolver cannot be queried with a SafeSQLStatement containing byte array arguments. Only String arguments are allowed.", e);
        }
    }

    public static /* synthetic */ agon H(defpackage.agqm agqmVar) {
        com.google.apps.tiktok.account.AccountId accountIdB = com.google.apps.tiktok.account.AccountId.b(agqmVar.c);
        defpackage.agoq agoqVar = agqmVar.d;
        if (agoqVar == null) {
            agoqVar = defpackage.agoq.a;
        }
        int iAQ = defpackage.a.aQ(agqmVar.e);
        if (iAQ == 0) {
            iAQ = 1;
        }
        return new agon(accountIdB, agoqVar, iAQ);
    }

    public static defpackage.aogc bD(android.content.Context context) {
        defpackage.aewq.d(context);
        return new defpackage.aogc(context, (char[]) null);
    }

    private final java.lang.reflect.Method bE(java.lang.Class cls) {
        java.lang.Object obj;
        java.lang.reflect.Method methodBF = bF(cls, (java.lang.String) this.b, (java.lang.Class[]) this.c);
        if (methodBF == null || (obj = this.a) == null) {
            return methodBF;
        }
        if (((java.lang.Class) obj).isAssignableFrom(methodBF.getReturnType())) {
            return methodBF;
        }
        return null;
    }

    private static java.lang.reflect.Method bF(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        java.lang.reflect.Method methodBF = null;
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    methodBF = bF(cls.getSuperclass(), str, clsArr);
                } else {
                    java.lang.reflect.Method method = cls.getMethod(str, clsArr);
                    try {
                        if (1 == (method.getModifiers() & 1)) {
                            methodBF = method;
                        }
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                }
            } catch (java.lang.NoSuchMethodException unused2) {
            }
        }
        return methodBF;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [akfl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [akgr, java.lang.Object] */
    private final synchronized void bG(java.lang.String str) {
        java.util.List list;
        if (this.a.contains(str)) {
            return;
        }
        try {
            java.io.InputStream inputStreamA = this.c.a(str);
            try {
                if (inputStreamA == null) {
                    list = java.util.Collections.EMPTY_LIST;
                } else {
                    try {
                        defpackage.alat alatVar = defpackage.alad.A(akfu.a, inputStreamA, defpackage.akzq.a()).b;
                        defpackage.ahvr.bN(!alatVar.isEmpty(), "Empty metadata");
                        try {
                            inputStreamA.close();
                        } catch (java.io.IOException e) {
                            defpackage.akgm.a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (java.lang.Throwable) e);
                        }
                        list = alatVar;
                    } catch (java.io.IOException e2) {
                        throw new java.lang.IllegalStateException("Unable to parse metadata file", e2);
                    }
                }
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.b.a((akft) it.next());
                }
                this.a.add(str);
            } catch (java.lang.Throwable th) {
                try {
                    inputStreamA.close();
                    throw th;
                } catch (java.io.IOException e3) {
                    defpackage.akgm.a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (java.lang.Throwable) e3);
                    throw th;
                }
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e4) {
            throw new java.lang.IllegalStateException("Failed to read file ".concat(str), e4);
        }
    }

    private static void bH(java.net.HttpURLConnection httpURLConnection) {
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.io.IOException unused) {
        }
        try {
            java.io.InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
        } catch (java.io.IOException unused2) {
        }
    }

    private static final java.lang.String bI(java.lang.String str, java.lang.String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final void bJ(java.lang.Object obj, defpackage.agxy agxyVar) {
        defpackage.aigv aigvVar = new defpackage.aigv(4);
        ?? r2 = this.b;
        defpackage.aigy aigyVar = (defpackage.aigy) r2.get(obj);
        if (aigyVar != null) {
            aigvVar.b(aigyVar);
        }
        aigvVar.d(agxyVar, 1);
        r2.put(obj, aigvVar.g());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    private final void bK(java.lang.Object obj, defpackage.agxy agxyVar) {
        ?? r5 = this.b;
        defpackage.aigy aigyVar = (defpackage.aigy) r5.get(obj);
        defpackage.ahvr.bZ(aigyVar != null, "Failed to remove a subscription key. State is corrupted.");
        defpackage.aigv aigvVar = new defpackage.aigv(4);
        aigvVar.b(aigyVar);
        int iB = aigyVar.b(agxyVar) - 1;
        j$.util.Objects.requireNonNull(aigvVar.a);
        if (iB != 0) {
            if (aigvVar.b) {
                aigvVar.a = new defpackage.aijx(aigvVar.a);
                aigvVar.c = false;
            }
        } else if (aigvVar.c) {
            iB = 0;
            if (aigvVar.b) {
                aigvVar.a = new defpackage.aijx(aigvVar.a);
                aigvVar.c = false;
            }
        } else {
            aigvVar.a = new aijy(aigvVar.a);
            aigvVar.c = true;
            iB = 0;
        }
        aigvVar.b = false;
        defpackage.ahvr.ci(agxyVar);
        defpackage.aijx aijxVar = aigvVar.a;
        if (iB == 0) {
            aijxVar.g(agxyVar);
        } else {
            defpackage.ahvr.ci(agxyVar);
            aijxVar.f(agxyVar, iB);
        }
        r5.put(obj, aigvVar.g());
        if (((defpackage.aigy) r5.get(obj)).isEmpty()) {
            r5.remove(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aijo, java.lang.Object] */
    private final boolean bL(defpackage.agxw agxwVar) {
        return this.a.a(agxwVar, 1) == 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aijo, java.lang.Object] */
    private final boolean bM(defpackage.agxw agxwVar) {
        int iD = this.a.d(agxwVar, 1);
        defpackage.ahvr.bY(iD > 0);
        return iD == 1;
    }

    private static final android.net.Uri bN(android.net.Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final defpackage.affu bO(java.lang.String str) throws defpackage.affa {
        defpackage.affu affuVar = (defpackage.affu) this.b.get(str);
        if (affuVar != null) {
            return affuVar;
        }
        throw new defpackage.affa(java.lang.String.format("Requested backend isn't registered: %s", str));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    private final defpackage.aify bP(android.net.Uri uri) throws defpackage.affa {
        defpackage.aift aiftVar = new defpackage.aift(4);
        java.util.regex.Pattern pattern = defpackage.affh.a;
        defpackage.aift aiftVar2 = new defpackage.aift(4);
        java.lang.String encodedFragment = uri.getEncodedFragment();
        defpackage.aify aifyVarJ = (android.text.TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? defpackage.aike.a : defpackage.aify.j(defpackage.ahzf.d("+").a().h(encodedFragment.substring(10)));
        int size = aifyVarJ.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = (java.lang.String) aifyVarJ.get(i);
            java.util.regex.Matcher matcher = defpackage.affh.a.matcher(str);
            if (!matcher.matches()) {
                throw new java.lang.IllegalArgumentException("Invalid fragment spec: ".concat(java.lang.String.valueOf(str)));
            }
            aiftVar2.i(matcher.group(1));
        }
        defpackage.aify aifyVarH = aiftVar2.g();
        int i2 = ((defpackage.aike) aifyVarH).d;
        for (int i3 = 0; i3 < i2; i3++) {
            java.lang.String str2 = (java.lang.String) aifyVarH.get(i3);
            defpackage.affz affzVar = (defpackage.affz) this.a.get(str2);
            if (affzVar == null) {
                throw new defpackage.affa(defpackage.hgb.l(uri, str2, "Requested transform isn't registered: ", ": "));
            }
            aiftVar.i(affzVar);
        }
        return aiftVar.g().a();
    }

    private final defpackage.ahbz bQ(android.net.Uri uri) throws defpackage.affa {
        defpackage.aify aifyVarBP = bP(uri);
        defpackage.ajje ajjeVar = new defpackage.ajje((char[]) null);
        ajjeVar.f = this;
        ajjeVar.a = bO(uri.getScheme());
        ajjeVar.b = this.c;
        ajjeVar.e = aifyVarBP;
        ajjeVar.c = uri;
        if (!aifyVarBP.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                java.lang.String str = (java.lang.String) arrayList.get(arrayList.size() - 1);
                java.util.ListIterator listIterator = aifyVarBP.listIterator(aifyVarBP.size());
                while (listIterator.hasPrevious()) {
                    ((defpackage.affz) listIterator.previous()).f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(android.text.TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        ajjeVar.d = uri;
        return new defpackage.ahbz(ajjeVar);
    }

    private final boolean bR() {
        try {
            for (java.lang.String str : ((android.content.Context) this.b).getResources().getStringArray(2130903087)) {
                java.lang.Object obj = this.c;
                java.lang.Object objG = new defpackage.mgr(((defpackage.oko) obj).h(), j$.util.Optional.ofNullable(((defpackage.oko) obj).j.getSimOperatorName())).a(defpackage.mgv.TELEPHONY_GET_SIM_OPERATOR_NAME).g(new mig(19));
                defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
                if (str.equalsIgnoreCase((java.lang.String) ((j$.util.Optional) objG).orElse((java.lang.Object) null))) {
                    return true;
                }
            }
            return false;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return true;
        }
    }

    public static java.lang.Object e(defpackage.aaum aaumVar) throws java.io.IOException {
        try {
            return defpackage.aazc.u(aaumVar, 30L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            e = e;
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.io.IOException) {
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e2);
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [aolr] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object A(android.net.Uri uri, android.content.ContentValues contentValues, defpackage.aoln aolnVar) {
        agtv agtvVar;
        java.lang.Object obj;
        ?? r11;
        if (aolnVar instanceof agtv) {
            agtvVar = (agtv) aolnVar;
            int i = agtvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                agtvVar.d = i - Integer.MIN_VALUE;
            } else {
                agtvVar = new agtv(this, aolnVar);
            }
        } else {
            agtvVar = new agtv(this, aolnVar);
        }
        java.lang.Object obj2 = agtvVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = agtvVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            ?? r13 = this.c;
            agtvVar.a = uri;
            agtvVar.e = contentValues;
            agtvVar.b = r13;
            agtvVar.d = 1;
            if (defpackage.ahre.a(r13, agtvVar) != aoluVar) {
                obj = uri;
                r11 = r13;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        java.lang.Object obj3 = agtvVar.b;
        contentValues = agtvVar.e;
        obj = agtvVar.a;
        defpackage.aooc.af(obj2);
        r11 = obj3;
        android.content.ContentValues contentValues2 = contentValues;
        defpackage.aolr aolrVarK = defpackage.afsq.K(r11);
        agtu agtuVar = new agtu((defpackage.aoln) null, this, (android.net.Uri) obj, contentValues2, 0);
        agtvVar.a = null;
        agtvVar.e = null;
        agtvVar.b = null;
        agtvVar.d = 2;
        java.lang.Object objAj = defpackage.aoov.aj(aolrVarK, agtuVar, agtvVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [aolr] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object B(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, defpackage.aoln aolnVar) {
        agtw agtwVar;
        java.lang.Object obj;
        ?? r12;
        if (aolnVar instanceof agtw) {
            agtwVar = (agtw) aolnVar;
            int i = agtwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                agtwVar.d = i - Integer.MIN_VALUE;
            } else {
                agtwVar = new agtw(this, aolnVar);
            }
        } else {
            agtwVar = new agtw(this, aolnVar);
        }
        java.lang.Object obj2 = agtwVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = agtwVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            ?? r15 = this.c;
            agtwVar.a = uri;
            agtwVar.e = contentValues;
            agtwVar.f = str;
            agtwVar.b = r15;
            agtwVar.d = 1;
            if (defpackage.ahre.a(r15, agtwVar) != aoluVar) {
                obj = uri;
                r12 = r15;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        java.lang.Object obj3 = agtwVar.b;
        str = agtwVar.f;
        contentValues = agtwVar.e;
        obj = agtwVar.a;
        defpackage.aooc.af(obj2);
        r12 = obj3;
        android.content.ContentValues contentValues2 = contentValues;
        java.lang.String str2 = str;
        defpackage.aolr aolrVarK = defpackage.afsq.K(r12);
        abjg abjgVar = new abjg((defpackage.aoln) null, this, (android.net.Uri) obj, contentValues2, str2, 2);
        agtwVar.a = null;
        agtwVar.e = null;
        agtwVar.f = null;
        agtwVar.b = null;
        agtwVar.d = 2;
        java.lang.Object objAj = defpackage.aoov.aj(aolrVarK, abjgVar, agtwVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final agsu E(java.lang.Class cls) {
        agsu agsuVar;
        defpackage.aooh.f(cls, "serviceClass");
        synchronized (this.a) {
            ?? r0 = this.b;
            java.lang.Object agsuVar2 = r0.get(cls);
            if (agsuVar2 == null) {
                him himVar = ((hil) ((rai) this.c).a).a;
                agsuVar2 = new agsu((android.content.Context) himVar.s.a(), (defpackage.agsp) himVar.aQ.a(), (defpackage.ajcu) himVar.r.a(), himVar.eQ(), cls);
                r0.put(cls, agsuVar2);
            }
            agsuVar = (agsu) agsuVar2;
        }
        return agsuVar;
    }

    public final defpackage.ajcq F() {
        defpackage.ajcq ajcqVarC = ((defpackage.afhf) this.a).c();
        return !ajcqVarC.isDone() ? new defpackage.agqc(this, ajcqVarC) : ajcqVarC;
    }

    public final defpackage.ajcq G(defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        return new defpackage.agqc(this, ((defpackage.afhf) this.a).a(ahycVar, new defpackage.agqe(this, executor, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [afvt, java.lang.Object] */
    public final void I(boolean z) {
        java.lang.Object obj = this.b;
        if (obj != null) {
            ((defpackage.afvu) obj).b(this.c, (android.view.View) this.a, z);
        }
    }

    public final void J() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            ((defpackage.afvu) obj).c((android.view.View) this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [affu, java.lang.Object] */
    public final long K(android.net.Uri uri) throws defpackage.affa {
        defpackage.ahbz ahbzVarBQ = bQ(uri);
        return ahbzVarBQ.b.a((android.net.Uri) ahbzVarBQ.c);
    }

    public final java.lang.Iterable L(android.net.Uri uri) throws defpackage.affa {
        defpackage.affu affuVarBO = bO(uri.getScheme());
        defpackage.aify aifyVarBP = bP(uri);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String encodedFragment = uri.getEncodedFragment();
        java.util.Iterator it = affuVarBO.g(bN(uri)).iterator();
        while (it.hasNext()) {
            android.net.Uri uriBuild = ((android.net.Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!aifyVarBP.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(uriBuild.getPathSegments());
                if (!arrayList2.isEmpty() && !uriBuild.getPath().endsWith("/")) {
                    java.lang.String str = (java.lang.String) defpackage.ahvr.bk(arrayList2);
                    java.util.Iterator it2 = aifyVarBP.iterator();
                    while (it2.hasNext()) {
                        ((defpackage.affz) it2.next()).e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    uriBuild = uriBuild.buildUpon().path(android.text.TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(uriBuild);
        }
        return arrayList;
    }

    public final java.lang.Object M(android.net.Uri uri, defpackage.afef afefVar) {
        return afefVar.a(bQ(uri));
    }

    public final void N(android.net.Uri uri) {
        bO(uri.getScheme()).i(bN(uri));
    }

    public final void O(android.net.Uri uri) {
        bO(uri.getScheme()).j(bN(uri));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [affu, java.lang.Object] */
    public final void P(android.net.Uri uri) throws defpackage.affa {
        defpackage.ahbz ahbzVarBQ = bQ(uri);
        ahbzVarBQ.b.k((android.net.Uri) ahbzVarBQ.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [affu, java.lang.Object] */
    public final void Q(android.net.Uri uri, android.net.Uri uri2) throws defpackage.affa {
        defpackage.ahbz ahbzVarBQ = bQ(uri);
        ?? r0 = ahbzVarBQ.b;
        defpackage.ahbz ahbzVarBQ2 = bQ(uri2);
        if (r0 != ahbzVarBQ2.b) {
            throw new defpackage.affa("Cannot rename file across backends");
        }
        r0.l((android.net.Uri) ahbzVarBQ.c, (android.net.Uri) ahbzVarBQ2.c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [affu, java.lang.Object] */
    public final boolean R(android.net.Uri uri) throws defpackage.affa {
        defpackage.ahbz ahbzVarBQ = bQ(uri);
        return ahbzVarBQ.b.m((android.net.Uri) ahbzVarBQ.c);
    }

    public final boolean S(android.net.Uri uri) {
        return bO(uri.getScheme()).n(bN(uri));
    }

    @java.lang.Deprecated
    public final void T(android.net.Uri uri) throws defpackage.affa {
        if (R(uri)) {
            if (!S(uri)) {
                P(uri);
                return;
            }
            java.util.Iterator it = L(uri).iterator();
            while (it.hasNext()) {
                T((android.net.Uri) it.next());
            }
            O(uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ahzi, java.lang.Object] */
    public final java.io.File U() {
        return new java.io.File(((java.lang.String) this.c.eZ()) + '/' + ((java.lang.String) this.b.eZ()) + ".pb");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final boolean V(defpackage.ahzi ahziVar) {
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            return ((defpackage.aepm) this.a).c.a == 2;
        }
        return defpackage.aepw.d((android.content.Context) this.b, (defpackage.aepx) ahziVar.eZ());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object W(defpackage.aoln aolnVar) {
        aefc aefcVar;
        defpackage.adtz adtzVar;
        int iR;
        defpackage.aduy aduyVar;
        defpackage.aihd aihdVar;
        if (aolnVar instanceof aefc) {
            aefcVar = (aefc) aolnVar;
            int i = aefcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aefcVar.b = i - Integer.MIN_VALUE;
            } else {
                aefcVar = new aefc(this, aolnVar);
            }
        } else {
            aefcVar = new aefc(this, aolnVar);
        }
        java.lang.Object objY = aefcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aefcVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objY);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objY);
            }
            adtzVar = (defpackage.adtz) objY;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                if (iR == 1) {
                    return (defpackage.adtv) adtzVar;
                }
                throw new defpackage.aois();
            }
            java.util.List list = (java.util.List) ((defpackage.adub) adtzVar).a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                aduyVar = (defpackage.aduy) obj;
                if (!defpackage.aesg.k(aduyVar.f) && aduyVar.i != null && (aihdVar = aduyVar.h) != null && aihdVar.contains(defpackage.aegl.IN_APP)) {
                    arrayList.add(obj);
                }
            }
            return new defpackage.adub(arrayList);
        }
        defpackage.aooc.af(objY);
        java.lang.Object obj2 = this.c;
        aefcVar.b = 1;
        objY = ((defpackage.aogc) obj2).Y(aefcVar);
        if (objY == aoluVar) {
            return aoluVar;
        }
        aefcVar.b = 2;
        objY = ((defpackage.aeee) objY).c(aefcVar);
        if (objY == aoluVar) {
            return aoluVar;
        }
        adtzVar = (defpackage.adtz) objY;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR == 1) {
                return (defpackage.adtv) adtzVar;
            }
            throw new defpackage.aois();
        }
        java.util.List list2 = (java.util.List) ((defpackage.adub) adtzVar).a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r5.hasNext()) {
            aduyVar = (defpackage.aduy) obj;
            if (!defpackage.aesg.k(aduyVar.f)) {
            }
        }
        return new defpackage.adub(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [amwu, java.lang.Object] */
    public final defpackage.aeee X(defpackage.aduw aduwVar) {
        defpackage.aooh.f(aduwVar, "targetType");
        if (aduwVar.a()) {
            java.lang.Object objA = this.c.a();
            defpackage.aooh.e(objA, "get(...)");
            return (defpackage.aeee) objA;
        }
        if (!aduwVar.b()) {
            throw new java.lang.IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
        }
        java.lang.Object objA2 = this.a.a();
        defpackage.aooh.e(objA2, "get(...)");
        return (defpackage.aeee) objA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [amwu, java.lang.Object] */
    public final java.lang.Object Y(defpackage.aoln aolnVar) {
        aeen aeenVar;
        if (aolnVar instanceof aeen) {
            aeenVar = (aeen) aolnVar;
            int i = aeenVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeenVar.b = i - Integer.MIN_VALUE;
            } else {
                aeenVar = new aeen(this, aolnVar);
            }
        } else {
            aeenVar = new aeen(this, aolnVar);
        }
        java.lang.Object objK = aeenVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeenVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.adao adaoVar = (defpackage.adao) this.b.a();
            aeenVar.b = 1;
            objK = adaoVar.k(aeenVar);
            if (objK == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            java.lang.Object objA = this.c.a();
            defpackage.aooh.c(objA);
            return (defpackage.aeee) objA;
        }
        java.lang.Object objA2 = this.a.a();
        defpackage.aooh.c(objA2);
        return (defpackage.aeee) objA2;
    }

    public final j$.util.Optional Z(java.util.List list) {
        java.lang.Object obj = this.a;
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(list);
        j$.util.Objects.requireNonNull(obj);
        j$.util.stream.Stream streamFilter = stream.filter(new defpackage.tcw(obj, 11));
        j$.util.Objects.requireNonNull(obj);
        return streamFilter.map(new defpackage.okq(obj, 9)).findFirst();
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method methodBE = bE(obj.getClass());
            if (methodBE != null) {
                try {
                    return methodBE.invoke(obj, objArr);
                } catch (java.lang.IllegalAccessException e) {
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: ".concat(methodBE.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            java.lang.Object obj2 = this.b;
            throw new java.lang.AssertionError("Method " + ((java.lang.String) obj2) + " not supported for object " + java.lang.String.valueOf(obj));
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable targetException = e2.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError2 = new java.lang.AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq aA() {
        return defpackage.ahvr.H(((defpackage.tcv) this.a).a(), new tbp(2), this.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoin, java.lang.Object] */
    public final defpackage.zzx aB(java.lang.String str, defpackage.ahbq ahbqVar) {
        android.content.Context context = (android.content.Context) this.a.a();
        context.getClass();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.b.a();
        scheduledExecutorService.getClass();
        defpackage.zzx zzxVar = (defpackage.zzx) this.c.a();
        zzxVar.getClass();
        defpackage.nya nyaVar = new defpackage.nya(str, 15);
        ahbqVar.getClass();
        return new defpackage.zzx(new defpackage.afhx(context, scheduledExecutorService, zzxVar, nyaVar, ahbqVar, null));
    }

    public final boolean aC() {
        if (bR()) {
            android.content.Context context = (android.content.Context) this.b;
            if (context.getResources().getBoolean(2131034154) && context.getPackageManager().hasSystemFeature("com.motorola.software.sprint.hd_call")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final boolean aD() {
        return ((java.lang.Boolean) this.a.a()).booleanValue() && ((android.content.Context) this.b).getResources().getBoolean(2131034152);
    }

    public final void aE(android.view.View view, java.lang.Runnable runnable) {
        defpackage.aooh.f(view, "view");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ykz(view, this, runnable, 1));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final void aF(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            defpackage.aooh.i("view");
        }
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        java.lang.Runnable runnableH = defpackage.ahqx.h(runnable);
        java.lang.Object objA = this.c.a();
        defpackage.aooh.e(objA, "get(...)");
        view.getViewTreeObserver().addOnDrawListener(new defpackage.ruf(view, viewTreeObserver, runnableH, ((java.lang.Boolean) objA).booleanValue()));
    }

    public final void aG(android.view.View view, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        defpackage.aooh.f(view, "view");
        aE(view, runnable2);
        aF(view, runnable);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq aH() {
        return defpackage.aosv.F(this.c, 0, new ogf(this, (defpackage.aoln) null, 18), 3);
    }

    public final akfx aI() {
        defpackage.akfh.a((android.content.Context) this.a);
        akfx akfxVarH = akfx.h();
        defpackage.aooh.e(akfxVarH, "getInstance(...)");
        return akfxVarH;
    }

    public final akfy aJ() {
        defpackage.akfh.a((android.content.Context) this.a);
        akfy akfyVar = akfy.a;
        defpackage.aooh.e(akfyVar, "getInstance(...)");
        return akfyVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object aK(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new pbw(this, (defpackage.aoln) null, 1), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq aL(ajzm ajzmVar) {
        return defpackage.ahvr.B(this.a.a(ajzmVar), ajzi.class, new mjl(new npi(this, 20), 6), this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final defpackage.mgu aM(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) this.a, j$.util.Optional.ofNullable(phoneAccountHandle), new defpackage.okq(new defpackage.mdr(this, 11), 0));
        if (objComputeIfAbsent == null) {
            defpackage.aooh.g();
        }
        return (defpackage.mgu) objComputeIfAbsent;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq aN(long j) {
        return defpackage.aosv.F(this.a, 0, new atg(this, j, (defpackage.aoln) null, 18, (char[]) null), 3);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object aO(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new nrw(this, list, (defpackage.aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aP(long j, defpackage.aoln aolnVar) {
        nrx nrxVar;
        if (aolnVar instanceof nrx) {
            nrxVar = (nrx) aolnVar;
            int i = nrxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrxVar.b = i - Integer.MIN_VALUE;
            } else {
                nrxVar = new nrx(this, aolnVar);
            }
        } else {
            nrxVar = new nrx(this, aolnVar);
        }
        java.lang.Object objH = nrxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrxVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objH);
            java.lang.Object obj = this.b;
            nrxVar.b = 1;
            objH = ((defpackage.nri) obj).h(j, nrxVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objH);
        }
        nsp nspVar = (nsp) objH;
        if (nspVar == null) {
            return null;
        }
        nsq nsqVar = nspVar.e;
        if (nsqVar == null) {
            nsqVar = nsq.a;
        }
        if (nsqVar == null || (nsqVar.b & 4) == 0) {
            return null;
        }
        nsl nslVar = nsqVar.e;
        if (nslVar == null) {
            nslVar = nsl.a;
        }
        java.lang.String str = nslVar.c;
        defpackage.aooh.e(str, "getAudioPath(...)");
        if (str.length() != 0) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aQ(java.util.List list, defpackage.aoln aolnVar) {
        nrz nrzVar;
        if (aolnVar instanceof nrz) {
            nrzVar = (nrz) aolnVar;
            int i = nrzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrzVar.b = i - Integer.MIN_VALUE;
            } else {
                nrzVar = new nrz(this, aolnVar);
            }
        } else {
            nrzVar = new nrz(this, aolnVar);
        }
        java.lang.Object objI = nrzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nrzVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objI);
            java.lang.Object obj = this.b;
            nrzVar.b = 1;
            objI = ((defpackage.nri) obj).i(list, nrzVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objI);
        }
        java.lang.Iterable<nsp> iterable = (java.lang.Iterable) objI;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(iterable, 10)), 16));
        for (nsp nspVar : iterable) {
            java.lang.Long l = new java.lang.Long(nspVar.c);
            defpackage.aooh.c(nspVar);
            linkedHashMap.put(l, defpackage.mni.as(nspVar));
        }
        return defpackage.ahvr.bw(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object aR(long j, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new atg(this, j, (defpackage.aoln) null, 16), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object aS(long j, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new atg(this, j, (defpackage.aoln) null, 17, (byte[]) null), aolnVar);
    }

    public final java.lang.Object aT(long j, int i, defpackage.aoln aolnVar) {
        npw npwVarAw = defpackage.mni.aw(nsm.a.m());
        npwVarAw.y(i);
        return ((defpackage.nri) this.b).k(j, npwVarAw.t(), aolnVar);
    }

    public final defpackage.ajcq aU(java.lang.String str) {
        return ((defpackage.kaw) this.c).p(((defpackage.aogc) this.b).bl(new defpackage.jsd(defpackage.ahqx.a(new jss(str, 17)), 9)));
    }

    public final defpackage.ajcq aV(java.util.Set set) {
        return ((defpackage.kaw) this.c).p(((defpackage.aogc) this.b).bl(new defpackage.jsd(defpackage.ahqx.a(new jss(set, 20)), 9)));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq aW() {
        return defpackage.ahvr.H(((defpackage.aogc) this.b).bk(), new kwz(4), this.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq aX() {
        return defpackage.ahvr.H(aW(), new jvq(20), this.a);
    }

    public final defpackage.ajcq aY(boolean z) {
        return ((defpackage.kaw) this.c).p(((defpackage.aogc) this.b).bl(new defpackage.jsd(defpackage.ahqx.a(new kxa(z, 1)), 9)));
    }

    public final defpackage.ajcq aZ() {
        return ((defpackage.kaw) this.c).p(((defpackage.aogc) this.b).bl(new defpackage.jsd(defpackage.ahqx.a(new kwz(5)), 9)));
    }

    public final j$.util.Optional aa(java.lang.String str) {
        return j$.util.Collection.-EL.stream(((defpackage.aigf) this.a).values()).filter(new abdh(str, 9)).findFirst();
    }

    public final j$.util.Optional ab(java.lang.String str) {
        return j$.util.Optional.ofNullable((defpackage.adsi) ((defpackage.aigf) this.a).get(str));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.List ac(defpackage.adid adidVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.admg admgVar : this.b.values()) {
            if (admgVar.b.equals(adidVar)) {
                arrayList.add(admgVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void ad(defpackage.adnf adnfVar) {
        defpackage.adid adidVar = adnfVar.e;
        if (ac(adidVar).isEmpty()) {
            adnfVar.f.run();
            this.a.remove(adidVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean ae(java.lang.String str) {
        return this.b.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void af() {
        java.util.Collection collectionValues = this.b.values();
        java.util.Set set = defpackage.adik.a;
        defpackage.adik.e(collectionValues, new defpackage.adcu(8));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq ag(java.lang.Object obj) {
        defpackage.ajcq ajcqVar;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        ai(obj);
        ?? r1 = this.a;
        synchronized (r1) {
            defpackage.adii adiiVar = (defpackage.adii) r1.get(obj);
            if (adiiVar != null) {
                synchronized (adiiVar) {
                    try {
                        ajcqVar = adiiVar.b;
                        if (ajcqVar == null) {
                            adiiVar.c.b();
                            adiiVar.b = new defpackage.ajdd();
                            ajcqVar = adiiVar.b;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } else {
                ajcqVar = defpackage.ajcm.a;
            }
        }
        return ajcqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ajct, java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq ah(java.lang.Object obj, defpackage.adih adihVar) {
        defpackage.adii adiiVar;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        ai(obj);
        ?? r1 = this.a;
        synchronized (r1) {
            adiiVar = (defpackage.adii) r1.get(obj);
            if (adiiVar == null) {
                defpackage.adii adiiVar2 = new defpackage.adii();
                r1.put(obj, adiiVar2);
                ?? r0 = this.b;
                defpackage.ajcq ajcqVarSubmit = r0.submit(new defpackage.adre(this, adihVar, adiiVar2, obj, 1));
                adiiVar2.a = defpackage.aiql.Z(ajcqVarSubmit).c(new defpackage.adlp(this, obj, adiiVar2, ajcqVarSubmit, 1), r0);
                adiiVar = adiiVar2;
            }
        }
        return defpackage.aiql.A(adiiVar.a);
    }

    public final void ai(java.lang.Object obj) {
        obj.toString();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x023f A[Catch: all -> 0x0323, akeg -> 0x0325, IllegalStateException -> 0x0327, PHI: r20 r25
      0x023f: PHI (r20v18 aism) = (r20v5 aism), (r20v6 aism), (r20v19 aism) binds: [B:116:0x0238, B:112:0x0226, B:110:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r25v23 java.lang.Object) = (r25v1 java.lang.Object), (r25v2 java.lang.Object), (r25v24 java.lang.Object) binds: [B:116:0x0238, B:112:0x0226, B:110:0x0217] A[DONT_GENERATE, DONT_INLINE], TryCatch #10 {akeg -> 0x0325, IllegalStateException -> 0x0327, all -> 0x0323, blocks: (B:113:0x0228, B:99:0x01f2, B:101:0x01fb, B:102:0x0206, B:118:0x023f, B:120:0x024e, B:122:0x0252, B:123:0x025b, B:124:0x026d, B:117:0x023a, B:126:0x027a, B:127:0x0291, B:129:0x0297, B:131:0x02a1, B:133:0x02a9, B:136:0x02ae, B:138:0x02b4, B:140:0x02bc, B:142:0x02c4, B:144:0x02d7, B:145:0x02e0, B:146:0x02e7, B:147:0x02e8, B:148:0x02ec, B:150:0x02f2, B:151:0x0300), top: B:214:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x024e A[Catch: all -> 0x0323, akeg -> 0x0325, IllegalStateException -> 0x0327, TryCatch #10 {akeg -> 0x0325, IllegalStateException -> 0x0327, all -> 0x0323, blocks: (B:113:0x0228, B:99:0x01f2, B:101:0x01fb, B:102:0x0206, B:118:0x023f, B:120:0x024e, B:122:0x0252, B:123:0x025b, B:124:0x026d, B:117:0x023a, B:126:0x027a, B:127:0x0291, B:129:0x0297, B:131:0x02a1, B:133:0x02a9, B:136:0x02ae, B:138:0x02b4, B:140:0x02bc, B:142:0x02c4, B:144:0x02d7, B:145:0x02e0, B:146:0x02e7, B:147:0x02e8, B:148:0x02ec, B:150:0x02f2, B:151:0x0300), top: B:214:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0252 A[Catch: all -> 0x0323, akeg -> 0x0325, IllegalStateException -> 0x0327, TryCatch #10 {akeg -> 0x0325, IllegalStateException -> 0x0327, all -> 0x0323, blocks: (B:113:0x0228, B:99:0x01f2, B:101:0x01fb, B:102:0x0206, B:118:0x023f, B:120:0x024e, B:122:0x0252, B:123:0x025b, B:124:0x026d, B:117:0x023a, B:126:0x027a, B:127:0x0291, B:129:0x0297, B:131:0x02a1, B:133:0x02a9, B:136:0x02ae, B:138:0x02b4, B:140:0x02bc, B:142:0x02c4, B:144:0x02d7, B:145:0x02e0, B:146:0x02e7, B:147:0x02e8, B:148:0x02ec, B:150:0x02f2, B:151:0x0300), top: B:214:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x025b A[Catch: all -> 0x0323, akeg -> 0x0325, IllegalStateException -> 0x0327, TryCatch #10 {akeg -> 0x0325, IllegalStateException -> 0x0327, all -> 0x0323, blocks: (B:113:0x0228, B:99:0x01f2, B:101:0x01fb, B:102:0x0206, B:118:0x023f, B:120:0x024e, B:122:0x0252, B:123:0x025b, B:124:0x026d, B:117:0x023a, B:126:0x027a, B:127:0x0291, B:129:0x0297, B:131:0x02a1, B:133:0x02a9, B:136:0x02ae, B:138:0x02b4, B:140:0x02bc, B:142:0x02c4, B:144:0x02d7, B:145:0x02e0, B:146:0x02e7, B:147:0x02e8, B:148:0x02ec, B:150:0x02f2, B:151:0x0300), top: B:214:0x0228 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd A[Catch: all -> 0x020e, akeg -> 0x0211, IllegalStateException -> 0x0214, PHI: r25
      0x01cd: PHI (r25v18 java.lang.Object) = 
      (r25v6 java.lang.Object)
      (r25v7 java.lang.Object)
      (r25v8 java.lang.Object)
      (r25v9 java.lang.Object)
      (r25v10 java.lang.Object)
      (r25v11 java.lang.Object)
      (r25v12 java.lang.Object)
      (r25v13 java.lang.Object)
      (r25v14 java.lang.Object)
      (r25v15 java.lang.Object)
      (r25v16 java.lang.Object)
      (r25v19 java.lang.Object)
     binds: [B:89:0x01c3, B:85:0x01b1, B:81:0x019d, B:76:0x0186, B:72:0x0174, B:68:0x0156, B:64:0x0148, B:60:0x0136, B:56:0x0124, B:52:0x0114, B:46:0x00f2, B:230:0x01cd] A[DONT_GENERATE, DONT_INLINE], TryCatch #11 {akeg -> 0x0211, IllegalStateException -> 0x0214, all -> 0x020e, blocks: (B:31:0x00ac, B:38:0x00c9, B:39:0x00cc, B:41:0x00d2, B:42:0x00e1, B:44:0x00e7, B:91:0x01cd, B:49:0x0100, B:53:0x0116, B:57:0x0126, B:61:0x0138, B:65:0x014a, B:69:0x0158, B:73:0x0176, B:77:0x0188, B:82:0x019f, B:86:0x01b3, B:90:0x01c5, B:92:0x01dc, B:94:0x01e3, B:97:0x01ea), top: B:212:0x00ac }] */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x034b: INVOKE (r9 I:aism) VIRTUAL call: aism.close():void A[Catch: all -> 0x034f, MD:():void (m), TRY_ENTER] (LINE:844), block:B:174:0x034b */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final com.google.android.libraries.micore.superpacks.SuperpackManifest aj(java.lang.String str, int i, java.io.File file) {
        defpackage.adge adgeVar;
        defpackage.aism aismVarClose;
        defpackage.aism aismVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        synchronized (this) {
            java.lang.Object obj3 = this.b;
            defpackage.adge adgeVar2 = (defpackage.adge) ((android.util.LruCache) obj3).get(file);
            if (!file.exists()) {
                if (adgeVar2 != null) {
                    ((android.util.LruCache) obj3).remove(file);
                }
                return null;
            }
            if (adgeVar2 == null) {
                adgeVar2 = null;
            } else if (file.lastModified() > adgeVar2.c) {
                ((android.util.LruCache) obj3).remove(file);
                adgeVar2 = null;
            }
            if (adgeVar2 == null) {
                try {
                    defpackage.aism aismVar2 = new defpackage.aism();
                    try {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                        aismVar2.c(fileInputStream);
                        java.lang.Object obj4 = (defpackage.adgd) this.a.get(str);
                        if (obj4 == null) {
                            obj4 = this.c;
                        }
                        try {
                            try {
                                defpackage.aiof aiofVar = defpackage.adhn.a;
                                defpackage.adik.d(file);
                                defpackage.aism aismVar3 = new defpackage.aism();
                                try {
                                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                                    aismVar3.c(inputStreamReader);
                                    defpackage.akex akexVar = new defpackage.akex(inputStreamReader);
                                    aismVar3.c(akexVar);
                                    akexVar.r(defpackage.akej.a);
                                    akexVar.n();
                                    defpackage.adgm adgmVarE = com.google.android.libraries.micore.superpacks.SuperpackManifest.e();
                                    defpackage.adik.k("version", i);
                                    com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName autoValue_VersionedName = new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(str, i);
                                    java.util.ArrayList<defpackage.adis> arrayList = new java.util.ArrayList();
                                    java.util.HashMap map = new java.util.HashMap();
                                    java.lang.String strK = null;
                                    java.lang.String strK2 = null;
                                    while (akexVar.s()) {
                                        java.lang.String strI = akexVar.i();
                                        obj3 = obj3;
                                        switch (strI.hashCode()) {
                                            case -1742931994:
                                                aismVar = aismVar2;
                                                obj = obj4;
                                                if (strI.equals("base_download_url")) {
                                                    strK = akexVar.k();
                                                } else {
                                                    java.lang.Object objZ = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                    if (adgmVarE.a == null) {
                                                        if (adgmVarE.b == null) {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                        } else {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                            adgmVarE.a.l(adgmVarE.b);
                                                            adgmVarE.b = null;
                                                        }
                                                    }
                                                    adgmVarE.a.i(strI, objZ);
                                                }
                                                aismVar2 = aismVar;
                                                obj4 = obj;
                                                break;
                                            case 3373707:
                                                aismVar = aismVar2;
                                                obj = obj4;
                                                if (strI.equals("name")) {
                                                    try {
                                                        defpackage.aiof aiofVar2 = defpackage.adhn.a;
                                                        akexVar.k();
                                                    } catch (defpackage.akeg e) {
                                                        e = e;
                                                        throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                                    } catch (java.lang.IllegalStateException e2) {
                                                        e = e2;
                                                        throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                                    } catch (java.lang.Throwable th) {
                                                        th = th;
                                                        throw aismVar3.b(th, defpackage.adgf.class);
                                                    }
                                                } else {
                                                    java.lang.Object objZ2 = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                    if (adgmVarE.a == null) {
                                                        if (adgmVarE.b == null) {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                        } else {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                            adgmVarE.a.l(adgmVarE.b);
                                                            adgmVarE.b = null;
                                                        }
                                                    }
                                                    adgmVarE.a.i(strI, objZ2);
                                                }
                                                aismVar2 = aismVar;
                                                obj4 = obj;
                                                break;
                                            case 106422650:
                                                if (strI.equals("packs")) {
                                                    akexVar.m();
                                                    while (akexVar.s()) {
                                                        akexVar.n();
                                                        final defpackage.adis adisVarQ = com.google.android.libraries.micore.superpacks.common.PackManifest.q();
                                                        boolean z = true;
                                                        java.lang.String str2 = null;
                                                        defpackage.aify aifyVarH = null;
                                                        java.lang.String strK3 = null;
                                                        while (akexVar.s()) {
                                                            java.lang.String strI2 = akexVar.i();
                                                            switch (strI2.hashCode()) {
                                                                case -1351091333:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("download_priority")) {
                                                                        adisVarQ.h(akexVar.d());
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case -267449012:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("verify_sizes")) {
                                                                        adisVarQ.n(akexVar.t());
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case -120789592:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("validation_schemes")) {
                                                                        final int i2 = 0;
                                                                        defpackage.adgd.c(akexVar, new defpackage.adgb() { // from class: adfz
                                                                            @Override // defpackage.adgb
                                                                            public final void a(java.lang.Object obj5) {
                                                                                if (i2 != 0) {
                                                                                    ((defpackage.aift) adisVarQ).i(obj5);
                                                                                    return;
                                                                                }
                                                                                int i3 = defpackage.adho.a;
                                                                                if (obj5 != null) {
                                                                                    defpackage.adho.e((java.lang.String) obj5);
                                                                                }
                                                                                ((defpackage.adis) adisVarQ).b().i(obj5);
                                                                            }
                                                                        });
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 3373707:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("name")) {
                                                                        java.lang.String strK4 = akexVar.k();
                                                                        adisVarQ.k(strK4);
                                                                        str2 = strK4;
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 3530753:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("size")) {
                                                                        adisVarQ.m(akexVar.e());
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 31911483:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("download_urls")) {
                                                                        final defpackage.aift aiftVar = new defpackage.aift(4);
                                                                        final int i3 = 1;
                                                                        defpackage.adgd.c(akexVar, new defpackage.adgb() { // from class: adfz
                                                                            @Override // defpackage.adgb
                                                                            public final void a(java.lang.Object obj5) {
                                                                                if (i3 != 0) {
                                                                                    ((defpackage.aift) aiftVar).i(obj5);
                                                                                    return;
                                                                                }
                                                                                int i4 = defpackage.adho.a;
                                                                                if (obj5 != null) {
                                                                                    defpackage.adho.e((java.lang.String) obj5);
                                                                                }
                                                                                ((defpackage.adis) aiftVar).b().i(obj5);
                                                                            }
                                                                        });
                                                                        aifyVarH = aiftVar.g();
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 475919162:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("expiry_date")) {
                                                                        defpackage.adgd.b(akexVar, adisVarQ, autoValue_VersionedName);
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 489126399:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("compressed_size")) {
                                                                        adisVarQ.g(akexVar.e());
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 542660007:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("gc_priority")) {
                                                                        adisVarQ.j(akexVar.d());
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 995046418:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("download_packing_scheme")) {
                                                                        strK3 = akexVar.k();
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    }
                                                                    obj4 = obj2;
                                                                    break;
                                                                case 1252218203:
                                                                    obj2 = obj4;
                                                                    if (strI2.equals("namespace")) {
                                                                        adisVarQ.l(akexVar.k());
                                                                        obj4 = obj2;
                                                                        z = false;
                                                                    } else {
                                                                        adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                        obj4 = obj2;
                                                                    }
                                                                    break;
                                                                default:
                                                                    obj2 = obj4;
                                                                    adisVarQ.e(strI2, ((defpackage.adgd) obj2).c.z(akexVar, 0));
                                                                    obj4 = obj2;
                                                                    break;
                                                            }
                                                        }
                                                        java.lang.Object obj5 = obj4;
                                                        akexVar.p();
                                                        if (z) {
                                                            adisVarQ.l(str);
                                                        }
                                                        java.lang.String str3 = str2;
                                                        if (str3 != null) {
                                                            map.put(str3, new defpackage.adgc(aifyVarH, strK3));
                                                        }
                                                        adisVarQ.a = autoValue_VersionedName;
                                                        arrayList.add(adisVarQ);
                                                        aismVar2 = aismVar2;
                                                        obj4 = obj5;
                                                    }
                                                    aismVar = aismVar2;
                                                    obj = obj4;
                                                    akexVar.o();
                                                } else {
                                                    aismVar = aismVar2;
                                                    obj = obj4;
                                                    java.lang.Object objZ3 = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                    if (adgmVarE.a == null) {
                                                        if (adgmVarE.b == null) {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                        } else {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                            adgmVarE.a.l(adgmVarE.b);
                                                            adgmVarE.b = null;
                                                        }
                                                    }
                                                    adgmVarE.a.i(strI, objZ3);
                                                }
                                                aismVar2 = aismVar;
                                                obj4 = obj;
                                                break;
                                            case 351608024:
                                                if (strI.equals("version")) {
                                                    aismVar = aismVar2;
                                                    obj = obj4;
                                                    defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                                    akexVar.k();
                                                    aismVar2 = aismVar;
                                                    obj4 = obj;
                                                }
                                                aismVar = aismVar2;
                                                obj = obj4;
                                                java.lang.Object objZ4 = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                if (adgmVarE.a == null) {
                                                    if (adgmVarE.b == null) {
                                                        adgmVarE.a = new defpackage.aigb(4);
                                                    } else {
                                                        adgmVarE.a = new defpackage.aigb(4);
                                                        adgmVarE.a.l(adgmVarE.b);
                                                        adgmVarE.b = null;
                                                    }
                                                }
                                                adgmVarE.a.i(strI, objZ4);
                                                aismVar2 = aismVar;
                                                obj4 = obj;
                                                break;
                                            case 995046418:
                                                if (strI.equals("download_packing_scheme")) {
                                                    try {
                                                        strK2 = akexVar.k();
                                                    } catch (defpackage.akeg e3) {
                                                        e = e3;
                                                        throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                                    } catch (java.lang.IllegalStateException e4) {
                                                        e = e4;
                                                        throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                                    } catch (java.lang.Throwable th2) {
                                                        th = th2;
                                                        throw aismVar3.b(th, defpackage.adgf.class);
                                                    }
                                                } else {
                                                    aismVar = aismVar2;
                                                    obj = obj4;
                                                    java.lang.Object objZ5 = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                    if (adgmVarE.a == null) {
                                                        if (adgmVarE.b == null) {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                        } else {
                                                            adgmVarE.a = new defpackage.aigb(4);
                                                            adgmVarE.a.l(adgmVarE.b);
                                                            adgmVarE.b = null;
                                                        }
                                                    }
                                                    adgmVarE.a.i(strI, objZ5);
                                                    aismVar2 = aismVar;
                                                    obj4 = obj;
                                                }
                                                break;
                                            default:
                                                aismVar = aismVar2;
                                                obj = obj4;
                                                java.lang.Object objZ6 = ((defpackage.adgd) obj).c.z(akexVar, 0);
                                                if (adgmVarE.a == null) {
                                                    if (adgmVarE.b == null) {
                                                        adgmVarE.a = new defpackage.aigb(4);
                                                    } else {
                                                        adgmVarE.a = new defpackage.aigb(4);
                                                        adgmVarE.a.l(adgmVarE.b);
                                                        adgmVarE.b = null;
                                                    }
                                                }
                                                adgmVarE.a.i(strI, objZ6);
                                                aismVar2 = aismVar;
                                                obj4 = obj;
                                                break;
                                        }
                                    }
                                    java.lang.Object obj6 = obj3;
                                    defpackage.aism aismVar4 = aismVar2;
                                    java.lang.Object obj7 = obj4;
                                    int i4 = 0;
                                    akexVar.p();
                                    defpackage.adga adgaVar = new defpackage.adga(strK, strK2);
                                    java.lang.String str4 = adgaVar.b;
                                    java.lang.String str5 = adgaVar.a;
                                    for (defpackage.adis adisVar : arrayList) {
                                        java.lang.String str6 = adisVar.b;
                                        if (str6 == null) {
                                            throw new java.lang.IllegalStateException("Property \"name\" has not been set");
                                        }
                                        defpackage.adgc adgcVar = (defpackage.adgc) map.get(str6);
                                        if (adgcVar != null) {
                                            java.lang.String str7 = adgcVar.b;
                                            if (str7 == null) {
                                                str7 = str4;
                                            }
                                            adisVar.c = str7;
                                            defpackage.aify aifyVar = adgcVar.a;
                                            if (aifyVar != null) {
                                                int i5 = ((defpackage.aike) aifyVar).d;
                                                int i6 = i4;
                                                while (i6 < i5) {
                                                    java.lang.String string = (java.lang.String) aifyVar.get(i6);
                                                    if (str5 != null) {
                                                        string = new java.net.URL(new java.net.URL(str5), string).toString();
                                                    }
                                                    adisVar.d(string);
                                                    i6++;
                                                    str4 = str4;
                                                    i4 = 0;
                                                }
                                            }
                                        }
                                    }
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        adgmVarE.b(((defpackage.adis) it.next()).a());
                                    }
                                    adgmVarE.d(str);
                                    adgmVarE.e(i);
                                    adgmVarE.c(((defpackage.adgd) obj7).a);
                                    com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestA = adgmVarE.a();
                                    aismVar3.close();
                                    adgeVar = new defpackage.adge(superpackManifestA, file.lastModified());
                                    aismVar4.close();
                                    adgeVar2 = adgeVar;
                                    ((android.util.LruCache) obj6).put(file, adgeVar2);
                                } catch (defpackage.akeg e5) {
                                    e = e5;
                                    throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                } catch (java.lang.IllegalStateException e6) {
                                    e = e6;
                                    throw new defpackage.adgf(defpackage.a.bu(i, str, "Failed to parse manifest for ", ", version: "), e);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                }
                            } catch (java.lang.Throwable th4) {
                                aismVarClose.close();
                                throw th4;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            try {
                                throw aismVar2.b(th, defpackage.adgf.class);
                            } catch (java.lang.Throwable th6) {
                                aismVar2.close();
                                throw th6;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                } catch (defpackage.adgf e7) {
                    adgeVar = new defpackage.adge(e7, file.lastModified());
                }
            }
            defpackage.adgf adgfVar = adgeVar2.b;
            if (adgfVar != null) {
                throw adgfVar;
            }
            return adgeVar2.a;
        }
    }

    public final /* synthetic */ void ak(defpackage.acxf acxfVar) {
        defpackage.gsi gsiVar;
        java.lang.String str = acxfVar.a;
        java.lang.String strAY = defpackage.agab.aY(str, (defpackage.ahyn) this.a);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduling periodic tasks for MDD lib ");
        sb.append(strAY);
        sb.append(' ');
        long j = acxfVar.b;
        sb.append(j);
        android.util.Log.d("MDDTikTokTaskScheduler", sb.toString());
        defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
        ipcVar.x("MDD_TASK_TAG_KEY", str);
        ipcVar.w("MDD_TASK_PERIOD_HOURS_KEY", j / 3600);
        int i = acxfVar.d;
        if (i == 0) {
            throw null;
        }
        defpackage.ahyn ahynVar = acxfVar.c;
        ipcVar.x("MDD_TASK_NETWORK_STATE_KEY", defpackage.agab.cr(i));
        ipcVar.u("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY", ((java.lang.Boolean) ahynVar.a(new defpackage.adcu(1 == true ? 1 : 0)).d(java.lang.Boolean.FALSE)).booleanValue());
        defpackage.ahyn ahynVarA = ahynVar.a(new defpackage.adcu(0));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ipcVar.u("MDD_TASK_REQUIRES_CHARGING_KEY", ((java.lang.Boolean) ahynVarA.d(bool)).booleanValue());
        ipcVar.u("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY", ((java.lang.Boolean) ahynVar.a(new defpackage.adcu(2)).d(bool)).booleanValue());
        defpackage.grp grpVarQ = ipcVar.q();
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.adcv.class);
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.b = ahynVar.f() ? ((defpackage.acxd) ahynVar.b()).a : true;
        grlVar.a = ahynVar.f() ? ((defpackage.acxd) ahynVar.b()).b : true;
        grlVar.e = ahynVar.f() && ((defpackage.acxd) ahynVar.b()).c;
        int i2 = i - 1;
        if (i2 != 0) {
            gsiVar = i2 != 2 ? defpackage.gsi.c : defpackage.gsi.a;
        } else {
            gsiVar = defpackage.gsi.b;
        }
        grlVar.b(gsiVar);
        aguvVarA.b(grlVar.a());
        aguvVarA.f(new defpackage.aguy(strAY, 3));
        aguvVarA.d(new defpackage.aguw(new defpackage.agux(j, java.util.concurrent.TimeUnit.SECONDS), defpackage.ahwt.a));
        aguvVarA.f = grpVarQ;
        defpackage.ajcq ajcqVarI = ((defpackage.ahbz) this.c).i(aguvVarA.a());
        defpackage.adcw adcwVar = new defpackage.adcw(this, strAY, j);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ahvr.J(ajcqVarI, adcwVar, ajbmVar);
        ((defpackage.afhf) this.b).a(new defpackage.adcu(3), ajbmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r4 > 1800000) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ahzi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void al(int r20, int r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L86
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.eZ()     // Catch: java.lang.Throwable -> L86
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L86
            double r4 = r0.doubleValue()     // Catch: java.lang.Throwable -> L86
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L86
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L86
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            java.lang.Object r0 = r1.b     // Catch: java.lang.Throwable -> L86
            r4 = r0
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4     // Catch: java.lang.Throwable -> L86
            long r4 = r4.get()     // Catch: java.lang.Throwable -> L86
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L41
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch: java.lang.Throwable -> L86
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L86
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L86
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L82
        L41:
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.eZ()     // Catch: java.lang.Throwable -> L86
            aahq r0 = (defpackage.aahq) r0     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L86
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r6 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.common.internal.MethodInvocation r7 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L86
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            long r8 = r8 - r26
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L86
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r9 = r21
            r11 = r22
            r13 = r24
            r18 = r8
            r8 = r20
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L86
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L86
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L86
            r4.<init>(r8, r6)     // Catch: java.lang.Throwable -> L86
            aaum r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L86
            acai r4 = new acai     // Catch: java.lang.Throwable -> L86
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L86
            r0.q(r4)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r19)
            goto L83
        L82:
            monitor-exit(r19)
        L83:
            return
        L84:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L86
            throw r0
        L86:
            r0 = move-exception
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogc.al(int, int, long, long, long):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final /* bridge */ /* synthetic */ zur am(java.lang.String str) {
        aavx aavxVar = (aavx) this.c.a();
        aavxVar.getClass();
        aawd aawdVar = (aawd) this.b.a();
        aawdVar.getClass();
        defpackage.ajct ajctVar = (defpackage.ajct) this.a.a();
        ajctVar.getClass();
        return new zur("dialer_wear", aavxVar, aawdVar, ajctVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq an() {
        defpackage.vcz vczVar = new defpackage.vcz(this, 3);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), vczVar, 1));
        this.a.execute(ajdkVar);
        return ajdkVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq ao(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(ap(phoneAccountHandle), new vct(phoneAccountHandle, 12), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq ap(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(((defpackage.ahbv) this.b).q(phoneAccountHandle));
        java.lang.Object obj = this.c;
        j$.util.Objects.requireNonNull(obj);
        veb vebVar = new veb(obj, 8);
        ?? r3 = this.a;
        return ahrvVarG.h(vebVar, r3).h(new vef(4), r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq aq(vck vckVar) {
        return ((defpackage.afhf) this.c).a(new veb(vckVar, 2), this.b);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final boolean ar(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "carrierApplicationPackageNames");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ?? r2 = this.b;
            java.lang.Boolean bool = (java.lang.Boolean) ((j$.util.concurrent.ConcurrentHashMap) r2).get(str);
            if (bool == null) {
                try {
                    android.content.pm.ApplicationInfo applicationInfo = ((android.content.Context) this.a).getPackageManager().getApplicationInfo(str, 0);
                    defpackage.aooh.e(applicationInfo, "getApplicationInfo(...)");
                    boolean z = applicationInfo.enabled;
                    r2.put(str, java.lang.Boolean.valueOf(z));
                    if (z) {
                        return true;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    this.b.put(str, java.lang.Boolean.FALSE);
                }
            } else if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[Catch: all -> 0x00d3, LOOP:0: B:27:0x007b->B:29:0x0082, LOOP_END, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x0075, B:27:0x007b, B:29:0x0082, B:30:0x00b3), top: B:38:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, rlv] */
    public final java.lang.Object as(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.aoln aolnVar) {
        ufd ufdVar;
        java.lang.Object obj;
        defpackage.iot iotVar;
        if (aolnVar instanceof ufd) {
            ufdVar = (ufd) aolnVar;
            int i = ufdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufdVar.b = i - Integer.MIN_VALUE;
            } else {
                ufdVar = new ufd(this, aolnVar);
            }
        } else {
            ufdVar = new ufd(this, aolnVar);
        }
        java.lang.Object objA = ufdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufdVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                sQLiteDatabase = ufdVar.c;
                defpackage.aooc.af(objA);
            } else if (i2 == 2) {
                sQLiteDatabase = ufdVar.c;
                defpackage.aooc.af(objA);
                defpackage.ipa ipaVar = (defpackage.ipa) objA;
                sQLiteDatabase.beginTransaction();
                try {
                    for (ioz iozVar : ipaVar.b) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("number", iozVar.c);
                        contentValues.put("spam_status", new java.lang.Integer(iozVar.d));
                        contentValues.put("created", new java.lang.Long(iozVar.e));
                        sQLiteDatabase.insertWithOnConflict("client_spam_table", null, contentValues, 4);
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    obj = this.c;
                    iotVar = defpackage.ues.a;
                    ufdVar.c = null;
                    ufdVar.b = 3;
                    if (((defpackage.ipo) obj).b(iotVar, ufdVar) == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objA);
            }
            this.a.o(defpackage.rmx.RESTORE_SPAM_RESTORED);
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objA);
        java.lang.Object obj2 = this.c;
        defpackage.iot iotVar2 = defpackage.ues.a;
        ufdVar.c = sQLiteDatabase;
        ufdVar.b = 1;
        objA = ((defpackage.ipo) obj2).a(iotVar2, ufdVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return defpackage.aojh.a;
        }
        java.lang.Object obj3 = this.c;
        defpackage.iot iotVar3 = defpackage.ues.a;
        ufdVar.c = sQLiteDatabase;
        ufdVar.b = 2;
        objA = ((defpackage.ipo) obj3).c(iotVar3, ufdVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.ipa ipaVar2 = (defpackage.ipa) objA;
        sQLiteDatabase.beginTransaction();
        while (r11.hasNext()) {
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("number", iozVar.c);
            contentValues2.put("spam_status", new java.lang.Integer(iozVar.d));
            contentValues2.put("created", new java.lang.Long(iozVar.e));
            sQLiteDatabase.insertWithOnConflict("client_spam_table", null, contentValues2, 4);
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        obj = this.c;
        iotVar = defpackage.ues.a;
        ufdVar.c = null;
        ufdVar.b = 3;
        if (((defpackage.ipo) obj).b(iotVar, ufdVar) == aoluVar) {
            return aoluVar;
        }
        this.a.o(defpackage.rmx.RESTORE_SPAM_RESTORED);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final uim at(java.lang.String str, java.lang.String str2) {
        defpackage.gus.aJ();
        if (!((java.lang.Boolean) this.b.a()).booleanValue() || str == null) {
            return uim.e;
        }
        akfx akfxVarAI = ((defpackage.aogc) this.a).aI();
        try {
            return akfxVarAI.q(akfxVarAI.i(str, defpackage.akfg.b(str2))) ? uim.d : uim.c;
        } catch (defpackage.akfp unused) {
            return uim.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object au(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.b.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object av(defpackage.aoln aolnVar) {
        trn trnVar;
        if (aolnVar instanceof trn) {
            trnVar = (trn) aolnVar;
            int i = trnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                trnVar.b = i - Integer.MIN_VALUE;
            } else {
                trnVar = new trn(this, aolnVar);
            }
        } else {
            trnVar = new trn(this, aolnVar);
        }
        java.lang.Object objAu = trnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = trnVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            trnVar.b = 1;
            objAu = au(trnVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        trt trtVarB = trt.b(((defpackage.tru) objAu).c);
        if (trtVarB == null) {
            trtVarB = trt.f;
        }
        return java.lang.Boolean.valueOf(trtVarB == trt.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aw(defpackage.aoln aolnVar) {
        tro troVar;
        trv trvVar;
        if (aolnVar instanceof tro) {
            troVar = (tro) aolnVar;
            int i = troVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                troVar.b = i - Integer.MIN_VALUE;
            } else {
                troVar = new tro(this, aolnVar);
            }
        } else {
            troVar = new tro(this, aolnVar);
        }
        java.lang.Object obj = troVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = troVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            trv trvVar2 = trv.a;
            troVar.c = trvVar2;
            troVar.b = 1;
            java.lang.Object objAu = au(troVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            obj = objAu;
            trvVar = trvVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trvVar = troVar.c;
            defpackage.aooc.af(obj);
        }
        trt trtVarB = trt.b(((defpackage.tru) obj).c);
        if (trtVarB == null) {
            trtVarB = trt.f;
        }
        return java.lang.Boolean.valueOf(trvVar.b(trtVarB));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r9v5, types: [ecx, java.lang.Object] */
    public final java.lang.Object ax(trt trtVar, defpackage.aoln aolnVar) {
        trp trpVar;
        defpackage.rmx rmxVar;
        if (aolnVar instanceof trp) {
            trpVar = (trp) aolnVar;
            int i = trpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                trpVar.b = i - Integer.MIN_VALUE;
            } else {
                trpVar = new trp(this, aolnVar);
            }
        } else {
            trpVar = new trp(this, aolnVar);
        }
        java.lang.Object obj = trpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = trpVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return null;
        }
        defpackage.aooc.af(obj);
        int iOrdinal = trtVar.ordinal();
        if (iOrdinal == 0) {
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_UNKNOWN;
        } else if (iOrdinal == 1) {
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_MANUALLY_ENROLLED;
        } else if (iOrdinal == 2) {
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_OPTED_OUT;
        } else if (iOrdinal == 3) {
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_AUTO_ENROLLED;
        } else if (iOrdinal != 4) {
            if (iOrdinal != 5) {
                throw new defpackage.aois();
            }
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_UNKNOWN;
        } else {
            rmxVar = defpackage.rmx.SHARPIE_SETTINGS_MANUALLY_ENROLLED_FROM_JOYBALL;
        }
        this.a.o(rmxVar);
        ?? r9 = this.b;
        nut nutVar = new nut(trtVar, (defpackage.aoln) null, 4);
        trpVar.b = 1;
        if (r9.a(nutVar, trpVar) == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optionalG = ((defpackage.zjm) this.c).g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        defpackage.ipc ipcVar = (defpackage.ipc) defpackage.aooh.q(optionalG);
        if (ipcVar != null) {
            rim rimVar = rim.c;
            trpVar.b = 2;
            if (ipcVar.bg(rimVar, trpVar) == aoluVar) {
                return aoluVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object ay(defpackage.trs trsVar, defpackage.aoln aolnVar) {
        trq trqVar;
        if (aolnVar instanceof trq) {
            trqVar = (trq) aolnVar;
            int i = trqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                trqVar.b = i - Integer.MIN_VALUE;
            } else {
                trqVar = new trq(this, aolnVar);
            }
        } else {
            trqVar = new trq(this, aolnVar);
        }
        java.lang.Object obj = trqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = trqVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.b;
            nut nutVar = new nut(trsVar, (defpackage.aoln) null, 5);
            trqVar.b = 1;
            if (r5.a(nutVar, trqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object az(boolean z, defpackage.aoln aolnVar) {
        trr trrVar;
        if (aolnVar instanceof trr) {
            trrVar = (trr) aolnVar;
            int i = trrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                trrVar.b = i - Integer.MIN_VALUE;
            } else {
                trrVar = new trr(this, aolnVar);
            }
        } else {
            trrVar = new trr(this, aolnVar);
        }
        java.lang.Object obj = trrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = trrVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.b;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 10, (int[][]) null);
            trrVar.b = 1;
            if (r5.a(jblVar, trrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final boolean b(java.lang.Object obj) {
        return bE(obj.getClass()) != null;
    }

    public final void bA(defpackage.dbk dbkVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ((defpackage.daq) this.c).b(dbkVar);
            ((defpackage.daq) this.a).b(dbkVar);
            return;
        }
        if (i2 == 1) {
            ((defpackage.daq) this.b).b(dbkVar);
            ((defpackage.daq) this.a).b(dbkVar);
        } else {
            if (i2 != 2) {
                if (dbkVar.j != null) {
                    ((defpackage.daq) this.a).b(dbkVar);
                    return;
                } else {
                    ((defpackage.daq) this.b).b(dbkVar);
                    return;
                }
            }
            if (dbkVar.j != null) {
                ((defpackage.daq) this.a).b(dbkVar);
            } else {
                ((defpackage.daq) this.c).b(dbkVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bdy, java.lang.Object] */
    public final java.lang.Object bB(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.bdw bdwVar = (defpackage.bdw) ((defpackage.adw) this.c).a(obj);
        if (bdwVar != null) {
            return bdwVar.b;
        }
        ?? A = this.a.a();
        int iA = A.a(obj);
        if (iA != -1) {
            return A.c(iA);
        }
        return null;
    }

    public final defpackage.aonn bC(int i, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.adw adwVar = (defpackage.adw) this.c;
        defpackage.bdw bdwVar = (defpackage.bdw) adwVar.a(obj);
        if (bdwVar != null && bdwVar.c == i && defpackage.aooh.n(bdwVar.b, obj2)) {
            return bdwVar.a();
        }
        defpackage.bdw bdwVar2 = new defpackage.bdw(this, i, obj, obj2);
        adwVar.n(obj, bdwVar2);
        return bdwVar2.a();
    }

    public final defpackage.ajcq ba(kun kunVar) {
        return ((defpackage.kaw) this.c).p(((defpackage.aogc) this.b).bl(new defpackage.jsd(defpackage.ahqx.a(new jss(kunVar, 18)), 9)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kel] */
    public final khm bb(defpackage.kiu kiuVar) {
        java.lang.String str;
        boolean z;
        defpackage.kgu kguVar = (defpackage.kgu) hgt.w(kiuVar, (defpackage.kel) this.c);
        int i = kiuVar.i;
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        hkd hkdVar2 = hkdVar;
        if (kguVar != null) {
            str = kguVar.f;
            z = false;
        } else {
            str = null;
            z = true;
        }
        return new khm(this, i, !z, hkdVar2, str, kiuVar.m);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kel] */
    public final defpackage.isq bc(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        if (((defpackage.iqm) this.c).b()) {
            return (defpackage.isq) hgt.w(kiuVar, (defpackage.kel) this.b);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object bd(long j, defpackage.aoln aolnVar) {
        irm irmVar;
        if (aolnVar instanceof irm) {
            irmVar = (irm) aolnVar;
            int i = irmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                irmVar.b = i - Integer.MIN_VALUE;
            } else {
                irmVar = new irm(this, aolnVar);
            }
        } else {
            irmVar = new irm(this, aolnVar);
        }
        java.lang.Object obj = irmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = irmVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (((defpackage.iqm) this.c).b()) {
                java.lang.Object obj2 = this.a;
                ity ityVar = new ity(j);
                irmVar.b = 1;
                if (((defpackage.kgl) obj2).s(ityVar, new defpackage.ipv((defpackage.aoln) null, 9, (short[][]) null), irmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object be(long j, defpackage.aoln aolnVar) {
        irn irnVar;
        if (aolnVar instanceof irn) {
            irnVar = (irn) aolnVar;
            int i = irnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                irnVar.b = i - Integer.MIN_VALUE;
            } else {
                irnVar = new irn(this, aolnVar);
            }
        } else {
            irnVar = new irn(this, aolnVar);
        }
        java.lang.Object obj = irnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = irnVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (((defpackage.iqm) this.c).b()) {
                java.lang.Object obj2 = this.a;
                ity ityVar = new ity(j);
                irnVar.b = 1;
                if (((defpackage.kgl) obj2).s(ityVar, new defpackage.ipv((defpackage.aoln) null, 10, (int[][]) null), irnVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object bf(long j, defpackage.aoln aolnVar) {
        iro iroVar;
        if (aolnVar instanceof iro) {
            iroVar = (iro) aolnVar;
            int i = iroVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iroVar.b = i - Integer.MIN_VALUE;
            } else {
                iroVar = new iro(this, aolnVar);
            }
        } else {
            iroVar = new iro(this, aolnVar);
        }
        java.lang.Object obj = iroVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iroVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (((defpackage.iqm) this.c).b()) {
                java.lang.Object obj2 = this.a;
                ity ityVar = new ity(j);
                iroVar.b = 1;
                if (((defpackage.kgl) obj2).s(ityVar, new defpackage.ipv((defpackage.aoln) null, 11, (boolean[][]) null), iroVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final java.lang.String bg() {
        java.lang.String string = ((java.util.UUID) this.b).toString();
        defpackage.aooh.e(string, "toString(...)");
        return string;
    }

    public final defpackage.gil bh(java.lang.String str) {
        defpackage.gil gilVar;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        synchronized (this.b) {
            java.lang.Object objA = ((defpackage.adw) this.a).a(str);
            gilVar = objA instanceof defpackage.gil ? (defpackage.gil) objA : null;
        }
        return gilVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void bi(defpackage.aonj aonjVar) {
        defpackage.aozj aozjVar;
        java.lang.Object objC;
        defpackage.fzd fzdVar;
        do {
            aozjVar = (defpackage.aozj) this.c;
            objC = aozjVar.c();
            defpackage.fzd fzdVar2 = (defpackage.fzd) objC;
            fzdVar = (defpackage.fzd) aonjVar.a(fzdVar2);
            if (defpackage.aooh.n(fzdVar2, fzdVar)) {
                return;
            }
        } while (!aozjVar.f(objC, fzdVar));
        if (fzdVar != null) {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.aonj) it.next()).a(fzdVar);
            }
        }
    }

    public final void bj(defpackage.gab gabVar) {
        if (gabVar == null) {
            defpackage.aooh.i("sourceLoadStates");
        }
        bi(new defpackage.ddz(gabVar, 14));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final defpackage.ajcq bk() {
        defpackage.aosp aospVar = defpackage.dsn.a;
        return defpackage.dsn.a(this.a, new defpackage.dgz(this, (defpackage.aoln) null, 4));
    }

    public final defpackage.ajcq bl(defpackage.dxx dxxVar) {
        defpackage.lkf lkfVar = new defpackage.lkf(this, dxxVar, 1, null);
        defpackage.ajcq ajcqVarE = ((defpackage.ajwr) this.c).e(lkfVar, defpackage.ajbm.INSTANCE);
        defpackage.aooh.e(ajcqVarE, "submitAsync(...)");
        return ajcqVarE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [aogc] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [apdp] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aonj] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final java.lang.Object bm(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.efb efbVar;
        java.lang.Object obj;
        ?? r6;
        if (aolnVar instanceof defpackage.efb) {
            efbVar = (defpackage.efb) aolnVar;
            int i = efbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                efbVar.c = i - Integer.MIN_VALUE;
            } else {
                efbVar = new defpackage.efb(this, aolnVar);
            }
        } else {
            efbVar = new defpackage.efb(this, aolnVar);
        }
        java.lang.Object objA = efbVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = efbVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    obj = efbVar.d;
                    java.lang.Object obj2 = efbVar.a;
                    defpackage.aooc.af(objA);
                    r6 = obj2;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = efbVar.d;
                    java.lang.Object obj3 = efbVar.a;
                    defpackage.aooc.af(objA);
                }
                this = (defpackage.apdp) obj;
                this.d();
                return objA;
            }
            defpackage.aooc.af(objA);
            obj = this.b;
            efbVar.a = aonjVar;
            defpackage.apdp apdpVar = (defpackage.apdp) obj;
            efbVar.d = apdpVar;
            efbVar.c = 1;
            if (apdpVar.b(efbVar) == aoluVar) {
                r6 = aonjVar;
                return aoluVar;
            }
            r6 = aonjVar;
            efbVar.a = null;
            efbVar.d = (defpackage.apdp) obj;
            efbVar.c = 2;
            objA = r6.a(efbVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            this = (defpackage.apdp) obj;
            this.d();
            return objA;
        } catch (java.lang.Throwable th) {
            ((defpackage.apdp) this).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object bn(defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        efc efcVar;
        java.lang.Object obj;
        boolean z;
        java.lang.Throwable th;
        if (aolnVar instanceof efc) {
            efcVar = (efc) aolnVar;
            int i = efcVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                efcVar.e = i - Integer.MIN_VALUE;
            } else {
                efcVar = new efc(this, aolnVar);
            }
        } else {
            efcVar = new efc(this, aolnVar);
        }
        java.lang.Object obj2 = efcVar.d;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = efcVar.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = efcVar.c;
            z = efcVar.b;
            obj = efcVar.f;
            java.lang.Object obj4 = efcVar.a;
            try {
                defpackage.aooc.af(obj2);
                if (z) {
                    ((defpackage.apdp) obj).d();
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (z) {
                    ((defpackage.apdp) obj).d();
                }
                throw th;
            }
        }
        defpackage.aooc.af(obj2);
        java.lang.Object obj5 = this.b;
        boolean zC = ((defpackage.apdp) obj5).c();
        try {
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(zC);
            efcVar.a = null;
            efcVar.f = (defpackage.apdp) obj5;
            efcVar.b = zC;
            efcVar.c = zC;
            efcVar.e = 1;
            java.lang.Object objA = aonnVar.a(objValueOf, efcVar);
            if (objA == obj3) {
                return obj3;
            }
            obj = obj5;
            z = zC;
            obj2 = objA;
            if (z) {
                ((defpackage.apdp) obj).d();
            }
            return obj2;
        } catch (java.lang.Throwable th3) {
            obj = obj5;
            z = zC;
            th = th3;
            if (z) {
                ((defpackage.apdp) obj).d();
            }
            throw th;
        }
    }

    public final java.lang.Object bo() {
        return new java.lang.Integer(((defpackage.kaw) this.a).ak());
    }

    public final void bp(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((defpackage.bo) ((defpackage.apnt) it.next()).a).W(menu, menuInflater);
        }
    }

    public final void bq(android.view.Menu menu) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((defpackage.bo) ((defpackage.apnt) it.next()).a).Y(menu);
        }
    }

    public final boolean br(android.view.MenuItem menuItem) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((defpackage.bo) ((defpackage.apnt) it.next()).a).X(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void bs(defpackage.dsz dszVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.a;
        arrayList.clear();
        int size = dszVar.aI.size();
        for (int i = 0; i < size; i++) {
            defpackage.dsy dsyVar = (defpackage.dsy) dszVar.aI.get(i);
            if (dsyVar.M() == 3 || dsyVar.N() == 3) {
                arrayList.add(dsyVar);
            }
        }
        dszVar.c();
    }

    public final boolean bt(defpackage.dtw dtwVar, defpackage.dsy dsyVar, int i) {
        defpackage.dtg dtgVar = (defpackage.dtg) this.c;
        dtgVar.i = dsyVar.M();
        dtgVar.j = dsyVar.N();
        dtgVar.a = dsyVar.j();
        dtgVar.b = dsyVar.h();
        dtgVar.g = false;
        dtgVar.h = i;
        int i2 = dtgVar.i;
        int i3 = dtgVar.j;
        boolean z = i2 == 3 && dsyVar.X > 0.0f;
        boolean z2 = i3 == 3 && dsyVar.X > 0.0f;
        if (z && dsyVar.u[0] == 4) {
            dtgVar.i = 1;
        }
        if (z2 && dsyVar.u[1] == 4) {
            dtgVar.j = 1;
        }
        dtwVar.a(dsyVar, dtgVar);
        dsyVar.C(dtgVar.c);
        dsyVar.x(dtgVar.d);
        dsyVar.F = dtgVar.f;
        dsyVar.u(dtgVar.e);
        dtgVar.h = 0;
        return dtgVar.g;
    }

    public final void bu(defpackage.dsz dszVar, int i, int i2, int i3) {
        int i4 = dszVar.ac;
        int i5 = dszVar.ad;
        dszVar.B(0);
        dszVar.A(0);
        dszVar.C(i2);
        dszVar.x(i3);
        dszVar.B(i4);
        dszVar.A(i5);
        java.lang.Object obj = this.b;
        ((defpackage.dsz) obj).a = i;
        ((defpackage.dtf) obj).T();
    }

    public final void bv(defpackage.dmp dmpVar, java.lang.Object obj) {
        defpackage.dmk dmkVar = new defpackage.dmk(dmpVar);
        synchronized (this.b) {
            try {
                if (obj == null) {
                    ((defpackage.adw) this.c).n(dmkVar, new defpackage.dmj(null));
                } else {
                    ((defpackage.add) this.a).b(dmkVar, new defpackage.dmj(obj));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object bw(defpackage.dmp dmpVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        dml dmlVar;
        defpackage.dmk dmkVar;
        if (aolnVar instanceof dml) {
            dmlVar = (dml) aolnVar;
            int i = dmlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmlVar.b = i - Integer.MIN_VALUE;
            } else {
                dmlVar = new dml(this, aolnVar);
            }
        } else {
            dmlVar = new dml(this, aolnVar);
        }
        java.lang.Object obj = dmlVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = dmlVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.dmk dmkVar2 = new defpackage.dmk(dmpVar);
            synchronized (this.b) {
                defpackage.dmj dmjVar = (defpackage.dmj) ((defpackage.add) this.a).a(dmkVar2);
                if (dmjVar == null) {
                    dmjVar = (defpackage.dmj) ((defpackage.adw) this.c).a(dmkVar2);
                }
                if (dmjVar != null) {
                    return dmjVar.a;
                }
                dmlVar.c = dmkVar2;
                dmlVar.b = 1;
                java.lang.Object objA = aonjVar.a(dmlVar);
                if (objA == obj2) {
                    return obj2;
                }
                obj = objA;
                dmkVar = dmkVar2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dmkVar = dmlVar.c;
            defpackage.aooc.af(obj);
        }
        synchronized (this.b) {
            try {
                if (obj == null) {
                    ((defpackage.adw) this.c).n(dmkVar, new defpackage.dmj(null));
                } else {
                    ((defpackage.add) this.a).b(dmkVar, new defpackage.dmj(obj));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean bx() {
        return (((defpackage.daq) this.c).d() && ((defpackage.daq) this.a).d() && ((defpackage.daq) this.b).d()) ? false : true;
    }

    public final boolean by(defpackage.dbk dbkVar) {
        return dbkVar.j != null && (((defpackage.daq) this.c).c(dbkVar) || ((defpackage.daq) this.b).c(dbkVar));
    }

    public final void bz(defpackage.dbk dbkVar) {
        ((defpackage.daq) this.c).e(dbkVar);
        ((defpackage.daq) this.b).e(dbkVar);
        ((defpackage.daq) this.a).e(dbkVar);
    }

    public final void c(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method methodBE = bE(obj.getClass());
            if (methodBE != null) {
                try {
                    methodBE.invoke(obj, objArr);
                } catch (java.lang.IllegalAccessException unused) {
                }
            }
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [akgr, java.lang.Object] */
    public final defpackage.akgr d(java.lang.String str) {
        if (!this.a.contains(str)) {
            bG(str);
        }
        return this.b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogc.f(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void g() {
        this.c.clear();
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean h() {
        return this.b.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void i(java.lang.String str) {
        ?? r0 = this.b;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (r0.contains(str.concat("|S|cre"))) {
            java.lang.String string = r0.getString(str.concat("|S|cre"), null);
            jCurrentTimeMillis = 0;
            if (string != null) {
                try {
                    jCurrentTimeMillis = java.lang.Long.parseLong(string);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        } else {
            ?? r1 = this.b;
            java.lang.String strConcat = str.concat("|S|cre");
            android.content.SharedPreferences.Editor editorEdit = r1.edit();
            editorEdit.putString(strConcat, java.lang.String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.c.put(str, java.lang.Long.valueOf(jCurrentTimeMillis));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void j(java.lang.String str, java.lang.String str2) {
        ?? r0 = this.b;
        java.lang.String strBI = bI(str, str2);
        android.content.SharedPreferences.Editor editorEdit = r0.edit();
        editorEdit.remove(strBI);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized defpackage.ajwc k(java.lang.String str, java.lang.String str2) {
        defpackage.ajwc ajwcVar;
        try {
            ?? r0 = this.b;
            java.lang.String strBI = bI(str, str2);
            ajwcVar = null;
            java.lang.String string = r0.getString(strBI, null);
            long j = defpackage.ajwc.a;
            if (!android.text.TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        ajwcVar = new defpackage.ajwc(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (org.json.JSONException e) {
                        android.util.Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                    }
                } else {
                    ajwcVar = new defpackage.ajwc(string, null, 0L);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return ajwcVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String string;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = defpackage.ajwc.a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (org.json.JSONException e) {
            android.util.Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(bI(str, str2), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean m() {
        return this.c.isEmpty();
    }

    public final java.lang.IllegalArgumentException n() {
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.a;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(obj3) + '=' + java.lang.String.valueOf(obj2) + " and " + java.lang.String.valueOf(obj3) + '=' + java.lang.String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final defpackage.gfy o(defpackage.ahku ahkuVar, java.lang.Class cls, java.lang.Object... objArr) {
        int i = ahkuVar.g.b;
        java.lang.Object objM = this.b;
        if (i == 1) {
            objM = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) objM);
        }
        ?? r8 = this.c;
        java.lang.String str = ahkuVar.a;
        final defpackage.nyf nyfVar = new defpackage.nyf(this, ahkuVar, 20, null);
        final android.content.Context context = (android.content.Context) objM;
        defpackage.gfv gfvVarD = defpackage.gfz.d(context, cls, str);
        gfvVarD.f(r8);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (timeUnit == null) {
            defpackage.aooh.i("autoCloseTimeUnit");
        }
        gfvVarD.d = 60000L;
        gfvVarD.e = timeUnit;
        gfvVarD.b = new defpackage.gis() { // from class: ahkr
            @Override // defpackage.gis
            public final defpackage.git a(defpackage.aewz aewzVar) {
                return new defpackage.ahks(context, nyfVar, aewzVar);
            }
        };
        defpackage.aify aifyVar = ahkuVar.e;
        gfvVarD.b((defpackage.ghg[]) aifyVar.toArray(new defpackage.ghg[((defpackage.aike) aifyVar).d]));
        defpackage.ahyn ahynVar = ahkuVar.b;
        ahkuVar.c.booleanValue();
        ahkuVar.f.a(gfvVarD);
        defpackage.ahyn ahynVar2 = ahkuVar.d;
        defpackage.aify aifyVar2 = ahkuVar.h;
        int i2 = ((defpackage.aike) aifyVar2).d;
        for (int i3 = 0; i3 < i2; i3++) {
            gfvVarD.g((defpackage.gfz) aifyVar2.get(i3));
        }
        return gfvVarD.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.lang.String p() {
        return (java.lang.String) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aexi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final defpackage.ajcq q(java.lang.String str, com.google.apps.tiktok.account.AccountId accountId, defpackage.agoq agoqVar, boolean z) throws java.io.IOException {
        ahdv ahdvVarN = ((ahbf) defpackage.afsq.S((android.content.Context) this.a, ahbf.class, accountId)).n();
        java.lang.String strS = ((defpackage.zzx) this.b).s(agoqVar);
        defpackage.aooh.f(str, "mendelPackage");
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1373, "Fetching experiments for account", ahouVar, true);
        try {
            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1374, "PhenotypeApi.getConfigurationSnapshot", ahouVar, true);
            try {
                defpackage.ajcq ajcqVarD = ahdvVarN.c.d(str, strS);
                if (z) {
                    ajcqVarD = defpackage.ahrc.a(ajcqVarD, 25L, java.util.concurrent.TimeUnit.SECONDS, ahdvVarN.a);
                }
                ahoqVarX2.a(ajcqVarD);
                defpackage.ajsz.ak(ahoqVarX2, null);
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarD, defpackage.ahqx.c(new adot(ahdvVarN, str, 19)), defpackage.ajbm.INSTANCE);
                defpackage.ajsz.ak(ahoqVarX, null);
                defpackage.ajcq ajcqVarD2 = ((defpackage.aewq) ahdvVarN.f).f.d(false);
                ahds ahdsVar = new ahds(new agkh(13), 0);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                return defpackage.ajan.f(defpackage.agab.aL(defpackage.ajsz.bb(defpackage.ahvr.B(ajcqVarD2, defpackage.aado.class, ahdsVar, ajbmVar), ajcqVarI)), defpackage.ahqx.a(new ahds(ajcqVarI, 2)), ajbmVar);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarX2, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVarX, th3);
                throw th4;
            }
        }
    }

    public final void r(defpackage.ajcq ajcqVar, java.lang.Object obj, defpackage.agxx agxxVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor) {
        defpackage.ahns.t(false);
        defpackage.agxu agxuVar = new defpackage.agxu(this, obj, agxxVar, ahynVar);
        long j = defpackage.ahqx.a;
        ajcqVar.c(new defpackage.ajcc(ajcqVar, new defpackage.sqh(defpackage.ahns.c(false), agxuVar, 2)), executor);
    }

    public final void s(defpackage.ajcq ajcqVar, java.lang.Object obj) {
        r(ajcqVar, obj, defpackage.agxx.a, defpackage.ahwt.a, defpackage.ajbm.INSTANCE);
    }

    public final void t(defpackage.ajcq ajcqVar, java.lang.Object obj) {
        r(ajcqVar, obj, defpackage.agxx.b, defpackage.ahwt.a, defpackage.ajbm.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void u(java.lang.Object obj, defpackage.agxy agxyVar) throws afeb {
        defpackage.afec.c();
        if (obj == null) {
            throw new java.lang.NullPointerException("Cannot subscribe with a null key");
        }
        defpackage.acc accVar = new defpackage.acc(0);
        synchronized (this.c) {
            if (obj instanceof defpackage.agxk) {
                defpackage.ailj it = ((defpackage.agxk) obj).a().iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    bJ(next, agxyVar);
                    if (next instanceof defpackage.agxw) {
                        defpackage.agxw agxwVar = (defpackage.agxw) next;
                        if (bL(agxwVar)) {
                            accVar.add(agxwVar);
                        }
                    }
                }
            } else {
                bJ(obj, agxyVar);
                if (obj instanceof defpackage.agxw) {
                    defpackage.agxw agxwVar2 = (defpackage.agxw) obj;
                    if (bL(agxwVar2)) {
                        accVar.add(agxwVar2);
                    }
                }
            }
        }
        defpackage.acb acbVar = new defpackage.acb(accVar);
        while (acbVar.hasNext()) {
            ((defpackage.agxw) acbVar.next()).a();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void v(java.lang.Object obj, defpackage.agxy agxyVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.cj(obj, "Cannot unsubscribe from a null key");
        defpackage.acc accVar = new defpackage.acc(0);
        synchronized (this.c) {
            if (obj instanceof defpackage.agxk) {
                defpackage.ailj it = ((defpackage.agxk) obj).a().iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    bK(next, agxyVar);
                    if (next instanceof defpackage.agxw) {
                        defpackage.agxw agxwVar = (defpackage.agxw) next;
                        if (bM(agxwVar)) {
                            accVar.add(agxwVar);
                        }
                    }
                }
            } else {
                bK(obj, agxyVar);
                if (obj instanceof defpackage.agxw) {
                    defpackage.agxw agxwVar2 = (defpackage.agxw) obj;
                    if (bM(agxwVar2)) {
                        accVar.add(agxwVar2);
                    }
                }
            }
        }
        defpackage.acb acbVar = new defpackage.acb(accVar);
        while (acbVar.hasNext()) {
            ((defpackage.agxw) acbVar.next()).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajbg w(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        strArr.getClass();
        uri.getClass();
        defpackage.agxd agxdVar = new defpackage.agxd(this, uri, strArr, str, strArr2, str2);
        int i = defpackage.afia.a;
        defpackage.afhy afhyVar = new defpackage.afhy(agxdVar);
        afhyVar.e((java.util.concurrent.Executor) this.b);
        return defpackage.ajbg.b(afhyVar, defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq x(agxe agxeVar) {
        return defpackage.aiql.D(defpackage.ahqx.i(new afgu(this, agxeVar, 9)), this.b);
    }

    public final defpackage.ajcq y(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar) {
        java.util.Set set = (java.util.Set) ((defpackage.amyw) this.c).b;
        int size = set.size();
        defpackage.ahvr.bC(size, "expectedSize");
        defpackage.aihb aihbVar = new defpackage.aihb(size, true);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            aihbVar.c(new ahem(this, ajatVar, (aguu) it.next(), 1));
        }
        return ((defpackage.ahda) this.b).d(new defpackage.nya(ajcqVar, 16), aihbVar.g());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [aolr] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object z(java.lang.String str, java.util.ArrayList arrayList, defpackage.aoln aolnVar) {
        agtt agttVar;
        java.lang.String str2;
        ?? r11;
        java.lang.Object obj;
        if (aolnVar instanceof agtt) {
            agttVar = (agtt) aolnVar;
            int i = agttVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                agttVar.d = i - Integer.MIN_VALUE;
            } else {
                agttVar = new agtt(this, aolnVar);
            }
        } else {
            agttVar = new agtt(this, aolnVar);
        }
        java.lang.Object objAj = agttVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = agttVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = agttVar.b;
                java.lang.Object obj3 = agttVar.a;
                java.lang.String str3 = agttVar.e;
                defpackage.aooc.af(objAj);
                str2 = str3;
                r11 = obj2;
                obj = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj);
            }
            defpackage.aooh.e(objAj, "withLegacyPropagatingContext(...)");
            return objAj;
        }
        defpackage.aooc.af(objAj);
        ?? r13 = this.c;
        agttVar.e = str;
        agttVar.a = arrayList;
        agttVar.b = r13;
        agttVar.d = 1;
        if (defpackage.ahre.a(r13, agttVar) == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        r11 = r13;
        obj = arrayList;
        defpackage.aolr aolrVarK = defpackage.afsq.K(r11);
        agts agtsVar = new agts((defpackage.aoln) null, this, str2, (java.util.ArrayList) obj, 0);
        agttVar.e = null;
        agttVar.a = null;
        agttVar.b = null;
        agttVar.d = 2;
        objAj = defpackage.aoov.aj(aolrVarK, agtsVar, agttVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        defpackage.aooh.e(objAj, "withLegacyPropagatingContext(...)");
        return objAj;
    }

    public aogc(defpackage.adgd adgdVar, java.util.Map map) {
        this.c = adgdVar;
        this.a = map;
    }

    public aogc(defpackage.afvt afvtVar, android.view.View view) {
        this.b = android.os.Build.VERSION.SDK_INT >= 34 ? new defpackage.afvw() : android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.afvu() : null;
        this.c = afvtVar;
        this.a = view;
    }

    public aogc(defpackage.ajtc ajtcVar, com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, defpackage.ajwi ajwiVar) {
        this.c = ajwiVar;
        this.b = ajtcVar;
        this.a = firebaseMessaging;
    }

    public aogc(defpackage.amwu amwuVar, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3) {
        defpackage.aooh.f(amwuVar, "gnpFetchOnlyAccountStorage");
        defpackage.aooh.f(amwuVar2, "gnpFcmAccountStorage");
        defpackage.aooh.f(amwuVar3, "gnpFcmRegistrationDataHelper");
        this.a = amwuVar;
        this.c = amwuVar2;
        this.b = amwuVar3;
    }

    public aogc(android.content.Context context, defpackage.aepm aepmVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.a = aepmVar;
        this.c = aoinVar;
    }

    public aogc(defpackage.apdi apdiVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        this.a = apdiVar;
        this.c = ahynVar;
        this.b = ahynVar2;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte... bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, char[] cArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, float[] fArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int[] iArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, short[] sArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean[] zArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public aogc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[][] bArr) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public aogc(defpackage.acbd acbdVar, defpackage.amwu amwuVar, defpackage.adao adaoVar, java.lang.String str) {
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("clearcutLogger");
        }
        if (adaoVar == null) {
            defpackage.aooh.i("promotionsStore");
        }
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        this.c = acbdVar;
        this.a = amwuVar;
        this.b = adaoVar;
    }

    public aogc(defpackage.ahbv ahbvVar, defpackage.lqz lqzVar, defpackage.aolr aolrVar) {
        if (ahbvVar == null) {
            defpackage.aooh.i("dialerPhoneNumbers");
        }
        if (lqzVar == null) {
            defpackage.aooh.i("haloCallLogDataIntegration");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = ahbvVar;
        this.c = lqzVar;
        this.a = aolrVar;
    }

    public aogc(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = ahynVar;
        this.a = ahynVar2;
    }

    public aogc(defpackage.ajct ajctVar, java.lang.String str) {
        this.a = new java.util.HashMap();
        this.b = ajctVar;
        this.c = str;
    }

    public aogc(defpackage.ajtp ajtpVar) {
        this.b = new java.util.HashSet();
        this.c = new java.util.HashSet();
        this.a = ajtpVar;
    }

    public aogc(defpackage.akfl akflVar, defpackage.akgr akgrVar) {
        this.c = akflVar;
        this.b = akgrVar;
        this.a = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
    }

    public aogc(defpackage.aogc aogcVar, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "backgroundContext");
        this.c = aogcVar;
        this.b = aolrVar;
        this.a = new defpackage.apdp();
    }

    public aogc(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        aoinVar4.getClass();
        this.a = aoinVar4;
    }

    public aogc(defpackage.cjt cjtVar, defpackage.aomy aomyVar) {
        this.b = cjtVar;
        this.a = aomyVar;
        long[] jArr = defpackage.adx.a;
        this.c = new defpackage.adw(6);
    }

    public aogc(defpackage.ecx ecxVar, defpackage.rlv rlvVar, defpackage.zjm zjmVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = ecxVar;
        this.a = rlvVar;
        this.c = zjmVar;
    }

    public aogc(defpackage.gbr gbrVar) {
        this.a = gbrVar;
        this.b = new defpackage.apdp();
        this.c = new defpackage.gbn(gbrVar);
    }

    public aogc(rai raiVar) {
        if (raiVar == null) {
            defpackage.aooh.i("trackerFactory");
        }
        this.c = raiVar;
        this.a = new java.lang.Object();
        this.b = new java.util.LinkedHashMap();
    }

    public aogc(byte[] bArr) {
        this.c = new java.lang.Object();
        this.b = new defpackage.aca();
        this.a = new defpackage.aifi();
    }

    public aogc(defpackage.akzc akzcVar, java.lang.String str, java.lang.String str2) {
        this.a = defpackage.aish.f;
        this.c = defpackage.ahvr.bI(new defpackage.jvu(this, akzcVar, 11));
        this.b = defpackage.ahvr.bI(new defpackage.adqd(this, str, str2, 4));
    }

    public aogc(android.content.Context context, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor) {
        this.a = executor;
        this.b = defpackage.ahbq.l(executor);
        this.c = new defpackage.ahbq(executor, new defpackage.adcc(ahynVar, context, 0));
    }

    public aogc(defpackage.aoss aossVar, defpackage.ipo ipoVar, defpackage.rlv rlvVar) {
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = aossVar;
        this.c = ipoVar;
        this.a = rlvVar;
    }

    public aogc(defpackage.tvn tvnVar) {
        j$.util.Objects.requireNonNull(this);
        this.b = new java.util.HashMap();
        this.a = new java.util.HashMap();
        this.c = tvnVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aoss, java.lang.Object] */
    public aogc(defpackage.zzx zzxVar, defpackage.aoss aossVar) {
        java.lang.Object objAs;
        this.c = aossVar;
        defpackage.aihd aihdVarE = zzxVar.e();
        defpackage.aooh.e(aihdVarE, "get(...)");
        java.util.List<defpackage.kkd> listBX = defpackage.ajsz.bX(aihdVarE, new defpackage.beg(6));
        this.b = listBX;
        if (listBX.isEmpty()) {
            objAs = new defpackage.aozj(defpackage.aokc.a);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listBX, 10));
            for (defpackage.kkd kkdVar : listBX) {
                if (kkdVar == null) {
                    defpackage.aooh.g();
                }
                arrayList.add(new defpackage.gdc(kkdVar.c(), kkdVar, 2));
            }
            defpackage.fzh fzhVar = new defpackage.fzh((defpackage.aoxh[]) defpackage.ajsz.bZ(arrayList).toArray(new defpackage.aoxh[0]), 6);
            ?? r7 = this.c;
            defpackage.aozg aozgVar = new defpackage.aozg(0L, Long.MAX_VALUE);
            ?? r2 = this.b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(r2, 10));
            for (defpackage.kkd kkdVar2 : r2) {
                if (kkdVar2 == null) {
                    defpackage.aooh.g();
                }
                arrayList2.add(new defpackage.kkh(kkdVar2, (defpackage.kkk) kkdVar2.c().c()));
            }
            objAs = defpackage.aoov.as(fzhVar, r7, aozgVar, arrayList2);
        }
        this.a = objAs;
    }

    public aogc(defpackage.amwu amwuVar, defpackage.zzx zzxVar, android.content.Context context) {
        if (amwuVar == null) {
            defpackage.aooh.i("accountDataService");
        }
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.c = amwuVar;
        this.b = zzxVar;
        this.a = context;
    }

    public aogc(android.content.Context context) {
        this.c = new defpackage.aca();
        this.a = context;
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        java.io.File file = new java.io.File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            android.util.Log.i("FirebaseInstanceId", "App restored, clearing state");
            g();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                android.util.Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(java.lang.String.valueOf(e.getMessage())));
            }
        }
    }

    public aogc(android.content.Context context, defpackage.ajct ajctVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        this.a = context;
        this.c = ajctVar;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public aogc(defpackage.aolr aolrVar, android.content.ContentResolver contentResolver, defpackage.apni apniVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.c = aolrVar;
        this.b = contentResolver;
        this.a = apniVar;
    }

    public aogc(defpackage.aomy aomyVar) {
        this.c = new defpackage.civ();
        this.b = new defpackage.cix();
        this.a = new defpackage.bev(this, aomyVar, 3, null);
    }

    public aogc(byte[] bArr, byte[] bArr2) {
        this.b = new defpackage.dzk();
        long[] jArr = defpackage.adx.a;
        this.a = new defpackage.adw(6);
        this.c = new defpackage.adw(6);
    }

    public aogc(defpackage.adgd adgdVar, java.util.Map map, byte[] bArr) {
        this(adgdVar, map);
        this.b = new android.util.LruCache(32);
    }

    public aogc(android.content.Context context, byte[] bArr) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.a = context;
        java.lang.String packageName = context.getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        this.b = packageName;
        this.c = defpackage.aooc.ah(2, new defpackage.acik(this, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aogc(defpackage.adon adonVar, java.lang.Iterable iterable) {
        this.c = adonVar;
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) iterable).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            defpackage.adsi adsiVar = (defpackage.adsi) ailkVarListIterator.next();
            aigbVar.i(adsiVar.a, adsiVar);
        }
        this.a = aigbVar.e(true);
        defpackage.beg begVar = new defpackage.beg(16);
        java.lang.Object[] array = defpackage.ahvr.bo(iterable).toArray();
        int length = array.length;
        defpackage.ahvr.ay(array, length);
        java.util.Arrays.sort(array, begVar);
        this.b = defpackage.aify.i(array, length);
    }

    public aogc(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, byte[] bArr) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.a = aoinVar3;
    }

    public aogc(java.util.List list) {
        this(list, java.util.Collections.EMPTY_LIST, java.util.Collections.EMPTY_LIST);
    }

    public aogc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = new defpackage.daq();
        this.b = new defpackage.daq();
        this.a = new defpackage.daq();
    }

    public aogc(defpackage.gsk gskVar) {
        this(gskVar.b, gskVar.c, gskVar.d);
    }

    public aogc(java.util.List list, java.util.List list2) {
        this(list, list2, java.util.Collections.EMPTY_LIST);
    }

    public aogc() {
        throw null;
    }

    public aogc(java.util.UUID uuid, defpackage.gxl gxlVar, java.util.Set set) {
        if (uuid == null) {
            defpackage.aooh.i("id");
        }
        if (gxlVar == null) {
            defpackage.aooh.i("workSpec");
        }
        this.b = uuid;
        this.a = gxlVar;
        this.c = set;
    }

    private aogc(android.content.Context context, char[] cArr) {
        this.c = defpackage.ahvr.bI(new defpackage.tzo(2));
        this.b = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.a = defpackage.ahvr.bI(new defpackage.jvu(context, new defpackage.aahr("auth:gau"), 3));
    }

    public aogc(defpackage.oju ojuVar, defpackage.aoss aossVar, defpackage.apni apniVar) {
        if (ojuVar == null) {
            defpackage.aooh.i("dialerAudioManager");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        this.c = ojuVar;
        this.a = aossVar;
        this.b = apniVar;
    }

    public aogc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.add(16);
        long[] jArr = defpackage.adx.a;
        this.c = new defpackage.adw(6);
        this.b = new defpackage.dfb();
    }

    public aogc(defpackage.iqm iqmVar, defpackage.kgl kglVar, defpackage.isj isjVar) {
        if (kglVar == null) {
            defpackage.aooh.i("beeslySot");
        }
        if (isjVar == null) {
            defpackage.aooh.i("beeslyCallLogDataIntegration");
        }
        this.c = iqmVar;
        this.a = kglVar;
        this.b = isjVar;
    }

    public aogc(short[] sArr) {
        this.c = new java.util.WeakHashMap();
        this.a = new java.util.WeakHashMap();
        this.b = new java.util.WeakHashMap();
    }

    public aogc(defpackage.dsz dszVar) {
        this.a = new java.util.ArrayList();
        this.c = new defpackage.dtg();
        this.b = dszVar;
    }

    public aogc(java.lang.Runnable runnable) {
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
        this.c = new java.util.HashMap();
        this.a = runnable;
    }

    public aogc(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("filePath");
        }
        this.b = new defpackage.apdp();
        this.a = new defpackage.kaw((char[]) null);
        this.c = new defpackage.aowy(new defpackage.efl((defpackage.aoln) null, 1, (byte[]) null));
    }

    public aogc(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.nri nriVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (nriVar == null) {
            defpackage.aooh.i("dobbyDatabase");
        }
        this.a = aossVar;
        this.c = aolrVar;
        this.b = nriVar;
    }

    public aogc(defpackage.amwu amwuVar, defpackage.ajct ajctVar) {
        if (amwuVar == null) {
            defpackage.aooh.i("meetCallController");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        this.c = amwuVar;
        this.b = ajctVar;
        this.a = new defpackage.ajdc(ajctVar);
    }

    public aogc(defpackage.eei eeiVar, defpackage.aolr aolrVar) {
        this.b = eeiVar;
        this.a = aolrVar;
        this.c = new defpackage.ajwr();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoxh, java.lang.Object] */
    public aogc(defpackage.aoss aossVar, defpackage.kgl kglVar) {
        if (kglVar == null) {
            defpackage.aooh.i("parent");
        }
        this.a = aossVar;
        this.c = kglVar;
        this.b = new defpackage.gat((defpackage.aoxh) kglVar.a, aossVar);
    }

    public aogc(defpackage.rsr rsrVar, defpackage.mgw mgwVar) {
        if (mgwVar == null) {
            defpackage.aooh.i("recorder");
        }
        this.c = rsrVar;
        this.b = mgwVar;
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aogc(android.view.View view) {
        this((defpackage.afvt) view, view);
    }

    public aogc(defpackage.ajzc ajzcVar, defpackage.ajct ajctVar, defpackage.mgu mguVar) {
        if (ajzcVar == null) {
            defpackage.aooh.i("httpClient");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.a = ajzcVar;
        this.b = ajctVar;
        this.c = mguVar;
    }

    public aogc(char[] cArr, byte[] bArr) {
        this.a = new defpackage.gdx();
        defpackage.aozj aozjVarA = defpackage.aozk.a(null);
        this.c = aozjVarA;
        this.b = new defpackage.aoys(aozjVarA, null);
    }

    public aogc(android.content.Context context, defpackage.aolr aolrVar, defpackage.aoss aossVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        this.a = context;
        this.b = aolrVar;
        this.c = aossVar;
    }

    public aogc(android.content.Context context, defpackage.zzd zzdVar, defpackage.zdi zdiVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (zzdVar == null) {
            defpackage.aooh.i("anonymousLogger");
        }
        this.c = context;
        this.b = zzdVar;
        this.a = zdiVar;
    }

    public aogc(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallOptionsStateUpdater");
        }
        this.b = aoinVar;
        this.a = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public aogc(defpackage.tkl tklVar, defpackage.aoss aossVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("useGivenViewTreeObserver");
        }
        this.b = tklVar;
        this.a = aossVar;
        this.c = aoinVar;
    }
}
