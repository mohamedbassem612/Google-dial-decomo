package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aewa implements defpackage.aewb {
    private final /* synthetic */ int $cid;

    public aewa(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aewb
    public final /* synthetic */ java.lang.String a(albg albgVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ((akzz) albgVar).b.c : ((akzx) albgVar).b.e;
        }
        return ((defpackage.apei) ((akzx) albgVar).b).f;
    }

    @Override // defpackage.aewb
    public final /* synthetic */ java.lang.String b(albg albgVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? ((akzz) albgVar).b.e : ((akzx) albgVar).b.d;
        }
        return ((defpackage.apei) ((akzx) albgVar).b).e;
    }

    @Override // defpackage.aewb
    public final /* synthetic */ void c(albg albgVar, java.lang.Long l) {
        int i = this.$cid;
        if (i == 0) {
            if (l == null) {
                akzx akzxVar = (akzx) albgVar;
                akzxVar.u();
                defpackage.apei apeiVar = (defpackage.apei) akzxVar.b;
                defpackage.apei apeiVar2 = defpackage.apei.a;
                apeiVar.b &= -3;
                apeiVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            akzx akzxVar2 = (akzx) albgVar;
            akzxVar2.u();
            defpackage.apei apeiVar3 = (defpackage.apei) akzxVar2.b;
            defpackage.apei apeiVar4 = defpackage.apei.a;
            apeiVar3.b |= 2;
            apeiVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            akzz akzzVar = (akzz) albgVar;
            if (l == null) {
                akzzVar.u();
                defpackage.apfh apfhVar = akzzVar.b;
                defpackage.apfh apfhVar2 = defpackage.apfh.a;
                apfhVar.b &= -3;
                apfhVar.d = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            akzzVar.u();
            defpackage.apfh apfhVar3 = akzzVar.b;
            defpackage.apfh apfhVar4 = defpackage.apfh.a;
            apfhVar3.b |= 2;
            apfhVar3.d = jLongValue2;
            return;
        }
        if (l == null) {
            akzx akzxVar3 = (akzx) albgVar;
            akzxVar3.u();
            apgu apguVar = akzxVar3.b;
            apgu apguVar2 = apgu.a;
            apguVar.b &= -2;
            apguVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        akzx akzxVar4 = (akzx) albgVar;
        akzxVar4.u();
        apgu apguVar3 = akzxVar4.b;
        apgu apguVar4 = apgu.a;
        apguVar3.b |= 1;
        apguVar3.c = jLongValue3;
    }

    @Override // defpackage.aewb
    public final /* synthetic */ void d(albg albgVar) {
        int i = this.$cid;
        if (i == 0) {
            akzx akzxVar = (akzx) albgVar;
            akzxVar.u();
            defpackage.apei apeiVar = (defpackage.apei) akzxVar.b;
            defpackage.apei apeiVar2 = defpackage.apei.a;
            apeiVar.b &= -5;
            apeiVar.e = defpackage.apei.a.e;
            return;
        }
        if (i != 1) {
            akzz akzzVar = (akzz) albgVar;
            akzzVar.u();
            defpackage.apfh apfhVar = akzzVar.b;
            defpackage.apfh apfhVar2 = defpackage.apfh.a;
            apfhVar.b &= -5;
            apfhVar.e = defpackage.apfh.a.e;
            return;
        }
        akzx akzxVar2 = (akzx) albgVar;
        akzxVar2.u();
        apgu apguVar = akzxVar2.b;
        apgu apguVar2 = apgu.a;
        apguVar.b &= -3;
        apguVar.d = apgu.a.d;
    }
}
