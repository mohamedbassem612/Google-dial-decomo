package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class anxg extends defpackage.anpv {
    public final defpackage.anpv b;

    public anxg(defpackage.anpv anpvVar) {
        this.b = anpvVar;
    }

    @Override // defpackage.anpv
    public final java.lang.String a() {
        return this.b.a();
    }

    @Override // defpackage.anpv
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.anpv
    public void c() {
        throw null;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("delegate", this.b);
        return ahymVarL.toString();
    }
}
