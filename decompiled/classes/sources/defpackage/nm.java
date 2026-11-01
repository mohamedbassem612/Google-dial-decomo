package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nm implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        long j;
        char c;
        int i = 0;
        long j2 = 4294967295L;
        char c2 = ' ';
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                ((of) obj2).d(true);
                return new ob(obj2, 1);
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                defpackage.aooh.f(entry, "entry");
                android.view.View view = (android.view.View) entry.getValue();
                int i2 = defpackage.dzs.a;
                return java.lang.Boolean.valueOf(defpackage.ajsz.cj(this.a, view.getTransitionName()));
            case 2:
                return obj != this.a ? java.lang.String.valueOf(obj) : "(this)";
            case 3:
                return obj != this.a ? java.lang.String.valueOf(obj) : "(this)";
            case 4:
                return obj != this.a ? java.lang.String.valueOf(obj) : "(this)";
            case 5:
                return java.lang.Boolean.valueOf(defpackage.aooh.n(obj, this.a));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.czb czbVar = (defpackage.czb) obj;
                defpackage.aeq aeqVar = (defpackage.aeq) this.a;
                defpackage.czc[] czcVarArr = aeqVar.b;
                defpackage.aooh.c(czcVarArr);
                int i3 = aeqVar.d;
                int i4 = aeqVar.f;
                int length = czcVarArr.length;
                while (i < length) {
                    defpackage.czc czcVar = czcVarArr[i];
                    if (czcVar != null) {
                        long jA = aeqVar.a.b.a((((long) czcVar.a) << 32) | (((long) czcVar.b) & 4294967295L), (((long) i3) << 32) | (((long) i4) & 4294967295L), defpackage.dpq.a);
                        czbVar.s(czcVar, defpackage.dpn.a(jA), defpackage.dpn.b(jA), 0.0f);
                    }
                    i++;
                    czcVarArr = czcVarArr;
                    i3 = i3;
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.czb czbVar2 = (defpackage.czb) obj;
                defpackage.aeq aeqVar2 = (defpackage.aeq) this.a;
                defpackage.czc[] czcVarArr2 = aeqVar2.c;
                defpackage.aooh.c(czcVarArr2);
                int i5 = aeqVar2.e;
                int i6 = aeqVar2.g;
                int length2 = czcVarArr2.length;
                while (i < length2) {
                    defpackage.czc czcVar2 = czcVarArr2[i];
                    if (czcVar2 != null) {
                        j = j2;
                        c = c2;
                        long jA2 = aeqVar2.a.b.a((((long) czcVar2.a) << c) | (((long) czcVar2.b) & j), (((long) i5) << c) | (((long) i6) & j), defpackage.dpq.a);
                        czbVar2.s(czcVar2, defpackage.dpn.a(jA2), defpackage.dpn.b(jA2), 0.0f);
                    } else {
                        j = j2;
                        c = c2;
                    }
                    i++;
                    length2 = length2;
                    czcVarArr2 = czcVarArr2;
                    j2 = j;
                    c2 = c;
                    i5 = i5;
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aew aewVar = (defpackage.aew) this.a;
                defpackage.czc czcVar3 = aewVar.c;
                defpackage.aooh.c(czcVar3);
                ((defpackage.czb) obj).t(czcVar3, aewVar.b.b.a((((long) czcVar3.a) << 32) | (((long) czcVar3.b) & 4294967295L), aewVar.e, defpackage.dpq.a), 0.0f);
                return defpackage.aojh.a;
            case 9:
                defpackage.aew aewVar2 = (defpackage.aew) this.a;
                defpackage.czc czcVar4 = aewVar2.d;
                defpackage.aooh.c(czcVar4);
                ((defpackage.czb) obj).t(czcVar4, aewVar2.b.b.a((((long) czcVar4.a) << 32) | (((long) czcVar4.b) & 4294967295L), aewVar2.f, defpackage.dpq.a), 0.0f);
                return defpackage.aojh.a;
            case 10:
                return defpackage.mni.bs(this.a, (defpackage.czb) obj);
            case 11:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 12:
                return ((afg) this.a).d;
            case 13:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                afg afgVar = (afg) this.a;
                if (zBooleanValue == ((java.lang.Boolean) afgVar.a.h()).booleanValue()) {
                    defpackage.cpn cpnVar = afgVar.f;
                    defpackage.aooh.c(cpnVar);
                    return cpnVar;
                }
                defpackage.cpn cpnVar2 = afgVar.e;
                defpackage.aooh.c(cpnVar2);
                return cpnVar2;
            case 14:
                return java.lang.Boolean.valueOf(!defpackage.aooh.n(obj, this.a));
            case 15:
                ((defpackage.cra) obj).o(((java.lang.Number) this.a.a()).floatValue());
                return defpackage.aojh.a;
            case 16:
                long j3 = ((defpackage.dpp) obj).a & 4294967295L;
                defpackage.aonj aonjVar = defpackage.aga.a;
                return new defpackage.dpn(((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) j3))).intValue()) & 4294967295L);
            case 17:
                long j4 = ((defpackage.dpp) obj).a >> 32;
                defpackage.aonj aonjVar2 = defpackage.aga.a;
                return new defpackage.dpn(((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) j4))).intValue()) << 32);
            case 18:
                long j5 = ((defpackage.dpp) obj).a >> 32;
                defpackage.aonj aonjVar3 = defpackage.aga.a;
                return new defpackage.dpn(((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) j5))).intValue()) << 32);
            case 19:
                long j6 = ((defpackage.dpp) obj).a & 4294967295L;
                defpackage.aonj aonjVar4 = defpackage.aga.a;
                return new defpackage.dpn(((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) j6))).intValue()) & 4294967295L);
            default:
                long j7 = ((defpackage.dpp) obj).a;
                long j8 = j7 >> 32;
                defpackage.aonj aonjVar5 = defpackage.aga.a;
                return new defpackage.dpp((((long) ((int) j8)) << 32) | (((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) (j7 & 4294967295L)))).intValue()) & 4294967295L));
        }
    }
}
