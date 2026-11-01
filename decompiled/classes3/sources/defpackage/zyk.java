package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zyk extends defpackage.zyq {
    final /* synthetic */ defpackage.zyl a;

    public zyk(defpackage.zyl zylVar) {
        j$.util.Objects.requireNonNull(zylVar);
        this.a = zylVar;
    }

    @Override // defpackage.zyq
    public final void b(com.google.android.gms.common.api.Status status) {
        this.a.l(status);
    }
}
