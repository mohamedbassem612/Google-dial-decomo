package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgp implements defpackage.ihn, defpackage.jfg {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/session/BeeslySodaListener");
    public final long b;
    public final java.lang.String c;
    public final defpackage.kpb d;
    public final defpackage.jgq e;
    public final defpackage.jgk f;
    public boolean g;
    public boolean h;
    public final kgl i;
    private final aoss j;
    private final ahda k;

    public jgp(aoss aossVar, long j, java.lang.String str, kgl kglVar, aazc aazcVar, defpackage.kpb kpbVar, defpackage.jgq jgqVar, defpackage.jgk jgkVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "uniqueCallId");
        aooh.f(kglVar, "beeslySot");
        aooh.f(aazcVar, "clock");
        aooh.f(kpbVar, "callNotesTranscriptBuilder");
        aooh.f(jgqVar, "transcriptCache");
        aooh.f(jgkVar, "beeslySession");
        this.j = aossVar;
        this.b = j;
        this.c = str;
        this.i = kglVar;
        this.d = kpbVar;
        this.e = jgqVar;
        this.f = jgkVar;
        this.k = new ahda((byte[]) null);
    }

    private final java.lang.Object k(aonj aonjVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.j, this.k, new defpackage.jeb(aonjVar, (aoln) null, 16, (char[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.ihn
    public final java.lang.Object a(defpackage.igd igdVar, tvx tvxVar, aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.jgo(this, igdVar, tvxVar, (aoln) null, 1), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    @Override // defpackage.ihn
    public final java.lang.Object b(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.jgo(this, twjVar, igdVar, (aoln) null, 0), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    @Override // defpackage.ihn
    public final java.lang.Object c(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.jgo(this, twjVar, igdVar, null, 2, null), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    @Override // defpackage.ihn
    public final java.lang.Object d(twg twgVar, aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.bhp(this, twgVar, (aoln) null, 10), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    @Override // defpackage.ihn
    public final /* synthetic */ java.lang.Object e() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object f(aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object g(defpackage.jfl jflVar, aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object h(aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object i(aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.blq(this, (aoln) null, 17), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }

    public final void j() {
        if (this.g) {
            return;
        }
        this.g = true;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object q() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object r() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object s() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object t(defpackage.jfo jfoVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object u() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object v() {
        return aojh.a;
    }

    @Override // defpackage.ihn
    public final java.lang.Object y(amle amleVar, aoln aolnVar) {
        java.lang.Object objK = k(new defpackage.jgn(this, (aoln) null, 0), aolnVar);
        return objK != aolu.a ? aojh.a : objK;
    }
}
