package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdp {
    public static final aimz a = aimz.i("com/android/dialer/incall/proximitysensor/impl/incall/DisplayStateTracker");
    public final java.util.concurrent.Executor b;
    public final android.os.Handler c;
    public final ahpz d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public final java.util.Set f = new java.util.HashSet();
    public final android.hardware.display.DisplayManager.DisplayListener g = new defpackage.qhx(this, 1);
    public final zpz h;
    public final tkl i;

    public qdp(tkl tklVar, zpz zpzVar, ajct ajctVar, agth agthVar, ahpz ahpzVar) {
        this.i = tklVar;
        this.h = zpzVar;
        this.b = new ajdc(ajctVar);
        this.c = agthVar;
        this.d = ahpzVar;
    }
}
