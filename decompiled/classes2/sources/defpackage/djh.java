package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djh implements java.util.Comparator {
    private final /* synthetic */ int $cid;

    public djh(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iBitCount;
        int iBitCount2;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((djg) obj).b).compareTo(java.lang.Integer.valueOf(((djg) obj2).b));
            case 1:
                return ((defpackage.pn) obj).a().compareTo(((defpackage.pn) obj2).a());
            case 2:
                return java.lang.Integer.valueOf(((djg) obj).b).compareTo(java.lang.Integer.valueOf(((djg) obj2).b));
            case 3:
                return ajsz.au(((dmy) obj).a(), ((dmy) obj2).a());
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                add addVar = defpackage.dxi.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 5:
                return ajsz.au(java.lang.Float.valueOf(((defpackage.elm) obj).a), java.lang.Float.valueOf(((defpackage.elm) obj2).a));
            case 6:
                iBitCount = java.lang.Integer.bitCount(((java.lang.Integer) obj2).intValue());
                iBitCount2 = java.lang.Integer.bitCount(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                return java.lang.Integer.compare(((defpackage.eqg) obj2).j, ((defpackage.eqg) obj).j);
            case 8:
                java.lang.Integer num = (java.lang.Integer) obj;
                java.lang.Integer num2 = (java.lang.Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() != -1 ? -1 : 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                iBitCount = num.intValue();
                iBitCount2 = num2.intValue();
                break;
                break;
            case 9:
                return ((defpackage.fid) ((java.util.List) obj).get(0)).compareTo((defpackage.fid) ((java.util.List) obj2).get(0));
            case 10:
                return ((defpackage.fhy) ((java.util.List) obj).get(0)).compareTo((defpackage.fhy) ((java.util.List) obj2).get(0));
            case 11:
                java.util.List list = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                return defpackage.aieh.b.d((defpackage.fig) java.util.Collections.max(list, new defpackage.djh(13)), (defpackage.fig) java.util.Collections.max(list2, new defpackage.djh(13)), new defpackage.djh(13)).b(list.size(), list2.size()).d((defpackage.fig) java.util.Collections.max(list, new defpackage.djh(14)), (defpackage.fig) java.util.Collections.max(list2, new defpackage.djh(14)), new defpackage.djh(14)).a();
            case 12:
                return ((defpackage.fhx) java.util.Collections.max((java.util.List) obj)).compareTo((defpackage.fhx) java.util.Collections.max((java.util.List) obj2));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.fig figVar = (defpackage.fig) obj;
                defpackage.fig figVar2 = (defpackage.fig) obj2;
                return defpackage.aieh.b.e(figVar.h, figVar2.h).d(java.lang.Integer.valueOf(figVar.m), java.lang.Integer.valueOf(figVar2.m), j$.util.Comparator.-CC.reverseOrder()).b(figVar.n, figVar2.n).b(figVar.o, figVar2.o).d(java.lang.Integer.valueOf(figVar.p), java.lang.Integer.valueOf(figVar2.p), j$.util.Comparator.-CC.reverseOrder()).e(figVar.q, figVar2.q).b(figVar.r, figVar2.r).e(figVar.i, figVar2.i).e(figVar.e, figVar2.e).e(figVar.g, figVar2.g).d(java.lang.Integer.valueOf(figVar.l), java.lang.Integer.valueOf(figVar2.l), j$.util.Comparator.-CC.reverseOrder()).e(figVar.s, figVar2.s).e(figVar.u, figVar2.u).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.fig figVar3 = (defpackage.fig) obj;
                defpackage.fig figVar4 = (defpackage.fig) obj2;
                java.util.Comparator comparatorReversed = (figVar3.e && figVar3.h) ? defpackage.fih.a : j$.util.Comparator.-EL.reversed(defpackage.fih.a);
                defpackage.aieh aiehVar = defpackage.aieh.b;
                boolean z = figVar3.f.F;
                defpackage.aieh aiehVarD = aiehVar.e(figVar3.w, figVar4.w).d(java.lang.Integer.valueOf(figVar3.k), java.lang.Integer.valueOf(figVar4.k), comparatorReversed);
                if (figVar3.s && figVar3.u) {
                    aiehVarD = aiehVarD.b(figVar3.v, figVar4.v);
                }
                return aiehVarD.e(figVar3.t, figVar4.t).d(java.lang.Integer.valueOf(figVar3.j), java.lang.Integer.valueOf(figVar4.j), comparatorReversed).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.Comparator comparator = defpackage.fja.a;
                return java.lang.Float.compare(((defpackage.fiz) obj).c, ((defpackage.fiz) obj2).c);
            case 16:
                return java.lang.Integer.compare(((defpackage.fsa) obj2).c, ((defpackage.fsa) obj).c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ajsz.au((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ajsz.au((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ajsz.au(((defpackage.ghy) obj).a, ((defpackage.ghy) obj2).a);
            default:
                return ajsz.au(((defpackage.gia) obj).a, ((defpackage.gia) obj2).a);
        }
        return iBitCount - iBitCount2;
    }
}
