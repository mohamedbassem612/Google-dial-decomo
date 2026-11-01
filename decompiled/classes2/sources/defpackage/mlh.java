package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlh {
    j$.util.Optional a;
    final /* synthetic */ defpackage.mli b;

    public mlh(defpackage.mli mliVar) {
        j$.util.Objects.requireNonNull(mliVar);
        this.b = mliVar;
        this.a = j$.util.Optional.empty();
    }

    public final android.content.Context a() {
        return this.b.g.z();
    }

    public final android.view.View b() {
        if (!this.a.isPresent()) {
            java.util.Map map = this.b.i.c;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) map.get(defpackage.miv.RTT_VOICE_BUTTON);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) map.get(defpackage.miv.VOICE_BUTTON);
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton3 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) map.get(defpackage.miv.WAIT_TIME_VOICE_BUTTON);
            if (extendedFloatingActionButton.getVisibility() != 0) {
                extendedFloatingActionButton = extendedFloatingActionButton3.getVisibility() == 0 ? extendedFloatingActionButton3 : extendedFloatingActionButton2;
            }
            this.a = j$.util.Optional.of(extendedFloatingActionButton);
        }
        return (android.view.View) this.a.orElseThrow();
    }
}
