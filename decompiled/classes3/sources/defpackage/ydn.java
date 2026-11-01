package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydn implements defpackage.ydm {
    final /* synthetic */ ems a;
    final /* synthetic */ defpackage.uyg b;

    public ydn(defpackage.uyg uygVar, ems emsVar) {
        this.a = emsVar;
        j$.util.Objects.requireNonNull(uygVar);
        this.b = uygVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ydm
    public final void i() {
        this.b.b.remove(this.a);
    }

    @Override // defpackage.ydm
    public final void j() {
    }

    @Override // defpackage.ydm
    public final void k() {
    }
}
