package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ezt implements defpackage.etl {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ezt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.etl
    public final void a(java.lang.Object obj) {
        ils ilsVar;
        java.lang.Object obj2;
        rai raiVar;
        rai raiVar2;
        defpackage.fih fihVar;
        switch (this.$cid) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            case 9:
                rai raiVar3 = (rai) obj;
                defpackage.fbw fbwVar = (defpackage.fbw) raiVar3.a;
                if (!raiVar3.equals(fbwVar.W) || fbwVar.V == null) {
                    return;
                }
                defpackage.fbu fbuVar = fbwVar.k;
                int i = fbuVar.d;
                if (i != -1) {
                    long j = fbuVar.e.e / i;
                    defpackage.fbn fbnVar = fbwVar.R;
                    ahvr.ci(fbnVar);
                    eum.y(j, fbnVar.a());
                }
                android.os.SystemClock.elapsedRealtime();
                rai raiVar4 = fbwVar.V;
                defpackage.faw fawVar = fbwVar.k.e;
                java.lang.String str = eum.a;
                ils ilsVar2 = ((defpackage.fca) raiVar4.a).q;
                java.lang.Object obj3 = ilsVar2.b;
                if (obj3 != null) {
                    ((android.os.Handler) obj3).post(new defpackage.drn(ilsVar2, 15));
                    return;
                }
                return;
            case 10:
                rai raiVar5 = ((defpackage.fbw) ((rai) obj).a).V;
                if (raiVar5 == null || (obj2 = (ilsVar = ((defpackage.fca) raiVar5.a).q).b) == null) {
                    return;
                }
                ((android.os.Handler) obj2).post(new defpackage.drn(ilsVar, 17));
                return;
            case 11:
                rai raiVar6 = (rai) obj;
                defpackage.fbw fbwVar2 = (defpackage.fbw) raiVar6.a;
                if (!raiVar6.equals(fbwVar2.W) || (raiVar = fbwVar2.V) == null || !fbwVar2.F || (raiVar2 = ((defpackage.fei) raiVar.a).I) == null) {
                    return;
                }
                raiVar2.v();
                return;
            case 12:
                rai raiVar7 = (rai) obj;
                defpackage.fbw fbwVar3 = (defpackage.fbw) raiVar7.a;
                if (raiVar7.equals(fbwVar3.W) && fbwVar3.D) {
                    fbwVar3.E = true;
                    return;
                }
                return;
            default:
                rai raiVar8 = ((defpackage.fbw) ((rai) obj).a).V;
                if (raiVar8 != null) {
                    java.lang.Object obj4 = raiVar8.a;
                    synchronized (((defpackage.ewz) obj4).a) {
                        fihVar = ((defpackage.ewz) obj4).j;
                        break;
                    }
                    if (fihVar != null) {
                        boolean z = fihVar.d.Y;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
