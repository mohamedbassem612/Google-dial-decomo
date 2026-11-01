package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfv {
    private static final aimz a = aimz.i("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/ErrorDialogPresenter");
    private final aw b;
    private j$.util.Optional c = j$.util.Optional.empty();

    public rfv(aw awVar) {
        this.b = awVar;
    }

    private final j$.util.Optional b(java.lang.String str) {
        al alVarE = this.b.I().e(str);
        return alVarE instanceof al ? j$.util.Optional.of(alVarE) : j$.util.Optional.empty();
    }

    public final void a(j$.util.Optional optional) {
        boolean zEquals = this.c.equals(optional);
        aimz aimzVar = a;
        if (zEquals) {
            aimzVar.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/ErrorDialogPresenter", "updateErrorDialog", 41, "ErrorDialogPresenter.java").v("error dialog unchanged");
            return;
        }
        aimzVar.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/ErrorDialogPresenter", "updateErrorDialog", 44, "ErrorDialogPresenter.java").v("error dialog changed");
        this.c = optional;
        j$.util.Optional optionalB = b("material_error_dialog");
        if (true == optionalB.isPresent()) {
            ((al) optionalB.get()).f();
        }
        j$.util.Optional optionalB2 = b("custom_error_dialog");
        if (true == optionalB2.isPresent()) {
            ((al) optionalB2.get()).f();
        }
        if (this.c.isEmpty()) {
            return;
        }
        defpackage.reo reoVar = (defpackage.reo) this.c.orElseThrow();
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/ErrorDialogPresenter", "updateErrorDialog", 55, "ErrorDialogPresenter.java");
        defpackage.rea reaVar = reoVar.a;
        aimwVarL.y("new error dialog for feature: %s", reaVar);
        defpackage.ret retVar = reoVar.b;
        aimzVar.b().l("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/ErrorDialogPresenter", "updateErrorDialog", 59, "ErrorDialogPresenter.java").y("new error dialog spec style: %s", retVar.b());
        int iOrdinal = retVar.b().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.rep repVarA = retVar.a();
                akzx akzxVarM = defpackage.rfr.a.m();
                akzxVarM.u();
                ((defpackage.rfr) akzxVarM.b).b = reaVar.a();
                int i = repVarA.a;
                akzxVarM.u();
                ((defpackage.rfr) akzxVarM.b).c = i;
                int i2 = repVarA.b;
                akzxVarM.u();
                ((defpackage.rfr) akzxVarM.b).d = i2;
                int i3 = repVarA.c;
                akzxVarM.u();
                ((defpackage.rfr) akzxVarM.b).e = i3;
                defpackage.rfr rfrVar = (defpackage.rfr) akzxVarM.p();
                defpackage.rfs rfsVar = new defpackage.rfs();
                amxr.g(rfsVar);
                ahgl.b(rfsVar, rfrVar);
                rfsVar.r(this.b.I(), "custom_error_dialog");
                rfsVar.t();
                return;
            }
            return;
        }
        defpackage.rer rerVarC = retVar.c();
        akzx akzxVarM2 = defpackage.rga.a.m();
        akzxVarM2.u();
        ((defpackage.rga) akzxVarM2.b).c = reaVar.a();
        int i4 = rerVarC.a;
        akzxVarM2.u();
        ((defpackage.rga) akzxVarM2.b).d = i4;
        int i5 = rerVarC.b;
        akzxVarM2.u();
        ((defpackage.rga) akzxVarM2.b).e = i5;
        int i6 = rerVarC.d;
        akzxVarM2.u();
        ((defpackage.rga) akzxVarM2.b).g = i6;
        j$.util.OptionalInt optionalInt = rerVarC.c;
        j$.util.Objects.requireNonNull(akzxVarM2);
        optionalInt.ifPresent(new defpackage.qgy(akzxVarM2, 2));
        defpackage.rga rgaVar = (defpackage.rga) akzxVarM2.p();
        defpackage.rgb rgbVar = new defpackage.rgb();
        amxr.g(rgbVar);
        ahgl.b(rgbVar, rgaVar);
        rgbVar.r(this.b.I(), "material_error_dialog");
        rgbVar.t();
    }
}
