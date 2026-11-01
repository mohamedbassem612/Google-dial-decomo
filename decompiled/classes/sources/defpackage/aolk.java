package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolk implements defpackage.aolq {
    private final defpackage.aonj a;
    private final defpackage.aolq b;

    public aolk(defpackage.aolq aolqVar, defpackage.aonj aonjVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("baseKey");
        }
        this.a = aonjVar;
        this.b = aolqVar instanceof defpackage.aolk ? ((defpackage.aolk) aolqVar).b : aolqVar;
    }

    public final defpackage.aolp a(defpackage.aolp aolpVar) {
        return (defpackage.aolp) this.a.a(aolpVar);
    }

    public final boolean b(defpackage.aolq aolqVar) {
        defpackage.aooh.f(aolqVar, "key");
        return aolqVar == this || this.b == aolqVar;
    }

    public aolk() {
        this(defpackage.aolo.k, new defpackage.aoso(0));
    }
}
