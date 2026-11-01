package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplj implements defpackage.apix {
    @Override // defpackage.apix
    public final defpackage.apjm a(defpackage.aplr aplrVar) {
        defpackage.apjh apjhVar = aplrVar.c;
        defpackage.apjg apjgVar = new defpackage.apjg(apjhVar);
        defpackage.apjk apjkVar = apjhVar.d;
        if (apjkVar != null) {
            defpackage.apiy apiyVarC = apjkVar.c();
            if (apiyVarC != null) {
                apjgVar.a("Content-Type", apiyVarC.c);
            }
            long jA = apjkVar.a();
            if (jA != -1) {
                apjgVar.a("Content-Length", java.lang.String.valueOf(jA));
                apjgVar.c("Transfer-Encoding");
            } else {
                apjgVar.a("Transfer-Encoding", "chunked");
                apjgVar.c("Content-Length");
            }
        }
        boolean z = false;
        if (apjhVar.a("Host") == null) {
            apjgVar.a("Host", defpackage.apjx.d(apjhVar.a, false));
        }
        if (apjhVar.a("Connection") == null) {
            apjgVar.a("Connection", "Keep-Alive");
        }
        if (apjhVar.a("Accept-Encoding") == null && apjhVar.a("Range") == null) {
            apjgVar.a("Accept-Encoding", "gzip");
            z = true;
        }
        defpackage.apiw apiwVar = apjhVar.a;
        if (apjhVar.a("User-Agent") == null) {
            apjgVar.a("User-Agent", "okhttp/5.5.0");
        }
        defpackage.apjh apjhVar2 = new defpackage.apjh(apjgVar);
        defpackage.apjm apjmVarA = aplrVar.a(apjhVar2);
        defpackage.apin apinVar = aplrVar.h;
        defpackage.apiw apiwVar2 = apjhVar2.a;
        defpackage.apiu apiuVar = apjmVarA.f;
        defpackage.aplq.a(apinVar, apiwVar2, apiuVar);
        defpackage.apjl apjlVar = new defpackage.apjl(apjmVarA);
        apjlVar.d(apjhVar2);
        if (z && defpackage.aoov.s("gzip", apjmVarA.a("Content-Encoding"), true) && defpackage.aplq.b(apjmVarA)) {
            appi appiVar = new appi(apjmVarA.g.c());
            defpackage.zzx zzxVarBk = defpackage.aoov.bk(apiuVar);
            zzxVarBk.V("Content-Encoding");
            zzxVarBk.V("Content-Length");
            apjlVar.b(defpackage.aoov.bl(zzxVarBk));
            apjlVar.d = new defpackage.apls(apjmVarA.a("Content-Type"), -1L, new defpackage.appx(appiVar));
        }
        return apjlVar.a();
    }
}
