package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qny implements defpackage.qmx {
    private static final aimz a = aimz.i("com/android/dialer/incall/video/buttons/AudioRouteButtonController");
    private final zmq b;
    private final ruc c;
    private final defpackage.qbe d;

    public qny(zmq zmqVar, ruc rucVar, defpackage.qbe qbeVar) {
        this.b = zmqVar;
        this.c = rucVar;
        this.d = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        defpackage.zmw zmwVar;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/incall/video/buttons/AudioRouteButtonController", "onButtonClicked", 32, "AudioRouteButtonController.java").v("audio route clicked");
        if (qmwVar.c) {
            aimzVar.b().l("com/android/dialer/incall/video/buttons/AudioRouteButtonController", "onButtonClicked", 34, "AudioRouteButtonController.java").v("Audio route selector is shown in VideoScreenFragmentPeer.");
            return;
        }
        boolean z = qmwVar.b;
        ruc rucVar = this.c;
        if (z) {
            zmwVar = defpackage.zmw.ROUTE_WIRED_OR_EARPIECE;
            aenj aenjVar = ruc.N;
            rucVar.j(aenjVar);
            rucVar.k(aenjVar);
            this.d.a(qbc.bR);
        } else {
            zmwVar = defpackage.zmw.ROUTE_SPEAKER;
            aenj aenjVar2 = ruc.M;
            rucVar.j(aenjVar2);
            rucVar.k(aenjVar2);
            this.d.a(qbc.bQ);
        }
        this.b.e(zmwVar);
    }
}
