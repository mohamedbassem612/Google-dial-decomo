package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qen {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public qen(aogc aogcVar, kaw kawVar, ajct ajctVar) {
        this.c = aogcVar;
        this.b = kawVar;
        this.a = ajctVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final ajcq a() {
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            ((defpackage.ovb) this.c).a();
        }
        return ((defpackage.pqm) this.b).c();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq b() {
        return ahvr.H(((aogc) this.c).bk(), new defpackage.pqn(6), (java.util.concurrent.Executor) this.a);
    }

    public final ajcq c() {
        return ((kaw) this.b).p(((aogc) this.c).bl(new lbn(8)));
    }

    public qen(aogc aogcVar, defpackage.qek qekVar, zpz zpzVar) {
        this.b = aogcVar;
        this.a = qekVar;
        this.c = zpzVar;
    }

    public qen(java.lang.String str, ucm ucmVar, defpackage.qem qemVar) {
        this.b = qemVar;
        this.a = ucmVar;
        this.c = str;
    }

    public qen(defpackage.pqm pqmVar, defpackage.ovb ovbVar, aoin aoinVar) {
        this.b = pqmVar;
        this.c = ovbVar;
        this.a = aoinVar;
    }
}
