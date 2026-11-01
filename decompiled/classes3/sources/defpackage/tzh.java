package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzh implements oql {
    public final ajct a;
    private final aoin b;
    private final aoin c;

    public tzh(ajct ajctVar, aoin aoinVar, aoin aoinVar2) {
        this.a = ajctVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    public final oqt a() {
        return oqt.b;
    }

    public final /* synthetic */ aify b() {
        return aike.a;
    }

    public final aify c() {
        return aify.q(oqt.j, oqt.i);
    }

    public final java.lang.String d() {
        return "main.hats_container";
    }

    public final java.lang.String e() {
        return (java.lang.String) this.b.a();
    }

    public final ajcq f(oqi oqiVar) {
        if (((java.lang.String) this.b.a()).isEmpty() || ((java.lang.Boolean) this.c.a()).booleanValue()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        ahrv ahrvVarG = ahrv.g(oqiVar.a(oqt.j));
        defpackage.tbp tbpVar = new defpackage.tbp(11);
        ajct ajctVar = this.a;
        return ahrv.g(ahrvVarG.h(tbpVar, ajctVar)).i(new defpackage.tak(this, oqiVar, 7), ajctVar);
    }
}
