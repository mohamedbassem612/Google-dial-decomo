package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahpw {
    public defpackage.ahok a;
    public boolean b;
    final /* synthetic */ defpackage.ahpz c;

    public ahpw(defpackage.ahpz ahpzVar) {
        this.c = ahpzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(defpackage.aw awVar, boolean z) {
        defpackage.aooh.f(awVar, "fragment");
        if (z && this.a == null && !defpackage.ahns.q()) {
            boolean zR = defpackage.ahns.r();
            this.b = zR;
            if (!zR) {
                this.a = this.c.f(1464, "FragmentTransaction Popped");
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && z && (awVar instanceof defpackage.ahph)) {
            ((defpackage.ahph) awVar).bb(defpackage.ahqz.b());
        }
    }
}
