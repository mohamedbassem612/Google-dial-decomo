package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsi implements ajcb {
    final /* synthetic */ long a;
    final /* synthetic */ jsk b;

    public jsi(jsk jskVar, long j) {
        this.a = j;
        j$.util.Objects.requireNonNull(jskVar);
        this.b = jskVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(jsk.a.c(), "Could not delete caller IDs.", "com/android/dialer/calleridfeedback/impl/database/CallerIdFeedbackDatabase$1", "onFailure", (char) 407, "CallerIdFeedbackDatabase.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        jsk.a.b().l("com/android/dialer/calleridfeedback/impl/database/CallerIdFeedbackDatabase$1", "onSuccess", 395, "CallerIdFeedbackDatabase.java").v("Deleted old caller IDs.");
        agsm.i(164, this.b.g.bl(new defpackage.jwe(this.a, 1)), "Failed to save last database updated timestamp.", new java.lang.Object[0]);
    }
}
