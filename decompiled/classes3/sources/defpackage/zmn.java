package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmn {
    public static final aimz a = aimz.i("com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo");
    public j$.util.Optional h;
    public j$.util.Optional i;
    public final android.content.Context j;
    public final zjs k;
    public final oko l;
    public final okj m;
    public final oki n;
    public final zpz o;
    private final java.util.concurrent.Executor r;
    public final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();
    public final aca c = new aca();
    public final j$.util.concurrent.ConcurrentHashMap d = new j$.util.concurrent.ConcurrentHashMap();
    private final j$.util.concurrent.ConcurrentHashMap p = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap e = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap f = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap g = new j$.util.concurrent.ConcurrentHashMap();
    private final j$.util.concurrent.ConcurrentHashMap q = new j$.util.concurrent.ConcurrentHashMap();

    public zmn(android.content.Context context, zjs zjsVar, oko okoVar, okj okjVar, oki okiVar, zpz zpzVar, ajct ajctVar) {
        new j$.util.concurrent.ConcurrentHashMap();
        this.h = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        j$.util.Optional.empty();
        this.j = context;
        this.k = zjsVar;
        this.l = okoVar;
        this.m = okjVar;
        this.n = okiVar;
        this.o = zpzVar;
        this.r = new ajdc(ajctVar);
    }

    public final oko a(j$.util.Optional optional) {
        return (oko) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.p, optional, new defpackage.vxb(this, 13));
    }

    public final j$.util.Optional b(j$.util.Optional optional) {
        return (j$.util.Optional) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.q, optional, new defpackage.pgq(this, optional, 18, null));
    }

    public final j$.util.Optional c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        agsm.i(1225, ahvr.F(new defpackage.wzc(this, phoneAccountHandle, 10, null), this.r), "Could not retrieve device number.", new java.lang.Object[0]);
        return (j$.util.Optional) this.c.getOrDefault(phoneAccountHandle, j$.util.Optional.empty());
    }
}
