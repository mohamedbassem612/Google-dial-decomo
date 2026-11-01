package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qtu implements alah {
    DIALOG_UNKNOWN(0),
    DIALOG_MERGE(1),
    DIALOG_CALL_TRANSFER(2),
    DIALOG_HOLD(3),
    DIALOG_SELECT_UPGRADE_VIDEO_TYPE(4),
    DIALOG_RECORD(5),
    DIALOG_FERMAT_CONSENT(6),
    DIALOG_AUDIO_PRISM_EXCLUSIVITY(7),
    DIALOG_TEST_HIGH_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE),
    DIALOG_TEST_LOW_PRIORITY(10001);

    public final int k;

    qtu(int i) {
        this.k = i;
    }

    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
