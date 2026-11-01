package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hem extends android.graphics.Paint {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hem(defpackage.hen henVar, byte[] bArr) {
        super(1);
        j$.util.Objects.requireNonNull(henVar);
        setStyle(android.graphics.Paint.Style.FILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hem(defpackage.hen henVar) {
        super(1);
        j$.util.Objects.requireNonNull(henVar);
        setStyle(android.graphics.Paint.Style.STROKE);
    }
}
