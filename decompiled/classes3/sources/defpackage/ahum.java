package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahum extends anqb {
    final /* synthetic */ anmv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahum(defpackage.ahun ahunVar, anql anqlVar, anmv anmvVar) {
        super(anqlVar);
        this.a = anmvVar;
        j$.util.Objects.requireNonNull(ahunVar);
    }

    public final void a(anqw anqwVar, anph anphVar) {
        android.widget.RemoteViews remoteViews = (android.widget.RemoteViews) ((java.util.concurrent.atomic.AtomicReference) defpackage.ahun.b.b(this.a)).get();
        if (remoteViews != null) {
            anphVar.h(defpackage.ahun.a, remoteViews);
        }
        super.a(anqwVar, anphVar);
    }
}
