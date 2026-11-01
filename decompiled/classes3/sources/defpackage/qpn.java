package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpn implements defpackage.qbb {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/logging/VideoCallCallEventPopulator");
    public final defpackage.puu c;
    public final defpackage.puw e;
    public final android.telecom.Call f;
    public final java.util.concurrent.Executor g;
    public final aoin h;
    public boolean n;
    public long q;
    public final defpackage.pvr t;
    public final defpackage.rai v = new defpackage.rai(this);
    public final defpackage.rai u = new defpackage.rai(this);
    public final defpackage.put b = new defpackage.pvp(this, 4);
    public final defpackage.znp d = new ler(this, 7);
    public final java.util.List i = new java.util.ArrayList();
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public defpackage.amsd o = defpackage.amsd.UNKNOWN_REQUEST_TYPE;
    public boolean p = false;
    public long r = 0;
    public int s = 0;

    public qpn(defpackage.pvr pvrVar, android.telecom.Call call, ajct ajctVar, aoin aoinVar) {
        int i = 0;
        this.c = new defpackage.qpi(this, i);
        this.e = new defpackage.qpj(this, i);
        this.t = pvrVar;
        this.f = call;
        this.g = new ajdc(ajctVar);
        this.h = aoinVar;
    }

    @Override // defpackage.qbb
    public final ajcq a() {
        return ahvr.F(new defpackage.qfe(this, 11), this.g);
    }

    @Override // defpackage.qbb
    public final /* bridge */ /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        defpackage.amsf amsfVar = (defpackage.amsf) obj;
        if (amsfVar.d > 0) {
            akzxVar.u();
            amow amowVar = akzxVar.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(amsfVar);
            amowVar.af = amsfVar;
            amowVar.c |= 268435456;
        }
    }
}
