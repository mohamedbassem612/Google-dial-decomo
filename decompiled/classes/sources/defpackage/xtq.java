package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xtq {
    public final java.lang.Object a;

    public xtq(java.lang.String str, byte[] bArr, byte[] bArr2) {
        this.a = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    public static java.lang.String C(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(java.lang.String.valueOf(str2)), e);
                str2 = str2 + " [" + android.text.TextUtils.join(", ", objArr) + ']';
            }
        }
        return defpackage.a.br(str2, str, " : ");
    }

    public static boolean Q(aekx aekxVar) {
        return aekxVar.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized int ay(alnb alnbVar) {
        return ((java.util.concurrent.atomic.AtomicInteger) j$.util.Map.-EL.computeIfAbsent((java.util.Map) this.a, alnbVar, new ailg(14))).incrementAndGet();
    }

    public final void A(java.lang.String str, java.lang.Throwable th) {
        android.util.Log.e("SetupLibrary", ((java.lang.String) this.a).concat(str), th);
    }

    public final void B(java.lang.String str) {
        android.util.Log.w("SetupLibrary", ((java.lang.String) this.a).concat(str));
    }

    public final void D(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", C((java.lang.String) this.a, str, objArr), th);
        }
    }

    public final void E(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            android.util.Log.i("PlayCore", C((java.lang.String) this.a, str, objArr));
        }
    }

    public final void F(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            android.util.Log.w("PlayCore", C((java.lang.String) this.a, str, objArr));
        }
    }

    public final /* synthetic */ afcz G() {
        afcz afczVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(afczVarR, "build(...)");
        return afczVarR;
    }

    public final /* synthetic */ afcp H() {
        afcp afcpVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(afcpVarR, "build(...)");
        return afcpVarR;
    }

    public final void I(afby afbyVar) {
        defpackage.aooh.f(afbyVar, "value");
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        afcp afcpVar = ((defpackage.akzz) obj).b;
        afcp afcpVar2 = afcp.a;
        j$.util.Objects.requireNonNull(afbyVar);
        afcpVar.g = afbyVar;
        afcpVar.b |= 16;
    }

    public final void J() {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        afcp afcpVar = ((defpackage.akzz) obj).b;
        afcp afcpVar2 = afcp.a;
        afcpVar.b |= 4;
        afcpVar.e = true;
    }

    public final /* synthetic */ afbz K() {
        afbz afbzVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(afbzVarR, "build(...)");
        return afbzVarR;
    }

    public final void L(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        afbz afbzVar = akzxVar.b;
        afbz afbzVar2 = afbz.a;
        afbzVar.b |= 1;
        afbzVar.c = z;
    }

    public final /* synthetic */ afby M() {
        afby afbyVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(afbyVarR, "build(...)");
        return afbyVarR;
    }

    public final void N(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        afby afbyVar = akzxVar.b;
        afby afbyVar2 = afby.a;
        j$.util.Objects.requireNonNull(str);
        afbyVar.b |= 1;
        afbyVar.c = str;
    }

    public final android.content.Intent O(android.content.Intent intent, int i) {
        afbf afbfVarF;
        afba afbaVar;
        if (intent == null) {
            return null;
        }
        defpackage.ahzh ahzhVarB = defpackage.ahzh.b(defpackage.ahwr.a);
        android.os.Bundle extras = intent.getExtras();
        java.util.Collection collectionO = extras != null ? defpackage.aihd.o(extras.keySet()) : defpackage.aikn.a;
        java.lang.Object obj = this.a;
        int i2 = i - 1;
        if (i2 != 0) {
            afbfVarF = i2 != 1 ? aljf.f(intent, (afbe) ((aljf) obj).a) : aljf.f(intent, (afbe) ((aljf) obj).d);
        } else {
            j$.util.Objects.requireNonNull(intent.getComponent(), "component must not be null");
            afbfVarF = aljf.f(intent, (afbe) ((defpackage.aigf) ((aljf) obj).b).getOrDefault(intent.getComponent().getClassName(), afbe.a));
        }
        afbf afbfVar = afbfVarF;
        java.lang.Object obj2 = ((aljf) obj).c;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("Null className");
        }
        defpackage.aihd aihdVarO = defpackage.aihd.o(collectionO);
        j$.time.Duration durationC = ahzhVarB.c();
        if (durationC == null) {
            throw new java.lang.NullPointerException("Null sanitizationTime");
        }
        if (i2 != 0) {
            afbaVar = i2 != 1 ? afba.c : afba.b;
        } else {
            afbaVar = afba.a;
        }
        afba afbaVar2 = afbaVar;
        if (aihdVarO != null) {
            return new afbb(afbfVar, (java.lang.String) obj2, aihdVarO, durationC, afbaVar2).a.a;
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(" originalExtras"));
    }

    public final java.lang.String P(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        defpackage.aec aecVar;
        if (uri != null) {
            aecVar = (defpackage.aec) ((defpackage.aec) this.a).get(uri.toString());
        } else {
            aecVar = null;
        }
        if (aecVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(java.lang.String.valueOf(str2));
        }
        return (java.lang.String) aecVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final long R() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "persistent_log_in_bug_reports_timeout_millis").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean S() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__disable_cnap_for_outgoing_call").e();
    }

    public final /* synthetic */ alqi T() {
        alqi alqiVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(alqiVarR, "build(...)");
        return alqiVarR;
    }

    public final void U(java.lang.String str) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alqi alqiVar = akzxVar.b;
        alqi alqiVar2 = alqi.a;
        j$.util.Objects.requireNonNull(str);
        alqiVar.b |= 2;
        alqiVar.d = str;
    }

    public final void V(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alqi alqiVar = akzxVar.b;
        alqi alqiVar2 = alqi.a;
        j$.util.Objects.requireNonNull(str);
        alqiVar.b |= 1;
        alqiVar.c = str;
    }

    public final /* synthetic */ alnt W() {
        alnt alntVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(alntVarR, "build(...)");
        return alntVarR;
    }

    public final void X(alnr alnrVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnt alntVar = akzxVar.b;
        alnt alntVar2 = alnt.a;
        j$.util.Objects.requireNonNull(alnrVar);
        alntVar.c = alnrVar;
        alntVar.b |= 1;
    }

    public final void Y(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnt alntVar = akzxVar.b;
        alnt alntVar2 = alnt.a;
        j$.util.Objects.requireNonNull(str);
        alntVar.b |= 2;
        alntVar.d = str;
    }

    public final void Z(defpackage.akzm akzmVar) {
        defpackage.aooh.f(akzmVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnt alntVar = akzxVar.b;
        alnt alntVar2 = alnt.a;
        j$.util.Objects.requireNonNull(akzmVar);
        alntVar.f = akzmVar;
        alntVar.b |= 8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean a(java.lang.Class cls) {
        return this.a.containsKey(cls);
    }

    public final /* synthetic */ void aa(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnt alntVar = akzxVar.b;
        alnt alntVar2 = alnt.a;
        j$.util.Objects.requireNonNull(str);
        defpackage.alat alatVar = alntVar.i;
        if (!alatVar.c()) {
            alntVar.i = defpackage.alad.J(alatVar);
        }
        alntVar.i.add(str);
    }

    public final void ab() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akzx) this.a).b.i);
        defpackage.aooh.e(listUnmodifiableList, "getPositionalParamsList(...)");
        new defpackage.alct(listUnmodifiableList);
    }

    public final /* synthetic */ alnf ac() {
        alnf alnfVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(alnfVarR, "build(...)");
        return alnfVarR;
    }

    public final void ad(almm almmVar) {
        defpackage.aooh.f(almmVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnf alnfVar = akzxVar.b;
        alnf alnfVar2 = alnf.a;
        j$.util.Objects.requireNonNull(almmVar);
        alnfVar.d = almmVar;
        alnfVar.c = 1;
    }

    public final void ae(alsy alsyVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnf alnfVar = akzxVar.b;
        alnf alnfVar2 = alnf.a;
        alnfVar.g = alsyVar.j;
        alnfVar.b |= 1;
    }

    public final void af(alsz alszVar) {
        defpackage.aooh.f(alszVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        alnf alnfVar = akzxVar.b;
        alnf alnfVar2 = alnf.a;
        alnfVar.h = alszVar.d;
        alnfVar.b |= 2;
    }

    public final /* synthetic */ almz ag() {
        almz almzVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(almzVarR, "build(...)");
        return almzVarR;
    }

    public final void ah(alnb alnbVar) {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        almz almzVar = ((defpackage.akzz) obj).b;
        almz almzVar2 = almz.a;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
    }

    public final /* synthetic */ almm ai() {
        almm almmVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(almmVarR, "build(...)");
        return almmVarR;
    }

    public final void aj(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        almm almmVar = akzxVar.b;
        almm almmVar2 = almm.a;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
    }

    public final java.lang.String ak(alnb alnbVar) {
        return java.lang.String.format(java.util.Locale.US, "%s__%d.%s", java.util.UUID.randomUUID(), java.lang.Integer.valueOf(ay(alnbVar)), alnbVar.name());
    }

    public final /* synthetic */ defpackage.alcf al() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.alcf) aladVarR;
    }

    public final void am(long j) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.alcf alcfVar = (defpackage.alcf) akzxVar.b;
        defpackage.alcf alcfVar2 = defpackage.alcf.a;
        alcfVar.b = j;
    }

    public final /* synthetic */ akzv an() {
        akzv akzvVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(akzvVarR, "build(...)");
        return akzvVarR;
    }

    public final void ao(float f) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        akzv akzvVar = akzxVar.b;
        akzv akzvVar2 = akzv.a;
        akzvVar.b = f;
    }

    public final /* synthetic */ aksc ap() {
        aksc akscVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(akscVarR, "build(...)");
        return akscVarR;
    }

    public final void aq(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        aksc akscVar = akzxVar.b;
        aksc akscVar2 = aksc.a;
        j$.util.Objects.requireNonNull(str);
        akscVar.b |= 1;
        akscVar.c = str;
    }

    public final void ar(long j) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        aksc akscVar = akzxVar.b;
        aksc akscVar2 = aksc.a;
        akscVar.b |= 2;
        akscVar.d = j;
    }

    public final /* synthetic */ defpackage.aksb as() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.aksb) aladVarR;
    }

    public final /* synthetic */ akqp at() {
        akqp akqpVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(akqpVarR, "build(...)");
        return akqpVarR;
    }

    public final void au(akpz akpzVar) {
        defpackage.aooh.f(akpzVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        akqp akqpVar = akzxVar.b;
        akqp akqpVar2 = akqp.a;
        j$.util.Objects.requireNonNull(akpzVar);
        akqpVar.d = akpzVar;
        akqpVar.b |= 2;
    }

    public final void av(java.lang.String str) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        akqp akqpVar = akzxVar.b;
        akqp akqpVar2 = akqp.a;
        j$.util.Objects.requireNonNull(str);
        akqpVar.b |= 8;
        akqpVar.e = str;
    }

    public final void aw() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        akqp akqpVar = akzxVar.b;
        akqp akqpVar2 = akqp.a;
        akqpVar.c = 3;
        akqpVar.b |= 1;
    }

    public final /* synthetic */ void ax(defpackage.apdi apdiVar, java.lang.Object obj) {
        defpackage.aooh.f(apdiVar, "extension");
        defpackage.aooh.f(obj, "value");
        ((defpackage.akzz) this.a).bV(apdiVar, obj);
    }

    public final void b(java.lang.String str, java.lang.Throwable th) {
        xox.h((java.lang.String) this.a, str, th);
    }

    public final void c(java.lang.String str) {
        xox.a((java.lang.String) this.a, str);
    }

    public final boolean d() {
        return j$.util.Collection.-EL.stream(((defpackage.zpm) this.a).a()).anyMatch(new wrm(9));
    }

    public final java.lang.CharSequence e() {
        return ((android.content.Context) this.a).getText(2132017390);
    }

    public final java.lang.CharSequence f(int i, boolean z) {
        if (i == 2) {
            return ((android.content.Context) this.a).getText(2132017395);
        }
        if (i == 3) {
            return ((android.content.Context) this.a).getText(2132017409);
        }
        if (i != 4) {
            return ((android.content.Context) this.a).getText(2132017390);
        }
        java.lang.Object obj = this.a;
        return z ? ((android.content.Context) obj).getText(2132017419) : ((android.content.Context) obj).getText(2132017420);
    }

    public final /* synthetic */ defpackage.ysv g() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.ysv) aladVarR;
    }

    public final void h(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.ysv ysvVar = (defpackage.ysv) akzxVar.b;
        defpackage.ysv ysvVar2 = defpackage.ysv.a;
        ysvVar.d = i - 2;
        ysvVar.b |= 2;
    }

    public final void i(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.ysv ysvVar = (defpackage.ysv) akzxVar.b;
        defpackage.ysv ysvVar2 = defpackage.ysv.a;
        ysvVar.c = i - 2;
        ysvVar.b |= 1;
    }

    public final /* synthetic */ yqj j() {
        yqj yqjVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(yqjVarR, "build(...)");
        return yqjVarR;
    }

    public final void k(yqv yqvVar) {
        defpackage.aooh.f(yqvVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        yqj yqjVar = akzxVar.b;
        yqj yqjVar2 = yqj.a;
        j$.util.Objects.requireNonNull(yqvVar);
        yqjVar.c = yqvVar;
        yqjVar.b |= 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, xuv] */
    public final synchronized xuv l(java.lang.Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            uyg uygVar = (uyg) r0.get(i);
            if (((java.lang.Class) uygVar.b).isAssignableFrom(cls)) {
                return uygVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void m(java.lang.Class cls, xuv xuvVar) {
        this.a.add(new uyg(cls, xuvVar, (char[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized java.util.List n() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void o(xug xugVar) {
        this.a.add(xugVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, xue] */
    public final synchronized xue p(java.lang.Class cls) {
        for (uyg uygVar : this.a) {
            if (((java.lang.Class) uygVar.b).isAssignableFrom(cls)) {
                return uygVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void q(java.lang.Class cls, xue xueVar) {
        this.a.add(new uyg(cls, xueVar, (char[]) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized ydf r(java.lang.Class cls, java.lang.Class cls2) {
        ydf ydfVar;
        if (!cls2.isAssignableFrom(cls)) {
            for (defpackage.ucm ucmVar : this.a) {
                if (ucmVar.b(cls, cls2)) {
                    ydfVar = ucmVar.c;
                }
            }
            throw new java.lang.IllegalArgumentException("No transcoder registered to transcode from " + java.lang.String.valueOf(cls) + " to " + java.lang.String.valueOf(cls2));
        }
        ydfVar = ydg.a;
        return ydfVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized java.util.List s(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
        } else {
            for (defpackage.ucm ucmVar : this.a) {
                if (ucmVar.b(cls, cls2)) {
                    java.lang.Object obj = ucmVar.a;
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void t(java.lang.Class cls, java.lang.Class cls2, ydf ydfVar) {
        this.a.add(new defpackage.ucm(cls, cls2, ydfVar));
    }

    public final void u(android.content.Intent intent) {
        com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext;
        android.app.Activity activity = (android.app.Activity) this.a;
        if (agmc.o(activity.getIntent())) {
            android.content.Intent intent2 = activity.getIntent();
            defpackage.aooh.f(intent2, "intent");
            if (!agmc.o(intent2)) {
                throw new java.lang.IllegalStateException("AccountOperationContext not stored in the intent");
            }
            java.lang.Object objC = dvh.c(intent2, "tiktok_account_operation_contexts", com.google.apps.tiktok.account.api.AccountOperationContext.class);
            if (objC == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            accountOperationContext = (com.google.apps.tiktok.account.api.AccountOperationContext) objC;
        } else {
            accountOperationContext = null;
        }
        if (accountOperationContext != null) {
            defpackage.aooh.f(intent, "intent");
            intent.putExtra("tiktok_account_operation_contexts", (android.os.Parcelable) accountOperationContext);
        }
    }

    public final defpackage.ajcq v(com.google.apps.tiktok.account.AccountId accountId) {
        defpackage.ajcq ajcqVarF = ((defpackage.aogc) ((defpackage.adai) ((defpackage.adag) this.a).a).a).F();
        agnw agnwVar = new agnw(accountId, 4);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.ajan.f(defpackage.aizu.f(defpackage.ahvr.H(ajcqVarF, agnwVar, ajbmVar), java.lang.IllegalArgumentException.class, defpackage.ahqx.a(new defpackage.aeqw(9)), ajbmVar), defpackage.ahqx.a(new defpackage.aeqw(10)), ajbmVar);
    }

    public final void w(java.lang.String str) {
        if (android.util.Log.isLoggable("SetupLibrary", 3)) {
            android.util.Log.d("SetupLibrary", ((java.lang.String) this.a).concat(str));
        }
    }

    public final void x(java.lang.String str) {
        if (android.util.Log.isLoggable("SetupLibrary", 4)) {
            android.util.Log.i("SetupLibrary", ((java.lang.String) this.a).concat(str));
        }
    }

    public final void y(java.lang.String str) {
        if (android.util.Log.isLoggable("SetupLibrary", 2)) {
            android.util.Log.v("SetupLibrary", ((java.lang.String) this.a).concat(str));
        }
    }

    public final void z(java.lang.String str) {
        android.util.Log.e("SetupLibrary", ((java.lang.String) this.a).concat(str));
    }

    public xtq(java.lang.Object obj) {
        this.a = obj;
    }

    public xtq(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public xtq(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        this.a = context;
    }

    public xtq(byte[] bArr) {
        this.a = new java.util.HashMap();
    }

    public xtq(short[] sArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public xtq(java.lang.Class cls) {
        this(cls.getSimpleName(), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public xtq(defpackage.xtq xtqVar) {
        this.a = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap((java.util.Map) xtqVar.a));
    }

    public xtq(java.lang.String str, byte[] bArr) {
        this.a = "[" + str + "] ";
    }

    public xtq() {
        this.a = new defpackage.aosi(null);
    }

    public xtq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.ArrayList();
    }

    public xtq(char[] cArr, byte[] bArr) {
        this.a = new java.util.ArrayList();
    }

    public xtq(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.ArrayList();
    }

    public xtq(char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public xtq(defpackage.aoin aoinVar, byte[] bArr) {
        aoinVar.getClass();
        this.a = aoinVar;
    }

    public xtq(android.content.Context context, char[] cArr) {
        this.a = defpackage.ahvr.bI(new defpackage.aell(context, 10));
    }
}
