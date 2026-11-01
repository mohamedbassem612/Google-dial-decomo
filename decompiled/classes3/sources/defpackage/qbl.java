package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbl implements defpackage.zqk {
    public static final aimz a = aimz.i("com/android/dialer/incall/logging/impl/datalogger/InCallDataLogger");
    public final ajct b;
    public final java.util.concurrent.Executor c;
    public final defpackage.qbe d;
    public final rmb e;
    public final java.lang.String f;
    public final defpackage.rdp g;
    public final zzx h;
    public final ttj i;
    public final ipc j;
    private final android.content.Context k;
    private final zzd l;
    private final aoin m;
    private final int n = 5;
    private final zjm o;
    private final rsr p;

    public qbl(android.content.Context context, zzd zzdVar, int i, zzx zzxVar, ajct ajctVar, aoin aoinVar, defpackage.qbe qbeVar, rmb rmbVar, java.lang.String str, defpackage.rdp rdpVar, ttj ttjVar, ipc ipcVar, rsr rsrVar, zjm zjmVar) {
        this.k = context;
        this.l = zzdVar;
        this.h = zzxVar;
        this.b = ajctVar;
        this.c = new ajdc(ajctVar);
        this.m = aoinVar;
        this.d = qbeVar;
        this.e = rmbVar;
        this.f = str;
        this.g = rdpVar;
        this.i = ttjVar;
        this.j = ipcVar;
        this.p = rsrVar;
        this.o = zjmVar;
    }

    private final ajcq g() {
        ahrv ahrvVarG = ahrv.g(((defpackage.afpl) this.m.a()).X());
        ibe ibeVar = new ibe(20);
        ajct ajctVar = this.b;
        return ahrvVarG.i(ibeVar, ajctVar).h(new defpackage.pqn(5), ajctVar);
    }

    @Override // defpackage.zqk
    public final zzd c() {
        return this.l;
    }

    @Override // defpackage.zqk
    public final zzu d() {
        return abtl.b(this.k, new apdz());
    }

    @Override // defpackage.zqk
    public final ajcq e() {
        return ahrv.g(g()).h(new defpackage.pqn(3), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [aoss, java.lang.Object] */
    @Override // defpackage.zqk
    public final ajcq f() {
        ajcq ajcqVarX = ((defpackage.afpl) this.m.a()).X();
        ibe ibeVar = new ibe(19);
        ajct ajctVar = this.b;
        ajcq ajcqVarI = ahvr.I(ahvr.I(ajcqVarX, ibeVar, ajctVar), new ocj(this, 13), ajctVar);
        zjm zjmVar = this.o;
        ajcq ajcqVarG = g();
        ajcq ajcqVarAs = this.p.as();
        j$.util.Optional optionalG = zjmVar.g();
        if (true == optionalG.isPresent()) {
            defpackage.voc vocVar = (defpackage.voc) optionalG.get();
            optionalG = j$.util.Optional.ofNullable(aosv.F((aoss) vocVar.b, 0, new ung(vocVar, (aoln) null, 19), 3));
        }
        ajcq ajcqVar = (ajcq) optionalG.orElse(aiql.z(j$.util.Optional.empty()));
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarG, ajcqVarAs, ajcqVar}).o(new kxy(this, ajcqVarG, ajcqVarAs, ajcqVar, ajcqVarI, 3), this.b);
    }

    @Override // defpackage.zqk
    public final /* synthetic */ long a(long j) {
        return j;
    }

    @Override // defpackage.zqk
    public final /* synthetic */ long b(long j) {
        return j;
    }
}
