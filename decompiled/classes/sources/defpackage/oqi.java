package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oqi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/hats/DialerHatsEventProcessor");
    public static final defpackage.gus o = new defpackage.gus((char[]) null);
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    public final defpackage.ajct d;
    public final defpackage.ajct e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.odp j;
    public final java.util.Map k = new defpackage.aca();
    public j$.util.Optional l = j$.util.Optional.empty();
    public final defpackage.zzx m;
    public final defpackage.zzx n;

    public oqi(android.content.Context context, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.zzx zzxVar, j$.util.Optional optional, j$.util.Optional optional2, defpackage.zzx zzxVar2, defpackage.odp odpVar) {
        this.b = context;
        this.h = aoinVar;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.n = zzxVar;
        this.f = optional;
        this.g = optional2;
        this.m = zzxVar2;
        this.j = odpVar;
        this.c = new defpackage.ajdc(ajctVar);
        this.i = aoinVar2;
    }

    public final defpackage.ajcq a(oqt oqtVar) {
        return defpackage.ahvr.F(new lly(this, oqtVar, 16), this.c);
    }
}
