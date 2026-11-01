package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvn implements defpackage.anvr {
    public anqw a;
    final /* synthetic */ defpackage.anvo b;
    public final anty c;

    public anvn(defpackage.anvo anvoVar, anty antyVar) {
        j$.util.Objects.requireNonNull(anvoVar);
        this.b = anvoVar;
        ahvr.cj(antyVar, "observer");
        this.c = antyVar;
    }

    @Override // defpackage.anvr
    public final void a(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        int i = defpackage.aoik.a;
        defpackage.anvo anvoVar = this.b;
        anmw anmwVarC = anvoVar.c();
        if (anqwVar.o == anqt.b && anmwVarC != null && anmwVarC.f()) {
            anqwVar = anvoVar.f.b();
            anphVar = new anph();
        }
        anvoVar.c.execute(new defpackage.anvl(this, anqwVar, anphVar));
    }

    public final void b(anqw anqwVar) {
        this.a = anqwVar;
        this.b.j.c(anqwVar);
    }

    @Override // defpackage.anvr
    public final void c(anph anphVar) {
        int i = defpackage.aoik.a;
        this.b.c.execute(new defpackage.anvj(this, anphVar));
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        int i = defpackage.aoik.a;
        this.b.c.execute(new defpackage.anvk(this, aodlVar));
    }

    @Override // defpackage.aodm
    public final void e() {
        defpackage.anvo anvoVar = this.b;
        if (anvoVar.b.a.a()) {
            return;
        }
        int i = defpackage.aoik.a;
        anvoVar.c.execute(new defpackage.anvm(this));
    }
}
