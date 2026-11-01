package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abdu implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ abdu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v70, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v52, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [dpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object next;
        com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout aliVar;
        android.view.ContextThemeWrapper contextThemeWrapper;
        int i = 11;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.j(diqVar, (java.lang.String) this.a);
                java.lang.Object obj2 = this.b;
                if (obj2 != null) {
                    dfb.o(diqVar, ((dib) obj2).a);
                }
                return aojh.a;
            case 1:
                aooh.f((defpackage.afpl) obj, "$this$featureBroker");
                ?? r1 = this.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r1, 10));
                ailj ailjVarK = ((aikn) r1).k();
                while (ailjVarK.hasNext()) {
                    arrayList.add(((defpackage.abcj) ailjVarK.next()).a());
                }
                java.util.Iterator it = ajsz.aI((java.util.Set) this.b, arrayList).iterator();
                while (it.hasNext()) {
                    ((defpackage.abci) it.next()).a();
                }
                return aojh.a;
            case 2:
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (((cpm) obj).a >> 32));
                float f = fIntBitsToFloat + fIntBitsToFloat;
                java.lang.Object obj3 = this.a;
                defpackage.abgq abgqVar = (defpackage.abgq) obj3;
                if (abgqVar.c()) {
                    float f2 = ((defpackage.abfs) this.b).b;
                    boolean z = (f - f2) / f2 > 0.0f;
                    abgqVar.b(false);
                    aoov.an(abgqVar.a, (aolr) null, 0, new defpackage.abgo(abgqVar, z, (aoln) null, 0), 3).p(new abgj(obj3, 2));
                }
                return aojh.a;
            case 3:
                vx vxVar = (vx) obj;
                aooh.f(vxVar, "$this$BaseButtonGroup");
                java.util.Iterator it2 = ((defpackage.abip) this.a).a.iterator();
                while (it2.hasNext()) {
                    vxVar.b.add(new vx(new cja(-1641464631, true, new ata(vxVar, (defpackage.abio) it2.next(), this.b, 20, (short[]) null)), defpackage.abir.b, (char[]) null));
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                czb czbVar = (czb) obj;
                aooh.f(czbVar, "$this$layout");
                int iB = dpd.b(((dpd) this.a).a);
                czc czcVar = (czc) this.b;
                czbVar.u(czcVar, (iB - czcVar.a) / 2, 0, 0.0f);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                csj csjVar = (csj) obj;
                aooh.f(csjVar, "$this$Canvas");
                java.lang.Object obj4 = this.b;
                cpu cpuVar = (cpu) obj4;
                float fC = cpuVar.c();
                float fB = cpuVar.b();
                long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fB);
                long jO = csjVar.o();
                long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                cpp cppVar = new cpp(j);
                abjn abjnVar = (abjn) this.a;
                abjnVar.c = cppVar;
                abjnVar.d = new cpp(jO);
                defpackage.abjl abjlVarAE = aehj.aE(abjnVar.a(), 1.0f, 0L, j, jO);
                defpackage.abjj abjjVar = new defpackage.abjj(aehj.aB(j, jO) * abjlVarAE.b, mni.bl(cpm.b(mni.aM(aehj.aD(jO), aehj.aD(j)), 2.0f), (((long) java.lang.Float.floatToRawIntBits(abjlVarAE.c)) << 32) | (((long) java.lang.Float.floatToRawIntBits(abjlVarAE.d)) & 4294967295L)));
                float f3 = abjjVar.a;
                long jN = csjVar.n();
                csg csgVarQ = csjVar.q();
                long jA = csgVarQ.a();
                csgVarQ.b().g();
                try {
                    csgVarQ.c.q(f3, f3, jN);
                    long j2 = abjjVar.b;
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
                    csjVar.q().c.r(fIntBitsToFloat2, fIntBitsToFloat3);
                    try {
                        den.K(csjVar, (cpu) obj4, (cqh) null, 62);
                        csjVar.q().c.r(-fIntBitsToFloat2, -fIntBitsToFloat3);
                        csgVarQ.b().e();
                        csgVarQ.h(jA);
                        return aojh.a;
                    } catch (java.lang.Throwable th) {
                        csjVar.q().c.r(-fIntBitsToFloat2, -fIntBitsToFloat3);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    csgVarQ.b().e();
                    csgVarQ.h(jA);
                    throw th2;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                cpm cpmVar = (cpm) obj;
                this.a.a(cpmVar);
                int iK = (int) agii.k(cpmVar.a);
                agii agiiVar = (agii) this.b;
                bbh bbhVar = (bbh) agiiVar.b;
                java.util.List list = bbhVar.j().k;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj5 : list) {
                    if (((baz) obj5).a <= agiiVar.a) {
                        arrayList2.add(obj5);
                    }
                }
                java.util.Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        baz bazVar = (baz) next;
                        int i2 = agiiVar.i(bazVar);
                        if (iK > agiiVar.i(bazVar) + bazVar.h || i2 > iK) {
                        }
                    } else {
                        next = null;
                    }
                }
                baz bazVar2 = (baz) next;
                java.lang.Integer numValueOf = bazVar2 != null ? java.lang.Integer.valueOf(bazVar2.a) : null;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    agiiVar.b(java.lang.Integer.valueOf(iIntValue));
                    for (baz bazVar3 : bbhVar.j().k) {
                        if (bazVar3.a == iIntValue) {
                            agiiVar.h(agiiVar.i(bazVar3));
                        }
                    }
                    throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyColumn");
                ?? r2 = this.a;
                barVar.b(((aokv) r2).b, (aonj) null, new abli((java.lang.Object) r2, 0), new cja(802480018, true, new ablj((java.util.List) r2, (defpackage.ablk) this.b, 0)));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.b.b(new dpk(this.a.dq(dpy.l(((dpp) obj).a))));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a.a(this.b.get(((java.lang.Integer) obj).intValue()));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooh.f((cdh) obj, "$this$DisposableEffect");
                this.b.a();
                aliVar = new ali(this.a, 11);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Integer.valueOf(((aeel) this.b).b.c((gjh) obj, (java.lang.Iterable) this.a));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((aeel) this.b).a.c((gjh) obj, (java.util.Collection) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.aeeq) this.b).b.c((gjh) obj, (java.util.Collection) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.content.Context context = (android.content.Context) obj;
                aooh.f(context, "context");
                defpackage.aekw aekwVar = new defpackage.aekw();
                defpackage.aejq aejqVar = (defpackage.aejq) this.b;
                defpackage.aeku aekuVar = (defpackage.aeku) aejqVar.b.b.f.d(aekwVar);
                android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130969393});
                try {
                    android.view.ContextThemeWrapper contextThemeWrapper2 = new android.view.ContextThemeWrapper(new android.view.ContextThemeWrapper(context, typedArrayObtainStyledAttributes.getResourceId(0, aekuVar.a())), aekuVar.b());
                    if (aekuVar.c() && afsg.a()) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper2.obtainStyledAttributes(afsg.a);
                        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                        if (resourceId != 0) {
                            contextThemeWrapper = new android.view.ContextThemeWrapper(contextThemeWrapper2, resourceId);
                        } else {
                            contextThemeWrapper = contextThemeWrapper2;
                        }
                    } else {
                        contextThemeWrapper = contextThemeWrapper2;
                    }
                    java.lang.Object obj6 = this.a;
                    typedArrayObtainStyledAttributes.recycle();
                    aliVar = new com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout(contextThemeWrapper);
                    androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(contextThemeWrapper, (android.util.AttributeSet) null, 0, 6, (aooc) null);
                    composeView.k(dgi.a);
                    composeView.a(new cja(-1459403689, true, new defpackage.abkv(obj6, i)));
                    aliVar.addView(composeView);
                    aliVar.b = true;
                    aliVar.b(new defpackage.aejs());
                    aliVar.a(aejqVar.a, aejqVar.b);
                } catch (java.lang.Throwable th3) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th3;
                }
                break;
            case 15:
                ((defpackage.afpl) this.b).c(acmf.a());
                this.a.a(obj);
                return aojh.a;
            case 16:
                defpackage.akmc akmcVar = (defpackage.akmc) obj;
                aooh.f(akmcVar, "it");
                aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.zjr((com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) this.b, akmcVar, (aoln) null, 5), 3);
                return aojh.a;
            case 17:
                bbt bbtVar = (bbt) obj;
                ?? r3 = this.b;
                aimz aimzVar = defpackage.afny.a;
                aooh.f(bbtVar, "$this$LazyPhotoGrid");
                cmw cmwVarC = azm.c(rx.l(cmw.c, 1.0f, false), 1.0f);
                java.util.List list2 = defpackage.afny.b(r3).a;
                bbtVar.b(list2.size(), new abli(list2, 8), new cja(-1942245546, true, new afns(list2, cmwVarC, this.a, 0)));
                return aojh.a;
            case 18:
                bbt bbtVar2 = (bbt) obj;
                ?? r4 = this.b;
                aimz aimzVar2 = defpackage.afny.a;
                aooh.f(bbtVar2, "$this$LazyPhotoGrid");
                cmw cmwVarC2 = azm.c(rx.l(cmw.c, 1.0f, false), 1.0f);
                java.util.List list3 = defpackage.afny.c(r4).a;
                bbtVar2.b(list3.size(), new abli(list3, 16), new cja(-1117249557, true, new afns(list3, cmwVarC2, this.a, 2)));
                return aojh.a;
            case 19:
                defpackage.agjz agjzVar = (defpackage.agjz) obj;
                aooh.f(agjzVar, "$this$transition");
                defpackage.agka agkaVar = (defpackage.agka) this.b;
                java.util.Map mapA = agkaVar.d.a();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : mapA.entrySet()) {
                    ?? r5 = this.a;
                    if (r5 != 0 ? r5.contains(entry.getKey()) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    java.util.Map map = agkaVar.e;
                    java.lang.Object key = entry2.getKey();
                    aooh.d(key, "null cannot be cast to non-null type com.google.android.shaderlib.energyeffects.shader.Uniform<kotlin.Any>");
                    java.lang.Object value = entry2.getValue();
                    aooh.d(value, "null cannot be cast to non-null type kotlin.Any");
                    arrayList3.add(new defpackage.agjt((defpackage.aglv) key, value, (ajh) map.get(entry2.getKey())));
                }
                agjzVar.d.addAll(arrayList3);
                return aojh.a;
            default:
                defpackage.agjw agjwVar = (defpackage.agjw) obj;
                aooh.f(agjwVar, "$this$keyframeSequence");
                java.lang.Object obj7 = this.b;
                defpackage.agjv agjvVar = (defpackage.agjv) obj7;
                agjwVar.b = agjvVar.b;
                agjwVar.a = agjvVar.a;
                for (defpackage.agka agkaVar2 : ((defpackage.agjw) obj7).a()) {
                    java.lang.Object obj8 = this.a;
                    long j3 = agkaVar2.a;
                    long j4 = agkaVar2.b;
                    ajh ajhVar = agkaVar2.c;
                    defpackage.abdu abduVar = new defpackage.abdu(agkaVar2, obj8, 19, objArr == true ? 1 : 0);
                    aooh.f(ajhVar, "easing");
                    defpackage.agjz agjzVar2 = new defpackage.agjz(j3, j4, ajhVar);
                    abduVar.a(agjzVar2);
                    agjwVar.c.add(new defpackage.agjx(agjzVar2.a, agjzVar2.b, agjzVar2.c, agjzVar2.d));
                }
                return aojh.a;
        }
        return aliVar;
    }

    public /* synthetic */ abdu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
