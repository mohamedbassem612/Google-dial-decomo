package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahhm implements android.content.ComponentCallbacks2 {
    final /* synthetic */ defpackage.ahhp a;

    public ahhm(defpackage.ahhp ahhpVar) {
        j$.util.Objects.requireNonNull(ahhpVar);
        this.a = ahhpVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) throws afeb {
        defpackage.afec.c();
        defpackage.ahhp ahhpVar = this.a;
        if (ahhpVar.a != null) {
            if (i == 60 || i == 80) {
                ahhpVar.a.l();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
