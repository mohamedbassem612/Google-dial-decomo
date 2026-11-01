package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfu {
    public static final aimz a = aimz.i("com/google/android/callingshared/peertopeer/session/impl/RcsSession");
    public final defpackage.zdt b;
    public final defpackage.zfd c;
    public final defpackage.zff d;
    public final aoss e;
    public final defpackage.zgx f;
    public boolean g;
    public final aowv h;
    public final aowu i;
    public final defpackage.rdp j;
    public final defpackage.uyg k;
    private final aowi l;
    private final j$.time.Duration m;
    private final ahda n = new ahda((byte[]) null);

    /* JADX WARN: Type inference failed for: r2v4, types: [aoin, java.lang.Object] */
    public zfu(defpackage.zdt zdtVar, defpackage.zfd zfdVar, defpackage.zff zffVar, aoss aossVar, defpackage.zgx zgxVar, defpackage.uyg uygVar, defpackage.rdp rdpVar) {
        this.b = zdtVar;
        this.c = zfdVar;
        this.d = zffVar;
        this.e = aossVar;
        this.f = zgxVar;
        this.k = uygVar;
        this.j = rdpVar;
        aowi aowiVarG = aooh.G(100, 3, new defpackage.sba((java.lang.Object) this, 15, (short[][][]) null));
        this.l = aowiVarG;
        aooh.d(aowiVarG, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<com.google.android.callingshared.peertopeer.capabilities.ContextualizedPayload<T of com.google.android.callingshared.peertopeer.session.impl.RcsSession>>");
        this.h = aowiVarG;
        java.lang.Object objA = rdpVar.a.a();
        aooh.e(objA, "get(...)");
        this.m = j$.time.Duration.ofSeconds(((java.lang.Number) objA).longValue());
        this.i = aowiVarG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.zft zftVar;
        if (aolnVar instanceof defpackage.zft) {
            zftVar = (defpackage.zft) aolnVar;
            int i = zftVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zftVar.c = i - Integer.MIN_VALUE;
            } else {
                zftVar = new defpackage.zft(this, aolnVar);
            }
        } else {
            zftVar = new defpackage.zft(this, aolnVar);
        }
        java.lang.Object obj = zftVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zftVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!this.g) {
                aosy aosyVarAg = ahvr.ag(this.e, this.n, new zhb(this, (aoln) null, 1));
                zftVar.c = 1;
                if (aosyVarAg.a(zftVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final java.lang.Object b(albh albhVar, int i, aoln aolnVar) {
        j$.time.Duration duration = this.m;
        aooh.e(duration, "defaultWaitModeTimeout");
        return c(albhVar, i, duration, aolnVar);
    }

    public final java.lang.Object c(albh albhVar, int i, j$.time.Duration duration, aoln aolnVar) {
        return this.g ? new defpackage.zfn(defpackage.zfm.d, null) : ahvr.ag(this.e, this.n, new defpackage.zfs(i, this, albhVar, duration, null)).a(aolnVar);
    }
}
