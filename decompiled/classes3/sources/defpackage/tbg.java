package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tbg {
    private static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/settings/datasource/RevelioSettingsDatas");

    public static boolean a(tbf tbfVar) {
        aimw aimwVarL = a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/datasource/RevelioSettingsDatas", "isAnyCallerTypeSetToAutoScreening", 14, "RevelioSettingsDatas.java");
        defpackage.tbe tbeVarB = defpackage.tbe.b(tbfVar.e);
        if (tbeVarB == null) {
            tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
        }
        java.lang.String strName = tbeVarB.name();
        defpackage.tbe tbeVarB2 = defpackage.tbe.b(tbfVar.f);
        if (tbeVarB2 == null) {
            tbeVarB2 = defpackage.tbe.NOT_SET_BY_USER;
        }
        java.lang.String strName2 = tbeVarB2.name();
        defpackage.tbe tbeVarB3 = defpackage.tbe.b(tbfVar.g);
        if (tbeVarB3 == null) {
            tbeVarB3 = defpackage.tbe.NOT_SET_BY_USER;
        }
        java.lang.String strName3 = tbeVarB3.name();
        defpackage.tbe tbeVarB4 = defpackage.tbe.b(tbfVar.h);
        if (tbeVarB4 == null) {
            tbeVarB4 = defpackage.tbe.NOT_SET_BY_USER;
        }
        aimwVarL.N("Spam: %s, Possibly faked numbers: %s, First time callers: %s, Private or hidden: %s", strName, strName2, strName3, tbeVarB4.name());
        defpackage.tbe tbeVarB5 = defpackage.tbe.b(tbfVar.e);
        if (tbeVarB5 == null) {
            tbeVarB5 = defpackage.tbe.NOT_SET_BY_USER;
        }
        defpackage.tbe tbeVarB6 = defpackage.tbe.b(tbfVar.f);
        if (tbeVarB6 == null) {
            tbeVarB6 = defpackage.tbe.NOT_SET_BY_USER;
        }
        defpackage.tbe tbeVarB7 = defpackage.tbe.b(tbfVar.g);
        if (tbeVarB7 == null) {
            tbeVarB7 = defpackage.tbe.NOT_SET_BY_USER;
        }
        defpackage.tbe tbeVarB8 = defpackage.tbe.b(tbfVar.h);
        if (tbeVarB8 == null) {
            tbeVarB8 = defpackage.tbe.NOT_SET_BY_USER;
        }
        aike aikeVarS = aify.s(tbeVarB5, tbeVarB6, tbeVarB7, tbeVarB8);
        int i = aikeVarS.d;
        int i2 = 0;
        while (i2 < i) {
            defpackage.tbe tbeVar = (defpackage.tbe) aikeVarS.get(i2);
            i2++;
            if (tbeVar == defpackage.tbe.AUTOMATICALLY_SCREEN) {
                return true;
            }
        }
        return false;
    }
}
