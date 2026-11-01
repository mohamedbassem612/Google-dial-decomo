package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akic implements alah {
    PROMO_SYNC_REASON_UNKNOWN(0),
    PROMO_SYNC_REASON_STARTUP(1),
    PROMO_SYNC_REASON_AFTER_PROMO_SHOWN(2),
    PROMO_SYNC_REASON_AFTER_USER_ACTION(3),
    PROMO_SYNC_REASON_PERIODIC(4),
    PROMO_SYNC_REASON_PUSH(5),
    PROMO_SYNC_REASON_TESTING(6),
    PROMO_SYNC_INSTRUCTION(7),
    PROMO_SYNC_REASON_FOREGROUND_ACCOUNT_CHANGED(8),
    PROMO_SYNC_REASON_COLLABORATOR_API_CALL(9);

    public final int k;

    akic(int i) {
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
