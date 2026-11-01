package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fal extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.fam a;

    public fal(defpackage.fam famVar) {
        j$.util.Objects.requireNonNull(famVar);
        this.a = famVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        defpackage.fam famVar = this.a;
        famVar.b(defpackage.fai.c(context, intent, famVar.h, famVar.g, famVar.a()));
    }
}
