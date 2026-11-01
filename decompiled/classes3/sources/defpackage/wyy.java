package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wyy extends gfi {
    public wyy(defpackage.wyw wywVar) {
        j$.util.Objects.requireNonNull(wywVar);
    }

    protected final java.lang.String a() {
        return "UPDATE OR ABORT `AtlasData` SET `callCreationTimeMillis` = ?,`lastModifiedTimestampMillis` = ?,`atlasCallDetails` = ?,`detectionMetrics` = ? WHERE `callCreationTimeMillis` = ?";
    }

    protected final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.wyz wyzVar = (defpackage.wyz) obj;
        ginVar.h(1, wyzVar.a);
        ginVar.h(2, wyzVar.b);
        byte[] bArrC = defpackage.wza.c(wyzVar.c);
        if (bArrC == null) {
            ginVar.i(3);
        } else {
            ginVar.f(3, bArrC);
        }
        byte[] bArrD = defpackage.wza.d(wyzVar.d);
        if (bArrD == null) {
            ginVar.i(4);
        } else {
            ginVar.f(4, bArrD);
        }
        ginVar.h(5, wyzVar.a);
    }
}
