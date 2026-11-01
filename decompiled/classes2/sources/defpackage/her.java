package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class her {
    public final java.lang.Object a;

    public her(rap rapVar, qbe qbeVar) {
        aooh.f(rapVar, "voiceController");
        aooh.f(qbeVar, "inCallLogging");
        this.a = rapVar;
    }

    public final /* synthetic */ void A(java.lang.Iterable iterable) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        igs igsVar = akzxVar.b;
        igs igsVar2 = igs.a;
        igsVar.b();
        akyl.i(iterable, igsVar.c);
    }

    public final /* synthetic */ void B() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        igs igsVar = akzxVar.b;
        igs igsVar2 = igs.a;
        igsVar.c = albq.a;
    }

    public final /* synthetic */ defpackage.igr C() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igr) aladVarP;
    }

    public final void D(defpackage.igy igyVar) {
        aooh.f(igyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igr igrVar = (defpackage.igr) akzxVar.b;
        defpackage.igr igrVar2 = defpackage.igr.a;
        j$.util.Objects.requireNonNull(igyVar);
        igrVar.c = igyVar;
        igrVar.b = 2;
    }

    public final void E(defpackage.ihf ihfVar) {
        aooh.f(ihfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igr igrVar = (defpackage.igr) akzxVar.b;
        defpackage.igr igrVar2 = defpackage.igr.a;
        j$.util.Objects.requireNonNull(ihfVar);
        igrVar.c = ihfVar;
        igrVar.b = 3;
    }

    public final void F(defpackage.ihm ihmVar) {
        aooh.f(ihmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igr igrVar = (defpackage.igr) akzxVar.b;
        defpackage.igr igrVar2 = defpackage.igr.a;
        j$.util.Objects.requireNonNull(ihmVar);
        igrVar.c = ihmVar;
        igrVar.b = 4;
    }

    public final j$.util.Optional G(java.lang.String str) {
        j$.util.Optional optionalE = ((zpm) this.a).e(str);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.raq) ((apqr) optionalE.get()).a(defpackage.raq.class)).as()) : optionalE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object H(java.lang.String str, aoln aolnVar) {
        rac racVar;
        if (aolnVar instanceof rac) {
            racVar = (rac) aolnVar;
            int i = racVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                racVar.b = i - Integer.MIN_VALUE;
            } else {
                racVar = new rac(this, aolnVar);
            }
        } else {
            racVar = new rac(this, aolnVar);
        }
        java.lang.Object objAu = racVar.a;
        aolu aoluVar = aolu.a;
        int i2 = racVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.a.b();
            racVar.c = str;
            racVar.b = 1;
            objAu = aoov.au(aoxhVarB, racVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = racVar.c;
            aooc.af(objAu);
        }
        j$.util.Objects.requireNonNull(str);
        raa raaVar = (raa) ((rab) objAu).b.get(str);
        if (raaVar == null) {
            return null;
        }
        return raaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object I(java.lang.String str, raa raaVar, aoln aolnVar) {
        rad radVar;
        if (aolnVar instanceof rad) {
            radVar = (rad) aolnVar;
            int i = radVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                radVar.b = i - Integer.MIN_VALUE;
            } else {
                radVar = new rad(this, aolnVar);
            }
        } else {
            radVar = new rad(this, aolnVar);
        }
        java.lang.Object obj = radVar.a;
        aolu aoluVar = aolu.a;
        int i2 = radVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.a;
            rae raeVar = new rae(str, raaVar, (aoln) null, 0);
            radVar.b = 1;
            if (r5.a(raeVar, radVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final /* synthetic */ qzz J() {
        qzz qzzVarP = ((akzx) this.a).p();
        aooh.e(qzzVarP, "build(...)");
        return qzzVarP;
    }

    public final void K(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qzz qzzVar = akzxVar.b;
        qzz qzzVar2 = qzz.a;
        qzzVar.b = j;
    }

    public final void L(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qzz qzzVar = akzxVar.b;
        qzz qzzVar2 = qzz.a;
        qzzVar.c = a.T(i);
    }

    public final /* synthetic */ raa M() {
        raa raaVarP = ((akzx) this.a).p();
        aooh.e(raaVarP, "build(...)");
        return raaVarP;
    }

    public final void N(qzz qzzVar) {
        aooh.f(qzzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        raa raaVar = akzxVar.b;
        raa raaVar2 = raa.a;
        j$.util.Objects.requireNonNull(qzzVar);
        raaVar.c = qzzVar;
        raaVar.b |= 1;
    }

    public final /* synthetic */ qtw O() {
        qtw qtwVarP = ((akzx) this.a).p();
        aooh.e(qtwVarP, "build(...)");
        return qtwVarP;
    }

    public final void P(qug qugVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        qtwVar.c = qugVar.H;
        qtwVar.b |= 1;
    }

    public final void Q(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        j$.util.Objects.requireNonNull(str);
        qtwVar.b |= 8;
        qtwVar.f = str;
    }

    public final void R(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        qtwVar.b |= 2;
        qtwVar.d = i;
    }

    public final void S(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        qtwVar.b |= 32;
        qtwVar.h = z;
    }

    public final void T(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        qtwVar.b |= 16;
        qtwVar.g = z;
    }

    public final void U(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        qtw qtwVar = akzxVar.b;
        qtw qtwVar2 = qtw.a;
        j$.util.Objects.requireNonNull(str);
        qtwVar.b |= 4;
        qtwVar.e = str;
    }

    public final j$.util.Optional V(java.lang.String str) {
        j$.util.Optional optionalE = ((zpm) this.a).e(str);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.qne) ((apqr) optionalE.get()).a(defpackage.qne.class)).am()) : optionalE;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [aonj, java.lang.Object] */
    public final void W(android.content.Intent intent) {
        qit qitVar;
        aooh.f(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("InCallActivity.callId");
        if (stringExtra == null) {
            throw new java.lang.IllegalStateException("call id is missing");
        }
        int intExtra = intent.getIntExtra("InCallActivity.notification_model_priority", 0);
        switch (intExtra) {
            case 0:
                qitVar = qit.a;
                break;
            case 1:
                qitVar = qit.b;
                break;
            case 2:
                qitVar = qit.c;
                break;
            case 3:
                qitVar = qit.d;
                break;
            case 4:
                qitVar = qit.e;
                break;
            case 5:
                qitVar = qit.f;
                break;
            case 6:
                qitVar = qit.g;
                break;
            case 7:
                qitVar = qit.h;
                break;
            case 8:
                qitVar = qit.i;
                break;
            default:
                switch (intExtra) {
                    case 99999:
                        qitVar = qit.j;
                        break;
                    case 100000:
                        qitVar = qit.k;
                        break;
                    case 100001:
                        qitVar = qit.l;
                        break;
                    default:
                        qitVar = null;
                        break;
                }
                break;
        }
        if (qitVar == null || qitVar == qit.a) {
            throw new java.lang.IllegalStateException("notification model priority is missing");
        }
        j$.util.Optional optionalE = ((zpm) this.a).e(stringExtra);
        qbf qbfVar = new qbf(new qji(qitVar, 3), 12);
        if (true == optionalE.isPresent()) {
            qbfVar.a.a(optionalE.get());
        }
    }

    public final j$.util.Optional X(qfz qfzVar) {
        j$.util.Optional optionalE = ((zpm) this.a).e(qfzVar.c);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.qfk) ((apqr) optionalE.get()).a(defpackage.qfk.class)).ak()) : optionalE;
    }

    public final long a() {
        return ((akzx) this.a).b.e;
    }

    public final long b() {
        return ((akzx) this.a).b.f;
    }

    public final long c() {
        return ((akzx) this.a).b.d;
    }

    public final /* synthetic */ jbo d() {
        jbo jboVarP = ((akzx) this.a).p();
        aooh.e(jboVarP, "build(...)");
        return jboVarP;
    }

    public final void e(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        jbo jboVar = akzxVar.b;
        jbo jboVar2 = jbo.a;
        jboVar.b |= 4;
        jboVar.e = j;
    }

    public final void f(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        jbo jboVar = akzxVar.b;
        jbo jboVar2 = jbo.a;
        jboVar.b |= 8;
        jboVar.f = j;
    }

    public final void g(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        jbo jboVar = akzxVar.b;
        jbo jboVar2 = jbo.a;
        jboVar.b |= 2;
        jboVar.d = j;
    }

    public final /* synthetic */ ixh h() {
        ixh ixhVarP = ((akzx) this.a).p();
        aooh.e(ixhVarP, "build(...)");
        return ixhVarP;
    }

    public final void i(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        ixh ixhVar = akzxVar.b;
        ixh ixhVar2 = ixh.a;
        j$.util.Objects.requireNonNull(str);
        ixhVar.b |= 1;
        ixhVar.d = str;
    }

    public final void j(defpackage.ixg ixgVar) {
        aooh.f(ixgVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        ixh ixhVar = akzxVar.b;
        ixh ixhVar2 = ixh.a;
        ixhVar.c = ixgVar.a();
    }

    public final /* synthetic */ void k(java.lang.Iterable iterable) {
        aooh.f(iterable, "values");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        ixh ixhVar = akzxVar.b;
        ixh ixhVar2 = ixh.a;
        ixhVar.b();
        akyl.i(iterable, ixhVar.e);
    }

    public final /* synthetic */ void l(defpackage.ixd ixdVar) {
        aooh.f(ixdVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        ixh ixhVar = akzxVar.b;
        ixh ixhVar2 = ixh.a;
        j$.util.Objects.requireNonNull(ixdVar);
        ixhVar.b();
        ixhVar.e.add(ixdVar);
    }

    public final /* synthetic */ void m() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        ixh ixhVar = akzxVar.b;
        ixh ixhVar2 = ixh.a;
        ixhVar.e = albq.a;
    }

    public final /* synthetic */ void n() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.e);
        aooh.e(listUnmodifiableList, "getBeeslyGreetingsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.ixf o() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ixf) aladVarP;
    }

    public final void p(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ixf ixfVar = (defpackage.ixf) akzxVar.b;
        defpackage.ixf ixfVar2 = defpackage.ixf.a;
        j$.util.Objects.requireNonNull(str);
        ixfVar.e = str;
    }

    public final /* synthetic */ defpackage.igu q() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igu) aladVarP;
    }

    public final /* synthetic */ void r(java.lang.Iterable iterable) {
        aooh.f(iterable, "values");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igu iguVar = (defpackage.igu) akzxVar.b;
        defpackage.igu iguVar2 = defpackage.igu.a;
        alat alatVar = iguVar.b;
        if (!alatVar.c()) {
            iguVar.b = alad.J(alatVar);
        }
        akyl.i(iterable, iguVar.b);
    }

    public final /* synthetic */ void s() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.igu) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getIndividualModelDownloadResultsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.igt t() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igt) aladVarP;
    }

    public final void u(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igt igtVar = (defpackage.igt) akzxVar.b;
        defpackage.igt igtVar2 = defpackage.igt.a;
        igtVar.d = z;
    }

    public final /* synthetic */ igs v() {
        igs igsVarP = ((akzx) this.a).p();
        aooh.e(igsVarP, "build(...)");
        return igsVarP;
    }

    public final /* synthetic */ alct w() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.c);
        aooh.e(listUnmodifiableList, "getModelConfigList(...)");
        return new alct(listUnmodifiableList);
    }

    public final java.lang.String x() {
        java.lang.String str = ((akzx) this.a).b.d;
        aooh.e(str, "getLocale(...)");
        return str;
    }

    public final /* synthetic */ void y(alct alctVar, defpackage.igr igrVar) {
        aooh.f(alctVar, "<this>");
        aooh.f(igrVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        igs igsVar = akzxVar.b;
        igs igsVar2 = igs.a;
        j$.util.Objects.requireNonNull(igrVar);
        igsVar.b();
        igsVar.c.add(igrVar);
    }

    public final void z(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        igs igsVar = akzxVar.b;
        igs igsVar2 = igs.a;
        j$.util.Objects.requireNonNull(str);
        igsVar.b |= 1;
        igsVar.d = str;
    }

    public her(defpackage.hvc hvcVar) {
        aooh.f(hvcVar, "controller");
        this.a = hvcVar;
    }

    public her(java.lang.Object obj) {
        this.a = obj;
    }

    public her(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public her(pzj pzjVar) {
        aooh.f(pzjVar, "displayStateTracker");
        this.a = pzjVar;
    }

    public her(rap rapVar) {
        aooh.f(rapVar, "voiceController");
        this.a = rapVar;
    }

    public her(ecx ecxVar) {
        aooh.f(ecxVar, "dataStore");
        this.a = ecxVar;
    }

    public her(zpm zpmVar) {
        aooh.f(zpmVar, "callScopes");
        this.a = zpmVar;
    }

    public her(zpm zpmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aooh.f(zpmVar, "callScopes");
        this.a = zpmVar;
    }

    public her(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public her(char[] cArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public her() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }
}
