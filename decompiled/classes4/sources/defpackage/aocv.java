package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aocv extends defpackage.antw {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aocv.class.getName());
    public static final aoag b = new aodg(anxo.o, 0);
    public static final defpackage.anni c = new defpackage.aocu();
    private static final anmy u = anmy.b;
    private static final anmk v = anmk.a;
    private static final long w;
    final java.util.List d;
    public final java.util.List e;
    public final java.util.List f;
    public final java.util.List g;
    public defpackage.anni h;
    public aoag i;
    public anmy j;
    public anmk k;
    long l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    anno q;
    public final defpackage.anyd r;
    public final vqf s;
    ajsz t;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        w = 120000L;
    }

    public aocv(defpackage.anyd anydVar) {
        super((char[]) null);
        this.s = new vqf((byte[]) null, (byte[]) null);
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = c;
        this.i = b;
        this.j = u;
        this.k = v;
        this.l = w;
        this.t = anmw.b;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = anno.b;
        this.r = anydVar;
        java.util.Iterator it = apnf.j().h().iterator();
        while (it.hasNext()) {
            ((defpackage.anml) it.next()).b();
        }
    }
}
