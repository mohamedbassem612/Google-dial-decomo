package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ageq extends defpackage.agem {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ageq(defpackage.ager agerVar, zzx zzxVar) {
        super(agerVar, new xtq("OnRequestInstallCallback", (byte[]) null, (byte[]) null), zzxVar);
        j$.util.Objects.requireNonNull(agerVar);
    }

    @Override // defpackage.agem
    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        this.b.i(new com.google.android.play.core.review.AutoValue_ReviewInfo((android.app.PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
