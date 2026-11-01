package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class iuh extends defpackage.gfi {
    public iuh(defpackage.iui iuiVar) {
        j$.util.Objects.requireNonNull(iuiVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `beesly_data` SET `createdTimestampMs` = ?,`uniqueId` = ?,`callId` = ?,`callEndedTimestampMs` = ?,`transcriptionFilePath` = ?,`transcriptionText` = ?,`transcriptionCreationTimestampMs` = ?,`audioRecordingFilePath` = ?,`callType` = ?,`is_content_verdict_banner_dismissed` = ?,`is_eligible_for_survey` = ?,`duplexCallActions` = ?,`errorType` = ?,`user_contentState` = ?,`aicore_contentState` = ? WHERE `createdTimestampMs` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        iuj iujVar = (iuj) obj;
        long j = iujVar.a;
        ginVar.h(1, j);
        ginVar.f(2, hgu.M(iujVar.b));
        java.lang.String str = iujVar.c;
        if (str == null) {
            ginVar.i(3);
        } else {
            ginVar.j(3, str);
        }
        java.lang.Long l = iujVar.d;
        if (l == null) {
            ginVar.i(4);
        } else {
            ginVar.h(4, l.longValue());
        }
        java.lang.String str2 = iujVar.e;
        if (str2 == null) {
            ginVar.i(5);
        } else {
            ginVar.j(5, str2);
        }
        java.lang.String str3 = iujVar.f;
        if (str3 == null) {
            ginVar.i(6);
        } else {
            ginVar.j(6, str3);
        }
        java.lang.Long l2 = iujVar.g;
        if (l2 == null) {
            ginVar.i(7);
        } else {
            ginVar.h(7, l2.longValue());
        }
        java.lang.String str4 = iujVar.h;
        if (str4 == null) {
            ginVar.i(8);
        } else {
            ginVar.j(8, str4);
        }
        java.lang.Integer num = iujVar.i;
        if (num == null) {
            ginVar.i(9);
        } else {
            ginVar.h(9, num.intValue());
        }
        ginVar.h(10, iujVar.n ? 1L : 0L);
        ginVar.h(11, iujVar.o ? 1L : 0L);
        itz itzVar = iujVar.j;
        if (itzVar != null) {
            ginVar.f(12, defpackage.kcq.z(itzVar.a));
        } else {
            ginVar.i(12);
        }
        iub iubVar = iujVar.k;
        if (iubVar != null) {
            ginVar.j(13, defpackage.kcq.y(iubVar.a));
        } else {
            ginVar.i(13);
        }
        iud iudVar = iujVar.l;
        if (iudVar != null) {
            ginVar.j(14, defpackage.iui.l(iudVar.a));
        } else {
            ginVar.i(14);
        }
        iud iudVar2 = iujVar.m;
        if (iudVar2 != null) {
            ginVar.j(15, defpackage.iui.l(iudVar2.a));
        } else {
            ginVar.i(15);
        }
        ginVar.h(16, j);
    }
}
