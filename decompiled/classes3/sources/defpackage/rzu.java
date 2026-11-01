package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rzu implements defpackage.pdz {
    public final defpackage.sfa a;
    public final gpd b;
    public final heq c;
    private final aoin d;
    private final aoss e;
    private final defpackage.qbe f;
    private final zpm g;

    public rzu(defpackage.qbe qbeVar, heq heqVar, aoin aoinVar, defpackage.sfa sfaVar, aoss aossVar, gpd gpdVar, zpm zpmVar) {
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aoinVar, "enableCallingCardHatsSurvey");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        this.f = qbeVar;
        this.c = heqVar;
        this.d = aoinVar;
        this.a = sfaVar;
        this.e = aossVar;
        this.b = gpdVar;
        this.g = zpmVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aonj, java.lang.Object] */
    @Override // defpackage.pdz
    public final void b(int i) {
        qbc qbcVar;
        j$.util.Optional optionalH = this.g.h();
        defpackage.rhb rhbVar = new defpackage.rhb(new bxc(this, i, 5), 7);
        if (true == optionalH.isPresent()) {
            rhbVar.a.a(optionalH.get());
        }
        int i2 = i - 2;
        if (i2 != 1) {
            qbcVar = i2 != 2 ? null : qbc.nI;
        } else {
            qbcVar = qbc.nH;
        }
        if (qbcVar != null) {
            this.f.c(qbcVar);
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                aoov.an(this.e, (aolr) null, 0, new defpackage.roy(this, (aoln) null, 9), 3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aonj, java.lang.Object] */
    @Override // defpackage.pdz
    public final void c(int i) {
        if (i == 3 || i == 4) {
            j$.util.Optional optionalH = this.g.h();
            defpackage.rhb rhbVar = new defpackage.rhb(new defpackage.rzt(this, 0), 6);
            if (true == optionalH.isPresent()) {
                rhbVar.a.a(optionalH.get());
            }
        }
    }

    @Override // defpackage.pdz
    public final void a(java.lang.String str, java.lang.String str2) {
    }
}
