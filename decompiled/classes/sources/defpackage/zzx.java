package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzx {
    private static volatile defpackage.zzx b;
    public final java.lang.Object a;

    public zzx(char[] cArr, char[] cArr2) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        if (timeUnit == null) {
            defpackage.aooh.i("timeUnit");
        }
        defpackage.apkc apkcVar = defpackage.apkc.a;
        defpackage.apkh apkhVar = defpackage.apkh.a;
        if (timeUnit == null) {
            defpackage.aooh.i("timeUnit");
        }
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        this.a = new defpackage.apkv(apkcVar, timeUnit, apkhVar);
    }

    public static defpackage.zzx a() {
        if (b == null) {
            synchronized (defpackage.zzx.class) {
                if (b == null) {
                    b = new defpackage.zzx();
                }
            }
        }
        return b;
    }

    public static final java.lang.String n(defpackage.zat zatVar) {
        defpackage.zao zaoVar = zatVar.a;
        java.util.Collection collectionValues = zaoVar.b.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collectionValues, 10));
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.zan) it.next()).a);
        }
        java.util.Set set = zaoVar.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(set.size());
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((defpackage.zam) it2.next()).b.a);
        }
        java.util.Set setCe = defpackage.ajsz.ce(arrayList);
        defpackage.ajsz.bv(setCe, arrayList2);
        java.lang.String str = setCe.size() == 1 ? ((defpackage.aenj) defpackage.ajsz.bD(setCe)).a : "Multiple CUIs";
        if (str == null) {
            defpackage.aooh.g();
        }
        return str + " started from " + zaoVar.g;
    }

    public final /* synthetic */ defpackage.agoq A() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.agoq) aladVarP;
    }

    public final void B(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.agoq agoqVar = (defpackage.agoq) ((defpackage.akzz) obj).b;
        defpackage.agoq agoqVar2 = defpackage.agoq.a;
        j$.util.Objects.requireNonNull(str);
        agoqVar.b |= 16;
        agoqVar.g = str;
    }

    public final void C(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.agoq agoqVar = (defpackage.agoq) ((defpackage.akzz) obj).b;
        defpackage.agoq agoqVar2 = defpackage.agoq.a;
        j$.util.Objects.requireNonNull(str);
        agoqVar.b |= 2;
        agoqVar.d = str;
    }

    public final void D(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.agoq agoqVar = (defpackage.agoq) ((defpackage.akzz) obj).b;
        defpackage.agoq agoqVar2 = defpackage.agoq.a;
        j$.util.Objects.requireNonNull(str);
        agoqVar.b |= 1;
        agoqVar.c = str;
    }

    public final void E() {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.agoq agoqVar = (defpackage.agoq) ((defpackage.akzz) obj).b;
        defpackage.agoq agoqVar2 = defpackage.agoq.a;
        j$.util.Objects.requireNonNull("google");
        agoqVar.b |= 256;
        agoqVar.j = "google";
    }

    public final defpackage.ajcq F(defpackage.afig afigVar) {
        defpackage.ajbg ajbgVarB = ((defpackage.afhx) this.a).b();
        defpackage.afhl afhlVar = new defpackage.afhl(afigVar, 2);
        long j = defpackage.ahqx.a;
        return ajbgVarB.d(new defpackage.ahqo(defpackage.ahns.c(false), afhlVar), defpackage.ajbm.INSTANCE).h();
    }

    public final defpackage.ajcq G(defpackage.afii afiiVar) {
        defpackage.ajbg ajbgVarB = ((defpackage.afhx) this.a).b();
        defpackage.afhl afhlVar = new defpackage.afhl(afiiVar, 3);
        long j = defpackage.ahqx.a;
        return ajbgVarB.d(new defpackage.ahqo(defpackage.ahns.c(false), afhlVar), defpackage.ajbm.INSTANCE).h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.io.File H(android.net.Uri uri) throws defpackage.afex {
        java.io.File externalFilesDir;
        if (!uri.getScheme().equals("android")) {
            throw new defpackage.afex("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!android.text.TextUtils.isEmpty(uri.getQuery())) {
            throw new defpackage.afex("Did not expect uri to have query");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(uri.getPathSegments());
        java.lang.String str = (java.lang.String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = ((android.content.Context) this.a).getExternalFilesDir(null);
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = ((android.content.Context) this.a).getCacheDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = defpackage.agab.al((android.content.Context) this.a);
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    java.io.File file = new java.io.File(defpackage.agab.al((android.content.Context) this.a), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            if (!defpackage.afeg.c(defpackage.afeg.a((java.lang.String) arrayList.get(2)))) {
                                throw new defpackage.afex("AccountManager cannot be null");
                            }
                        } catch (java.lang.IllegalArgumentException e) {
                            throw new defpackage.afex(e);
                        }
                    }
                    externalFilesDir = file;
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    externalFilesDir = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) this.a).getCacheDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    externalFilesDir = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) this.a).getFilesDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new defpackage.afex(java.lang.String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final int I() {
        return ((java.util.concurrent.atomic.AtomicInteger) this.a).get();
    }

    public final void J(aeyu aeyuVar) {
        aeyuVar.a((defpackage.aeyy) this.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final defpackage.aeve K(float f) {
        java.util.Random random = (java.util.Random) this.a.a();
        random.getClass();
        return new defpackage.aeve(random, f);
    }

    public final /* synthetic */ void L(defpackage.apdi apdiVar, java.lang.Object obj) {
        defpackage.aooh.f(apdiVar, "extension");
        defpackage.aooh.f(obj, "value");
        ((defpackage.akzz) this.a).bV(apdiVar, obj);
    }

    public final defpackage.ajbg M(defpackage.adag adagVar) {
        defpackage.ajbg ajbgVarB = ((defpackage.afhx) this.a).b();
        defpackage.afhl afhlVar = new defpackage.afhl(adagVar, 1);
        long j = defpackage.ahqx.a;
        return ajbgVarB.d(new defpackage.ahqo(defpackage.ahns.c(false), afhlVar), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq N(defpackage.adag adagVar) {
        return ((defpackage.afhx) this.a).b().d(defpackage.ahqx.d(new defpackage.afhl(adagVar, 0)), defpackage.ajbm.INSTANCE).h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized void O(defpackage.apjp apjpVar) {
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        this.a.remove(apjpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized void P(defpackage.apjp apjpVar) {
        defpackage.aooh.f(apjpVar, "failedRoute");
        this.a.add(apjpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean Q(defpackage.apjp apjpVar) {
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        return this.a.contains(apjpVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final java.lang.String R(java.lang.String str) {
        ?? r5 = this.a;
        int size = r5.size() - 2;
        int iAl = defpackage.ajsz.al(size, 0, -2);
        if (iAl > size) {
            return null;
        }
        while (!defpackage.aoov.s(str, (java.lang.String) r5.get(size), true)) {
            if (size == iAl) {
                return null;
            }
            size -= 2;
        }
        return (java.lang.String) r5.get(size + 1);
    }

    public final void S(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (str2 == null) {
            defpackage.aooh.i("value");
        }
        defpackage.aoov.bm(this, str, str2);
    }

    public final void T(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            defpackage.aooh.i("value");
            defpackage.aooh.i("value");
        }
        defpackage.aoov.bh(str);
        defpackage.aoov.bi(str2, str);
        V(str);
        defpackage.aoov.bm(this, str, str2);
    }

    public final void U(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str2, "value");
        defpackage.aooh.f(str2, "value");
        defpackage.aoov.bh(str);
        defpackage.aoov.bi(str2, str);
        defpackage.aoov.bm(this, str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void V(java.lang.String str) {
        int i = 0;
        while (true) {
            ?? r1 = this.a;
            if (i >= r1.size()) {
                return;
            }
            if (defpackage.aoov.s(str, (java.lang.String) r1.get(i), true)) {
                r1.remove(i);
                r1.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final int W() {
        long j = ((defpackage.apcf) ((defpackage.aorq) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final java.lang.Object X() {
        while (true) {
            defpackage.aorq aorqVar = (defpackage.aorq) this.a;
            defpackage.apcf apcfVar = (defpackage.apcf) aorqVar.a;
            java.lang.Object objB = apcfVar.b();
            if (objB != defpackage.apcf.a) {
                return objB;
            }
            aorqVar.d(apcfVar, apcfVar.c());
        }
    }

    public final void Y() {
        while (true) {
            defpackage.aorq aorqVar = (defpackage.aorq) this.a;
            defpackage.apcf apcfVar = (defpackage.apcf) aorqVar.a;
            if (apcfVar.d()) {
                return;
            } else {
                aorqVar.d(apcfVar, apcfVar.c());
            }
        }
    }

    public final boolean Z(java.lang.Object obj) {
        while (true) {
            defpackage.aorq aorqVar = (defpackage.aorq) this.a;
            defpackage.apcf apcfVar = (defpackage.apcf) aorqVar.a;
            int iA = apcfVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            aorqVar.d(apcfVar, apcfVar.c());
        }
    }

    public final defpackage.aorq aa(int i) {
        return ((defpackage.aorq[]) this.a)[i];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aodo, java.lang.Object] */
    public final defpackage.aodq ab() {
        return new defpackage.aodq(this.a);
    }

    public final long ac(long j) {
        return ((java.util.concurrent.atomic.AtomicLong) this.a).addAndGet(j);
    }

    public final android.content.pm.ApplicationInfo b(java.lang.String str, int i) {
        return ((android.content.Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final android.content.pm.PackageInfo c(java.lang.String str, int i) {
        return ((android.content.Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final j$.util.Optional d() {
        return (j$.util.Optional) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final defpackage.aihd e() {
        int i = 9;
        return (defpackage.aihd) j$.util.Collection.-EL.stream((java.util.Set) this.a.a()).filter(new defpackage.opv(i)).map(new defpackage.vaq(i)).collect(defpackage.aido.b);
    }

    public final void f(java.lang.Exception exc) {
        ((defpackage.aauq) this.a).r(exc);
    }

    public final void g(java.lang.Object obj) {
        ((defpackage.aauq) this.a).s(obj);
    }

    public final boolean h(java.lang.Exception exc) {
        defpackage.aais.at(exc, "Exception must not be null");
        java.lang.Object obj = this.a;
        defpackage.aauq aauqVar = (defpackage.aauq) obj;
        synchronized (aauqVar.a) {
            if (((defpackage.aauq) obj).b) {
                return false;
            }
            ((defpackage.aauq) obj).b = true;
            ((defpackage.aauq) obj).d = exc;
            aauqVar.e.i((defpackage.aaum) obj);
            return true;
        }
    }

    public final void i(java.lang.Object obj) {
        ((defpackage.aauq) this.a).t(obj);
    }

    public final void j() {
        ((defpackage.aauq) this.a).t(null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final defpackage.aigf k() {
        int i = 8;
        return (defpackage.aigf) j$.util.Collection.-EL.stream(((java.util.Map) this.a.a()).entrySet()).filter(new defpackage.opv(i)).collect(defpackage.aido.b(new defpackage.vaq(7), new defpackage.vaq(i)));
    }

    public final void l(defpackage.zbo zboVar) {
        defpackage.aihd aihdVarE = ((defpackage.zzx) this.a).e();
        defpackage.aooh.e(aihdVarE, "get(...)");
        java.util.Iterator<E> it = aihdVarE.iterator();
        while (it.hasNext()) {
            ((defpackage.zbp) it.next()).a(zboVar);
        }
    }

    public final boolean m() {
        return !defpackage.abyl.h((android.content.Context) this.a);
    }

    public final boolean o() {
        return j$.util.Collection.-EL.stream(((defpackage.zpm) this.a).a()).anyMatch(new defpackage.vgb(18));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aonj, java.lang.Object] */
    public final j$.util.Optional p() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.wgn) this.a).a);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        defpackage.okr okrVar = new defpackage.okr(new defpackage.rou(5), 7);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(okrVar.a.a(optionalOfNullable.get()));
        }
        defpackage.aooh.e(optionalOfNullable, "map(...)");
        return optionalOfNullable;
    }

    public final defpackage.ajcq q(defpackage.aihd aihdVar) {
        java.lang.Object obj = this.a;
        defpackage.wgl wglVar = (defpackage.wgl) obj;
        return defpackage.ahvr.I(defpackage.ahvr.F(new vug(obj, 5), wglVar.b), new defpackage.vmv(obj, aihdVar, 18, null), wglVar.c);
    }

    public final defpackage.ajcq r() {
        java.lang.Object obj = this.a;
        return defpackage.ahvr.F(new vug(obj, 4), ((defpackage.wgl) obj).b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amwu, java.lang.Object] */
    public final java.lang.String s(defpackage.agoq agoqVar) {
        java.lang.String strE = ((defpackage.agpq) this.a.a()).e(agoqVar);
        return strE == null ? "" : strE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final boolean t(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        return this.a.contains(str);
    }

    public final /* synthetic */ defpackage.ahax u() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ahax) aladVarP;
    }

    public final defpackage.aolr v(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.aolr aolrVarPlus;
        if (scheduledExecutorService == null) {
            defpackage.aooh.i("executor");
        }
        java.lang.Boolean.TRUE.booleanValue();
        if (((java.lang.Boolean) ((defpackage.ahyn) this.a).d(java.lang.Boolean.FALSE)).booleanValue()) {
            aolrVarPlus = new defpackage.aotu(new defpackage.agwc(scheduledExecutorService)).plus(defpackage.agvw.a);
        } else {
            agvu agvuVar = new agvu(scheduledExecutorService);
            aolrVarPlus = new defpackage.aotu(agvuVar).plus(agvuVar);
        }
        return aolrVarPlus.plus(defpackage.ahre.b(null, 3));
    }

    public final defpackage.aoss w(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("coroutineContext");
        }
        if (!defpackage.afec.h(java.lang.Thread.currentThread())) {
            throw new java.lang.IllegalStateException("The ActivityRetained coroutine scope cannot be initialized/provided on any thread other than the main thread, because initializing it on a different thread isn't safe.");
        }
        final defpackage.aoss aossVarN = defpackage.aosv.n(aolrVar.plus(new defpackage.aovh(null)));
        ((defpackage.amxh) this.a).a(new defpackage.amym() { // from class: agvt
            @Override // defpackage.amym
            public final void a() {
                defpackage.aosv.q(aossVarN, null);
            }
        });
        return aossVarN;
    }

    public final /* synthetic */ defpackage.agpu x() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.agpu) aladVarP;
    }

    public final void y(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.agpu agpuVar = (defpackage.agpu) akzxVar.b;
        defpackage.agpu agpuVar2 = defpackage.agpu.a;
        agpuVar.b |= 1;
        agpuVar.c = z;
    }

    public final void z(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.agpu agpuVar = (defpackage.agpu) akzxVar.b;
        defpackage.agpu agpuVar2 = defpackage.agpu.a;
        agpuVar.e = i - 1;
        agpuVar.b |= 2;
    }

    public zzx(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public zzx(char[] cArr) {
        this.a = new defpackage.aauq();
    }

    public zzx(android.content.Context context, byte[] bArr) {
        java.util.List list = defpackage.zzd.m;
        this.a = new defpackage.zza(context, "TACHYON_LOG_REQUEST").b();
    }

    public zzx(defpackage.wgn wgnVar) {
        if (wgnVar == null) {
            defpackage.aooh.i("windowLayoutProvider");
        }
        this.a = wgnVar;
    }

    public zzx(defpackage.zzx zzxVar) {
        this.a = new defpackage.aauq();
        ((defpackage.aauq) zzxVar.a).a(new defpackage.aatz(zzxVar, new defpackage.apnt(this)));
    }

    public zzx(defpackage.zzx zzxVar, byte[] bArr) {
        this.a = zzxVar;
        new j$.util.concurrent.ConcurrentHashMap();
    }

    public zzx(defpackage.aoin aoinVar, char[] cArr) {
        aoinVar.getClass();
        this.a = aoinVar;
    }

    public zzx(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    }

    private zzx() {
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public zzx(char[] cArr, byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicInteger();
    }

    public zzx(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this("debug.properties.can_override", (byte[]) null);
    }

    public zzx(byte[] bArr, char[] cArr) {
        this.a = j$.util.DesugarCollections.synchronizedSet(new java.util.HashSet());
    }

    public zzx(defpackage.amxh amxhVar) {
        if (amxhVar == null) {
            defpackage.aooh.i("activityRetainedLifecycle");
        }
        this.a = amxhVar;
    }

    public zzx(defpackage.ahyn ahynVar) {
        if (ahynVar == null) {
            defpackage.aooh.i("crashOnExecutorException");
        }
        this.a = ahynVar;
    }

    public zzx(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("directBootPackages");
        }
        this.a = set;
    }

    public zzx(short[] sArr) {
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
        defpackage.aooh.e(setNewSetFromMap, "newConcurrentHashSet(...)");
        this.a = setNewSetFromMap;
    }

    public zzx(defpackage.amwu amwuVar) {
        if (amwuVar == null) {
            defpackage.aooh.i("gcoreAccountName");
        }
        this.a = amwuVar;
    }

    public zzx(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new java.util.concurrent.atomic.AtomicLong();
    }

    public zzx(int i) {
        defpackage.aorq[] aorqVarArr = new defpackage.aorq[i];
        for (int i2 = 0; i2 < i; i2++) {
            aorqVarArr[i2] = new defpackage.aorq(null, defpackage.aorr.a);
        }
        this.a = aorqVarArr;
    }

    public zzx(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new defpackage.aorq(new defpackage.apcf(8, false), defpackage.aorr.a);
    }

    public zzx(java.lang.Object obj) {
        this.a = obj;
    }

    public zzx(byte[] bArr, short[] sArr) {
        this.a = new java.util.ArrayList(20);
    }

    public zzx(java.util.concurrent.ThreadFactory threadFactory) {
        this.a = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), threadFactory);
    }

    public zzx(int[] iArr) {
        this.a = new java.util.LinkedHashSet();
    }
}
