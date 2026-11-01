package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecb implements defpackage.ecs {
    private static final boolean d(defpackage.aegw aegwVar) {
        java.lang.String str = aegwVar.j;
        defpackage.aooh.e(str, "getInternalTargetId(...)");
        if (str.length() > 0) {
            defpackage.aegu aeguVarB = defpackage.aegu.b(aegwVar.i);
            if (aeguVarB == null) {
                aeguVarB = defpackage.aegu.UNRECOGNIZED;
            }
            if (aeguVarB == defpackage.aegu.NONE) {
                return true;
            }
        }
        return false;
    }

    private static final boolean e(defpackage.aegw aegwVar) {
        java.lang.String str = aegwVar.c;
        defpackage.aooh.e(str, "getLastSuccessfulRegistrationEnvironmentUrl(...)");
        if (str.length() > 0) {
            defpackage.aegu aeguVarB = defpackage.aegu.b(aegwVar.i);
            if (aeguVarB == null) {
                aeguVarB = defpackage.aegu.UNRECOGNIZED;
            }
            if (aeguVarB == defpackage.aegu.CHIME) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aojh.a;
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aegw aegwVar = (defpackage.aegw) obj;
        defpackage.tvn tvnVarBS = defpackage.agab.bS(aegwVar.L());
        if (e(aegwVar)) {
            tvnVarBS.J(defpackage.aegu.GNP);
        } else if (d(aegwVar)) {
            tvnVarBS.J(defpackage.aegu.CHIME);
        }
        defpackage.akzx akzxVar = (defpackage.akzx) tvnVarBS.a;
        akzxVar.u();
        ((defpackage.aegw) akzxVar.b).l = true;
        return tvnVarBS.z();
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aegw aegwVar = (defpackage.aegw) obj;
        boolean z = false;
        if (!aegwVar.l && (e(aegwVar) || d(aegwVar))) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
