package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqu {
    public final java.lang.Object a;

    public vqu(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.HashMap();
        new java.util.HashMap();
    }

    public static final java.lang.CharSequence T(defpackage.uku ukuVar) {
        defpackage.uje ujeVar = ukuVar.d;
        if (ujeVar == null) {
            ujeVar = defpackage.uje.a;
        }
        int iBE = wsc.bE(ujeVar.b);
        java.util.Map map = defpackage.ujq.a;
        if (iBE == 0) {
            throw null;
        }
        int i = iBE - 1;
        if (i == 0) {
            defpackage.uje ujeVar2 = ukuVar.d;
            if (ujeVar2 == null) {
                ujeVar2 = defpackage.uje.a;
            }
            java.lang.CharSequence charSequenceCreateTtsSpannable = android.telephony.PhoneNumberUtils.createTtsSpannable(ujeVar2.b == 1 ? (java.lang.String) ujeVar2.c : "");
            aooh.e(charSequenceCreateTtsSpannable, "createTtsSpannable(...)");
            return charSequenceCreateTtsSpannable;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("Invalid value");
        }
        defpackage.uje ujeVar3 = ukuVar.d;
        if (ujeVar3 == null) {
            ujeVar3 = defpackage.uje.a;
        }
        java.lang.String str = ujeVar3.b == 2 ? (java.lang.String) ujeVar3.c : "";
        aooh.e(str, "getLabel(...)");
        return str;
    }

    public final void A(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utq utqVar = (defpackage.utq) akzxVar.b;
        defpackage.utq utqVar2 = defpackage.utq.a;
        j$.util.Objects.requireNonNull(str);
        utqVar.b |= 2;
        utqVar.d = str;
    }

    public final void B(alcf alcfVar) {
        aooh.f(alcfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utq utqVar = (defpackage.utq) akzxVar.b;
        defpackage.utq utqVar2 = defpackage.utq.a;
        j$.util.Objects.requireNonNull(alcfVar);
        utqVar.c = alcfVar;
        utqVar.b |= 1;
    }

    public final void C(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utq utqVar = (defpackage.utq) akzxVar.b;
        defpackage.utq utqVar2 = defpackage.utq.a;
        utqVar.e = i - 1;
        utqVar.b |= 4;
    }

    public final /* synthetic */ defpackage.upt D() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.upt) aladVarP;
    }

    public final void E(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVar.b;
        defpackage.upt uptVar2 = defpackage.upt.a;
        uptVar.f = j;
    }

    public final void F(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVar.b;
        defpackage.upt uptVar2 = defpackage.upt.a;
        j$.util.Objects.requireNonNull(str);
        uptVar.g = str;
    }

    public final void G(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVar.b;
        defpackage.upt uptVar2 = defpackage.upt.a;
        j$.util.Objects.requireNonNull(str);
        uptVar.e = str;
    }

    public final void H(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVar.b;
        defpackage.upt uptVar2 = defpackage.upt.a;
        j$.util.Objects.requireNonNull(str);
        uptVar.j = str;
    }

    public final void I(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVar.b;
        defpackage.upt uptVar2 = defpackage.upt.a;
        uptVar.b |= 1;
        uptVar.c = j;
    }

    public final /* synthetic */ void J(java.lang.Iterable iterable) {
        ((akzx) this.a).Q(iterable);
    }

    public final /* synthetic */ void K() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.upt) ((akzx) this.a).b).l);
        aooh.e(listUnmodifiableList, "getChannelsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.upl L() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.upl) aladVarP;
    }

    public final void M(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upl uplVar = (defpackage.upl) akzxVar.b;
        defpackage.upl uplVar2 = defpackage.upl.a;
        uplVar.g = z;
    }

    public final void N(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upl uplVar = (defpackage.upl) akzxVar.b;
        defpackage.upl uplVar2 = defpackage.upl.a;
        j$.util.Objects.requireNonNull(str);
        uplVar.b |= 4;
        uplVar.e = str;
    }

    public final void O(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upl uplVar = (defpackage.upl) akzxVar.b;
        defpackage.upl uplVar2 = defpackage.upl.a;
        j$.util.Objects.requireNonNull(str);
        uplVar.b |= 1;
        uplVar.c = str;
    }

    public final void P(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upl uplVar = (defpackage.upl) akzxVar.b;
        defpackage.upl uplVar2 = defpackage.upl.a;
        uplVar.b |= 2;
        uplVar.d = j;
    }

    public final void Q(defpackage.upk upkVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.upl uplVar = (defpackage.upl) akzxVar.b;
        defpackage.upl uplVar2 = defpackage.upl.a;
        uplVar.f = upkVar.a();
        uplVar.b |= 8;
    }

    public final /* synthetic */ defpackage.ult R() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ult) aladVarP;
    }

    public final /* synthetic */ defpackage.uku S() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uku) aladVarP;
    }

    public final /* synthetic */ defpackage.uje U() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uje) aladVarP;
    }

    public final /* synthetic */ defpackage.tvz V() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tvz) aladVarP;
    }

    public final void W(defpackage.tvy tvyVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tvz tvzVar = (defpackage.tvz) akzxVar.b;
        defpackage.tvz tvzVar2 = defpackage.tvz.a;
        tvzVar.c = tvyVar.f;
        tvzVar.b |= 1;
    }

    public final void X(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tvz tvzVar = (defpackage.tvz) akzxVar.b;
        defpackage.tvz tvzVar2 = defpackage.tvz.a;
        j$.util.Objects.requireNonNull(str);
        tvzVar.b |= 4;
        tvzVar.e = str;
    }

    public final void Y(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tvz tvzVar = (defpackage.tvz) akzxVar.b;
        defpackage.tvz tvzVar2 = defpackage.tvz.a;
        tvzVar.b |= 2;
        tvzVar.d = i;
    }

    public final /* synthetic */ defpackage.ttg Z() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ttg) aladVarP;
    }

    public final /* synthetic */ defpackage.vtx a() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.vtx) aladVarP;
    }

    public final void aA(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqx amqxVar = (defpackage.amqx) akzxVar.b;
        alal alalVar = defpackage.amqx.a;
        amqxVar.c |= 2;
        amqxVar.e = i;
    }

    public final void aB(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqx amqxVar = (defpackage.amqx) akzxVar.b;
        alal alalVar = defpackage.amqx.a;
        amqxVar.c |= 4;
        amqxVar.g = i;
    }

    public final void aC(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqx amqxVar = (defpackage.amqx) akzxVar.b;
        alal alalVar = defpackage.amqx.a;
        amqxVar.c |= 8;
        amqxVar.h = i;
    }

    public final /* synthetic */ defpackage.amqh aD() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amqh) aladVarP;
    }

    public final void aE(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqh amqhVar = (defpackage.amqh) akzxVar.b;
        defpackage.amqh amqhVar2 = defpackage.amqh.a;
        j$.util.Objects.requireNonNull(str);
        amqhVar.b |= 1;
        amqhVar.c = str;
    }

    public final void aF(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqh amqhVar = (defpackage.amqh) akzxVar.b;
        defpackage.amqh amqhVar2 = defpackage.amqh.a;
        amqhVar.b |= 4;
        amqhVar.e = j;
    }

    public final void aG(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqh amqhVar = (defpackage.amqh) akzxVar.b;
        defpackage.amqh amqhVar2 = defpackage.amqh.a;
        amqhVar.d = a.R(i);
        amqhVar.b |= 2;
    }

    public final /* synthetic */ defpackage.ampy aH() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ampy) aladVarP;
    }

    public final void aI(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ampy ampyVar = (defpackage.ampy) akzxVar.b;
        defpackage.ampy ampyVar2 = defpackage.ampy.a;
        ampyVar.d = i - 1;
        ampyVar.b |= 2;
    }

    public final void aJ(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ampy ampyVar = (defpackage.ampy) akzxVar.b;
        defpackage.ampy ampyVar2 = defpackage.ampy.a;
        ampyVar.c = i - 1;
        ampyVar.b |= 1;
    }

    public final /* synthetic */ defpackage.ampj aK() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ampj) aladVarP;
    }

    public final void aL(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ampj ampjVar = (defpackage.ampj) akzxVar.b;
        defpackage.ampj ampjVar2 = defpackage.ampj.a;
        ampjVar.b |= 2;
        ampjVar.d = i;
    }

    public final void aM(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ampj ampjVar = (defpackage.ampj) akzxVar.b;
        defpackage.ampj ampjVar2 = defpackage.ampj.a;
        ampjVar.b |= 1;
        ampjVar.c = i;
    }

    public final /* synthetic */ defpackage.alrc aN() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alrc) aladVarP;
    }

    public final /* synthetic */ void aO(java.lang.Iterable iterable) {
        ((akzx) this.a).aO(iterable);
    }

    public final /* synthetic */ void aP() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.alrc) ((akzx) this.a).b).e);
        aooh.e(listUnmodifiableList, "getHypothesesList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ alqk aQ() {
        alqk alqkVarP = ((akzx) this.a).p();
        aooh.e(alqkVarP, "build(...)");
        return alqkVarP;
    }

    public final void aR(boolean z) {
        java.lang.Object obj = this.a;
        ((akzx) obj).u();
        alqk alqkVar = ((akzz) obj).b;
        alqk alqkVar2 = alqk.a;
        alqkVar.b |= 4;
        alqkVar.d = z;
    }

    public final /* synthetic */ alqr aS() {
        alqr alqrVarP = ((akzx) this.a).p();
        aooh.e(alqrVarP, "build(...)");
        return alqrVarP;
    }

    public final /* synthetic */ void aT(alqq alqqVar) {
        aooh.f(alqqVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqr alqrVar = akzxVar.b;
        alqr alqrVar2 = alqr.a;
        j$.util.Objects.requireNonNull(alqqVar);
        alqrVar.b();
        alqrVar.b.add(alqqVar);
    }

    public final /* synthetic */ void aU() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.b);
        aooh.e(listUnmodifiableList, "getHypothesisList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.alqn aV() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alqn) aladVarP;
    }

    public final void aW(defpackage.amku amkuVar) {
        aooh.f(amkuVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqn alqnVar = (defpackage.alqn) akzxVar.b;
        defpackage.alqn alqnVar2 = defpackage.alqn.a;
        j$.util.Objects.requireNonNull(amkuVar);
        alqnVar.e = amkuVar;
        alqnVar.b |= 4;
    }

    public final void aX(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqn alqnVar = (defpackage.alqn) akzxVar.b;
        defpackage.alqn alqnVar2 = defpackage.alqn.a;
        j$.util.Objects.requireNonNull(str);
        alqnVar.b |= 1;
        alqnVar.c = str;
    }

    public final /* synthetic */ void aY(apdi apdiVar, java.lang.Object obj) {
        aooh.f(apdiVar, "extension");
        aooh.f(obj, "value");
        ((akzz) this.a).bV(apdiVar, obj);
    }

    public final void aa(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ttg ttgVar = (defpackage.ttg) akzxVar.b;
        defpackage.ttg ttgVar2 = defpackage.ttg.a;
        ttgVar.d = a.aT(i);
    }

    public final /* synthetic */ defpackage.ttf ab() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ttf) aladVarP;
    }

    public final void ac(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ttf ttfVar = (defpackage.ttf) akzxVar.b;
        defpackage.ttf ttfVar2 = defpackage.ttf.a;
        ttfVar.e = a.Q(i);
    }

    public final /* synthetic */ defpackage.tti ad() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tti) aladVarP;
    }

    public final /* synthetic */ defpackage.ttb ae() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ttb) aladVarP;
    }

    public final /* synthetic */ defpackage.tsk af() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tsk) aladVarP;
    }

    public final void ag(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tsk tskVar = (defpackage.tsk) akzxVar.b;
        defpackage.tsk tskVar2 = defpackage.tsk.a;
        tskVar.c = z;
    }

    public final /* synthetic */ defpackage.tlf ah() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tlf) aladVarP;
    }

    public final /* synthetic */ amrp ai() {
        amrp amrpVarP = ((akzx) this.a).p();
        aooh.e(amrpVarP, "build(...)");
        return amrpVarP;
    }

    public final void aj(kqz kqzVar) {
        aooh.f(kqzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.g = kqzVar.p;
        amrpVar.b |= 16;
    }

    public final void ak(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.b |= 4;
        amrpVar.e = i;
    }

    public final void al(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.b |= 32;
        amrpVar.h = j;
    }

    public final void am(kqz kqzVar) {
        aooh.f(kqzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.f = kqzVar.p;
        amrpVar.b |= 8;
    }

    public final void an(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.b |= 2;
        amrpVar.d = i;
    }

    public final void ao(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrp amrpVar = akzxVar.b;
        amrp amrpVar2 = amrp.a;
        amrpVar.b |= 1;
        amrpVar.c = i;
    }

    public final /* synthetic */ amrh ap() {
        amrh amrhVarP = ((akzx) this.a).p();
        aooh.e(amrhVarP, "build(...)");
        return amrhVarP;
    }

    public final void aq(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.b |= 2;
        amrhVar.d = i;
    }

    public final void ar(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.b |= 1;
        amrhVar.c = i;
    }

    public final void as(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.b |= 4;
        amrhVar.e = i;
    }

    public final void at(defpackage.amrg amrgVar) {
        aooh.f(amrgVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.h = amrgVar.e;
        amrhVar.b |= 32;
    }

    public final void au(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.b |= 16;
        amrhVar.g = z;
    }

    public final void av() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amrh amrhVar = akzxVar.b;
        amrh amrhVar2 = amrh.a;
        amrhVar.b |= 8;
        amrhVar.f = false;
    }

    public final /* synthetic */ alct aw() {
        return new alct(new alam(((defpackage.amqx) ((akzx) this.a).b).f, defpackage.amqx.a));
    }

    public final /* synthetic */ defpackage.amqx ax() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amqx) aladVarP;
    }

    public final /* synthetic */ void ay(alct alctVar, java.lang.Iterable iterable) {
        aooh.f(alctVar, "<this>");
        aooh.f(iterable, "values");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqx amqxVar = (defpackage.amqx) akzxVar.b;
        alal alalVar = defpackage.amqx.a;
        alak alakVar = amqxVar.f;
        if (!alakVar.c()) {
            amqxVar.f = alad.H(alakVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            amqxVar.f.g(((defpackage.amqw) it.next()).n);
        }
    }

    public final void az(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amqx amqxVar = (defpackage.amqx) akzxVar.b;
        alal alalVar = defpackage.amqx.a;
        amqxVar.c |= 1;
        amqxVar.d = z;
    }

    public final void b(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(str);
        vtxVar.b |= 4;
        vtxVar.e = str;
    }

    public final void c(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(str);
        vtxVar.b |= 128;
        vtxVar.j = str;
    }

    public final void d(defpackage.vtw vtwVar) {
        aooh.f(vtwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(vtwVar);
        vtxVar.f = vtwVar;
        vtxVar.b |= 8;
    }

    public final void e(defpackage.vtw vtwVar) {
        aooh.f(vtwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(vtwVar);
        vtxVar.g = vtwVar;
        vtxVar.b |= 16;
    }

    public final void f(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(str);
        vtxVar.b |= 2;
        vtxVar.d = str;
    }

    public final void g(vzi vziVar) {
        aooh.f(vziVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        j$.util.Objects.requireNonNull(vziVar);
        vtxVar.c = vziVar;
        vtxVar.b |= 1;
    }

    public final void h() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtx vtxVar = (defpackage.vtx) akzxVar.b;
        defpackage.vtx vtxVar2 = defpackage.vtx.a;
        vtxVar.b |= 64;
        vtxVar.i = true;
    }

    public final /* synthetic */ vzi i() {
        vzi vziVarP = ((akzx) this.a).p();
        aooh.e(vziVarP, "build(...)");
        return vziVarP;
    }

    public final void j(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vzi vziVar = akzxVar.b;
        vzi vziVar2 = vzi.a;
        j$.util.Objects.requireNonNull(str);
        vziVar.b |= 4;
        vziVar.e = str;
    }

    public final void k(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vzi vziVar = akzxVar.b;
        vzi vziVar2 = vzi.a;
        j$.util.Objects.requireNonNull(str);
        vziVar.b |= 8;
        vziVar.f = str;
    }

    public final /* synthetic */ vzj l() {
        vzj vzjVarP = ((akzx) this.a).p();
        aooh.e(vzjVarP, "build(...)");
        return vzjVarP;
    }

    public final /* synthetic */ defpackage.woz m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.woz) aladVarP;
    }

    public final /* synthetic */ defpackage.wpc n() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.wpc) aladVarP;
    }

    public final void o(defpackage.woz wozVar) {
        aooh.f(wozVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.wpc wpcVar = (defpackage.wpc) akzxVar.b;
        defpackage.wpc wpcVar2 = defpackage.wpc.a;
        j$.util.Objects.requireNonNull(wozVar);
        wpcVar.c = wozVar;
        wpcVar.b = 1;
    }

    public final defpackage.woy p() {
        defpackage.woy woyVar = ((defpackage.wpg) ((akzx) this.a).b).c;
        if (woyVar == null) {
            woyVar = defpackage.woy.a;
        }
        aooh.e(woyVar, "getDecorations(...)");
        return woyVar;
    }

    public final /* synthetic */ defpackage.wpg q() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.wpg) aladVarP;
    }

    public final void r(defpackage.woy woyVar) {
        aooh.f(woyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.wpg wpgVar = (defpackage.wpg) akzxVar.b;
        defpackage.wpg wpgVar2 = defpackage.wpg.a;
        j$.util.Objects.requireNonNull(woyVar);
        wpgVar.c = woyVar;
        wpgVar.b |= 1;
    }

    public final /* synthetic */ defpackage.woy s() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.woy) aladVarP;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized defpackage.xtk t(java.nio.ByteBuffer byteBuffer) {
        defpackage.xtk xtkVar;
        xtkVar = (defpackage.xtk) this.a.poll();
        if (xtkVar == null) {
            xtkVar = new defpackage.xtk();
        }
        xtkVar.c = null;
        java.util.Arrays.fill((byte[]) xtkVar.b, (byte) 0);
        xtkVar.d = new defpackage.xtj();
        xtkVar.a = 0;
        xtkVar.c = byteBuffer.asReadOnlyBuffer();
        ((java.nio.ByteBuffer) xtkVar.c).position(0);
        ((java.nio.ByteBuffer) xtkVar.c).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return xtkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void u(defpackage.xtk xtkVar) {
        xtkVar.c = null;
        xtkVar.d = null;
        this.a.offer(xtkVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void v() {
        this.a.clear();
    }

    public final java.lang.Object w(java.lang.Object obj, int i, int i2) {
        java.lang.Object obj2 = this.a;
        defpackage.xzo xzoVarA = defpackage.xzo.a(obj, i, i2);
        java.lang.Object objF = ((defpackage.yfy) obj2).f(xzoVarA);
        xzoVarA.b();
        return objF;
    }

    public final void x(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        ((defpackage.yfy) this.a).g(defpackage.xzo.a(obj, i, i2), obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void y(defpackage.xuo xuoVar, defpackage.xwu xwuVar) {
        ?? r1 = this.a;
        if (xwuVar.equals(r1.get(xuoVar))) {
            r1.remove(xuoVar);
        }
    }

    public final /* synthetic */ defpackage.utq z() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.utq) aladVarP;
    }

    public vqu(android.content.Context context, byte[] bArr, byte[] bArr2) {
        aooh.f(context, "appContext");
        this.a = context;
    }

    public vqu(java.lang.Object obj) {
        this.a = obj;
    }

    public vqu(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vqu(defpackage.toj tojVar) {
        aooh.f(tojVar, "sharpieLifecycleController");
        this.a = tojVar;
    }

    public vqu(long j) {
        this.a = new defpackage.xzn(this, j);
    }

    public vqu(android.content.Context context) {
        this.a = new defpackage.aelu(context);
    }

    public vqu(byte[] bArr) {
        this.a = new java.util.HashMap();
    }

    public vqu() {
        char[] cArr = defpackage.ygc.a;
        this.a = new java.util.ArrayDeque(0);
    }

    public vqu(char[] cArr) {
        this.a = new java.util.ArrayDeque();
    }
}
