package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxw {
    public defpackage.eoq a;
    public defpackage.enr b;
    public final boolean c = true;
    private final java.lang.String d;

    public amxw(defpackage.eoq eoqVar) {
        this.a = eoqVar;
        this.d = (java.lang.String) eoqVar.a(defpackage.eof.d);
    }

    public final void a() {
        this.a = null;
    }

    public final void b(defpackage.eoq eoqVar) {
        if (this.b == null) {
            defpackage.eos eosVar = new defpackage.eos(eoqVar);
            eosVar.b(defpackage.eof.d, this.d);
            this.a = eosVar;
        }
    }

    public final boolean c() {
        return this.b == null && this.a == null;
    }
}
