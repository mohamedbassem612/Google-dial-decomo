package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kjw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker");
    public static final defpackage.aenj b = new defpackage.aenj("CallLogDataSource.fill() ");
    public static final defpackage.aenj c = new defpackage.aenj("CallLogDataSource.isDirty() ");
    public final defpackage.kka d;
    public final defpackage.ajct e;
    public final defpackage.ajct f;
    public final defpackage.jzj g;
    public final defpackage.kfv h;
    public final defpackage.kfm i;
    public final defpackage.ruc k;
    public final defpackage.zzx l;
    public final defpackage.kaw m;
    public final defpackage.rsr n;
    public final defpackage.rsr o;
    public final defpackage.ahzi j = defpackage.ahvr.bI(new defpackage.hlv(this, 6));
    private final defpackage.ajwr p = new defpackage.ajwr();

    public kjw(defpackage.rsr rsrVar, defpackage.rsr rsrVar2, defpackage.kka kkaVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.zzx zzxVar, defpackage.jzj jzjVar, defpackage.kfv kfvVar, defpackage.kfm kfmVar, defpackage.kaw kawVar, defpackage.ruc rucVar) {
        this.o = rsrVar;
        this.n = rsrVar2;
        this.d = kkaVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = jzjVar;
        this.h = kfvVar;
        this.l = zzxVar;
        this.i = kfmVar;
        this.m = kawVar;
        this.k = rucVar;
    }

    public final void a(defpackage.aenj aenjVar, defpackage.aenj aenjVar2, defpackage.ajcq ajcqVar) {
        j$.util.Optional optionalA = this.k.a();
        defpackage.kjt kjtVar = new defpackage.kjt(this, aenjVar, aenjVar2, ajcqVar);
        if (true == optionalA.isPresent()) {
            java.lang.Object obj = optionalA.get();
            defpackage.kjw kjwVar = kjtVar.a;
            defpackage.aenj aenjVar3 = kjtVar.b;
            defpackage.aenj aenjVar4 = kjtVar.c;
            defpackage.ajcq ajcqVar2 = kjtVar.d;
            defpackage.zay zayVar = new defpackage.zay(kjwVar, (defpackage.aeun) obj, defpackage.aenj.a(aenjVar3, aenjVar4), 1);
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            long j = defpackage.ahqx.a;
            ajcqVar2.c(new defpackage.ajcc(ajcqVar2, new defpackage.sqh(defpackage.ahns.c(false), zayVar, 2)), ajbmVar);
        }
    }

    public final defpackage.ajcq b(int i) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker", "refresh", 150, "RefreshAnnotatedCallLogWorker.java")).v("submitting serialized refresh request");
        defpackage.agsx agsxVar = new defpackage.agsx(this, i, 1);
        long j = defpackage.ahqx.a;
        return this.p.e(new defpackage.ahqt(defpackage.ahns.c(false), agsxVar, 0), this.f);
    }
}
