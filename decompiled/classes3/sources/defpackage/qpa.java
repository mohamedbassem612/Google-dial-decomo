package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpa implements defpackage.qmx {
    private static final aimz a = aimz.i("com/android/dialer/incall/video/buttons/MuteButtonController");
    private final zmq b;
    private final ruc c;
    private final defpackage.qbe d;

    public qpa(zmq zmqVar, ruc rucVar, defpackage.qbe qbeVar) {
        this.b = zmqVar;
        this.c = rucVar;
        this.d = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        a.b().l("com/android/dialer/incall/video/buttons/MuteButtonController", "onButtonClicked", 31, "MuteButtonController.java").v("mute clicked");
        boolean z = qmwVar.b;
        this.b.c(!z, true);
        ruc rucVar = this.c;
        if (z) {
            aenj aenjVar = ruc.L;
            rucVar.j(aenjVar);
            rucVar.k(aenjVar);
            this.d.a(qbc.bI);
            return;
        }
        aenj aenjVar2 = ruc.K;
        rucVar.j(aenjVar2);
        rucVar.k(aenjVar2);
        this.d.a(qbc.bH);
    }
}
