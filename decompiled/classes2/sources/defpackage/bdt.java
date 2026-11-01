package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bdt implements java.util.Comparator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public bdt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v26, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v44, types: [fep, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iCompareTo;
        switch (this.$cid) {
            case 0:
                java.lang.Object objK = ((bef) obj).k();
                aaif aaifVar = (aaif) this.a;
                return java.lang.Integer.valueOf(aaifVar.i(objK)).compareTo(java.lang.Integer.valueOf(aaifVar.i(((bef) obj2).k())));
            case 1:
                java.lang.Object objK2 = ((bef) obj).k();
                aaif aaifVar2 = (aaif) this.a;
                return java.lang.Integer.valueOf(aaifVar2.i(objK2)).compareTo(java.lang.Integer.valueOf(aaifVar2.i(((bef) obj2).k())));
            case 2:
                java.lang.Object objK3 = ((bef) obj2).k();
                aaif aaifVar3 = (aaif) this.a;
                return java.lang.Integer.valueOf(aaifVar3.i(objK3)).compareTo(java.lang.Integer.valueOf(aaifVar3.i(((bef) obj).k())));
            case 3:
                java.lang.Object objK4 = ((bef) obj2).k();
                aaif aaifVar4 = (aaif) this.a;
                return java.lang.Integer.valueOf(aaifVar4.i(objK4)).compareTo(java.lang.Integer.valueOf(aaifVar4.i(((bef) obj).k())));
            case 4:
                long jLongValue = ((java.lang.Number) obj).longValue();
                defpackage.acu acuVar = (defpackage.acu) this.a;
                return ajsz.au(java.lang.Integer.valueOf(acuVar.b(jLongValue)), java.lang.Integer.valueOf(acuVar.b(((java.lang.Number) obj2).longValue())));
            case 5:
                return afsq.bK((aonn) this.a, obj, obj2);
            case 6:
                ?? r4 = this.a;
                return r4.a(obj).compareTo(r4.a(obj2));
            case 7:
                int i = dem.z;
                return ((java.lang.Number) this.a.a(obj, obj2)).intValue();
            case 8:
                aonn aonnVar = defpackage.dis.a;
                return ((java.lang.Number) this.a.a(obj, obj2)).intValue();
            case 9:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare == 0 ? java.lang.Integer.valueOf(((dij) obj).c).compareTo(java.lang.Integer.valueOf(((dij) obj2).c)) : iCompare;
            case 10:
                int i2 = defpackage.feq.a;
                ?? r5 = this.a;
                return r5.a(obj2) - r5.a(obj);
            case 11:
                return afsq.bK((aonn) this.a, obj, obj2);
            case 12:
                return afsq.bK((aonn) this.a, obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return afsq.bK((aonn) this.a, obj, obj2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) obj;
                com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) obj2;
                iCompareTo = java.lang.Boolean.valueOf(materialButton.f).compareTo(java.lang.Boolean.valueOf(materialButton2.f));
                if (iCompareTo == 0 && (iCompareTo = java.lang.Boolean.valueOf(materialButton.isPressed()).compareTo(java.lang.Boolean.valueOf(materialButton2.isPressed()))) == 0) {
                    afrk afrkVar = (afrk) this.a;
                    return java.lang.Integer.compare(afrkVar.indexOfChild(materialButton), afrkVar.indexOfChild(materialButton2));
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
                java.util.Comparator comparator = defpackage.aihl.b;
                j$.util.Objects.requireNonNull(entry);
                j$.util.Objects.requireNonNull(entry2);
                return this.a.compare(entry.getKey(), entry2.getKey());
            default:
                iCompareTo = 0;
                for (int i3 = 0; i3 < 2; i3++) {
                    aonj aonjVar = ((aonj[]) this.a)[i3];
                    int iAu = ajsz.au((java.lang.Comparable) aonjVar.a(obj), (java.lang.Comparable) aonjVar.a(obj2));
                    if (iAu != 0) {
                        return iAu;
                    }
                }
                break;
        }
        return iCompareTo;
    }

    public /* synthetic */ bdt(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
