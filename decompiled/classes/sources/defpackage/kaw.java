package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kaw {
    public final java.lang.Object a;

    public kaw(android.view.View view) {
        this.a = view;
        new defpackage.dnu(new defpackage.dji(""), defpackage.dky.a);
        int i = defpackage.dns.g;
        new java.util.ArrayList();
        defpackage.aooc.ah(3, new defpackage.ddw(this, 8));
        new android.view.inputmethod.CursorAnchorInfo.Builder();
        defpackage.cqt.e();
        new android.graphics.Matrix();
    }

    public static final java.lang.String V(mbb mbbVar) {
        defpackage.zao zaoVar = mbbVar.a;
        java.util.Collection collectionValues = zaoVar.b.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collectionValues, 10));
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.zan) it.next()).a);
        }
        java.util.Set set = zaoVar.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(set, 10));
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((defpackage.zam) it2.next()).b.a);
        }
        java.util.Set setCg = defpackage.ajsz.cg(arrayList, arrayList2);
        java.lang.String str = setCg.size() == 1 ? ((defpackage.aenj) defpackage.ajsz.bD(setCg)).a : "Multiple CUIs";
        defpackage.aooh.c(str);
        return str + " started from " + zaoVar.g;
    }

    private static final void aK(java.lang.String str, java.lang.String str2) {
        defpackage.mhc mhcVar = defpackage.mhc.a;
        defpackage.kaw kawVarAQ = defpackage.gus.aQ(mhcVar.m());
        defpackage.kaw kawVarAR = defpackage.gus.aR(defpackage.mha.a.m());
        kawVarAR.Q();
        defpackage.mhc[] mhcVarArr = new defpackage.mhc[2];
        defpackage.kaw kawVarAQ2 = defpackage.gus.aQ(mhcVar.m());
        kawVarAQ2.N(str);
        mhcVarArr[0] = kawVarAQ2.L();
        defpackage.kaw kawVarAQ3 = defpackage.gus.aQ(mhcVar.m());
        if (str2 == null) {
            str2 = "null";
        }
        kawVarAQ3.N(str2);
        mhcVarArr[1] = kawVarAQ3.L();
        java.util.List listBb = defpackage.ajsz.bb(mhcVarArr);
        defpackage.aooh.f(listBb, "values");
        ((defpackage.akzx) kawVarAR.a).K(listBb);
        kawVarAQ.M(kawVarAR.O());
        kawVarAQ.L();
    }

    private static final void aL(java.lang.String str, java.lang.String str2) {
        defpackage.mhc mhcVar = defpackage.mhc.a;
        defpackage.kaw kawVarAQ = defpackage.gus.aQ(mhcVar.m());
        defpackage.kaw kawVarAR = defpackage.gus.aR(defpackage.mha.a.m());
        kawVarAR.Q();
        defpackage.kaw kawVarAQ2 = defpackage.gus.aQ(mhcVar.m());
        kawVarAQ2.N(str);
        kawVarAR.P(kawVarAQ2.L());
        kawVarAR.Q();
        defpackage.kaw kawVarAQ3 = defpackage.gus.aQ(mhcVar.m());
        if (str2 == null) {
            str2 = "null";
        }
        kawVarAQ3.N(str2);
        kawVarAR.P(kawVarAQ3.L());
        kawVarAQ.M(kawVarAR.O());
        kawVarAQ.L();
    }

    public static boolean c(defpackage.kiu kiuVar) {
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        return rmtVarB.equals(defpackage.rmt.SOURCE_TYPE_CNAP);
    }

    public static boolean d(defpackage.kiu kiuVar) {
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        return rmtVarB != defpackage.rmt.UNKNOWN_SOURCE_TYPE;
    }

    public final void A(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nwy nwyVar = (defpackage.nwy) akzxVar.b;
        defpackage.nwy nwyVar2 = defpackage.nwy.a;
        nwyVar.f = defpackage.a.aU(i);
        nwyVar.b |= 8;
    }

    public final java.lang.CharSequence B(java.lang.String str) {
        defpackage.aooh.f(str, "text");
        android.content.Context context = (android.content.Context) this.a;
        java.lang.String string = context.getString(2132018375);
        defpackage.aooh.e(string, "getString(...)");
        java.lang.CharSequence charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(context.getString(2132018376), string, str);
        int length = string.length() + 2;
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequenceExpandTemplate);
        spannableString.setSpan(new android.text.style.StyleSpan(2), 0, length, 0);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(defpackage.urg.c(context, 2130969068)), 0, length, 0);
        return spannableString;
    }

    public final noi C() {
        noi noiVarB = noi.b(((defpackage.nok) ((defpackage.akzx) this.a).b).d);
        return noiVarB == null ? noi.e : noiVarB;
    }

    public final /* synthetic */ defpackage.nok D() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.nok) aladVarR;
    }

    public final void E(defpackage.alcf alcfVar) {
        defpackage.aooh.f(alcfVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nok nokVar = (defpackage.nok) akzxVar.b;
        defpackage.nok nokVar2 = defpackage.nok.a;
        j$.util.Objects.requireNonNull(alcfVar);
        nokVar.i = alcfVar;
        nokVar.b |= 32;
    }

    public final void F(noh nohVar) {
        defpackage.aooh.f(nohVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nok nokVar = (defpackage.nok) akzxVar.b;
        defpackage.nok nokVar2 = defpackage.nok.a;
        nokVar.c = nohVar.a();
    }

    public final void G(noi noiVar) {
        defpackage.aooh.f(noiVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nok nokVar = (defpackage.nok) akzxVar.b;
        defpackage.nok nokVar2 = defpackage.nok.a;
        nokVar.d = noiVar.a();
        nokVar.b |= 1;
    }

    public final void H(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nok nokVar = (defpackage.nok) akzxVar.b;
        defpackage.nok nokVar2 = defpackage.nok.a;
        nokVar.b |= 4;
        nokVar.f = z;
    }

    public final boolean I() {
        return !((defpackage.zpm) this.a).b(zpo.l).isEmpty();
    }

    public final boolean J() {
        zpo zpoVar = zpo.f;
        defpackage.zpm zpmVar = (defpackage.zpm) this.a;
        return zpmVar.b(zpoVar).isEmpty() && zpmVar.b(zpo.l).isEmpty() && zpmVar.f().isPresent();
    }

    public final /* synthetic */ defpackage.mvm K() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.mvm) aladVarR;
    }

    public final /* synthetic */ defpackage.mhc L() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.mhc) aladVarR;
    }

    public final void M(defpackage.mha mhaVar) {
        if (mhaVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVar.b;
        defpackage.mhc mhcVar2 = defpackage.mhc.a;
        j$.util.Objects.requireNonNull(mhaVar);
        mhcVar.c = mhaVar;
        mhcVar.b = 6;
    }

    public final void N(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.mhc mhcVar = (defpackage.mhc) akzxVar.b;
        defpackage.mhc mhcVar2 = defpackage.mhc.a;
        j$.util.Objects.requireNonNull(str);
        mhcVar.b = 2;
        mhcVar.c = str;
    }

    public final /* synthetic */ defpackage.mha O() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.mha) aladVarR;
    }

    public final /* synthetic */ void P(defpackage.mhc mhcVar) {
        if (mhcVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.mha mhaVar = (defpackage.mha) akzxVar.b;
        defpackage.mha mhaVar2 = defpackage.mha.a;
        j$.util.Objects.requireNonNull(mhcVar);
        mhaVar.b();
        mhaVar.b.add(mhcVar);
    }

    public final /* synthetic */ void Q() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mha) ((defpackage.akzx) this.a).b).b);
        defpackage.aooh.e(listUnmodifiableList, "getValuesList(...)");
        new defpackage.alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.mfd R() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.mfd) aladVarR;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object S(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.a.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object T(boolean z, defpackage.aoln aolnVar) {
        mfe mfeVar;
        if (aolnVar instanceof mfe) {
            mfeVar = (mfe) aolnVar;
            int i = mfeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfeVar.b = i - Integer.MIN_VALUE;
            } else {
                mfeVar = new mfe(this, aolnVar);
            }
        } else {
            mfeVar = new mfe(this, aolnVar);
        }
        java.lang.Object obj = mfeVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mfeVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.a;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 2, (char[]) null);
            mfeVar.b = 1;
            if (r5.a(jblVar, mfeVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b2 -> B:28:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object U(java.lang.String r7, defpackage.aoln r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mdm
            if (r0 == 0) goto L13
            r0 = r8
            mdm r0 = (defpackage.mdm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mdm r0 = new mdm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.Object r6 = r0.a
            defpackage.aooc.af(r8)
            goto Lb4
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.aooc.af(r8)
            aivp r8 = defpackage.aivp.a
            akzx r8 = r8.m()
            ahda r8 = defpackage.aiql.ao(r8)
            if (r7 == 0) goto L86
            aivo r2 = defpackage.aivo.a
            akzx r2 = r2.m()
            if (r2 != 0) goto L4e
            java.lang.String r4 = "builder"
            defpackage.aooh.i(r4)
        L4e:
            r2.u()
            alad r4 = r2.b
            aivo r4 = (defpackage.aivo) r4
            j$.util.Objects.requireNonNull(r7)
            int r5 = r4.b
            r5 = r5 | r3
            r4.b = r5
            r4.c = r7
            alad r7 = r2.r()
            java.lang.String r2 = "build(...)"
            defpackage.aooh.e(r7, r2)
            aivo r7 = (defpackage.aivo) r7
            if (r7 != 0) goto L71
            java.lang.String r2 = "value"
            defpackage.aooh.i(r2)
        L71:
            java.lang.Object r2 = r8.a
            akzx r2 = (defpackage.akzx) r2
            r2.u()
            alad r2 = r2.b
            aivp r2 = (defpackage.aivp) r2
            j$.util.Objects.requireNonNull(r7)
            r2.c = r7
            int r7 = r2.b
            r7 = r7 | r3
            r2.b = r7
        L86:
            aivp r7 = r8.i()
            java.lang.Object r6 = r6.a
            zzx r6 = (defpackage.zzx) r6
            aihd r6 = r6.e()
            ailj r6 = r6.iterator()
            java.lang.String r8 = "iterator(...)"
            defpackage.aooh.e(r6, r8)
        L9b:
            r8 = r6
            ailj r8 = (defpackage.ailj) r8
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r8 = r8.next()
            mdo r8 = (defpackage.mdo) r8
            r0.a = r6
            r0.c = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 == r1) goto Lbf
        Lb4:
            r7 = r8
            aivp r7 = (defpackage.aivp) r7
            goto L9b
        Lb8:
            apdi r6 = defpackage.mdn.a
            acme r1 = new acme
            r1.<init>(r6, r7)
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaw.U(java.lang.String, aoln):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(defpackage.zal zalVar, java.lang.String str) {
        aK(((java.lang.Enum) zalVar).name(), str);
        ((defpackage.mgw) this.a).c();
    }

    public final void X(java.lang.String str, java.lang.String str2) {
        aL(str, str2);
        ((defpackage.mgw) this.a).c();
    }

    public final void Y(java.lang.String str, java.lang.String str2) {
        aL(str, str2);
        ((defpackage.mgw) this.a).c();
    }

    public final void Z(defpackage.mce mceVar, java.lang.String str) {
        aK(mceVar.name(), str);
        ((defpackage.mgw) this.a).c();
    }

    public final java.lang.String a(kiw kiwVar) {
        defpackage.udj udjVarB = defpackage.udj.b(kiwVar.l);
        if (udjVarB == null) {
            udjVarB = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        if (udjVarB == defpackage.udj.SPAM_STATUS_SPAM) {
            return "";
        }
        return ((defpackage.lvs) this.a).c(kiwVar.c, kiwVar.d);
    }

    public final java.lang.Object aA(java.lang.Object obj) {
        defpackage.aooh.f(obj, "key");
        return ((java.util.LinkedHashMap) this.a).remove(obj);
    }

    public final boolean aB() {
        return ((java.util.LinkedHashMap) this.a).isEmpty();
    }

    public final defpackage.bo aC() {
        return ((defpackage.bd) this.a).e;
    }

    public final void aD() {
        ((defpackage.bd) this.a).e.noteStateNotSaved();
    }

    public final void aE() {
        ((defpackage.bd) this.a).e.ak(true);
    }

    public final defpackage.rsr aF(java.util.Collection collection) {
        return new defpackage.rsr(((java.lang.String) this.a) + " IN (" + android.text.TextUtils.join(",", java.util.Collections.nCopies(collection.size(), "?")) + ')', collection).aB();
    }

    public final defpackage.rsr aG(java.lang.String... strArr) {
        return aF(strArr == null ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(strArr));
    }

    public final defpackage.rsr aH(java.lang.String str) {
        return defpackage.rsr.az(((java.lang.String) this.a) + ' ' + str, new java.lang.String[0]);
    }

    public final defpackage.rsr aI(java.lang.String str, java.lang.Object obj) {
        str.getClass();
        return defpackage.rsr.az(((java.lang.String) this.a) + ' ' + str + " ?", obj.toString());
    }

    public final defpackage.rsr aJ() {
        return defpackage.rsr.az(((java.lang.String) this.a).concat(" IS NOT NULL"), new java.lang.String[0]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gom, java.lang.Object] */
    public final boolean aa(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        return this.a.f(activity);
    }

    public final java.lang.Class ab() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) this.a).loadClass("androidx.window.extensions.WindowExtensions");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean ac() {
        return defpackage.gus.C(new defpackage.ghb(this, 4)) && defpackage.gus.B("WindowExtensionsProvider#getWindowExtensions is not valid", new defpackage.ghb(this, 5));
    }

    public final void ad() {
        ((defpackage.cop) this.a).f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gii, java.lang.Object] */
    public final void ae(android.os.Bundle bundle) {
        defpackage.cop copVar = (defpackage.cop) this.a;
        if (!copVar.a) {
            copVar.f();
        }
        ?? r0 = copVar.e;
        if (r0.P().a().a(defpackage.emq.d)) {
            defpackage.emq emqVarA = r0.P().a();
            java.util.Objects.toString(emqVarA);
            throw new java.lang.IllegalStateException("performRestore cannot be called when owner is ".concat(java.lang.String.valueOf(emqVarA)));
        }
        defpackage.gim gimVar = (defpackage.gim) copVar.d;
        if (gimVar.b) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.");
        }
        android.os.Bundle bundleA = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleA = defpackage.gie.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        gimVar.b(bundleA);
    }

    public final void af(android.os.Bundle bundle) {
        defpackage.aooh.f(bundle, "outBundle");
        defpackage.aooh.f(bundle, "outBundle");
        android.os.Bundle bundleA = ((defpackage.gim) ((defpackage.cop) this.a).d).a();
        if (bundleA.isEmpty()) {
            return;
        }
        defpackage.aooh.f(bundle, "source");
        defpackage.gij.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kaw] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final java.lang.Object ag(defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.gdl gdlVar;
        if (aolnVar instanceof defpackage.gdl) {
            gdlVar = (defpackage.gdl) aolnVar;
            int i = gdlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdlVar.b = i - Integer.MIN_VALUE;
            } else {
                gdlVar = new defpackage.gdl(this, aolnVar);
            }
        } else {
            gdlVar = new defpackage.gdl(this, aolnVar);
        }
        java.lang.Object obj = gdlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gdlVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.gdm gdmVar = new defpackage.gdm(this, aonjVar, null);
                gdlVar.b = 1;
                java.lang.Object objM = defpackage.aosv.m(gdmVar, gdlVar);
                this = objM;
                if (objM == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
                this = this;
            }
        } catch (defpackage.gdi e) {
            if (e.a != this) {
                throw e;
            }
        }
        return defpackage.aojh.a;
    }

    public final void ah(defpackage.gds gdsVar) {
        defpackage.gdq gdqVar = gdsVar instanceof defpackage.gdq ? (defpackage.gdq) gdsVar : null;
        ((defpackage.uqz) ((defpackage.gbl) this.a).h.a).c(gdqVar, new defpackage.bae(gdsVar, 15));
    }

    public final java.lang.Object ai() {
        return ((java.util.concurrent.atomic.AtomicReference) this.a).get();
    }

    public final boolean aj(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.anty.Q((java.util.concurrent.atomic.AtomicReference) this.a, obj, obj2);
    }

    public final int ak() {
        return ((java.util.concurrent.atomic.AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void al() {
        ?? r2 = this.a;
        for (int iAZ = defpackage.ajsz.aZ(r2); iAZ >= 0; iAZ--) {
            ((defpackage.ddl) ((defpackage.apnt) ((java.util.ArrayList) r2).get(iAZ)).a).g();
        }
    }

    public final void am() {
        ((java.util.HashMap) this.a).clear();
    }

    public final void an(java.lang.String str) {
        ((android.view.ViewStructure) this.a).setClassName(str);
    }

    public final void ao(java.lang.CharSequence charSequence) {
        ((android.view.ViewStructure) this.a).setText(charSequence);
    }

    public final defpackage.aaha ap() {
        return (defpackage.aaha) ((defpackage.cop) this.a).c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ccp, java.lang.Object] */
    public final void aq(int i) {
        this.a.b(new defpackage.cud(i));
    }

    public final void ar(int i) {
        int i2 = 6;
        if (i != 6) {
            i2 = 3;
            if (i != 3) {
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 9;
                    if (i != 9) {
                        i2 = 1;
                        if (i != 1) {
                            i2 = -1;
                        }
                    }
                }
            }
        }
        java.lang.Object obj = this.a;
        int i3 = defpackage.dzs.a;
        if (i2 == -1) {
            i2 = -1;
        }
        if (i2 != -1) {
            ((android.view.View) obj).performHapticFeedback(i2);
        }
    }

    public final defpackage.bdh as(int i, int i2) {
        defpackage.bdh bdhVar = new defpackage.bdh(i, i2);
        ((defpackage.cfc) this.a).n(bdhVar);
        return bdhVar;
    }

    public final void at(defpackage.bdh bdhVar) {
        ((defpackage.cfc) this.a).m(bdhVar);
    }

    public final boolean au() {
        return ((defpackage.cfc) this.a).b != 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoyq, java.lang.Object] */
    public final java.lang.Object av(defpackage.avj avjVar, defpackage.aoln aolnVar) {
        java.lang.Object objA = this.a.a(avjVar, aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoyq, java.lang.Object] */
    public final void aw(defpackage.avj avjVar) {
        this.a.d(avjVar);
    }

    public final void ax(java.lang.Throwable th) {
        defpackage.cfc cfcVar = (defpackage.cfc) this.a;
        int i = cfcVar.b;
        defpackage.aosb[] aosbVarArr = new defpackage.aosb[i];
        for (int i2 = 0; i2 < i; i2++) {
            aosbVarArr[i2] = ((defpackage.aqe) cfcVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            aosbVarArr[i3].g(th);
        }
        if (cfcVar.b != 0) {
            avo.d("uncancelled requests present");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajn, java.lang.Object] */
    public final alv ay() {
        return new alv((defpackage.ajn) this.a);
    }

    public final java.lang.Object az(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            defpackage.aooh.i("key");
        }
        if (obj2 == null) {
            defpackage.aooh.i("value");
        }
        return ((java.util.LinkedHashMap) this.a).put(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final int b() {
        ?? r4 = this.a;
        if (((java.lang.Long) r4.a()).longValue() == 233349) {
            return 2132021043;
        }
        if (((java.lang.Long) r4.a()).longValue() == 233350) {
            return 2132018863;
        }
        return ((java.lang.Long) r4.a()).longValue() == 233351 ? 2132021033 : 2132017897;
    }

    public final java.lang.Object e(defpackage.aoln aolnVar) {
        defpackage.tcc tccVar = ((jrn) this.a).b;
        return defpackage.aosv.D(defpackage.aosv.F(tccVar.a, 0, new sge(tccVar, (defpackage.aoln) null, 20), 3), aolnVar);
    }

    public final /* synthetic */ defpackage.jbr f() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.jbr) aladVarR;
    }

    public final /* synthetic */ void g() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.jbr jbrVar = (defpackage.jbr) akzxVar.b;
        defpackage.jbr jbrVar2 = defpackage.jbr.a;
        jbrVar.j = defpackage.albq.a;
    }

    public final /* synthetic */ void h() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.jbr) ((defpackage.akzx) this.a).b).j);
        defpackage.aooh.e(listUnmodifiableList, "getBeeslyTimeoutDataList(...)");
        new defpackage.alct(listUnmodifiableList);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [ahzi, java.lang.Object] */
    public final void i(java.lang.String str, java.lang.String str2) {
        try {
            ((android.content.SharedPreferences) this.a.eZ()).edit().putString(str, str2).apply();
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lvs.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl$SafeSharedPreferences", "putString", (char) 212, "ContactDisplayPreferencesImpl.java")).y("unable to write %s", str);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [ahzi, java.lang.Object] */
    public final void j(java.lang.String str) {
        try {
            ((android.content.SharedPreferences) this.a.eZ()).edit().remove(str).apply();
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lvs.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl$SafeSharedPreferences", "remove", (char) 220, "ContactDisplayPreferencesImpl.java")).y("unable to remove %s", str);
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [ahzi, java.lang.Object] */
    public final boolean k(java.lang.String str) {
        try {
            return ((android.content.SharedPreferences) this.a.eZ()).contains(str);
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lvs.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl$SafeSharedPreferences", "contains", (char) 177, "ContactDisplayPreferencesImpl.java")).y("unable to check if %s exists, returning false", str);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ahzi, java.lang.Object] */
    public final int l(java.lang.String str) {
        try {
            return ((android.content.SharedPreferences) this.a.eZ()).getInt(str, 1);
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lvs.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl$SafeSharedPreferences", "getInt", 190, "ContactDisplayPreferencesImpl.java")).G("unable to get %s, returning default value %d", str, 1);
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ahzi, java.lang.Object] */
    public final java.lang.String m(java.lang.String str) {
        try {
            return ((android.content.SharedPreferences) this.a.eZ()).getString(str, null);
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.lvs.a.d()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl$SafeSharedPreferences", "getString", 203, "ContactDisplayPreferencesImpl.java")).I("unable to get %s, returning default value %s", str, null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq n(java.lang.Iterable iterable, defpackage.ahyp ahypVar, java.lang.Object obj) {
        lov lovVar = new lov(iterable);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(lovVar);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(((lou) lovVar).a.size());
        defpackage.aify aifyVar = ((lou) lovVar).a;
        int size = aifyVar.size();
        int i = 0;
        while (i < size) {
            defpackage.ajcq ajcqVar = (defpackage.ajcq) aifyVar.get(i);
            defpackage.kaw kawVar = this;
            ajcqVar.c(new akwx(kawVar, atomicReference, ajcqVar, ahypVar, atomicInteger, obj, 1), kawVar.a);
            i++;
            this = kawVar;
        }
        return lovVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq o(java.util.Set set, defpackage.ajat ajatVar) {
        defpackage.aca acaVar = new defpackage.aca();
        for (java.lang.Object obj : set) {
            try {
                acaVar.put(obj, ajatVar.a(obj));
            } catch (java.lang.Exception e) {
                return new defpackage.ajdd(e);
            }
        }
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(acaVar.values())), (byte[]) null).o(new defpackage.guy(acaVar, 5), this.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq p(defpackage.ajcq ajcqVar) {
        defpackage.kvf kvfVar = new defpackage.kvf(5);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
        int i = defpackage.ajan.c;
        ?? r3 = this.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(r3, ajamVar));
        return ajamVar;
    }

    public final java.lang.Boolean q(long j) {
        return (java.lang.Boolean) ((j$.util.concurrent.ConcurrentHashMap) this.a).get(java.lang.Long.valueOf(j));
    }

    public final boolean r() {
        java.util.Collection<java.lang.Boolean> collectionValues = ((j$.util.concurrent.ConcurrentHashMap) this.a).values();
        defpackage.aooh.e(collectionValues, "<get-values>(...)");
        if (collectionValues.isEmpty()) {
            return false;
        }
        for (java.lang.Boolean bool : collectionValues) {
            defpackage.aooh.c(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void s(long j) {
        this.a.put(java.lang.Long.valueOf(j), java.lang.Boolean.TRUE);
    }

    public final boolean t(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        lra lraVar = null;
        if (((defpackage.gus) defpackage.aooh.q(optionalG)) != null) {
            defpackage.aooh.f(kiuVar, "coalescedRow");
            defpackage.akzc akzcVar = (defpackage.akzc) j$.util.DesugarCollections.unmodifiableMap(kiuVar.L).get(defpackage.ken.CONTACT_CHECKER.k);
            if (akzcVar != null) {
                lraVar = (lra) defpackage.alad.v(lra.a, akzcVar);
            }
        }
        return lraVar != null;
    }

    public final android.net.Uri u(java.io.File file) {
        defpackage.aooh.f(file, "file");
        android.net.Uri uriB = androidx.core.content.FileProvider.b((android.content.Context) this.a, file);
        defpackage.aooh.e(uriB, "getUriForFile(...)");
        return uriB;
    }

    public final android.net.Uri v(java.lang.String str) {
        defpackage.aooh.f(str, "filePath");
        android.net.Uri uriB = androidx.core.content.FileProvider.b((android.content.Context) this.a, new java.io.File(str));
        defpackage.aooh.e(uriB, "getUriForFile(...)");
        return uriB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kel] */
    public final defpackage.odu w(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        return (defpackage.odu) hgt.w(kiuVar, (defpackage.kel) this.a);
    }

    public final /* synthetic */ defpackage.nwy x() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.nwy) aladVarR;
    }

    public final void y(defpackage.nwv nwvVar) {
        defpackage.aooh.f(nwvVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nwy nwyVar = (defpackage.nwy) akzxVar.b;
        defpackage.nwy nwyVar2 = defpackage.nwy.a;
        nwyVar.c = nwvVar.a();
        nwyVar.b |= 1;
    }

    public final void z(nwx nwxVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.nwy nwyVar = (defpackage.nwy) akzxVar.b;
        defpackage.nwy nwyVar2 = defpackage.nwy.a;
        nwyVar.d = nwxVar.a();
        nwyVar.b |= 2;
    }

    public kaw(java.lang.Object obj) {
        this.a = obj;
    }

    public kaw(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kaw(jrn jrnVar) {
        defpackage.aooh.f(jrnVar, "callerIdAndSpamSettingsDataService");
        this.a = jrnVar;
    }

    public kaw(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.cfc(new defpackage.aqe[16]);
    }

    public kaw(char[] cArr, char[] cArr2) {
        this.a = new defpackage.cfc(new defpackage.bdh[16]);
    }

    public kaw() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public kaw(defpackage.apnt apntVar) {
        if (apntVar == null) {
            defpackage.aooh.i("callback");
        }
        this.a = apntVar;
    }

    public kaw(defpackage.zzx zzxVar) {
        this.a = zzxVar.e();
    }

    public kaw(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public kaw(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new java.util.LinkedHashMap();
    }

    public kaw(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = defpackage.aoyx.c(0, 16, 2, 1);
    }

    public kaw(defpackage.aoin aoinVar, char[] cArr) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableAnswerSwipeAccessibilityActions");
        }
        this.a = aoinVar;
    }

    public kaw(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.a = aolrVar;
    }

    public kaw(byte[] bArr) {
        this.a = new defpackage.ajxw(this);
    }

    public kaw(byte[] bArr, char[] cArr) {
        this.a = new defpackage.cpq();
    }

    public kaw(short[] sArr, byte[] bArr) {
        this.a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public kaw(int i) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cud(i), defpackage.cdu.c);
    }

    public kaw(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("haloConfigProto");
        }
        this.a = aoinVar;
    }

    public kaw(defpackage.git gitVar) {
        if (gitVar == null) {
            defpackage.aooh.i("openHelper");
        }
        this.a = gitVar;
    }

    public kaw(defpackage.mgw mgwVar) {
        if (mgwVar == null) {
            defpackage.aooh.i("recorder");
        }
        this.a = mgwVar;
    }

    public kaw(defpackage.ecx ecxVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        this.a = ecxVar;
    }

    public kaw(defpackage.gom gomVar) {
        if (gomVar == null) {
            defpackage.aooh.i("backend");
        }
        this.a = gomVar;
    }

    public kaw(short[] sArr) {
        this.a = new defpackage.adb(10);
    }

    public kaw(android.content.Context context, short[] sArr) {
        java.lang.Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.a = (android.view.accessibility.AccessibilityManager) systemService;
    }

    public kaw(defpackage.zpm zpmVar) {
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.a = zpmVar;
    }

    public kaw(android.content.Context context, char[] cArr) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.a = context;
    }

    public kaw(defpackage.moe moeVar) {
        if (moeVar == null) {
            defpackage.aooh.i("expressoCallLogDataIntegration");
        }
        this.a = moeVar;
    }

    public kaw(char[] cArr, byte[] bArr) {
        this.a = new java.util.HashMap();
    }

    public kaw(android.content.Context context, byte[] bArr) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.a = context;
    }

    public kaw(android.view.View view, byte[] bArr) {
        this.a = view;
        defpackage.aooc.ah(3, new defpackage.ddw(this, 7));
    }

    public kaw(android.widget.TextView textView) {
        this.a = new defpackage.ekj();
    }

    public kaw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.ArrayList();
    }

    public kaw(char[] cArr) {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
    }
}
