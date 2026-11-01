package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omk implements android.hardware.display.DisplayManager.DisplayListener, znk, znp {
    public static final /* synthetic */ int f = 0;
    public final defpackage.omg c;
    public final tkl e;
    private final ajct g;
    private final ajct h;
    public final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    public boolean d = true;

    public omk(ajct ajctVar, ajct ajctVar2, defpackage.omg omgVar, tkl tklVar) {
        this.g = ajctVar;
        this.h = ajctVar2;
        this.c = omgVar;
        this.e = tklVar;
    }

    public final ajcq b() {
        return ahvr.E(new defpackage.lye(this, 5), this.g);
    }

    public final ajcq ek() {
        return ahvr.E(new defpackage.lye(this, 6), this.h);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            defpackage.omj omjVar = new defpackage.omj(this, 0);
            ajct ajctVar = this.h;
            agsm.i(409, ahvr.H(ahvr.F(omjVar, ajctVar), new defpackage.mjl(this, 8), ajctVar), "failed getting updated display state", new java.lang.Object[0]);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
