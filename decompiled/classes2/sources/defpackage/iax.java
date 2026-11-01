package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iax {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/callaudiomanager/CallAudioImpl");
    public final java.util.concurrent.atomic.AtomicReference b;
    public final defpackage.hyv c;
    public final aigf d;
    public final aoin e;
    public final aoin f;
    public final ajct g;
    public final ajct h;
    public final aoin i;
    public final java.lang.String j;
    public boolean k = false;
    public final defpackage.ifb l;
    private final ajcu m;

    public iax(defpackage.hzc hzcVar, ajcu ajcuVar, ajct ajctVar, ajct ajctVar2, defpackage.hyv hyvVar, defpackage.ifb ifbVar, aigf aigfVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        this.b = new java.util.concurrent.atomic.AtomicReference(hzcVar);
        this.j = hzcVar.a;
        this.m = ajcuVar;
        this.g = ajctVar;
        this.h = ajctVar2;
        this.c = hyvVar;
        this.l = ifbVar;
        this.d = aigfVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.i = aoinVar3;
    }

    private final ajcq i(java.lang.String str, boolean z) {
        return ahvr.G(new defpackage.iet(this, str, z, 1), this.g);
    }

    public final defpackage.hxf a(java.lang.String str) {
        return new defpackage.ibf(i(str, false));
    }

    public final defpackage.hxf b(java.lang.String str) {
        return new defpackage.ibf(i(str, true));
    }

    public final defpackage.hzh c(defpackage.hzh hzhVar) {
        ailj ailjVarK = this.d.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            defpackage.hzh hzhVar2 = (defpackage.hzh) entry.getKey();
            defpackage.hyw hywVar = (defpackage.hyw) entry.getValue();
            if (hzhVar2 != hzhVar && hywVar.e()) {
                return hzhVar2;
            }
        }
        return null;
    }

    public final ajcq d(j$.time.Duration duration) {
        return ahrv.g(this.g.eU(ahqx.i(new defpackage.hkx(this, 4)))).h(new defpackage.iau(this, duration, 0), this.m);
    }

    public final ajcq e(j$.time.Duration duration) {
        return ahrv.g(this.g.eU(ahqx.i(new defpackage.hkx(this, 7)))).h(new defpackage.iau(this, duration, 1), this.m);
    }

    public final ajcq f(j$.time.Duration duration) {
        return ahrv.g(this.g.eU(ahqx.i(new defpackage.hkx(this, 5)))).h(new defpackage.iau(this, duration, 2), this.m);
    }

    public final ajcq g(boolean z) {
        return ahvr.G(new defpackage.iaw(this, z, 1), this.g);
    }

    public final ajcq h(boolean z) {
        return ahvr.G(new defpackage.iaw(this, z, 0), this.g);
    }
}
