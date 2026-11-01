package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utf {
    public static final aimz a = aimz.i("com/android/dialer/timekeeper/impl/mdd/TimeKeeperDataRepository");
    public final ajct b;
    public final ajct c;
    public final defpackage.usf d;
    public final agtc e;
    public final aoin f;
    public final ipc g;
    private final defpackage.usj h;
    private final android.content.Context i;
    private final rsr j;

    public utf(ajct ajctVar, ajct ajctVar2, rsr rsrVar, defpackage.usf usfVar, defpackage.usj usjVar, aoin aoinVar, android.content.Context context, ipc ipcVar) {
        this.b = ajctVar;
        this.c = ajctVar2;
        this.j = rsrVar;
        this.d = usfVar;
        this.h = usjVar;
        this.f = aoinVar;
        this.g = ipcVar;
        this.e = new agtc(new defpackage.plx(this, 20), ajctVar2);
        this.i = context;
    }

    private final ajcq d() {
        defpackage.acvm acvmVarA = defpackage.acvn.a();
        acvmVarA.b("tk-dataset");
        return this.j.G(acvmVarA.a());
    }

    public final ajcq a() {
        return ahvr.H(d(), new defpackage.uqm(14), ajbm.a);
    }

    public final ajcq b() {
        a.b().l("com/android/dialer/timekeeper/impl/mdd/TimeKeeperDataRepository", "refreshStaleDatabase", 91, "TimeKeeperDataRepository.java").v("enter");
        ajcq ajcqVarD = d();
        defpackage.uqm uqmVar = new defpackage.uqm(12);
        ajct ajctVar = this.c;
        ajcq ajcqVarH = ahvr.H(ajcqVarD, uqmVar, ajctVar);
        ajcq ajcqVarC = this.h.c();
        return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarC}).p(new jsr(this, ajcqVarH, ajcqVarC, 19), ajctVar);
    }

    public final java.lang.String c() {
        return java.lang.String.valueOf(java.lang.String.valueOf(this.i.getFilesDir())).concat("/tk_dataset");
    }
}
