package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apdo implements defpackage.aosb, defpackage.aovq {
    public final defpackage.aosc a;
    final /* synthetic */ defpackage.apdp b;

    public apdo(defpackage.apdp apdpVar, defpackage.aosc aoscVar) {
        this.b = apdpVar;
        this.a = aoscVar;
    }

    @Override // defpackage.aovq
    public final void E(defpackage.apbi apbiVar, int i) {
        throw null;
    }

    @Override // defpackage.aosb
    public final void c(java.lang.Object obj) throws defpackage.aotd {
        this.a.c(obj);
    }

    @Override // defpackage.aosb
    public final void d(defpackage.aonj aonjVar) {
        throw null;
    }

    @Override // defpackage.aosb
    public final /* bridge */ /* synthetic */ void e(java.lang.Object obj, defpackage.aono aonoVar) throws defpackage.aotd {
        boolean z = defpackage.aosu.a;
        defpackage.apdp apdpVar = this.b;
        apdpVar.a.c(null);
        int i = 2;
        defpackage.aoqo aoqoVar = new defpackage.aoqo(apdpVar, i);
        defpackage.aosc aoscVar = this.a;
        aoscVar.C(obj, aoscVar.e, new defpackage.kcc(aoqoVar, i));
    }

    @Override // defpackage.aosb
    public final /* bridge */ /* synthetic */ void f(defpackage.aosp aospVar, java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.aosb
    public final boolean g(java.lang.Throwable th) {
        return this.a.g(th);
    }

    @Override // defpackage.aosb
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.aosb
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.aosb
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, defpackage.aono aonoVar) {
        boolean z = defpackage.aosu.a;
        defpackage.apdp apdpVar = this.b;
        defpackage.kcc kccVar = new defpackage.kcc(apdpVar, 3);
        defpackage.apcm apcmVarG = this.a.G((defpackage.aojh) obj, kccVar);
        if (apcmVarG != null) {
            apdpVar.a.c(null);
        }
        return apcmVarG;
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.a.b;
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) throws defpackage.aotd {
        this.a.w(obj);
    }
}
