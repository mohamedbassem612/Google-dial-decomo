package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adbn implements defpackage.afgr {
    private static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str + '|' + str2;
    }

    @Override // defpackage.afgr
    public final /* bridge */ /* synthetic */ defpackage.albh a(afpl afplVar, defpackage.albh albhVar) {
        defpackage.acwd acwdVar = (defpackage.acwd) albhVar;
        if (acwdVar.e) {
            return acwdVar;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        defpackage.akzx akzxVarL = acwdVar.L();
        akzxVarL.u();
        defpackage.acwd acwdVar2 = (defpackage.acwd) akzxVarL.b;
        acwdVar2.b |= 2;
        int i = 1;
        acwdVar2.e = true;
        defpackage.ailj it = afplVar.f().entrySet().iterator();
        while (it.hasNext()) {
            java.util.List listJ = defpackage.ahzf.d("|").j((java.lang.CharSequence) ((java.util.Map.Entry) it.next()).getKey());
            if (listJ.size() >= 4) {
                java.lang.String str = (java.lang.String) listJ.get(0);
                java.lang.String str2 = (java.lang.String) listJ.get(i);
                int i2 = java.lang.Integer.parseInt((java.lang.String) listJ.get(2));
                java.lang.String str3 = str + '|' + str2 + '|' + i2;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    java.lang.String strB = b(str3, "w");
                    java.lang.String strB2 = b(str3, "c");
                    long jH = afplVar.h(strB);
                    long jH2 = afplVar.h(strB2);
                    defpackage.akzx akzxVarM = acvy.a.m();
                    defpackage.akzx akzxVarM2 = acwb.a.m();
                    akzxVarM2.u();
                    acwb acwbVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str2);
                    int i3 = i;
                    acwbVar.b |= 1;
                    acwbVar.c = str2;
                    akzxVarM2.u();
                    acwb acwbVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str);
                    acwbVar2.b |= 2;
                    acwbVar2.d = str;
                    akzxVarM.u();
                    acvy acvyVar = akzxVarM.b;
                    acwb acwbVarR = akzxVarM2.r();
                    j$.util.Objects.requireNonNull(acwbVarR);
                    acvyVar.c = acwbVarR;
                    acvyVar.b |= 1;
                    akzxVarM.u();
                    acvy acvyVar2 = akzxVarM.b;
                    acvyVar2.b |= 8;
                    acvyVar2.f = i2;
                    akzxVarM.u();
                    acvy acvyVar3 = akzxVarM.b;
                    acvyVar3.b |= 16;
                    acvyVar3.g = jH2;
                    akzxVarM.u();
                    acvy acvyVar4 = akzxVarM.b;
                    acvyVar4.b |= 32;
                    acvyVar4.h = jH;
                    akzxVarL.u();
                    defpackage.acwd acwdVar3 = (defpackage.acwd) akzxVarL.b;
                    acvy acvyVarR = akzxVarM.r();
                    j$.util.Objects.requireNonNull(acvyVarR);
                    acwdVar3.b();
                    acwdVar3.d.add(acvyVarR);
                    i = i3;
                }
            }
        }
        return (defpackage.acwd) akzxVarL.r();
    }
}
