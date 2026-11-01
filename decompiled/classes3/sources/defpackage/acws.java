package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acws implements ajat {
    public final /* synthetic */ java.util.List a;
    public final /* synthetic */ akzx b;
    public final /* synthetic */ aogc c;

    public /* synthetic */ acws(java.util.List list, aogc aogcVar, akzx akzxVar) {
        this.a = list;
        this.c = aogcVar;
        this.b = akzxVar;
    }

    public final ajcq a(java.lang.Object obj) {
        aogc aogcVar;
        aigf aigfVar;
        akyp akypVar;
        defpackage.acws acwsVar = this;
        aogc aogcVar2 = acwsVar.c;
        aigf aigfVar2 = (aigf) obj;
        for (defpackage.acvr acvrVar : acwsVar.a) {
            if (!aigfVar2.containsKey(acvrVar)) {
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                ygVarB.d = "getDataFileUris() resolved to null";
                return aiql.y(ygVarB.d());
            }
            android.net.Uri uri = (android.net.Uri) aigfVar2.get(acvrVar);
            try {
                boolean zAq = afsq.aq(acvrVar);
                akzx akzxVar = acwsVar.b;
                if (zAq && aogcVar2.S(uri)) {
                    java.lang.String path = uri.getPath();
                    if (path != null) {
                        java.util.List listM = acwx.m(aogcVar2, uri, path);
                        akzxVar.u();
                        defpackage.acui acuiVar = (defpackage.acui) akzxVar.b;
                        defpackage.acui acuiVar2 = defpackage.acui.a;
                        acuiVar.b();
                        akyl.i(listM, acuiVar.h);
                    }
                } else {
                    java.lang.String str = acvrVar.c;
                    long j = acvrVar.e;
                    long j2 = acvrVar.j;
                    java.lang.String string = uri.toString();
                    if ((acvrVar.b & 8192) != 0) {
                        akypVar = acvrVar.q;
                        if (akypVar == null) {
                            akypVar = akyp.a;
                        }
                    } else {
                        akypVar = null;
                    }
                    java.lang.String str2 = acvrVar.g;
                    akzz akzzVarM = defpackage.acuh.a.m();
                    akzzVarM.u();
                    defpackage.acuh acuhVar = akzzVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    acuhVar.b |= 1;
                    acuhVar.c = str;
                    akzzVarM.u();
                    defpackage.acuh acuhVar2 = akzzVarM.b;
                    acuhVar2.b |= 4;
                    aogcVar = aogcVar2;
                    aigfVar = aigfVar2;
                    try {
                        acuhVar2.e = (int) j;
                        akzzVarM.u();
                        defpackage.acuh acuhVar3 = akzzVarM.b;
                        acuhVar3.b |= 32;
                        acuhVar3.h = true;
                        akzzVarM.u();
                        defpackage.acuh acuhVar4 = akzzVarM.b;
                        j$.util.Objects.requireNonNull(str2);
                        acuhVar4.b |= 64;
                        acuhVar4.i = str2;
                        if (j2 > 0) {
                            akzzVarM.u();
                            defpackage.acuh acuhVar5 = akzzVarM.b;
                            acuhVar5.b |= 8;
                            acuhVar5.f = (int) j2;
                        }
                        if (j > 2147483647L || j2 > 2147483647L) {
                            apdi apdiVar = defpackage.acuj.e;
                            akzx akzxVarM = defpackage.acuj.a.m();
                            akzxVarM.u();
                            defpackage.acuj acujVar = (defpackage.acuj) akzxVarM.b;
                            acujVar.b |= 1;
                            acujVar.c = j;
                            akzxVarM.u();
                            defpackage.acuj acujVar2 = (defpackage.acuj) akzxVarM.b;
                            acujVar2.b |= 2;
                            acujVar2.d = j2;
                            akzzVarM.bV(apdiVar, (defpackage.acuj) akzxVarM.p());
                        }
                        if (string != null) {
                            akzzVarM.u();
                            defpackage.acuh acuhVar6 = akzzVarM.b;
                            j$.util.Objects.requireNonNull(string);
                            acuhVar6.b |= 2;
                            acuhVar6.d = string;
                        }
                        if (akypVar != null) {
                            akzzVarM.u();
                            defpackage.acuh acuhVar7 = akzzVarM.b;
                            j$.util.Objects.requireNonNull(akypVar);
                            acuhVar7.g = akypVar;
                            acuhVar7.b |= 16;
                        }
                        defpackage.acuh acuhVarP = akzzVarM.p();
                        akzxVar.u();
                        defpackage.acui acuiVar3 = (defpackage.acui) akzxVar.b;
                        defpackage.acui acuiVar4 = defpackage.acui.a;
                        j$.util.Objects.requireNonNull(acuhVarP);
                        acuiVar3.b();
                        acuiVar3.h.add(acuhVarP);
                    } catch (java.io.IOException e) {
                        e = e;
                        adbe.f(e, "Failed to list files under directory:".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
                    }
                    acwsVar = this;
                    aigfVar2 = aigfVar;
                    aogcVar2 = aogcVar;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                aogcVar = aogcVar2;
                aigfVar = aigfVar2;
            }
        }
        return ajcm.a;
    }
}
