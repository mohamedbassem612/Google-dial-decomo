package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaej implements defpackage.aadg {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult a;
    final /* synthetic */ defpackage.acxg b;

    public aaej(defpackage.acxg acxgVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        j$.util.Objects.requireNonNull(acxgVar);
        this.b = acxgVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aadg
    public final void a(com.google.android.gms.common.api.Status status) {
        this.b.b.remove(this.a);
    }
}
