package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class vk {
    public final java.lang.Object a;

    public vk(android.os.Bundle bundle) {
        aooh.f(bundle, "state");
        bundle.setClassLoader(getClass().getClassLoader());
        this.a = new defpackage.adss(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    private final java.util.List T(defpackage.fva fvaVar) {
        java.lang.String str;
        int i;
        java.util.List listSingletonList;
        defpackage.etx etxVar = new defpackage.etx(fvaVar.e);
        ?? arrayList = this.a;
        while (etxVar.d() > 0) {
            int iN = etxVar.n();
            int iN2 = etxVar.c + etxVar.n();
            if (iN == 134) {
                arrayList = new java.util.ArrayList();
                int iN3 = etxVar.n() & 31;
                for (int i2 = 0; i2 < iN3; i2++) {
                    java.lang.String strC = etxVar.C(3);
                    int iN4 = etxVar.n();
                    boolean z = (iN4 & 128) != 0;
                    if (z) {
                        i = iN4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA = etxVar.a();
                    etxVar.R(1);
                    if (z) {
                        int i3 = bA & 64;
                        byte[] bArr = defpackage.ete.a;
                        listSingletonList = java.util.Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    defpackage.eqf eqfVar = new defpackage.eqf();
                    eqfVar.c(str);
                    eqfVar.d = strC;
                    eqfVar.L = i;
                    eqfVar.q = listSingletonList;
                    arrayList.add(new defpackage.eqg(eqfVar));
                }
            }
            etxVar.Q(iN2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private final boolean U(defpackage.flk flkVar, int i) {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    byte[] bArr = ((defpackage.etx) this.a).b;
                    java.lang.System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                java.lang.Object obj = this.a;
                int i6 = i4 + 10;
                ((defpackage.flc) flkVar).n(((defpackage.etx) obj).b, i6 - i5, i5, false);
                defpackage.etx etxVar = (defpackage.etx) obj;
                etxVar.Q(i2);
                etxVar.P(i6);
                if (etxVar.d() < 3) {
                    throw new java.lang.IndexOutOfBoundsException("position=" + etxVar.c + ", limit=" + etxVar.d);
                }
                int iP = etxVar.p();
                etxVar.c -= 3;
                if (iP == 4801587) {
                    etxVar.R(3);
                    if (defpackage.foi.d(etxVar.n())) {
                        ((defpackage.etx) this.a).Q(i2);
                        return true;
                    }
                } else if (defpackage.flw.a(etxVar.g()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    etxVar.H(20);
                }
                i3++;
            } catch (java.io.EOFException unused) {
                return false;
            }
        } while (i3 <= i);
        return false;
    }

    public final /* synthetic */ void A() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.myz) ((akzx) this.a).b).c);
        aooh.e(listUnmodifiableList, "getAnnotationsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.myy B() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.myy) aladVarP;
    }

    public final void C(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myy myyVar = (defpackage.myy) akzxVar.b;
        defpackage.myy myyVar2 = defpackage.myy.a;
        myyVar.c = i;
    }

    public final void D() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myy myyVar = (defpackage.myy) akzxVar.b;
        defpackage.myy myyVar2 = defpackage.myy.a;
        myyVar.b = 0;
    }

    public final void E() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myy myyVar = (defpackage.myy) akzxVar.b;
        defpackage.myy myyVar2 = defpackage.myy.a;
        myyVar.d = a.T(3);
    }

    public final /* synthetic */ defpackage.moc F() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.moc) aladVarP;
    }

    public final /* synthetic */ defpackage.mnh G() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mnh) aladVarP;
    }

    public final void H(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mnh mnhVar = (defpackage.mnh) akzxVar.b;
        defpackage.mnh mnhVar2 = defpackage.mnh.a;
        mnhVar.c = java.lang.Integer.valueOf(a.T(i));
        mnhVar.b = 1;
    }

    public final /* synthetic */ defpackage.mne I() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mne) aladVarP;
    }

    public final void J(defpackage.mnd mndVar) {
        aooh.f(mndVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mne mneVar = (defpackage.mne) akzxVar.b;
        defpackage.mne mneVar2 = defpackage.mne.a;
        mneVar.c = mndVar.a();
        mneVar.b |= 1;
    }

    public final /* synthetic */ defpackage.mmz K() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mmz) aladVarP;
    }

    public final /* synthetic */ mmy L() {
        mmy mmyVarP = ((akzx) this.a).p();
        aooh.e(mmyVarP, "build(...)");
        return mmyVarP;
    }

    public final /* synthetic */ defpackage.mmg M() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mmg) aladVarP;
    }

    public final void N(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mmg mmgVar = (defpackage.mmg) akzxVar.b;
        defpackage.mmg mmgVar2 = defpackage.mmg.a;
        mmgVar.b = z;
    }

    public final /* synthetic */ defpackage.lxn O() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.lxn) aladVarP;
    }

    public final void P(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.lxn lxnVar = (defpackage.lxn) akzxVar.b;
        defpackage.lxn lxnVar2 = defpackage.lxn.a;
        lxnVar.c = z;
    }

    public final void Q(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.lxn lxnVar = (defpackage.lxn) akzxVar.b;
        defpackage.lxn lxnVar2 = defpackage.lxn.a;
        lxnVar.b = z;
    }

    public final /* synthetic */ defpackage.lvl R() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.lvl) aladVarP;
    }

    public final defpackage.eqy S(defpackage.flk flkVar, defpackage.hgu hguVar, int i) {
        defpackage.eqy eqyVarC = null;
        int i2 = 0;
        while (U(flkVar, i)) {
            defpackage.etx etxVar = (defpackage.etx) this.a;
            int i3 = etxVar.c;
            etxVar.R(6);
            int iM = etxVar.m();
            int i4 = iM + 10;
            defpackage.flc flcVar = (defpackage.flc) flkVar;
            long j = flcVar.a;
            if (j != -1 && flkVar.e() + ((long) iM) > j) {
                defpackage.etr.f("Id3Peeker", "Skipping ID3 tag with tagLength=" + i4 + " greater than input length=" + j);
                break;
            }
            if (eqyVarC == null) {
                byte[] bArr = new byte[i4];
                java.lang.System.arraycopy(etxVar.b, i3, bArr, 0, 10);
                flcVar.n(bArr, 10, iM, false);
                eqyVarC = new defpackage.foi(hguVar).c(bArr, i4);
            } else {
                flcVar.m(iM, false);
            }
            i2 += i4;
        }
        flkVar.k();
        ((defpackage.flc) flkVar).m(i2, false);
        return eqyVarC;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object obj = this.a;
        if (obj != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((java.lang.Integer) obj).intValue());
        }
        return bundle;
    }

    public final java.lang.String b(int i) {
        try {
            java.lang.Object obj = this.a;
            aooh.c(obj);
            java.lang.String resourceName = ((android.content.Context) obj).getResources().getResourceName(i);
            aooh.c(resourceName);
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(i);
        }
    }

    public final int c() {
        return ((defpackage.adss) this.a).a;
    }

    public final android.os.Bundle d() {
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        defpackage.adss adssVar = (defpackage.adss) this.a;
        gij.d(bundleR, "nav-entry-state:id", (java.lang.String) adssVar.b);
        bundleR.putInt("nav-entry-state:destination-id", adssVar.a);
        java.lang.Object objR = adssVar.d;
        if (objR == null) {
            objR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        }
        gij.b(bundleR, "nav-entry-state:args", (android.os.Bundle) objR);
        gij.b(bundleR, "nav-entry-state:saved-state", (android.os.Bundle) adssVar.c);
        return bundleR;
    }

    public final java.lang.String e() {
        return (java.lang.String) ((defpackage.adss) this.a).b;
    }

    public final boolean f() {
        defpackage.fpu fpuVar = (defpackage.fpu) ((defpackage.vk) this.a).a;
        return fpuVar.a && fpuVar.b;
    }

    public final defpackage.jkq g(defpackage.fva fvaVar) {
        return new defpackage.jkq(T(fvaVar));
    }

    public final defpackage.fvs h(defpackage.vk vkVar, defpackage.fwc fwcVar, emq emqVar, defpackage.fwl fwlVar) {
        aooh.f(vkVar, "context");
        aooh.f(emqVar, "hostLifecycleState");
        defpackage.adss adssVar = (defpackage.adss) this.a;
        java.lang.Object obj = adssVar.d;
        if (obj != null) {
            aooh.f(vkVar, "context");
            java.lang.Object obj2 = vkVar.a;
            ((android.os.Bundle) obj).setClassLoader(obj2 != null ? ((android.content.Context) obj2).getClassLoader() : null);
        } else {
            obj = null;
        }
        aooh.f(vkVar, "context");
        aooh.f(emqVar, "hostLifecycleState");
        return defpackage.hgt.ah(vkVar, fwcVar, (android.os.Bundle) obj, emqVar, fwlVar, (java.lang.String) adssVar.b, (android.os.Bundle) adssVar.c);
    }

    public final defpackage.jyn i(defpackage.fva fvaVar) {
        return new defpackage.jyn(T(fvaVar));
    }

    public final /* synthetic */ defpackage.mze j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mze) aladVarP;
    }

    public final /* synthetic */ alct k() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mze) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getSuggestedRepliesList(...)");
        return new alct(listUnmodifiableList);
    }

    public final /* synthetic */ void l(defpackage.mzg mzgVar) {
        aooh.f(mzgVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mze mzeVar = (defpackage.mze) akzxVar.b;
        defpackage.mze mzeVar2 = defpackage.mze.a;
        j$.util.Objects.requireNonNull(mzgVar);
        mzeVar.b();
        mzeVar.b.add(mzgVar);
    }

    public final /* synthetic */ defpackage.mzd m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mzd) aladVarP;
    }

    public final void n(defpackage.mze mzeVar) {
        aooh.f(mzeVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzd mzdVar = (defpackage.mzd) akzxVar.b;
        defpackage.mzd mzdVar2 = defpackage.mzd.a;
        j$.util.Objects.requireNonNull(mzeVar);
        mzdVar.d = mzeVar;
        mzdVar.b |= 1;
    }

    public final /* synthetic */ void o(defpackage.mzc mzcVar) {
        aooh.f(mzcVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzd mzdVar = (defpackage.mzd) akzxVar.b;
        defpackage.mzd mzdVar2 = defpackage.mzd.a;
        j$.util.Objects.requireNonNull(mzcVar);
        mzdVar.b();
        mzdVar.c.add(mzcVar);
    }

    public final /* synthetic */ void p(int i, defpackage.mzc mzcVar) {
        aooh.f(mzcVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzd mzdVar = (defpackage.mzd) akzxVar.b;
        defpackage.mzd mzdVar2 = defpackage.mzd.a;
        j$.util.Objects.requireNonNull(mzcVar);
        mzdVar.b();
        mzdVar.c.set(i, mzcVar);
    }

    public final /* synthetic */ void q() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mzd) ((akzx) this.a).b).c);
        aooh.e(listUnmodifiableList, "getConversationItemsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.mzc r() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.mzc) aladVarP;
    }

    public final defpackage.mzh s() {
        defpackage.mzc mzcVar = (defpackage.mzc) ((akzx) this.a).b;
        defpackage.mzh mzhVar = mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a;
        aooh.e(mzhVar, "getUtterance(...)");
        return mzhVar;
    }

    public final void t(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzc mzcVar = (defpackage.mzc) akzxVar.b;
        defpackage.mzc mzcVar2 = defpackage.mzc.a;
        mzcVar.d = j;
    }

    public final void u(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzc mzcVar = (defpackage.mzc) akzxVar.b;
        defpackage.mzc mzcVar2 = defpackage.mzc.a;
        mzcVar.e = j;
    }

    public final void v(defpackage.mzh mzhVar) {
        aooh.f(mzhVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.mzc mzcVar = (defpackage.mzc) akzxVar.b;
        defpackage.mzc mzcVar2 = defpackage.mzc.a;
        j$.util.Objects.requireNonNull(mzhVar);
        mzcVar.c = mzhVar;
        mzcVar.b = 3;
    }

    public final /* synthetic */ defpackage.myz w() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.myz) aladVarP;
    }

    public final void x(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myz myzVar = (defpackage.myz) akzxVar.b;
        defpackage.myz myzVar2 = defpackage.myz.a;
        j$.util.Objects.requireNonNull(str);
        myzVar.b = str;
    }

    public final /* synthetic */ void y(defpackage.myy myyVar) {
        aooh.f(myyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myz myzVar = (defpackage.myz) akzxVar.b;
        defpackage.myz myzVar2 = defpackage.myz.a;
        j$.util.Objects.requireNonNull(myyVar);
        alat alatVar = myzVar.c;
        if (!alatVar.c()) {
            myzVar.c = alad.J(alatVar);
        }
        myzVar.c.add(myyVar);
    }

    public final /* synthetic */ void z() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.myz myzVar = (defpackage.myz) akzxVar.b;
        defpackage.myz myzVar2 = defpackage.myz.a;
        myzVar.c = albq.a;
    }

    public vk(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vk(java.lang.Object obj, char[] cArr) {
        this.a = obj;
    }

    public vk() {
        this.a = new add(8);
    }

    public vk(gpd gpdVar) {
        aooh.f(gpdVar, "loggerFactory");
        this.a = gpdVar;
    }

    public vk(java.lang.String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("name cannot be empty");
        }
    }

    public vk(defpackage.fvs fvsVar) {
        aooh.f(fvsVar, "entry");
        this.a = new defpackage.adss(fvsVar, fvsVar.a.b());
    }

    public vk(byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.etx(10);
    }

    public vk(java.lang.Object obj) {
        this.a = new java.lang.ref.WeakReference(obj);
    }

    public vk(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
    }
}
