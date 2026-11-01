package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qvk {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/buttons/AudioRouteButtonController");
    public final defpackage.rap b;
    public final zms c;
    public final zmq d;
    public final ajct e;
    public final aoss f;
    public final mba g;
    public final ruc h;
    public final agsm i;
    public final defpackage.qtx j;
    public final defpackage.qbe k;
    public final apni l;
    public final defpackage.afpl m;

    public qvk(defpackage.afpl afplVar, defpackage.rap rapVar, zms zmsVar, zmq zmqVar, defpackage.qbe qbeVar, ajct ajctVar, aoss aossVar, mba mbaVar, ruc rucVar, agsm agsmVar, apni apniVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(rapVar, "voiceController");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rucVar, "metrics");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(apniVar, "androidJobs");
        this.m = afplVar;
        this.b = rapVar;
        this.c = zmsVar;
        this.d = zmqVar;
        this.k = qbeVar;
        this.e = ajctVar;
        this.f = aossVar;
        this.g = mbaVar;
        this.h = rucVar;
        this.i = agsmVar;
        this.l = apniVar;
        this.j = new nyy(this, 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.qvi qviVar;
        if (aolnVar instanceof defpackage.qvi) {
            qviVar = (defpackage.qvi) aolnVar;
            int i = qviVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qviVar.c = i - Integer.MIN_VALUE;
            } else {
                qviVar = new defpackage.qvi(this, aolnVar);
            }
        } else {
            qviVar = new defpackage.qvi(this, aolnVar);
        }
        java.lang.Object objD = qviVar.a;
        aolu aoluVar = aolu.a;
        int i2 = qviVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.m.X();
            qviVar.c = 1;
            objD = aosv.D(ajcqVarX, qviVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.qvh.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }
}
