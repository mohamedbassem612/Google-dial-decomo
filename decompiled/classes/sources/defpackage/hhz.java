package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hhz implements defpackage.amyz {
    public final defpackage.hkg a;
    private final him b;
    private final int c;
    private final defpackage.hkh d;

    public hhz(him himVar, defpackage.hkh hkhVar, defpackage.hkg hkgVar, int i) {
        this.b = himVar;
        this.d = hkhVar;
        this.a = hkgVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, vtv] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [ahyn] */
    /* JADX WARN: Type inference failed for: r8v84 */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        whl ahgdVar;
        kgo aljfVar;
        defpackage.cop sjiVar;
        switch (this.c) {
            case 0:
                ?? ahysVar = this.a.a;
                try {
                    ahysVar = ahysVar == 0 ? defpackage.ahwt.a : new defpackage.ahys(ahysVar);
                    if (!ahysVar.f()) {
                        throw null;
                    }
                    ahgdVar = new defpackage.ahgd((defpackage.az) ahysVar.b());
                    return ahgdVar;
                } catch (java.lang.ClassCastException e) {
                    throw new java.lang.IllegalStateException("Expected activity to be a FragmentActivity: ".concat(java.lang.String.valueOf(java.lang.String.valueOf((java.lang.Object) ahysVar))), e);
                }
            case 1:
                defpackage.hkg hkgVar = this.a;
                aljfVar = new aljf((defpackage.ahgd) hkgVar.c.a(), (rai) hkgVar.d.a());
                return aljfVar;
            case 2:
                ahgdVar = new rai(this);
                return ahgdVar;
            case 3:
                aljfVar = new defpackage.aewl(this.a.a(), defpackage.aikn.a);
                return aljfVar;
            case 4:
                android.app.Activity activity = this.a.a;
                if (activity == null) {
                    throw new java.lang.IllegalStateException("Attempted use of the activity when it is null");
                }
                return activity;
            case 5:
                defpackage.aolr aolrVar = (defpackage.aolr) this.b.bn.a();
                defpackage.ahgd ahgdVar2 = (defpackage.ahgd) this.a.c.a();
                if (aolrVar == null) {
                    defpackage.aooh.i("mainContext");
                }
                if (ahgdVar2 == null) {
                    defpackage.aooh.i("fragmentHost");
                }
                return defpackage.afsq.M(aolrVar, ahgdVar2.P());
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                him himVar = this.b;
                ahgdVar = new defpackage.vap((defpackage.agsm) himVar.aT.a(), himVar.gL());
                return ahgdVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ahgdVar = new whl((defpackage.az) this.a.j.a());
                return ahgdVar;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return this.a.a();
            case 9:
                defpackage.hkg hkgVar2 = this.a;
                aljfVar = new sjf(hkgVar2.a(), this.b.tt, (sjh) hkgVar2.l.a());
                return aljfVar;
            case 10:
                him himVar2 = this.b;
                sjiVar = new sji(hip.cj(), this.a.a(), (sjl) this.d.t.a(), (defpackage.rlv) himVar2.fq.a(), (defpackage.gpd) himVar2.fD.a());
                return sjiVar;
            case 11:
                return new xm((short[]) null);
            case 12:
                ahgdVar = new agom((defpackage.ahgd) this.a.c.a());
                return ahgdVar;
            case 13:
                defpackage.ahgd ahgdVar3 = (defpackage.ahgd) this.a.c.a();
                j$.util.Objects.requireNonNull(ahgdVar3);
                ahgdVar = new defpackage.agtm(new zlk(ahgdVar3, 9), ahgdVar3, ahgdVar3.P());
                return ahgdVar;
            case 14:
                defpackage.hkg hkgVar3 = this.a;
                defpackage.ahgd ahgdVar4 = (defpackage.ahgd) hkgVar3.c.a();
                defpackage.ajsz.dA(ahgdVar4 instanceof defpackage.amyq, "Host %s is not a Hilt one.", ahgdVar4.getClass().getName());
                defpackage.amyp amypVarB = ahgdVar4.b();
                defpackage.ajsz.dA(amypVarB instanceof defpackage.amxj, "Host %s is not a screen host.", amypVarB.getClass().getName());
                if (((defpackage.agnd) defpackage.aooc.ar(((defpackage.amxj) amypVarB).f(), defpackage.agnd.class)).M() == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                hkgVar3.a();
                return new defpackage.afsq((byte[]) null);
            case 15:
                return ahez.a(((defpackage.ahgd) this.a.c.a()).a, ahez.a);
            case 16:
                him himVar3 = this.b;
                sjiVar = new defpackage.cop((defpackage.iez) himVar3.a.hC.a(), (defpackage.rlv) himVar3.fq.a(), (defpackage.az) this.a.j.a());
                return sjiVar;
            case 17:
                aljfVar = new kgo(hip.bZ(), (ni) this.b.a.hP.a(), (defpackage.az) this.a.j.a());
                return aljfVar;
            case 18:
                android.view.WindowManager windowManager = (android.view.WindowManager) ((android.content.Context) this.a.g.a()).getSystemService("window");
                if (windowManager == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return windowManager;
            default:
                ahgdVar = new whl((defpackage.aazc) this.b.l.a());
                return ahgdVar;
        }
    }
}
