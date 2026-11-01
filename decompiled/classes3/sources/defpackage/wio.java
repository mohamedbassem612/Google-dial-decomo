package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wio implements oql {
    private final ajct a;
    private final aoin b;

    public wio(ajct ajctVar, aoin aoinVar) {
        this.a = ajctVar;
        this.b = aoinVar;
    }

    public final oqt a() {
        return oqt.b;
    }

    public final aify b() {
        return aify.p(oqu.e);
    }

    public final aify c() {
        return aify.p(oqt.d);
    }

    public final java.lang.String d() {
        return "main.hats_container";
    }

    public final java.lang.String e() {
        return (java.lang.String) this.b.a();
    }

    public final ajcq f(oqi oqiVar) {
        return ((java.lang.String) this.b.a()).isEmpty() ? aiql.z(java.lang.Boolean.FALSE) : ahrv.g(g(oqiVar, oqt.e)).i(new defpackage.whr(this, oqiVar, 2, null), this.a);
    }

    public final ajcq g(oqi oqiVar, oqt oqtVar) {
        return ahrv.g(oqiVar.a(oqtVar)).h(new defpackage.win(0), this.a);
    }
}
