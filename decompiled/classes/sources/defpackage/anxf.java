package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class anxf extends defpackage.anor {
    public final defpackage.anor a;

    public anxf(defpackage.anor anorVar) {
        this.a = anorVar;
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.a.a();
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        return this.a.b(anpkVar, anmbVar);
    }

    @Override // defpackage.anor
    public void d() {
        throw null;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("delegate", this.a);
        return ahymVarL.toString();
    }
}
