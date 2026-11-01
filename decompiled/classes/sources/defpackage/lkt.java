package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class lkt extends defpackage.gfi {
    public lkt(defpackage.lku lkuVar) {
        j$.util.Objects.requireNonNull(lkuVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `Transcript` SET `id` = ?,`conversation` = ?,`audioRecordingFilePath` = ?,`isRated` = ?,`revelioCallType` = ?,`lastModifiedMillis` = ?,`callScreenFeedbackData` = ? WHERE `id` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        lkq lkqVar = (lkq) obj;
        java.lang.String str = lkqVar.a;
        if (str == null) {
            ginVar.i(1);
        } else {
            ginVar.j(1, str);
        }
        byte[] bArrCJ = defpackage.mni.cJ(lkqVar.b);
        if (bArrCJ == null) {
            ginVar.i(2);
        } else {
            ginVar.f(2, bArrCJ);
        }
        java.lang.String str2 = lkqVar.c;
        if (str2 == null) {
            ginVar.i(3);
        } else {
            ginVar.j(3, str2);
        }
        ginVar.h(4, lkqVar.d ? 1L : 0L);
        java.lang.Integer numCH = defpackage.mni.cH(lkqVar.e);
        if (numCH == null) {
            ginVar.i(5);
        } else {
            ginVar.h(5, numCH.intValue());
        }
        ginVar.h(6, lkqVar.f);
        byte[] bArrCL = defpackage.mni.cL(lkqVar.g);
        if (bArrCL == null) {
            ginVar.i(7);
        } else {
            ginVar.f(7, bArrCL);
        }
        java.lang.String str3 = lkqVar.a;
        if (str3 == null) {
            ginVar.i(8);
        } else {
            ginVar.j(8, str3);
        }
    }
}
