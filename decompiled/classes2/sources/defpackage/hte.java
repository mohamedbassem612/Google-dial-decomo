package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hte implements java.util.Comparator {
    private final /* synthetic */ int $cid;

    public hte(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.htv) obj).a()), java.lang.Integer.valueOf(((defpackage.htv) obj2).a()));
            case 1:
                java.lang.String str = ((defpackage.hpk) obj).a;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ((defpackage.hpk) obj2).a;
                return ajsz.au(str, str2 != null ? str2 : "");
            case 2:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.jyf) ((aoiu) obj).a).ordinal()), java.lang.Integer.valueOf(((defpackage.jyf) ((aoiu) obj2).a).ordinal()));
            case 3:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.jyf) ((aoiu) obj).a).ordinal()), java.lang.Integer.valueOf(((defpackage.jyf) ((aoiu) obj2).a).ordinal()));
            case 4:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.kig) ((aoiu) obj).a).ordinal()), java.lang.Integer.valueOf(((defpackage.kig) ((aoiu) obj2).a).ordinal()));
            case 5:
                return ajsz.au(java.lang.Integer.valueOf(((kgc) ((java.util.Map.Entry) obj).getKey()).ordinal()), java.lang.Integer.valueOf(((kgc) ((java.util.Map.Entry) obj2).getKey()).ordinal()));
            case 6:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.kig) ((aoiu) obj).a).ordinal()), java.lang.Integer.valueOf(((defpackage.kig) ((aoiu) obj2).a).ordinal()));
            case 7:
                return ajsz.au(((defpackage.kgt) obj).b(), ((defpackage.kgt) obj2).b());
            case 8:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.knv) ((java.util.Map.Entry) obj).getKey()).ordinal()), java.lang.Integer.valueOf(((defpackage.knv) ((java.util.Map.Entry) obj2).getKey()).ordinal()));
            case 9:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.kof) ((java.util.Map.Entry) obj2).getKey()).f), java.lang.Integer.valueOf(((defpackage.kof) ((java.util.Map.Entry) obj).getKey()).f));
            case 10:
                java.lang.Object value = ((java.util.Map.Entry) obj).getValue();
                aooh.e(value, "<get-value>(...)");
                java.lang.Long lValueOf = java.lang.Long.valueOf(defpackage.hgz.R((amle) value));
                java.lang.Object value2 = ((java.util.Map.Entry) obj2).getValue();
                aooh.e(value2, "<get-value>(...)");
                return ajsz.au(lValueOf, java.lang.Long.valueOf(defpackage.hgz.R((amle) value2)));
            case 11:
                defpackage.kow kowVar = (defpackage.kow) obj;
                aooh.c(kowVar);
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(defpackage.krv.b(kowVar));
                defpackage.kow kowVar2 = (defpackage.kow) obj2;
                aooh.c(kowVar2);
                return ajsz.au(lValueOf2, java.lang.Long.valueOf(defpackage.krv.b(kowVar2)));
            case 12:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.kun) obj2).e), java.lang.Integer.valueOf(((defpackage.kun) obj).e));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.kun) obj2).e), java.lang.Integer.valueOf(((defpackage.kun) obj).e));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.lao laoVar = (defpackage.lao) obj;
                defpackage.lao laoVar2 = (defpackage.lao) obj2;
                return laoVar.d.equals(laoVar2.d) ? laoVar.c.compareTo(laoVar2.c) : laoVar.d.compareToIgnoreCase(laoVar2.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.lno) ((java.util.Map.Entry) obj2).getKey()).a()), java.lang.Integer.valueOf(((defpackage.lno) ((java.util.Map.Entry) obj).getKey()).a()));
            case 16:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.lnn) ((java.util.Map.Entry) obj).getKey()).a()), java.lang.Integer.valueOf(((defpackage.lnn) ((java.util.Map.Entry) obj2).getKey()).a()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.mad) ((aoiu) obj).a).ordinal()), java.lang.Integer.valueOf(((defpackage.mad) ((aoiu) obj2).a).ordinal()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ajsz.au(((defpackage.mls) obj).a, ((defpackage.mls) obj2).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ajsz.au(java.lang.Long.valueOf(((nxp) ((java.util.Map.Entry) obj).getValue()).c), java.lang.Long.valueOf(((nxp) ((java.util.Map.Entry) obj2).getValue()).c));
            default:
                return ajsz.au(java.lang.Integer.valueOf(((qib) obj).b.ordinal()), java.lang.Integer.valueOf(((qib) obj2).b.ordinal()));
        }
    }
}
