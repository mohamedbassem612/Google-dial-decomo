package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xta {
    public final defpackage.xtb a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ defpackage.xtd d;

    public xta(defpackage.xtd xtdVar, defpackage.xtb xtbVar) {
        j$.util.Objects.requireNonNull(xtdVar);
        this.d = xtdVar;
        this.a = xtbVar;
        this.b = xtbVar.c ? null : new boolean[xtdVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (java.io.IOException unused) {
        }
    }
}
