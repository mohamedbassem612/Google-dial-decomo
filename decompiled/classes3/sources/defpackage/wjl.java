package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wjl extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.wjo d;
    final /* synthetic */ long e;
    final /* synthetic */ char f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjl(defpackage.wjo wjoVar, long j, char c, aoln aolnVar) {
        super(2, aolnVar);
        this.d = wjoVar;
        this.e = j;
        this.f = c;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.wjo wjoVar;
        apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.c;
        try {
            if (i != 0) {
                if (i != 1) {
                    aooc.af(obj);
                } else {
                    java.lang.Object obj4 = this.b;
                    java.lang.Object obj5 = this.a;
                    aooc.af(obj);
                    obj3 = obj4;
                    obj2 = obj5;
                }
                return aojh.a;
            }
            aooc.af(obj);
            wjoVar = this.d;
            apdpVar = wjoVar.k;
            this.a = apdpVar;
            this.b = wjoVar;
            this.c = 1;
            if (apdpVar.b(this) == aoluVar) {
                obj3 = wjoVar;
                obj2 = apdpVar;
                return aoluVar;
            }
            obj3 = wjoVar;
            obj2 = apdpVar;
            long j = ((defpackage.wjo) obj3).i;
            ((apdp) obj2).d();
            if (j != 0) {
                long j2 = this.e;
                if (j2 >= j) {
                    char c = this.f;
                    akzx akzxVarM = defpackage.alre.a.m();
                    aooh.f(akzxVarM, "builder");
                    akzxVarM.u();
                    defpackage.alre alreVar = (defpackage.alre) akzxVarM.b;
                    alreVar.b |= 1;
                    alreVar.c = true;
                    java.lang.String strValueOf = java.lang.String.valueOf(c);
                    aooh.f(strValueOf, "value");
                    akzxVarM.u();
                    defpackage.alre alreVar2 = (defpackage.alre) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strValueOf);
                    alreVar2.b |= 2;
                    alreVar2.d = strValueOf;
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    ajyi ajyiVarI = defpackage.ahus.I(alro.a.m());
                    apdi apdiVar = defpackage.alre.e;
                    aooh.e(apdiVar, "dtmfEvent");
                    ajyiVarI.be(apdiVar, (defpackage.alre) aladVarP);
                    ajyiVarI.bb(j2 - j);
                    alro alroVarBa = ajyiVarI.ba();
                    defpackage.wjo wjoVar2 = this.d;
                    ifv ifvVar = ifv.f;
                    this.a = null;
                    this.b = null;
                    this.c = 2;
                    if (wjoVar2.f.c(ifvVar, alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                }
            }
            defpackage.wjo.a.d().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineRunner", "submitDialpadClick$<anonymous>", 283, "XatuPipelineRunner.kt").v("dialpad click happened before conversation start");
            return aojh.a;
        } catch (java.lang.Throwable th) {
            ((apdp) obj2).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.wjl(this.d, this.e, this.f, aolnVar);
    }
}
