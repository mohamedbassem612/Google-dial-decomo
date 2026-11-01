package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahix {
    public final afit a;
    public final ahzi b;
    public final ahzi c;
    public final ahzi d;
    public final ahzi e;
    public final ahzi f;
    public final ahzi g;
    private final afis h;

    public ahix(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajxw ajxwVar, android.app.Application application, byte[] bArr) {
        ahvr.bI(new defpackage.wtx(this, 7));
        ahvr.bI(new defpackage.wtx(this, 9));
        this.d = ahvr.bI(new defpackage.wtx(this, 12));
        this.b = ahvr.bI(new defpackage.wtx(this, 13));
        ahvr.bI(new defpackage.wtx(this, 14));
        this.e = ahvr.bI(new defpackage.wtx(this, 15));
        this.c = ahvr.bI(new defpackage.wtx(this, 16));
        this.g = ahvr.bI(new defpackage.wtx(this, 17));
        this.f = ahvr.bI(new defpackage.wtx(this, 19));
        ahvr.bI(new defpackage.wtx(this, 20));
        ahvr.bI(new defpackage.wtx(this, 18));
        ahvr.bI(new aell(this, 1));
        ahvr.bI(new aell(this, 0));
        ahvr.bI(new aell(this, 2));
        ahvr.bI(new aell(this, 3));
        ahvr.bI(new aell(this, 4));
        ahvr.bI(new aell(this, 5));
        ahvr.bI(new aell(this, 6));
        ahvr.bI(new aell(this, 7));
        ahvr.bI(new defpackage.wtx(this, 8));
        ahvr.bI(new defpackage.wtx(this, 10));
        ahvr.bI(new defpackage.wtx(this, 11));
        afit afitVarD = afit.d("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = afitVarD;
        afiv afivVar = afitVarD.c;
        if (afivVar == null) {
            this.h = afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.h = afivVar;
            afivVar.f = ajxwVar;
        }
    }

    public ahix(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajxw ajxwVar, android.app.Application application) {
        this.b = ahvr.bI(new defpackage.ahiw(this, 2));
        this.c = ahvr.bI(new defpackage.ahiw(this, 3));
        this.d = ahvr.bI(new defpackage.ahiw(this, 4));
        this.e = ahvr.bI(new defpackage.ahiw(this, 5));
        this.f = ahvr.bI(new defpackage.ahiw(this, 6));
        this.g = ahvr.bI(new defpackage.ahiw(this, 7));
        afit afitVarD = afit.d("tiktok");
        this.a = afitVarD;
        afiv afivVar = afitVarD.c;
        if (afivVar == null) {
            this.h = afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.h = afivVar;
            afivVar.f = ajxwVar;
        }
    }
}
