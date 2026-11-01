package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otq {
    public static final aigf a;
    public final ruc b;
    public final aoin d;
    public final java.util.concurrent.Executor e;
    public final ajcu f;
    public final defpackage.zno j;
    public final defpackage.znh m;
    public final zpm o;
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(defpackage.otp.b);
    public defpackage.otn g = new defpackage.otm().a();
    public j$.util.Optional h = j$.util.Optional.empty();
    public final defpackage.znv i = new ooa(this, 2);
    public final defpackage.zni k = new leq(this, 3);
    public final defpackage.znp l = new ler(this, 4);
    public final zog n = new les(this, 5);

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i(defpackage.oto.a, ruc.n);
        aigbVar.i(defpackage.oto.b, ruc.o);
        aigbVar.i(defpackage.oto.c, ruc.p);
        a = aigbVar.e(true);
    }

    public otq(ruc rucVar, zpm zpmVar, aoin aoinVar, ajct ajctVar, ajcu ajcuVar) {
        int i = 0;
        this.j = new defpackage.otk(this, i);
        this.m = new defpackage.otl(this, i);
        this.b = rucVar;
        this.o = zpmVar;
        this.d = aoinVar;
        this.e = new ajdc(ajctVar);
        this.f = ajcuVar;
    }

    public final ajcq a(defpackage.oto otoVar) {
        return ahvr.E(new lge(this, otoVar, 14, (byte[]) null), this.e);
    }

    public final void b() {
        agsm.i(431, ahvr.E(new lye(this, 11), this.e), "cancel jank recorder failed", new java.lang.Object[0]);
    }

    public final void c() {
        if (this.h.isPresent()) {
            ((ajcs) this.h.orElseThrow()).cancel(false);
            this.h = j$.util.Optional.empty();
        }
    }
}
