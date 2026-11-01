package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uoa implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aomy
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
            case 1:
                java.util.List list = orr.A;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(list, 10)), 16));
                defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) list);
                while (aojlVar.hasNext()) {
                    java.lang.Object next = aojlVar.next();
                    linkedHashMap.put(next, java.util.Locale.forLanguageTag(((orr) next).B).getLanguage());
                }
                return linkedHashMap;
            case 2:
                defpackage.cbd cbdVar = defpackage.abjc.a;
                throw new java.lang.IllegalStateException("GlideImageManager must provided.");
            case 3:
                defpackage.cbd cbdVar2 = defpackage.abmz.a;
                return defpackage.abmz.a(acqz.a, false, false, false);
            case 4:
                return java.lang.Boolean.FALSE;
            case 5:
                return java.lang.Boolean.FALSE;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.FALSE;
            case 9:
                return java.lang.Boolean.FALSE;
            case 10:
                return java.lang.Boolean.FALSE;
            case 11:
                return java.lang.Boolean.FALSE;
            case 12:
                return java.lang.Boolean.FALSE;
            case 13:
                return java.lang.Boolean.FALSE;
            case 14:
                return java.lang.Boolean.FALSE;
            case 15:
                return java.lang.Boolean.FALSE;
            case 16:
                return java.lang.Boolean.FALSE;
            case 17:
                return java.lang.Boolean.FALSE;
            case 18:
                return java.lang.Boolean.FALSE;
            case 19:
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Boolean.FALSE;
        }
    }
}
