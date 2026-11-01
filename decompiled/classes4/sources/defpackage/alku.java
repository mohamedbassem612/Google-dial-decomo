package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alku implements defpackage.allg {
    private final defpackage.allj a;
    private j$.util.Optional b;
    private int c;
    private int d;
    private j$.util.Optional e;

    public alku(defpackage.alli alliVar) {
        this.a = alliVar.a(defpackage.allh.k.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_LANG_ID);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.ordinal() != 37 || this.d <= 0) {
            return;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnn.b;
        almzVar2.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alrr alrrVar = (defpackage.alrr) objJ;
        int iAN = a.aN(alrrVar.d);
        if (iAN == 0 || iAN != 4) {
            this.c = 0;
            this.b = j$.util.Optional.empty();
            return;
        }
        java.lang.String str = alrrVar.c;
        j$.util.Optional optionalOfNullable = this.b;
        defpackage.xbz xbzVar = new defpackage.xbz(str, 10);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((java.lang.String) optionalOfNullable.get()).equals(xbzVar.a)));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue()) {
            this.c++;
        } else {
            this.c = 1;
            this.b = j$.util.Optional.of(str);
        }
        j$.util.Optional optionalOfNullable2 = this.e;
        defpackage.xbz xbzVar2 = new defpackage.xbz(str, 11);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((java.lang.String) optionalOfNullable2.get()).equals(xbzVar2.a)));
        }
        if (((java.lang.Boolean) optionalOfNullable2.orElse(bool)).booleanValue() || this.c < this.d) {
            return;
        }
        this.e = j$.util.Optional.of(str);
        defpackage.allj alljVar = this.a;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LANGUAGE_DETECTED;
        akzzVarM.u();
        defpackage.almz almzVar3 = akzzVarM.b;
        almzVar3.c = alnbVar.aN;
        almzVar3.b |= 1;
        apdi apdiVar2 = defpackage.alno.d;
        akzx akzxVarM = defpackage.alno.a.m();
        akzxVarM.u();
        defpackage.alno alnoVar = (defpackage.alno) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alnoVar.b |= 1;
        alnoVar.c = str;
        akzzVarM.bV(apdiVar2, (defpackage.alno) akzxVarM.p());
        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.b = j$.util.Optional.empty();
        this.c = 0;
        this.e = j$.util.Optional.empty();
        this.d = almlVar.v;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
