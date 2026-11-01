package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akcg {
    public static final defpackage.akcg a = new defpackage.akcg(new defpackage.akcf(0));
    private final defpackage.aoir b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    public akcg(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("streamzProvider");
        }
        this.b = new defpackage.aoiy(new defpackage.acik(aoinVar, 11));
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(java.lang.String str) {
        aljf aljfVarD = d();
        if (aljfVarD == null || !aljfVarD.c()) {
            return;
        }
        ahix ahixVarB = aljfVarD.b();
        defpackage.aogc aogcVar = (defpackage.aogc) aljfVarD.a;
        ((defpackage.afip) ahixVarB.e.eZ()).b(1L, aogcVar.b, aogcVar.p(), str);
    }

    public final void b(long j) {
        aljf aljfVarD = d();
        if (aljfVarD == null || !aljfVarD.c()) {
            return;
        }
        ahix ahixVarB = aljfVarD.b();
        defpackage.aogc aogcVar = (defpackage.aogc) aljfVarD.a;
        ((defpackage.afim) ahixVarB.g.eZ()).b(j, aogcVar.b, aogcVar.p());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoir, java.lang.Object] */
    public final void c(akcj akcjVar, akci akciVar) {
        aljf aljfVarD;
        if (this.c.compareAndSet(false, true) && (aljfVarD = d()) != null && ((java.lang.Boolean) aljfVarD.c.a()).booleanValue()) {
            ahix ahixVarB = aljfVarD.b();
            java.lang.Object obj = aljfVarD.a;
            defpackage.aogc aogcVar = (defpackage.aogc) obj;
            ((defpackage.afip) ahixVarB.d.eZ()).b(1L, aogcVar.b, aogcVar.p(), akcjVar.e, akciVar.f);
        }
    }

    public final aljf d() {
        return (aljf) this.b.a();
    }
}
