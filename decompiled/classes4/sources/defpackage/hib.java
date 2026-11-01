package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class hib implements amyz {
    public final defpackage.hjn a;
    private final him b;
    private final int c;

    public hib(him himVar, defpackage.hjn hjnVar, int i) {
        this.b = himVar;
        this.a = hjnVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        hic alkbVar;
        java.lang.Object alkvVar;
        java.lang.Object alurVar;
        switch (this.c) {
            case 0:
                defpackage.hjn hjnVar = this.a;
                defpackage.apjb apjbVar = (defpackage.apjb) hjnVar.u.a();
                aigb aigbVarG = aigf.g(14);
                aigbVarG.i(defpackage.allh.l, hjnVar.g);
                aigbVarG.i(defpackage.allh.T, hjnVar.w);
                aigbVarG.i(defpackage.allh.U, hjnVar.e);
                aigbVarG.i(defpackage.allh.V, hjnVar.b);
                aigbVarG.i(defpackage.allh.W, hjnVar.j);
                aigbVarG.i(defpackage.allh.X, hjnVar.x);
                aigbVarG.i(defpackage.allh.ac, hjnVar.a);
                aigbVarG.i(defpackage.allh.Y, hjnVar.t);
                aigbVarG.i(defpackage.allh.Z, hjnVar.i);
                aigbVarG.i(defpackage.allh.ad, hjnVar.A);
                aigbVarG.i(defpackage.allh.aa, hjnVar.B);
                aigbVarG.i(defpackage.allh.ab, hjnVar.z);
                aigbVarG.i(defpackage.allh.ae, hjnVar.p);
                aigbVarG.i(defpackage.allh.f, hjnVar.v);
                j$.util.Optional optionalOf = j$.util.Optional.of(aigbVarG.e(true));
                amyz amyzVar = hjnVar.h;
                defpackage.alkd alkdVar = new defpackage.alkd(achr.h(optionalOf, (aihd) amyzVar.a()), apjbVar, (aizr) ((him) hjnVar.G).Bk.a());
                him himVar = this.b;
                amyz amyzVar2 = hjnVar.c;
                return new defpackage.aljp(alkdVar, himVar.iI(), (defpackage.amac) amyzVar2.a(), (defpackage.aljy) hjnVar.f.a(), (defpackage.alkw) hjnVar.C.a(), new aljo(achr.g(j$.util.Optional.empty(), (aihd) amyzVar.a()), (defpackage.amac) amyzVar2.a()), (defpackage.alkf) hjnVar.l.a());
            case 1:
                return achr.m((defpackage.alkw) this.a.C.a());
            case 2:
                defpackage.aljy aljyVar = (defpackage.aljy) this.a.f.a();
                aooh.f(aljyVar, "errorHandler");
                alkbVar = new defpackage.alkb(aljyVar);
                return alkbVar;
            case 3:
                return new defpackage.aljy();
            case 4:
                defpackage.hjn hjnVar2 = this.a;
                defpackage.alli alliVar = (defpackage.alli) hjnVar2.q.a();
                defpackage.alkw alkwVar = (defpackage.alkw) hjnVar2.C.a();
                defpackage.amac amacVar = (defpackage.amac) hjnVar2.c.a();
                defpackage.alqf alqfVar = (defpackage.alqf) hjnVar2.m.a();
                defpackage.alpi alpiVar = (defpackage.alpi) this.b.Tk.a();
                aooh.f(alliVar, "publisherFactory");
                aooh.f(alkwVar, "eventLogger");
                aooh.f(amacVar, "executorService");
                aooh.f(alqfVar, "timerManager");
                aooh.f(alpiVar, "duplexAiCoreClient");
                alkvVar = new defpackage.alkv(alliVar, alkwVar, amacVar, alqfVar, alpiVar);
                return alkvVar;
            case 5:
                alkbVar = new hic(this, 1);
                return alkbVar;
            case 6:
                return new xtq((short[]) null);
            case 7:
                return new defpackage.apjb((aizr) this.b.Bk.a(), new xtq((defpackage.aljg) ((him) this.a.G).Bm.a()), (byte[]) null);
            case 8:
                alkbVar = new defpackage.amac((defpackage.alpg) this.a.y.a());
                return alkbVar;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return new defpackage.alpg();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                alkbVar = new defpackage.alqf((defpackage.amac) this.a.c.a());
                return alkbVar;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                alkbVar = new defpackage.alus(new defpackage.alyw(1, null), (defpackage.alli) this.a.q.a());
                return alkbVar;
            case 12:
                alkbVar = new defpackage.aluz((defpackage.alli) this.a.q.a());
                return alkbVar;
            case 13:
                alkbVar = new defpackage.aluo((defpackage.alli) this.a.q.a());
                return alkbVar;
            case 14:
                defpackage.hjn hjnVar3 = this.a;
                alurVar = new defpackage.alur((defpackage.alli) hjnVar3.q.a(), (defpackage.alvg) hjnVar3.E.a());
                return alurVar;
            case 15:
                return new defpackage.alvg();
            case 16:
                defpackage.hjn hjnVar4 = this.a;
                alurVar = new defpackage.alvc((defpackage.alli) hjnVar4.q.a(), (defpackage.alqf) hjnVar4.m.a(), (defpackage.alvg) hjnVar4.E.a());
                return alurVar;
            case 17:
                defpackage.hjn hjnVar5 = this.a;
                alurVar = new defpackage.aluy((defpackage.alli) hjnVar5.q.a(), (defpackage.alvg) hjnVar5.E.a());
                return alurVar;
            case 18:
                defpackage.hjn hjnVar6 = this.a;
                alurVar = new defpackage.alux((defpackage.alli) hjnVar6.q.a(), (defpackage.alvg) hjnVar6.E.a());
                return alurVar;
            case 19:
                defpackage.hjn hjnVar7 = this.a;
                alurVar = new defpackage.alun((defpackage.alli) hjnVar7.q.a(), (defpackage.alvg) hjnVar7.E.a(), (defpackage.alqf) hjnVar7.m.a());
                return alurVar;
            case 20:
                defpackage.hjn hjnVar8 = this.a;
                alurVar = new defpackage.alup((defpackage.alvg) hjnVar8.E.a(), (defpackage.alli) hjnVar8.q.a());
                return alurVar;
            case 21:
                defpackage.hjn hjnVar9 = this.a;
                alurVar = new defpackage.alvb((defpackage.alvg) hjnVar9.E.a(), (defpackage.alli) hjnVar9.q.a(), (defpackage.alqf) hjnVar9.m.a());
                return alurVar;
            case 22:
                defpackage.hjn hjnVar10 = this.a;
                alurVar = new defpackage.alva((defpackage.alvg) hjnVar10.E.a(), (defpackage.alli) hjnVar10.q.a());
                return alurVar;
            case 23:
                defpackage.hjn hjnVar11 = this.a;
                alurVar = new defpackage.alvi((defpackage.alvg) hjnVar11.E.a(), (defpackage.alli) hjnVar11.q.a(), (defpackage.alqf) hjnVar11.m.a());
                return alurVar;
            case 24:
                defpackage.hjn hjnVar12 = this.a;
                alurVar = new defpackage.allv((defpackage.alli) hjnVar12.q.a(), (defpackage.allu) hjnVar12.r.a());
                return alurVar;
            case 25:
                defpackage.hjn hjnVar13 = this.a;
                alkvVar = new defpackage.allu((defpackage.amac) hjnVar13.c.a(), (defpackage.alpg) hjnVar13.y.a(), (defpackage.alqf) hjnVar13.m.a());
                return alkvVar;
            case 26:
                aihd aihdVarV = aihd.v(defpackage.allh.T, defpackage.allh.U, defpackage.allh.V, defpackage.allh.W, defpackage.allh.X, defpackage.allh.Y, new defpackage.allh[]{defpackage.allh.Z, defpackage.allh.aa, defpackage.allh.ab, defpackage.allh.ac, defpackage.allh.ad, defpackage.allh.l, defpackage.allh.f, defpackage.allh.ae});
                aooh.e(aihdVarV, "of(...)");
                aooc.ap(aihdVarV);
                return aihdVarV;
            case 27:
                return new defpackage.alkf();
            default:
                defpackage.alli alliVar2 = (defpackage.alli) this.a.q.a();
                aooh.f(alliVar2, "publisherFactory");
                alkbVar = new defpackage.aljw(new defpackage.amfj(1), alliVar2);
                return alkbVar;
        }
    }
}
