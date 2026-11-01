package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhz implements emj {
    public final android.content.Context a;
    public final agth b;
    public final ahpz c;
    public final aimz d;
    public aomy e;
    public aoub f;
    public int g;
    public final defpackage.qhy h;
    public final defpackage.qhx i;
    public final tkl j;
    private final aoss k;
    private final aoin l;
    private boolean m;

    public qhz(android.content.Context context, aoss aossVar, agth agthVar, ahpz ahpzVar, tkl tklVar, aoin aoinVar) {
        aooh.f(context, "context");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agthVar, "handler");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(aoinVar, "enableScreenOffDetectionViaDisplayListener");
        this.a = context;
        this.k = aossVar;
        this.b = agthVar;
        this.c = ahpzVar;
        this.j = tklVar;
        this.l = aoinVar;
        this.d = aimz.i("com/android/dialer/incall/screenoff/ScreenOffDetector");
        this.h = new defpackage.qhy(this);
        this.i = new defpackage.qhx(this, 0);
    }

    public final void a(emx emxVar) {
        if (this.m) {
            return;
        }
        this.m = true;
        boolean zBooleanValue = ((java.lang.Boolean) this.l.a()).booleanValue();
        aoss aossVar = this.k;
        if (zBooleanValue) {
            this.f = aoov.an(aossVar, (aolr) null, 0, new mva(this, (aoln) null, 13), 3);
        } else {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.pbw(this, (aoln) null, 8, (byte[]) null), 3);
        }
    }

    public final void b(emx emxVar) {
        this.e = null;
        oxe oxeVar = new oxe(this, (aoln) null, 8);
        aoss aossVar = this.k;
        aoov.an(aossVar, (aolr) null, 0, oxeVar, 3);
        aoov.an(aossVar, (aolr) null, 0, new defpackage.pbw(this, (aoln) null, 7), 3);
    }

    public final void g(ems emsVar, aomy aomyVar) {
        aooh.f(emsVar, "lifecycle");
        this.e = aomyVar;
        emsVar.c(this);
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
