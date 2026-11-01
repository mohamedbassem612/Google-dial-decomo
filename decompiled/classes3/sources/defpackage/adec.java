package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adec implements qy {
    final /* synthetic */ defpackage.adei a;

    public adec(defpackage.adei adeiVar) {
        this.a = adeiVar;
    }

    public final void a(qx qxVar) {
        java.lang.String str = qxVar.b;
        if (str.startsWith("__G3_TS__")) {
            java.lang.String str2 = qxVar.a;
            defpackage.adei adeiVar = this.a;
            aoov.an(adeiVar.d, (aolr) null, 0, new defpackage.adea(qxVar, adeiVar, str2, str, this, null), 3);
        }
    }

    public final void b(ra raVar) {
        java.lang.String str = raVar.b;
        if (str.startsWith("__G3_TS__")) {
            java.lang.String str2 = raVar.a;
            defpackage.adei adeiVar = this.a;
            aoov.an(adeiVar.d, (aolr) null, 0, new defpackage.adeb(adeiVar, str2, str, this, raVar, null), 3);
        }
    }
}
