package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaek implements defpackage.aaug {
    final /* synthetic */ defpackage.zzx a;
    final /* synthetic */ defpackage.acxg b;

    public aaek(defpackage.acxg acxgVar, defpackage.zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(acxgVar);
        this.b = acxgVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aaug
    public final void a(defpackage.aaum aaumVar) {
        this.b.a.remove(this.a);
    }
}
