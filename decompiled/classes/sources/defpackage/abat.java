package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abat implements defpackage.abav {
    private final java.util.Set a;
    private final j$.util.Optional b;

    public abat(java.util.Set set, j$.util.Optional optional) {
        defpackage.aooh.f(optional, "enableHadesEventStartedLogging");
        this.a = set;
        this.b = optional;
    }

    @Override // defpackage.abav
    public final void a(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, abbb abbbVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.abav) it.next()).a(aazdVar, akzcVar, j, abbbVar);
        }
    }

    @Override // defpackage.abav
    public final void b(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, long j2, abay abayVar, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        abay abayVar2 = abayVar;
        defpackage.aooh.f(abayVar2, "classificationBackend");
        alez alezVar2 = alezVar;
        defpackage.aooh.f(alezVar2, "status");
        aley aleyVar2 = aleyVar;
        defpackage.aooh.f(aleyVar2, "errorMessage");
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.abav) it.next()).b(aazdVar, akzcVar, j, j2, abayVar2, alezVar2, aleyVar2);
            abayVar2 = abayVar;
            alezVar2 = alezVar;
            aleyVar2 = aleyVar;
        }
    }

    @Override // defpackage.abav
    public final void c(defpackage.aazd aazdVar, long j, defpackage.akzc akzcVar, long j2, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(akzcVar, "protectionToken");
        alez alezVar2 = alezVar;
        defpackage.aooh.f(alezVar2, "status");
        aley aleyVar2 = aleyVar;
        defpackage.aooh.f(aleyVar2, "errorMessage");
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.abav) it.next()).c(aazdVar, j, akzcVar, j2, alezVar2, aleyVar2);
            alezVar2 = alezVar;
            aleyVar2 = aleyVar;
        }
    }

    @Override // defpackage.abav
    public final void d(defpackage.aazd aazdVar, defpackage.akzc akzcVar, ykh ykhVar) {
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(ykhVar, "protectionDownload");
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.abav) it.next()).d(aazdVar, akzcVar, ykhVar);
        }
    }

    @Override // defpackage.abav
    public final void e(defpackage.aazd aazdVar, int i) {
        if (((java.lang.Boolean) defpackage.aooh.p(this.b, java.lang.Boolean.FALSE)).booleanValue()) {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.abav) it.next()).e(aazdVar, i);
            }
        }
    }
}
