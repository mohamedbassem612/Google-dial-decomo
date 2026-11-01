package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rze {
    public final java.lang.Object a;

    public rze(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
    }

    public final defpackage.skn a() {
        defpackage.skn sknVar = ((defpackage.skp) ((akzx) this.a).b).m;
        if (sknVar == null) {
            sknVar = defpackage.skn.a;
        }
        aooh.e(sknVar, "getContactNameDynamicColorData(...)");
        return sknVar;
    }

    public final /* synthetic */ defpackage.skp b() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.skp) aladVarP;
    }

    public final void c(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        j$.util.Objects.requireNonNull(str);
        skpVar.b |= 2;
        skpVar.d = str;
    }

    public final void d(defpackage.skn sknVar) {
        aooh.f(sknVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        j$.util.Objects.requireNonNull(sknVar);
        skpVar.m = sknVar;
        skpVar.b |= 1024;
    }

    public final void e(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        skpVar.b |= 128;
        skpVar.j = f;
    }

    public final void f(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        skpVar.b |= 256;
        skpVar.k = f;
    }

    public final void g(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        skpVar.b |= 64;
        skpVar.i = f;
    }

    public final void h(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.skp skpVar = (defpackage.skp) akzxVar.b;
        defpackage.skp skpVar2 = defpackage.skp.a;
        skpVar.l = a.aT(i);
        skpVar.b |= 512;
    }

    public final void i() {
        ((defpackage.qbe) this.a).c(qbc.nF);
    }

    public final /* synthetic */ defpackage.tkp j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tkp) aladVarP;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final defpackage.tjp k(defpackage.tjh tjhVar, java.util.List list) {
        rlv rlvVar = (rlv) this.a.a();
        rlvVar.getClass();
        return new defpackage.tjp(rlvVar, tjhVar, list);
    }

    public rze(java.lang.Object obj) {
        this.a = obj;
    }

    public rze(defpackage.qbe qbeVar) {
        aooh.f(qbeVar, "inCallLogging");
        this.a = qbeVar;
    }

    public rze(defpackage.sjf sjfVar) {
        aooh.f(sjfVar, "navigationAdapter");
        this.a = sjfVar;
    }

    public rze(sou souVar) {
        aooh.f(souVar, "phoneAccountInfoFetcher");
        this.a = souVar;
    }

    public rze(aoin aoinVar) {
        aoinVar.getClass();
        this.a = aoinVar;
    }
}
