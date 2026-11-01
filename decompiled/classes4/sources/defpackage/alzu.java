package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzu implements defpackage.amad {
    public j$.util.Optional a = j$.util.Optional.empty();

    private final void d() throws defpackage.aljs {
        if (this.a.isEmpty()) {
            throw new defpackage.aljs("SpecsLoader not initialized.", defpackage.aljr.g);
        }
    }

    public final defpackage.amaj a() throws defpackage.alio {
        try {
            d();
            java.lang.Object obj = this.a.get();
            defpackage.amaj amajVar = defpackage.amaj.a;
            return ((alqd) obj).a(alad.M(defpackage.amaj.class), "off_hold_specs.pb");
        } catch (defpackage.aljs | java.io.IOException e) {
            throw new defpackage.alio(java.lang.String.format("failed to load %s", "off_hold_specs.pb"), defpackage.alti.SPECS_LOADING_FAILURE, e);
        }
    }

    @Override // defpackage.amad
    public final defpackage.amaj b(java.lang.String str) {
        return a();
    }

    @Override // defpackage.amad
    public final defpackage.amha c(java.lang.String str) throws defpackage.alio {
        try {
            d();
            java.lang.Object obj = this.a.get();
            defpackage.amha amhaVar = defpackage.amha.a;
            return ((alqd) obj).a(alad.M(defpackage.amha.class), "robot_intent_specs.pb");
        } catch (defpackage.aljs | java.io.IOException e) {
            throw new defpackage.alio(java.lang.String.format("failed to load %s", "robot_intent_specs.pb"), defpackage.alti.SPECS_LOADING_FAILURE, e);
        }
    }
}
