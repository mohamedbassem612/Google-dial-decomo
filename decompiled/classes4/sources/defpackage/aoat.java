package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoat extends defpackage.anon {
    public static final defpackage.anoh f = defpackage.anoh.d("pick_first: attempting to connect");
    public final defpackage.anof g;
    public defpackage.anok h;
    public anmm i = anmm.d;

    public aoat(defpackage.anof anofVar) {
        this.g = anofVar;
    }

    @Override // defpackage.anon
    public final anqw a(defpackage.anoj anojVar) {
        defpackage.aoar aoarVar;
        java.lang.Boolean bool;
        java.util.List listE = anojVar.a;
        if (listE.isEmpty()) {
            defpackage.anlw anlwVar = anojVar.b;
            anqw anqwVarF = anqw.l.f("NameResolver returned no usable address. addrs=" + java.lang.String.valueOf(listE) + ", attrs=" + anlwVar.toString());
            b(anqwVarF);
            return anqwVarF;
        }
        java.lang.Object obj = anojVar.c;
        if ((obj instanceof defpackage.aoar) && (bool = (aoarVar = (defpackage.aoar) obj).a) != null && bool.booleanValue()) {
            java.lang.Long l = aoarVar.b;
            listE = defpackage.aoap.e(listE, new java.util.Random());
        }
        defpackage.anok anokVar = this.h;
        if (anokVar == null) {
            defpackage.anof anofVar = this.g;
            defpackage.anoa anoaVar = new defpackage.anoa();
            anoaVar.c(listE);
            defpackage.anok anokVarB = anofVar.b(anoaVar.a());
            anokVarB.c(new defpackage.aoaq(this, anokVarB, 0));
            this.h = anokVarB;
            e(anmm.a, new defpackage.anoe(f));
            anokVarB.a();
        } else {
            anokVar.d(listE);
        }
        return anqw.b;
    }

    @Override // defpackage.anon
    public final void b(anqw anqwVar) {
        defpackage.anok anokVar = this.h;
        if (anokVar != null) {
            anokVar.b();
            this.h = null;
        }
        e(anmm.c, new defpackage.anoe(defpackage.anoh.b(anqwVar)));
    }

    @Override // defpackage.anon
    public final void c() {
        defpackage.anok anokVar = this.h;
        if (anokVar != null) {
            anokVar.a();
        }
    }

    @Override // defpackage.anon
    public final void d() {
        defpackage.anok anokVar = this.h;
        if (anokVar != null) {
            anokVar.b();
            this.h = null;
        }
    }

    public final void e(anmm anmmVar, defpackage.anol anolVar) {
        this.i = anmmVar;
        this.g.f(anmmVar, anolVar);
    }
}
