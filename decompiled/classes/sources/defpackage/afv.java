package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afv implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ afv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        dpj aitVar;
        switch (this.$cid) {
            case 0:
                defpackage.aonj aonjVar = defpackage.aga.a;
                return new defpackage.dpp(0L);
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                defpackage.aonj aonjVar2 = defpackage.aga.a;
                return new defpackage.dpn(0L);
            case 3:
                defpackage.dpp dppVar = (defpackage.dpp) obj;
                defpackage.aonj aonjVar3 = defpackage.aga.a;
                return dppVar;
            case 4:
                long j = ((defpackage.crg) obj).a;
                defpackage.aonj aonjVar4 = defpackage.aga.a;
                aitVar = new defpackage.ait(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
                break;
            case 5:
                defpackage.ait aitVar2 = (defpackage.ait) obj;
                defpackage.aonj aonjVar5 = defpackage.aga.a;
                return new defpackage.crg(defpackage.mni.bj(aitVar2.a, aitVar2.b));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj).intValue();
                defpackage.aonj aonjVar6 = defpackage.aga.a;
                return 0;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj).intValue();
                defpackage.aonj aonjVar7 = defpackage.aga.a;
                return 0;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aonj aonjVar8 = defpackage.aga.a;
                return new defpackage.dpp(0L);
            case 9:
                akr akrVar = (akr) obj;
                long j2 = akrVar.d;
                akrVar.o();
                long j3 = akrVar.d;
                if (j2 != j3) {
                    akh akhVar = akrVar.g;
                    if (akhVar != null) {
                        if (akhVar.a > j3) {
                            akrVar.m();
                        } else {
                            akhVar.g = j3;
                            akhVar.h = defpackage.aopc.j((1.0d - ((double) akhVar.e.a(0))) * j3);
                        }
                    } else if (j3 != 0) {
                        akrVar.p();
                    }
                }
                return defpackage.aojh.a;
            case 10:
                return new defpackage.ais(((java.lang.Float) obj).floatValue());
            case 11:
                return new defpackage.ais(((java.lang.Integer) obj).intValue());
            case 12:
                return java.lang.Integer.valueOf((int) ((defpackage.ais) obj).a);
            case 13:
                return new defpackage.ais(((defpackage.dpi) obj).a);
            case 14:
                return new defpackage.dpi(((defpackage.ais) obj).a);
            case 15:
                long j4 = ((dpj) obj).a;
                return new defpackage.ait(java.lang.Float.intBitsToFloat((int) (j4 >> 32)) + 0.0f, java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)) + 0.0f);
            case 16:
                defpackage.ait aitVar3 = (defpackage.ait) obj;
                aitVar = new dpj((((long) java.lang.Float.floatToRawIntBits(aitVar3.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(aitVar3.b)) & 4294967295L));
                break;
            case 17:
                long j5 = ((defpackage.cpp) obj).a;
                return new defpackage.ait(java.lang.Float.intBitsToFloat((int) (j5 >> 32)), java.lang.Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case 18:
                defpackage.ait aitVar4 = (defpackage.ait) obj;
                aitVar = new defpackage.cpp((((long) java.lang.Float.floatToRawIntBits(aitVar4.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(aitVar4.b)) & 4294967295L));
                break;
            case 19:
                long j6 = ((defpackage.cpm) obj).a;
                return new defpackage.ait(java.lang.Float.intBitsToFloat((int) (j6 >> 32)), java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)));
            default:
                defpackage.ait aitVar5 = (defpackage.ait) obj;
                aitVar = new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(aitVar5.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(aitVar5.b)) & 4294967295L));
                break;
        }
        return aitVar;
    }
}
