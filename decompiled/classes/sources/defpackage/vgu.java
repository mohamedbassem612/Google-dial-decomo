package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vgu {
    public final android.content.Context a;
    public final java.util.concurrent.Executor b;
    public final defpackage.ajct c;
    public final defpackage.ajct d;
    public final defpackage.vdq e;
    public final defpackage.zjv f;
    public final defpackage.aoin g;
    public final defpackage.vze h;
    public final defpackage.vix i;
    public vgi j;
    public final defpackage.aazc k;
    public final defpackage.rsr l;
    private final defpackage.vgj m;

    public vgu(android.content.Context context, defpackage.ajcu ajcuVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.rsr rsrVar, defpackage.vze vzeVar, defpackage.vgj vgjVar, defpackage.vdq vdqVar, defpackage.zjv zjvVar, defpackage.aazc aazcVar, defpackage.vix vixVar, defpackage.aoin aoinVar) {
        this.a = context;
        this.l = rsrVar;
        this.h = vzeVar;
        this.b = new defpackage.ajdc(ajcuVar);
        this.c = ajctVar;
        this.d = ajctVar2;
        this.m = vgjVar;
        this.e = vdqVar;
        this.f = zjvVar;
        this.k = aazcVar;
        this.i = vixVar;
        this.g = aoinVar;
    }

    public final defpackage.ahru a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahru ahruVarB = defpackage.ahru.b(this.m.a(phoneAccountHandle));
        vgf vgfVar = new vgf(this, phoneAccountHandle, 2);
        java.util.concurrent.Executor executor = this.b;
        return ahruVarB.d(vgfVar, executor).a(vis.class, new defpackage.kwb(15), this.c).c(new vgt(this, phoneAccountHandle), executor);
    }
}
