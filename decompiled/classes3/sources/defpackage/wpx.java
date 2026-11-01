package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wpx {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/settings/XatuSettings");
    public final ajct b;
    public final aogc c;
    private final aoin d;

    public wpx(aogc aogcVar, ajct ajctVar, aoin aoinVar) {
        this.c = aogcVar;
        this.b = ajctVar;
        this.d = aoinVar;
    }

    public final ajcq a() {
        return ahvr.H(this.c.bk(), new defpackage.wkb(7), this.b);
    }

    public final ajcq b() {
        return ahvr.H(this.c.bk(), new defpackage.wkb(8), this.b);
    }

    public final ajcq c() {
        return ahvr.H(this.c.bk(), new defpackage.wkb(6), this.b);
    }

    public final ajcq d() {
        return !((java.lang.Boolean) this.d.a()).booleanValue() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(c(), new defpackage.wkb(9), this.b);
    }

    public final ajcq e() {
        return this.c.bl(new lbn(16));
    }

    public final ajcq f(defpackage.wpt wptVar) {
        return this.c.bl(new defpackage.tbd(wptVar, 10));
    }

    public final ajcq g(defpackage.wpu wpuVar) {
        return this.c.bl(new defpackage.tbd(wpuVar, 7));
    }

    public final ajcq h(defpackage.wpw wpwVar) {
        return this.c.bl(new defpackage.tbd(wpwVar, 8));
    }
}
